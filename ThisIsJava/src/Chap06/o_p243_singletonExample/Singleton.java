package Chap06.o_p243_singletonExample;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}

}
