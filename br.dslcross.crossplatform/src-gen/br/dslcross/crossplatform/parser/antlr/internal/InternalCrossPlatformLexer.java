package br.dslcross.crossplatform.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCrossPlatformLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRINGTEMPLATE=6;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalCrossPlatformLexer() {;} 
    public InternalCrossPlatformLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCrossPlatformLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCrossPlatform.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:11:7: ( 'package' )
            // InternalCrossPlatform.g:11:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:12:7: ( '{' )
            // InternalCrossPlatform.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:13:7: ( '}' )
            // InternalCrossPlatform.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:14:7: ( '.' )
            // InternalCrossPlatform.g:14:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:15:7: ( 'import' )
            // InternalCrossPlatform.g:15:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:16:7: ( '.*' )
            // InternalCrossPlatform.g:16:9: '.*'
            {
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:17:7: ( 'platform' )
            // InternalCrossPlatform.g:17:9: 'platform'
            {
            match("platform"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:18:7: ( ':' )
            // InternalCrossPlatform.g:18:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:19:7: ( 'Java' )
            // InternalCrossPlatform.g:19:9: 'Java'
            {
            match("Java"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:20:7: ( 'Swift' )
            // InternalCrossPlatform.g:20:9: 'Swift'
            {
            match("Swift"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:21:7: ( 'CPlusPlus' )
            // InternalCrossPlatform.g:21:9: 'CPlusPlus'
            {
            match("CPlusPlus"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:22:7: ( 'CSharp' )
            // InternalCrossPlatform.g:22:9: 'CSharp'
            {
            match("CSharp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:23:7: ( 'globalOld' )
            // InternalCrossPlatform.g:23:9: 'globalOld'
            {
            match("globalOld"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:24:7: ( '<' )
            // InternalCrossPlatform.g:24:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:25:7: ( ',' )
            // InternalCrossPlatform.g:25:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:26:7: ( '>' )
            // InternalCrossPlatform.g:26:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:27:7: ( '(' )
            // InternalCrossPlatform.g:27:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:28:7: ( ')' )
            // InternalCrossPlatform.g:28:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:29:7: ( '[' )
            // InternalCrossPlatform.g:29:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:30:7: ( ']' )
            // InternalCrossPlatform.g:30:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:31:7: ( 'globalDetails' )
            // InternalCrossPlatform.g:31:9: 'globalDetails'
            {
            match("globalDetails"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:32:7: ( 'global' )
            // InternalCrossPlatform.g:32:9: 'global'
            {
            match("global"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:33:7: ( 'deploy' )
            // InternalCrossPlatform.g:33:9: 'deploy'
            {
            match("deploy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:34:7: ( 'Input' )
            // InternalCrossPlatform.g:34:9: 'Input'
            {
            match("Input"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:35:7: ( 'Output' )
            // InternalCrossPlatform.g:35:9: 'Output'
            {
            match("Output"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:36:7: ( 'InOut' )
            // InternalCrossPlatform.g:36:9: 'InOut'
            {
            match("InOut"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:37:7: ( 'datatype' )
            // InternalCrossPlatform.g:37:9: 'datatype'
            {
            match("datatype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:38:7: ( 'class' )
            // InternalCrossPlatform.g:38:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:39:7: ( 'extends' )
            // InternalCrossPlatform.g:39:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:40:7: ( 'usesGlobalOld' )
            // InternalCrossPlatform.g:40:9: 'usesGlobalOld'
            {
            match("usesGlobalOld"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:41:7: ( 'usesGlobalDetails' )
            // InternalCrossPlatform.g:41:9: 'usesGlobalDetails'
            {
            match("usesGlobalDetails"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:42:7: ( 'usesGlobal' )
            // InternalCrossPlatform.g:42:9: 'usesGlobal'
            {
            match("usesGlobal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:43:7: ( 'operation' )
            // InternalCrossPlatform.g:43:9: 'operation'
            {
            match("operation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:44:7: ( 'implementsGlobalOld' )
            // InternalCrossPlatform.g:44:9: 'implementsGlobalOld'
            {
            match("implementsGlobalOld"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:45:7: ( 'implementsGlobalDetails' )
            // InternalCrossPlatform.g:45:9: 'implementsGlobalDetails'
            {
            match("implementsGlobalDetails"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:46:7: ( 'implementsGlobal' )
            // InternalCrossPlatform.g:46:9: 'implementsGlobal'
            {
            match("implementsGlobal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:47:7: ( 'many' )
            // InternalCrossPlatform.g:47:9: 'many'
            {
            match("many"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:48:7: ( 'break' )
            // InternalCrossPlatform.g:48:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:49:7: ( 'return' )
            // InternalCrossPlatform.g:49:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:50:7: ( 'continue' )
            // InternalCrossPlatform.g:50:9: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:51:7: ( '++' )
            // InternalCrossPlatform.g:51:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:52:7: ( '--' )
            // InternalCrossPlatform.g:52:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:53:7: ( '+=' )
            // InternalCrossPlatform.g:53:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:54:7: ( '-=' )
            // InternalCrossPlatform.g:54:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:55:7: ( ':=' )
            // InternalCrossPlatform.g:55:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:56:7: ( 'Do{' )
            // InternalCrossPlatform.g:56:9: 'Do{'
            {
            match("Do{"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:57:7: ( '}While' )
            // InternalCrossPlatform.g:57:9: '}While'
            {
            match("}While"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:58:7: ( 'If' )
            // InternalCrossPlatform.g:58:9: 'If'
            {
            match("If"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:59:7: ( 'ElseIf' )
            // InternalCrossPlatform.g:59:9: 'ElseIf'
            {
            match("ElseIf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:60:7: ( 'Else' )
            // InternalCrossPlatform.g:60:9: 'Else'
            {
            match("Else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:61:7: ( '||' )
            // InternalCrossPlatform.g:61:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:62:7: ( '&&' )
            // InternalCrossPlatform.g:62:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:63:7: ( '!' )
            // InternalCrossPlatform.g:63:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:64:7: ( 'true' )
            // InternalCrossPlatform.g:64:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:65:7: ( 'false' )
            // InternalCrossPlatform.g:65:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:66:7: ( '>=' )
            // InternalCrossPlatform.g:66:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:67:7: ( '<=' )
            // InternalCrossPlatform.g:67:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:68:7: ( '==' )
            // InternalCrossPlatform.g:68:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:69:7: ( '<>' )
            // InternalCrossPlatform.g:69:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:70:7: ( 'While' )
            // InternalCrossPlatform.g:70:9: 'While'
            {
            match("While"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:71:7: ( 'For' )
            // InternalCrossPlatform.g:71:9: 'For'
            {
            match("For"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:72:7: ( '=' )
            // InternalCrossPlatform.g:72:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:73:7: ( '+' )
            // InternalCrossPlatform.g:73:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:74:7: ( '-' )
            // InternalCrossPlatform.g:74:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:75:7: ( '*' )
            // InternalCrossPlatform.g:75:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:76:7: ( '/' )
            // InternalCrossPlatform.g:76:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "RULE_STRINGTEMPLATE"
    public final void mRULE_STRINGTEMPLATE() throws RecognitionException {
        try {
            int _type = RULE_STRINGTEMPLATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:6692:21: ( '\\'\\'\\'' ( . )* '\\'\\'\\'' )
            // InternalCrossPlatform.g:6692:23: '\\'\\'\\'' ( . )* '\\'\\'\\''
            {
            match("'''"); 

            // InternalCrossPlatform.g:6692:32: ( . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\'') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='\'') ) {
                        int LA1_3 = input.LA(3);

                        if ( (LA1_3=='\'') ) {
                            alt1=2;
                        }
                        else if ( ((LA1_3>='\u0000' && LA1_3<='&')||(LA1_3>='(' && LA1_3<='\uFFFF')) ) {
                            alt1=1;
                        }


                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='&')||(LA1_1>='(' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='&')||(LA1_0>='(' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCrossPlatform.g:6692:32: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("'''"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRINGTEMPLATE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:6694:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalCrossPlatform.g:6694:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalCrossPlatform.g:6694:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCrossPlatform.g:6694:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalCrossPlatform.g:6694:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCrossPlatform.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:6696:10: ( ( '0' .. '9' )+ )
            // InternalCrossPlatform.g:6696:12: ( '0' .. '9' )+
            {
            // InternalCrossPlatform.g:6696:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCrossPlatform.g:6696:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:6698:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalCrossPlatform.g:6698:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalCrossPlatform.g:6698:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCrossPlatform.g:6698:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCrossPlatform.g:6698:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCrossPlatform.g:6698:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCrossPlatform.g:6698:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalCrossPlatform.g:6698:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalCrossPlatform.g:6698:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalCrossPlatform.g:6698:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCrossPlatform.g:6698:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:6700:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalCrossPlatform.g:6700:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalCrossPlatform.g:6700:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCrossPlatform.g:6700:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:6702:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCrossPlatform.g:6702:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalCrossPlatform.g:6702:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCrossPlatform.g:6702:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalCrossPlatform.g:6702:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCrossPlatform.g:6702:41: ( '\\r' )? '\\n'
                    {
                    // InternalCrossPlatform.g:6702:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalCrossPlatform.g:6702:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:6704:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCrossPlatform.g:6704:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCrossPlatform.g:6704:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCrossPlatform.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCrossPlatform.g:6706:16: ( . )
            // InternalCrossPlatform.g:6706:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalCrossPlatform.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | RULE_STRINGTEMPLATE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=74;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalCrossPlatform.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalCrossPlatform.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalCrossPlatform.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalCrossPlatform.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalCrossPlatform.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalCrossPlatform.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalCrossPlatform.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalCrossPlatform.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalCrossPlatform.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalCrossPlatform.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalCrossPlatform.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalCrossPlatform.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalCrossPlatform.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalCrossPlatform.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalCrossPlatform.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalCrossPlatform.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalCrossPlatform.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalCrossPlatform.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalCrossPlatform.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalCrossPlatform.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalCrossPlatform.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalCrossPlatform.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalCrossPlatform.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalCrossPlatform.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalCrossPlatform.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalCrossPlatform.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalCrossPlatform.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalCrossPlatform.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalCrossPlatform.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalCrossPlatform.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalCrossPlatform.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalCrossPlatform.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalCrossPlatform.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalCrossPlatform.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalCrossPlatform.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalCrossPlatform.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalCrossPlatform.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalCrossPlatform.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalCrossPlatform.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalCrossPlatform.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // InternalCrossPlatform.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // InternalCrossPlatform.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // InternalCrossPlatform.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // InternalCrossPlatform.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // InternalCrossPlatform.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // InternalCrossPlatform.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // InternalCrossPlatform.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // InternalCrossPlatform.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // InternalCrossPlatform.g:1:298: T__60
                {
                mT__60(); 

                }
                break;
            case 50 :
                // InternalCrossPlatform.g:1:304: T__61
                {
                mT__61(); 

                }
                break;
            case 51 :
                // InternalCrossPlatform.g:1:310: T__62
                {
                mT__62(); 

                }
                break;
            case 52 :
                // InternalCrossPlatform.g:1:316: T__63
                {
                mT__63(); 

                }
                break;
            case 53 :
                // InternalCrossPlatform.g:1:322: T__64
                {
                mT__64(); 

                }
                break;
            case 54 :
                // InternalCrossPlatform.g:1:328: T__65
                {
                mT__65(); 

                }
                break;
            case 55 :
                // InternalCrossPlatform.g:1:334: T__66
                {
                mT__66(); 

                }
                break;
            case 56 :
                // InternalCrossPlatform.g:1:340: T__67
                {
                mT__67(); 

                }
                break;
            case 57 :
                // InternalCrossPlatform.g:1:346: T__68
                {
                mT__68(); 

                }
                break;
            case 58 :
                // InternalCrossPlatform.g:1:352: T__69
                {
                mT__69(); 

                }
                break;
            case 59 :
                // InternalCrossPlatform.g:1:358: T__70
                {
                mT__70(); 

                }
                break;
            case 60 :
                // InternalCrossPlatform.g:1:364: T__71
                {
                mT__71(); 

                }
                break;
            case 61 :
                // InternalCrossPlatform.g:1:370: T__72
                {
                mT__72(); 

                }
                break;
            case 62 :
                // InternalCrossPlatform.g:1:376: T__73
                {
                mT__73(); 

                }
                break;
            case 63 :
                // InternalCrossPlatform.g:1:382: T__74
                {
                mT__74(); 

                }
                break;
            case 64 :
                // InternalCrossPlatform.g:1:388: T__75
                {
                mT__75(); 

                }
                break;
            case 65 :
                // InternalCrossPlatform.g:1:394: T__76
                {
                mT__76(); 

                }
                break;
            case 66 :
                // InternalCrossPlatform.g:1:400: T__77
                {
                mT__77(); 

                }
                break;
            case 67 :
                // InternalCrossPlatform.g:1:406: RULE_STRINGTEMPLATE
                {
                mRULE_STRINGTEMPLATE(); 

                }
                break;
            case 68 :
                // InternalCrossPlatform.g:1:426: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 69 :
                // InternalCrossPlatform.g:1:434: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 70 :
                // InternalCrossPlatform.g:1:443: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 71 :
                // InternalCrossPlatform.g:1:455: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 72 :
                // InternalCrossPlatform.g:1:471: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 73 :
                // InternalCrossPlatform.g:1:487: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 74 :
                // InternalCrossPlatform.g:1:495: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\63\1\uffff\1\66\1\70\1\63\1\73\4\63\1\103\1\uffff\1\106\4\uffff\12\63\1\132\1\135\2\63\2\60\1\uffff\2\63\1\146\2\63\1\uffff\1\154\2\60\2\uffff\1\60\2\uffff\2\63\6\uffff\1\63\2\uffff\5\63\12\uffff\3\63\1\175\11\63\6\uffff\2\63\3\uffff\2\63\2\uffff\2\63\4\uffff\1\156\3\uffff\14\63\1\uffff\11\63\1\uffff\4\63\1\u00a8\1\uffff\4\63\1\u00ad\16\63\1\u00bc\2\63\1\u00c0\1\u00c1\2\63\1\uffff\4\63\1\uffff\1\u00c8\5\63\1\u00ce\1\u00cf\1\63\1\u00d1\4\63\1\uffff\1\u00d6\2\63\2\uffff\1\u00d9\1\u00da\2\63\1\u00dd\1\63\1\uffff\1\63\1\u00e0\1\u00e3\1\u00e4\1\63\2\uffff\1\u00e6\1\uffff\4\63\1\uffff\1\u00eb\1\u00ec\2\uffff\1\u00ed\1\63\1\uffff\2\63\1\uffff\2\63\2\uffff\1\63\1\uffff\1\63\1\u00f5\2\63\3\uffff\1\u00f8\4\63\1\u00fd\1\u00fe\1\uffff\2\63\1\uffff\1\63\1\u0102\1\u0103\1\63\2\uffff\1\63\1\u0106\1\63\2\uffff\1\63\1\u010b\1\uffff\4\63\1\uffff\5\63\1\u0115\1\u0116\2\63\2\uffff\3\63\1\u011e\3\63\1\uffff\1\u0122\2\63\1\uffff\1\u0125\1\63\1\uffff\3\63\1\u012a\1\uffff";
    static final String DFA13_eofS =
        "\u012b\uffff";
    static final String DFA13_minS =
        "\1\0\1\141\1\uffff\1\127\1\52\1\155\1\75\1\141\1\167\1\120\1\154\1\75\1\uffff\1\75\4\uffff\1\141\1\146\1\165\1\154\1\170\1\163\1\160\1\141\1\162\1\145\1\53\1\55\1\157\1\154\1\174\1\46\1\uffff\1\162\1\141\1\75\1\150\1\157\1\uffff\1\52\1\0\1\101\2\uffff\1\0\2\uffff\1\143\1\141\6\uffff\1\160\2\uffff\1\166\1\151\1\154\1\150\1\157\12\uffff\1\160\1\164\1\117\1\60\1\164\1\141\1\156\1\164\2\145\1\156\1\145\1\164\6\uffff\1\173\1\163\3\uffff\1\165\1\154\2\uffff\1\151\1\162\4\uffff\1\47\3\uffff\1\153\1\164\1\154\1\141\1\146\1\165\1\141\1\142\1\154\1\141\2\165\1\uffff\1\160\1\163\1\164\1\145\1\163\1\162\1\171\1\141\1\165\1\uffff\2\145\1\163\1\154\1\60\1\uffff\1\141\1\146\1\162\1\145\1\60\1\164\1\163\1\162\1\141\1\157\3\164\1\165\1\163\1\151\1\156\1\107\1\141\1\60\1\153\1\162\2\60\2\145\1\uffff\1\147\1\157\1\164\1\155\1\uffff\1\60\1\120\1\160\1\154\2\171\2\60\1\164\1\60\1\156\1\144\1\154\1\164\1\uffff\1\60\1\156\1\146\2\uffff\2\60\1\145\1\162\1\60\1\145\1\uffff\1\154\3\60\1\160\2\uffff\1\60\1\uffff\1\165\1\163\1\157\1\151\1\uffff\2\60\2\uffff\1\60\1\155\1\uffff\1\156\1\165\1\uffff\1\154\1\145\2\uffff\1\145\1\uffff\1\145\1\60\1\142\1\157\3\uffff\1\60\1\164\1\163\1\144\1\164\2\60\1\uffff\1\141\1\156\1\uffff\1\163\2\60\1\141\2\uffff\1\154\1\60\1\107\2\uffff\1\151\1\60\1\uffff\3\154\1\145\1\uffff\1\157\1\163\1\144\1\164\1\142\2\60\2\141\2\uffff\1\151\2\154\1\60\1\163\1\154\1\145\1\uffff\1\60\1\144\1\164\1\uffff\1\60\1\141\1\uffff\1\151\1\154\1\163\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\154\1\uffff\1\127\1\52\1\155\1\75\1\141\1\167\1\123\1\154\1\76\1\uffff\1\75\4\uffff\1\145\1\156\1\165\1\157\1\170\1\163\1\160\1\141\1\162\1\145\2\75\1\157\1\154\1\174\1\46\1\uffff\1\162\1\141\1\75\1\150\1\157\1\uffff\1\57\1\uffff\1\172\2\uffff\1\uffff\2\uffff\1\143\1\141\6\uffff\1\160\2\uffff\1\166\1\151\1\154\1\150\1\157\12\uffff\1\160\1\164\1\160\1\172\1\164\1\141\1\156\1\164\2\145\1\156\1\145\1\164\6\uffff\1\173\1\163\3\uffff\1\165\1\154\2\uffff\1\151\1\162\4\uffff\1\47\3\uffff\1\153\1\164\1\157\1\141\1\146\1\165\1\141\1\142\1\154\1\141\2\165\1\uffff\1\160\1\163\1\164\1\145\1\163\1\162\1\171\1\141\1\165\1\uffff\2\145\1\163\1\154\1\172\1\uffff\1\141\1\146\1\162\1\145\1\172\1\164\1\163\1\162\1\141\1\157\3\164\1\165\1\163\1\151\1\156\1\107\1\141\1\172\1\153\1\162\2\172\2\145\1\uffff\1\147\1\157\1\164\1\155\1\uffff\1\172\1\120\1\160\1\154\2\171\2\172\1\164\1\172\1\156\1\144\1\154\1\164\1\uffff\1\172\1\156\1\146\2\uffff\2\172\1\145\1\162\1\172\1\145\1\uffff\1\154\3\172\1\160\2\uffff\1\172\1\uffff\1\165\1\163\1\157\1\151\1\uffff\2\172\2\uffff\1\172\1\155\1\uffff\1\156\1\165\1\uffff\1\154\1\145\2\uffff\1\145\1\uffff\1\145\1\172\1\142\1\157\3\uffff\1\172\1\164\1\163\1\144\1\164\2\172\1\uffff\1\141\1\156\1\uffff\1\163\2\172\1\141\2\uffff\1\154\1\172\1\107\2\uffff\1\151\1\172\1\uffff\3\154\1\145\1\uffff\1\157\1\163\1\144\1\164\1\142\2\172\2\141\2\uffff\1\151\2\154\1\172\1\163\1\154\1\145\1\uffff\1\172\1\144\1\164\1\uffff\1\172\1\141\1\uffff\1\151\1\154\1\163\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\11\uffff\1\17\1\uffff\1\21\1\22\1\23\1\24\20\uffff\1\65\5\uffff\1\101\3\uffff\1\104\1\105\1\uffff\1\111\1\112\2\uffff\1\104\1\2\1\57\1\3\1\6\1\4\1\uffff\1\55\1\10\5\uffff\1\71\1\73\1\16\1\17\1\70\1\20\1\21\1\22\1\23\1\24\15\uffff\1\51\1\53\1\77\1\52\1\54\1\100\2\uffff\1\63\1\64\1\65\2\uffff\1\72\1\76\2\uffff\1\101\1\107\1\110\1\102\1\uffff\1\106\1\105\1\111\14\uffff\1\60\11\uffff\1\56\5\uffff\1\103\32\uffff\1\75\4\uffff\1\11\16\uffff\1\45\3\uffff\1\62\1\66\6\uffff\1\12\5\uffff\1\30\1\32\1\uffff\1\34\4\uffff\1\46\2\uffff\1\67\1\74\2\uffff\1\5\2\uffff\1\14\2\uffff\1\26\1\27\1\uffff\1\31\4\uffff\1\47\1\61\1\1\7\uffff\1\35\2\uffff\1\7\4\uffff\1\33\1\50\3\uffff\1\13\1\15\2\uffff\1\41\4\uffff\1\40\11\uffff\1\25\1\36\7\uffff\1\44\3\uffff\1\37\2\uffff\1\42\4\uffff\1\43";
    static final String DFA13_specialS =
        "\1\1\51\uffff\1\0\3\uffff\1\2\u00fc\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\60\2\57\2\60\1\57\22\60\1\57\1\42\1\56\3\60\1\41\1\52\1\16\1\17\1\50\1\34\1\14\1\35\1\4\1\51\12\55\1\6\1\60\1\13\1\45\1\15\2\60\2\54\1\11\1\36\1\37\1\47\2\54\1\23\1\7\4\54\1\24\3\54\1\10\3\54\1\46\3\54\1\20\1\60\1\21\1\53\1\54\1\60\1\54\1\32\1\25\1\22\1\26\1\44\1\12\1\54\1\5\3\54\1\31\1\54\1\30\1\1\1\54\1\33\1\54\1\43\1\27\5\54\1\2\1\40\1\3\uff82\60",
            "\1\61\12\uffff\1\62",
            "",
            "\1\65",
            "\1\67",
            "\1\71",
            "\1\72",
            "\1\74",
            "\1\75",
            "\1\76\2\uffff\1\77",
            "\1\100",
            "\1\101\1\102",
            "",
            "\1\105",
            "",
            "",
            "",
            "",
            "\1\114\3\uffff\1\113",
            "\1\116\7\uffff\1\115",
            "\1\117",
            "\1\120\2\uffff\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130\21\uffff\1\131",
            "\1\133\17\uffff\1\134",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\147",
            "\1\150",
            "",
            "\1\152\4\uffff\1\153",
            "\47\156\1\155\uffd8\156",
            "\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\0\156",
            "",
            "",
            "\1\161",
            "\1\162",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\163",
            "",
            "",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\171",
            "\1\172",
            "\1\174\40\uffff\1\173",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0087",
            "\1\u0088",
            "",
            "",
            "",
            "\1\u0089",
            "\1\u008a",
            "",
            "",
            "\1\u008b",
            "\1\u008c",
            "",
            "",
            "",
            "",
            "\1\u008d",
            "",
            "",
            "",
            "\1\u008e",
            "\1\u008f",
            "\1\u0091\2\uffff\1\u0090",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00bd",
            "\1\u00be",
            "\12\63\7\uffff\10\63\1\u00bf\21\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00d0",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00db",
            "\1\u00dc",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00de",
            "",
            "\1\u00df",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\3\63\1\u00e2\12\63\1\u00e1\13\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00e5",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00ee",
            "",
            "\1\u00ef",
            "\1\u00f0",
            "",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "",
            "\1\u00f3",
            "",
            "\1\u00f4",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00f6",
            "\1\u00f7",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00ff",
            "\1\u0100",
            "",
            "\1\u0101",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0104",
            "",
            "",
            "\1\u0105",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0107",
            "",
            "",
            "\1\u0108",
            "\12\63\7\uffff\3\63\1\u010a\12\63\1\u0109\13\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0117",
            "\1\u0118",
            "",
            "",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\12\63\7\uffff\3\63\1\u011d\12\63\1\u011c\13\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0123",
            "\1\u0124",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0126",
            "",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | RULE_STRINGTEMPLATE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_42 = input.LA(1);

                        s = -1;
                        if ( (LA13_42=='\'') ) {s = 109;}

                        else if ( ((LA13_42>='\u0000' && LA13_42<='&')||(LA13_42>='(' && LA13_42<='\uFFFF')) ) {s = 110;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='p') ) {s = 1;}

                        else if ( (LA13_0=='{') ) {s = 2;}

                        else if ( (LA13_0=='}') ) {s = 3;}

                        else if ( (LA13_0=='.') ) {s = 4;}

                        else if ( (LA13_0=='i') ) {s = 5;}

                        else if ( (LA13_0==':') ) {s = 6;}

                        else if ( (LA13_0=='J') ) {s = 7;}

                        else if ( (LA13_0=='S') ) {s = 8;}

                        else if ( (LA13_0=='C') ) {s = 9;}

                        else if ( (LA13_0=='g') ) {s = 10;}

                        else if ( (LA13_0=='<') ) {s = 11;}

                        else if ( (LA13_0==',') ) {s = 12;}

                        else if ( (LA13_0=='>') ) {s = 13;}

                        else if ( (LA13_0=='(') ) {s = 14;}

                        else if ( (LA13_0==')') ) {s = 15;}

                        else if ( (LA13_0=='[') ) {s = 16;}

                        else if ( (LA13_0==']') ) {s = 17;}

                        else if ( (LA13_0=='d') ) {s = 18;}

                        else if ( (LA13_0=='I') ) {s = 19;}

                        else if ( (LA13_0=='O') ) {s = 20;}

                        else if ( (LA13_0=='c') ) {s = 21;}

                        else if ( (LA13_0=='e') ) {s = 22;}

                        else if ( (LA13_0=='u') ) {s = 23;}

                        else if ( (LA13_0=='o') ) {s = 24;}

                        else if ( (LA13_0=='m') ) {s = 25;}

                        else if ( (LA13_0=='b') ) {s = 26;}

                        else if ( (LA13_0=='r') ) {s = 27;}

                        else if ( (LA13_0=='+') ) {s = 28;}

                        else if ( (LA13_0=='-') ) {s = 29;}

                        else if ( (LA13_0=='D') ) {s = 30;}

                        else if ( (LA13_0=='E') ) {s = 31;}

                        else if ( (LA13_0=='|') ) {s = 32;}

                        else if ( (LA13_0=='&') ) {s = 33;}

                        else if ( (LA13_0=='!') ) {s = 34;}

                        else if ( (LA13_0=='t') ) {s = 35;}

                        else if ( (LA13_0=='f') ) {s = 36;}

                        else if ( (LA13_0=='=') ) {s = 37;}

                        else if ( (LA13_0=='W') ) {s = 38;}

                        else if ( (LA13_0=='F') ) {s = 39;}

                        else if ( (LA13_0=='*') ) {s = 40;}

                        else if ( (LA13_0=='/') ) {s = 41;}

                        else if ( (LA13_0=='\'') ) {s = 42;}

                        else if ( (LA13_0=='^') ) {s = 43;}

                        else if ( ((LA13_0>='A' && LA13_0<='B')||(LA13_0>='G' && LA13_0<='H')||(LA13_0>='K' && LA13_0<='N')||(LA13_0>='P' && LA13_0<='R')||(LA13_0>='T' && LA13_0<='V')||(LA13_0>='X' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='a'||LA13_0=='h'||(LA13_0>='j' && LA13_0<='l')||LA13_0=='n'||LA13_0=='q'||LA13_0=='s'||(LA13_0>='v' && LA13_0<='z')) ) {s = 44;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 45;}

                        else if ( (LA13_0=='\"') ) {s = 46;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 47;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='#' && LA13_0<='%')||LA13_0==';'||(LA13_0>='?' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_46 = input.LA(1);

                        s = -1;
                        if ( ((LA13_46>='\u0000' && LA13_46<='\uFFFF')) ) {s = 110;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}