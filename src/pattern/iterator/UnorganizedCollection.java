package pattern.iterator;

import java.util.ArrayList;

public class UnorganizedCollection {
	
	private ArrayList<GenericElement> actualCollection;
	
	public UnorganizedCollection() {
		actualCollection = new ArrayList<>();
	}
	
	public void add(GenericElement elem) {
		actualCollection.add(elem);
	}
	
	public void remove(int i) {
		actualCollection.remove(i);
	}
	
	public GenericElement get(int i) {
		return actualCollection.get(i);
	}
	
	public void reset(){
		actualCollection.forEach(a->a.reset());
	}
	
	public GenericIterator getIteratorType1() {
		return new SpecificIterator1(this);
	}
	
	public GenericIterator getIteratorType2() {
		return new SpecificIterator2(this);
	}
	
	public int size() {
		return actualCollection.size();
	}
}
