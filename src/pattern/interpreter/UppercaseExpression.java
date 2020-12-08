package pattern.interpreter;

public class UppercaseExpression implements Expression {
	private final Expression exp;
	
	public UppercaseExpression(Expression exp) {
		this.exp = exp;
	}
	
	@Override
	public String interpret() {
		return exp.interpret().toString().toUpperCase();
	}
}
