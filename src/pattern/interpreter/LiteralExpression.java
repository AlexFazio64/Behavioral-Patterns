package pattern.interpreter;

public class LiteralExpression implements Expression {
	private final String exp;
	
	public LiteralExpression(String exp) {
		this.exp = exp;
	}
	
	@Override
	public String interpret() {
		return exp;
	}
}
