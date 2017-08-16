package ex05array;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] test; //다차원 배열 선언
		test = new int[10][4];
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		// -1end
		test[1][0] = 500;
		test[1][1] = 600;
		test[1][2] = 700;
		// -2end
		for (int i=0; i<test.length; i++) {
			for(int j=0; j<test[i].length; j++)
				System.out.println(
						"test["+i+"]["+j+"]="+test[i][j]+"\t");
		}
				System.out.println();

	}

}
