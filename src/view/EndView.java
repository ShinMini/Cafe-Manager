/** 
 * PROJECT  : 카페 관리 프로젝트
 * NAME  :  EndView.java
 * DESC  : 카페관리 출력클래스
 * 
 * @author  kyuriKim
 * @version 1.0
*/
package view;

import java.util.ArrayList;
import model.CafeMenu;
import model.Clients;



public class EndView {
	//메뉴 선택 출력 
		public static void menuView(CafeMenu menu){
			if(menu != null) {
				System.out.println(menu);		
			}else {
				System.out.println("해당 메뉴는 존재하지 않습니다.");
			}
		}
		
		// 모든 메뉴 출력
		public static void MenuListView(ArrayList<CafeMenu> allCafeMenu){
			
			int index = 1;
			
			for(CafeMenu menu : allCafeMenu){	
				
				if(menu != null){
					System.out.println("[Menu : " + (index++) + "] " + menu);
					
				}
			}
		}
		// 고객 선택 출력
		public static void clientsView(Clients c) {
			if(c != null) {
				System.out.println(c);
			}else {
				System.out.println("해당 고객은 존재하지 않습니다.");
			}
		}
		// 모든 고객 출력
		public static void ClientsListView(ArrayList<Clients> allClients){
			
			int index = 1;
			
			for(Clients c : allClients){	
				
				if(c != null){
					System.out.println("[고객정보 : " + (index++) + "] " +c);
					
				}
			}
		}
}