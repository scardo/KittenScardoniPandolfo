package absyn;


import types.NumericalType;
import types.Type;
import bytecode.BinOpBytecode;
import bytecode.GT;

/**
 * A node of abstract syntax representing a &gt; comparison binary operation
 * between two expressions.
 *
 * @author <A HREF="mailto:fausto.spoto@univr.it">Fausto Spoto</A>
 */

public class GreaterThan extends NumericalComparisonBinOp {

	/**
	 * Constructs the abstract syntax of a &gt; comparison
	 * binary operation between two expressions.
	 *
	 * @param pos the position in the source file where it starts
	 *            the concrete syntax represented by this abstract syntax
	 * @param left the abstract syntax of the left-hand side expression
	 * @param right the abstract syntax of the right-hand side expression
	 */

	public GreaterThan(int pos, Expression left, Expression right) {
		super(pos, left, right);
	}

	/**
	 * A binary operation-specific bytecode that performs a binary
	 * computation on the left and right sides of this binary operation.
	 * Namely, a {@code gt} bytecode.
	 *
	 * @param type the type of the values of the left and right sides of this
	 *             binary expression
	 * @return a {@code gt} bytecode
	 */

	@Override
	protected BinOpBytecode operator(Type type) {
		return new GT((NumericalType) type);
	}

}