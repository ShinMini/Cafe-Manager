package controller.management;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import model.Clients;

public class SearchClient {
   static Scanner sc = new Scanner(System.in);

   public static void FindClients() {
    
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
      ArrayList<Clients> clientsInfo = new ArrayList<Clients>();
      Clients tempClients = new Clients();
      boolean initalStart = false;
      boolean recodeStart = false;
      String madeString = "";
      int addCount = 0;
      // file reader를 통해 회원정보가 들어있는 배열 가져온다 가정 -> ArrayList<Clients>
      try {
         FileReader reader = new FileReader(new File("C:\\miniproject\\client.txt"));

         int ch;
         while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
            if (ch == ',') {
               recodeStart = false;
            }
            if (ch == '[')
               initalStart = true;
            if (ch == ']')
               initalStart = false;

            if (initalStart == true && recodeStart == true) {
               addCount++;
               madeString += ch;

               if (addCount == 1) {
                  tempClients.setClientsAdrres(madeString);
               }
               if (addCount == 2) {
                  tempClients.setClientsAge(Integer.parseInt(madeString));
               }
               if (addCount == 3) {
                  tempClients.setClientBirthday(madeString);
               }
               if (addCount == 4) {
                  tempClients.setClientsGrade(madeString);
               }
               if (addCount == 5) {
                  tempClients.setClientID(madeString);
               }
               if (addCount == 6) {
                  tempClients.setClientName(madeString);
                  addCount++;
               }
               if (addCount == 7) {
                  tempClients.setClientPWD(madeString);
               }
            }
            if (ch == 32)
               recodeStart = true;
         }
      } catch (Exception e) {
         System.err.println(e);
      }

      // 고객데이터를 가지고 검사를했을때
      for (Clients client : clientsInfo) {
         if (client.getClientID().equals(clientID)) {
            tempClients = client;
            return tempClients;
         }
         else 
         tempClients = null;
      }
      return tempClients;
   }

}
