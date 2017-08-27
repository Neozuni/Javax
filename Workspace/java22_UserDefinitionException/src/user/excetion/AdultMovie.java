package user.excetion;
class UnderAgeException extends Exception{
	UnderAgeException(String message){
		super(message);
	}
	UnderAgeException(){
		this("UnderAgeException...");
	}
}
class AdultMovie{
	public void enter(int age) throws UnderAgeException{
		if(age>=19) {
			System.out.println("Ticketing.....OK");
			System.out.println("성인 인증 되었습니다..");
		}else {
			throw new UnderAgeException("나이 더 먹고 오삼..");
		}
	}
}
public class AdultMovieTest2 {
	public static void main(String[] args){
		AdultMovie movie = new AdultMovie();
		System.out.println("영화 관람을 원합니다...\n");	
		try {
			movie.enter(71);	
		}catch(UnderAgeException e) {
			System.out.println(e.getMessage());
		}
	}
}









