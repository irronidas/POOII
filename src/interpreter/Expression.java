package interpreter;

public abstract class Expression {

	public abstract String one();
	public abstract String two();
	public abstract String multiplier();
	public abstract String mujer();
	
//	public void interpret(Contexto context) {
//		while(context.input.startsWith(one())) {
//			context.output = multiplier();
//			context.input = context.input.substring(1);
//		}
	public void interpret(Contexto context) {
		if (context.input.startsWith(one())) {
			context.output = multiplier();
			context.input = context.input.substring(1);
		}while	
			(context.input.startsWith(two())) {
			context.output = mujer();
			context.input = context.input.substring(1);	
		}		
	}
}
