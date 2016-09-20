// Generated from Keywords.g4 by ANTLR 4.5.3
    // 将代码块添加到lexer中,而不是paser类哦!!
import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KeywordsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ID=3, CHAR=4, INT=5, WS=6;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "ID", "CHAR", "INT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "ID", "CHAR", "INT", "WS"
	};
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


	// 添加成员的方法和paser类似
	// 注意这里只是创建一个Map表,然后把一些自定义的token类型放在表里面,line31才是设置Token类型的地方
	Map<String,Integer> keywords = new HashMap<String,Integer>() {{
	    put("begin", KeywordsParser.BEGIN);
	    put("end",   KeywordsParser.END);
	    put("if",    KeywordsParser.IF);
	    put("then",  KeywordsParser.THEN);
	    put("while", KeywordsParser.WHILE);
	}};


	public KeywordsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Keywords.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 2:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			CHAR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			        // getText()是Lexer中的方法,所以可以出现在lexer规则的代码中
			        if ( keywords.containsKey(getText()) ) {
			            setType(keywords.get(getText())); // 重新设置token类型
			        }
			        
			break;
		}
	}
	private void CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			setText( String.valueOf(getText().charAt(1)) );
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\b+\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\4\6\4\25\n\4"+
		"\r\4\16\4\26\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\6\6!\n\6\r\6\16\6\"\3\7\6"+
		"\7&\n\7\r\7\16\7\'\3\7\3\7\2\2\b\3\3\5\4\7\5\t\6\13\7\r\b\3\2\5\4\2C\\"+
		"c|\3\2\62;\5\2\13\f\17\17\"\"-\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\17\3\2\2\2\5\21\3\2\2\2\7\24\3\2\2"+
		"\2\t\32\3\2\2\2\13 \3\2\2\2\r%\3\2\2\2\17\20\7?\2\2\20\4\3\2\2\2\21\22"+
		"\7=\2\2\22\6\3\2\2\2\23\25\t\2\2\2\24\23\3\2\2\2\25\26\3\2\2\2\26\24\3"+
		"\2\2\2\26\27\3\2\2\2\27\30\3\2\2\2\30\31\b\4\2\2\31\b\3\2\2\2\32\33\7"+
		")\2\2\33\34\13\2\2\2\34\35\7)\2\2\35\36\b\5\3\2\36\n\3\2\2\2\37!\t\3\2"+
		"\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\f\3\2\2\2$&\t\4\2\2%"+
		"$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2()\3\2\2\2)*\b\7\4\2*\16\3\2"+
		"\2\2\6\2\26\"\'\5\3\4\2\3\5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}