package interpreter;

public abstract class Expression {

	public abstract String one();
	public abstract String multiplier();
	
	public void interpret(Contexto context) {
		while(context.input.startsWith(one())) {
			context.output = multiplier();
			context.input = context.input.substring(1);
		}
	}
}
