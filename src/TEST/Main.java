package TEST;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CRUD crud = new CRUD();
        Client client = new Client();
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        crud.connect();
        while (run) {
            System.out.println("====================================");
            System.out.println("1.회원 가입 2. 정보 확인 3. 입금 4. 출금");
            System.out.println("5.송금 6. 잔액 조회 7. 종료 ");
            System.out.println("====================================");
            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("이름 입력 : ");
                    client.setcName(sc.next());
                    System.out.println("초기 입금액 입력 : ");
                    client.setBalance(sc.nextInt());
                    crud.bankJoin(client);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("이용해 주셔서 감사합니다");
                    crud.conclose();
                    run=false;
                    break;
                default :
                    System.out.println("잘못 입력했습니다");
                    break;


            }



        }
    }
}
