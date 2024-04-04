import data.Customer;
import data.Order;
import service.CustomerService;
import service.OrderService;
import service.ProductService;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

    //Fields, three service
    private CustomerService customerService;
    private OrderService orderService;
    private ProductService productService;

    //Constructor & Setup
    public Application() {
        // 아직 서비스 객체 싱글톤 아님.
        this.customerService = new CustomerService();
        this.orderService = new OrderService();
        this.productService = new ProductService();

    }

    //main menu method -> interface to user console
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println(NEWLINE_TEN);
            System.out.print(MENU_ROOT);
            int choice = scanner.nextInt();
            switch (choice){
                //1. 고객 관리
                case 1:
                    customerMenu: while(true){
                        System.out.println(NEWLINE_TEN);
                        System.out.print(MENU_CUSTOMER);
                        choice = scanner.nextInt();
                        switch (choice){
                            // 고객 등록
                            case 1:
                                System.out.println("Customer Add Entered!"); // 테스트용 출력 코드
                                System.out.println(NEWLINE_TEN);
                                System.out.print(MENU_CUSTOMER_ADD);
                                try{
                                    Customer newCustomer = inputCustomer();

                                }catch (InputMismatchException e){
                                    System.out.println(ERROR_WRONG_INPUT);
                                    break;
                                }
                                break;

                            // 고객 삭제
                            case 2:
                                System.out.println("Customer Delete Entered!"); //테스트용 출력 코드
                                System.out.println(NEWLINE_TEN);
                                System.out.print(MENU_CUSTOMER_DELETE);
                                break;
                            // 고객 조회
                            case 3:
                                System.out.println("Customer Find Entered!"); //테스트용 출력 코드
                                System.out.println(NEWLINE_TEN);
                                System.out.print(MENU_CUSTOMER_FIND);
                                break;
                            // 뒤로 가기
                            case 0: break customerMenu;
                        }
                    }
                    break;

                //2. 주문 관리
                case 2:
                    orderMenu: while(true){
                        System.out.println(NEWLINE_TEN);
                        System.out.print(MENU_ORDER);
                        choice = scanner.nextInt();
                        switch (choice){
                            // 주문 등록
                            case 1:
                                System.out.println("Oredr Add Entered!"); //테스트용 출력 코드
                                System.out.println(NEWLINE_TEN);
                                System.out.print(MENU_ORDER_ADD);
                                break;
                            // 주문 삭제
                            case 2:
                                System.out.println("Order Delete Entered!"); //테스트용 출력 코드
                                System.out.println(NEWLINE_TEN);
                                System.out.print(MENU_ORDER_DELETE);
                                break;
                            // 주문 조회
                            case 3:
                                System.out.println("Order Find Entered!"); //테스트용 출력 코드
                                System.out.println(NEWLINE_TEN);
                                System.out.print(MENU_ORDER_FIND);
                                break;
                            // 뒤로 가기
                            case 0: break orderMenu;
                        }
                    }
                    break;

                //3. 상품 관리
                case 3:
                    productMenu: while(true){
                        System.out.println(NEWLINE_TEN);
                        System.out.println(MENU_PRODUCT);
                        choice = scanner.nextInt();
                        switch (choice){
                            // 상품 등록
                            case 1:
                                System.out.println("Product Add Entered!"); //테스트용 출력 코드
                                System.out.println(NEWLINE_TEN);
                                System.out.print(MENU_PRODUCT_ADD);
                                //input

                                boolean result = productService.saveProduct(name, price, stock, catego ry)
                                break;
                            // 상품 삭제
                            case 2:
                                System.out.println("Product Delete Entered!"); //테스트용 출력 코드
                                System.out.println(NEWLINE_TEN);
                                System.out.print(MENU_PRODUCT_DELETE);
                                break;
                            // 상품 조회
                            case 3:
                                System.out.println("Product Find Entered!"); //테스트용 출력 코드
                                System.out.println(NEWLINE_TEN);
                                System.out.print(MENU_PRODUCT_FIND);
                                break;
                            // 뒤로 가기
                            case 0: break productMenu;
                        }
                    }
                    break;

                //4. 프로그램 종료
                case 0:
                    System.out.println(TERMINATE_INFO);
                    return;
                default:
                    System.out.println(ERROR_WRONG_INPUT);
                    break;


            }
        }
    }

    // Application's method for surveying and making instance of Customer
    public Customer inputCustomer() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("id: ");
        long id = scanner.nextLong();
        scanner.nextLine();
        System.out.print("name: ");
        String name = scanner.nextLine();
        System.out.print("age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("address: ");
        String address = scanner.nextLine();
        System.out.print("birthday(YYYY-MM-DD): ");
        //TODO 생일 입력받아 LocalDate 객체로 만들기
        String birth = scanner.nextLine();
        LocalDate birthday = LocalDate.now(); // Dummy for test
        System.out.print("tier: ");
        String tier = scanner.nextLine();
        return new Customer(id, name, age, phoneNumber, address, birthday, tier);
    }
    /*
    public Order inputOrder() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Customer id: ");
        long id = scanner.nextLong();
        scanner.nextLine();
        System.out.print("product name: ");
        String name = scanner.nextLine();
        System.out.print("quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.print("delivery address: ");
        String deliveryAddr = scanner.nextLine();
        System.out.print("discount: ");
        int discount = scanner.nextInt();
        return new Order()

    }
     */




    //=============String constants for menu===============

    //root menu
    static final String MENU_ROOT = """
            ========================<MAIN>
            1. CUSTOMER
            2. ORDER
            3. PRODUCT
            0. TERMINATE
            ==============================
            ENTER: """;

    //customer menu
    static final String MENU_CUSTOMER= """
            ====================<CUSTOMER>
            1. ADD CUSTOMER
            2. DELETE CUSTOMER
            3. FIND CUSTOMER
            0. GO BACK
            ==============================
            ENTER: """;
    static final String MENU_CUSTOMER_ADD = """
            ==============================
                    <ADD CUSTOMER>
            """;
    static final String MENU_CUSTOMER_DELETE = """
            ==============================
                   <DELETE CUSTOMER>
            """;
    static final String MENU_CUSTOMER_FIND = """
            ==============================
                    <FIND CUSTOMER>
            1. BY NAME
            2. BY ID
            3. TODAY'S BIRTHDAY
            0. GO BACK
            ==============================
            ENTER: """;
    static final String MENU_CUSTOMER_FIND_NAME= """
            ==============================
                   <FIND CUSTOMER>
            NAME: """;
    static final String MENU_CUSTOMER_FIND_ID= """
            ==============================
                   <FIND CUSTOMER>
            ID: """;

    //TODO
    static final String MENU_CUSTOMER_FIND_BIRTHDAY="";

    //order menu
    static final String MENU_ORDER = """
            =======================<ORDER>
            1. ADD ORDER
            2. DELETE ORDER
            3. FIND ORDER
            0. GO BACK
            ==============================
            ENTER: """;
    static final String MENU_ORDER_ADD = """
            ==============================
                     <ADD ORDER>
            """;
    static final String MENU_ORDER_DELETE = """
            ==============================
                    <DELETE ORDER>
            """;
    static final String MENU_ORDER_FIND = """
            ==============================
                     <FIND ORDER>
            1. FIND BY ORDER ID
            2. FIND BY CUSTOMER ID
            3. FIND BY PRODUCT ID
            ==============================
            ENTER: """;
    //product menu
    static final String MENU_PRODUCT= """
            =====================<PRODUCT>
            1. ADD PRODUCT
            2. DELETE PRODUCT
            3. FIND PRODUCT
            0. GO BACK
            ==============================
            ENTER: """;
    static final String MENU_PRODUCT_ADD = """
            ==============================
                    <ADD PRODUCT>
            """;
    static final String MENU_PRODUCT_DELETE = """
            ==============================
                   <DELETE PRODUCT>
            """;
    static final String MENU_PRODUCT_FIND = """
            ==============================
                     <FIND PRODUCT>
            1. FIND BY NAME
            2. FIND BY ID
            ==============================
            ENTER: """;

    //terminate info
    static final String TERMINATE_INFO = """
            ***********TERMINATE***********
            .......................GOOD BYE
            """;
    static final String ERROR_WRONG_INPUT= """
            NOT VALID INPUT!
            """;

    static final String NEWLINE_TEN = "\n\n\n\n\n\n\n\n\n\n";

    //=============String constants for menu===============
}
