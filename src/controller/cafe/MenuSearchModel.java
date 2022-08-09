/**
 * PROJ : 카페메뉴 관리 서비스
 * FILE : MenuSearchModel.java
 * DESC : 카페 메뉴를 저장, 수정, 삭제, 검색하는 서비스 로직 
 * 
 * 
 * @author kyuriKim
 * 
 * @version 1.0
**/
package controller.cafe;
import java.util.ArrayList;

import model.CafeMenu;
public class MenuSearchModel {
    private static MenuSearchModel instance = new MenuSearchModel();
    
    /** 카페 메뉴를 저장하는 배열 */
    private ArrayList <CafeMenu> cafeMenuList = new ArrayList <CafeMenu>();
    
    /** 카페 메뉴 총 개수 */
    
    private MenuSearchModel() {}
    public static MenuSearchModel getInstance() {
        return instance;
        
    }
    
    /**
     * 모든 메뉴 검색
     * 
     * @return 모든 MenuList
     */
    public ArrayList <CafeMenu> getCafeMenuList() {
        return cafeMenuList;
        
    }
    
    /** 
     * 메뉴 이름으로 검색 - 객체된 메뉴 반환하기
     * 
     * @param 메뉴 이름
     * @return Cafe Menu 검색된 프로젝트 
     */
    public CafeMenu getCafeMenu(String menuName) {
        
        for(CafeMenu menu : cafeMenuList) {
            if(menu.getMenuName().equals(menuName)) {
                return menu;
            }
        }
        
        return null;
    }
    
    /**
     * 새로운 메뉴 추가 
     * 
     * @param Menu 저장하고자 하는 새로운 메뉴
     */
    public void cafeMenuInsert(CafeMenu menu) {
        cafeMenuList.add(menu);   
        
    }
    
    /**
     * Menu의 Price 수정 - 메뉴명으로 검색해서 해당 메뉴의 가격 수정
     * 
     * @param menuName 메뉴 이름
     * @param price 가격  
     */
    public void cafeMenuUpdate(String menuName, int menuPrice) {
        
        for (CafeMenu menu : cafeMenuList) {
            
            if (menu.getMenuName().equals(menuName)) {
                menu.setMenuPrice(menuPrice);
                break;
            }
        }
    }
    
    /**
     * Menu 삭제 - 메뉴명으로 해당 메뉴 삭제
     * 
     * @param cafeMenuName 삭제하고자 하는 메뉴 이름
     * @throws Exception 
     */
    public void cafeMenuDelete(String menuName)  {
    
        System.out.println("d999" +  menuName);
        for(CafeMenu menu : cafeMenuList) {
            if(menu.getMenuName().equals(menuName)) {
                System.out.println(cafeMenuList);
                cafeMenuList.remove(menu);
                System.out.println(cafeMenuList);
                
                break;
//          }else {
//              throw new Exception("해당 Menu가 존재하지 않습니다. 재확인하세요");
            }
        }
    }
            
    
    /**
     * cafeMenu 총 개수 반환
     * @return 개수
     */
    public int menuListSize() {
        return cafeMenuList.size();
    }
    
}
