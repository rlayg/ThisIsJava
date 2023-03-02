package Chap10.g_p439_FileInputStream;

public class FileInputStream implements AutoCloseable{

		// 이것이 자바다 p439
		
		private String file;
		
		public FileInputStream(String file) {
			this.file = file;
		}
		
		public void read() {
			System.out.println(file + "을 읽습니다");		
		}
		
		@Override
		public void close() throws Exception {
			System.out.println(file + "을 닫습니다.");
		}
}