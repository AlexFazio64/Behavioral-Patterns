package pattern.interpreter;

public class ContainsExpression implements Expression {
	private final Expression exp1;
	private final Expression exp2;
	
	public ContainsExpression(Expression exp1, Expression exp2) {
		this.exp1 = exp1;
		this.exp2 = exp2;
	}
	
	@Override
	public Boolean interpret() {
		String s1 = exp1.interpret().toString();
		String s2 = exp2.interpret().toString();
		return s1.contains(s2);
	}
}
