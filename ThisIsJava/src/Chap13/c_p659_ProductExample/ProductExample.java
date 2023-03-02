package Chap13.c_p659_ProductExample;

public class ProductExample {

	public static void main(String[] args) {
		// 이것이 자바다 .o659
		Product<Tv, String> product1 = new Product<>(); // tv클래스같은게 없다 예제는 샘플만 보여준거 오류가 당연한거래
		product1.setKind(new Tv());
		product1.setModel("스마트tv");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();

		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		String carModel = product2.getModel();

	}

}

class Tv{}
class Car{}
//책에 없는데 빨간줄 떠서 그냥 만듦 선생님이 만듦