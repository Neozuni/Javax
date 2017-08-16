package ex04control;

public class ContinueLabelEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F1: for(int i=0; i<10; i++) {
			F2: for(int j=0; j<3; j++) {
				if(j==1) {
					continue F1;
				}//if
				System.out.println("j= "+j+" x "+"i= "+i+" ");
			}//for2
		System.out.println("");
		}

	}

}
