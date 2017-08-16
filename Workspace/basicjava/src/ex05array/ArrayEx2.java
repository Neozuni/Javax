package ex05array;
import java.io.*;
public class ArrayEx2 {

	public static void main(String[] ar)throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		if(ar.length==0) {
			System.out.println("usage: java ArrayEx subject1 subject2 ...");
			//System.exit(0);
			}//if ar.length ==과목수 ar's value=과목명
		
		System.out.println("Input u r name = ");
		String name = br.readLine();
		
		String[] subject = new String[ar.length];
		for(int i=0; i<ar.length; i++) {		//과목명을 다 옮겨 왔다
				subject[i] = ar[i];
		}									// subject = 'ar'; subject.lenght => 과목수...
		
		int jumsu[] = new int[subject.length+1];//마지막 총점의 공간
		for(int i=0; i<jumsu.length-1; i++) {
			System.out.println(subject[i]+"과목점수 = ");
			jumsu[i] = Integer.parseInt(br.readLine());
			jumsu[jumsu.length-1] += jumsu[i]; //누적합
		}//점수for
		
		float avg = jumsu[jumsu.length-1]/(float)subject.length;
		
		avg = (int)((avg+0.005)*100)/100.f;//소수점 3자리에서 반올림
		
		char grade = 0;
		switch((int)avg/10) {
		case 10:
		case 9 : grade = 'a'; break;
		case 8 : grade = 'b'; break;
		case 7 : grade = 'c'; break;
		case 6 : grade = 'd'; break;
		default : grade = 'f'; break;
		}//switch
		
		System.out.println();
		System.out.println("~~~~~~~~ 성적표 ~~~~~~~~");
		System.out.println("이름/t");
		for(int i=0; i<subject.length; i++) {
			System.out.print(subject[i]+"\t");
		}//for
		System.out.println("총점\t 평균\t 학점");
		System.out.print(name + "\t");
		for(int i=0; i<subject.length+1; i++) {
			System.out.print(""+jumsu[i]+ "\t");
		}//for
		System.out.println("" +avg+ "\t" + grade);
		
		
			
				
		
			
		}//main
			
				
		

	}//class


