package Chap10.g_p439_FileInputStream;

public class FileInputStream implements AutoCloseable{

		// �̰��� �ڹٴ� p439
		
		private String file;
		
		public FileInputStream(String file) {
			this.file = file;
		}
		
		public void read() {
			System.out.println(file + "�� �н��ϴ�");		
		}
		
		@Override
		public void close() throws Exception {
			System.out.println(file + "�� �ݽ��ϴ�.");
		}
}