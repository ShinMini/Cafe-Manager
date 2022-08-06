package model;

public class Clients {
	private String clientName;
	private int clientAge;
	private String clientEmail;
	private String clientID;
	private String clientPWD;

	// constructor
	public Clients(String clientName, int clientAge, String clientEmail, String clientID, String clientPWD) {
		super();
		this.clientName = clientName;
		this.clientAge = clientAge;
		this.clientEmail = clientEmail;
		this.clientID = clientID;
		this.clientPWD = clientPWD;
	}

	// toString
	@Override
	public String toString() {
		return "Clients [clientName=" + clientName + ", clientAge=" + clientAge + ", clientEmail=" + clientEmail
				+ ", clientID=" + clientID + ", clientPWD=" + clientPWD + "]";
	}

	// Getter & Setter
	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public int getClientAge() {
		return clientAge;
	}

	public void setClientAge(int clientAge) {
		this.clientAge = clientAge;
	}

	public String getClientEmail() {
		return clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	public String getClientID() {
		return clientID;
	}

	public void setClientID(String clientID) {
		this.clientID = clientID;
	}

	public String getClientPWD() {
		return clientPWD;
	}

	public void setClientPWD(String clientPWD) {
		this.clientPWD = clientPWD;
	}

}
