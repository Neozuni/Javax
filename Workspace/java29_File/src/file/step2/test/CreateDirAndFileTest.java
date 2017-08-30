package file.step2.test;

import java.io.File;

class FileSelfExam{
	public void createDirAndFile(String path) throws Exception {
		/*
		 * 1.디렉토리 생성
		 * 2. 파일생성
		 * 3. 파일의 이름을 콘솔로 출력
		 */
		File f = new File(path);
		System.out.println("1. 디렉토리 생성 :: "+f.getParentFile().mkdirs());
		System.out.println("2. 파일생성 ::"+f.createNewFile());//true 
		System.out.println("3. 파일이름 출력 :: " +f.getName());
	}
}
public class CreateDirAndFileTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileSelfExam exam = new FileSelfExam();
		exam.createDirAndFile("/users/zunix/"+File.separator+"fileexam"+File.separator+"test.mp3");
		exam.createDirAndFile("/users/zunix/"+File.separator+"fileexam"+File.separator+"note.txt");
		exam.createDirAndFile("/users/zunix/"+File.separator+"fileexam"+File.separator+"greeting.avi");
	}

}
