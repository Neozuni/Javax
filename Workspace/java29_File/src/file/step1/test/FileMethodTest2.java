package file.step1.test;

import java.io.File;


public class FileMethodTest2 {

	public static void main(String[] args) {
		File dir1 = new File("/users/zunix/documents/aa");
		File dir2 = new File("/users/zunix/documents/aaaa");
		System.out.println("디렉토리 생성됨 ?? "+dir1.isDirectory());
		
		dir1.mkdirs();
		dir2.mkdirs();
		System.out.println("디렉토리 생성됨 ?? "+dir1.isDirectory());
		String fp= dir1.getParentFile();
		System.out.println(fp);
		
		System.out.println(dir1.getParentFile().getParentFile()); //상위 디렉토리를 보여줌
		
		File[] files = fp.listFiles();
		for(File f : files)
			if(f.isFile())
				System.out.println(f.getName());
			else
				System.out.println(f.getPath());
	}

}
