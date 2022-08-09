/**
 * PROJ : 카페 메뉴 관리 프로그램
 * FILE : CafeMenuMangement.java
 * DESC : 입력 받은 reqNo를 통해서 메뉴 수정, 추가, 삭제 로직 실행 
 * 
 * @author kyuriKim
 * @version 1.0
**/
package controller.cafe;

import java.util.ArrayList;
import java.util.Scanner;

import model.CafeMenu;
import view.EndView;

public class CafeMenuManagement {

	Scanner s = new Scanner(System.in);
	MenuSearchModel instance = MenuSearchModel.getInstance();
	ArrayList<CafeMenu> allCafeMenuList = instance.getCafeMenuList();	

	public void reqResMenu(int reqNo) {

		if (reqNo == 1) { //메뉴 수정 

			System.out.println("수정할 메뉴의 이름을 입력해주세요");
			String updateMenu = s.nextLine();
			System.out.println("변경할 가격을 입력해주세요");
			int updatePrice = s.nextInt();
			instance.cafeMenuUpdate(updateMenu, updatePrice);
			EndView.MenuListView(allCafeMenuList);
			
		} else if (reqNo == 2) { // 메뉴 추가
			System.out.println("추가할 메뉴의 카테고리를 입력해주세요");
			String appendCategory = s.nextLine();
			System.out.println("추가할 메뉴의 이름을 입력해주세요");
			String appendMenu =  s.next();
			System.out.println("추가할 메뉴의 가격을 입력해주세요");
			int appendPrice = s.nextInt();
			System.out.println("추가할 메뉴의 칼로리를 입력해주세요");
			String appendCalorie = s.next();	
			CafeMenu menu = new CafeMenu(appendCategory,appendMenu, appendPrice, appendCalorie);
			instance.cafeMenuInsert(menu);
			EndView.MenuListView(allCafeMenuList);
		
		} else if (reqNo == 3) { // 메뉴 삭제
			System.out.println("삭제할 메뉴의 이름을 입력해주세요");
			
			String deleteMenu = s.nextLine();
			instance.cafeMenuDelete(deleteMenu);
			EndView.MenuListView(allCafeMenuList);
			
		} else if (reqNo == 4) { // return home
			System.out.println("홈으로 돌아갑니다.");
			
		
		} else { // 그 외의 번호가 입력되었을 때 출력할 문구
			System.out.println("*** 무효한 검색 요청 *****\n");
			System.out.println("다시 입력해주세요 \n");
			System.out.println("*****************************\n");
		
		}
	}
}