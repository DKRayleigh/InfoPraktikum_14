// Generated from GOTO.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GOTOLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, VAR=13, INT=14, NEWLINE=15, WS=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'>'", "'GOTO'", "'+'", "'-'", "'*'", "'IF'", "'/'", "'=='", "'<'", "'='", 
		"';'", "'PRINT'", "VAR", "INT", "NEWLINE", "WS"
	};
	public static final String[] ruleNames = {
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "VAR", "INT", "NEWLINE", "WS"
	};


	public GOTOLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GOTO.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 15: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\22W\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\6\17H\n\17\r\17\16\17I\3\20\6\20M\n\20\r\20\16\20N\3\21\6\21R\n\21\r"+
		"\21\16\21S\3\21\3\21\2\22\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1"+
		"\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\2\3"+
		"\2\6\3\2C\\\3\2\62;\4\2\f\f\17\17\3\2\"\"Y\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7*\3\2\2\2\t"+
		",\3\2\2\2\13.\3\2\2\2\r\60\3\2\2\2\17\63\3\2\2\2\21\65\3\2\2\2\238\3\2"+
		"\2\2\25:\3\2\2\2\27<\3\2\2\2\31>\3\2\2\2\33D\3\2\2\2\35G\3\2\2\2\37L\3"+
		"\2\2\2!Q\3\2\2\2#$\7@\2\2$\4\3\2\2\2%&\7I\2\2&\'\7Q\2\2\'(\7V\2\2()\7"+
		"Q\2\2)\6\3\2\2\2*+\7-\2\2+\b\3\2\2\2,-\7/\2\2-\n\3\2\2\2./\7,\2\2/\f\3"+
		"\2\2\2\60\61\7K\2\2\61\62\7H\2\2\62\16\3\2\2\2\63\64\7\61\2\2\64\20\3"+
		"\2\2\2\65\66\7?\2\2\66\67\7?\2\2\67\22\3\2\2\289\7>\2\29\24\3\2\2\2:;"+
		"\7?\2\2;\26\3\2\2\2<=\7=\2\2=\30\3\2\2\2>?\7R\2\2?@\7T\2\2@A\7K\2\2AB"+
		"\7P\2\2BC\7V\2\2C\32\3\2\2\2DE\t\2\2\2E\34\3\2\2\2FH\t\3\2\2GF\3\2\2\2"+
		"HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\36\3\2\2\2KM\t\4\2\2LK\3\2\2\2MN\3\2\2"+
		"\2NL\3\2\2\2NO\3\2\2\2O \3\2\2\2PR\t\5\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2"+
		"\2ST\3\2\2\2TU\3\2\2\2UV\b\21\2\2V\"\3\2\2\2\6\2INS";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}