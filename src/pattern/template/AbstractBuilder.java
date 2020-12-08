package pattern.template;

public abstract class AbstractBuilder {
	protected String product;
	protected String name;
	
	protected AbstractBuilder(String raw_description, String name) {
		this.name = name;
		product = raw_description;
		build();
	}
	
	private void build() {
		step1("#s1");
		step2("#s2");
		step3("#s3");
		step4("#s4");
		product = product.replace("#s5", name);
	}
	
	public String getFinishedProduct() {
		return product;
	}
	
	protected abstract void step1(String token);
	
	protected abstract void step2(String token);
	
	protected abstract void step3(String token);
	
	protected abstract void step4(String token);
}
