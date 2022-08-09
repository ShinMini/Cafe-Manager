package controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import model.Clients;

public class SignIn {
   static Scanner sc = new Scanner(System.in);

   public static void signIn() throws IOException {
      Clients instance_clients = new Clients();
      ConsoleController.ClearScreen(); // 콘솔 clear

      System.out.println("### 회원가입###\n");
      instance_clients.setClientsID(Request_input("아이디"));
      // instance_clients.setClientsID("유저가입력한 아이디");

      if (SearchClient.SearchClientsID(instance_clients.getClientID()) != null) { // 중복임
         PrintFunctions.print_sginup_request(true); // 중복 표기 해준채 request print 함수 호출
         return;
      } else {
         instance_clients.setClientsPWD(Request_input("비밀번호"));
         // conver int type
         instance_clients.setClientsAge(
               (Request_input("비밀번호").charAt(0) - '0'));
         instance_clients.setClientsAdrres(Request_input("비밀번호"));
         instance_clients.setClientsBirthday(Request_input("비밀번호"));
         instance_clients.setClientsGrade("D"); // D등급부터 시작
      }
      // file writer를 통해 새로 가입된 회원 정보 기록
      try {
         // File file = new File("C:/JavaMiniProject/client.txt");
         FileWriter file = new FileWriter("C:/JavaMiniProject/client.txt");
         file.write(instance_clients.toString() + System.lineSeparator());
         file.close();

      } catch (Exception e) {
         System.err.println("ERROR ! 회원가입에 실패했습니다 :( ");
      }
      System.out.println("축하드립니다 ! 회원가입에 성공했습니다 :)");

   }

   public static String Request_input(String request_input) {  // "아이디"
      String msg = "를 입력해주세요 : ";
      System.out.println(request_input + msg);

      String input = sc.nextLine();

      return input;
   }

}
