package file.step1.test;

import java.io.File;

/*
 * IO에서 가장 빈번하게 사용되는 file클래스
 * file 클래스에서 제공하는 기본적인 기능을 살펴보는 로직 
 * ::
 * getname() :: 확장자를 포함한 파일 이름을 리턴 
 * getpath(), getAbsolutePath() :: 경로를 포함한 파일명 
 * String getParent() , File getParentFile() :: 경로를 리턴하는 기능 
 * mkdir() , mkdirs() :: 존재하지 않는 경로를 실질적으로 생성 
 */
public class FileMethodTest1 {

	public static void main(String[] args) {
		//file 을 의미하는 정보는 디렉토리 + 파일명 (확장자를 포함한) 
		File f = new File("/Users/zunix/Documents/GitHub/Javax/Workspace/java29_File/src/file/step1/test/FileMethod.java");
		File file = new File("/Users/zunix/Documents/a.txt");
		//" +File.separator+" os 별로 자동인식 변경 
		String fileName= f.getName(); // 파일의 이름을 알려묜 ....getname 
		System.out.println("f.getName" +fileName);
		
		//FileMethodTest1 
		// . 의 위치를 알아서 substring()을 사용 
		int position = fileName.indexOf('.'); // index 를 알때 indexof 
		
		System.out.println("1.확장자를 제외한 파일명 :: " +fileName.substring(0, position)); //확장자 제외  
		System.out.println("2.확장자만 출력 :: "+ fileName.substring(position+1));
		
		//경로
		System.out.println("경로 getAbsolutePath() ::  파일의 정대경로를 리턴" +f.getAbsolutePath()); // 절대경로 
		System.out.println("경로 getPath() :: 파일을 포함한 경로를 리턴  " +f.getPath());  
		System.out.println("getparent() :: "+f.getParent()); // 파일이 들어있는 폴더 정보 를 리턴  즉 디렉토리만 다루겠다 
		System.out.println("getparentfile() :: "+f.getParentFile()); // 디렉토리를 string 로 return mkdirs() 를 사용하려고 ... 디렉토리를 만들어 내려고 << 이걸 써야함 !!
		
		
		
	}

}
