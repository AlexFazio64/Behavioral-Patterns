package pattern.template;

public class WoodBuilder extends AbstractBuilder {
	public WoodBuilder(String raw_description, String name) {
		super(raw_description, name);
	}
	
	@Override
	protected void step1(String token) {
		product = product.replace(token, "a wood artisan");
	}
	
	@Override
	protected void step2(String token) {
		product = product.replace(token, "cut the wood in various lengths");
	}
	
	@Override
	protected void step3(String token) {
		product = product.replace(token, "use the hammer to fix the different panels");
	}
	
	@Override
	protected void step4(String token) {
		product = product.replace(token, "paint the product with a special coating");
	}
}
