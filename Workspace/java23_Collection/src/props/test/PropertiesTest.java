package props.test;

import java.util.Enumeration;
import java.util.Properties;

/*
 * JDK설치
 * JRE환경
 * VM관련 환경변수들이 OS(System)위에 탑재가 된다.
 * 어떤 환경변수들이 탑재가 되는지 전부다 출력
 * ::
 * Collection의 계층구조를 이해하면 어렵지 않게 접근할 수 있다.
 * 자료(데이타)를 저장하는 인터페이스들의 특징
 * 자바는 C와 달리 자료구조론이 없다
 * 대신에 Collection API를 제공한다.
 */
public class PropertiesTest {
	public static void main(String[] args) {
		Properties p=System.getProperties();//calling
		
		Enumeration en=p.propertyNames();//calling
		
		while(en.hasMoreElements()) {
			String key = (String)en.nextElement();
			String value = p.getProperty(key);
			System.out.println(key+"======================"+value);
		}
	}
}












