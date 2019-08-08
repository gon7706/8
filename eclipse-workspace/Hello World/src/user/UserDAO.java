package user;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.DatabaseUtil;

public class UserDAO {		//실제롤 db와 연동되는 곳 데이터 접근 객체
	
	public int join(String userID, String userPassword) {
		String SQL = "INSERT INTO USER VALUES (?,?)";
		try {
			Connection conn = DatabaseUtil.getconnection();
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1,userID);
			pstmt.setString(2,userPassword);
			return pstmt.executeUpdate();			//insert 값을 반환  한개넣었다면 1 오류로 안되면 0 그래서 위에 int 로 변경
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

}
