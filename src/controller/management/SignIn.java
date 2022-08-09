package controller.management;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import controller.feature.ConsoleController;
import controller.feature.PrintFunctions;
import model.Clients;

public class SignIn {
   static Scanner sc = new Scanner(System.in);

   public static void signIn() throws IOException {
      Clients instance_clients = new Clients();
      ConsoleController.ClearScreen(); // 콘솔 clear

      System.out.println("### Sign Up page ###\n");
      instance_clients.setClientsID(Request_input("ID: "));
      // instance_clients.setClientsID("유저가입력한 아이디");

      if (SearchClient.FindID(instance_clients.getClientID()) != null) { // 중복임
         PrintFunctions.print_sginup_request(true); // 중복 표기 해준채 request print 함수 호출
         return;
      } else {
         instance_clients.setClientsPWD(Request_input("PWD"));
         // conver int type
         System.out.println("input age: ");
         int tempAge = sc.nextInt();
         instance_clients.setClientsAge(tempAge);
         instance_clients.setClientsAdrres(Request_input("adrress"));
         instance_clients.setClientsBirthday(Request_input("your birthday"));
         instance_clients.setClientsGrade("D"); // D등급부터 시작
      }
      // file writer를 통해 새로 가입된 회원 정보 기록
      try {
         FileWriter file = new FileWriter("C:/JavaMiniProject/client.txt");
         file.write(instance_clients.toString() + System.lineSeparator());
         file.close();

      } catch (Exception e) {
         System.err.println("ERROR ! fail to sign up :( ");
      }
      System.out.println("congraturation ! success to sign up :)");

   }

   public static String Request_input(String request_input) { // "아이디"
      String msg = "input ";
      System.out.println(msg + request_input + ": ");

      String input = sc.nextLine();

      return input;
   }

}
