package Chap10.g_p439_FileInputStream;

public class TryWithResource {
	public static void main(String[] args) {
		
	// AutoCloseable 구현클래스
	try(FileInputStream fis = new FileInputStream("file.txt")){
		fis.read();
		throw new Exception(); // 강제적으로 예외 발생시킴
	}catch(Exception e) {
		System.out.println("예외 처리 코드가 실행되었습니다.");
	}
}
}
