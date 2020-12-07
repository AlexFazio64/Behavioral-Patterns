package pattern.iterator;

public class SpecificIterator1 extends GenericIterator {
	
	SpecificIterator1(UnorganizedCollection collection) {
		this.reference = collection;
		this.pointer = -1;
	}
	
	@Override
	public boolean hasMore() {
		for (int i = pointer + 1; i < reference.size(); ++i) {
			if ( reference.get(i) instanceof ElementType1 ) {
				pointer = i;
				return true;
			}
		}
		return false;
	}
	
	@Override
	public GenericElement next() {
		return reference.get(pointer);
	}
}
