package io.self.test;
import java.io.*;
public class IOProb2 {
	public static void main(String[] args) throws Exception {
		String fileName = "src\\data\\data.txt";
		
		System.out.println("<< world �� ����ִ� ���� >>");
		searchWord(fileName, "world");
		System.out.println("<< you �� ����ִ� ���� >>");
		searchWord(fileName, "you");
	}

	private static void searchWord(String fileName, String searchKeyword) throws Exception{
		//�����ϼ���...
		LineNumberReader lnr= 
				new LineNumberReader(new FileReader(fileName));
		/*String line = null;
		while((line = lnr.readLine())!=null ){
			if(line.contains(searchKeyword)){
				System.out.println(lnr.getLineNumber()+"-Line  " + line);				
			}
		}
		lnr.close();*/
		
		String line = lnr.readLine();
		while(line !=null){
			if(line.contains(searchKeyword)){
				System.out.println
				(lnr.getLineNumber()+"-Line  " + line);				
			}
			line = lnr.readLine();
		}
	}
}












