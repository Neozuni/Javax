package jdbc.step2.mvc.test;

import config.OracleInfo;
import jdbc.step2.mvc.dao.MemberDAO;
import jdbc.step2.mvc.vo.Member;

public class MemberDAOTest {

	public static void main(String[] args) throws Exception{
		MemberDAO dao = MemberDAO.getInstance();//이부분이 변경..
		//dao.addMember(new Member("kosta1", "아이유", "1234", "신사동"));
		//dao.removeMember("kosta1");
		//dao.updateMember(new Member("kosta", "아이유", "4321", "여의도"));
		//System.out.println(dao.getAllMember());
	}//main
	
	static {
		try {
			Class.forName(OracleInfo.DRIVER);
			System.out.println("드라이버 로딩 성공...");
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패...");
		}
	}//static
}//class
