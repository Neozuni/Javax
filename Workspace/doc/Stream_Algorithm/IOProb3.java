import java.io.*;
import java.util.*;
/*
 * score.txt 파일을 읽어서
 * score.txt 파일로 출력하는 이때
 * 총점과 평균이 맨 아래에 이어붙여서 출력이 되도록 로직을 작성...
 */
class IOProb3{
	public static void main(String[] args)throws Exception{
		String fileName = "src/data/score.txt";
		BufferedReader br=new BufferedReader(new FileReader(fileName));
		PrintWriter pw=new PrintWriter(new FileWriter(fileName,true));
		
		System.out.println("Stream..생성....");
		int sum=0;
		double avg=0;
		String line=br.readLine();		
		while(line !=null){
			String[] temp =line.split(":");			
			sum += Integer.parseInt(temp[1]);
			line=br.readLine();
		}		
		
		avg=(double)sum/(double)5;
		pw.println(" ");
		pw.println("합계:"+sum);
		pw.printf("평균: %.2f", avg);
					
		br.close();
		pw.close();

	}
}