// Generated from C:/Users/kigama/IdeaProjects/ddsql/grammar\ddsql.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ddsqlParser}.
 */
public interface ddsqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ddsqlParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ddsqlParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ddsqlParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ddsqlParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ddsqlParser#main_prog}.
	 * @param ctx the parse tree
	 */
	void enterMain_prog(ddsqlParser.Main_progContext ctx);
	/**
	 * Exit a parse tree produced by {@link ddsqlParser#main_prog}.
	 * @param ctx the parse tree
	 */
	void exitMain_prog(ddsqlParser.Main_progContext ctx);
	/**
	 * Enter a parse tree produced by {@link ddsqlParser#guardar}.
	 * @param ctx the parse tree
	 */
	void enterGuardar(ddsqlParser.GuardarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ddsqlParser#guardar}.
	 * @param ctx the parse tree
	 */
	void exitGuardar(ddsqlParser.GuardarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ddsqlParser#save}.
	 * @param ctx the parse tree
	 */
	void enterSave(ddsqlParser.SaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link ddsqlParser#save}.
	 * @param ctx the parse tree
	 */
	void exitSave(ddsqlParser.SaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link ddsqlParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(ddsqlParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ddsqlParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(ddsqlParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ddsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ddsqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ddsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ddsqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ddsqlParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(ddsqlParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ddsqlParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(ddsqlParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ddsqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(ddsqlParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ddsqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(ddsqlParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ddsqlParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(ddsqlParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ddsqlParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(ddsqlParser.NumContext ctx);
}