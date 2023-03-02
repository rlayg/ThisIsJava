package Chap13.h_p670_ChildProductAndStrorageExample;

public class ChildProductAndStrorageExample {

	public static void main(String[] args) {
		// 이것이 자바다 p671
		
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("SmartTV");
		product.setCompany("Samsung");
		
		Storage<Tv> storage = new StorageImpl<Tv>(100);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
		
		System.out.println(storage);
		System.out.println(tv);
		

	}

}
