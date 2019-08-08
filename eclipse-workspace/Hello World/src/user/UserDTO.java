package user;

public class UserDTO {

	String userID;
	String userPassword;
	public String getUserID() {			//get현재 기록된 데이터가져옴
		return userID;
	}
	public void setUserID(String userID) {		//set 데이터 기록용
		this.userID = userID;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
}
