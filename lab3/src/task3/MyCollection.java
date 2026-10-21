package task3;

import java.util.Iterator;

public interface MyCollection {
	boolean add(Object o);
	boolean remove(Object o);
	int size();
	void clear();
	boolean contains(Object o);
	boolean containsAll(MyCollection o);
	boolean isEmpty();
	Iterator<MyCollection> iterator();
	


}
