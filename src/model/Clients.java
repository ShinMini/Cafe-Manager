/**
 * PROJ : 카페 데이터 관리
 * FILE : Clients.java
 * DESC : 고객 정보 
 * 
 * @version 1.0
**/
package model;
​
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
​
@Getter
@Setter
@Builder
public class Clients {
	/*** 고객 정보 종류 ***/
	/** 이름 **/
	private String clientName;
	
	/** 나이 **/
	private int clientAge;
		// 나이별 선호 메뉴 파악하여 마케팅 가능
	
	/** 이메일 **/
	private String clientEmail;
	
	/** 연락처 **/
	private String clientContact;
	
	/** ID **/
	private String clientID;
	
	/** PW **/ 
	private String clientPWD;
	
	/** 주소 **/
	private String clientAddress;
		// 상류층 동네일 경우, 사회기여 상품에 지출할 확률이 높으므로 기부커피,서스펜디드 커피 등을 노출시킨다
			// 기부커피 : 같은 커피인데 마진을 붙여서 일정 금액을 기부하는 커피. 어차피 마진은 남는다.
			// 서스펜디드 커피 : 노숙자나 불우이웃을 위해 미리 돈을 내고 맡겨두는 커피
	
	/** 성별 **/	
		// 성별에 따른 선호 메뉴 파악
	private char clientGender;
	
	/** 생일 **/
		// 생일에 축하 메세지 및 각종 쿠폰 발송으로 결제 유도
		// https://badadict.com/en/15279
	private String clientBirthday;
​
	/** 고객 등급 **/
		// 고객 등급에 따른 각종 혜택 마케팅
	private String clientGrade;	
	
/** 아이디어 **/
//	/** 총 주문 회수 **/
//		// TPC : Total Order
//		// https://www.abbreviationfinder.org/acronyms/turnover_total-order.html
//	private int clientTO;
//	
//	/** 총 주문 금액 **/
//		// 총 주문 금액이 높은 고객의 경우, 추가 결제 확률이 높으므로 마진 높은 상품 위주로 할인 쿠폰 발송
//		// TOV : Total Order Value
//		// https://digitalmarketinginstitute.com/resources/glossary/total-order-value-tov
//	private int clientTOV;
//	
//	/** 평균 구매 금액 **/
//		// 평균 구매 금액에 따른 메뉴추천 마케팅
//		// AOV : Average order value
//		// https://www.optimizely.com/optimization-glossary/average-order-value/
//	private float clientAOV;
//	
//	/** 바코드 결제 사용 회수 **/
//		// 바코드 결제 사용 횟수는 선물받은 회수를 의미하므로, 해당 고객이 커플이거나 사회적 활동이 많음을 의미한다.
//		// 그러므로 커플이나 인싸 고객으로 분류하여 마케팅 가능
//	private int clientBarcodePayback;
//	
//	/** 고객 분류 **/
//		// 커플,인싸,얼죽아 등 고객을 분류하여 맞춤화된 타게팅 가능
//		// 저소득층 고객의 경우, 저소득층 결제수단(문화누리카드, 긴급생활지원금 카드 등)으로 분류 가능.
//	private String clientType;
//	
//	/** 블랙리스트 여부 **/
//		// 환불,클레임 등 각종 이슈가 있었던 특별 관리 대상 고객
//	private char clientRude;
//	
//	/** 마지막 주문일 **/
//		// 마지막 주문일이 오래된 고객의 경우 쿠폰 발송
//		// LOD : Last Order Date
//		// https://www.abbreviationfinder.org/acronyms/lod_last-order-date.html
//	private int clientLOD;
//	
//	/** 첫 주문일 **/
//		// 단골 고객 관리를 위한 정보.
//		// FOD : First Order Date
//	private int clientFOD;
	
	// 아이디어
	// 스타벅스처럼 온라인 주문이 가능하다는 가정 하에, 고객별 전환율 / 방문자당 수익 / 고객당 평균 수익(ARPU) 등을 추가로 파악하여
	// 무료배송, 시즌 특가 메뉴, 기간 한정 할인, 대량구매 할인, 상향판매(더비싼거 소개), 교차판매(비슷한거 소개), 패키지 상품 등 구매 유도 마케팅 가능
​
	// constructor
	public Clients() {}
	public Clients(String clientName, int clientAge, String clientEmail, String clientContact, String clientID,
				   String clientPWD, String clientAddress, char clientGender, String clientBirthday, String clientGrade) {
		super();
		this.clientName = clientName;
		this.clientAge = clientAge;
		this.clientEmail = clientEmail;
		this.clientContact = clientContact;
		this.clientID = clientID;
		
		this.clientPWD = clientPWD;
		this.clientAddress = clientAddress;
		this.clientGender = clientGender;
		this.clientBirthday = clientBirthday;
		this.clientGrade = clientGrade;
	}
​
	// toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("고객명 : ");
		builder.append(clientName);
		builder.append("\n");
		
		builder.append("고객 나이 : ");
		builder.append(clientAge);
		builder.append("\n");
		
		builder.append("고객 이메일 : ");
		builder.append(clientEmail);
		builder.append("\n");
		
		builder.append("고객 연락처 : ");
		builder.append(clientContact);
		builder.append("\n");
		
		builder.append("고객 ID : ");
		builder.append(clientID);
		builder.append("\n");
		
		builder.append("고객 PW : ");
		builder.append(clientPWD);
		builder.append("\n");
		
		builder.append("고객 주소 : ");
		builder.append(clientAddress);
		builder.append("\n");
		
		builder.append("고객 성별 : ");
		builder.append(clientGender);
		builder.append("\n");
		
		builder.append("고객 생일 : ");
		builder.append(clientBirthday);
		builder.append("\n");
		
		builder.append("고객 등급 : ");
		builder.append(clientGrade);
		builder.append("\n");
		
		return builder.toString();
	}
	// Getter & Setter
		// 롬북 사용
}