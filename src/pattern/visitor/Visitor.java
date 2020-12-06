package pattern.visitor;

public interface Visitor {
	void visitHouse(House h);
	
	void visitLibrary(Library a);
	
	void visitLightHouse(LightHouse l);
}
