package pattern.iterator;

public class SpecificIterator2 extends GenericIterator {
	
	SpecificIterator2(UnorganizedCollection collection) {
		this.reference = collection;
		this.pointer = -1;
	}
	
	@Override
	public boolean hasMore() {
		for (int i = pointer + 1; i < reference.size(); ++i) {
			if ( reference.get(i) instanceof ElementType2 ) {
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
