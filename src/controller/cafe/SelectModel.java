/**
 * PROJ : 카페 관리 프로그램
 * FILE : SelectModel.java
 * DESC : 입력 받은 reqNo를 통해서 메뉴관리, 클라이언트 관리 로직 실행 
 * 
 * @author kyuriKim
 * 
 * @version 1.0
**/
package controller.cafe;

import java.util.ArrayList;
import java.util.Scanner;

import model.CafeMenu;
import model.Clients;
import view.EndView;

public class SelectModel {

	static Scanner s = new Scanner(System.in);
	static MenuSearchModel instance = MenuSearchModel.getInstance();

	private ArrayList<CafeMenu> cafeMenuList = new ArrayList<CafeMenu>();

	/** 카페 관리 시스템 */
	public static void ManagementCafe() {
		int reqNo = 0;

		System.out.println("welcome to startbucks management system \nwhat can I help you?\n");
		reqNo = s.nextInt(); // Scanner를 통해서 숫자를 입력받아 각각의 서비스 실행

		ArrayList<CafeMenu> allCafeMenuList = instance.getCafeMenuList();
		EndView.MenuListView(allCafeMenuList);
		System.out.println("1. 카페 가격 수정 \n2. 카페 메뉴 추가 \n3. 카페 메뉴 삭제 \n4. 돌아가기 ");
		(new CafeMenuManagement()).reqResMenu(reqNo);

	}

}
