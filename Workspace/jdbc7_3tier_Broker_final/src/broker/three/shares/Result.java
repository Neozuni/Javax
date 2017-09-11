package broker.three.shares;
/*
 * 한 칸짜리 빈깡통
 * ::
 * 나중에 서버쪽에서 반환객체와 상태코드를 여기다가 집어 넣음  
 * 
 */
import java.util.ArrayList;

public class Result extends ArrayList {
	private int status = -1; // 서버에서 받아올상태 값 0 이 되면 안됨  (0 은 정상 , -1비정상 실패 :: 즉 기본이 음수)
	public Result() {
		super(1); // 1칸 생성 
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
 
}
