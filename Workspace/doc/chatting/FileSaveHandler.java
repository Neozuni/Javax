package file.step3;
import java.awt.FileDialog;
/*
 * save ��ư�� Ŭ���ϸ�
 * �⺻�� ������ ��ȭ������(TextArea�� append�Ǿ��� ��� �����)
 * Ư���� ����� ���Ϸ� �����ϴ� ����
 * ::
 * FileDialog Ŭ������ ����ϸ� ȿ�����̴�.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;

import file.step3.test.ChattingSaveService;

public class FileSaveHandler implements ActionListener {
	public ChattingSaveService service;
	public FileSaveHandler(ChattingSaveService service){
		this.service = service;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		FileDialog fd = new FileDialog(service.f, "��������", FileDialog.SAVE);
		fd.setVisible(true);
		
		/*
		 * 1. fd�� �̿��ؼ� �ش��ο� ���ϸ��� �˾Ƴ���.
		 * 2. fileName�� String���� �����Ҽ� �ִ�.
		 * 3. ��¿� ��Ʈ�� ����
		 * 4. �о���δ�. ta�� �ִ� ������
		 * 5. �Ѹ���...������ ���Ϸ�
		 --> writeFileCreate()�� ���⼭ ȣ������.
		 * 6. ��� ����� �ڿ��� �ݴ´�.
		 */
		
		
	}
	
	public void writeFileCreate(String path)throws IOException{
		
	}
}










