package Chap10.g_p439_FileInputStream;

public class TryWithResource {
	public static void main(String[] args) {
		
	// AutoCloseable ����Ŭ����
	try(FileInputStream fis = new FileInputStream("file.txt")){
		fis.read();
		throw new Exception(); // ���������� ���� �߻���Ŵ
	}catch(Exception e) {
		System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�.");
	}
}
}
