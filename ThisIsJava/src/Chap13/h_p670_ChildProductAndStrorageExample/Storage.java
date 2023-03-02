package Chap13.h_p670_ChildProductAndStrorageExample;

public interface Storage<T> {
	public void add(T item, int index);
	public T get(int index);
}
