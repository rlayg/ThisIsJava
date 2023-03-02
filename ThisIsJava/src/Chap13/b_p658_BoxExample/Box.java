package Chap13.b_p658_BoxExample;

public class Box <T>{
	private T t;
	public T get() {return t;}
	public void set(T t) {this.t = t;}

}

class Box2<T>{
	private T t;
//

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}
