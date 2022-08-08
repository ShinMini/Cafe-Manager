package controller;

import java.io.IOException;
import java.util.Scanner;

public class SignIn {
   static Scanner sc = new Scanner(System.in);

   public static void signIn() throws IOException {
      ConsoleController.ClearScreen(); // 콘솔 clear

      System.out.println("### 회원가입###");
      System.out.println("아이디를 입력해주세요: ");
      String input_id = sc.nextLine();
      if (SearchClient.SearchClientsID(input_id) == null) { // 중복임
         PrintFunctions.print_sginup_request(true);   // 중복 표기 해준채 호출
         return; 
      }
      else {
      System.out.println("비밀번호를 입력해주세요: ");
      String input_pwd = sc.nextLine();
      }

      // insert clients // client 생성 함수 호출
      

   }


}
