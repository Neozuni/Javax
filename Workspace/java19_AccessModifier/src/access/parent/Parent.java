package access.parent;
/*
 * 접근지정자의 범위를 알아보는 로직을 작성
 * 각각의 필드의  access modifier 를 서로 다르게 주고
 * 어떤 허용범위에서 접근을 허용하는지를 확인
 * 
 * protected 가 왜 필요 한지도 함꼐 고민 .
 */

public class Parent {
	public String publicTest = "publicTest";
	protected String protectedTest = "protectedTest" ;
	String defaultTest = " defaultTest";
	private String privateTest = " privateTest ";
	
	public Parent() {}
	public void access() {
		System.out.println(" access modfier test ...");
	}
}
