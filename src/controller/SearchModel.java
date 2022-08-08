package controller;

import java.util.ArrayList;

import model.Clients;

public class SearchModel {

   public static Clients CheckClientsID(String clientID) {
      // file reader를 통해 회원정보가 들어있는 배열 가져온다 가정 -> ArrayList<Clients>
      ArrayList<Clients> clientsInfo = new ArrayList<Clients>();
      Clients TempClient = null;

      for (Clients client : clientsInfo) {
         if (client.getClientID().equals(clientID)) {
            TempClient = client;
         }
      }
      return TempClient; // 해당 아이디를 가진 회원이 존재하지 않는 경우 null 값 반환
   }

   /*
    * public static void main(String[] args) throws Exception {
    * File file = new File("C:/Test/test.txt");
    * String str = "this is test text file!";
    * 
    * try {
    * BufferedWriter writer = new BufferedWriter(new FileWriter(file));
    * writer.write(str);
    * writer.close();
    * } catch (IOException e) {
    * e.printStackTrace();
    * }
    * 
    * }
    */
}
