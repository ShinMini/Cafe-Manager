package view;


import controller.SearchModel;
import controller.SelectModel;
import model.CafeMenu;
import model.Clients;

public class StartView {
	public static void main(String [] args) {

		// 고객
		Clients clients1 = new Clients("김현주", 25, "jung@company.com","010-2414-4635","1001","temppw1001","경기 고양시 일산동구 경의로 573 / 4층",'F',"1월3일","A");
		Clients clients2 = new Clients("이지영", 35, "sung@company.com","010-6425-4371","1002","temppw1002","경기 고양시 일산서구 탄중로101번길 41",'F',"5월23일","B");
		Clients clients3 = new Clients("강수호", 32, "shin@company.com","010-6466-2274","1003","temppw1003","경기 고양시 덕양구 행주산성로 117-34",'M',"8월17일","C");
		Clients clients4 = new Clients("하도겸", 28, "kim@company.com","010-7733-3115","1004","temppw1004","경기 고양시 덕양구 행주산성로 141",'M',"11월19일","D");
​
		// 직원
		Employee_ori employee1 = new Employee_ori("김하준", 22, "khj@conmany.com","010-5262-6735", 201, "서울 서초구 신반포로 176 신세계백화점 강남점 지하 1층","880501-1344525",'M',"5월1일");
		Employee_ori employee2 = new Employee_ori("서은우", 25, "seu@conmany.com","010-6733-1236", 202, "서울특별시 용산구 한강대로50길 25 1층","670428-1256230",'M',"4월28일");
		Employee_ori employee3 = new Employee_ori("황서아", 28, "hsa@conmany.com","010-7735-2427", 203, "서울 서초구 동광로 99 2층","991112-2593963",'F',"11월22일");
		Employee_ori employee4 = new Employee_ori("나서윤", 30, "nsu@conmany.com","010-6612-5523", 204, "서울특별시 종로구 자하문로16길 8","980922-2693843",'F',"9월22일");
	}
		
		CafeMenu menu1 = new CafeMenu("Americano", 4000);
		CafeMenu menu2 = new CafeMenu("Latte", 5000);
		SearchModel instance = SearchModel.getInstance();
		
		SelectModel s = new SelectModel();
		
		instance.cafeMenuInsert(menu1);
		instance.cafeMenuInsert(menu2);
		
		s.reqRes(0);
	}
}