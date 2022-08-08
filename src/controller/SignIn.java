package controller;

import java.util.Scanner;
import controller.SearchModel;
import model.Clients;

public class SignIn {
   Scanner sc = new Scanner(System.in);

   public void signIn() {
      System.out.println("아이디를 입력해주세요: ");
      String input_id = sc.nextLine();

      if (SearchModel.CheckClientsID(input_id) != null) {
         // 해당 아이디가 이미 존재하는 경우. 1번 -> 아이디 재선택, 2번 아이디/비밀번호 찾기, 3번 프로그램 종료하기
         String input_option = OverlapID();
         int switchNum = CheckOptionRight(input_option);

         switch (switchNum) {
            case 1: // 아이디 재 입력받기
               signIn(); // 함수 재귀호출
               break;

            case 2: // 아이디/ 비밀번호 찾기
               // 아이디 & 비밀번호 찾는 함수 호출
               System.out.println("찾으시는 회원의 아이디를 입력해주세요: ");
               String case2InputID = sc.nextLine();

               System.out.println("찾으시는 회원의 이름을 입력해주세요: ");
               String case2InputName = sc.nextLine();

               if (SearchModel.CheckClientsID(case2InputID) != null) {  // 일치하는 아이디 확인
                  Clients case2Client = SearchModel.CheckClientsID(case2InputID);
                  if(case2Client.getClientName().equals(case2InputName)){    //일치하는 비밀번호 확인
                  System.out.println(case2Client.getClientName() + "님의 회원정보");
                  System.out.println("아이디: [" + case2Client.getClientID() + "]");
                  System.out.println("비밀번호: [" + case2Client.getClientPWD() + "]");

                  }
                  else System.out.println("일치하는 회원이 존재하지 않습니다.");
               }
               else System.out.println("일치하는 회원이 존재하지 않습니다.");
               // 1번 로그인페이지로 돌아가기
               // 2번 회원정보 재 입력하기
               // 3번 프로그램 종료.

               // SearchModel.CheckClientsID(input_id) == true

               break;

            case 3: // 프로그램 종료하기

               break;
            default:
               break;
         }

      }

   }

   // 제대로 된 옵션을 선택했는지 확인하는 method
   public int CheckOptionRight(String input_option) {
      char check_option = input_option.charAt(0); // 문자열 첫번째 글자 가져옴

      if (Character.isDigit(check_option)) { // 해당 input text가 숫자로 변환 가능한 경우.
         return check_option - '0'; // return 선택한 입력값
      } else
         return -1;
   }

   public String OverlapID() { // 해당 아이디값이 이미 존재할 경우 호출되는 창
      System.out.println("###############################");
      System.out.println("## 해당 아이디값이 이미 존재합니다 ##");
      System.out.println("### 원하시는 메뉴를 선택해주세요 ###");
      System.out.println("###############################");
      System.out.println("### 1. 아이디 재입력하기 ###\n");
      System.out.println("### 2. 아이디/비밀번호 찾기 \n###");
      System.out.println("### 3. 프로그램 종료 ###\n");
      System.out.println("###############################");

      return sc.next();
   }

}
