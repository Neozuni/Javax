package access.child;
import access.parent.Parent;

class Child extends Parent{
	public void test() {
		//System.out.println(privateTest);
		//System.out.println(dafaultTest);
		System.out.println(protectedTest);
		System.out.println(publicTest);
	}

	@Override
	public void access() {
		super.access();
		System.out.println("상속받는 필드는 :: " +publicTest);
		System.out.println("상속받는 필드는 :: " +protectedTest);
	}
	
}



public class ChildTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c =  new Child();
		c.test();
		c.access();
	}

}
