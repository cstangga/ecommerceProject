# ecommerceProject
## 참여 인원 : 최창욱 김홍현 박태준 전현선
-----
* 소감문
 1. 최창욱 :
    이번 팀과제를 하면서 사실 개인적으로 하는 건 부담이 없는데 아무래도 다른 인원의 성향과 경험이 달라 피해가 가지 않을까 싶었지만
    제 우려와 달리 서로서로 배려와 의사소통이 잘 되어서 팀협업이라는게 부딪혀보면 된다는 자신감과 가장 걱정이었던 협업툴을 사용하는 경험을 배워서 좋았습니다
 2. 김홍현 :
    생각보다 간단한 기능 구현하기도 힘들고 여러명이 작업하며 형상관리하는게 어려웠습니다
 3. 박태준 :
     객체지향 프로그래밍에 대한 이해도를 조금 더 높일 수 있었고, 팀원들과 협력하며 협업의 중요성을 느낄 수 있었던 시간이였습니다.
 4. 전현선 :
     팀원들과 함께 직접 객체지향 프로그램을 설계하면서 어떻게 프로그래밍 사고를 해야하는지, 코드를 어떤 방향으로 작성해야 하는지 조금은 알 수 있었던 시간이었습니다.
     또한 부족한 부분이 무엇인지도 알 수 있었던 것 같습니다.

* 사용된 기술 및 주요 코드
 1. 저장소 진입, 저장소 싱글톤 객체 생성
 3. 클래스별 책임 명확
    1) Main 클래스 = 메뉴 화면(Application)만 실행
    2) 메뉴 진입 <-> 서비스<-> 저장소
    3) 각 서비스만이 저장소를 진입이 가능
 3. 스위치문 다음 단계 진입 및 그 전 단계로 이동이 가능하게 구현 함
    ex) productMenu: while(true) = 메뉴 while문
        case 0: break productMenu
 4. 클래스별 역할
    Main -> Application(메뉴 화면)
    Application ->  입력 및 출력 <-> 저장소
![ecommerceProject_switch](https://github.com/cstangga/ecommerceProject/assets/50364232/e2b6da93-7627-4514-b864-6c7e54a0a51c)
