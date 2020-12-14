import java.util.Map;
import java.util.HashMap;

public class Translate extends ddsqlBaseListener {
    //Tabla de simbolos
    Map<String, String>  tablasimbolos = new HashMap<String, String>();

    @Override public void enterProg(ddsqlParser.ProgContext ctx) {

    }

    @Override public void exitProg(ddsqlParser.ProgContext ctx) {
    }

    @Override public void enterMain_prog(ddsqlParser.Main_progContext ctx) {

    }

    @Override public void exitMain_prog(ddsqlParser.Main_progContext ctx) {
    }

    @Override public void enterGuardar(ddsqlParser.GuardarContext ctx) {
    }

    @Override public void exitGuardar(ddsqlParser.GuardarContext ctx) {
    }

    @Override public void enterSave(ddsqlParser.SaveContext ctx) {
    }

    @Override public void exitSave(ddsqlParser.SaveContext ctx) {
    }

    @Override public void enterVar(ddsqlParser.VarContext ctx) {
    }

    @Override public void exitVar(ddsqlParser.VarContext ctx) {
    }

    @Override public void enterExpression(ddsqlParser.ExpressionContext ctx) {
    }

    @Override public void exitExpression(ddsqlParser.ExpressionContext ctx) {
    }

    @Override public void enterAttribute(ddsqlParser.AttributeContext ctx) {
    }

    @Override public void exitAttribute(ddsqlParser.AttributeContext ctx) {
    }

    @Override public void enterFactor(ddsqlParser.FactorContext ctx) {
    }

    @Override public void exitFactor(ddsqlParser.FactorContext ctx) {
    }

    @Override public void enterNum(ddsqlParser.NumContext ctx) {
        //int value = Integer.valueOf(ctx.INT().getText());
        System.out.println("exit");
    }

    @Override public void exitNum(ddsqlParser.NumContext ctx) {

    }


    //@Override public void enterEveryRule(ParserRuleContext ctx) {    }

    //@Override public void exitEveryRule(ParserRuleContext ctx) {    }

    //@Override public void visitTerminal(TerminalNode node) {    }

    //@Override public void visitErrorNode(ErrorNode node) {    }
}