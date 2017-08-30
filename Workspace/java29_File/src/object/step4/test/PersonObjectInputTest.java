package object.step4.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import object.step4.Person;

public class PersonObjectInputTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String fileName = "/users/zunix/a";
		
		System.out.println("1. stream 생성 ....");
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		System.out.println("2. readObject() call  ....");
		Person returnP = (Person)ois.readObject();
		
		System.out.println("3. Person 의 정보를 출력 합니다.   ....");
		System.out.println(returnP);
	}

}
