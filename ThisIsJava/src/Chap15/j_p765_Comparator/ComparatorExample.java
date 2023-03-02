package Chap15.j_p765_Comparator;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p766
		/*
		  TreeSet<Fruit> = new TreeSet<Fruit>();
		 //Fruit�� Comparable�� �������� �ʾұ� ������ ���� �߻�
		  treeSet.add(new Fruit("����", 3000));
		  treeSet.add(new Fruit("����", 10000));
		  treeSet.add(new Fruit("����", 6000));
		 */
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator()); //�������� ������ ����
		treeSet.add(new Fruit("����", 3000));
		treeSet.add(new Fruit("����", 10000));
		treeSet.add(new Fruit("����", 6000));
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.name + " : " + fruit.price);
		}

	}

}
