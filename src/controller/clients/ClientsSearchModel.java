package controller.clients;


import java.util.ArrayList;

import model.Clients;

public class ClientsSearchModel {
   private static ClientsSearchModel instance = new ClientsSearchModel();

   /** 고객을 저장하는 배열 */
   private ArrayList<Clients> clientsList = new ArrayList<Clients>();

   /** 모든 고객 instance */

   public ClientsSearchModel() {}

   public static ClientsSearchModel getInstance() {
      return instance;

   }

   /**
    * 모든 고객 검색
    * 
    * @return 모든 ClientsList
    */
   public ArrayList<Clients> getClientsList() {
      return clientsList;
   }

   /**
	 * 회원가입 유무 체크
	 */
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

}