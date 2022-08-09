/**
 * PROJ : 카페 데이터 관리
 * FILE : CafeMenu.java
 * DESC : 카페 메뉴 정보 
 * 
 * @version 1.0
**/
package model;
public class CafeMenu {
    /** 카페 메뉴 종류 **/
    private String menuCategory; /** 메뉴 카테코리 **/
    
    private String menuName; /** 메뉴 이름 **/
    
    private int menuPrice; /** 메뉴 가격 **/
    
    private String menuCalorie; /** 메뉴 칼로리 **/
    
    
    public CafeMenu() {}
    public CafeMenu(String menuCategory, String menuName, int menuPrice, String menuCalorie) {
        super();
        this.menuCategory = menuCategory;
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.menuCalorie = menuCalorie;
    }
    
    public String getMenuCategory() {
        return menuCategory;
    }
    
    public void setMenuCategory(String menuCategory) {
        this.menuCategory = menuCategory;
    }
    
    public String getMenuName() {
        return menuName;
    }
   
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    
    public int getMenuPrice() {
        return menuPrice;
    }
    
    public void setMenuPrice(int menuPrice) {
        this.menuPrice = menuPrice;
    }
    
    public String getMenuCalorie() {
        return menuCalorie;
    }
    
    public void setMenuCalorie(String menuCalorie) {
        this.menuCalorie = menuCalorie;
    }
    // cafeMenunage 변수를ArrayList<String> CafeMenu로 하나 생성해서 return 으로 ArrayList<String>을 반환하도록 수정 부탁드립니다(신현민)
    public Object getCafeMenuName() {
      return null;
    }

}