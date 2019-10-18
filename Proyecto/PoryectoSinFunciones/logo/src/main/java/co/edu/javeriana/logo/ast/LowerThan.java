package co.edu.javeriana.logo.ast;


import co.edu.javeriana.interpreter.interpreta.Context;

public class LowerThan implements ASTNode {

	private ASTNode operand1;
	private ASTNode operand2;
	
	
	public LowerThan(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}


	@Override
	public Object execute(Context symbolTable) {
		// TODO Auto-generated method stub
		return (float)operand1.execute(symbolTable)<(float)operand2.execute(symbolTable);
	}

}
