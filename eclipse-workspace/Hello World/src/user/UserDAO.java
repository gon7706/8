package user;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.DatabaseUtil;

public class UserDAO {		//������ db�� �����Ǵ� �� ������ ���� ��ü
	
	public int join(String userID, String userPassword) {
		String SQL = "INSERT INTO USER VALUES (?,?)";
		try {
			Connection conn = DatabaseUtil.getconnection();
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1,userID);
			pstmt.setString(2,userPassword);
			return pstmt.executeUpdate();			//insert ���� ��ȯ  �Ѱ��־��ٸ� 1 ������ �ȵǸ� 0 �׷��� ���� int �� ����
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

}
