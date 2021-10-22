// Generated from C:/Users/Ð¡Ê÷Ãç/Desktop/java¿Î/ÍøÂç/bianyi01/src\lab1.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lab1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ZHU1=1, ZHU2=2, LPAR=3, RPAR=4, LBRACE=5, RBRACE=6, FuncType_int=7, Ident_main=8, 
		RETURN=9, Semicolon=10, Decimal_const=11, Octal_const=12, Hexadecimal_const=13, 
		SPACE=14, WHITE_SPACE=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ZHU1", "ZHU2", "LPAR", "RPAR", "LBRACE", "RBRACE", "FuncType_int", "Ident_main", 
			"RETURN", "Semicolon", "Decimal_const", "Octal_const", "Hexadecimal_const", 
			"SPACE", "WHITE_SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'('", "')'", "'{'", "'}'", "'int'", "'main'", "'return'", 
			"';'", null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ZHU1", "ZHU2", "LPAR", "RPAR", "LBRACE", "RBRACE", "FuncType_int", 
			"Ident_main", "RETURN", "Semicolon", "Decimal_const", "Octal_const", 
			"Hexadecimal_const", "SPACE", "WHITE_SPACE"
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


	public lab1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lab1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21z\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\7\2"+
		"&\n\2\f\2\16\2)\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\61\n\3\f\3\16\3\64\13"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\7\f"+
		"W\n\f\f\f\16\fZ\13\f\3\r\3\r\7\r^\n\r\f\r\16\ra\13\r\3\16\3\16\3\16\6"+
		"\16f\n\16\r\16\16\16g\3\16\3\16\3\16\6\16m\n\16\r\16\16\16n\5\16q\n\16"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\13\4\2\f\f\17"+
		"\17\3\2\63;\3\2\62;\3\2\62\62\3\2\629\3\2zz\5\2\62;CHch\3\2ZZ\4\2\13\f"+
		"\17\17\2\u0080\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3"+
		"\2\2\2\5,\3\2\2\2\7:\3\2\2\2\t<\3\2\2\2\13>\3\2\2\2\r@\3\2\2\2\17B\3\2"+
		"\2\2\21F\3\2\2\2\23K\3\2\2\2\25R\3\2\2\2\27T\3\2\2\2\31[\3\2\2\2\33p\3"+
		"\2\2\2\35r\3\2\2\2\37v\3\2\2\2!\"\7\61\2\2\"#\7\61\2\2#\'\3\2\2\2$&\n"+
		"\2\2\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2"+
		"*+\b\2\2\2+\4\3\2\2\2,-\7\61\2\2-.\7,\2\2.\62\3\2\2\2/\61\13\2\2\2\60"+
		"/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62"+
		"\3\2\2\2\65\66\7,\2\2\66\67\7\61\2\2\678\3\2\2\289\b\3\2\29\6\3\2\2\2"+
		":;\7*\2\2;\b\3\2\2\2<=\7+\2\2=\n\3\2\2\2>?\7}\2\2?\f\3\2\2\2@A\7\177\2"+
		"\2A\16\3\2\2\2BC\7k\2\2CD\7p\2\2DE\7v\2\2E\20\3\2\2\2FG\7o\2\2GH\7c\2"+
		"\2HI\7k\2\2IJ\7p\2\2J\22\3\2\2\2KL\7t\2\2LM\7g\2\2MN\7v\2\2NO\7w\2\2O"+
		"P\7t\2\2PQ\7p\2\2Q\24\3\2\2\2RS\7=\2\2S\26\3\2\2\2TX\t\3\2\2UW\t\4\2\2"+
		"VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\30\3\2\2\2ZX\3\2\2\2[_\t\5\2"+
		"\2\\^\t\6\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\32\3\2\2\2a_\3"+
		"\2\2\2bc\t\5\2\2ce\t\7\2\2df\t\b\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3"+
		"\2\2\2hq\3\2\2\2ij\t\5\2\2jl\t\t\2\2km\t\b\2\2lk\3\2\2\2mn\3\2\2\2nl\3"+
		"\2\2\2no\3\2\2\2oq\3\2\2\2pb\3\2\2\2pi\3\2\2\2q\34\3\2\2\2rs\7\"\2\2s"+
		"t\3\2\2\2tu\b\17\2\2u\36\3\2\2\2vw\t\n\2\2wx\3\2\2\2xy\b\20\2\2y \3\2"+
		"\2\2\n\2\'\62X_gnp\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}