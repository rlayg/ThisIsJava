package Chap13.c_p659_ProductExample;

public class ProductExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� .o659
		Product<Tv, String> product1 = new Product<>(); // tvŬ���������� ���� ������ ���ø� �����ذ� ������ �翬�Ѱŷ�
		product1.setKind(new Tv());
		product1.setModel("����Ʈtv");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();

		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("����");
		Car car = product2.getKind();
		String carModel = product2.getModel();

	}

}

class Tv{}
class Car{}
//å�� ���µ� ������ ���� �׳� ���� �������� ����