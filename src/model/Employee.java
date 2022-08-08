/**
 * PROJ : 카페 데이터 관리
 * FILE : Employee.java
 * DESC : 직원 정보 
 * 
 * @version 1.0
**/
package model;
​
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
​
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
//@Builder
​
public class Employee {
	/** 직원 정보 종류**/
	/** 이름**/
	private String employeeName;
	
	/** 나이 **/
	private int employeeAge;
	
	/** 이메일 **/
	private String employeeEmail;
​
	/** 연락처 **/
	private String employeeContact;
	
	/** 직원 번호 **/
	private int employeeID;
	
	/** 주소 **/
	private String employeeAddress;
	
	/** 주민등록번호 **/
		// RRN : Resident Registration Number
		// https://ko.wikipedia.org/wiki/%EC%A3%BC%EB%AF%BC%EB%93%B1%EB%A1%9D%EB%B2%88%ED%98%B8
	private String employeeResidentRegistrationNumber;
	
	/** 성별 **/	
	private char employeeGender;
	
	/** 생일 **/
	// https://badadict.com/en/15279
	private String employeeBirthday;
​
	/** 아이디어 **/
//	/** 입사일 **/
//	private int employeeStartWork;
//	
//	/** 소속 지점 **/
//	private String employeeBelong;
//	
//	/** 해당 지점장 **/
//		// 스토어 매니저
//	private String employeeSM;
//	
//	/** 지점 위치 **/
//	private String employeeLOC;
//	
//	/** 지점 연락처 **/
//	private int employeeBranchContact;
//	
//	/** 직원 관심사 **/
//		// 취미 등
//	private String employeeInterest;
//	
//	/** 총 근무일 **/
//	private int employeeTotalWorkingDays;
//	
//	/** 4대보험 유무 **/
//	private int employeeInsurance;
//	
//	/** 직원 등급 **/
//		// 바리스타, 수퍼바이저, 부점장, 점장
//		// https://post-phinf.pstatic.net/MjAyMTA1MjdfMjUw/MDAxNjIyMDgzMzM4MDQ0.B8zDZ_EA3flRguNHKikcsHMpVkfIWCccvlwC7UWTgK4g.cJLWvQVZXiNjylukJyEX4UKofi6tt8c4L2qARgUGBdcg.PNG/MHYDA.png?type=w1200
//	private String employeeGrade;
//	
//	/** 직원 타입 **/
//		// 정규직,비정규직,일용직,하청, 등 분류
//	private String employeeType;
//	
//	/** 최종 학력 **/
//	private String employeeEducation;
//	
//	/** 전공 **/
//	private String employeeMajor;
//	
//	/** 월 급여 **/
//	private int employeeSalary;
//	
//	/** 계좌번호 **/
//	private int employeeAccountNumber;
//	
//	/** 무단 결근일 **/
//	private int employeeAbsenteeism;
	
	// 아이디어
	// 도메인 분리..
	// 직원 근무일자에 따른 축하 메세지 및 상품권 메일 발송
	// 직원 생일에 맞춘 축하 메세지 및 상품권 메일 발송
	// 직원 나이에 맞춘 주기적인 상품권 발송
	// 근무일자 대비 무단 결근일 비율에 따른 인사관리
	
	// constructor
		// 롬북 사용됨
​
	// toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("직원명 : ");
		builder.append(employeeName);
		builder.append("\n");
		
		builder.append("직원 나이 : ");
		builder.append(employeeAge);
		builder.append("\n");
		
		builder.append("직원 이메일 : ");
		builder.append(employeeEmail);
		builder.append("\n");
		
		builder.append("직원 연락처 : ");
		builder.append(employeeContact);
		builder.append("\n");
		
		builder.append("직원 ID : ");
		builder.append(employeeID);
		builder.append("\n");
		
		builder.append("직원 주소 : ");
		builder.append(employeeAddress);
		builder.append("\n");
		
		builder.append("직원 주민등록번호 : ");
		builder.append(employeeResidentRegistrationNumber);
		builder.append("\n");
		
		builder.append("직원 성별 : ");
		builder.append(employeeGender);
		builder.append("\n");
		
		builder.append("직원 생일 : ");
		builder.append(employeeBirthday);
		builder.append("\n");
		
		return builder.toString();
	}
​
	// Getter & Setter
		// 롬북 사용됨
}