package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.CafeMenu;
import view.EndView;

public class SelectModel {
Scanner s = new Scanner(System.in);
SearchModel instance = SearchModel.getInstance();

/** 진행중인 Project를 저장하는 배열 */
private ArrayList <CafeMenu> cafeMenuList = new ArrayList <CafeMenu>();
	
	public void reqRes(int reqNo) {
		while (true) {
			System.out.println("안녕하세요 스타벅스입니다\n무엇을 도와드릴까요?\n");
			System.out.println("1. 카페 메뉴 관리 \n2. 클라이언트 관리 \n3. 종료 "); //필요시 직원관리 추가 
			reqNo = s.nextInt();
			
			if (reqNo ==1) {
				ArrayList<CafeMenu> allCafeMenuList = instance.getCafeMenuList();		
				EndView.MenuListView(allCafeMenuList);
				System.out.println("1. 카페 메뉴 수정 \n2. 카페 메뉴 추가 \n3. 카페 메뉴 삭제 \n4. 종료 ");
				int reqNo2 = s.nextInt();
				
				if (reqNo2 ==1) {
					
					
				}else if (reqNo2 == 2) {
					
				}else if (reqNo2 == 3) {
					
				}else if (reqNo2 == 4) {
					s.close();
					System.out.println("종료합니다 \n");
					break;
					
				}else {
					System.out.println("*** 무효한 검색 요청 *****\n");
					System.out.println("다시 입력해주세요 \n");
					System.out.println("*****************************\n");
				}
			}else if (reqNo == 2) {
				
			}else if(reqNo == 3){
				s.close();
				System.out.println("안녕히가세요\n");
				break;
						
			}else {
				System.out.println("*** 무효한 검색 요청 *****\n");
				System.out.println("다시 입력해주세요 \n");
				System.out.println("*****************************\n");
			}
		
		}
	}
}