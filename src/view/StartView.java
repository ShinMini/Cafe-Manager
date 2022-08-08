package view;


import controller.SearchModel;
import controller.SelectModel;
import model.CafeMenu;

public class StartView {
	public static void main(String [] args) {
		
		CafeMenu menu1 = new CafeMenu("Americano", 4000);
		CafeMenu menu2 = new CafeMenu("Latte", 5000);
		SearchModel instance = SearchModel.getInstance();
		
		SelectModel s = new SelectModel();
		
		instance.cafeMenuInsert(menu1);
		instance.cafeMenuInsert(menu2);
		
		s.reqRes(0);
	}
}