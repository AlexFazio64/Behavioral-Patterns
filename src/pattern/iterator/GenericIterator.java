package pattern.iterator;

public abstract class GenericIterator {
	protected UnorganizedCollection reference;
	protected int pointer;
	
	public abstract boolean hasMore();
	
	public abstract GenericElement next();
}
