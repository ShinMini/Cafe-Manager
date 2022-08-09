package data;

import model.CafeMenu;
import model.Clients;

public class data {
		// startMenu();

		// 고객
		Clients clients1 = new Clients("김현주", 25, "jung@company.com","010-2414-4635","1001","temppw1001","경기 고양시 일산동구 경의로 573 / 4층",'F',"1월3일","A");
		Clients clients2 = new Clients("이지영", 35, "sung@company.com","010-6425-4371","1002","temppw1002","경기 고양시 일산서구 탄중로101번길 41",'F',"5월23일","B");
		Clients clients3 = new Clients("강수호", 32, "shin@company.com","010-6466-2274","1003","temppw1003","경기 고양시 덕양구 행주산성로 117-34",'M',"8월17일","C");
		Clients clients4 = new Clients("하도겸", 28, "kim@company.com","010-7733-3115","1004","temppw1004","경기 고양시 덕양구 행주산성로 141",'M',"11월19일","D");
​
		// CafeMenu 수정필요.
		// CafeMenu menu1 = new CafeMenu("Americano", 4000);
		// CafeMenu menu2 = new CafeMenu("Latte", 5000);

		instance.cafeMenuInsert(menu1);
		instance.cafeMenuInsert(menu2);
}
