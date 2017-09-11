package broker.three.shares;
/*
 * 한 칸짜리 빈깡통
 * ::
 * 나중에 서버쪽에서 반환객체와 상태코드를 여기다기 집어넣어줄거다
 */
import java.util.ArrayList;

public class Result extends ArrayList{
	private int status = -1; //0은 정상, 성공 | 음수는 비정상, 실패
	public Result() {
		super(1);
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
