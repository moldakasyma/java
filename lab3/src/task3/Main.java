package task3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

public class Main implements MyCollection{
	Vector<MyCollection>v=new Vector<>();

	@Override
	public boolean add(Object o) {
		// TODO Auto-generated method stub
		return v.add((MyCollection) o);
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		
		return v.remove(o);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return v.size();
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		v.clear();
		
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		if(v.contains(o)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean containsAll(MyCollection o) {
		// TODO Auto-generated method stub
		if(v.containsAll( v)) {
			return true;
			
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return v.isEmpty();
	}

	@Override
	public Iterator<MyCollection> iterator() {
		// TODO Auto-generated method stub
		return v.iterator();
	}
	

	

}
