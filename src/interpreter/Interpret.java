package interpreter;

import java.util.ArrayList;
import java.util.Iterator;

public class Interpret {

	public static void main(String[] args) {

		String romano = "H";
		Contexto contexto = new Contexto(romano);
		ArrayList<Expression> tree = new ArrayList<Expression>();
		
		tree.add(new OnExpression());
		
		Iterator<Expression> it = tree.iterator();
		while(it.hasNext()) {
			Expression exp = it.next();
			exp.interpret(contexto);
		}
		
		System.out.println("sexo seleccionado es: " + contexto.output);
	}
}
