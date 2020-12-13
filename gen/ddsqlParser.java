// Generated from C:/Users/kigama/IdeaProjects/ddsql/grammar\ddsql.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ddsqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TK_PAR_IZQ=1, TK_PAR_DER=2, TK_PUNTO=3, TK_PUNTOYCOMA=4, INT=5, ID=6, 
		ESP=7;
	public static final int
		RULE_prog = 0, RULE_main_prog = 1, RULE_guardar = 2, RULE_save = 3, RULE_attribute = 4, 
		RULE_more = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "main_prog", "guardar", "save", "attribute", "more"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'.'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TK_PAR_IZQ", "TK_PAR_DER", "TK_PUNTO", "TK_PUNTOYCOMA", "INT", 
			"ID", "ESP"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ddsql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ddsqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public Main_progContext main_prog() {
			return getRuleContext(Main_progContext.class,0);
		}
		public TerminalNode TK_PUNTOYCOMA() { return getToken(ddsqlParser.TK_PUNTOYCOMA, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			main_prog();
			setState(13);
			match(TK_PUNTOYCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_progContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ddsqlParser.ID, 0); }
		public GuardarContext guardar() {
			return getRuleContext(GuardarContext.class,0);
		}
		public SaveContext save() {
			return getRuleContext(SaveContext.class,0);
		}
		public Main_progContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_prog; }
	}

	public final Main_progContext main_prog() throws RecognitionException {
		Main_progContext _localctx = new Main_progContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(15);
				match(ID);
				}
				break;
			case 2:
				{
				setState(16);
				guardar();
				}
				break;
			case 3:
				{
				setState(17);
				save();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GuardarContext extends ParserRuleContext {
		public TerminalNode TK_PUNTO() { return getToken(ddsqlParser.TK_PUNTO, 0); }
		public TerminalNode ID() { return getToken(ddsqlParser.ID, 0); }
		public MoreContext more() {
			return getRuleContext(MoreContext.class,0);
		}
		public GuardarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardar; }
	}

	public final GuardarContext guardar() throws RecognitionException {
		GuardarContext _localctx = new GuardarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_guardar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PUNTO) {
				{
				setState(20);
				match(TK_PUNTO);
				setState(21);
				match(ID);
				setState(22);
				more();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SaveContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ddsqlParser.ID, 0); }
		public MoreContext more() {
			return getRuleContext(MoreContext.class,0);
		}
		public SaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_save; }
	}

	public final SaveContext save() throws RecognitionException {
		SaveContext _localctx = new SaveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_save);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(25);
				attribute();
				setState(26);
				match(ID);
				setState(27);
				more();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ddsqlParser.ID, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MoreContext extends ParserRuleContext {
		public TerminalNode TK_PAR_IZQ() { return getToken(ddsqlParser.TK_PAR_IZQ, 0); }
		public TerminalNode INT() { return getToken(ddsqlParser.INT, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(ddsqlParser.TK_PAR_DER, 0); }
		public MoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_more; }
	}

	public final MoreContext more() throws RecognitionException {
		MoreContext _localctx = new MoreContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_more);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(33);
			match(TK_PAR_IZQ);
			setState(34);
			match(INT);
			setState(35);
			match(TK_PAR_DER);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t(\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\3\3\3\3\5\3\25\n\3"+
		"\3\4\3\4\3\4\5\4\32\n\4\3\5\3\5\3\5\3\5\5\5 \n\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2%\2\16\3\2\2\2\4\24\3\2\2\2\6\31\3\2\2\2"+
		"\b\37\3\2\2\2\n!\3\2\2\2\f#\3\2\2\2\16\17\5\4\3\2\17\20\7\6\2\2\20\3\3"+
		"\2\2\2\21\25\7\b\2\2\22\25\5\6\4\2\23\25\5\b\5\2\24\21\3\2\2\2\24\22\3"+
		"\2\2\2\24\23\3\2\2\2\25\5\3\2\2\2\26\27\7\5\2\2\27\30\7\b\2\2\30\32\5"+
		"\f\7\2\31\26\3\2\2\2\31\32\3\2\2\2\32\7\3\2\2\2\33\34\5\n\6\2\34\35\7"+
		"\b\2\2\35\36\5\f\7\2\36 \3\2\2\2\37\33\3\2\2\2\37 \3\2\2\2 \t\3\2\2\2"+
		"!\"\7\b\2\2\"\13\3\2\2\2#$\7\3\2\2$%\7\7\2\2%&\7\4\2\2&\r\3\2\2\2\5\24"+
		"\31\37";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}