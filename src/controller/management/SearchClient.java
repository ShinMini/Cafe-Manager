package controller.management;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import controller.feature.OptionChecker;
import model.Clients;

public class SearchClient {
   static Scanner sc = new Scanner(System.in);

   public static void FindClients() {
      System.out.println("### 1. find ID ###");
      String input_option = sc.nextLine();
      if (OptionChecker.Check(input_option) == 1) {

      }
      if (OptionChecker.Check(input_option) == 2) {

      }
      if (OptionChecker.Check(input_option) == 3) {

      } else {

      }
      System.out.println("please input ID : ");
      String case2InputID = sc.nextLine();

      System.out.println("please input your name : ");
      String case2InputName = sc.nextLine();

      Clients case2Client = FindID(case2InputID);

      if (case2Client != null) { // 찾으려는 회원 정보가 있는경우.
         if (case2Client.getClientName().equals(case2InputName)) {
            System.out.println(case2Client.getClientName() + "\\'s information");
            System.out.println("ID: [" + case2Client.getClientID() + "]");
            System.out.println("PWD: [" + case2Client.getClientPWD() + "]");
         }
      } else {
         System.out.println("NOT FOUND :(.");
      }
      System.out.println("press any key to continue...");
      sc.next();
   }

   public static void CheckClient(Clients client) {

   }

   // id가 중복된 경우 해당 client객체반환 중복되지않은경우 null값 반환
   public static Clients FindID(String clientID) {
      // file reader를 통해 회원정보가 들어있는 배열 가져온다 가정 -> ArrayList<Clients>
      try {
         FileReader reader = new FileReader("C:\\Java_Mini_Project\\file.txt");

         int ch;
         while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
         }
      } catch (Exception e) {
         System.err.println(e);
      }
      ArrayList<Clients> clientsInfo = new ArrayList<Clients>();

      Clients TempClient = null;

      // 고객데이터를 가지고 검사를했을때
      for (Clients client : clientsInfo) {
         if (client.getClientID().equals(clientID)) {
            TempClient = client;
         }
      }
      return TempClient; // 해당 아이디를 가진 회원이 존재하지 않는 경우 null 값 반환
   }

}
