/**
 * PROJ : 카페 데이터 관리
 * FILE : Clients.java
 * DESC : 고객 정보 
 * 
 * @version 1.0
**/

package model;

public class Clients {
	/*** 고객 정보 종류 ***/
	/** 이름 **/
	private String clientName;

	/** 나이 **/
	private int clientAge; // 나이별 선호 메뉴 파악하여 마케팅 가능

	/** 이메일 **/
	private String clientEmail;

	/** 연락처 **/
	private String clientContact;

	/** ID **/
	private String clientID;

	/** PW **/
	private String clientPWD;

	/** 주소 **/
	private String clientAdrres;
	// 상류층 동네일 경우, 사회기여 상품에 지출할 확률이 높으므로 기부커피,서스펜디드 커피 등을 노출시킨다
	// 기부커피 : 같은 커피인데 마진을 붙여서 일정 금액을 기부하는 커피. 어차피 마진은 남는다.
	// 서스펜디드 커피 : 노숙자나 불우이웃을 위해 미리 돈을 내고 맡겨두는 커피

	/** 성별 **/
	// 성별에 따른 선호 메뉴 파악
	private char clientGender;

	/** 생일 **/
	// 생일에 축하 메세지 및 각종 쿠폰 발송으로 결제 유도
	private String clientBirthday;

	/** 고객 등급 **/
	// 고객 등급에 따른 각종 혜택 마케팅
	private String clientGrade;

	// 아이디어
	// 스타벅스처럼 온라인 주문이 가능하다는 가정 하에, 고객별 전환율 / 방문자당 수익 / 고객당 평균 수익(ARPU) 등을 추가로 파악하여
	// 무료배송, 시즌 특가 메뉴, 기간 한정 할인, 대량구매 할인, 상향판매(더비싼거 소개), 교차판매(비슷한거 소개), 패키지 상품 등 구매
	// 유도 마케팅 가능
	​

	// constructor
	public Clients() {
	}

	public Clients(String clientName, int clientAge, String clientEmail, String clientContact, String clientID,
				   String clientPWD, String clientAdrres, char clientGender, String clientBirthday, String clientGrade)
					{
		super();
		this.clientName = clientName;
		this.clientAge = clientAge;
		this.clientEmail = clientEmail;
		this.clientContact = clientContact;
		this.clientID = clientID;
		
		this.clientPWD = clientPWD;
		this.clientAdrres= clientAdrres;
		this.clientGender = clientGender;
		this.clientBirthday = clientBirthday;
		this.clientGrade = clientGrade;
	}
​

	public String getClientName() {
		return this.clientName;
	}

	public String getClientID() {
		return this.clientID;
	}

	public int getClientAge() {
		return this.clientAge;
	}

	public String getClientAdrres() {
		return this.clientAdrres;
	}
	public String getClientPWD() {
		return this.clientPWD;
	}

	public String getClientGrades() {
		return this.clientGrade;
	}
	public String getClientBirthday() {
		return this.clientBirthday;
	}

	// setter
	public void setClientsID(String clientID) {
		this.clientID = clientID;
	}
	public void setClientsPWD(String clientPWD) {
		this.clientPWD= clientPWD;
	}
	public void setClientsAdrres(String clientAdrres) {
		this.clientAdrres= clientAdrres;
	}
	public void setClientsAge(int clientAge) {
		this.clientAge = clientAge;
	}
	public void setClientsBirthday(String clientBirthday) {
		this.clientBirthday= clientBirthday;
	}
	public void setClientsGrade(String clientGrade) {
		this.clientGrade = clientGrade;
	}
}