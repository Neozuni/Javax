package object.step4.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import object.step4.Person;

/*
 * ============ 직렬화 코드 ===========
 * person 객체의 필드 값을 sink(파일 : person.obj) 쪽으로 날리는 로직을 작성
 * 1.stream 생성
 * ObjectOutputStream | FileOutputStream
 * 
 *  2. 뿌린다 ...날린다 ... 출력한다 ...writeObject(person)
 *  3. 자원을 닫는다 .
 *  
 */
public class PersonObjectOutputTest {

	public static void main(String[] args) throws IOException {
		String fileName = "/users/zunix/a";
		File f = new File(fileName);
		
		f.getParentFile().mkdirs();
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		System.out.println("1.Stream 생성 ..." );
		
		Person p = new Person("홍길동", 2, "1234", "여의도");
		
		oos.writeObject(p);
		System.out.println("2. writeObject() calling ...");
		System.out.println("3. person.obj 파일에 person의 정보가 저장되었습니다.");
		System.out.println("4. 정보를 다시 확인해 보려면 역직렬화 해서 출력 해 봄");
		oos.close();
		
	}

}
