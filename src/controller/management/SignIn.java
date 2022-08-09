package controller.management;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import controller.feature.ConsoleController;
import controller.feature.PrintFunctions;
import model.Clients;

public class SignIn {
   static Scanner sc = new Scanner(System.in);

   public static void signIn(boolean overlapID) throws IOException {
      ConsoleController.ClearScreen(); // 콘솔 clear

      Clients instance_clients = new Clients();

      System.out.println("### Sign Up page ###\n");
      if (overlapID = true) {
         System.out.println("### ID was existed input again ;( ###\n");
      } else {
         System.out.println("### ###### ###\n");
      }

      String input_id = Request_input("ID");
      if (SearchClient.FindID(input_id) == null) {
         signIn(true);
      }
      instance_clients.setClientsID(input_id);

         ConsoleController.ClearScreen(); // 콘솔 clear
         instance_clients.setClientsPWD(Request_input("PWD"));
         // conver int type
         System.out.println("input age: ");
         int tempAge = sc.nextInt();
         sc.nextLine();
         instance_clients.setClientsAge(tempAge);
         instance_clients.setClientsAdrres(Request_input("adrress"));
         instance_clients.setClientName(Request_input("name"));
         instance_clients.setClientsBirthday(Request_input("your birthday"));
         instance_clients.setClientsGrade("D"); // D등급부터 시작
      // file writer를 통해 새로 가입된 회원 정보 기록
      try {
         FileWriter fw = new FileWriter(new File("C://miniproject//client.txt"));
         fw.write(instance_clients.toString() + System.lineSeparator());
         fw.close();
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
