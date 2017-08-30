import java.io.*;
import java.util.*;
/*
 * score.txt ������ �о
 * score.txt ���Ϸ� ����ϴ� �̶�
 * ������ ����� �� �Ʒ��� �̾�ٿ��� ����� �ǵ��� ������ �ۼ�...
 */
class IOProb3{
	public static void main(String[] args)throws Exception{
		String fileName = "src/data/score.txt";
		BufferedReader br=new BufferedReader(new FileReader(fileName));
		PrintWriter pw=new PrintWriter(new FileWriter(fileName,true));
		
		System.out.println("Stream..����....");
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
		pw.println("�հ�:"+sum);
		pw.printf("���: %.2f", avg);
					
		br.close();
		pw.close();

	}
}