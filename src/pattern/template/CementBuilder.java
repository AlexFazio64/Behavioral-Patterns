package pattern.template;

public class CementBuilder extends AbstractBuilder {
	public CementBuilder(String raw_description, String name) {
		super(raw_description, name);
	}
	
	@Override
	protected void step1(String token) {
		product = product.replace(token, "a construction worker");
	}
	
	@Override
	protected void step2(String token) {
		product = product.replace(token, "make cement to lay the foundations");
	}
	
	@Override
	protected void step3(String token) {
		product = product.replace(token, "take my spatula and lay the bricks");
	}
	
	@Override
	protected void step4(String token) {
		product = product.replace(token, "refine the edges and finish painting the walls");
	}
}
