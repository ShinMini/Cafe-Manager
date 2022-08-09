/**
 * PROJ : 카페 데이터 관리
 * FILE : Clients.java
 * DESC : 고객 정보 
 * 
 * @version 1.0
**/

package model;

public class Clients {
	public static final String getClientName = null;
	private String clientName;
	/** 이름 **/
	private int clientAge;
	/** 나이 **/
	private String clientID;
	/** ID **/
	private String clientPWD;
	/** PW **/
	private String clientAdrres;
	/** 주소 **/
	private String clientBirthday;
	/** 생일 **/
	private String clientGrade;

	/** 고객 등급 **/

	public Clients(String clientName, int clientAge, String clientID,
			String clientPWD, String clientAdrres, String clientBirthday, String clientGrade) {
		super();
		this.clientName = clientName;
		this.clientAge = clientAge;
		this.clientID = clientID;

		this.clientPWD = clientPWD;
		this.clientAdrres = clientAdrres;
		this.clientBirthday = clientBirthday;
		this.clientGrade = clientGrade;
	}

	public Clients() {
	}

	@Override
	public String toString() {
		return "Clients [clientAdrres=" + clientAdrres + ", clientAge=" + clientAge + ", clientBirthday=" + clientBirthday
				+ ", clientID=" + clientID + ", clientName=" + clientName + ", clientPWD="
				+ clientPWD + "]";
	}

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
		this.clientPWD = clientPWD;
	}

	public void setClientsAdrres(String clientAdrres) {
		this.clientAdrres = clientAdrres;
	}

	public void setClientsAge(int clientAge) {
		this.clientAge = clientAge;
	}

	public void setClientsBirthday(String clientBirthday) {
		this.clientBirthday = clientBirthday;
	}

	public void setClientsGrade(String clientGrade) {
		this.clientGrade = clientGrade;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public void setClientAge(int clientAge) {
		this.clientAge = clientAge;
	}

	public void setClientID(String clientID) {
		this.clientID = clientID;
	}

	public void setClientPWD(String clientPWD) {
		this.clientPWD = clientPWD;
	}

	public void setClientAdrres(String clientAdrres) {
		this.clientAdrres = clientAdrres;
	}

	public void setClientBirthday(String clientBirthday) {
		this.clientBirthday = clientBirthday;
	}

	public String getClientGrade() {
		return clientGrade;
	}

	public void setClientGrade(String clientGrade) {
		this.clientGrade = clientGrade;
	}
}