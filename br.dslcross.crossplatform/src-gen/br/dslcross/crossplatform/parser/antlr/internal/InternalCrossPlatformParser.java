package br.dslcross.crossplatform.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.dslcross.crossplatform.services.CrossPlatformGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCrossPlatformParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRINGTEMPLATE", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'.'", "'import'", "'.*'", "'platform'", "':'", "'Java'", "'Swift'", "'CPlusPlus'", "'CSharp'", "'globalOld'", "'<'", "','", "'>'", "'('", "')'", "'['", "']'", "'globalDetails'", "'global'", "'deploy'", "'Input'", "'Output'", "'InOut'", "'datatype'", "'class'", "'extends'", "'usesGlobalOld'", "'usesGlobalDetails'", "'usesGlobal'", "'operation'", "'implementsGlobalOld'", "'implementsGlobalDetails'", "'implementsGlobal'", "'many'", "'break'", "'return'", "'continue'", "'++'", "'--'", "'+='", "'-='", "':='", "'Do{'", "'}While'", "'If'", "'ElseIf'", "'Else'", "'||'", "'&&'", "'!'", "'true'", "'false'", "'>='", "'<='", "'=='", "'<>'", "'While'", "'For'", "'='", "'+'", "'-'", "'*'", "'/'"
    };
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


        public InternalCrossPlatformParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCrossPlatformParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCrossPlatformParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCrossPlatform.g"; }



     	private CrossPlatformGrammarAccess grammarAccess;

        public InternalCrossPlatformParser(TokenStream input, CrossPlatformGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";
       	}

       	@Override
       	protected CrossPlatformGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainmodel"
    // InternalCrossPlatform.g:64:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // InternalCrossPlatform.g:64:52: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // InternalCrossPlatform.g:65:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
             newCompositeNode(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;

             current =iv_ruleDomainmodel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalCrossPlatform.g:71:1: ruleDomainmodel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:77:2: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // InternalCrossPlatform.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // InternalCrossPlatform.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==16||LA1_0==18||LA1_0==24||(LA1_0>=32 && LA1_0<=34)||(LA1_0>=38 && LA1_0<=39)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCrossPlatform.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // InternalCrossPlatform.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    // InternalCrossPlatform.g:80:4: lv_elements_0_0= ruleAbstractElement
            	    {

            	    				newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsAbstractElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"br.dslcross.crossplatform.CrossPlatform.AbstractElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalCrossPlatform.g:100:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalCrossPlatform.g:100:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalCrossPlatform.g:101:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalCrossPlatform.g:107:1: ruleAbstractElement returns [EObject current=null] : (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDeclaration_0 = null;

        EObject this_Type_1 = null;

        EObject this_Import_2 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:113:2: ( (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport ) )
            // InternalCrossPlatform.g:114:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport )
            {
            // InternalCrossPlatform.g:114:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 18:
            case 24:
            case 32:
            case 33:
            case 34:
            case 38:
            case 39:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCrossPlatform.g:115:3: this_PackageDeclaration_0= rulePackageDeclaration
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PackageDeclaration_0=rulePackageDeclaration();

                    state._fsp--;


                    			current = this_PackageDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCrossPlatform.g:124:3: this_Type_1= ruleType
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_1=ruleType();

                    state._fsp--;


                    			current = this_Type_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCrossPlatform.g:133:3: this_Import_2= ruleImport
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Import_2=ruleImport();

                    state._fsp--;


                    			current = this_Import_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRulePackageDeclaration"
    // InternalCrossPlatform.g:145:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // InternalCrossPlatform.g:145:59: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // InternalCrossPlatform.g:146:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;

             current =iv_rulePackageDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // InternalCrossPlatform.g:152:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:158:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // InternalCrossPlatform.g:159:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // InternalCrossPlatform.g:159:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // InternalCrossPlatform.g:160:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
            		
            // InternalCrossPlatform.g:164:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalCrossPlatform.g:165:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalCrossPlatform.g:165:4: (lv_name_1_0= ruleQualifiedName )
            // InternalCrossPlatform.g:166:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"br.dslcross.crossplatform.CrossPlatform.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCrossPlatform.g:187:3: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12||LA3_0==16||LA3_0==18||LA3_0==24||(LA3_0>=32 && LA3_0<=34)||(LA3_0>=38 && LA3_0<=39)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCrossPlatform.g:188:4: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // InternalCrossPlatform.g:188:4: (lv_elements_3_0= ruleAbstractElement )
            	    // InternalCrossPlatform.g:189:5: lv_elements_3_0= ruleAbstractElement
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_elements_3_0=ruleAbstractElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"br.dslcross.crossplatform.CrossPlatform.AbstractElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalCrossPlatform.g:214:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalCrossPlatform.g:214:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalCrossPlatform.g:215:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalCrossPlatform.g:221:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalCrossPlatform.g:227:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalCrossPlatform.g:228:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalCrossPlatform.g:228:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalCrossPlatform.g:229:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalCrossPlatform.g:236:3: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCrossPlatform.g:237:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleImport"
    // InternalCrossPlatform.g:254:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalCrossPlatform.g:254:47: (iv_ruleImport= ruleImport EOF )
            // InternalCrossPlatform.g:255:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalCrossPlatform.g:261:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:267:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalCrossPlatform.g:268:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalCrossPlatform.g:268:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalCrossPlatform.g:269:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalCrossPlatform.g:273:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalCrossPlatform.g:274:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalCrossPlatform.g:274:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalCrossPlatform.g:275:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"br.dslcross.crossplatform.CrossPlatform.QualifiedNameWithWildcard");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalCrossPlatform.g:296:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalCrossPlatform.g:296:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalCrossPlatform.g:297:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalCrossPlatform.g:303:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:309:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalCrossPlatform.g:310:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalCrossPlatform.g:310:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalCrossPlatform.g:311:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalCrossPlatform.g:321:3: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCrossPlatform.g:322:4: kw= '.*'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleType"
    // InternalCrossPlatform.g:332:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalCrossPlatform.g:332:45: (iv_ruleType= ruleType EOF )
            // InternalCrossPlatform.g:333:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalCrossPlatform.g:339:1: ruleType returns [EObject current=null] : (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity | this_Deploy_2= ruleDeploy | this_PlatformDecl_3= rulePlatformDecl | this_GlobalOld_4= ruleGlobalOld | this_GlobalEntity_5= ruleGlobalEntity | this_Global_6= ruleGlobal ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_Entity_1 = null;

        EObject this_Deploy_2 = null;

        EObject this_PlatformDecl_3 = null;

        EObject this_GlobalOld_4 = null;

        EObject this_GlobalEntity_5 = null;

        EObject this_Global_6 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:345:2: ( (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity | this_Deploy_2= ruleDeploy | this_PlatformDecl_3= rulePlatformDecl | this_GlobalOld_4= ruleGlobalOld | this_GlobalEntity_5= ruleGlobalEntity | this_Global_6= ruleGlobal ) )
            // InternalCrossPlatform.g:346:2: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity | this_Deploy_2= ruleDeploy | this_PlatformDecl_3= rulePlatformDecl | this_GlobalOld_4= ruleGlobalOld | this_GlobalEntity_5= ruleGlobalEntity | this_Global_6= ruleGlobal )
            {
            // InternalCrossPlatform.g:346:2: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity | this_Deploy_2= ruleDeploy | this_PlatformDecl_3= rulePlatformDecl | this_GlobalOld_4= ruleGlobalOld | this_GlobalEntity_5= ruleGlobalEntity | this_Global_6= ruleGlobal )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt6=1;
                }
                break;
            case 39:
                {
                alt6=2;
                }
                break;
            case 34:
                {
                alt6=3;
                }
                break;
            case 18:
                {
                alt6=4;
                }
                break;
            case 24:
                {
                alt6=5;
                }
                break;
            case 32:
                {
                alt6=6;
                }
                break;
            case 33:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalCrossPlatform.g:347:3: this_DataType_0= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_0=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCrossPlatform.g:356:3: this_Entity_1= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_1=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCrossPlatform.g:365:3: this_Deploy_2= ruleDeploy
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getDeployParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Deploy_2=ruleDeploy();

                    state._fsp--;


                    			current = this_Deploy_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCrossPlatform.g:374:3: this_PlatformDecl_3= rulePlatformDecl
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getPlatformDeclParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformDecl_3=rulePlatformDecl();

                    state._fsp--;


                    			current = this_PlatformDecl_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalCrossPlatform.g:383:3: this_GlobalOld_4= ruleGlobalOld
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getGlobalOldParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_GlobalOld_4=ruleGlobalOld();

                    state._fsp--;


                    			current = this_GlobalOld_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalCrossPlatform.g:392:3: this_GlobalEntity_5= ruleGlobalEntity
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getGlobalEntityParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_GlobalEntity_5=ruleGlobalEntity();

                    state._fsp--;


                    			current = this_GlobalEntity_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalCrossPlatform.g:401:3: this_Global_6= ruleGlobal
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getGlobalParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Global_6=ruleGlobal();

                    state._fsp--;


                    			current = this_Global_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRulePlatformDecl"
    // InternalCrossPlatform.g:413:1: entryRulePlatformDecl returns [EObject current=null] : iv_rulePlatformDecl= rulePlatformDecl EOF ;
    public final EObject entryRulePlatformDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformDecl = null;


        try {
            // InternalCrossPlatform.g:413:53: (iv_rulePlatformDecl= rulePlatformDecl EOF )
            // InternalCrossPlatform.g:414:2: iv_rulePlatformDecl= rulePlatformDecl EOF
            {
             newCompositeNode(grammarAccess.getPlatformDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformDecl=rulePlatformDecl();

            state._fsp--;

             current =iv_rulePlatformDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlatformDecl"


    // $ANTLR start "rulePlatformDecl"
    // InternalCrossPlatform.g:420:1: rulePlatformDecl returns [EObject current=null] : (otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_Base_3_1= 'Java' | lv_Base_3_2= 'Swift' | lv_Base_3_3= 'CPlusPlus' | lv_Base_3_4= 'CSharp' ) ) ) otherlv_4= '{' ( (lv_cmdList_5_0= ruleCommandPlat ) )* otherlv_6= '}' ) ;
    public final EObject rulePlatformDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_Base_3_1=null;
        Token lv_Base_3_2=null;
        Token lv_Base_3_3=null;
        Token lv_Base_3_4=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_cmdList_5_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:426:2: ( (otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_Base_3_1= 'Java' | lv_Base_3_2= 'Swift' | lv_Base_3_3= 'CPlusPlus' | lv_Base_3_4= 'CSharp' ) ) ) otherlv_4= '{' ( (lv_cmdList_5_0= ruleCommandPlat ) )* otherlv_6= '}' ) )
            // InternalCrossPlatform.g:427:2: (otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_Base_3_1= 'Java' | lv_Base_3_2= 'Swift' | lv_Base_3_3= 'CPlusPlus' | lv_Base_3_4= 'CSharp' ) ) ) otherlv_4= '{' ( (lv_cmdList_5_0= ruleCommandPlat ) )* otherlv_6= '}' )
            {
            // InternalCrossPlatform.g:427:2: (otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_Base_3_1= 'Java' | lv_Base_3_2= 'Swift' | lv_Base_3_3= 'CPlusPlus' | lv_Base_3_4= 'CSharp' ) ) ) otherlv_4= '{' ( (lv_cmdList_5_0= ruleCommandPlat ) )* otherlv_6= '}' )
            // InternalCrossPlatform.g:428:3: otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_Base_3_1= 'Java' | lv_Base_3_2= 'Swift' | lv_Base_3_3= 'CPlusPlus' | lv_Base_3_4= 'CSharp' ) ) ) otherlv_4= '{' ( (lv_cmdList_5_0= ruleCommandPlat ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformDeclAccess().getPlatformKeyword_0());
            		
            // InternalCrossPlatform.g:432:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCrossPlatform.g:433:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCrossPlatform.g:433:4: (lv_name_1_0= RULE_ID )
            // InternalCrossPlatform.g:434:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformDeclAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getPlatformDeclAccess().getColonKeyword_2());
            		
            // InternalCrossPlatform.g:454:3: ( ( (lv_Base_3_1= 'Java' | lv_Base_3_2= 'Swift' | lv_Base_3_3= 'CPlusPlus' | lv_Base_3_4= 'CSharp' ) ) )
            // InternalCrossPlatform.g:455:4: ( (lv_Base_3_1= 'Java' | lv_Base_3_2= 'Swift' | lv_Base_3_3= 'CPlusPlus' | lv_Base_3_4= 'CSharp' ) )
            {
            // InternalCrossPlatform.g:455:4: ( (lv_Base_3_1= 'Java' | lv_Base_3_2= 'Swift' | lv_Base_3_3= 'CPlusPlus' | lv_Base_3_4= 'CSharp' ) )
            // InternalCrossPlatform.g:456:5: (lv_Base_3_1= 'Java' | lv_Base_3_2= 'Swift' | lv_Base_3_3= 'CPlusPlus' | lv_Base_3_4= 'CSharp' )
            {
            // InternalCrossPlatform.g:456:5: (lv_Base_3_1= 'Java' | lv_Base_3_2= 'Swift' | lv_Base_3_3= 'CPlusPlus' | lv_Base_3_4= 'CSharp' )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 22:
                {
                alt7=3;
                }
                break;
            case 23:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalCrossPlatform.g:457:6: lv_Base_3_1= 'Java'
                    {
                    lv_Base_3_1=(Token)match(input,20,FOLLOW_5); 

                    						newLeafNode(lv_Base_3_1, grammarAccess.getPlatformDeclAccess().getBaseJavaKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformDeclRule());
                    						}
                    						setWithLastConsumed(current, "Base", lv_Base_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalCrossPlatform.g:468:6: lv_Base_3_2= 'Swift'
                    {
                    lv_Base_3_2=(Token)match(input,21,FOLLOW_5); 

                    						newLeafNode(lv_Base_3_2, grammarAccess.getPlatformDeclAccess().getBaseSwiftKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformDeclRule());
                    						}
                    						setWithLastConsumed(current, "Base", lv_Base_3_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalCrossPlatform.g:479:6: lv_Base_3_3= 'CPlusPlus'
                    {
                    lv_Base_3_3=(Token)match(input,22,FOLLOW_5); 

                    						newLeafNode(lv_Base_3_3, grammarAccess.getPlatformDeclAccess().getBaseCPlusPlusKeyword_3_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformDeclRule());
                    						}
                    						setWithLastConsumed(current, "Base", lv_Base_3_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalCrossPlatform.g:490:6: lv_Base_3_4= 'CSharp'
                    {
                    lv_Base_3_4=(Token)match(input,23,FOLLOW_5); 

                    						newLeafNode(lv_Base_3_4, grammarAccess.getPlatformDeclAccess().getBaseCSharpKeyword_3_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformDeclRule());
                    						}
                    						setWithLastConsumed(current, "Base", lv_Base_3_4, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getPlatformDeclAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalCrossPlatform.g:507:3: ( (lv_cmdList_5_0= ruleCommandPlat ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=44 && LA8_0<=48)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCrossPlatform.g:508:4: (lv_cmdList_5_0= ruleCommandPlat )
            	    {
            	    // InternalCrossPlatform.g:508:4: (lv_cmdList_5_0= ruleCommandPlat )
            	    // InternalCrossPlatform.g:509:5: lv_cmdList_5_0= ruleCommandPlat
            	    {

            	    					newCompositeNode(grammarAccess.getPlatformDeclAccess().getCmdListCommandPlatParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_cmdList_5_0=ruleCommandPlat();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPlatformDeclRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cmdList",
            	    						lv_cmdList_5_0,
            	    						"br.dslcross.crossplatform.CrossPlatform.CommandPlat");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPlatformDeclAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlatformDecl"


    // $ANTLR start "entryRuleGlobalOld"
    // InternalCrossPlatform.g:534:1: entryRuleGlobalOld returns [EObject current=null] : iv_ruleGlobalOld= ruleGlobalOld EOF ;
    public final EObject entryRuleGlobalOld() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalOld = null;


        try {
            // InternalCrossPlatform.g:534:50: (iv_ruleGlobalOld= ruleGlobalOld EOF )
            // InternalCrossPlatform.g:535:2: iv_ruleGlobalOld= ruleGlobalOld EOF
            {
             newCompositeNode(grammarAccess.getGlobalOldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalOld=ruleGlobalOld();

            state._fsp--;

             current =iv_ruleGlobalOld; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalOld"


    // $ANTLR start "ruleGlobalOld"
    // InternalCrossPlatform.g:541:1: ruleGlobalOld returns [EObject current=null] : (otherlv_0= 'globalOld' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* )? otherlv_11= ')' otherlv_12= ':' ( (lv_type_13_0= ruleDSLTypeRef ) ) (otherlv_14= '<' ( (lv_genericTypesDecl_15_0= ruleDSLGenericType ) ) otherlv_16= '>' )? ( (lv_col1_17_0= '[' ) )? ( (lv_array_18_0= RULE_INT ) )? ( (lv_col2_19_0= ']' ) )? ) ;
    public final EObject ruleGlobalOld() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token lv_col1_17_0=null;
        Token lv_array_18_0=null;
        Token lv_col2_19_0=null;
        EObject lv_genericTypes_2_0 = null;

        EObject lv_genericTypes_4_0 = null;

        EObject lv_params_8_0 = null;

        EObject lv_params_10_0 = null;

        EObject lv_type_13_0 = null;

        EObject lv_genericTypesDecl_15_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:547:2: ( (otherlv_0= 'globalOld' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* )? otherlv_11= ')' otherlv_12= ':' ( (lv_type_13_0= ruleDSLTypeRef ) ) (otherlv_14= '<' ( (lv_genericTypesDecl_15_0= ruleDSLGenericType ) ) otherlv_16= '>' )? ( (lv_col1_17_0= '[' ) )? ( (lv_array_18_0= RULE_INT ) )? ( (lv_col2_19_0= ']' ) )? ) )
            // InternalCrossPlatform.g:548:2: (otherlv_0= 'globalOld' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* )? otherlv_11= ')' otherlv_12= ':' ( (lv_type_13_0= ruleDSLTypeRef ) ) (otherlv_14= '<' ( (lv_genericTypesDecl_15_0= ruleDSLGenericType ) ) otherlv_16= '>' )? ( (lv_col1_17_0= '[' ) )? ( (lv_array_18_0= RULE_INT ) )? ( (lv_col2_19_0= ']' ) )? )
            {
            // InternalCrossPlatform.g:548:2: (otherlv_0= 'globalOld' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* )? otherlv_11= ')' otherlv_12= ':' ( (lv_type_13_0= ruleDSLTypeRef ) ) (otherlv_14= '<' ( (lv_genericTypesDecl_15_0= ruleDSLGenericType ) ) otherlv_16= '>' )? ( (lv_col1_17_0= '[' ) )? ( (lv_array_18_0= RULE_INT ) )? ( (lv_col2_19_0= ']' ) )? )
            // InternalCrossPlatform.g:549:3: otherlv_0= 'globalOld' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* )? otherlv_11= ')' otherlv_12= ':' ( (lv_type_13_0= ruleDSLTypeRef ) ) (otherlv_14= '<' ( (lv_genericTypesDecl_15_0= ruleDSLGenericType ) ) otherlv_16= '>' )? ( (lv_col1_17_0= '[' ) )? ( (lv_array_18_0= RULE_INT ) )? ( (lv_col2_19_0= ']' ) )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getGlobalOldAccess().getGlobalOldKeyword_0());
            		
            // InternalCrossPlatform.g:553:3: (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCrossPlatform.g:554:4: otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getGlobalOldAccess().getLessThanSignKeyword_1_0());
                    			
                    // InternalCrossPlatform.g:558:4: ( (lv_genericTypes_2_0= ruleDSLGenericType ) )
                    // InternalCrossPlatform.g:559:5: (lv_genericTypes_2_0= ruleDSLGenericType )
                    {
                    // InternalCrossPlatform.g:559:5: (lv_genericTypes_2_0= ruleDSLGenericType )
                    // InternalCrossPlatform.g:560:6: lv_genericTypes_2_0= ruleDSLGenericType
                    {

                    						newCompositeNode(grammarAccess.getGlobalOldAccess().getGenericTypesDSLGenericTypeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_genericTypes_2_0=ruleDSLGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGlobalOldRule());
                    						}
                    						add(
                    							current,
                    							"genericTypes",
                    							lv_genericTypes_2_0,
                    							"br.dslcross.crossplatform.CrossPlatform.DSLGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCrossPlatform.g:577:4: (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==26) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalCrossPlatform.g:578:5: otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getGlobalOldAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalCrossPlatform.g:582:5: ( (lv_genericTypes_4_0= ruleDSLGenericType ) )
                    	    // InternalCrossPlatform.g:583:6: (lv_genericTypes_4_0= ruleDSLGenericType )
                    	    {
                    	    // InternalCrossPlatform.g:583:6: (lv_genericTypes_4_0= ruleDSLGenericType )
                    	    // InternalCrossPlatform.g:584:7: lv_genericTypes_4_0= ruleDSLGenericType
                    	    {

                    	    							newCompositeNode(grammarAccess.getGlobalOldAccess().getGenericTypesDSLGenericTypeParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_genericTypes_4_0=ruleDSLGenericType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGlobalOldRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"genericTypes",
                    	    								lv_genericTypes_4_0,
                    	    								"br.dslcross.crossplatform.CrossPlatform.DSLGenericType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getGlobalOldAccess().getGreaterThanSignKeyword_1_3());
                    			

                    }
                    break;

            }

            // InternalCrossPlatform.g:607:3: ( (lv_name_6_0= RULE_ID ) )
            // InternalCrossPlatform.g:608:4: (lv_name_6_0= RULE_ID )
            {
            // InternalCrossPlatform.g:608:4: (lv_name_6_0= RULE_ID )
            // InternalCrossPlatform.g:609:5: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_6_0, grammarAccess.getGlobalOldAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGlobalOldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_7=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getGlobalOldAccess().getLeftParenthesisKeyword_3());
            		
            // InternalCrossPlatform.g:629:3: ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCrossPlatform.g:630:4: ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )*
                    {
                    // InternalCrossPlatform.g:630:4: ( (lv_params_8_0= ruleParameter ) )
                    // InternalCrossPlatform.g:631:5: (lv_params_8_0= ruleParameter )
                    {
                    // InternalCrossPlatform.g:631:5: (lv_params_8_0= ruleParameter )
                    // InternalCrossPlatform.g:632:6: lv_params_8_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getGlobalOldAccess().getParamsParameterParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_params_8_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGlobalOldRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_8_0,
                    							"br.dslcross.crossplatform.CrossPlatform.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCrossPlatform.g:649:4: (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==26) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalCrossPlatform.g:650:5: otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) )
                    	    {
                    	    otherlv_9=(Token)match(input,26,FOLLOW_4); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getGlobalOldAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalCrossPlatform.g:654:5: ( (lv_params_10_0= ruleParameter ) )
                    	    // InternalCrossPlatform.g:655:6: (lv_params_10_0= ruleParameter )
                    	    {
                    	    // InternalCrossPlatform.g:655:6: (lv_params_10_0= ruleParameter )
                    	    // InternalCrossPlatform.g:656:7: lv_params_10_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getGlobalOldAccess().getParamsParameterParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_params_10_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGlobalOldRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_10_0,
                    	    								"br.dslcross.crossplatform.CrossPlatform.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_11, grammarAccess.getGlobalOldAccess().getRightParenthesisKeyword_5());
            		
            otherlv_12=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_12, grammarAccess.getGlobalOldAccess().getColonKeyword_6());
            		
            // InternalCrossPlatform.g:683:3: ( (lv_type_13_0= ruleDSLTypeRef ) )
            // InternalCrossPlatform.g:684:4: (lv_type_13_0= ruleDSLTypeRef )
            {
            // InternalCrossPlatform.g:684:4: (lv_type_13_0= ruleDSLTypeRef )
            // InternalCrossPlatform.g:685:5: lv_type_13_0= ruleDSLTypeRef
            {

            					newCompositeNode(grammarAccess.getGlobalOldAccess().getTypeDSLTypeRefParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_17);
            lv_type_13_0=ruleDSLTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGlobalOldRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_13_0,
            						"br.dslcross.crossplatform.CrossPlatform.DSLTypeRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCrossPlatform.g:702:3: (otherlv_14= '<' ( (lv_genericTypesDecl_15_0= ruleDSLGenericType ) ) otherlv_16= '>' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCrossPlatform.g:703:4: otherlv_14= '<' ( (lv_genericTypesDecl_15_0= ruleDSLGenericType ) ) otherlv_16= '>'
                    {
                    otherlv_14=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getGlobalOldAccess().getLessThanSignKeyword_8_0());
                    			
                    // InternalCrossPlatform.g:707:4: ( (lv_genericTypesDecl_15_0= ruleDSLGenericType ) )
                    // InternalCrossPlatform.g:708:5: (lv_genericTypesDecl_15_0= ruleDSLGenericType )
                    {
                    // InternalCrossPlatform.g:708:5: (lv_genericTypesDecl_15_0= ruleDSLGenericType )
                    // InternalCrossPlatform.g:709:6: lv_genericTypesDecl_15_0= ruleDSLGenericType
                    {

                    						newCompositeNode(grammarAccess.getGlobalOldAccess().getGenericTypesDeclDSLGenericTypeParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_genericTypesDecl_15_0=ruleDSLGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGlobalOldRule());
                    						}
                    						set(
                    							current,
                    							"genericTypesDecl",
                    							lv_genericTypesDecl_15_0,
                    							"br.dslcross.crossplatform.CrossPlatform.DSLGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,27,FOLLOW_19); 

                    				newLeafNode(otherlv_16, grammarAccess.getGlobalOldAccess().getGreaterThanSignKeyword_8_2());
                    			

                    }
                    break;

            }

            // InternalCrossPlatform.g:731:3: ( (lv_col1_17_0= '[' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCrossPlatform.g:732:4: (lv_col1_17_0= '[' )
                    {
                    // InternalCrossPlatform.g:732:4: (lv_col1_17_0= '[' )
                    // InternalCrossPlatform.g:733:5: lv_col1_17_0= '['
                    {
                    lv_col1_17_0=(Token)match(input,30,FOLLOW_20); 

                    					newLeafNode(lv_col1_17_0, grammarAccess.getGlobalOldAccess().getCol1LeftSquareBracketKeyword_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGlobalOldRule());
                    					}
                    					setWithLastConsumed(current, "col1", lv_col1_17_0, "[");
                    				

                    }


                    }
                    break;

            }

            // InternalCrossPlatform.g:745:3: ( (lv_array_18_0= RULE_INT ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCrossPlatform.g:746:4: (lv_array_18_0= RULE_INT )
                    {
                    // InternalCrossPlatform.g:746:4: (lv_array_18_0= RULE_INT )
                    // InternalCrossPlatform.g:747:5: lv_array_18_0= RULE_INT
                    {
                    lv_array_18_0=(Token)match(input,RULE_INT,FOLLOW_21); 

                    					newLeafNode(lv_array_18_0, grammarAccess.getGlobalOldAccess().getArrayINTTerminalRuleCall_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGlobalOldRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"array",
                    						lv_array_18_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            // InternalCrossPlatform.g:763:3: ( (lv_col2_19_0= ']' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCrossPlatform.g:764:4: (lv_col2_19_0= ']' )
                    {
                    // InternalCrossPlatform.g:764:4: (lv_col2_19_0= ']' )
                    // InternalCrossPlatform.g:765:5: lv_col2_19_0= ']'
                    {
                    lv_col2_19_0=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_col2_19_0, grammarAccess.getGlobalOldAccess().getCol2RightSquareBracketKeyword_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGlobalOldRule());
                    					}
                    					setWithLastConsumed(current, "col2", lv_col2_19_0, "]");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobalOld"


    // $ANTLR start "entryRuleGlobalEntity"
    // InternalCrossPlatform.g:781:1: entryRuleGlobalEntity returns [EObject current=null] : iv_ruleGlobalEntity= ruleGlobalEntity EOF ;
    public final EObject entryRuleGlobalEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalEntity = null;


        try {
            // InternalCrossPlatform.g:781:53: (iv_ruleGlobalEntity= ruleGlobalEntity EOF )
            // InternalCrossPlatform.g:782:2: iv_ruleGlobalEntity= ruleGlobalEntity EOF
            {
             newCompositeNode(grammarAccess.getGlobalEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalEntity=ruleGlobalEntity();

            state._fsp--;

             current =iv_ruleGlobalEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalEntity"


    // $ANTLR start "ruleGlobalEntity"
    // InternalCrossPlatform.g:788:1: ruleGlobalEntity returns [EObject current=null] : (otherlv_0= 'globalDetails' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? ( (lv_name_6_0= RULE_ID ) ) ) ;
    public final EObject ruleGlobalEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        EObject lv_genericTypes_2_0 = null;

        EObject lv_genericTypes_4_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:794:2: ( (otherlv_0= 'globalDetails' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? ( (lv_name_6_0= RULE_ID ) ) ) )
            // InternalCrossPlatform.g:795:2: (otherlv_0= 'globalDetails' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? ( (lv_name_6_0= RULE_ID ) ) )
            {
            // InternalCrossPlatform.g:795:2: (otherlv_0= 'globalDetails' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? ( (lv_name_6_0= RULE_ID ) ) )
            // InternalCrossPlatform.g:796:3: otherlv_0= 'globalDetails' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? ( (lv_name_6_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getGlobalEntityAccess().getGlobalDetailsKeyword_0());
            		
            // InternalCrossPlatform.g:800:3: (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCrossPlatform.g:801:4: otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getGlobalEntityAccess().getLessThanSignKeyword_1_0());
                    			
                    // InternalCrossPlatform.g:805:4: ( (lv_genericTypes_2_0= ruleDSLGenericType ) )
                    // InternalCrossPlatform.g:806:5: (lv_genericTypes_2_0= ruleDSLGenericType )
                    {
                    // InternalCrossPlatform.g:806:5: (lv_genericTypes_2_0= ruleDSLGenericType )
                    // InternalCrossPlatform.g:807:6: lv_genericTypes_2_0= ruleDSLGenericType
                    {

                    						newCompositeNode(grammarAccess.getGlobalEntityAccess().getGenericTypesDSLGenericTypeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_genericTypes_2_0=ruleDSLGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGlobalEntityRule());
                    						}
                    						add(
                    							current,
                    							"genericTypes",
                    							lv_genericTypes_2_0,
                    							"br.dslcross.crossplatform.CrossPlatform.DSLGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCrossPlatform.g:824:4: (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==26) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalCrossPlatform.g:825:5: otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getGlobalEntityAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalCrossPlatform.g:829:5: ( (lv_genericTypes_4_0= ruleDSLGenericType ) )
                    	    // InternalCrossPlatform.g:830:6: (lv_genericTypes_4_0= ruleDSLGenericType )
                    	    {
                    	    // InternalCrossPlatform.g:830:6: (lv_genericTypes_4_0= ruleDSLGenericType )
                    	    // InternalCrossPlatform.g:831:7: lv_genericTypes_4_0= ruleDSLGenericType
                    	    {

                    	    							newCompositeNode(grammarAccess.getGlobalEntityAccess().getGenericTypesDSLGenericTypeParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_genericTypes_4_0=ruleDSLGenericType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGlobalEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"genericTypes",
                    	    								lv_genericTypes_4_0,
                    	    								"br.dslcross.crossplatform.CrossPlatform.DSLGenericType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getGlobalEntityAccess().getGreaterThanSignKeyword_1_3());
                    			

                    }
                    break;

            }

            // InternalCrossPlatform.g:854:3: ( (lv_name_6_0= RULE_ID ) )
            // InternalCrossPlatform.g:855:4: (lv_name_6_0= RULE_ID )
            {
            // InternalCrossPlatform.g:855:4: (lv_name_6_0= RULE_ID )
            // InternalCrossPlatform.g:856:5: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_6_0, grammarAccess.getGlobalEntityAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGlobalEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobalEntity"


    // $ANTLR start "entryRuleGlobal"
    // InternalCrossPlatform.g:876:1: entryRuleGlobal returns [EObject current=null] : iv_ruleGlobal= ruleGlobal EOF ;
    public final EObject entryRuleGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobal = null;


        try {
            // InternalCrossPlatform.g:876:47: (iv_ruleGlobal= ruleGlobal EOF )
            // InternalCrossPlatform.g:877:2: iv_ruleGlobal= ruleGlobal EOF
            {
             newCompositeNode(grammarAccess.getGlobalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobal=ruleGlobal();

            state._fsp--;

             current =iv_ruleGlobal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobal"


    // $ANTLR start "ruleGlobal"
    // InternalCrossPlatform.g:883:1: ruleGlobal returns [EObject current=null] : (otherlv_0= 'global' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* )? otherlv_11= ')' otherlv_12= ':' ( (lv_type_13_0= ruleDSLTypeRef ) ) (otherlv_14= '<' ( (lv_genericTypesDecl_15_0= ruleDSLGenericType ) ) otherlv_16= '>' )? ) ;
    public final EObject ruleGlobal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_genericTypes_2_0 = null;

        EObject lv_genericTypes_4_0 = null;

        EObject lv_params_8_0 = null;

        EObject lv_params_10_0 = null;

        EObject lv_type_13_0 = null;

        EObject lv_genericTypesDecl_15_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:889:2: ( (otherlv_0= 'global' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* )? otherlv_11= ')' otherlv_12= ':' ( (lv_type_13_0= ruleDSLTypeRef ) ) (otherlv_14= '<' ( (lv_genericTypesDecl_15_0= ruleDSLGenericType ) ) otherlv_16= '>' )? ) )
            // InternalCrossPlatform.g:890:2: (otherlv_0= 'global' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* )? otherlv_11= ')' otherlv_12= ':' ( (lv_type_13_0= ruleDSLTypeRef ) ) (otherlv_14= '<' ( (lv_genericTypesDecl_15_0= ruleDSLGenericType ) ) otherlv_16= '>' )? )
            {
            // InternalCrossPlatform.g:890:2: (otherlv_0= 'global' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* )? otherlv_11= ')' otherlv_12= ':' ( (lv_type_13_0= ruleDSLTypeRef ) ) (otherlv_14= '<' ( (lv_genericTypesDecl_15_0= ruleDSLGenericType ) ) otherlv_16= '>' )? )
            // InternalCrossPlatform.g:891:3: otherlv_0= 'global' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* )? otherlv_11= ')' otherlv_12= ':' ( (lv_type_13_0= ruleDSLTypeRef ) ) (otherlv_14= '<' ( (lv_genericTypesDecl_15_0= ruleDSLGenericType ) ) otherlv_16= '>' )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getGlobalAccess().getGlobalKeyword_0());
            		
            // InternalCrossPlatform.g:895:3: (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCrossPlatform.g:896:4: otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getGlobalAccess().getLessThanSignKeyword_1_0());
                    			
                    // InternalCrossPlatform.g:900:4: ( (lv_genericTypes_2_0= ruleDSLGenericType ) )
                    // InternalCrossPlatform.g:901:5: (lv_genericTypes_2_0= ruleDSLGenericType )
                    {
                    // InternalCrossPlatform.g:901:5: (lv_genericTypes_2_0= ruleDSLGenericType )
                    // InternalCrossPlatform.g:902:6: lv_genericTypes_2_0= ruleDSLGenericType
                    {

                    						newCompositeNode(grammarAccess.getGlobalAccess().getGenericTypesDSLGenericTypeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_genericTypes_2_0=ruleDSLGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGlobalRule());
                    						}
                    						add(
                    							current,
                    							"genericTypes",
                    							lv_genericTypes_2_0,
                    							"br.dslcross.crossplatform.CrossPlatform.DSLGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCrossPlatform.g:919:4: (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==26) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalCrossPlatform.g:920:5: otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getGlobalAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalCrossPlatform.g:924:5: ( (lv_genericTypes_4_0= ruleDSLGenericType ) )
                    	    // InternalCrossPlatform.g:925:6: (lv_genericTypes_4_0= ruleDSLGenericType )
                    	    {
                    	    // InternalCrossPlatform.g:925:6: (lv_genericTypes_4_0= ruleDSLGenericType )
                    	    // InternalCrossPlatform.g:926:7: lv_genericTypes_4_0= ruleDSLGenericType
                    	    {

                    	    							newCompositeNode(grammarAccess.getGlobalAccess().getGenericTypesDSLGenericTypeParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_genericTypes_4_0=ruleDSLGenericType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGlobalRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"genericTypes",
                    	    								lv_genericTypes_4_0,
                    	    								"br.dslcross.crossplatform.CrossPlatform.DSLGenericType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getGlobalAccess().getGreaterThanSignKeyword_1_3());
                    			

                    }
                    break;

            }

            // InternalCrossPlatform.g:949:3: ( (lv_name_6_0= RULE_ID ) )
            // InternalCrossPlatform.g:950:4: (lv_name_6_0= RULE_ID )
            {
            // InternalCrossPlatform.g:950:4: (lv_name_6_0= RULE_ID )
            // InternalCrossPlatform.g:951:5: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_6_0, grammarAccess.getGlobalAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGlobalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_7=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getGlobalAccess().getLeftParenthesisKeyword_3());
            		
            // InternalCrossPlatform.g:971:3: ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCrossPlatform.g:972:4: ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )*
                    {
                    // InternalCrossPlatform.g:972:4: ( (lv_params_8_0= ruleParameter ) )
                    // InternalCrossPlatform.g:973:5: (lv_params_8_0= ruleParameter )
                    {
                    // InternalCrossPlatform.g:973:5: (lv_params_8_0= ruleParameter )
                    // InternalCrossPlatform.g:974:6: lv_params_8_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getGlobalAccess().getParamsParameterParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_params_8_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGlobalRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_8_0,
                    							"br.dslcross.crossplatform.CrossPlatform.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCrossPlatform.g:991:4: (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==26) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalCrossPlatform.g:992:5: otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) )
                    	    {
                    	    otherlv_9=(Token)match(input,26,FOLLOW_4); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getGlobalAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalCrossPlatform.g:996:5: ( (lv_params_10_0= ruleParameter ) )
                    	    // InternalCrossPlatform.g:997:6: (lv_params_10_0= ruleParameter )
                    	    {
                    	    // InternalCrossPlatform.g:997:6: (lv_params_10_0= ruleParameter )
                    	    // InternalCrossPlatform.g:998:7: lv_params_10_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getGlobalAccess().getParamsParameterParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_params_10_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGlobalRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_10_0,
                    	    								"br.dslcross.crossplatform.CrossPlatform.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_11, grammarAccess.getGlobalAccess().getRightParenthesisKeyword_5());
            		
            otherlv_12=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_12, grammarAccess.getGlobalAccess().getColonKeyword_6());
            		
            // InternalCrossPlatform.g:1025:3: ( (lv_type_13_0= ruleDSLTypeRef ) )
            // InternalCrossPlatform.g:1026:4: (lv_type_13_0= ruleDSLTypeRef )
            {
            // InternalCrossPlatform.g:1026:4: (lv_type_13_0= ruleDSLTypeRef )
            // InternalCrossPlatform.g:1027:5: lv_type_13_0= ruleDSLTypeRef
            {

            					newCompositeNode(grammarAccess.getGlobalAccess().getTypeDSLTypeRefParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_22);
            lv_type_13_0=ruleDSLTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGlobalRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_13_0,
            						"br.dslcross.crossplatform.CrossPlatform.DSLTypeRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCrossPlatform.g:1044:3: (otherlv_14= '<' ( (lv_genericTypesDecl_15_0= ruleDSLGenericType ) ) otherlv_16= '>' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCrossPlatform.g:1045:4: otherlv_14= '<' ( (lv_genericTypesDecl_15_0= ruleDSLGenericType ) ) otherlv_16= '>'
                    {
                    otherlv_14=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getGlobalAccess().getLessThanSignKeyword_8_0());
                    			
                    // InternalCrossPlatform.g:1049:4: ( (lv_genericTypesDecl_15_0= ruleDSLGenericType ) )
                    // InternalCrossPlatform.g:1050:5: (lv_genericTypesDecl_15_0= ruleDSLGenericType )
                    {
                    // InternalCrossPlatform.g:1050:5: (lv_genericTypesDecl_15_0= ruleDSLGenericType )
                    // InternalCrossPlatform.g:1051:6: lv_genericTypesDecl_15_0= ruleDSLGenericType
                    {

                    						newCompositeNode(grammarAccess.getGlobalAccess().getGenericTypesDeclDSLGenericTypeParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_genericTypesDecl_15_0=ruleDSLGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGlobalRule());
                    						}
                    						set(
                    							current,
                    							"genericTypesDecl",
                    							lv_genericTypesDecl_15_0,
                    							"br.dslcross.crossplatform.CrossPlatform.DSLGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getGlobalAccess().getGreaterThanSignKeyword_8_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobal"


    // $ANTLR start "entryRuleDeploy"
    // InternalCrossPlatform.g:1077:1: entryRuleDeploy returns [EObject current=null] : iv_ruleDeploy= ruleDeploy EOF ;
    public final EObject entryRuleDeploy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeploy = null;


        try {
            // InternalCrossPlatform.g:1077:47: (iv_ruleDeploy= ruleDeploy EOF )
            // InternalCrossPlatform.g:1078:2: iv_ruleDeploy= ruleDeploy EOF
            {
             newCompositeNode(grammarAccess.getDeployRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeploy=ruleDeploy();

            state._fsp--;

             current =iv_ruleDeploy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeploy"


    // $ANTLR start "ruleDeploy"
    // InternalCrossPlatform.g:1084:1: ruleDeploy returns [EObject current=null] : (otherlv_0= 'deploy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entityToDeploy_3_0= rulePlatform ) )* otherlv_4= '}' ) ;
    public final EObject ruleDeploy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_entityToDeploy_3_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:1090:2: ( (otherlv_0= 'deploy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entityToDeploy_3_0= rulePlatform ) )* otherlv_4= '}' ) )
            // InternalCrossPlatform.g:1091:2: (otherlv_0= 'deploy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entityToDeploy_3_0= rulePlatform ) )* otherlv_4= '}' )
            {
            // InternalCrossPlatform.g:1091:2: (otherlv_0= 'deploy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entityToDeploy_3_0= rulePlatform ) )* otherlv_4= '}' )
            // InternalCrossPlatform.g:1092:3: otherlv_0= 'deploy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entityToDeploy_3_0= rulePlatform ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDeployAccess().getDeployKeyword_0());
            		
            // InternalCrossPlatform.g:1096:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCrossPlatform.g:1097:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCrossPlatform.g:1097:4: (lv_name_1_0= RULE_ID )
            // InternalCrossPlatform.g:1098:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDeployAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeployRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getDeployAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCrossPlatform.g:1118:3: ( (lv_entityToDeploy_3_0= rulePlatform ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalCrossPlatform.g:1119:4: (lv_entityToDeploy_3_0= rulePlatform )
            	    {
            	    // InternalCrossPlatform.g:1119:4: (lv_entityToDeploy_3_0= rulePlatform )
            	    // InternalCrossPlatform.g:1120:5: lv_entityToDeploy_3_0= rulePlatform
            	    {

            	    					newCompositeNode(grammarAccess.getDeployAccess().getEntityToDeployPlatformParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_entityToDeploy_3_0=rulePlatform();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDeployRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entityToDeploy",
            	    						lv_entityToDeploy_3_0,
            	    						"br.dslcross.crossplatform.CrossPlatform.Platform");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDeployAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeploy"


    // $ANTLR start "entryRulePlatform"
    // InternalCrossPlatform.g:1145:1: entryRulePlatform returns [EObject current=null] : iv_rulePlatform= rulePlatform EOF ;
    public final EObject entryRulePlatform() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatform = null;


        try {
            // InternalCrossPlatform.g:1145:49: (iv_rulePlatform= rulePlatform EOF )
            // InternalCrossPlatform.g:1146:2: iv_rulePlatform= rulePlatform EOF
            {
             newCompositeNode(grammarAccess.getPlatformRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatform=rulePlatform();

            state._fsp--;

             current =iv_rulePlatform; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlatform"


    // $ANTLR start "rulePlatform"
    // InternalCrossPlatform.g:1152:1: rulePlatform returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ':' ( ( (lv_Communication_4_1= 'Input' | lv_Communication_4_2= 'Output' | lv_Communication_4_3= 'InOut' ) ) ) (otherlv_5= ':' ( (lv_EntityEspecification_6_0= ruleEntityEsp ) ) )? )? ) ;
    public final EObject rulePlatform() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_Communication_4_1=null;
        Token lv_Communication_4_2=null;
        Token lv_Communication_4_3=null;
        Token otherlv_5=null;
        EObject lv_EntityEspecification_6_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:1158:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ':' ( ( (lv_Communication_4_1= 'Input' | lv_Communication_4_2= 'Output' | lv_Communication_4_3= 'InOut' ) ) ) (otherlv_5= ':' ( (lv_EntityEspecification_6_0= ruleEntityEsp ) ) )? )? ) )
            // InternalCrossPlatform.g:1159:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ':' ( ( (lv_Communication_4_1= 'Input' | lv_Communication_4_2= 'Output' | lv_Communication_4_3= 'InOut' ) ) ) (otherlv_5= ':' ( (lv_EntityEspecification_6_0= ruleEntityEsp ) ) )? )? )
            {
            // InternalCrossPlatform.g:1159:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ':' ( ( (lv_Communication_4_1= 'Input' | lv_Communication_4_2= 'Output' | lv_Communication_4_3= 'InOut' ) ) ) (otherlv_5= ':' ( (lv_EntityEspecification_6_0= ruleEntityEsp ) ) )? )? )
            // InternalCrossPlatform.g:1160:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ':' ( ( (lv_Communication_4_1= 'Input' | lv_Communication_4_2= 'Output' | lv_Communication_4_3= 'InOut' ) ) ) (otherlv_5= ':' ( (lv_EntityEspecification_6_0= ruleEntityEsp ) ) )? )?
            {
            // InternalCrossPlatform.g:1160:3: ( (otherlv_0= RULE_ID ) )
            // InternalCrossPlatform.g:1161:4: (otherlv_0= RULE_ID )
            {
            // InternalCrossPlatform.g:1161:4: (otherlv_0= RULE_ID )
            // InternalCrossPlatform.g:1162:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getPlatformAccess().getEntEntityCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPlatformAccess().getColonKeyword_1());
            		
            // InternalCrossPlatform.g:1177:3: ( (otherlv_2= RULE_ID ) )
            // InternalCrossPlatform.g:1178:4: (otherlv_2= RULE_ID )
            {
            // InternalCrossPlatform.g:1178:4: (otherlv_2= RULE_ID )
            // InternalCrossPlatform.g:1179:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_2, grammarAccess.getPlatformAccess().getPlatPlatformDeclCrossReference_2_0());
            				

            }


            }

            // InternalCrossPlatform.g:1190:3: (otherlv_3= ':' ( ( (lv_Communication_4_1= 'Input' | lv_Communication_4_2= 'Output' | lv_Communication_4_3= 'InOut' ) ) ) (otherlv_5= ':' ( (lv_EntityEspecification_6_0= ruleEntityEsp ) ) )? )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==19) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCrossPlatform.g:1191:4: otherlv_3= ':' ( ( (lv_Communication_4_1= 'Input' | lv_Communication_4_2= 'Output' | lv_Communication_4_3= 'InOut' ) ) ) (otherlv_5= ':' ( (lv_EntityEspecification_6_0= ruleEntityEsp ) ) )?
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getPlatformAccess().getColonKeyword_3_0());
                    			
                    // InternalCrossPlatform.g:1195:4: ( ( (lv_Communication_4_1= 'Input' | lv_Communication_4_2= 'Output' | lv_Communication_4_3= 'InOut' ) ) )
                    // InternalCrossPlatform.g:1196:5: ( (lv_Communication_4_1= 'Input' | lv_Communication_4_2= 'Output' | lv_Communication_4_3= 'InOut' ) )
                    {
                    // InternalCrossPlatform.g:1196:5: ( (lv_Communication_4_1= 'Input' | lv_Communication_4_2= 'Output' | lv_Communication_4_3= 'InOut' ) )
                    // InternalCrossPlatform.g:1197:6: (lv_Communication_4_1= 'Input' | lv_Communication_4_2= 'Output' | lv_Communication_4_3= 'InOut' )
                    {
                    // InternalCrossPlatform.g:1197:6: (lv_Communication_4_1= 'Input' | lv_Communication_4_2= 'Output' | lv_Communication_4_3= 'InOut' )
                    int alt25=3;
                    switch ( input.LA(1) ) {
                    case 35:
                        {
                        alt25=1;
                        }
                        break;
                    case 36:
                        {
                        alt25=2;
                        }
                        break;
                    case 37:
                        {
                        alt25=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }

                    switch (alt25) {
                        case 1 :
                            // InternalCrossPlatform.g:1198:7: lv_Communication_4_1= 'Input'
                            {
                            lv_Communication_4_1=(Token)match(input,35,FOLLOW_24); 

                            							newLeafNode(lv_Communication_4_1, grammarAccess.getPlatformAccess().getCommunicationInputKeyword_3_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPlatformRule());
                            							}
                            							setWithLastConsumed(current, "Communication", lv_Communication_4_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalCrossPlatform.g:1209:7: lv_Communication_4_2= 'Output'
                            {
                            lv_Communication_4_2=(Token)match(input,36,FOLLOW_24); 

                            							newLeafNode(lv_Communication_4_2, grammarAccess.getPlatformAccess().getCommunicationOutputKeyword_3_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPlatformRule());
                            							}
                            							setWithLastConsumed(current, "Communication", lv_Communication_4_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalCrossPlatform.g:1220:7: lv_Communication_4_3= 'InOut'
                            {
                            lv_Communication_4_3=(Token)match(input,37,FOLLOW_24); 

                            							newLeafNode(lv_Communication_4_3, grammarAccess.getPlatformAccess().getCommunicationInOutKeyword_3_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPlatformRule());
                            							}
                            							setWithLastConsumed(current, "Communication", lv_Communication_4_3, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalCrossPlatform.g:1233:4: (otherlv_5= ':' ( (lv_EntityEspecification_6_0= ruleEntityEsp ) ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==19) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalCrossPlatform.g:1234:5: otherlv_5= ':' ( (lv_EntityEspecification_6_0= ruleEntityEsp ) )
                            {
                            otherlv_5=(Token)match(input,19,FOLLOW_4); 

                            					newLeafNode(otherlv_5, grammarAccess.getPlatformAccess().getColonKeyword_3_2_0());
                            				
                            // InternalCrossPlatform.g:1238:5: ( (lv_EntityEspecification_6_0= ruleEntityEsp ) )
                            // InternalCrossPlatform.g:1239:6: (lv_EntityEspecification_6_0= ruleEntityEsp )
                            {
                            // InternalCrossPlatform.g:1239:6: (lv_EntityEspecification_6_0= ruleEntityEsp )
                            // InternalCrossPlatform.g:1240:7: lv_EntityEspecification_6_0= ruleEntityEsp
                            {

                            							newCompositeNode(grammarAccess.getPlatformAccess().getEntityEspecificationEntityEspParserRuleCall_3_2_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_EntityEspecification_6_0=ruleEntityEsp();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPlatformRule());
                            							}
                            							set(
                            								current,
                            								"EntityEspecification",
                            								lv_EntityEspecification_6_0,
                            								"br.dslcross.crossplatform.CrossPlatform.EntityEsp");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlatform"


    // $ANTLR start "entryRuleEntityEsp"
    // InternalCrossPlatform.g:1263:1: entryRuleEntityEsp returns [EObject current=null] : iv_ruleEntityEsp= ruleEntityEsp EOF ;
    public final EObject entryRuleEntityEsp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityEsp = null;


        try {
            // InternalCrossPlatform.g:1263:50: (iv_ruleEntityEsp= ruleEntityEsp EOF )
            // InternalCrossPlatform.g:1264:2: iv_ruleEntityEsp= ruleEntityEsp EOF
            {
             newCompositeNode(grammarAccess.getEntityEspRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityEsp=ruleEntityEsp();

            state._fsp--;

             current =iv_ruleEntityEsp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityEsp"


    // $ANTLR start "ruleEntityEsp"
    // InternalCrossPlatform.g:1270:1: ruleEntityEsp returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleEntityEsp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalCrossPlatform.g:1276:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalCrossPlatform.g:1277:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalCrossPlatform.g:1277:2: ( (otherlv_0= RULE_ID ) )
            // InternalCrossPlatform.g:1278:3: (otherlv_0= RULE_ID )
            {
            // InternalCrossPlatform.g:1278:3: (otherlv_0= RULE_ID )
            // InternalCrossPlatform.g:1279:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEntityEspRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getEntityEspAccess().getEspEntEntityCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityEsp"


    // $ANTLR start "entryRuleDataType"
    // InternalCrossPlatform.g:1293:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalCrossPlatform.g:1293:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalCrossPlatform.g:1294:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalCrossPlatform.g:1300:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' )? ( (lv_array_3_0= RULE_INT ) )? (otherlv_4= ']' )? (otherlv_5= '<' ( (lv_genericTypes_6_0= ruleDSLGenericType ) ) (otherlv_7= ',' ( (lv_genericTypes_8_0= ruleDSLGenericType ) ) )* otherlv_9= '>' )? ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_array_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_genericTypes_6_0 = null;

        EObject lv_genericTypes_8_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:1306:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' )? ( (lv_array_3_0= RULE_INT ) )? (otherlv_4= ']' )? (otherlv_5= '<' ( (lv_genericTypes_6_0= ruleDSLGenericType ) ) (otherlv_7= ',' ( (lv_genericTypes_8_0= ruleDSLGenericType ) ) )* otherlv_9= '>' )? ) )
            // InternalCrossPlatform.g:1307:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' )? ( (lv_array_3_0= RULE_INT ) )? (otherlv_4= ']' )? (otherlv_5= '<' ( (lv_genericTypes_6_0= ruleDSLGenericType ) ) (otherlv_7= ',' ( (lv_genericTypes_8_0= ruleDSLGenericType ) ) )* otherlv_9= '>' )? )
            {
            // InternalCrossPlatform.g:1307:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' )? ( (lv_array_3_0= RULE_INT ) )? (otherlv_4= ']' )? (otherlv_5= '<' ( (lv_genericTypes_6_0= ruleDSLGenericType ) ) (otherlv_7= ',' ( (lv_genericTypes_8_0= ruleDSLGenericType ) ) )* otherlv_9= '>' )? )
            // InternalCrossPlatform.g:1308:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' )? ( (lv_array_3_0= RULE_INT ) )? (otherlv_4= ']' )? (otherlv_5= '<' ( (lv_genericTypes_6_0= ruleDSLGenericType ) ) (otherlv_7= ',' ( (lv_genericTypes_8_0= ruleDSLGenericType ) ) )* otherlv_9= '>' )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalCrossPlatform.g:1312:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCrossPlatform.g:1313:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCrossPlatform.g:1313:4: (lv_name_1_0= RULE_ID )
            // InternalCrossPlatform.g:1314:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCrossPlatform.g:1330:3: (otherlv_2= '[' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCrossPlatform.g:1331:4: otherlv_2= '['
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_26); 

                    				newLeafNode(otherlv_2, grammarAccess.getDataTypeAccess().getLeftSquareBracketKeyword_2());
                    			

                    }
                    break;

            }

            // InternalCrossPlatform.g:1336:3: ( (lv_array_3_0= RULE_INT ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCrossPlatform.g:1337:4: (lv_array_3_0= RULE_INT )
                    {
                    // InternalCrossPlatform.g:1337:4: (lv_array_3_0= RULE_INT )
                    // InternalCrossPlatform.g:1338:5: lv_array_3_0= RULE_INT
                    {
                    lv_array_3_0=(Token)match(input,RULE_INT,FOLLOW_27); 

                    					newLeafNode(lv_array_3_0, grammarAccess.getDataTypeAccess().getArrayINTTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDataTypeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"array",
                    						lv_array_3_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            // InternalCrossPlatform.g:1354:3: (otherlv_4= ']' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCrossPlatform.g:1355:4: otherlv_4= ']'
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getDataTypeAccess().getRightSquareBracketKeyword_4());
                    			

                    }
                    break;

            }

            // InternalCrossPlatform.g:1360:3: (otherlv_5= '<' ( (lv_genericTypes_6_0= ruleDSLGenericType ) ) (otherlv_7= ',' ( (lv_genericTypes_8_0= ruleDSLGenericType ) ) )* otherlv_9= '>' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==25) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCrossPlatform.g:1361:4: otherlv_5= '<' ( (lv_genericTypes_6_0= ruleDSLGenericType ) ) (otherlv_7= ',' ( (lv_genericTypes_8_0= ruleDSLGenericType ) ) )* otherlv_9= '>'
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getDataTypeAccess().getLessThanSignKeyword_5_0());
                    			
                    // InternalCrossPlatform.g:1365:4: ( (lv_genericTypes_6_0= ruleDSLGenericType ) )
                    // InternalCrossPlatform.g:1366:5: (lv_genericTypes_6_0= ruleDSLGenericType )
                    {
                    // InternalCrossPlatform.g:1366:5: (lv_genericTypes_6_0= ruleDSLGenericType )
                    // InternalCrossPlatform.g:1367:6: lv_genericTypes_6_0= ruleDSLGenericType
                    {

                    						newCompositeNode(grammarAccess.getDataTypeAccess().getGenericTypesDSLGenericTypeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_genericTypes_6_0=ruleDSLGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataTypeRule());
                    						}
                    						add(
                    							current,
                    							"genericTypes",
                    							lv_genericTypes_6_0,
                    							"br.dslcross.crossplatform.CrossPlatform.DSLGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCrossPlatform.g:1384:4: (otherlv_7= ',' ( (lv_genericTypes_8_0= ruleDSLGenericType ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==26) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalCrossPlatform.g:1385:5: otherlv_7= ',' ( (lv_genericTypes_8_0= ruleDSLGenericType ) )
                    	    {
                    	    otherlv_7=(Token)match(input,26,FOLLOW_4); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getDataTypeAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalCrossPlatform.g:1389:5: ( (lv_genericTypes_8_0= ruleDSLGenericType ) )
                    	    // InternalCrossPlatform.g:1390:6: (lv_genericTypes_8_0= ruleDSLGenericType )
                    	    {
                    	    // InternalCrossPlatform.g:1390:6: (lv_genericTypes_8_0= ruleDSLGenericType )
                    	    // InternalCrossPlatform.g:1391:7: lv_genericTypes_8_0= ruleDSLGenericType
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataTypeAccess().getGenericTypesDSLGenericTypeParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_genericTypes_8_0=ruleDSLGenericType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDataTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"genericTypes",
                    	    								lv_genericTypes_8_0,
                    	    								"br.dslcross.crossplatform.CrossPlatform.DSLGenericType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getDataTypeAccess().getGreaterThanSignKeyword_5_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntity"
    // InternalCrossPlatform.g:1418:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalCrossPlatform.g:1418:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalCrossPlatform.g:1419:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalCrossPlatform.g:1425:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleCommandFeature ) )* otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_features_5_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:1431:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleCommandFeature ) )* otherlv_6= '}' ) )
            // InternalCrossPlatform.g:1432:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleCommandFeature ) )* otherlv_6= '}' )
            {
            // InternalCrossPlatform.g:1432:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleCommandFeature ) )* otherlv_6= '}' )
            // InternalCrossPlatform.g:1433:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleCommandFeature ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getClassKeyword_0());
            		
            // InternalCrossPlatform.g:1437:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCrossPlatform.g:1438:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCrossPlatform.g:1438:4: (lv_name_1_0= RULE_ID )
            // InternalCrossPlatform.g:1439:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCrossPlatform.g:1455:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==40) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCrossPlatform.g:1456:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                    			
                    // InternalCrossPlatform.g:1460:4: ( (otherlv_3= RULE_ID ) )
                    // InternalCrossPlatform.g:1461:5: (otherlv_3= RULE_ID )
                    {
                    // InternalCrossPlatform.g:1461:5: (otherlv_3= RULE_ID )
                    // InternalCrossPlatform.g:1462:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_29); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCrossPlatform.g:1478:3: ( (lv_features_5_0= ruleCommandFeature ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID||LA34_0==RULE_STRINGTEMPLATE||(LA34_0>=41 && LA34_0<=44)||LA34_0==48) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalCrossPlatform.g:1479:4: (lv_features_5_0= ruleCommandFeature )
            	    {
            	    // InternalCrossPlatform.g:1479:4: (lv_features_5_0= ruleCommandFeature )
            	    // InternalCrossPlatform.g:1480:5: lv_features_5_0= ruleCommandFeature
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getFeaturesCommandFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_features_5_0=ruleCommandFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_5_0,
            	    						"br.dslcross.crossplatform.CrossPlatform.CommandFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleCommandFeature"
    // InternalCrossPlatform.g:1505:1: entryRuleCommandFeature returns [EObject current=null] : iv_ruleCommandFeature= ruleCommandFeature EOF ;
    public final EObject entryRuleCommandFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandFeature = null;


        try {
            // InternalCrossPlatform.g:1505:55: (iv_ruleCommandFeature= ruleCommandFeature EOF )
            // InternalCrossPlatform.g:1506:2: iv_ruleCommandFeature= ruleCommandFeature EOF
            {
             newCompositeNode(grammarAccess.getCommandFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandFeature=ruleCommandFeature();

            state._fsp--;

             current =iv_ruleCommandFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommandFeature"


    // $ANTLR start "ruleCommandFeature"
    // InternalCrossPlatform.g:1512:1: ruleCommandFeature returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_OperationGlobCallOld_2= ruleOperationGlobCallOld | this_EntityGlobCall_3= ruleEntityGlobCall | this_OperationGlobCall_4= ruleOperationGlobCall | this_StringTemplateFreeCod_5= ruleStringTemplateFreeCod | this_CallAttributeObject_6= ruleCallAttributeObject ) ;
    public final EObject ruleCommandFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Operation_1 = null;

        EObject this_OperationGlobCallOld_2 = null;

        EObject this_EntityGlobCall_3 = null;

        EObject this_OperationGlobCall_4 = null;

        EObject this_StringTemplateFreeCod_5 = null;

        EObject this_CallAttributeObject_6 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:1518:2: ( (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_OperationGlobCallOld_2= ruleOperationGlobCallOld | this_EntityGlobCall_3= ruleEntityGlobCall | this_OperationGlobCall_4= ruleOperationGlobCall | this_StringTemplateFreeCod_5= ruleStringTemplateFreeCod | this_CallAttributeObject_6= ruleCallAttributeObject ) )
            // InternalCrossPlatform.g:1519:2: (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_OperationGlobCallOld_2= ruleOperationGlobCallOld | this_EntityGlobCall_3= ruleEntityGlobCall | this_OperationGlobCall_4= ruleOperationGlobCall | this_StringTemplateFreeCod_5= ruleStringTemplateFreeCod | this_CallAttributeObject_6= ruleCallAttributeObject )
            {
            // InternalCrossPlatform.g:1519:2: (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_OperationGlobCallOld_2= ruleOperationGlobCallOld | this_EntityGlobCall_3= ruleEntityGlobCall | this_OperationGlobCall_4= ruleOperationGlobCall | this_StringTemplateFreeCod_5= ruleStringTemplateFreeCod | this_CallAttributeObject_6= ruleCallAttributeObject )
            int alt35=7;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt35=1;
                }
                break;
            case RULE_ID:
                {
                int LA35_2 = input.LA(2);

                if ( (LA35_2==RULE_INT||LA35_2==15||(LA35_2>=30 && LA35_2<=31)||LA35_2==56) ) {
                    alt35=7;
                }
                else if ( (LA35_2==19) ) {
                    alt35=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 2, input);

                    throw nvae;
                }
                }
                break;
            case 44:
                {
                alt35=2;
                }
                break;
            case 41:
                {
                alt35=3;
                }
                break;
            case 42:
                {
                alt35=4;
                }
                break;
            case 43:
                {
                alt35=5;
                }
                break;
            case RULE_STRINGTEMPLATE:
                {
                alt35=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalCrossPlatform.g:1520:3: this_Attribute_0= ruleAttribute
                    {

                    			newCompositeNode(grammarAccess.getCommandFeatureAccess().getAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attribute_0=ruleAttribute();

                    state._fsp--;


                    			current = this_Attribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCrossPlatform.g:1529:3: this_Operation_1= ruleOperation
                    {

                    			newCompositeNode(grammarAccess.getCommandFeatureAccess().getOperationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Operation_1=ruleOperation();

                    state._fsp--;


                    			current = this_Operation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCrossPlatform.g:1538:3: this_OperationGlobCallOld_2= ruleOperationGlobCallOld
                    {

                    			newCompositeNode(grammarAccess.getCommandFeatureAccess().getOperationGlobCallOldParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationGlobCallOld_2=ruleOperationGlobCallOld();

                    state._fsp--;


                    			current = this_OperationGlobCallOld_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCrossPlatform.g:1547:3: this_EntityGlobCall_3= ruleEntityGlobCall
                    {

                    			newCompositeNode(grammarAccess.getCommandFeatureAccess().getEntityGlobCallParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityGlobCall_3=ruleEntityGlobCall();

                    state._fsp--;


                    			current = this_EntityGlobCall_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalCrossPlatform.g:1556:3: this_OperationGlobCall_4= ruleOperationGlobCall
                    {

                    			newCompositeNode(grammarAccess.getCommandFeatureAccess().getOperationGlobCallParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationGlobCall_4=ruleOperationGlobCall();

                    state._fsp--;


                    			current = this_OperationGlobCall_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalCrossPlatform.g:1565:3: this_StringTemplateFreeCod_5= ruleStringTemplateFreeCod
                    {

                    			newCompositeNode(grammarAccess.getCommandFeatureAccess().getStringTemplateFreeCodParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringTemplateFreeCod_5=ruleStringTemplateFreeCod();

                    state._fsp--;


                    			current = this_StringTemplateFreeCod_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalCrossPlatform.g:1574:3: this_CallAttributeObject_6= ruleCallAttributeObject
                    {

                    			newCompositeNode(grammarAccess.getCommandFeatureAccess().getCallAttributeObjectParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_CallAttributeObject_6=ruleCallAttributeObject();

                    state._fsp--;


                    			current = this_CallAttributeObject_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandFeature"


    // $ANTLR start "entryRuleCommandPlat"
    // InternalCrossPlatform.g:1586:1: entryRuleCommandPlat returns [EObject current=null] : iv_ruleCommandPlat= ruleCommandPlat EOF ;
    public final EObject entryRuleCommandPlat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandPlat = null;


        try {
            // InternalCrossPlatform.g:1586:52: (iv_ruleCommandPlat= ruleCommandPlat EOF )
            // InternalCrossPlatform.g:1587:2: iv_ruleCommandPlat= ruleCommandPlat EOF
            {
             newCompositeNode(grammarAccess.getCommandPlatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandPlat=ruleCommandPlat();

            state._fsp--;

             current =iv_ruleCommandPlat; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommandPlat"


    // $ANTLR start "ruleCommandPlat"
    // InternalCrossPlatform.g:1593:1: ruleCommandPlat returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_OperationGlobalOld_2= ruleOperationGlobalOld | this_EntityGlobal_3= ruleEntityGlobal | this_OperationGlobal_4= ruleOperationGlobal ) ;
    public final EObject ruleCommandPlat() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Operation_1 = null;

        EObject this_OperationGlobalOld_2 = null;

        EObject this_EntityGlobal_3 = null;

        EObject this_OperationGlobal_4 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:1599:2: ( (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_OperationGlobalOld_2= ruleOperationGlobalOld | this_EntityGlobal_3= ruleEntityGlobal | this_OperationGlobal_4= ruleOperationGlobal ) )
            // InternalCrossPlatform.g:1600:2: (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_OperationGlobalOld_2= ruleOperationGlobalOld | this_EntityGlobal_3= ruleEntityGlobal | this_OperationGlobal_4= ruleOperationGlobal )
            {
            // InternalCrossPlatform.g:1600:2: (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_OperationGlobalOld_2= ruleOperationGlobalOld | this_EntityGlobal_3= ruleEntityGlobal | this_OperationGlobal_4= ruleOperationGlobal )
            int alt36=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 48:
                {
                alt36=1;
                }
                break;
            case 44:
                {
                alt36=2;
                }
                break;
            case 45:
                {
                alt36=3;
                }
                break;
            case 46:
                {
                alt36=4;
                }
                break;
            case 47:
                {
                alt36=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalCrossPlatform.g:1601:3: this_Attribute_0= ruleAttribute
                    {

                    			newCompositeNode(grammarAccess.getCommandPlatAccess().getAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attribute_0=ruleAttribute();

                    state._fsp--;


                    			current = this_Attribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCrossPlatform.g:1610:3: this_Operation_1= ruleOperation
                    {

                    			newCompositeNode(grammarAccess.getCommandPlatAccess().getOperationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Operation_1=ruleOperation();

                    state._fsp--;


                    			current = this_Operation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCrossPlatform.g:1619:3: this_OperationGlobalOld_2= ruleOperationGlobalOld
                    {

                    			newCompositeNode(grammarAccess.getCommandPlatAccess().getOperationGlobalOldParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationGlobalOld_2=ruleOperationGlobalOld();

                    state._fsp--;


                    			current = this_OperationGlobalOld_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCrossPlatform.g:1628:3: this_EntityGlobal_3= ruleEntityGlobal
                    {

                    			newCompositeNode(grammarAccess.getCommandPlatAccess().getEntityGlobalParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityGlobal_3=ruleEntityGlobal();

                    state._fsp--;


                    			current = this_EntityGlobal_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalCrossPlatform.g:1637:3: this_OperationGlobal_4= ruleOperationGlobal
                    {

                    			newCompositeNode(grammarAccess.getCommandPlatAccess().getOperationGlobalParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationGlobal_4=ruleOperationGlobal();

                    state._fsp--;


                    			current = this_OperationGlobal_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandPlat"


    // $ANTLR start "entryRuleOperationGlobCallOld"
    // InternalCrossPlatform.g:1649:1: entryRuleOperationGlobCallOld returns [EObject current=null] : iv_ruleOperationGlobCallOld= ruleOperationGlobCallOld EOF ;
    public final EObject entryRuleOperationGlobCallOld() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationGlobCallOld = null;


        try {
            // InternalCrossPlatform.g:1649:61: (iv_ruleOperationGlobCallOld= ruleOperationGlobCallOld EOF )
            // InternalCrossPlatform.g:1650:2: iv_ruleOperationGlobCallOld= ruleOperationGlobCallOld EOF
            {
             newCompositeNode(grammarAccess.getOperationGlobCallOldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationGlobCallOld=ruleOperationGlobCallOld();

            state._fsp--;

             current =iv_ruleOperationGlobCallOld; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationGlobCallOld"


    // $ANTLR start "ruleOperationGlobCallOld"
    // InternalCrossPlatform.g:1656:1: ruleOperationGlobCallOld returns [EObject current=null] : (otherlv_0= 'usesGlobalOld' (otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* )? otherlv_11= ')' otherlv_12= ':' ( (lv_typeGlobal_13_0= ruleDSLTypeRef ) ) (otherlv_14= '<' ( (otherlv_15= RULE_ID ) ) otherlv_16= '>' )? ( (lv_col1_17_0= '[' ) )? ( (lv_array_18_0= RULE_INT ) )? ( (lv_col2_19_0= ']' ) )? ) ;
    public final EObject ruleOperationGlobCallOld() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_col1_17_0=null;
        Token lv_array_18_0=null;
        Token lv_col2_19_0=null;
        EObject lv_params_8_0 = null;

        EObject lv_params_10_0 = null;

        EObject lv_typeGlobal_13_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:1662:2: ( (otherlv_0= 'usesGlobalOld' (otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* )? otherlv_11= ')' otherlv_12= ':' ( (lv_typeGlobal_13_0= ruleDSLTypeRef ) ) (otherlv_14= '<' ( (otherlv_15= RULE_ID ) ) otherlv_16= '>' )? ( (lv_col1_17_0= '[' ) )? ( (lv_array_18_0= RULE_INT ) )? ( (lv_col2_19_0= ']' ) )? ) )
            // InternalCrossPlatform.g:1663:2: (otherlv_0= 'usesGlobalOld' (otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* )? otherlv_11= ')' otherlv_12= ':' ( (lv_typeGlobal_13_0= ruleDSLTypeRef ) ) (otherlv_14= '<' ( (otherlv_15= RULE_ID ) ) otherlv_16= '>' )? ( (lv_col1_17_0= '[' ) )? ( (lv_array_18_0= RULE_INT ) )? ( (lv_col2_19_0= ']' ) )? )
            {
            // InternalCrossPlatform.g:1663:2: (otherlv_0= 'usesGlobalOld' (otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* )? otherlv_11= ')' otherlv_12= ':' ( (lv_typeGlobal_13_0= ruleDSLTypeRef ) ) (otherlv_14= '<' ( (otherlv_15= RULE_ID ) ) otherlv_16= '>' )? ( (lv_col1_17_0= '[' ) )? ( (lv_array_18_0= RULE_INT ) )? ( (lv_col2_19_0= ']' ) )? )
            // InternalCrossPlatform.g:1664:3: otherlv_0= 'usesGlobalOld' (otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* )? otherlv_11= ')' otherlv_12= ':' ( (lv_typeGlobal_13_0= ruleDSLTypeRef ) ) (otherlv_14= '<' ( (otherlv_15= RULE_ID ) ) otherlv_16= '>' )? ( (lv_col1_17_0= '[' ) )? ( (lv_array_18_0= RULE_INT ) )? ( (lv_col2_19_0= ']' ) )?
            {
            otherlv_0=(Token)match(input,41,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationGlobCallOldAccess().getUsesGlobalOldKeyword_0());
            		
            // InternalCrossPlatform.g:1668:3: (otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '>' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==25) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCrossPlatform.g:1669:4: otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getOperationGlobCallOldAccess().getLessThanSignKeyword_1_0());
                    			
                    // InternalCrossPlatform.g:1673:4: ( (otherlv_2= RULE_ID ) )
                    // InternalCrossPlatform.g:1674:5: (otherlv_2= RULE_ID )
                    {
                    // InternalCrossPlatform.g:1674:5: (otherlv_2= RULE_ID )
                    // InternalCrossPlatform.g:1675:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperationGlobCallOldRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_2, grammarAccess.getOperationGlobCallOldAccess().getConcreteTypesTypeCrossReference_1_1_0());
                    					

                    }


                    }

                    // InternalCrossPlatform.g:1686:4: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==26) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalCrossPlatform.g:1687:5: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getOperationGlobCallOldAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalCrossPlatform.g:1691:5: ( (otherlv_4= RULE_ID ) )
                    	    // InternalCrossPlatform.g:1692:6: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalCrossPlatform.g:1692:6: (otherlv_4= RULE_ID )
                    	    // InternalCrossPlatform.g:1693:7: otherlv_4= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getOperationGlobCallOldRule());
                    	    							}
                    	    						
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_13); 

                    	    							newLeafNode(otherlv_4, grammarAccess.getOperationGlobCallOldAccess().getConcreteTypesTypeCrossReference_1_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getOperationGlobCallOldAccess().getGreaterThanSignKeyword_1_3());
                    			

                    }
                    break;

            }

            // InternalCrossPlatform.g:1710:3: ( (otherlv_6= RULE_ID ) )
            // InternalCrossPlatform.g:1711:4: (otherlv_6= RULE_ID )
            {
            // InternalCrossPlatform.g:1711:4: (otherlv_6= RULE_ID )
            // InternalCrossPlatform.g:1712:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationGlobCallOldRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_6, grammarAccess.getOperationGlobCallOldAccess().getOpGlobCallGlobalOldCrossReference_2_0());
            				

            }


            }

            otherlv_7=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getOperationGlobCallOldAccess().getLeftParenthesisKeyword_3());
            		
            // InternalCrossPlatform.g:1727:3: ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCrossPlatform.g:1728:4: ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )*
                    {
                    // InternalCrossPlatform.g:1728:4: ( (lv_params_8_0= ruleParameter ) )
                    // InternalCrossPlatform.g:1729:5: (lv_params_8_0= ruleParameter )
                    {
                    // InternalCrossPlatform.g:1729:5: (lv_params_8_0= ruleParameter )
                    // InternalCrossPlatform.g:1730:6: lv_params_8_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getOperationGlobCallOldAccess().getParamsParameterParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_params_8_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationGlobCallOldRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_8_0,
                    							"br.dslcross.crossplatform.CrossPlatform.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCrossPlatform.g:1747:4: (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==26) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalCrossPlatform.g:1748:5: otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) )
                    	    {
                    	    otherlv_9=(Token)match(input,26,FOLLOW_4); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getOperationGlobCallOldAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalCrossPlatform.g:1752:5: ( (lv_params_10_0= ruleParameter ) )
                    	    // InternalCrossPlatform.g:1753:6: (lv_params_10_0= ruleParameter )
                    	    {
                    	    // InternalCrossPlatform.g:1753:6: (lv_params_10_0= ruleParameter )
                    	    // InternalCrossPlatform.g:1754:7: lv_params_10_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperationGlobCallOldAccess().getParamsParameterParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_params_10_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperationGlobCallOldRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_10_0,
                    	    								"br.dslcross.crossplatform.CrossPlatform.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_11, grammarAccess.getOperationGlobCallOldAccess().getRightParenthesisKeyword_5());
            		
            otherlv_12=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_12, grammarAccess.getOperationGlobCallOldAccess().getColonKeyword_6());
            		
            // InternalCrossPlatform.g:1781:3: ( (lv_typeGlobal_13_0= ruleDSLTypeRef ) )
            // InternalCrossPlatform.g:1782:4: (lv_typeGlobal_13_0= ruleDSLTypeRef )
            {
            // InternalCrossPlatform.g:1782:4: (lv_typeGlobal_13_0= ruleDSLTypeRef )
            // InternalCrossPlatform.g:1783:5: lv_typeGlobal_13_0= ruleDSLTypeRef
            {

            					newCompositeNode(grammarAccess.getOperationGlobCallOldAccess().getTypeGlobalDSLTypeRefParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_17);
            lv_typeGlobal_13_0=ruleDSLTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationGlobCallOldRule());
            					}
            					set(
            						current,
            						"typeGlobal",
            						lv_typeGlobal_13_0,
            						"br.dslcross.crossplatform.CrossPlatform.DSLTypeRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCrossPlatform.g:1800:3: (otherlv_14= '<' ( (otherlv_15= RULE_ID ) ) otherlv_16= '>' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==25) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCrossPlatform.g:1801:4: otherlv_14= '<' ( (otherlv_15= RULE_ID ) ) otherlv_16= '>'
                    {
                    otherlv_14=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getOperationGlobCallOldAccess().getLessThanSignKeyword_8_0());
                    			
                    // InternalCrossPlatform.g:1805:4: ( (otherlv_15= RULE_ID ) )
                    // InternalCrossPlatform.g:1806:5: (otherlv_15= RULE_ID )
                    {
                    // InternalCrossPlatform.g:1806:5: (otherlv_15= RULE_ID )
                    // InternalCrossPlatform.g:1807:6: otherlv_15= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperationGlobCallOldRule());
                    						}
                    					
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_15, grammarAccess.getOperationGlobCallOldAccess().getGenericTypesDeclTypeCrossReference_8_1_0());
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,27,FOLLOW_19); 

                    				newLeafNode(otherlv_16, grammarAccess.getOperationGlobCallOldAccess().getGreaterThanSignKeyword_8_2());
                    			

                    }
                    break;

            }

            // InternalCrossPlatform.g:1823:3: ( (lv_col1_17_0= '[' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==30) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCrossPlatform.g:1824:4: (lv_col1_17_0= '[' )
                    {
                    // InternalCrossPlatform.g:1824:4: (lv_col1_17_0= '[' )
                    // InternalCrossPlatform.g:1825:5: lv_col1_17_0= '['
                    {
                    lv_col1_17_0=(Token)match(input,30,FOLLOW_20); 

                    					newLeafNode(lv_col1_17_0, grammarAccess.getOperationGlobCallOldAccess().getCol1LeftSquareBracketKeyword_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperationGlobCallOldRule());
                    					}
                    					setWithLastConsumed(current, "col1", lv_col1_17_0, "[");
                    				

                    }


                    }
                    break;

            }

            // InternalCrossPlatform.g:1837:3: ( (lv_array_18_0= RULE_INT ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_INT) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCrossPlatform.g:1838:4: (lv_array_18_0= RULE_INT )
                    {
                    // InternalCrossPlatform.g:1838:4: (lv_array_18_0= RULE_INT )
                    // InternalCrossPlatform.g:1839:5: lv_array_18_0= RULE_INT
                    {
                    lv_array_18_0=(Token)match(input,RULE_INT,FOLLOW_21); 

                    					newLeafNode(lv_array_18_0, grammarAccess.getOperationGlobCallOldAccess().getArrayINTTerminalRuleCall_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperationGlobCallOldRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"array",
                    						lv_array_18_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            // InternalCrossPlatform.g:1855:3: ( (lv_col2_19_0= ']' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==31) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCrossPlatform.g:1856:4: (lv_col2_19_0= ']' )
                    {
                    // InternalCrossPlatform.g:1856:4: (lv_col2_19_0= ']' )
                    // InternalCrossPlatform.g:1857:5: lv_col2_19_0= ']'
                    {
                    lv_col2_19_0=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_col2_19_0, grammarAccess.getOperationGlobCallOldAccess().getCol2RightSquareBracketKeyword_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperationGlobCallOldRule());
                    					}
                    					setWithLastConsumed(current, "col2", lv_col2_19_0, "]");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationGlobCallOld"


    // $ANTLR start "entryRuleEntityGlobCall"
    // InternalCrossPlatform.g:1873:1: entryRuleEntityGlobCall returns [EObject current=null] : iv_ruleEntityGlobCall= ruleEntityGlobCall EOF ;
    public final EObject entryRuleEntityGlobCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityGlobCall = null;


        try {
            // InternalCrossPlatform.g:1873:55: (iv_ruleEntityGlobCall= ruleEntityGlobCall EOF )
            // InternalCrossPlatform.g:1874:2: iv_ruleEntityGlobCall= ruleEntityGlobCall EOF
            {
             newCompositeNode(grammarAccess.getEntityGlobCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityGlobCall=ruleEntityGlobCall();

            state._fsp--;

             current =iv_ruleEntityGlobCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityGlobCall"


    // $ANTLR start "ruleEntityGlobCall"
    // InternalCrossPlatform.g:1880:1: ruleEntityGlobCall returns [EObject current=null] : (otherlv_0= 'usesGlobalDetails' (otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) ) ;
    public final EObject ruleEntityGlobCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalCrossPlatform.g:1886:2: ( (otherlv_0= 'usesGlobalDetails' (otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) ) )
            // InternalCrossPlatform.g:1887:2: (otherlv_0= 'usesGlobalDetails' (otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) )
            {
            // InternalCrossPlatform.g:1887:2: (otherlv_0= 'usesGlobalDetails' (otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) )
            // InternalCrossPlatform.g:1888:3: otherlv_0= 'usesGlobalDetails' (otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityGlobCallAccess().getUsesGlobalDetailsKeyword_0());
            		
            // InternalCrossPlatform.g:1892:3: (otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '>' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==25) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCrossPlatform.g:1893:4: otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getEntityGlobCallAccess().getLessThanSignKeyword_1_0());
                    			
                    // InternalCrossPlatform.g:1897:4: ( (otherlv_2= RULE_ID ) )
                    // InternalCrossPlatform.g:1898:5: (otherlv_2= RULE_ID )
                    {
                    // InternalCrossPlatform.g:1898:5: (otherlv_2= RULE_ID )
                    // InternalCrossPlatform.g:1899:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityGlobCallRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_2, grammarAccess.getEntityGlobCallAccess().getConcreteTypesTypeCrossReference_1_1_0());
                    					

                    }


                    }

                    // InternalCrossPlatform.g:1910:4: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==26) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalCrossPlatform.g:1911:5: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getEntityGlobCallAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalCrossPlatform.g:1915:5: ( (otherlv_4= RULE_ID ) )
                    	    // InternalCrossPlatform.g:1916:6: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalCrossPlatform.g:1916:6: (otherlv_4= RULE_ID )
                    	    // InternalCrossPlatform.g:1917:7: otherlv_4= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEntityGlobCallRule());
                    	    							}
                    	    						
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_13); 

                    	    							newLeafNode(otherlv_4, grammarAccess.getEntityGlobCallAccess().getConcreteTypesTypeCrossReference_1_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getEntityGlobCallAccess().getGreaterThanSignKeyword_1_3());
                    			

                    }
                    break;

            }

            // InternalCrossPlatform.g:1934:3: ( (otherlv_6= RULE_ID ) )
            // InternalCrossPlatform.g:1935:4: (otherlv_6= RULE_ID )
            {
            // InternalCrossPlatform.g:1935:4: (otherlv_6= RULE_ID )
            // InternalCrossPlatform.g:1936:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityGlobCallRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_6, grammarAccess.getEntityGlobCallAccess().getOpGlobCallGlobalEntityCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityGlobCall"


    // $ANTLR start "entryRuleOperationGlobCall"
    // InternalCrossPlatform.g:1951:1: entryRuleOperationGlobCall returns [EObject current=null] : iv_ruleOperationGlobCall= ruleOperationGlobCall EOF ;
    public final EObject entryRuleOperationGlobCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationGlobCall = null;


        try {
            // InternalCrossPlatform.g:1951:58: (iv_ruleOperationGlobCall= ruleOperationGlobCall EOF )
            // InternalCrossPlatform.g:1952:2: iv_ruleOperationGlobCall= ruleOperationGlobCall EOF
            {
             newCompositeNode(grammarAccess.getOperationGlobCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationGlobCall=ruleOperationGlobCall();

            state._fsp--;

             current =iv_ruleOperationGlobCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationGlobCall"


    // $ANTLR start "ruleOperationGlobCall"
    // InternalCrossPlatform.g:1958:1: ruleOperationGlobCall returns [EObject current=null] : (otherlv_0= 'usesGlobal' (otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '>' )? (otherlv_6= '[' ( (lv_paramList_7_0= ruleParamList ) ) (otherlv_8= ',' ( (lv_paramList_9_0= ruleParamList ) ) )* otherlv_10= ']' )? ( (otherlv_11= RULE_ID ) ) otherlv_12= '(' ( ( (lv_params_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_params_15_0= ruleParameter ) ) )* )? otherlv_16= ')' (otherlv_17= ':' ( (lv_typeGlobal_18_0= ruleDSLTypeRef ) ) )? (otherlv_19= '<' ( (otherlv_20= RULE_ID ) ) otherlv_21= '>' )? ( (lv_col1_22_0= '[' ) )? ( (lv_array_23_0= RULE_INT ) )? ( (lv_col2_24_0= ']' ) )? (otherlv_25= '{' ( (lv_cmdList_26_0= ruleCommandOperation ) )* otherlv_27= '}' )? ) ;
    public final EObject ruleOperationGlobCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_col1_22_0=null;
        Token lv_array_23_0=null;
        Token lv_col2_24_0=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        EObject lv_paramList_7_0 = null;

        EObject lv_paramList_9_0 = null;

        EObject lv_params_13_0 = null;

        EObject lv_params_15_0 = null;

        EObject lv_typeGlobal_18_0 = null;

        EObject lv_cmdList_26_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:1964:2: ( (otherlv_0= 'usesGlobal' (otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '>' )? (otherlv_6= '[' ( (lv_paramList_7_0= ruleParamList ) ) (otherlv_8= ',' ( (lv_paramList_9_0= ruleParamList ) ) )* otherlv_10= ']' )? ( (otherlv_11= RULE_ID ) ) otherlv_12= '(' ( ( (lv_params_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_params_15_0= ruleParameter ) ) )* )? otherlv_16= ')' (otherlv_17= ':' ( (lv_typeGlobal_18_0= ruleDSLTypeRef ) ) )? (otherlv_19= '<' ( (otherlv_20= RULE_ID ) ) otherlv_21= '>' )? ( (lv_col1_22_0= '[' ) )? ( (lv_array_23_0= RULE_INT ) )? ( (lv_col2_24_0= ']' ) )? (otherlv_25= '{' ( (lv_cmdList_26_0= ruleCommandOperation ) )* otherlv_27= '}' )? ) )
            // InternalCrossPlatform.g:1965:2: (otherlv_0= 'usesGlobal' (otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '>' )? (otherlv_6= '[' ( (lv_paramList_7_0= ruleParamList ) ) (otherlv_8= ',' ( (lv_paramList_9_0= ruleParamList ) ) )* otherlv_10= ']' )? ( (otherlv_11= RULE_ID ) ) otherlv_12= '(' ( ( (lv_params_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_params_15_0= ruleParameter ) ) )* )? otherlv_16= ')' (otherlv_17= ':' ( (lv_typeGlobal_18_0= ruleDSLTypeRef ) ) )? (otherlv_19= '<' ( (otherlv_20= RULE_ID ) ) otherlv_21= '>' )? ( (lv_col1_22_0= '[' ) )? ( (lv_array_23_0= RULE_INT ) )? ( (lv_col2_24_0= ']' ) )? (otherlv_25= '{' ( (lv_cmdList_26_0= ruleCommandOperation ) )* otherlv_27= '}' )? )
            {
            // InternalCrossPlatform.g:1965:2: (otherlv_0= 'usesGlobal' (otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '>' )? (otherlv_6= '[' ( (lv_paramList_7_0= ruleParamList ) ) (otherlv_8= ',' ( (lv_paramList_9_0= ruleParamList ) ) )* otherlv_10= ']' )? ( (otherlv_11= RULE_ID ) ) otherlv_12= '(' ( ( (lv_params_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_params_15_0= ruleParameter ) ) )* )? otherlv_16= ')' (otherlv_17= ':' ( (lv_typeGlobal_18_0= ruleDSLTypeRef ) ) )? (otherlv_19= '<' ( (otherlv_20= RULE_ID ) ) otherlv_21= '>' )? ( (lv_col1_22_0= '[' ) )? ( (lv_array_23_0= RULE_INT ) )? ( (lv_col2_24_0= ']' ) )? (otherlv_25= '{' ( (lv_cmdList_26_0= ruleCommandOperation ) )* otherlv_27= '}' )? )
            // InternalCrossPlatform.g:1966:3: otherlv_0= 'usesGlobal' (otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '>' )? (otherlv_6= '[' ( (lv_paramList_7_0= ruleParamList ) ) (otherlv_8= ',' ( (lv_paramList_9_0= ruleParamList ) ) )* otherlv_10= ']' )? ( (otherlv_11= RULE_ID ) ) otherlv_12= '(' ( ( (lv_params_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_params_15_0= ruleParameter ) ) )* )? otherlv_16= ')' (otherlv_17= ':' ( (lv_typeGlobal_18_0= ruleDSLTypeRef ) ) )? (otherlv_19= '<' ( (otherlv_20= RULE_ID ) ) otherlv_21= '>' )? ( (lv_col1_22_0= '[' ) )? ( (lv_array_23_0= RULE_INT ) )? ( (lv_col2_24_0= ']' ) )? (otherlv_25= '{' ( (lv_cmdList_26_0= ruleCommandOperation ) )* otherlv_27= '}' )?
            {
            otherlv_0=(Token)match(input,43,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationGlobCallAccess().getUsesGlobalKeyword_0());
            		
            // InternalCrossPlatform.g:1970:3: (otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '>' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==25) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalCrossPlatform.g:1971:4: otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getOperationGlobCallAccess().getLessThanSignKeyword_1_0());
                    			
                    // InternalCrossPlatform.g:1975:4: ( (otherlv_2= RULE_ID ) )
                    // InternalCrossPlatform.g:1976:5: (otherlv_2= RULE_ID )
                    {
                    // InternalCrossPlatform.g:1976:5: (otherlv_2= RULE_ID )
                    // InternalCrossPlatform.g:1977:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperationGlobCallRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_2, grammarAccess.getOperationGlobCallAccess().getConcreteTypesTypeCrossReference_1_1_0());
                    					

                    }


                    }

                    // InternalCrossPlatform.g:1988:4: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==26) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalCrossPlatform.g:1989:5: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getOperationGlobCallAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalCrossPlatform.g:1993:5: ( (otherlv_4= RULE_ID ) )
                    	    // InternalCrossPlatform.g:1994:6: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalCrossPlatform.g:1994:6: (otherlv_4= RULE_ID )
                    	    // InternalCrossPlatform.g:1995:7: otherlv_4= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getOperationGlobCallRule());
                    	    							}
                    	    						
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_13); 

                    	    							newLeafNode(otherlv_4, grammarAccess.getOperationGlobCallAccess().getConcreteTypesTypeCrossReference_1_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,27,FOLLOW_31); 

                    				newLeafNode(otherlv_5, grammarAccess.getOperationGlobCallAccess().getGreaterThanSignKeyword_1_3());
                    			

                    }
                    break;

            }

            // InternalCrossPlatform.g:2012:3: (otherlv_6= '[' ( (lv_paramList_7_0= ruleParamList ) ) (otherlv_8= ',' ( (lv_paramList_9_0= ruleParamList ) ) )* otherlv_10= ']' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==30) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalCrossPlatform.g:2013:4: otherlv_6= '[' ( (lv_paramList_7_0= ruleParamList ) ) (otherlv_8= ',' ( (lv_paramList_9_0= ruleParamList ) ) )* otherlv_10= ']'
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getOperationGlobCallAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalCrossPlatform.g:2017:4: ( (lv_paramList_7_0= ruleParamList ) )
                    // InternalCrossPlatform.g:2018:5: (lv_paramList_7_0= ruleParamList )
                    {
                    // InternalCrossPlatform.g:2018:5: (lv_paramList_7_0= ruleParamList )
                    // InternalCrossPlatform.g:2019:6: lv_paramList_7_0= ruleParamList
                    {

                    						newCompositeNode(grammarAccess.getOperationGlobCallAccess().getParamListParamListParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_paramList_7_0=ruleParamList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationGlobCallRule());
                    						}
                    						add(
                    							current,
                    							"paramList",
                    							lv_paramList_7_0,
                    							"br.dslcross.crossplatform.CrossPlatform.ParamList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCrossPlatform.g:2036:4: (otherlv_8= ',' ( (lv_paramList_9_0= ruleParamList ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==26) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalCrossPlatform.g:2037:5: otherlv_8= ',' ( (lv_paramList_9_0= ruleParamList ) )
                    	    {
                    	    otherlv_8=(Token)match(input,26,FOLLOW_4); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getOperationGlobCallAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalCrossPlatform.g:2041:5: ( (lv_paramList_9_0= ruleParamList ) )
                    	    // InternalCrossPlatform.g:2042:6: (lv_paramList_9_0= ruleParamList )
                    	    {
                    	    // InternalCrossPlatform.g:2042:6: (lv_paramList_9_0= ruleParamList )
                    	    // InternalCrossPlatform.g:2043:7: lv_paramList_9_0= ruleParamList
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperationGlobCallAccess().getParamListParamListParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_32);
                    	    lv_paramList_9_0=ruleParamList();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperationGlobCallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"paramList",
                    	    								lv_paramList_9_0,
                    	    								"br.dslcross.crossplatform.CrossPlatform.ParamList");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getOperationGlobCallAccess().getRightSquareBracketKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalCrossPlatform.g:2066:3: ( (otherlv_11= RULE_ID ) )
            // InternalCrossPlatform.g:2067:4: (otherlv_11= RULE_ID )
            {
            // InternalCrossPlatform.g:2067:4: (otherlv_11= RULE_ID )
            // InternalCrossPlatform.g:2068:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationGlobCallRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_11, grammarAccess.getOperationGlobCallAccess().getOpGlobCallGlobalCrossReference_3_0());
            				

            }


            }

            otherlv_12=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_12, grammarAccess.getOperationGlobCallAccess().getLeftParenthesisKeyword_4());
            		
            // InternalCrossPlatform.g:2083:3: ( ( (lv_params_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_params_15_0= ruleParameter ) ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalCrossPlatform.g:2084:4: ( (lv_params_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_params_15_0= ruleParameter ) ) )*
                    {
                    // InternalCrossPlatform.g:2084:4: ( (lv_params_13_0= ruleParameter ) )
                    // InternalCrossPlatform.g:2085:5: (lv_params_13_0= ruleParameter )
                    {
                    // InternalCrossPlatform.g:2085:5: (lv_params_13_0= ruleParameter )
                    // InternalCrossPlatform.g:2086:6: lv_params_13_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getOperationGlobCallAccess().getParamsParameterParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_params_13_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationGlobCallRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_13_0,
                    							"br.dslcross.crossplatform.CrossPlatform.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCrossPlatform.g:2103:4: (otherlv_14= ',' ( (lv_params_15_0= ruleParameter ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==26) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalCrossPlatform.g:2104:5: otherlv_14= ',' ( (lv_params_15_0= ruleParameter ) )
                    	    {
                    	    otherlv_14=(Token)match(input,26,FOLLOW_4); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getOperationGlobCallAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalCrossPlatform.g:2108:5: ( (lv_params_15_0= ruleParameter ) )
                    	    // InternalCrossPlatform.g:2109:6: (lv_params_15_0= ruleParameter )
                    	    {
                    	    // InternalCrossPlatform.g:2109:6: (lv_params_15_0= ruleParameter )
                    	    // InternalCrossPlatform.g:2110:7: lv_params_15_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperationGlobCallAccess().getParamsParameterParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_params_15_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperationGlobCallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_15_0,
                    	    								"br.dslcross.crossplatform.CrossPlatform.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_16=(Token)match(input,29,FOLLOW_33); 

            			newLeafNode(otherlv_16, grammarAccess.getOperationGlobCallAccess().getRightParenthesisKeyword_6());
            		
            // InternalCrossPlatform.g:2133:3: (otherlv_17= ':' ( (lv_typeGlobal_18_0= ruleDSLTypeRef ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==19) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalCrossPlatform.g:2134:4: otherlv_17= ':' ( (lv_typeGlobal_18_0= ruleDSLTypeRef ) )
                    {
                    otherlv_17=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_17, grammarAccess.getOperationGlobCallAccess().getColonKeyword_7_0());
                    			
                    // InternalCrossPlatform.g:2138:4: ( (lv_typeGlobal_18_0= ruleDSLTypeRef ) )
                    // InternalCrossPlatform.g:2139:5: (lv_typeGlobal_18_0= ruleDSLTypeRef )
                    {
                    // InternalCrossPlatform.g:2139:5: (lv_typeGlobal_18_0= ruleDSLTypeRef )
                    // InternalCrossPlatform.g:2140:6: lv_typeGlobal_18_0= ruleDSLTypeRef
                    {

                    						newCompositeNode(grammarAccess.getOperationGlobCallAccess().getTypeGlobalDSLTypeRefParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_typeGlobal_18_0=ruleDSLTypeRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationGlobCallRule());
                    						}
                    						set(
                    							current,
                    							"typeGlobal",
                    							lv_typeGlobal_18_0,
                    							"br.dslcross.crossplatform.CrossPlatform.DSLTypeRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCrossPlatform.g:2158:3: (otherlv_19= '<' ( (otherlv_20= RULE_ID ) ) otherlv_21= '>' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==25) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalCrossPlatform.g:2159:4: otherlv_19= '<' ( (otherlv_20= RULE_ID ) ) otherlv_21= '>'
                    {
                    otherlv_19=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_19, grammarAccess.getOperationGlobCallAccess().getLessThanSignKeyword_8_0());
                    			
                    // InternalCrossPlatform.g:2163:4: ( (otherlv_20= RULE_ID ) )
                    // InternalCrossPlatform.g:2164:5: (otherlv_20= RULE_ID )
                    {
                    // InternalCrossPlatform.g:2164:5: (otherlv_20= RULE_ID )
                    // InternalCrossPlatform.g:2165:6: otherlv_20= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperationGlobCallRule());
                    						}
                    					
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_20, grammarAccess.getOperationGlobCallAccess().getGenericTypesDeclTypeCrossReference_8_1_0());
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,27,FOLLOW_35); 

                    				newLeafNode(otherlv_21, grammarAccess.getOperationGlobCallAccess().getGreaterThanSignKeyword_8_2());
                    			

                    }
                    break;

            }

            // InternalCrossPlatform.g:2181:3: ( (lv_col1_22_0= '[' ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==30) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalCrossPlatform.g:2182:4: (lv_col1_22_0= '[' )
                    {
                    // InternalCrossPlatform.g:2182:4: (lv_col1_22_0= '[' )
                    // InternalCrossPlatform.g:2183:5: lv_col1_22_0= '['
                    {
                    lv_col1_22_0=(Token)match(input,30,FOLLOW_36); 

                    					newLeafNode(lv_col1_22_0, grammarAccess.getOperationGlobCallAccess().getCol1LeftSquareBracketKeyword_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperationGlobCallRule());
                    					}
                    					setWithLastConsumed(current, "col1", lv_col1_22_0, "[");
                    				

                    }


                    }
                    break;

            }

            // InternalCrossPlatform.g:2195:3: ( (lv_array_23_0= RULE_INT ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_INT) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalCrossPlatform.g:2196:4: (lv_array_23_0= RULE_INT )
                    {
                    // InternalCrossPlatform.g:2196:4: (lv_array_23_0= RULE_INT )
                    // InternalCrossPlatform.g:2197:5: lv_array_23_0= RULE_INT
                    {
                    lv_array_23_0=(Token)match(input,RULE_INT,FOLLOW_37); 

                    					newLeafNode(lv_array_23_0, grammarAccess.getOperationGlobCallAccess().getArrayINTTerminalRuleCall_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperationGlobCallRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"array",
                    						lv_array_23_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            // InternalCrossPlatform.g:2213:3: ( (lv_col2_24_0= ']' ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==31) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalCrossPlatform.g:2214:4: (lv_col2_24_0= ']' )
                    {
                    // InternalCrossPlatform.g:2214:4: (lv_col2_24_0= ']' )
                    // InternalCrossPlatform.g:2215:5: lv_col2_24_0= ']'
                    {
                    lv_col2_24_0=(Token)match(input,31,FOLLOW_38); 

                    					newLeafNode(lv_col2_24_0, grammarAccess.getOperationGlobCallAccess().getCol2RightSquareBracketKeyword_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperationGlobCallRule());
                    					}
                    					setWithLastConsumed(current, "col2", lv_col2_24_0, "]");
                    				

                    }


                    }
                    break;

            }

            // InternalCrossPlatform.g:2227:3: (otherlv_25= '{' ( (lv_cmdList_26_0= ruleCommandOperation ) )* otherlv_27= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==13) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalCrossPlatform.g:2228:4: otherlv_25= '{' ( (lv_cmdList_26_0= ruleCommandOperation ) )* otherlv_27= '}'
                    {
                    otherlv_25=(Token)match(input,13,FOLLOW_39); 

                    				newLeafNode(otherlv_25, grammarAccess.getOperationGlobCallAccess().getLeftCurlyBracketKeyword_12_0());
                    			
                    // InternalCrossPlatform.g:2232:4: ( (lv_cmdList_26_0= ruleCommandOperation ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==RULE_ID||LA58_0==RULE_STRINGTEMPLATE||LA58_0==33||LA58_0==42||(LA58_0>=48 && LA58_0<=51)||LA58_0==57||LA58_0==59||(LA58_0>=71 && LA58_0<=72)) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalCrossPlatform.g:2233:5: (lv_cmdList_26_0= ruleCommandOperation )
                    	    {
                    	    // InternalCrossPlatform.g:2233:5: (lv_cmdList_26_0= ruleCommandOperation )
                    	    // InternalCrossPlatform.g:2234:6: lv_cmdList_26_0= ruleCommandOperation
                    	    {

                    	    						newCompositeNode(grammarAccess.getOperationGlobCallAccess().getCmdListCommandOperationParserRuleCall_12_1_0());
                    	    					
                    	    pushFollow(FOLLOW_39);
                    	    lv_cmdList_26_0=ruleCommandOperation();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getOperationGlobCallRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"cmdList",
                    	    							lv_cmdList_26_0,
                    	    							"br.dslcross.crossplatform.CrossPlatform.CommandOperation");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_27, grammarAccess.getOperationGlobCallAccess().getRightCurlyBracketKeyword_12_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationGlobCall"


    // $ANTLR start "entryRuleOperation"
    // InternalCrossPlatform.g:2260:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalCrossPlatform.g:2260:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalCrossPlatform.g:2261:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalCrossPlatform.g:2267:1: ruleOperation returns [EObject current=null] : (otherlv_0= 'operation' ( (lv_paramExtra_1_0= ruleExprArit ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( (lv_type_9_0= ruleDSLTypeRef ) ) (otherlv_10= '<' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '>' )? ( (lv_col1_15_0= '[' ) )? ( (lv_array_16_0= RULE_INT ) )? ( (lv_col2_17_0= ']' ) )? )? otherlv_18= '{' ( (lv_cmdList_19_0= ruleCommandOperation ) )* otherlv_20= '}' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_col1_15_0=null;
        Token lv_array_16_0=null;
        Token lv_col2_17_0=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        EObject lv_paramExtra_1_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_params_6_0 = null;

        EObject lv_type_9_0 = null;

        EObject lv_cmdList_19_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:2273:2: ( (otherlv_0= 'operation' ( (lv_paramExtra_1_0= ruleExprArit ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( (lv_type_9_0= ruleDSLTypeRef ) ) (otherlv_10= '<' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '>' )? ( (lv_col1_15_0= '[' ) )? ( (lv_array_16_0= RULE_INT ) )? ( (lv_col2_17_0= ']' ) )? )? otherlv_18= '{' ( (lv_cmdList_19_0= ruleCommandOperation ) )* otherlv_20= '}' ) )
            // InternalCrossPlatform.g:2274:2: (otherlv_0= 'operation' ( (lv_paramExtra_1_0= ruleExprArit ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( (lv_type_9_0= ruleDSLTypeRef ) ) (otherlv_10= '<' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '>' )? ( (lv_col1_15_0= '[' ) )? ( (lv_array_16_0= RULE_INT ) )? ( (lv_col2_17_0= ']' ) )? )? otherlv_18= '{' ( (lv_cmdList_19_0= ruleCommandOperation ) )* otherlv_20= '}' )
            {
            // InternalCrossPlatform.g:2274:2: (otherlv_0= 'operation' ( (lv_paramExtra_1_0= ruleExprArit ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( (lv_type_9_0= ruleDSLTypeRef ) ) (otherlv_10= '<' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '>' )? ( (lv_col1_15_0= '[' ) )? ( (lv_array_16_0= RULE_INT ) )? ( (lv_col2_17_0= ']' ) )? )? otherlv_18= '{' ( (lv_cmdList_19_0= ruleCommandOperation ) )* otherlv_20= '}' )
            // InternalCrossPlatform.g:2275:3: otherlv_0= 'operation' ( (lv_paramExtra_1_0= ruleExprArit ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( (lv_type_9_0= ruleDSLTypeRef ) ) (otherlv_10= '<' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '>' )? ( (lv_col1_15_0= '[' ) )? ( (lv_array_16_0= RULE_INT ) )? ( (lv_col2_17_0= ']' ) )? )? otherlv_18= '{' ( (lv_cmdList_19_0= ruleCommandOperation ) )* otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getOperationKeyword_0());
            		
            // InternalCrossPlatform.g:2279:3: ( (lv_paramExtra_1_0= ruleExprArit ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                int LA60_1 = input.LA(2);

                if ( ((LA60_1>=RULE_ID && LA60_1<=RULE_INT)||LA60_1==15||LA60_1==19||(LA60_1>=30 && LA60_1<=31)||(LA60_1>=74 && LA60_1<=77)) ) {
                    alt60=1;
                }
                else if ( (LA60_1==28) ) {
                    int LA60_3 = input.LA(3);

                    if ( (LA60_3==RULE_ID) ) {
                        int LA60_4 = input.LA(4);

                        if ( (LA60_4==RULE_INT||LA60_4==15||LA60_4==26||(LA60_4>=29 && LA60_4<=31)) ) {
                            alt60=1;
                        }
                    }
                    else if ( (LA60_3==29) ) {
                        int LA60_5 = input.LA(4);

                        if ( (LA60_5==RULE_ID||(LA60_5>=74 && LA60_5<=77)) ) {
                            alt60=1;
                        }
                    }
                }
            }
            else if ( (LA60_0==RULE_INT||LA60_0==RULE_STRING||LA60_0==28||LA60_0==33) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalCrossPlatform.g:2280:4: (lv_paramExtra_1_0= ruleExprArit )
                    {
                    // InternalCrossPlatform.g:2280:4: (lv_paramExtra_1_0= ruleExprArit )
                    // InternalCrossPlatform.g:2281:5: lv_paramExtra_1_0= ruleExprArit
                    {

                    					newCompositeNode(grammarAccess.getOperationAccess().getParamExtraExprAritParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_paramExtra_1_0=ruleExprArit();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOperationRule());
                    					}
                    					set(
                    						current,
                    						"paramExtra",
                    						lv_paramExtra_1_0,
                    						"br.dslcross.crossplatform.CrossPlatform.ExprArit");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCrossPlatform.g:2298:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalCrossPlatform.g:2299:4: (lv_name_2_0= RULE_ID )
            {
            // InternalCrossPlatform.g:2299:4: (lv_name_2_0= RULE_ID )
            // InternalCrossPlatform.g:2300:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_2_0, grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_3());
            		
            // InternalCrossPlatform.g:2320:3: ( ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )* )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalCrossPlatform.g:2321:4: ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )*
                    {
                    // InternalCrossPlatform.g:2321:4: ( (lv_params_4_0= ruleParameter ) )
                    // InternalCrossPlatform.g:2322:5: (lv_params_4_0= ruleParameter )
                    {
                    // InternalCrossPlatform.g:2322:5: (lv_params_4_0= ruleParameter )
                    // InternalCrossPlatform.g:2323:6: lv_params_4_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getOperationAccess().getParamsParameterParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_params_4_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_4_0,
                    							"br.dslcross.crossplatform.CrossPlatform.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCrossPlatform.g:2340:4: (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==26) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalCrossPlatform.g:2341:5: otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,26,FOLLOW_4); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalCrossPlatform.g:2345:5: ( (lv_params_6_0= ruleParameter ) )
                    	    // InternalCrossPlatform.g:2346:6: (lv_params_6_0= ruleParameter )
                    	    {
                    	    // InternalCrossPlatform.g:2346:6: (lv_params_6_0= ruleParameter )
                    	    // InternalCrossPlatform.g:2347:7: lv_params_6_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperationAccess().getParamsParameterParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_params_6_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_6_0,
                    	    								"br.dslcross.crossplatform.CrossPlatform.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,29,FOLLOW_41); 

            			newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getRightParenthesisKeyword_5());
            		
            // InternalCrossPlatform.g:2370:3: (otherlv_8= ':' ( (lv_type_9_0= ruleDSLTypeRef ) ) (otherlv_10= '<' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '>' )? ( (lv_col1_15_0= '[' ) )? ( (lv_array_16_0= RULE_INT ) )? ( (lv_col2_17_0= ']' ) )? )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==19) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalCrossPlatform.g:2371:4: otherlv_8= ':' ( (lv_type_9_0= ruleDSLTypeRef ) ) (otherlv_10= '<' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '>' )? ( (lv_col1_15_0= '[' ) )? ( (lv_array_16_0= RULE_INT ) )? ( (lv_col2_17_0= ']' ) )?
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getOperationAccess().getColonKeyword_6_0());
                    			
                    // InternalCrossPlatform.g:2375:4: ( (lv_type_9_0= ruleDSLTypeRef ) )
                    // InternalCrossPlatform.g:2376:5: (lv_type_9_0= ruleDSLTypeRef )
                    {
                    // InternalCrossPlatform.g:2376:5: (lv_type_9_0= ruleDSLTypeRef )
                    // InternalCrossPlatform.g:2377:6: lv_type_9_0= ruleDSLTypeRef
                    {

                    						newCompositeNode(grammarAccess.getOperationAccess().getTypeDSLTypeRefParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_type_9_0=ruleDSLTypeRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_9_0,
                    							"br.dslcross.crossplatform.CrossPlatform.DSLTypeRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCrossPlatform.g:2394:4: (otherlv_10= '<' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '>' )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==25) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalCrossPlatform.g:2395:5: otherlv_10= '<' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '>'
                            {
                            otherlv_10=(Token)match(input,25,FOLLOW_4); 

                            					newLeafNode(otherlv_10, grammarAccess.getOperationAccess().getLessThanSignKeyword_6_2_0());
                            				
                            // InternalCrossPlatform.g:2399:5: ( (otherlv_11= RULE_ID ) )
                            // InternalCrossPlatform.g:2400:6: (otherlv_11= RULE_ID )
                            {
                            // InternalCrossPlatform.g:2400:6: (otherlv_11= RULE_ID )
                            // InternalCrossPlatform.g:2401:7: otherlv_11= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getOperationRule());
                            							}
                            						
                            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_13); 

                            							newLeafNode(otherlv_11, grammarAccess.getOperationAccess().getGenericTypesDeclTypeCrossReference_6_2_1_0());
                            						

                            }


                            }

                            // InternalCrossPlatform.g:2412:5: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
                            loop63:
                            do {
                                int alt63=2;
                                int LA63_0 = input.LA(1);

                                if ( (LA63_0==26) ) {
                                    alt63=1;
                                }


                                switch (alt63) {
                            	case 1 :
                            	    // InternalCrossPlatform.g:2413:6: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
                            	    {
                            	    otherlv_12=(Token)match(input,26,FOLLOW_4); 

                            	    						newLeafNode(otherlv_12, grammarAccess.getOperationAccess().getCommaKeyword_6_2_2_0());
                            	    					
                            	    // InternalCrossPlatform.g:2417:6: ( (otherlv_13= RULE_ID ) )
                            	    // InternalCrossPlatform.g:2418:7: (otherlv_13= RULE_ID )
                            	    {
                            	    // InternalCrossPlatform.g:2418:7: (otherlv_13= RULE_ID )
                            	    // InternalCrossPlatform.g:2419:8: otherlv_13= RULE_ID
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getOperationRule());
                            	    								}
                            	    							
                            	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_13); 

                            	    								newLeafNode(otherlv_13, grammarAccess.getOperationAccess().getGenericTypesDeclTypeCrossReference_6_2_2_1_0());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop63;
                                }
                            } while (true);

                            otherlv_14=(Token)match(input,27,FOLLOW_43); 

                            					newLeafNode(otherlv_14, grammarAccess.getOperationAccess().getGreaterThanSignKeyword_6_2_3());
                            				

                            }
                            break;

                    }

                    // InternalCrossPlatform.g:2436:4: ( (lv_col1_15_0= '[' ) )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==30) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalCrossPlatform.g:2437:5: (lv_col1_15_0= '[' )
                            {
                            // InternalCrossPlatform.g:2437:5: (lv_col1_15_0= '[' )
                            // InternalCrossPlatform.g:2438:6: lv_col1_15_0= '['
                            {
                            lv_col1_15_0=(Token)match(input,30,FOLLOW_44); 

                            						newLeafNode(lv_col1_15_0, grammarAccess.getOperationAccess().getCol1LeftSquareBracketKeyword_6_3_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOperationRule());
                            						}
                            						setWithLastConsumed(current, "col1", lv_col1_15_0, "[");
                            					

                            }


                            }
                            break;

                    }

                    // InternalCrossPlatform.g:2450:4: ( (lv_array_16_0= RULE_INT ) )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==RULE_INT) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // InternalCrossPlatform.g:2451:5: (lv_array_16_0= RULE_INT )
                            {
                            // InternalCrossPlatform.g:2451:5: (lv_array_16_0= RULE_INT )
                            // InternalCrossPlatform.g:2452:6: lv_array_16_0= RULE_INT
                            {
                            lv_array_16_0=(Token)match(input,RULE_INT,FOLLOW_45); 

                            						newLeafNode(lv_array_16_0, grammarAccess.getOperationAccess().getArrayINTTerminalRuleCall_6_4_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOperationRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"array",
                            							lv_array_16_0,
                            							"org.eclipse.xtext.common.Terminals.INT");
                            					

                            }


                            }
                            break;

                    }

                    // InternalCrossPlatform.g:2468:4: ( (lv_col2_17_0= ']' ) )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==31) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // InternalCrossPlatform.g:2469:5: (lv_col2_17_0= ']' )
                            {
                            // InternalCrossPlatform.g:2469:5: (lv_col2_17_0= ']' )
                            // InternalCrossPlatform.g:2470:6: lv_col2_17_0= ']'
                            {
                            lv_col2_17_0=(Token)match(input,31,FOLLOW_5); 

                            						newLeafNode(lv_col2_17_0, grammarAccess.getOperationAccess().getCol2RightSquareBracketKeyword_6_5_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOperationRule());
                            						}
                            						setWithLastConsumed(current, "col2", lv_col2_17_0, "]");
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,13,FOLLOW_39); 

            			newLeafNode(otherlv_18, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalCrossPlatform.g:2487:3: ( (lv_cmdList_19_0= ruleCommandOperation ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==RULE_ID||LA69_0==RULE_STRINGTEMPLATE||LA69_0==33||LA69_0==42||(LA69_0>=48 && LA69_0<=51)||LA69_0==57||LA69_0==59||(LA69_0>=71 && LA69_0<=72)) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalCrossPlatform.g:2488:4: (lv_cmdList_19_0= ruleCommandOperation )
            	    {
            	    // InternalCrossPlatform.g:2488:4: (lv_cmdList_19_0= ruleCommandOperation )
            	    // InternalCrossPlatform.g:2489:5: lv_cmdList_19_0= ruleCommandOperation
            	    {

            	    					newCompositeNode(grammarAccess.getOperationAccess().getCmdListCommandOperationParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_39);
            	    lv_cmdList_19_0=ruleCommandOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOperationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cmdList",
            	    						lv_cmdList_19_0,
            	    						"br.dslcross.crossplatform.CrossPlatform.CommandOperation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            otherlv_20=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleOperationGlobalOld"
    // InternalCrossPlatform.g:2514:1: entryRuleOperationGlobalOld returns [EObject current=null] : iv_ruleOperationGlobalOld= ruleOperationGlobalOld EOF ;
    public final EObject entryRuleOperationGlobalOld() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationGlobalOld = null;


        try {
            // InternalCrossPlatform.g:2514:59: (iv_ruleOperationGlobalOld= ruleOperationGlobalOld EOF )
            // InternalCrossPlatform.g:2515:2: iv_ruleOperationGlobalOld= ruleOperationGlobalOld EOF
            {
             newCompositeNode(grammarAccess.getOperationGlobalOldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationGlobalOld=ruleOperationGlobalOld();

            state._fsp--;

             current =iv_ruleOperationGlobalOld; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationGlobalOld"


    // $ANTLR start "ruleOperationGlobalOld"
    // InternalCrossPlatform.g:2521:1: ruleOperationGlobalOld returns [EObject current=null] : (otherlv_0= 'implementsGlobalOld' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* )? otherlv_11= ')' otherlv_12= ':' ( (lv_type_13_0= ruleDSLTypeRef ) ) (otherlv_14= '<' ( (lv_genericTypesDecl_15_0= ruleDSLGenericType ) ) otherlv_16= '>' )? ( (lv_col1_17_0= '[' ) )? ( (lv_array_18_0= RULE_INT ) )? ( (lv_col2_19_0= ']' ) )? otherlv_20= '{' ( (lv_cmdList_21_0= ruleCommandOperation ) )* otherlv_22= '}' ) ;
    public final EObject ruleOperationGlobalOld() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token lv_col1_17_0=null;
        Token lv_array_18_0=null;
        Token lv_col2_19_0=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        EObject lv_genericTypes_2_0 = null;

        EObject lv_genericTypes_4_0 = null;

        EObject lv_params_8_0 = null;

        EObject lv_params_10_0 = null;

        EObject lv_type_13_0 = null;

        EObject lv_genericTypesDecl_15_0 = null;

        EObject lv_cmdList_21_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:2527:2: ( (otherlv_0= 'implementsGlobalOld' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* )? otherlv_11= ')' otherlv_12= ':' ( (lv_type_13_0= ruleDSLTypeRef ) ) (otherlv_14= '<' ( (lv_genericTypesDecl_15_0= ruleDSLGenericType ) ) otherlv_16= '>' )? ( (lv_col1_17_0= '[' ) )? ( (lv_array_18_0= RULE_INT ) )? ( (lv_col2_19_0= ']' ) )? otherlv_20= '{' ( (lv_cmdList_21_0= ruleCommandOperation ) )* otherlv_22= '}' ) )
            // InternalCrossPlatform.g:2528:2: (otherlv_0= 'implementsGlobalOld' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* )? otherlv_11= ')' otherlv_12= ':' ( (lv_type_13_0= ruleDSLTypeRef ) ) (otherlv_14= '<' ( (lv_genericTypesDecl_15_0= ruleDSLGenericType ) ) otherlv_16= '>' )? ( (lv_col1_17_0= '[' ) )? ( (lv_array_18_0= RULE_INT ) )? ( (lv_col2_19_0= ']' ) )? otherlv_20= '{' ( (lv_cmdList_21_0= ruleCommandOperation ) )* otherlv_22= '}' )
            {
            // InternalCrossPlatform.g:2528:2: (otherlv_0= 'implementsGlobalOld' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* )? otherlv_11= ')' otherlv_12= ':' ( (lv_type_13_0= ruleDSLTypeRef ) ) (otherlv_14= '<' ( (lv_genericTypesDecl_15_0= ruleDSLGenericType ) ) otherlv_16= '>' )? ( (lv_col1_17_0= '[' ) )? ( (lv_array_18_0= RULE_INT ) )? ( (lv_col2_19_0= ']' ) )? otherlv_20= '{' ( (lv_cmdList_21_0= ruleCommandOperation ) )* otherlv_22= '}' )
            // InternalCrossPlatform.g:2529:3: otherlv_0= 'implementsGlobalOld' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* )? otherlv_11= ')' otherlv_12= ':' ( (lv_type_13_0= ruleDSLTypeRef ) ) (otherlv_14= '<' ( (lv_genericTypesDecl_15_0= ruleDSLGenericType ) ) otherlv_16= '>' )? ( (lv_col1_17_0= '[' ) )? ( (lv_array_18_0= RULE_INT ) )? ( (lv_col2_19_0= ']' ) )? otherlv_20= '{' ( (lv_cmdList_21_0= ruleCommandOperation ) )* otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationGlobalOldAccess().getImplementsGlobalOldKeyword_0());
            		
            // InternalCrossPlatform.g:2533:3: (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==25) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalCrossPlatform.g:2534:4: otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getOperationGlobalOldAccess().getLessThanSignKeyword_1_0());
                    			
                    // InternalCrossPlatform.g:2538:4: ( (lv_genericTypes_2_0= ruleDSLGenericType ) )
                    // InternalCrossPlatform.g:2539:5: (lv_genericTypes_2_0= ruleDSLGenericType )
                    {
                    // InternalCrossPlatform.g:2539:5: (lv_genericTypes_2_0= ruleDSLGenericType )
                    // InternalCrossPlatform.g:2540:6: lv_genericTypes_2_0= ruleDSLGenericType
                    {

                    						newCompositeNode(grammarAccess.getOperationGlobalOldAccess().getGenericTypesDSLGenericTypeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_genericTypes_2_0=ruleDSLGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationGlobalOldRule());
                    						}
                    						add(
                    							current,
                    							"genericTypes",
                    							lv_genericTypes_2_0,
                    							"br.dslcross.crossplatform.CrossPlatform.DSLGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCrossPlatform.g:2557:4: (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==26) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalCrossPlatform.g:2558:5: otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getOperationGlobalOldAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalCrossPlatform.g:2562:5: ( (lv_genericTypes_4_0= ruleDSLGenericType ) )
                    	    // InternalCrossPlatform.g:2563:6: (lv_genericTypes_4_0= ruleDSLGenericType )
                    	    {
                    	    // InternalCrossPlatform.g:2563:6: (lv_genericTypes_4_0= ruleDSLGenericType )
                    	    // InternalCrossPlatform.g:2564:7: lv_genericTypes_4_0= ruleDSLGenericType
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperationGlobalOldAccess().getGenericTypesDSLGenericTypeParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_genericTypes_4_0=ruleDSLGenericType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperationGlobalOldRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"genericTypes",
                    	    								lv_genericTypes_4_0,
                    	    								"br.dslcross.crossplatform.CrossPlatform.DSLGenericType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getOperationGlobalOldAccess().getGreaterThanSignKeyword_1_3());
                    			

                    }
                    break;

            }

            // InternalCrossPlatform.g:2587:3: ( (otherlv_6= RULE_ID ) )
            // InternalCrossPlatform.g:2588:4: (otherlv_6= RULE_ID )
            {
            // InternalCrossPlatform.g:2588:4: (otherlv_6= RULE_ID )
            // InternalCrossPlatform.g:2589:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationGlobalOldRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_6, grammarAccess.getOperationGlobalOldAccess().getOpGlobalGlobalOldCrossReference_2_0());
            				

            }


            }

            otherlv_7=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getOperationGlobalOldAccess().getLeftParenthesisKeyword_3());
            		
            // InternalCrossPlatform.g:2604:3: ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_ID) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalCrossPlatform.g:2605:4: ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )*
                    {
                    // InternalCrossPlatform.g:2605:4: ( (lv_params_8_0= ruleParameter ) )
                    // InternalCrossPlatform.g:2606:5: (lv_params_8_0= ruleParameter )
                    {
                    // InternalCrossPlatform.g:2606:5: (lv_params_8_0= ruleParameter )
                    // InternalCrossPlatform.g:2607:6: lv_params_8_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getOperationGlobalOldAccess().getParamsParameterParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_params_8_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationGlobalOldRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_8_0,
                    							"br.dslcross.crossplatform.CrossPlatform.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCrossPlatform.g:2624:4: (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==26) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalCrossPlatform.g:2625:5: otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) )
                    	    {
                    	    otherlv_9=(Token)match(input,26,FOLLOW_4); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getOperationGlobalOldAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalCrossPlatform.g:2629:5: ( (lv_params_10_0= ruleParameter ) )
                    	    // InternalCrossPlatform.g:2630:6: (lv_params_10_0= ruleParameter )
                    	    {
                    	    // InternalCrossPlatform.g:2630:6: (lv_params_10_0= ruleParameter )
                    	    // InternalCrossPlatform.g:2631:7: lv_params_10_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperationGlobalOldAccess().getParamsParameterParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_params_10_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperationGlobalOldRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_10_0,
                    	    								"br.dslcross.crossplatform.CrossPlatform.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_11, grammarAccess.getOperationGlobalOldAccess().getRightParenthesisKeyword_5());
            		
            otherlv_12=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_12, grammarAccess.getOperationGlobalOldAccess().getColonKeyword_6());
            		
            // InternalCrossPlatform.g:2658:3: ( (lv_type_13_0= ruleDSLTypeRef ) )
            // InternalCrossPlatform.g:2659:4: (lv_type_13_0= ruleDSLTypeRef )
            {
            // InternalCrossPlatform.g:2659:4: (lv_type_13_0= ruleDSLTypeRef )
            // InternalCrossPlatform.g:2660:5: lv_type_13_0= ruleDSLTypeRef
            {

            					newCompositeNode(grammarAccess.getOperationGlobalOldAccess().getTypeDSLTypeRefParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_42);
            lv_type_13_0=ruleDSLTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationGlobalOldRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_13_0,
            						"br.dslcross.crossplatform.CrossPlatform.DSLTypeRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCrossPlatform.g:2677:3: (otherlv_14= '<' ( (lv_genericTypesDecl_15_0= ruleDSLGenericType ) ) otherlv_16= '>' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==25) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalCrossPlatform.g:2678:4: otherlv_14= '<' ( (lv_genericTypesDecl_15_0= ruleDSLGenericType ) ) otherlv_16= '>'
                    {
                    otherlv_14=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getOperationGlobalOldAccess().getLessThanSignKeyword_8_0());
                    			
                    // InternalCrossPlatform.g:2682:4: ( (lv_genericTypesDecl_15_0= ruleDSLGenericType ) )
                    // InternalCrossPlatform.g:2683:5: (lv_genericTypesDecl_15_0= ruleDSLGenericType )
                    {
                    // InternalCrossPlatform.g:2683:5: (lv_genericTypesDecl_15_0= ruleDSLGenericType )
                    // InternalCrossPlatform.g:2684:6: lv_genericTypesDecl_15_0= ruleDSLGenericType
                    {

                    						newCompositeNode(grammarAccess.getOperationGlobalOldAccess().getGenericTypesDeclDSLGenericTypeParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_genericTypesDecl_15_0=ruleDSLGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationGlobalOldRule());
                    						}
                    						set(
                    							current,
                    							"genericTypesDecl",
                    							lv_genericTypesDecl_15_0,
                    							"br.dslcross.crossplatform.CrossPlatform.DSLGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,27,FOLLOW_43); 

                    				newLeafNode(otherlv_16, grammarAccess.getOperationGlobalOldAccess().getGreaterThanSignKeyword_8_2());
                    			

                    }
                    break;

            }

            // InternalCrossPlatform.g:2706:3: ( (lv_col1_17_0= '[' ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==30) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalCrossPlatform.g:2707:4: (lv_col1_17_0= '[' )
                    {
                    // InternalCrossPlatform.g:2707:4: (lv_col1_17_0= '[' )
                    // InternalCrossPlatform.g:2708:5: lv_col1_17_0= '['
                    {
                    lv_col1_17_0=(Token)match(input,30,FOLLOW_44); 

                    					newLeafNode(lv_col1_17_0, grammarAccess.getOperationGlobalOldAccess().getCol1LeftSquareBracketKeyword_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperationGlobalOldRule());
                    					}
                    					setWithLastConsumed(current, "col1", lv_col1_17_0, "[");
                    				

                    }


                    }
                    break;

            }

            // InternalCrossPlatform.g:2720:3: ( (lv_array_18_0= RULE_INT ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_INT) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalCrossPlatform.g:2721:4: (lv_array_18_0= RULE_INT )
                    {
                    // InternalCrossPlatform.g:2721:4: (lv_array_18_0= RULE_INT )
                    // InternalCrossPlatform.g:2722:5: lv_array_18_0= RULE_INT
                    {
                    lv_array_18_0=(Token)match(input,RULE_INT,FOLLOW_45); 

                    					newLeafNode(lv_array_18_0, grammarAccess.getOperationGlobalOldAccess().getArrayINTTerminalRuleCall_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperationGlobalOldRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"array",
                    						lv_array_18_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            // InternalCrossPlatform.g:2738:3: ( (lv_col2_19_0= ']' ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==31) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalCrossPlatform.g:2739:4: (lv_col2_19_0= ']' )
                    {
                    // InternalCrossPlatform.g:2739:4: (lv_col2_19_0= ']' )
                    // InternalCrossPlatform.g:2740:5: lv_col2_19_0= ']'
                    {
                    lv_col2_19_0=(Token)match(input,31,FOLLOW_5); 

                    					newLeafNode(lv_col2_19_0, grammarAccess.getOperationGlobalOldAccess().getCol2RightSquareBracketKeyword_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperationGlobalOldRule());
                    					}
                    					setWithLastConsumed(current, "col2", lv_col2_19_0, "]");
                    				

                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,13,FOLLOW_39); 

            			newLeafNode(otherlv_20, grammarAccess.getOperationGlobalOldAccess().getLeftCurlyBracketKeyword_12());
            		
            // InternalCrossPlatform.g:2756:3: ( (lv_cmdList_21_0= ruleCommandOperation ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==RULE_ID||LA78_0==RULE_STRINGTEMPLATE||LA78_0==33||LA78_0==42||(LA78_0>=48 && LA78_0<=51)||LA78_0==57||LA78_0==59||(LA78_0>=71 && LA78_0<=72)) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalCrossPlatform.g:2757:4: (lv_cmdList_21_0= ruleCommandOperation )
            	    {
            	    // InternalCrossPlatform.g:2757:4: (lv_cmdList_21_0= ruleCommandOperation )
            	    // InternalCrossPlatform.g:2758:5: lv_cmdList_21_0= ruleCommandOperation
            	    {

            	    					newCompositeNode(grammarAccess.getOperationGlobalOldAccess().getCmdListCommandOperationParserRuleCall_13_0());
            	    				
            	    pushFollow(FOLLOW_39);
            	    lv_cmdList_21_0=ruleCommandOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOperationGlobalOldRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cmdList",
            	    						lv_cmdList_21_0,
            	    						"br.dslcross.crossplatform.CrossPlatform.CommandOperation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            otherlv_22=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getOperationGlobalOldAccess().getRightCurlyBracketKeyword_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationGlobalOld"


    // $ANTLR start "entryRuleEntityGlobal"
    // InternalCrossPlatform.g:2783:1: entryRuleEntityGlobal returns [EObject current=null] : iv_ruleEntityGlobal= ruleEntityGlobal EOF ;
    public final EObject entryRuleEntityGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityGlobal = null;


        try {
            // InternalCrossPlatform.g:2783:53: (iv_ruleEntityGlobal= ruleEntityGlobal EOF )
            // InternalCrossPlatform.g:2784:2: iv_ruleEntityGlobal= ruleEntityGlobal EOF
            {
             newCompositeNode(grammarAccess.getEntityGlobalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityGlobal=ruleEntityGlobal();

            state._fsp--;

             current =iv_ruleEntityGlobal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityGlobal"


    // $ANTLR start "ruleEntityGlobal"
    // InternalCrossPlatform.g:2790:1: ruleEntityGlobal returns [EObject current=null] : (otherlv_0= 'implementsGlobalDetails' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) otherlv_7= '{' ( (lv_cmdList_8_0= ruleCommandOperation ) )* otherlv_9= '}' ) ;
    public final EObject ruleEntityGlobal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_genericTypes_2_0 = null;

        EObject lv_genericTypes_4_0 = null;

        EObject lv_cmdList_8_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:2796:2: ( (otherlv_0= 'implementsGlobalDetails' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) otherlv_7= '{' ( (lv_cmdList_8_0= ruleCommandOperation ) )* otherlv_9= '}' ) )
            // InternalCrossPlatform.g:2797:2: (otherlv_0= 'implementsGlobalDetails' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) otherlv_7= '{' ( (lv_cmdList_8_0= ruleCommandOperation ) )* otherlv_9= '}' )
            {
            // InternalCrossPlatform.g:2797:2: (otherlv_0= 'implementsGlobalDetails' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) otherlv_7= '{' ( (lv_cmdList_8_0= ruleCommandOperation ) )* otherlv_9= '}' )
            // InternalCrossPlatform.g:2798:3: otherlv_0= 'implementsGlobalDetails' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) otherlv_7= '{' ( (lv_cmdList_8_0= ruleCommandOperation ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityGlobalAccess().getImplementsGlobalDetailsKeyword_0());
            		
            // InternalCrossPlatform.g:2802:3: (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==25) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalCrossPlatform.g:2803:4: otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getEntityGlobalAccess().getLessThanSignKeyword_1_0());
                    			
                    // InternalCrossPlatform.g:2807:4: ( (lv_genericTypes_2_0= ruleDSLGenericType ) )
                    // InternalCrossPlatform.g:2808:5: (lv_genericTypes_2_0= ruleDSLGenericType )
                    {
                    // InternalCrossPlatform.g:2808:5: (lv_genericTypes_2_0= ruleDSLGenericType )
                    // InternalCrossPlatform.g:2809:6: lv_genericTypes_2_0= ruleDSLGenericType
                    {

                    						newCompositeNode(grammarAccess.getEntityGlobalAccess().getGenericTypesDSLGenericTypeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_genericTypes_2_0=ruleDSLGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityGlobalRule());
                    						}
                    						add(
                    							current,
                    							"genericTypes",
                    							lv_genericTypes_2_0,
                    							"br.dslcross.crossplatform.CrossPlatform.DSLGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCrossPlatform.g:2826:4: (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==26) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalCrossPlatform.g:2827:5: otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getEntityGlobalAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalCrossPlatform.g:2831:5: ( (lv_genericTypes_4_0= ruleDSLGenericType ) )
                    	    // InternalCrossPlatform.g:2832:6: (lv_genericTypes_4_0= ruleDSLGenericType )
                    	    {
                    	    // InternalCrossPlatform.g:2832:6: (lv_genericTypes_4_0= ruleDSLGenericType )
                    	    // InternalCrossPlatform.g:2833:7: lv_genericTypes_4_0= ruleDSLGenericType
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntityGlobalAccess().getGenericTypesDSLGenericTypeParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_genericTypes_4_0=ruleDSLGenericType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntityGlobalRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"genericTypes",
                    	    								lv_genericTypes_4_0,
                    	    								"br.dslcross.crossplatform.CrossPlatform.DSLGenericType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getEntityGlobalAccess().getGreaterThanSignKeyword_1_3());
                    			

                    }
                    break;

            }

            // InternalCrossPlatform.g:2856:3: ( (otherlv_6= RULE_ID ) )
            // InternalCrossPlatform.g:2857:4: (otherlv_6= RULE_ID )
            {
            // InternalCrossPlatform.g:2857:4: (otherlv_6= RULE_ID )
            // InternalCrossPlatform.g:2858:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityGlobalRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_6, grammarAccess.getEntityGlobalAccess().getOpGlobalGlobalEntityCrossReference_2_0());
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_39); 

            			newLeafNode(otherlv_7, grammarAccess.getEntityGlobalAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCrossPlatform.g:2873:3: ( (lv_cmdList_8_0= ruleCommandOperation ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==RULE_ID||LA81_0==RULE_STRINGTEMPLATE||LA81_0==33||LA81_0==42||(LA81_0>=48 && LA81_0<=51)||LA81_0==57||LA81_0==59||(LA81_0>=71 && LA81_0<=72)) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalCrossPlatform.g:2874:4: (lv_cmdList_8_0= ruleCommandOperation )
            	    {
            	    // InternalCrossPlatform.g:2874:4: (lv_cmdList_8_0= ruleCommandOperation )
            	    // InternalCrossPlatform.g:2875:5: lv_cmdList_8_0= ruleCommandOperation
            	    {

            	    					newCompositeNode(grammarAccess.getEntityGlobalAccess().getCmdListCommandOperationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_39);
            	    lv_cmdList_8_0=ruleCommandOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityGlobalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cmdList",
            	    						lv_cmdList_8_0,
            	    						"br.dslcross.crossplatform.CrossPlatform.CommandOperation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getEntityGlobalAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityGlobal"


    // $ANTLR start "entryRuleOperationGlobal"
    // InternalCrossPlatform.g:2900:1: entryRuleOperationGlobal returns [EObject current=null] : iv_ruleOperationGlobal= ruleOperationGlobal EOF ;
    public final EObject entryRuleOperationGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationGlobal = null;


        try {
            // InternalCrossPlatform.g:2900:56: (iv_ruleOperationGlobal= ruleOperationGlobal EOF )
            // InternalCrossPlatform.g:2901:2: iv_ruleOperationGlobal= ruleOperationGlobal EOF
            {
             newCompositeNode(grammarAccess.getOperationGlobalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationGlobal=ruleOperationGlobal();

            state._fsp--;

             current =iv_ruleOperationGlobal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationGlobal"


    // $ANTLR start "ruleOperationGlobal"
    // InternalCrossPlatform.g:2907:1: ruleOperationGlobal returns [EObject current=null] : (otherlv_0= 'implementsGlobal' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? (otherlv_6= '[' ( (lv_paramList_7_0= ruleParamList ) ) (otherlv_8= ',' ( (lv_paramList_9_0= ruleParamList ) ) )* otherlv_10= ']' )? ( (otherlv_11= RULE_ID ) ) otherlv_12= '(' ( ( (lv_params_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_params_15_0= ruleParameter ) ) )* )? otherlv_16= ')' otherlv_17= ':' ( (lv_type_18_0= ruleDSLTypeRef ) ) (otherlv_19= '<' ( (lv_genericTypesDecl_20_0= ruleDSLGenericType ) ) otherlv_21= '>' )? ( (lv_col1_22_0= '[' ) )? ( (lv_array_23_0= RULE_INT ) )? ( (lv_col2_24_0= ']' ) )? otherlv_25= '{' ( (lv_cmdList_26_0= ruleCommandOperation ) )* otherlv_27= '}' ) ;
    public final EObject ruleOperationGlobal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token lv_col1_22_0=null;
        Token lv_array_23_0=null;
        Token lv_col2_24_0=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        EObject lv_genericTypes_2_0 = null;

        EObject lv_genericTypes_4_0 = null;

        EObject lv_paramList_7_0 = null;

        EObject lv_paramList_9_0 = null;

        EObject lv_params_13_0 = null;

        EObject lv_params_15_0 = null;

        EObject lv_type_18_0 = null;

        EObject lv_genericTypesDecl_20_0 = null;

        EObject lv_cmdList_26_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:2913:2: ( (otherlv_0= 'implementsGlobal' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? (otherlv_6= '[' ( (lv_paramList_7_0= ruleParamList ) ) (otherlv_8= ',' ( (lv_paramList_9_0= ruleParamList ) ) )* otherlv_10= ']' )? ( (otherlv_11= RULE_ID ) ) otherlv_12= '(' ( ( (lv_params_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_params_15_0= ruleParameter ) ) )* )? otherlv_16= ')' otherlv_17= ':' ( (lv_type_18_0= ruleDSLTypeRef ) ) (otherlv_19= '<' ( (lv_genericTypesDecl_20_0= ruleDSLGenericType ) ) otherlv_21= '>' )? ( (lv_col1_22_0= '[' ) )? ( (lv_array_23_0= RULE_INT ) )? ( (lv_col2_24_0= ']' ) )? otherlv_25= '{' ( (lv_cmdList_26_0= ruleCommandOperation ) )* otherlv_27= '}' ) )
            // InternalCrossPlatform.g:2914:2: (otherlv_0= 'implementsGlobal' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? (otherlv_6= '[' ( (lv_paramList_7_0= ruleParamList ) ) (otherlv_8= ',' ( (lv_paramList_9_0= ruleParamList ) ) )* otherlv_10= ']' )? ( (otherlv_11= RULE_ID ) ) otherlv_12= '(' ( ( (lv_params_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_params_15_0= ruleParameter ) ) )* )? otherlv_16= ')' otherlv_17= ':' ( (lv_type_18_0= ruleDSLTypeRef ) ) (otherlv_19= '<' ( (lv_genericTypesDecl_20_0= ruleDSLGenericType ) ) otherlv_21= '>' )? ( (lv_col1_22_0= '[' ) )? ( (lv_array_23_0= RULE_INT ) )? ( (lv_col2_24_0= ']' ) )? otherlv_25= '{' ( (lv_cmdList_26_0= ruleCommandOperation ) )* otherlv_27= '}' )
            {
            // InternalCrossPlatform.g:2914:2: (otherlv_0= 'implementsGlobal' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? (otherlv_6= '[' ( (lv_paramList_7_0= ruleParamList ) ) (otherlv_8= ',' ( (lv_paramList_9_0= ruleParamList ) ) )* otherlv_10= ']' )? ( (otherlv_11= RULE_ID ) ) otherlv_12= '(' ( ( (lv_params_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_params_15_0= ruleParameter ) ) )* )? otherlv_16= ')' otherlv_17= ':' ( (lv_type_18_0= ruleDSLTypeRef ) ) (otherlv_19= '<' ( (lv_genericTypesDecl_20_0= ruleDSLGenericType ) ) otherlv_21= '>' )? ( (lv_col1_22_0= '[' ) )? ( (lv_array_23_0= RULE_INT ) )? ( (lv_col2_24_0= ']' ) )? otherlv_25= '{' ( (lv_cmdList_26_0= ruleCommandOperation ) )* otherlv_27= '}' )
            // InternalCrossPlatform.g:2915:3: otherlv_0= 'implementsGlobal' (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )? (otherlv_6= '[' ( (lv_paramList_7_0= ruleParamList ) ) (otherlv_8= ',' ( (lv_paramList_9_0= ruleParamList ) ) )* otherlv_10= ']' )? ( (otherlv_11= RULE_ID ) ) otherlv_12= '(' ( ( (lv_params_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_params_15_0= ruleParameter ) ) )* )? otherlv_16= ')' otherlv_17= ':' ( (lv_type_18_0= ruleDSLTypeRef ) ) (otherlv_19= '<' ( (lv_genericTypesDecl_20_0= ruleDSLGenericType ) ) otherlv_21= '>' )? ( (lv_col1_22_0= '[' ) )? ( (lv_array_23_0= RULE_INT ) )? ( (lv_col2_24_0= ']' ) )? otherlv_25= '{' ( (lv_cmdList_26_0= ruleCommandOperation ) )* otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationGlobalAccess().getImplementsGlobalKeyword_0());
            		
            // InternalCrossPlatform.g:2919:3: (otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==25) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalCrossPlatform.g:2920:4: otherlv_1= '<' ( (lv_genericTypes_2_0= ruleDSLGenericType ) ) (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getOperationGlobalAccess().getLessThanSignKeyword_1_0());
                    			
                    // InternalCrossPlatform.g:2924:4: ( (lv_genericTypes_2_0= ruleDSLGenericType ) )
                    // InternalCrossPlatform.g:2925:5: (lv_genericTypes_2_0= ruleDSLGenericType )
                    {
                    // InternalCrossPlatform.g:2925:5: (lv_genericTypes_2_0= ruleDSLGenericType )
                    // InternalCrossPlatform.g:2926:6: lv_genericTypes_2_0= ruleDSLGenericType
                    {

                    						newCompositeNode(grammarAccess.getOperationGlobalAccess().getGenericTypesDSLGenericTypeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_genericTypes_2_0=ruleDSLGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationGlobalRule());
                    						}
                    						add(
                    							current,
                    							"genericTypes",
                    							lv_genericTypes_2_0,
                    							"br.dslcross.crossplatform.CrossPlatform.DSLGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCrossPlatform.g:2943:4: (otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==26) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // InternalCrossPlatform.g:2944:5: otherlv_3= ',' ( (lv_genericTypes_4_0= ruleDSLGenericType ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getOperationGlobalAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalCrossPlatform.g:2948:5: ( (lv_genericTypes_4_0= ruleDSLGenericType ) )
                    	    // InternalCrossPlatform.g:2949:6: (lv_genericTypes_4_0= ruleDSLGenericType )
                    	    {
                    	    // InternalCrossPlatform.g:2949:6: (lv_genericTypes_4_0= ruleDSLGenericType )
                    	    // InternalCrossPlatform.g:2950:7: lv_genericTypes_4_0= ruleDSLGenericType
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperationGlobalAccess().getGenericTypesDSLGenericTypeParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_genericTypes_4_0=ruleDSLGenericType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperationGlobalRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"genericTypes",
                    	    								lv_genericTypes_4_0,
                    	    								"br.dslcross.crossplatform.CrossPlatform.DSLGenericType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,27,FOLLOW_31); 

                    				newLeafNode(otherlv_5, grammarAccess.getOperationGlobalAccess().getGreaterThanSignKeyword_1_3());
                    			

                    }
                    break;

            }

            // InternalCrossPlatform.g:2973:3: (otherlv_6= '[' ( (lv_paramList_7_0= ruleParamList ) ) (otherlv_8= ',' ( (lv_paramList_9_0= ruleParamList ) ) )* otherlv_10= ']' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==30) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalCrossPlatform.g:2974:4: otherlv_6= '[' ( (lv_paramList_7_0= ruleParamList ) ) (otherlv_8= ',' ( (lv_paramList_9_0= ruleParamList ) ) )* otherlv_10= ']'
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getOperationGlobalAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalCrossPlatform.g:2978:4: ( (lv_paramList_7_0= ruleParamList ) )
                    // InternalCrossPlatform.g:2979:5: (lv_paramList_7_0= ruleParamList )
                    {
                    // InternalCrossPlatform.g:2979:5: (lv_paramList_7_0= ruleParamList )
                    // InternalCrossPlatform.g:2980:6: lv_paramList_7_0= ruleParamList
                    {

                    						newCompositeNode(grammarAccess.getOperationGlobalAccess().getParamListParamListParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_paramList_7_0=ruleParamList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationGlobalRule());
                    						}
                    						add(
                    							current,
                    							"paramList",
                    							lv_paramList_7_0,
                    							"br.dslcross.crossplatform.CrossPlatform.ParamList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCrossPlatform.g:2997:4: (otherlv_8= ',' ( (lv_paramList_9_0= ruleParamList ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==26) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // InternalCrossPlatform.g:2998:5: otherlv_8= ',' ( (lv_paramList_9_0= ruleParamList ) )
                    	    {
                    	    otherlv_8=(Token)match(input,26,FOLLOW_4); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getOperationGlobalAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalCrossPlatform.g:3002:5: ( (lv_paramList_9_0= ruleParamList ) )
                    	    // InternalCrossPlatform.g:3003:6: (lv_paramList_9_0= ruleParamList )
                    	    {
                    	    // InternalCrossPlatform.g:3003:6: (lv_paramList_9_0= ruleParamList )
                    	    // InternalCrossPlatform.g:3004:7: lv_paramList_9_0= ruleParamList
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperationGlobalAccess().getParamListParamListParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_32);
                    	    lv_paramList_9_0=ruleParamList();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperationGlobalRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"paramList",
                    	    								lv_paramList_9_0,
                    	    								"br.dslcross.crossplatform.CrossPlatform.ParamList");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getOperationGlobalAccess().getRightSquareBracketKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalCrossPlatform.g:3027:3: ( (otherlv_11= RULE_ID ) )
            // InternalCrossPlatform.g:3028:4: (otherlv_11= RULE_ID )
            {
            // InternalCrossPlatform.g:3028:4: (otherlv_11= RULE_ID )
            // InternalCrossPlatform.g:3029:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationGlobalRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_11, grammarAccess.getOperationGlobalAccess().getOpGlobalGlobalCrossReference_3_0());
            				

            }


            }

            otherlv_12=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_12, grammarAccess.getOperationGlobalAccess().getLeftParenthesisKeyword_4());
            		
            // InternalCrossPlatform.g:3044:3: ( ( (lv_params_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_params_15_0= ruleParameter ) ) )* )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_ID) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalCrossPlatform.g:3045:4: ( (lv_params_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_params_15_0= ruleParameter ) ) )*
                    {
                    // InternalCrossPlatform.g:3045:4: ( (lv_params_13_0= ruleParameter ) )
                    // InternalCrossPlatform.g:3046:5: (lv_params_13_0= ruleParameter )
                    {
                    // InternalCrossPlatform.g:3046:5: (lv_params_13_0= ruleParameter )
                    // InternalCrossPlatform.g:3047:6: lv_params_13_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getOperationGlobalAccess().getParamsParameterParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_params_13_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationGlobalRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_13_0,
                    							"br.dslcross.crossplatform.CrossPlatform.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCrossPlatform.g:3064:4: (otherlv_14= ',' ( (lv_params_15_0= ruleParameter ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==26) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // InternalCrossPlatform.g:3065:5: otherlv_14= ',' ( (lv_params_15_0= ruleParameter ) )
                    	    {
                    	    otherlv_14=(Token)match(input,26,FOLLOW_4); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getOperationGlobalAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalCrossPlatform.g:3069:5: ( (lv_params_15_0= ruleParameter ) )
                    	    // InternalCrossPlatform.g:3070:6: (lv_params_15_0= ruleParameter )
                    	    {
                    	    // InternalCrossPlatform.g:3070:6: (lv_params_15_0= ruleParameter )
                    	    // InternalCrossPlatform.g:3071:7: lv_params_15_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperationGlobalAccess().getParamsParameterParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_params_15_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperationGlobalRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_15_0,
                    	    								"br.dslcross.crossplatform.CrossPlatform.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop86;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_16=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_16, grammarAccess.getOperationGlobalAccess().getRightParenthesisKeyword_6());
            		
            otherlv_17=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_17, grammarAccess.getOperationGlobalAccess().getColonKeyword_7());
            		
            // InternalCrossPlatform.g:3098:3: ( (lv_type_18_0= ruleDSLTypeRef ) )
            // InternalCrossPlatform.g:3099:4: (lv_type_18_0= ruleDSLTypeRef )
            {
            // InternalCrossPlatform.g:3099:4: (lv_type_18_0= ruleDSLTypeRef )
            // InternalCrossPlatform.g:3100:5: lv_type_18_0= ruleDSLTypeRef
            {

            					newCompositeNode(grammarAccess.getOperationGlobalAccess().getTypeDSLTypeRefParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_42);
            lv_type_18_0=ruleDSLTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationGlobalRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_18_0,
            						"br.dslcross.crossplatform.CrossPlatform.DSLTypeRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCrossPlatform.g:3117:3: (otherlv_19= '<' ( (lv_genericTypesDecl_20_0= ruleDSLGenericType ) ) otherlv_21= '>' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==25) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalCrossPlatform.g:3118:4: otherlv_19= '<' ( (lv_genericTypesDecl_20_0= ruleDSLGenericType ) ) otherlv_21= '>'
                    {
                    otherlv_19=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_19, grammarAccess.getOperationGlobalAccess().getLessThanSignKeyword_9_0());
                    			
                    // InternalCrossPlatform.g:3122:4: ( (lv_genericTypesDecl_20_0= ruleDSLGenericType ) )
                    // InternalCrossPlatform.g:3123:5: (lv_genericTypesDecl_20_0= ruleDSLGenericType )
                    {
                    // InternalCrossPlatform.g:3123:5: (lv_genericTypesDecl_20_0= ruleDSLGenericType )
                    // InternalCrossPlatform.g:3124:6: lv_genericTypesDecl_20_0= ruleDSLGenericType
                    {

                    						newCompositeNode(grammarAccess.getOperationGlobalAccess().getGenericTypesDeclDSLGenericTypeParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_genericTypesDecl_20_0=ruleDSLGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationGlobalRule());
                    						}
                    						set(
                    							current,
                    							"genericTypesDecl",
                    							lv_genericTypesDecl_20_0,
                    							"br.dslcross.crossplatform.CrossPlatform.DSLGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,27,FOLLOW_43); 

                    				newLeafNode(otherlv_21, grammarAccess.getOperationGlobalAccess().getGreaterThanSignKeyword_9_2());
                    			

                    }
                    break;

            }

            // InternalCrossPlatform.g:3146:3: ( (lv_col1_22_0= '[' ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==30) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalCrossPlatform.g:3147:4: (lv_col1_22_0= '[' )
                    {
                    // InternalCrossPlatform.g:3147:4: (lv_col1_22_0= '[' )
                    // InternalCrossPlatform.g:3148:5: lv_col1_22_0= '['
                    {
                    lv_col1_22_0=(Token)match(input,30,FOLLOW_44); 

                    					newLeafNode(lv_col1_22_0, grammarAccess.getOperationGlobalAccess().getCol1LeftSquareBracketKeyword_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperationGlobalRule());
                    					}
                    					setWithLastConsumed(current, "col1", lv_col1_22_0, "[");
                    				

                    }


                    }
                    break;

            }

            // InternalCrossPlatform.g:3160:3: ( (lv_array_23_0= RULE_INT ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_INT) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalCrossPlatform.g:3161:4: (lv_array_23_0= RULE_INT )
                    {
                    // InternalCrossPlatform.g:3161:4: (lv_array_23_0= RULE_INT )
                    // InternalCrossPlatform.g:3162:5: lv_array_23_0= RULE_INT
                    {
                    lv_array_23_0=(Token)match(input,RULE_INT,FOLLOW_45); 

                    					newLeafNode(lv_array_23_0, grammarAccess.getOperationGlobalAccess().getArrayINTTerminalRuleCall_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperationGlobalRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"array",
                    						lv_array_23_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            // InternalCrossPlatform.g:3178:3: ( (lv_col2_24_0= ']' ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==31) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalCrossPlatform.g:3179:4: (lv_col2_24_0= ']' )
                    {
                    // InternalCrossPlatform.g:3179:4: (lv_col2_24_0= ']' )
                    // InternalCrossPlatform.g:3180:5: lv_col2_24_0= ']'
                    {
                    lv_col2_24_0=(Token)match(input,31,FOLLOW_5); 

                    					newLeafNode(lv_col2_24_0, grammarAccess.getOperationGlobalAccess().getCol2RightSquareBracketKeyword_12_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperationGlobalRule());
                    					}
                    					setWithLastConsumed(current, "col2", lv_col2_24_0, "]");
                    				

                    }


                    }
                    break;

            }

            otherlv_25=(Token)match(input,13,FOLLOW_39); 

            			newLeafNode(otherlv_25, grammarAccess.getOperationGlobalAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalCrossPlatform.g:3196:3: ( (lv_cmdList_26_0= ruleCommandOperation ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==RULE_ID||LA92_0==RULE_STRINGTEMPLATE||LA92_0==33||LA92_0==42||(LA92_0>=48 && LA92_0<=51)||LA92_0==57||LA92_0==59||(LA92_0>=71 && LA92_0<=72)) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalCrossPlatform.g:3197:4: (lv_cmdList_26_0= ruleCommandOperation )
            	    {
            	    // InternalCrossPlatform.g:3197:4: (lv_cmdList_26_0= ruleCommandOperation )
            	    // InternalCrossPlatform.g:3198:5: lv_cmdList_26_0= ruleCommandOperation
            	    {

            	    					newCompositeNode(grammarAccess.getOperationGlobalAccess().getCmdListCommandOperationParserRuleCall_14_0());
            	    				
            	    pushFollow(FOLLOW_39);
            	    lv_cmdList_26_0=ruleCommandOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOperationGlobalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cmdList",
            	    						lv_cmdList_26_0,
            	    						"br.dslcross.crossplatform.CrossPlatform.CommandOperation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);

            otherlv_27=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getOperationGlobalAccess().getRightCurlyBracketKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationGlobal"


    // $ANTLR start "entryRuleAttribute"
    // InternalCrossPlatform.g:3223:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalCrossPlatform.g:3223:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalCrossPlatform.g:3224:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalCrossPlatform.g:3230:1: ruleAttribute returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' )? ( (lv_arrayAllow_5_0= RULE_INT ) )? (otherlv_6= ']' )? (otherlv_7= '<' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '>' )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_arrayAllow_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalCrossPlatform.g:3236:2: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' )? ( (lv_arrayAllow_5_0= RULE_INT ) )? (otherlv_6= ']' )? (otherlv_7= '<' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '>' )? ) )
            // InternalCrossPlatform.g:3237:2: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' )? ( (lv_arrayAllow_5_0= RULE_INT ) )? (otherlv_6= ']' )? (otherlv_7= '<' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '>' )? )
            {
            // InternalCrossPlatform.g:3237:2: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' )? ( (lv_arrayAllow_5_0= RULE_INT ) )? (otherlv_6= ']' )? (otherlv_7= '<' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '>' )? )
            // InternalCrossPlatform.g:3238:3: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' )? ( (lv_arrayAllow_5_0= RULE_INT ) )? (otherlv_6= ']' )? (otherlv_7= '<' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '>' )?
            {
            // InternalCrossPlatform.g:3238:3: ( (lv_many_0_0= 'many' ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==48) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalCrossPlatform.g:3239:4: (lv_many_0_0= 'many' )
                    {
                    // InternalCrossPlatform.g:3239:4: (lv_many_0_0= 'many' )
                    // InternalCrossPlatform.g:3240:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,48,FOLLOW_4); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getAttributeAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "many", lv_many_0_0 != null, "many");
                    				

                    }


                    }
                    break;

            }

            // InternalCrossPlatform.g:3252:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCrossPlatform.g:3253:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCrossPlatform.g:3253:4: (lv_name_1_0= RULE_ID )
            // InternalCrossPlatform.g:3254:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
            		
            // InternalCrossPlatform.g:3274:3: ( (otherlv_3= RULE_ID ) )
            // InternalCrossPlatform.g:3275:4: (otherlv_3= RULE_ID )
            {
            // InternalCrossPlatform.g:3275:4: (otherlv_3= RULE_ID )
            // InternalCrossPlatform.g:3276:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getTypeTypeCrossReference_3_0());
            				

            }


            }

            // InternalCrossPlatform.g:3287:3: (otherlv_4= '[' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==30) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalCrossPlatform.g:3288:4: otherlv_4= '['
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_4());
                    			

                    }
                    break;

            }

            // InternalCrossPlatform.g:3293:3: ( (lv_arrayAllow_5_0= RULE_INT ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==RULE_INT) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalCrossPlatform.g:3294:4: (lv_arrayAllow_5_0= RULE_INT )
                    {
                    // InternalCrossPlatform.g:3294:4: (lv_arrayAllow_5_0= RULE_INT )
                    // InternalCrossPlatform.g:3295:5: lv_arrayAllow_5_0= RULE_INT
                    {
                    lv_arrayAllow_5_0=(Token)match(input,RULE_INT,FOLLOW_27); 

                    					newLeafNode(lv_arrayAllow_5_0, grammarAccess.getAttributeAccess().getArrayAllowINTTerminalRuleCall_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"arrayAllow",
                    						lv_arrayAllow_5_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            // InternalCrossPlatform.g:3311:3: (otherlv_6= ']' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==31) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalCrossPlatform.g:3312:4: otherlv_6= ']'
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_22); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_6());
                    			

                    }
                    break;

            }

            // InternalCrossPlatform.g:3317:3: (otherlv_7= '<' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '>' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==25) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalCrossPlatform.g:3318:4: otherlv_7= '<' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '>'
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getLessThanSignKeyword_7_0());
                    			
                    // InternalCrossPlatform.g:3322:4: ( (otherlv_8= RULE_ID ) )
                    // InternalCrossPlatform.g:3323:5: (otherlv_8= RULE_ID )
                    {
                    // InternalCrossPlatform.g:3323:5: (otherlv_8= RULE_ID )
                    // InternalCrossPlatform.g:3324:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getConcreteTypesTypeCrossReference_7_1_0());
                    					

                    }


                    }

                    // InternalCrossPlatform.g:3335:4: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==26) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // InternalCrossPlatform.g:3336:5: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
                            {
                            otherlv_9=(Token)match(input,26,FOLLOW_4); 

                            					newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getCommaKeyword_7_2_0());
                            				
                            // InternalCrossPlatform.g:3340:5: ( (otherlv_10= RULE_ID ) )
                            // InternalCrossPlatform.g:3341:6: (otherlv_10= RULE_ID )
                            {
                            // InternalCrossPlatform.g:3341:6: (otherlv_10= RULE_ID )
                            // InternalCrossPlatform.g:3342:7: otherlv_10= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAttributeRule());
                            							}
                            						
                            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_18); 

                            							newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getConcreteTypesTypeCrossReference_7_2_1_0());
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getGreaterThanSignKeyword_7_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleParamList"
    // InternalCrossPlatform.g:3363:1: entryRuleParamList returns [EObject current=null] : iv_ruleParamList= ruleParamList EOF ;
    public final EObject entryRuleParamList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamList = null;


        try {
            // InternalCrossPlatform.g:3363:50: (iv_ruleParamList= ruleParamList EOF )
            // InternalCrossPlatform.g:3364:2: iv_ruleParamList= ruleParamList EOF
            {
             newCompositeNode(grammarAccess.getParamListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParamList=ruleParamList();

            state._fsp--;

             current =iv_ruleParamList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParamList"


    // $ANTLR start "ruleParamList"
    // InternalCrossPlatform.g:3370:1: ruleParamList returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleParamList() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalCrossPlatform.g:3376:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalCrossPlatform.g:3377:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalCrossPlatform.g:3377:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalCrossPlatform.g:3378:3: (lv_name_0_0= RULE_ID )
            {
            // InternalCrossPlatform.g:3378:3: (lv_name_0_0= RULE_ID )
            // InternalCrossPlatform.g:3379:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getParamListAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getParamListRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParamList"


    // $ANTLR start "entryRuleDSLTypeRef"
    // InternalCrossPlatform.g:3398:1: entryRuleDSLTypeRef returns [EObject current=null] : iv_ruleDSLTypeRef= ruleDSLTypeRef EOF ;
    public final EObject entryRuleDSLTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLTypeRef = null;


        try {
            // InternalCrossPlatform.g:3398:51: (iv_ruleDSLTypeRef= ruleDSLTypeRef EOF )
            // InternalCrossPlatform.g:3399:2: iv_ruleDSLTypeRef= ruleDSLTypeRef EOF
            {
             newCompositeNode(grammarAccess.getDSLTypeRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLTypeRef=ruleDSLTypeRef();

            state._fsp--;

             current =iv_ruleDSLTypeRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSLTypeRef"


    // $ANTLR start "ruleDSLTypeRef"
    // InternalCrossPlatform.g:3405:1: ruleDSLTypeRef returns [EObject current=null] : (this_DSLConcreteTypeRef_0= ruleDSLConcreteTypeRef | this_DSLGenericTypeRef_1= ruleDSLGenericTypeRef ) ;
    public final EObject ruleDSLTypeRef() throws RecognitionException {
        EObject current = null;

        EObject this_DSLConcreteTypeRef_0 = null;

        EObject this_DSLGenericTypeRef_1 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:3411:2: ( (this_DSLConcreteTypeRef_0= ruleDSLConcreteTypeRef | this_DSLGenericTypeRef_1= ruleDSLGenericTypeRef ) )
            // InternalCrossPlatform.g:3412:2: (this_DSLConcreteTypeRef_0= ruleDSLConcreteTypeRef | this_DSLGenericTypeRef_1= ruleDSLGenericTypeRef )
            {
            // InternalCrossPlatform.g:3412:2: (this_DSLConcreteTypeRef_0= ruleDSLConcreteTypeRef | this_DSLGenericTypeRef_1= ruleDSLGenericTypeRef )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==RULE_ID) ) {
                alt99=1;
            }
            else if ( (LA99_0==25) ) {
                alt99=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // InternalCrossPlatform.g:3413:3: this_DSLConcreteTypeRef_0= ruleDSLConcreteTypeRef
                    {

                    			newCompositeNode(grammarAccess.getDSLTypeRefAccess().getDSLConcreteTypeRefParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLConcreteTypeRef_0=ruleDSLConcreteTypeRef();

                    state._fsp--;


                    			current = this_DSLConcreteTypeRef_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCrossPlatform.g:3422:3: this_DSLGenericTypeRef_1= ruleDSLGenericTypeRef
                    {

                    			newCompositeNode(grammarAccess.getDSLTypeRefAccess().getDSLGenericTypeRefParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLGenericTypeRef_1=ruleDSLGenericTypeRef();

                    state._fsp--;


                    			current = this_DSLGenericTypeRef_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSLTypeRef"


    // $ANTLR start "entryRuleDSLConcreteTypeRef"
    // InternalCrossPlatform.g:3434:1: entryRuleDSLConcreteTypeRef returns [EObject current=null] : iv_ruleDSLConcreteTypeRef= ruleDSLConcreteTypeRef EOF ;
    public final EObject entryRuleDSLConcreteTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLConcreteTypeRef = null;


        try {
            // InternalCrossPlatform.g:3434:59: (iv_ruleDSLConcreteTypeRef= ruleDSLConcreteTypeRef EOF )
            // InternalCrossPlatform.g:3435:2: iv_ruleDSLConcreteTypeRef= ruleDSLConcreteTypeRef EOF
            {
             newCompositeNode(grammarAccess.getDSLConcreteTypeRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLConcreteTypeRef=ruleDSLConcreteTypeRef();

            state._fsp--;

             current =iv_ruleDSLConcreteTypeRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSLConcreteTypeRef"


    // $ANTLR start "ruleDSLConcreteTypeRef"
    // InternalCrossPlatform.g:3441:1: ruleDSLConcreteTypeRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDSLConcreteTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalCrossPlatform.g:3447:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalCrossPlatform.g:3448:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalCrossPlatform.g:3448:2: ( (otherlv_0= RULE_ID ) )
            // InternalCrossPlatform.g:3449:3: (otherlv_0= RULE_ID )
            {
            // InternalCrossPlatform.g:3449:3: (otherlv_0= RULE_ID )
            // InternalCrossPlatform.g:3450:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDSLConcreteTypeRefRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getDSLConcreteTypeRefAccess().getRefTypeCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSLConcreteTypeRef"


    // $ANTLR start "entryRuleDSLGenericTypeRef"
    // InternalCrossPlatform.g:3464:1: entryRuleDSLGenericTypeRef returns [EObject current=null] : iv_ruleDSLGenericTypeRef= ruleDSLGenericTypeRef EOF ;
    public final EObject entryRuleDSLGenericTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLGenericTypeRef = null;


        try {
            // InternalCrossPlatform.g:3464:58: (iv_ruleDSLGenericTypeRef= ruleDSLGenericTypeRef EOF )
            // InternalCrossPlatform.g:3465:2: iv_ruleDSLGenericTypeRef= ruleDSLGenericTypeRef EOF
            {
             newCompositeNode(grammarAccess.getDSLGenericTypeRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLGenericTypeRef=ruleDSLGenericTypeRef();

            state._fsp--;

             current =iv_ruleDSLGenericTypeRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSLGenericTypeRef"


    // $ANTLR start "ruleDSLGenericTypeRef"
    // InternalCrossPlatform.g:3471:1: ruleDSLGenericTypeRef returns [EObject current=null] : (otherlv_0= '<' ( (otherlv_1= RULE_ID ) ) otherlv_2= '>' ) ;
    public final EObject ruleDSLGenericTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCrossPlatform.g:3477:2: ( (otherlv_0= '<' ( (otherlv_1= RULE_ID ) ) otherlv_2= '>' ) )
            // InternalCrossPlatform.g:3478:2: (otherlv_0= '<' ( (otherlv_1= RULE_ID ) ) otherlv_2= '>' )
            {
            // InternalCrossPlatform.g:3478:2: (otherlv_0= '<' ( (otherlv_1= RULE_ID ) ) otherlv_2= '>' )
            // InternalCrossPlatform.g:3479:3: otherlv_0= '<' ( (otherlv_1= RULE_ID ) ) otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLGenericTypeRefAccess().getLessThanSignKeyword_0());
            		
            // InternalCrossPlatform.g:3483:3: ( (otherlv_1= RULE_ID ) )
            // InternalCrossPlatform.g:3484:4: (otherlv_1= RULE_ID )
            {
            // InternalCrossPlatform.g:3484:4: (otherlv_1= RULE_ID )
            // InternalCrossPlatform.g:3485:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLGenericTypeRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLGenericTypeRefAccess().getRefDSLGenericTypeCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLGenericTypeRefAccess().getGreaterThanSignKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSLGenericTypeRef"


    // $ANTLR start "entryRuleDSLGenericType"
    // InternalCrossPlatform.g:3504:1: entryRuleDSLGenericType returns [EObject current=null] : iv_ruleDSLGenericType= ruleDSLGenericType EOF ;
    public final EObject entryRuleDSLGenericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLGenericType = null;


        try {
            // InternalCrossPlatform.g:3504:55: (iv_ruleDSLGenericType= ruleDSLGenericType EOF )
            // InternalCrossPlatform.g:3505:2: iv_ruleDSLGenericType= ruleDSLGenericType EOF
            {
             newCompositeNode(grammarAccess.getDSLGenericTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLGenericType=ruleDSLGenericType();

            state._fsp--;

             current =iv_ruleDSLGenericType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSLGenericType"


    // $ANTLR start "ruleDSLGenericType"
    // InternalCrossPlatform.g:3511:1: ruleDSLGenericType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDSLGenericType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalCrossPlatform.g:3517:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalCrossPlatform.g:3518:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalCrossPlatform.g:3518:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalCrossPlatform.g:3519:3: (lv_name_0_0= RULE_ID )
            {
            // InternalCrossPlatform.g:3519:3: (lv_name_0_0= RULE_ID )
            // InternalCrossPlatform.g:3520:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getDSLGenericTypeAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDSLGenericTypeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSLGenericType"


    // $ANTLR start "entryRuleParameter"
    // InternalCrossPlatform.g:3539:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalCrossPlatform.g:3539:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalCrossPlatform.g:3540:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalCrossPlatform.g:3546:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDSLTypeRef ) ) ( (lv_col1_3_0= '[' ) )? ( (lv_array_4_0= RULE_INT ) )? ( (lv_col2_5_0= ']' ) )? (otherlv_6= '<' ( (otherlv_7= RULE_ID ) ) otherlv_8= '>' )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_col1_3_0=null;
        Token lv_array_4_0=null;
        Token lv_col2_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:3552:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDSLTypeRef ) ) ( (lv_col1_3_0= '[' ) )? ( (lv_array_4_0= RULE_INT ) )? ( (lv_col2_5_0= ']' ) )? (otherlv_6= '<' ( (otherlv_7= RULE_ID ) ) otherlv_8= '>' )? ) )
            // InternalCrossPlatform.g:3553:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDSLTypeRef ) ) ( (lv_col1_3_0= '[' ) )? ( (lv_array_4_0= RULE_INT ) )? ( (lv_col2_5_0= ']' ) )? (otherlv_6= '<' ( (otherlv_7= RULE_ID ) ) otherlv_8= '>' )? )
            {
            // InternalCrossPlatform.g:3553:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDSLTypeRef ) ) ( (lv_col1_3_0= '[' ) )? ( (lv_array_4_0= RULE_INT ) )? ( (lv_col2_5_0= ']' ) )? (otherlv_6= '<' ( (otherlv_7= RULE_ID ) ) otherlv_8= '>' )? )
            // InternalCrossPlatform.g:3554:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDSLTypeRef ) ) ( (lv_col1_3_0= '[' ) )? ( (lv_array_4_0= RULE_INT ) )? ( (lv_col2_5_0= ']' ) )? (otherlv_6= '<' ( (otherlv_7= RULE_ID ) ) otherlv_8= '>' )?
            {
            // InternalCrossPlatform.g:3554:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCrossPlatform.g:3555:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCrossPlatform.g:3555:4: (lv_name_0_0= RULE_ID )
            // InternalCrossPlatform.g:3556:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalCrossPlatform.g:3576:3: ( (lv_type_2_0= ruleDSLTypeRef ) )
            // InternalCrossPlatform.g:3577:4: (lv_type_2_0= ruleDSLTypeRef )
            {
            // InternalCrossPlatform.g:3577:4: (lv_type_2_0= ruleDSLTypeRef )
            // InternalCrossPlatform.g:3578:5: lv_type_2_0= ruleDSLTypeRef
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeDSLTypeRefParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_type_2_0=ruleDSLTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"br.dslcross.crossplatform.CrossPlatform.DSLTypeRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCrossPlatform.g:3595:3: ( (lv_col1_3_0= '[' ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==30) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalCrossPlatform.g:3596:4: (lv_col1_3_0= '[' )
                    {
                    // InternalCrossPlatform.g:3596:4: (lv_col1_3_0= '[' )
                    // InternalCrossPlatform.g:3597:5: lv_col1_3_0= '['
                    {
                    lv_col1_3_0=(Token)match(input,30,FOLLOW_26); 

                    					newLeafNode(lv_col1_3_0, grammarAccess.getParameterAccess().getCol1LeftSquareBracketKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterRule());
                    					}
                    					setWithLastConsumed(current, "col1", lv_col1_3_0, "[");
                    				

                    }


                    }
                    break;

            }

            // InternalCrossPlatform.g:3609:3: ( (lv_array_4_0= RULE_INT ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==RULE_INT) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalCrossPlatform.g:3610:4: (lv_array_4_0= RULE_INT )
                    {
                    // InternalCrossPlatform.g:3610:4: (lv_array_4_0= RULE_INT )
                    // InternalCrossPlatform.g:3611:5: lv_array_4_0= RULE_INT
                    {
                    lv_array_4_0=(Token)match(input,RULE_INT,FOLLOW_27); 

                    					newLeafNode(lv_array_4_0, grammarAccess.getParameterAccess().getArrayINTTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"array",
                    						lv_array_4_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            // InternalCrossPlatform.g:3627:3: ( (lv_col2_5_0= ']' ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==31) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalCrossPlatform.g:3628:4: (lv_col2_5_0= ']' )
                    {
                    // InternalCrossPlatform.g:3628:4: (lv_col2_5_0= ']' )
                    // InternalCrossPlatform.g:3629:5: lv_col2_5_0= ']'
                    {
                    lv_col2_5_0=(Token)match(input,31,FOLLOW_22); 

                    					newLeafNode(lv_col2_5_0, grammarAccess.getParameterAccess().getCol2RightSquareBracketKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterRule());
                    					}
                    					setWithLastConsumed(current, "col2", lv_col2_5_0, "]");
                    				

                    }


                    }
                    break;

            }

            // InternalCrossPlatform.g:3641:3: (otherlv_6= '<' ( (otherlv_7= RULE_ID ) ) otherlv_8= '>' )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==25) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalCrossPlatform.g:3642:4: otherlv_6= '<' ( (otherlv_7= RULE_ID ) ) otherlv_8= '>'
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getLessThanSignKeyword_6_0());
                    			
                    // InternalCrossPlatform.g:3646:4: ( (otherlv_7= RULE_ID ) )
                    // InternalCrossPlatform.g:3647:5: (otherlv_7= RULE_ID )
                    {
                    // InternalCrossPlatform.g:3647:5: (otherlv_7= RULE_ID )
                    // InternalCrossPlatform.g:3648:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_7, grammarAccess.getParameterAccess().getRefTypeCrossReference_6_1_0());
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getGreaterThanSignKeyword_6_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleCommandOperation"
    // InternalCrossPlatform.g:3668:1: entryRuleCommandOperation returns [EObject current=null] : iv_ruleCommandOperation= ruleCommandOperation EOF ;
    public final EObject entryRuleCommandOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandOperation = null;


        try {
            // InternalCrossPlatform.g:3668:57: (iv_ruleCommandOperation= ruleCommandOperation EOF )
            // InternalCrossPlatform.g:3669:2: iv_ruleCommandOperation= ruleCommandOperation EOF
            {
             newCompositeNode(grammarAccess.getCommandOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandOperation=ruleCommandOperation();

            state._fsp--;

             current =iv_ruleCommandOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommandOperation"


    // $ANTLR start "ruleCommandOperation"
    // InternalCrossPlatform.g:3675:1: ruleCommandOperation returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_StringTemplateFreeCod_1= ruleStringTemplateFreeCod | this_AbrevCmd_2= ruleAbrevCmd | this_MethodCallCmd_3= ruleMethodCallCmd | this_MethodCallGlobal_4= ruleMethodCallGlobal | this_CallAttributeObject_5= ruleCallAttributeObject | this_OpLogicoWhile_6= ruleOpLogicoWhile | this_OpLogicoDoWhile_7= ruleOpLogicoDoWhile | this_OpLogicoIF_8= ruleOpLogicoIF | this_OpLogicoFor_9= ruleOpLogicoFor | this_EntityGlobCall_10= ruleEntityGlobCall | this_SpecialCommand_11= ruleSpecialCommand ) ;
    public final EObject ruleCommandOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_StringTemplateFreeCod_1 = null;

        EObject this_AbrevCmd_2 = null;

        EObject this_MethodCallCmd_3 = null;

        EObject this_MethodCallGlobal_4 = null;

        EObject this_CallAttributeObject_5 = null;

        EObject this_OpLogicoWhile_6 = null;

        EObject this_OpLogicoDoWhile_7 = null;

        EObject this_OpLogicoIF_8 = null;

        EObject this_OpLogicoFor_9 = null;

        EObject this_EntityGlobCall_10 = null;

        EObject this_SpecialCommand_11 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:3681:2: ( (this_Attribute_0= ruleAttribute | this_StringTemplateFreeCod_1= ruleStringTemplateFreeCod | this_AbrevCmd_2= ruleAbrevCmd | this_MethodCallCmd_3= ruleMethodCallCmd | this_MethodCallGlobal_4= ruleMethodCallGlobal | this_CallAttributeObject_5= ruleCallAttributeObject | this_OpLogicoWhile_6= ruleOpLogicoWhile | this_OpLogicoDoWhile_7= ruleOpLogicoDoWhile | this_OpLogicoIF_8= ruleOpLogicoIF | this_OpLogicoFor_9= ruleOpLogicoFor | this_EntityGlobCall_10= ruleEntityGlobCall | this_SpecialCommand_11= ruleSpecialCommand ) )
            // InternalCrossPlatform.g:3682:2: (this_Attribute_0= ruleAttribute | this_StringTemplateFreeCod_1= ruleStringTemplateFreeCod | this_AbrevCmd_2= ruleAbrevCmd | this_MethodCallCmd_3= ruleMethodCallCmd | this_MethodCallGlobal_4= ruleMethodCallGlobal | this_CallAttributeObject_5= ruleCallAttributeObject | this_OpLogicoWhile_6= ruleOpLogicoWhile | this_OpLogicoDoWhile_7= ruleOpLogicoDoWhile | this_OpLogicoIF_8= ruleOpLogicoIF | this_OpLogicoFor_9= ruleOpLogicoFor | this_EntityGlobCall_10= ruleEntityGlobCall | this_SpecialCommand_11= ruleSpecialCommand )
            {
            // InternalCrossPlatform.g:3682:2: (this_Attribute_0= ruleAttribute | this_StringTemplateFreeCod_1= ruleStringTemplateFreeCod | this_AbrevCmd_2= ruleAbrevCmd | this_MethodCallCmd_3= ruleMethodCallCmd | this_MethodCallGlobal_4= ruleMethodCallGlobal | this_CallAttributeObject_5= ruleCallAttributeObject | this_OpLogicoWhile_6= ruleOpLogicoWhile | this_OpLogicoDoWhile_7= ruleOpLogicoDoWhile | this_OpLogicoIF_8= ruleOpLogicoIF | this_OpLogicoFor_9= ruleOpLogicoFor | this_EntityGlobCall_10= ruleEntityGlobCall | this_SpecialCommand_11= ruleSpecialCommand )
            int alt104=12;
            alt104 = dfa104.predict(input);
            switch (alt104) {
                case 1 :
                    // InternalCrossPlatform.g:3683:3: this_Attribute_0= ruleAttribute
                    {

                    			newCompositeNode(grammarAccess.getCommandOperationAccess().getAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attribute_0=ruleAttribute();

                    state._fsp--;


                    			current = this_Attribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCrossPlatform.g:3692:3: this_StringTemplateFreeCod_1= ruleStringTemplateFreeCod
                    {

                    			newCompositeNode(grammarAccess.getCommandOperationAccess().getStringTemplateFreeCodParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringTemplateFreeCod_1=ruleStringTemplateFreeCod();

                    state._fsp--;


                    			current = this_StringTemplateFreeCod_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCrossPlatform.g:3701:3: this_AbrevCmd_2= ruleAbrevCmd
                    {

                    			newCompositeNode(grammarAccess.getCommandOperationAccess().getAbrevCmdParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbrevCmd_2=ruleAbrevCmd();

                    state._fsp--;


                    			current = this_AbrevCmd_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCrossPlatform.g:3710:3: this_MethodCallCmd_3= ruleMethodCallCmd
                    {

                    			newCompositeNode(grammarAccess.getCommandOperationAccess().getMethodCallCmdParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MethodCallCmd_3=ruleMethodCallCmd();

                    state._fsp--;


                    			current = this_MethodCallCmd_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalCrossPlatform.g:3719:3: this_MethodCallGlobal_4= ruleMethodCallGlobal
                    {

                    			newCompositeNode(grammarAccess.getCommandOperationAccess().getMethodCallGlobalParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MethodCallGlobal_4=ruleMethodCallGlobal();

                    state._fsp--;


                    			current = this_MethodCallGlobal_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalCrossPlatform.g:3728:3: this_CallAttributeObject_5= ruleCallAttributeObject
                    {

                    			newCompositeNode(grammarAccess.getCommandOperationAccess().getCallAttributeObjectParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_CallAttributeObject_5=ruleCallAttributeObject();

                    state._fsp--;


                    			current = this_CallAttributeObject_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalCrossPlatform.g:3737:3: this_OpLogicoWhile_6= ruleOpLogicoWhile
                    {

                    			newCompositeNode(grammarAccess.getCommandOperationAccess().getOpLogicoWhileParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpLogicoWhile_6=ruleOpLogicoWhile();

                    state._fsp--;


                    			current = this_OpLogicoWhile_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalCrossPlatform.g:3746:3: this_OpLogicoDoWhile_7= ruleOpLogicoDoWhile
                    {

                    			newCompositeNode(grammarAccess.getCommandOperationAccess().getOpLogicoDoWhileParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpLogicoDoWhile_7=ruleOpLogicoDoWhile();

                    state._fsp--;


                    			current = this_OpLogicoDoWhile_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalCrossPlatform.g:3755:3: this_OpLogicoIF_8= ruleOpLogicoIF
                    {

                    			newCompositeNode(grammarAccess.getCommandOperationAccess().getOpLogicoIFParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpLogicoIF_8=ruleOpLogicoIF();

                    state._fsp--;


                    			current = this_OpLogicoIF_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalCrossPlatform.g:3764:3: this_OpLogicoFor_9= ruleOpLogicoFor
                    {

                    			newCompositeNode(grammarAccess.getCommandOperationAccess().getOpLogicoForParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpLogicoFor_9=ruleOpLogicoFor();

                    state._fsp--;


                    			current = this_OpLogicoFor_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalCrossPlatform.g:3773:3: this_EntityGlobCall_10= ruleEntityGlobCall
                    {

                    			newCompositeNode(grammarAccess.getCommandOperationAccess().getEntityGlobCallParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityGlobCall_10=ruleEntityGlobCall();

                    state._fsp--;


                    			current = this_EntityGlobCall_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalCrossPlatform.g:3782:3: this_SpecialCommand_11= ruleSpecialCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandOperationAccess().getSpecialCommandParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_SpecialCommand_11=ruleSpecialCommand();

                    state._fsp--;


                    			current = this_SpecialCommand_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandOperation"


    // $ANTLR start "entryRuleSpecialCommand"
    // InternalCrossPlatform.g:3794:1: entryRuleSpecialCommand returns [EObject current=null] : iv_ruleSpecialCommand= ruleSpecialCommand EOF ;
    public final EObject entryRuleSpecialCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialCommand = null;


        try {
            // InternalCrossPlatform.g:3794:55: (iv_ruleSpecialCommand= ruleSpecialCommand EOF )
            // InternalCrossPlatform.g:3795:2: iv_ruleSpecialCommand= ruleSpecialCommand EOF
            {
             newCompositeNode(grammarAccess.getSpecialCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecialCommand=ruleSpecialCommand();

            state._fsp--;

             current =iv_ruleSpecialCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecialCommand"


    // $ANTLR start "ruleSpecialCommand"
    // InternalCrossPlatform.g:3801:1: ruleSpecialCommand returns [EObject current=null] : ( ( (lv_command_0_0= 'break' ) ) | (otherlv_1= 'return' ( (otherlv_2= RULE_ID ) ) ) | ( (lv_commandCont_3_0= 'continue' ) ) ) ;
    public final EObject ruleSpecialCommand() throws RecognitionException {
        EObject current = null;

        Token lv_command_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_commandCont_3_0=null;


        	enterRule();

        try {
            // InternalCrossPlatform.g:3807:2: ( ( ( (lv_command_0_0= 'break' ) ) | (otherlv_1= 'return' ( (otherlv_2= RULE_ID ) ) ) | ( (lv_commandCont_3_0= 'continue' ) ) ) )
            // InternalCrossPlatform.g:3808:2: ( ( (lv_command_0_0= 'break' ) ) | (otherlv_1= 'return' ( (otherlv_2= RULE_ID ) ) ) | ( (lv_commandCont_3_0= 'continue' ) ) )
            {
            // InternalCrossPlatform.g:3808:2: ( ( (lv_command_0_0= 'break' ) ) | (otherlv_1= 'return' ( (otherlv_2= RULE_ID ) ) ) | ( (lv_commandCont_3_0= 'continue' ) ) )
            int alt105=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt105=1;
                }
                break;
            case 50:
                {
                alt105=2;
                }
                break;
            case 51:
                {
                alt105=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // InternalCrossPlatform.g:3809:3: ( (lv_command_0_0= 'break' ) )
                    {
                    // InternalCrossPlatform.g:3809:3: ( (lv_command_0_0= 'break' ) )
                    // InternalCrossPlatform.g:3810:4: (lv_command_0_0= 'break' )
                    {
                    // InternalCrossPlatform.g:3810:4: (lv_command_0_0= 'break' )
                    // InternalCrossPlatform.g:3811:5: lv_command_0_0= 'break'
                    {
                    lv_command_0_0=(Token)match(input,49,FOLLOW_2); 

                    					newLeafNode(lv_command_0_0, grammarAccess.getSpecialCommandAccess().getCommandBreakKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSpecialCommandRule());
                    					}
                    					setWithLastConsumed(current, "command", lv_command_0_0, "break");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCrossPlatform.g:3824:3: (otherlv_1= 'return' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // InternalCrossPlatform.g:3824:3: (otherlv_1= 'return' ( (otherlv_2= RULE_ID ) ) )
                    // InternalCrossPlatform.g:3825:4: otherlv_1= 'return' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getSpecialCommandAccess().getReturnKeyword_1_0());
                    			
                    // InternalCrossPlatform.g:3829:4: ( (otherlv_2= RULE_ID ) )
                    // InternalCrossPlatform.g:3830:5: (otherlv_2= RULE_ID )
                    {
                    // InternalCrossPlatform.g:3830:5: (otherlv_2= RULE_ID )
                    // InternalCrossPlatform.g:3831:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSpecialCommandRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_2, grammarAccess.getSpecialCommandAccess().getAttrAttributeCrossReference_1_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCrossPlatform.g:3844:3: ( (lv_commandCont_3_0= 'continue' ) )
                    {
                    // InternalCrossPlatform.g:3844:3: ( (lv_commandCont_3_0= 'continue' ) )
                    // InternalCrossPlatform.g:3845:4: (lv_commandCont_3_0= 'continue' )
                    {
                    // InternalCrossPlatform.g:3845:4: (lv_commandCont_3_0= 'continue' )
                    // InternalCrossPlatform.g:3846:5: lv_commandCont_3_0= 'continue'
                    {
                    lv_commandCont_3_0=(Token)match(input,51,FOLLOW_2); 

                    					newLeafNode(lv_commandCont_3_0, grammarAccess.getSpecialCommandAccess().getCommandContContinueKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSpecialCommandRule());
                    					}
                    					setWithLastConsumed(current, "commandCont", lv_commandCont_3_0, "continue");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecialCommand"


    // $ANTLR start "entryRuleStringTemplateFreeCod"
    // InternalCrossPlatform.g:3862:1: entryRuleStringTemplateFreeCod returns [EObject current=null] : iv_ruleStringTemplateFreeCod= ruleStringTemplateFreeCod EOF ;
    public final EObject entryRuleStringTemplateFreeCod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringTemplateFreeCod = null;


        try {
            // InternalCrossPlatform.g:3862:62: (iv_ruleStringTemplateFreeCod= ruleStringTemplateFreeCod EOF )
            // InternalCrossPlatform.g:3863:2: iv_ruleStringTemplateFreeCod= ruleStringTemplateFreeCod EOF
            {
             newCompositeNode(grammarAccess.getStringTemplateFreeCodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringTemplateFreeCod=ruleStringTemplateFreeCod();

            state._fsp--;

             current =iv_ruleStringTemplateFreeCod; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringTemplateFreeCod"


    // $ANTLR start "ruleStringTemplateFreeCod"
    // InternalCrossPlatform.g:3869:1: ruleStringTemplateFreeCod returns [EObject current=null] : ( (lv_value_0_0= RULE_STRINGTEMPLATE ) ) ;
    public final EObject ruleStringTemplateFreeCod() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalCrossPlatform.g:3875:2: ( ( (lv_value_0_0= RULE_STRINGTEMPLATE ) ) )
            // InternalCrossPlatform.g:3876:2: ( (lv_value_0_0= RULE_STRINGTEMPLATE ) )
            {
            // InternalCrossPlatform.g:3876:2: ( (lv_value_0_0= RULE_STRINGTEMPLATE ) )
            // InternalCrossPlatform.g:3877:3: (lv_value_0_0= RULE_STRINGTEMPLATE )
            {
            // InternalCrossPlatform.g:3877:3: (lv_value_0_0= RULE_STRINGTEMPLATE )
            // InternalCrossPlatform.g:3878:4: lv_value_0_0= RULE_STRINGTEMPLATE
            {
            lv_value_0_0=(Token)match(input,RULE_STRINGTEMPLATE,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringTemplateFreeCodAccess().getValueSTRINGTEMPLATETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringTemplateFreeCodRule());
            				}
            				addWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"br.dslcross.crossplatform.CrossPlatform.STRINGTEMPLATE");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringTemplateFreeCod"


    // $ANTLR start "entryRuleAbrevCmd"
    // InternalCrossPlatform.g:3897:1: entryRuleAbrevCmd returns [EObject current=null] : iv_ruleAbrevCmd= ruleAbrevCmd EOF ;
    public final EObject entryRuleAbrevCmd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbrevCmd = null;


        try {
            // InternalCrossPlatform.g:3897:49: (iv_ruleAbrevCmd= ruleAbrevCmd EOF )
            // InternalCrossPlatform.g:3898:2: iv_ruleAbrevCmd= ruleAbrevCmd EOF
            {
             newCompositeNode(grammarAccess.getAbrevCmdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbrevCmd=ruleAbrevCmd();

            state._fsp--;

             current =iv_ruleAbrevCmd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbrevCmd"


    // $ANTLR start "ruleAbrevCmd"
    // InternalCrossPlatform.g:3904:1: ruleAbrevCmd returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_OpIn_1_1= '++' | lv_OpIn_1_2= '--' ) ) ) ) | ( ( (otherlv_2= RULE_ID ) ) ( ( (lv_OpIn_3_1= '+=' | lv_OpIn_3_2= '-=' ) ) ) ( (lv_expr3_4_0= ruleExprArit ) ) ) | this_AssignmentCmdFor_5= ruleAssignmentCmdFor ) ;
    public final EObject ruleAbrevCmd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_OpIn_1_1=null;
        Token lv_OpIn_1_2=null;
        Token otherlv_2=null;
        Token lv_OpIn_3_1=null;
        Token lv_OpIn_3_2=null;
        EObject lv_expr3_4_0 = null;

        EObject this_AssignmentCmdFor_5 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:3910:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_OpIn_1_1= '++' | lv_OpIn_1_2= '--' ) ) ) ) | ( ( (otherlv_2= RULE_ID ) ) ( ( (lv_OpIn_3_1= '+=' | lv_OpIn_3_2= '-=' ) ) ) ( (lv_expr3_4_0= ruleExprArit ) ) ) | this_AssignmentCmdFor_5= ruleAssignmentCmdFor ) )
            // InternalCrossPlatform.g:3911:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_OpIn_1_1= '++' | lv_OpIn_1_2= '--' ) ) ) ) | ( ( (otherlv_2= RULE_ID ) ) ( ( (lv_OpIn_3_1= '+=' | lv_OpIn_3_2= '-=' ) ) ) ( (lv_expr3_4_0= ruleExprArit ) ) ) | this_AssignmentCmdFor_5= ruleAssignmentCmdFor )
            {
            // InternalCrossPlatform.g:3911:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_OpIn_1_1= '++' | lv_OpIn_1_2= '--' ) ) ) ) | ( ( (otherlv_2= RULE_ID ) ) ( ( (lv_OpIn_3_1= '+=' | lv_OpIn_3_2= '-=' ) ) ) ( (lv_expr3_4_0= ruleExprArit ) ) ) | this_AssignmentCmdFor_5= ruleAssignmentCmdFor )
            int alt108=3;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 52:
                case 53:
                    {
                    alt108=1;
                    }
                    break;
                case 73:
                    {
                    alt108=3;
                    }
                    break;
                case 54:
                case 55:
                    {
                    alt108=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 108, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // InternalCrossPlatform.g:3912:3: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_OpIn_1_1= '++' | lv_OpIn_1_2= '--' ) ) ) )
                    {
                    // InternalCrossPlatform.g:3912:3: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_OpIn_1_1= '++' | lv_OpIn_1_2= '--' ) ) ) )
                    // InternalCrossPlatform.g:3913:4: ( (otherlv_0= RULE_ID ) ) ( ( (lv_OpIn_1_1= '++' | lv_OpIn_1_2= '--' ) ) )
                    {
                    // InternalCrossPlatform.g:3913:4: ( (otherlv_0= RULE_ID ) )
                    // InternalCrossPlatform.g:3914:5: (otherlv_0= RULE_ID )
                    {
                    // InternalCrossPlatform.g:3914:5: (otherlv_0= RULE_ID )
                    // InternalCrossPlatform.g:3915:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAbrevCmdRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_46); 

                    						newLeafNode(otherlv_0, grammarAccess.getAbrevCmdAccess().getExpr1AttributeCrossReference_0_0_0());
                    					

                    }


                    }

                    // InternalCrossPlatform.g:3926:4: ( ( (lv_OpIn_1_1= '++' | lv_OpIn_1_2= '--' ) ) )
                    // InternalCrossPlatform.g:3927:5: ( (lv_OpIn_1_1= '++' | lv_OpIn_1_2= '--' ) )
                    {
                    // InternalCrossPlatform.g:3927:5: ( (lv_OpIn_1_1= '++' | lv_OpIn_1_2= '--' ) )
                    // InternalCrossPlatform.g:3928:6: (lv_OpIn_1_1= '++' | lv_OpIn_1_2= '--' )
                    {
                    // InternalCrossPlatform.g:3928:6: (lv_OpIn_1_1= '++' | lv_OpIn_1_2= '--' )
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==52) ) {
                        alt106=1;
                    }
                    else if ( (LA106_0==53) ) {
                        alt106=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 106, 0, input);

                        throw nvae;
                    }
                    switch (alt106) {
                        case 1 :
                            // InternalCrossPlatform.g:3929:7: lv_OpIn_1_1= '++'
                            {
                            lv_OpIn_1_1=(Token)match(input,52,FOLLOW_2); 

                            							newLeafNode(lv_OpIn_1_1, grammarAccess.getAbrevCmdAccess().getOpInPlusSignPlusSignKeyword_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAbrevCmdRule());
                            							}
                            							setWithLastConsumed(current, "OpIn", lv_OpIn_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalCrossPlatform.g:3940:7: lv_OpIn_1_2= '--'
                            {
                            lv_OpIn_1_2=(Token)match(input,53,FOLLOW_2); 

                            							newLeafNode(lv_OpIn_1_2, grammarAccess.getAbrevCmdAccess().getOpInHyphenMinusHyphenMinusKeyword_0_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAbrevCmdRule());
                            							}
                            							setWithLastConsumed(current, "OpIn", lv_OpIn_1_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCrossPlatform.g:3955:3: ( ( (otherlv_2= RULE_ID ) ) ( ( (lv_OpIn_3_1= '+=' | lv_OpIn_3_2= '-=' ) ) ) ( (lv_expr3_4_0= ruleExprArit ) ) )
                    {
                    // InternalCrossPlatform.g:3955:3: ( ( (otherlv_2= RULE_ID ) ) ( ( (lv_OpIn_3_1= '+=' | lv_OpIn_3_2= '-=' ) ) ) ( (lv_expr3_4_0= ruleExprArit ) ) )
                    // InternalCrossPlatform.g:3956:4: ( (otherlv_2= RULE_ID ) ) ( ( (lv_OpIn_3_1= '+=' | lv_OpIn_3_2= '-=' ) ) ) ( (lv_expr3_4_0= ruleExprArit ) )
                    {
                    // InternalCrossPlatform.g:3956:4: ( (otherlv_2= RULE_ID ) )
                    // InternalCrossPlatform.g:3957:5: (otherlv_2= RULE_ID )
                    {
                    // InternalCrossPlatform.g:3957:5: (otherlv_2= RULE_ID )
                    // InternalCrossPlatform.g:3958:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAbrevCmdRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_47); 

                    						newLeafNode(otherlv_2, grammarAccess.getAbrevCmdAccess().getExpr2AttributeCrossReference_1_0_0());
                    					

                    }


                    }

                    // InternalCrossPlatform.g:3969:4: ( ( (lv_OpIn_3_1= '+=' | lv_OpIn_3_2= '-=' ) ) )
                    // InternalCrossPlatform.g:3970:5: ( (lv_OpIn_3_1= '+=' | lv_OpIn_3_2= '-=' ) )
                    {
                    // InternalCrossPlatform.g:3970:5: ( (lv_OpIn_3_1= '+=' | lv_OpIn_3_2= '-=' ) )
                    // InternalCrossPlatform.g:3971:6: (lv_OpIn_3_1= '+=' | lv_OpIn_3_2= '-=' )
                    {
                    // InternalCrossPlatform.g:3971:6: (lv_OpIn_3_1= '+=' | lv_OpIn_3_2= '-=' )
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==54) ) {
                        alt107=1;
                    }
                    else if ( (LA107_0==55) ) {
                        alt107=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 107, 0, input);

                        throw nvae;
                    }
                    switch (alt107) {
                        case 1 :
                            // InternalCrossPlatform.g:3972:7: lv_OpIn_3_1= '+='
                            {
                            lv_OpIn_3_1=(Token)match(input,54,FOLLOW_40); 

                            							newLeafNode(lv_OpIn_3_1, grammarAccess.getAbrevCmdAccess().getOpInPlusSignEqualsSignKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAbrevCmdRule());
                            							}
                            							setWithLastConsumed(current, "OpIn", lv_OpIn_3_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalCrossPlatform.g:3983:7: lv_OpIn_3_2= '-='
                            {
                            lv_OpIn_3_2=(Token)match(input,55,FOLLOW_40); 

                            							newLeafNode(lv_OpIn_3_2, grammarAccess.getAbrevCmdAccess().getOpInHyphenMinusEqualsSignKeyword_1_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAbrevCmdRule());
                            							}
                            							setWithLastConsumed(current, "OpIn", lv_OpIn_3_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalCrossPlatform.g:3996:4: ( (lv_expr3_4_0= ruleExprArit ) )
                    // InternalCrossPlatform.g:3997:5: (lv_expr3_4_0= ruleExprArit )
                    {
                    // InternalCrossPlatform.g:3997:5: (lv_expr3_4_0= ruleExprArit )
                    // InternalCrossPlatform.g:3998:6: lv_expr3_4_0= ruleExprArit
                    {

                    						newCompositeNode(grammarAccess.getAbrevCmdAccess().getExpr3ExprAritParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expr3_4_0=ruleExprArit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAbrevCmdRule());
                    						}
                    						set(
                    							current,
                    							"expr3",
                    							lv_expr3_4_0,
                    							"br.dslcross.crossplatform.CrossPlatform.ExprArit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCrossPlatform.g:4017:3: this_AssignmentCmdFor_5= ruleAssignmentCmdFor
                    {

                    			newCompositeNode(grammarAccess.getAbrevCmdAccess().getAssignmentCmdForParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssignmentCmdFor_5=ruleAssignmentCmdFor();

                    state._fsp--;


                    			current = this_AssignmentCmdFor_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbrevCmd"


    // $ANTLR start "entryRuleMethodCallCmd"
    // InternalCrossPlatform.g:4029:1: entryRuleMethodCallCmd returns [EObject current=null] : iv_ruleMethodCallCmd= ruleMethodCallCmd EOF ;
    public final EObject entryRuleMethodCallCmd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCallCmd = null;


        try {
            // InternalCrossPlatform.g:4029:54: (iv_ruleMethodCallCmd= ruleMethodCallCmd EOF )
            // InternalCrossPlatform.g:4030:2: iv_ruleMethodCallCmd= ruleMethodCallCmd EOF
            {
             newCompositeNode(grammarAccess.getMethodCallCmdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodCallCmd=ruleMethodCallCmd();

            state._fsp--;

             current =iv_ruleMethodCallCmd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodCallCmd"


    // $ANTLR start "ruleMethodCallCmd"
    // InternalCrossPlatform.g:4036:1: ruleMethodCallCmd returns [EObject current=null] : ( ( (lv_obj_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_call_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleAttributeCall ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAttributeCall ) ) )* )? otherlv_7= ')' )* )+ ) ;
    public final EObject ruleMethodCallCmd() throws RecognitionException {
        EObject current = null;

        Token lv_obj_0_0=null;
        Token otherlv_1=null;
        Token lv_call_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_args_4_0 = null;

        EObject lv_args_6_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:4042:2: ( ( ( (lv_obj_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_call_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleAttributeCall ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAttributeCall ) ) )* )? otherlv_7= ')' )* )+ ) )
            // InternalCrossPlatform.g:4043:2: ( ( (lv_obj_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_call_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleAttributeCall ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAttributeCall ) ) )* )? otherlv_7= ')' )* )+ )
            {
            // InternalCrossPlatform.g:4043:2: ( ( (lv_obj_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_call_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleAttributeCall ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAttributeCall ) ) )* )? otherlv_7= ')' )* )+ )
            // InternalCrossPlatform.g:4044:3: ( (lv_obj_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_call_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleAttributeCall ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAttributeCall ) ) )* )? otherlv_7= ')' )* )+
            {
            // InternalCrossPlatform.g:4044:3: ( (lv_obj_0_0= RULE_ID ) )
            // InternalCrossPlatform.g:4045:4: (lv_obj_0_0= RULE_ID )
            {
            // InternalCrossPlatform.g:4045:4: (lv_obj_0_0= RULE_ID )
            // InternalCrossPlatform.g:4046:5: lv_obj_0_0= RULE_ID
            {
            lv_obj_0_0=(Token)match(input,RULE_ID,FOLLOW_48); 

            					newLeafNode(lv_obj_0_0, grammarAccess.getMethodCallCmdAccess().getObjIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodCallCmdRule());
            					}
            					setWithLastConsumed(
            						current,
            						"obj",
            						lv_obj_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCrossPlatform.g:4062:3: (otherlv_1= '.' ( (lv_call_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleAttributeCall ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAttributeCall ) ) )* )? otherlv_7= ')' )* )+
            int cnt112=0;
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==15) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // InternalCrossPlatform.g:4063:4: otherlv_1= '.' ( (lv_call_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleAttributeCall ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAttributeCall ) ) )* )? otherlv_7= ')' )*
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getMethodCallCmdAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalCrossPlatform.g:4067:4: ( (lv_call_2_0= RULE_ID ) )
            	    // InternalCrossPlatform.g:4068:5: (lv_call_2_0= RULE_ID )
            	    {
            	    // InternalCrossPlatform.g:4068:5: (lv_call_2_0= RULE_ID )
            	    // InternalCrossPlatform.g:4069:6: lv_call_2_0= RULE_ID
            	    {
            	    lv_call_2_0=(Token)match(input,RULE_ID,FOLLOW_49); 

            	    						newLeafNode(lv_call_2_0, grammarAccess.getMethodCallCmdAccess().getCallIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMethodCallCmdRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"call",
            	    							lv_call_2_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalCrossPlatform.g:4085:4: (otherlv_3= '(' ( ( (lv_args_4_0= ruleAttributeCall ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAttributeCall ) ) )* )? otherlv_7= ')' )*
            	    loop111:
            	    do {
            	        int alt111=2;
            	        int LA111_0 = input.LA(1);

            	        if ( (LA111_0==28) ) {
            	            alt111=1;
            	        }


            	        switch (alt111) {
            	    	case 1 :
            	    	    // InternalCrossPlatform.g:4086:5: otherlv_3= '(' ( ( (lv_args_4_0= ruleAttributeCall ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAttributeCall ) ) )* )? otherlv_7= ')'
            	    	    {
            	    	    otherlv_3=(Token)match(input,28,FOLLOW_15); 

            	    	    					newLeafNode(otherlv_3, grammarAccess.getMethodCallCmdAccess().getLeftParenthesisKeyword_1_2_0());
            	    	    				
            	    	    // InternalCrossPlatform.g:4090:5: ( ( (lv_args_4_0= ruleAttributeCall ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAttributeCall ) ) )* )?
            	    	    int alt110=2;
            	    	    int LA110_0 = input.LA(1);

            	    	    if ( (LA110_0==RULE_ID) ) {
            	    	        alt110=1;
            	    	    }
            	    	    switch (alt110) {
            	    	        case 1 :
            	    	            // InternalCrossPlatform.g:4091:6: ( (lv_args_4_0= ruleAttributeCall ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAttributeCall ) ) )*
            	    	            {
            	    	            // InternalCrossPlatform.g:4091:6: ( (lv_args_4_0= ruleAttributeCall ) )
            	    	            // InternalCrossPlatform.g:4092:7: (lv_args_4_0= ruleAttributeCall )
            	    	            {
            	    	            // InternalCrossPlatform.g:4092:7: (lv_args_4_0= ruleAttributeCall )
            	    	            // InternalCrossPlatform.g:4093:8: lv_args_4_0= ruleAttributeCall
            	    	            {

            	    	            								newCompositeNode(grammarAccess.getMethodCallCmdAccess().getArgsAttributeCallParserRuleCall_1_2_1_0_0());
            	    	            							
            	    	            pushFollow(FOLLOW_16);
            	    	            lv_args_4_0=ruleAttributeCall();

            	    	            state._fsp--;


            	    	            								if (current==null) {
            	    	            									current = createModelElementForParent(grammarAccess.getMethodCallCmdRule());
            	    	            								}
            	    	            								add(
            	    	            									current,
            	    	            									"args",
            	    	            									lv_args_4_0,
            	    	            									"br.dslcross.crossplatform.CrossPlatform.AttributeCall");
            	    	            								afterParserOrEnumRuleCall();
            	    	            							

            	    	            }


            	    	            }

            	    	            // InternalCrossPlatform.g:4110:6: (otherlv_5= ',' ( (lv_args_6_0= ruleAttributeCall ) ) )*
            	    	            loop109:
            	    	            do {
            	    	                int alt109=2;
            	    	                int LA109_0 = input.LA(1);

            	    	                if ( (LA109_0==26) ) {
            	    	                    alt109=1;
            	    	                }


            	    	                switch (alt109) {
            	    	            	case 1 :
            	    	            	    // InternalCrossPlatform.g:4111:7: otherlv_5= ',' ( (lv_args_6_0= ruleAttributeCall ) )
            	    	            	    {
            	    	            	    otherlv_5=(Token)match(input,26,FOLLOW_4); 

            	    	            	    							newLeafNode(otherlv_5, grammarAccess.getMethodCallCmdAccess().getCommaKeyword_1_2_1_1_0());
            	    	            	    						
            	    	            	    // InternalCrossPlatform.g:4115:7: ( (lv_args_6_0= ruleAttributeCall ) )
            	    	            	    // InternalCrossPlatform.g:4116:8: (lv_args_6_0= ruleAttributeCall )
            	    	            	    {
            	    	            	    // InternalCrossPlatform.g:4116:8: (lv_args_6_0= ruleAttributeCall )
            	    	            	    // InternalCrossPlatform.g:4117:9: lv_args_6_0= ruleAttributeCall
            	    	            	    {

            	    	            	    									newCompositeNode(grammarAccess.getMethodCallCmdAccess().getArgsAttributeCallParserRuleCall_1_2_1_1_1_0());
            	    	            	    								
            	    	            	    pushFollow(FOLLOW_16);
            	    	            	    lv_args_6_0=ruleAttributeCall();

            	    	            	    state._fsp--;


            	    	            	    									if (current==null) {
            	    	            	    										current = createModelElementForParent(grammarAccess.getMethodCallCmdRule());
            	    	            	    									}
            	    	            	    									add(
            	    	            	    										current,
            	    	            	    										"args",
            	    	            	    										lv_args_6_0,
            	    	            	    										"br.dslcross.crossplatform.CrossPlatform.AttributeCall");
            	    	            	    									afterParserOrEnumRuleCall();
            	    	            	    								

            	    	            	    }


            	    	            	    }


            	    	            	    }
            	    	            	    break;

            	    	            	default :
            	    	            	    break loop109;
            	    	                }
            	    	            } while (true);


            	    	            }
            	    	            break;

            	    	    }

            	    	    otherlv_7=(Token)match(input,29,FOLLOW_49); 

            	    	    					newLeafNode(otherlv_7, grammarAccess.getMethodCallCmdAccess().getRightParenthesisKeyword_1_2_2());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop111;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt112 >= 1 ) break loop112;
                        EarlyExitException eee =
                            new EarlyExitException(112, input);
                        throw eee;
                }
                cnt112++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodCallCmd"


    // $ANTLR start "entryRuleVector"
    // InternalCrossPlatform.g:4146:1: entryRuleVector returns [EObject current=null] : iv_ruleVector= ruleVector EOF ;
    public final EObject entryRuleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector = null;


        try {
            // InternalCrossPlatform.g:4146:47: (iv_ruleVector= ruleVector EOF )
            // InternalCrossPlatform.g:4147:2: iv_ruleVector= ruleVector EOF
            {
             newCompositeNode(grammarAccess.getVectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVector=ruleVector();

            state._fsp--;

             current =iv_ruleVector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVector"


    // $ANTLR start "ruleVector"
    // InternalCrossPlatform.g:4153:1: ruleVector returns [EObject current=null] : ( () ( (lv_col1_1_0= '[' ) )? ( (lv_array_2_0= RULE_INT ) )? ( (lv_col2_3_0= ']' ) )? ) ;
    public final EObject ruleVector() throws RecognitionException {
        EObject current = null;

        Token lv_col1_1_0=null;
        Token lv_array_2_0=null;
        Token lv_col2_3_0=null;


        	enterRule();

        try {
            // InternalCrossPlatform.g:4159:2: ( ( () ( (lv_col1_1_0= '[' ) )? ( (lv_array_2_0= RULE_INT ) )? ( (lv_col2_3_0= ']' ) )? ) )
            // InternalCrossPlatform.g:4160:2: ( () ( (lv_col1_1_0= '[' ) )? ( (lv_array_2_0= RULE_INT ) )? ( (lv_col2_3_0= ']' ) )? )
            {
            // InternalCrossPlatform.g:4160:2: ( () ( (lv_col1_1_0= '[' ) )? ( (lv_array_2_0= RULE_INT ) )? ( (lv_col2_3_0= ']' ) )? )
            // InternalCrossPlatform.g:4161:3: () ( (lv_col1_1_0= '[' ) )? ( (lv_array_2_0= RULE_INT ) )? ( (lv_col2_3_0= ']' ) )?
            {
            // InternalCrossPlatform.g:4161:3: ()
            // InternalCrossPlatform.g:4162:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVectorAccess().getVectorAction_0(),
            					current);
            			

            }

            // InternalCrossPlatform.g:4168:3: ( (lv_col1_1_0= '[' ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==30) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalCrossPlatform.g:4169:4: (lv_col1_1_0= '[' )
                    {
                    // InternalCrossPlatform.g:4169:4: (lv_col1_1_0= '[' )
                    // InternalCrossPlatform.g:4170:5: lv_col1_1_0= '['
                    {
                    lv_col1_1_0=(Token)match(input,30,FOLLOW_20); 

                    					newLeafNode(lv_col1_1_0, grammarAccess.getVectorAccess().getCol1LeftSquareBracketKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVectorRule());
                    					}
                    					setWithLastConsumed(current, "col1", lv_col1_1_0, "[");
                    				

                    }


                    }
                    break;

            }

            // InternalCrossPlatform.g:4182:3: ( (lv_array_2_0= RULE_INT ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==RULE_INT) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalCrossPlatform.g:4183:4: (lv_array_2_0= RULE_INT )
                    {
                    // InternalCrossPlatform.g:4183:4: (lv_array_2_0= RULE_INT )
                    // InternalCrossPlatform.g:4184:5: lv_array_2_0= RULE_INT
                    {
                    lv_array_2_0=(Token)match(input,RULE_INT,FOLLOW_21); 

                    					newLeafNode(lv_array_2_0, grammarAccess.getVectorAccess().getArrayINTTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVectorRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"array",
                    						lv_array_2_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            // InternalCrossPlatform.g:4200:3: ( (lv_col2_3_0= ']' ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==31) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalCrossPlatform.g:4201:4: (lv_col2_3_0= ']' )
                    {
                    // InternalCrossPlatform.g:4201:4: (lv_col2_3_0= ']' )
                    // InternalCrossPlatform.g:4202:5: lv_col2_3_0= ']'
                    {
                    lv_col2_3_0=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_col2_3_0, grammarAccess.getVectorAccess().getCol2RightSquareBracketKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVectorRule());
                    					}
                    					setWithLastConsumed(current, "col2", lv_col2_3_0, "]");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVector"


    // $ANTLR start "entryRuleCallAttributeObject"
    // InternalCrossPlatform.g:4218:1: entryRuleCallAttributeObject returns [EObject current=null] : iv_ruleCallAttributeObject= ruleCallAttributeObject EOF ;
    public final EObject entryRuleCallAttributeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallAttributeObject = null;


        try {
            // InternalCrossPlatform.g:4218:60: (iv_ruleCallAttributeObject= ruleCallAttributeObject EOF )
            // InternalCrossPlatform.g:4219:2: iv_ruleCallAttributeObject= ruleCallAttributeObject EOF
            {
             newCompositeNode(grammarAccess.getCallAttributeObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCallAttributeObject=ruleCallAttributeObject();

            state._fsp--;

             current =iv_ruleCallAttributeObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCallAttributeObject"


    // $ANTLR start "ruleCallAttributeObject"
    // InternalCrossPlatform.g:4225:1: ruleCallAttributeObject returns [EObject current=null] : ( ( (lv_obj_0_0= ruleAttribID ) ) (otherlv_1= '.' ( (lv_call_2_0= ruleAttribID ) ) )* otherlv_3= ':=' ( (lv_e_4_0= ruleExprArit ) ) ) ;
    public final EObject ruleCallAttributeObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_obj_0_0 = null;

        EObject lv_call_2_0 = null;

        EObject lv_e_4_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:4231:2: ( ( ( (lv_obj_0_0= ruleAttribID ) ) (otherlv_1= '.' ( (lv_call_2_0= ruleAttribID ) ) )* otherlv_3= ':=' ( (lv_e_4_0= ruleExprArit ) ) ) )
            // InternalCrossPlatform.g:4232:2: ( ( (lv_obj_0_0= ruleAttribID ) ) (otherlv_1= '.' ( (lv_call_2_0= ruleAttribID ) ) )* otherlv_3= ':=' ( (lv_e_4_0= ruleExprArit ) ) )
            {
            // InternalCrossPlatform.g:4232:2: ( ( (lv_obj_0_0= ruleAttribID ) ) (otherlv_1= '.' ( (lv_call_2_0= ruleAttribID ) ) )* otherlv_3= ':=' ( (lv_e_4_0= ruleExprArit ) ) )
            // InternalCrossPlatform.g:4233:3: ( (lv_obj_0_0= ruleAttribID ) ) (otherlv_1= '.' ( (lv_call_2_0= ruleAttribID ) ) )* otherlv_3= ':=' ( (lv_e_4_0= ruleExprArit ) )
            {
            // InternalCrossPlatform.g:4233:3: ( (lv_obj_0_0= ruleAttribID ) )
            // InternalCrossPlatform.g:4234:4: (lv_obj_0_0= ruleAttribID )
            {
            // InternalCrossPlatform.g:4234:4: (lv_obj_0_0= ruleAttribID )
            // InternalCrossPlatform.g:4235:5: lv_obj_0_0= ruleAttribID
            {

            					newCompositeNode(grammarAccess.getCallAttributeObjectAccess().getObjAttribIDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_50);
            lv_obj_0_0=ruleAttribID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCallAttributeObjectRule());
            					}
            					set(
            						current,
            						"obj",
            						lv_obj_0_0,
            						"br.dslcross.crossplatform.CrossPlatform.AttribID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCrossPlatform.g:4252:3: (otherlv_1= '.' ( (lv_call_2_0= ruleAttribID ) ) )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==15) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // InternalCrossPlatform.g:4253:4: otherlv_1= '.' ( (lv_call_2_0= ruleAttribID ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_51); 

            	    				newLeafNode(otherlv_1, grammarAccess.getCallAttributeObjectAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalCrossPlatform.g:4257:4: ( (lv_call_2_0= ruleAttribID ) )
            	    // InternalCrossPlatform.g:4258:5: (lv_call_2_0= ruleAttribID )
            	    {
            	    // InternalCrossPlatform.g:4258:5: (lv_call_2_0= ruleAttribID )
            	    // InternalCrossPlatform.g:4259:6: lv_call_2_0= ruleAttribID
            	    {

            	    						newCompositeNode(grammarAccess.getCallAttributeObjectAccess().getCallAttribIDParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_50);
            	    lv_call_2_0=ruleAttribID();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCallAttributeObjectRule());
            	    						}
            	    						add(
            	    							current,
            	    							"call",
            	    							lv_call_2_0,
            	    							"br.dslcross.crossplatform.CrossPlatform.AttribID");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop116;
                }
            } while (true);

            otherlv_3=(Token)match(input,56,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getCallAttributeObjectAccess().getColonEqualsSignKeyword_2());
            		
            // InternalCrossPlatform.g:4281:3: ( (lv_e_4_0= ruleExprArit ) )
            // InternalCrossPlatform.g:4282:4: (lv_e_4_0= ruleExprArit )
            {
            // InternalCrossPlatform.g:4282:4: (lv_e_4_0= ruleExprArit )
            // InternalCrossPlatform.g:4283:5: lv_e_4_0= ruleExprArit
            {

            					newCompositeNode(grammarAccess.getCallAttributeObjectAccess().getEExprAritParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_e_4_0=ruleExprArit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCallAttributeObjectRule());
            					}
            					set(
            						current,
            						"e",
            						lv_e_4_0,
            						"br.dslcross.crossplatform.CrossPlatform.ExprArit");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCallAttributeObject"


    // $ANTLR start "entryRuleMethodCallGlobal"
    // InternalCrossPlatform.g:4304:1: entryRuleMethodCallGlobal returns [EObject current=null] : iv_ruleMethodCallGlobal= ruleMethodCallGlobal EOF ;
    public final EObject entryRuleMethodCallGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCallGlobal = null;


        try {
            // InternalCrossPlatform.g:4304:57: (iv_ruleMethodCallGlobal= ruleMethodCallGlobal EOF )
            // InternalCrossPlatform.g:4305:2: iv_ruleMethodCallGlobal= ruleMethodCallGlobal EOF
            {
             newCompositeNode(grammarAccess.getMethodCallGlobalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodCallGlobal=ruleMethodCallGlobal();

            state._fsp--;

             current =iv_ruleMethodCallGlobal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodCallGlobal"


    // $ANTLR start "ruleMethodCallGlobal"
    // InternalCrossPlatform.g:4311:1: ruleMethodCallGlobal returns [EObject current=null] : ( ( (lv_call1_0_0= ruleMethodCallGlob ) ) | ( (lv_call2_1_0= ruleMethodCallOp ) ) ) ;
    public final EObject ruleMethodCallGlobal() throws RecognitionException {
        EObject current = null;

        EObject lv_call1_0_0 = null;

        EObject lv_call2_1_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:4317:2: ( ( ( (lv_call1_0_0= ruleMethodCallGlob ) ) | ( (lv_call2_1_0= ruleMethodCallOp ) ) ) )
            // InternalCrossPlatform.g:4318:2: ( ( (lv_call1_0_0= ruleMethodCallGlob ) ) | ( (lv_call2_1_0= ruleMethodCallOp ) ) )
            {
            // InternalCrossPlatform.g:4318:2: ( ( (lv_call1_0_0= ruleMethodCallGlob ) ) | ( (lv_call2_1_0= ruleMethodCallOp ) ) )
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==33) ) {
                alt117=1;
            }
            else if ( (LA117_0==RULE_ID) ) {
                alt117=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }
            switch (alt117) {
                case 1 :
                    // InternalCrossPlatform.g:4319:3: ( (lv_call1_0_0= ruleMethodCallGlob ) )
                    {
                    // InternalCrossPlatform.g:4319:3: ( (lv_call1_0_0= ruleMethodCallGlob ) )
                    // InternalCrossPlatform.g:4320:4: (lv_call1_0_0= ruleMethodCallGlob )
                    {
                    // InternalCrossPlatform.g:4320:4: (lv_call1_0_0= ruleMethodCallGlob )
                    // InternalCrossPlatform.g:4321:5: lv_call1_0_0= ruleMethodCallGlob
                    {

                    					newCompositeNode(grammarAccess.getMethodCallGlobalAccess().getCall1MethodCallGlobParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_call1_0_0=ruleMethodCallGlob();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMethodCallGlobalRule());
                    					}
                    					set(
                    						current,
                    						"call1",
                    						lv_call1_0_0,
                    						"br.dslcross.crossplatform.CrossPlatform.MethodCallGlob");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCrossPlatform.g:4339:3: ( (lv_call2_1_0= ruleMethodCallOp ) )
                    {
                    // InternalCrossPlatform.g:4339:3: ( (lv_call2_1_0= ruleMethodCallOp ) )
                    // InternalCrossPlatform.g:4340:4: (lv_call2_1_0= ruleMethodCallOp )
                    {
                    // InternalCrossPlatform.g:4340:4: (lv_call2_1_0= ruleMethodCallOp )
                    // InternalCrossPlatform.g:4341:5: lv_call2_1_0= ruleMethodCallOp
                    {

                    					newCompositeNode(grammarAccess.getMethodCallGlobalAccess().getCall2MethodCallOpParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_call2_1_0=ruleMethodCallOp();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMethodCallGlobalRule());
                    					}
                    					set(
                    						current,
                    						"call2",
                    						lv_call2_1_0,
                    						"br.dslcross.crossplatform.CrossPlatform.MethodCallOp");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodCallGlobal"


    // $ANTLR start "entryRuleOpLogicoWhile"
    // InternalCrossPlatform.g:4362:1: entryRuleOpLogicoWhile returns [EObject current=null] : iv_ruleOpLogicoWhile= ruleOpLogicoWhile EOF ;
    public final EObject entryRuleOpLogicoWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpLogicoWhile = null;


        try {
            // InternalCrossPlatform.g:4362:54: (iv_ruleOpLogicoWhile= ruleOpLogicoWhile EOF )
            // InternalCrossPlatform.g:4363:2: iv_ruleOpLogicoWhile= ruleOpLogicoWhile EOF
            {
             newCompositeNode(grammarAccess.getOpLogicoWhileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpLogicoWhile=ruleOpLogicoWhile();

            state._fsp--;

             current =iv_ruleOpLogicoWhile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpLogicoWhile"


    // $ANTLR start "ruleOpLogicoWhile"
    // InternalCrossPlatform.g:4369:1: ruleOpLogicoWhile returns [EObject current=null] : ( ( (lv_left_0_0= ruleComLog ) ) ( (lv_e_1_0= ruleExprLogica ) ) otherlv_2= '{' ( (lv_cmdList_3_0= ruleCommandOperation ) )* otherlv_4= '}' ) ;
    public final EObject ruleOpLogicoWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_0_0 = null;

        EObject lv_e_1_0 = null;

        EObject lv_cmdList_3_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:4375:2: ( ( ( (lv_left_0_0= ruleComLog ) ) ( (lv_e_1_0= ruleExprLogica ) ) otherlv_2= '{' ( (lv_cmdList_3_0= ruleCommandOperation ) )* otherlv_4= '}' ) )
            // InternalCrossPlatform.g:4376:2: ( ( (lv_left_0_0= ruleComLog ) ) ( (lv_e_1_0= ruleExprLogica ) ) otherlv_2= '{' ( (lv_cmdList_3_0= ruleCommandOperation ) )* otherlv_4= '}' )
            {
            // InternalCrossPlatform.g:4376:2: ( ( (lv_left_0_0= ruleComLog ) ) ( (lv_e_1_0= ruleExprLogica ) ) otherlv_2= '{' ( (lv_cmdList_3_0= ruleCommandOperation ) )* otherlv_4= '}' )
            // InternalCrossPlatform.g:4377:3: ( (lv_left_0_0= ruleComLog ) ) ( (lv_e_1_0= ruleExprLogica ) ) otherlv_2= '{' ( (lv_cmdList_3_0= ruleCommandOperation ) )* otherlv_4= '}'
            {
            // InternalCrossPlatform.g:4377:3: ( (lv_left_0_0= ruleComLog ) )
            // InternalCrossPlatform.g:4378:4: (lv_left_0_0= ruleComLog )
            {
            // InternalCrossPlatform.g:4378:4: (lv_left_0_0= ruleComLog )
            // InternalCrossPlatform.g:4379:5: lv_left_0_0= ruleComLog
            {

            					newCompositeNode(grammarAccess.getOpLogicoWhileAccess().getLeftComLogParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_52);
            lv_left_0_0=ruleComLog();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOpLogicoWhileRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"br.dslcross.crossplatform.CrossPlatform.ComLog");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCrossPlatform.g:4396:3: ( (lv_e_1_0= ruleExprLogica ) )
            // InternalCrossPlatform.g:4397:4: (lv_e_1_0= ruleExprLogica )
            {
            // InternalCrossPlatform.g:4397:4: (lv_e_1_0= ruleExprLogica )
            // InternalCrossPlatform.g:4398:5: lv_e_1_0= ruleExprLogica
            {

            					newCompositeNode(grammarAccess.getOpLogicoWhileAccess().getEExprLogicaParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_e_1_0=ruleExprLogica();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOpLogicoWhileRule());
            					}
            					set(
            						current,
            						"e",
            						lv_e_1_0,
            						"br.dslcross.crossplatform.CrossPlatform.ExprLogica");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getOpLogicoWhileAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCrossPlatform.g:4419:3: ( (lv_cmdList_3_0= ruleCommandOperation ) )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==RULE_ID||LA118_0==RULE_STRINGTEMPLATE||LA118_0==33||LA118_0==42||(LA118_0>=48 && LA118_0<=51)||LA118_0==57||LA118_0==59||(LA118_0>=71 && LA118_0<=72)) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // InternalCrossPlatform.g:4420:4: (lv_cmdList_3_0= ruleCommandOperation )
            	    {
            	    // InternalCrossPlatform.g:4420:4: (lv_cmdList_3_0= ruleCommandOperation )
            	    // InternalCrossPlatform.g:4421:5: lv_cmdList_3_0= ruleCommandOperation
            	    {

            	    					newCompositeNode(grammarAccess.getOpLogicoWhileAccess().getCmdListCommandOperationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_39);
            	    lv_cmdList_3_0=ruleCommandOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOpLogicoWhileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cmdList",
            	    						lv_cmdList_3_0,
            	    						"br.dslcross.crossplatform.CrossPlatform.CommandOperation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop118;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOpLogicoWhileAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpLogicoWhile"


    // $ANTLR start "entryRuleOpLogicoDoWhile"
    // InternalCrossPlatform.g:4446:1: entryRuleOpLogicoDoWhile returns [EObject current=null] : iv_ruleOpLogicoDoWhile= ruleOpLogicoDoWhile EOF ;
    public final EObject entryRuleOpLogicoDoWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpLogicoDoWhile = null;


        try {
            // InternalCrossPlatform.g:4446:56: (iv_ruleOpLogicoDoWhile= ruleOpLogicoDoWhile EOF )
            // InternalCrossPlatform.g:4447:2: iv_ruleOpLogicoDoWhile= ruleOpLogicoDoWhile EOF
            {
             newCompositeNode(grammarAccess.getOpLogicoDoWhileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpLogicoDoWhile=ruleOpLogicoDoWhile();

            state._fsp--;

             current =iv_ruleOpLogicoDoWhile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpLogicoDoWhile"


    // $ANTLR start "ruleOpLogicoDoWhile"
    // InternalCrossPlatform.g:4453:1: ruleOpLogicoDoWhile returns [EObject current=null] : (otherlv_0= 'Do{' ( (lv_cmdList_1_0= ruleCommandOperation ) )* otherlv_2= '}While' ( (lv_e_3_0= ruleExprLogica ) ) ) ;
    public final EObject ruleOpLogicoDoWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_cmdList_1_0 = null;

        EObject lv_e_3_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:4459:2: ( (otherlv_0= 'Do{' ( (lv_cmdList_1_0= ruleCommandOperation ) )* otherlv_2= '}While' ( (lv_e_3_0= ruleExprLogica ) ) ) )
            // InternalCrossPlatform.g:4460:2: (otherlv_0= 'Do{' ( (lv_cmdList_1_0= ruleCommandOperation ) )* otherlv_2= '}While' ( (lv_e_3_0= ruleExprLogica ) ) )
            {
            // InternalCrossPlatform.g:4460:2: (otherlv_0= 'Do{' ( (lv_cmdList_1_0= ruleCommandOperation ) )* otherlv_2= '}While' ( (lv_e_3_0= ruleExprLogica ) ) )
            // InternalCrossPlatform.g:4461:3: otherlv_0= 'Do{' ( (lv_cmdList_1_0= ruleCommandOperation ) )* otherlv_2= '}While' ( (lv_e_3_0= ruleExprLogica ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_53); 

            			newLeafNode(otherlv_0, grammarAccess.getOpLogicoDoWhileAccess().getDoKeyword_0());
            		
            // InternalCrossPlatform.g:4465:3: ( (lv_cmdList_1_0= ruleCommandOperation ) )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==RULE_ID||LA119_0==RULE_STRINGTEMPLATE||LA119_0==33||LA119_0==42||(LA119_0>=48 && LA119_0<=51)||LA119_0==57||LA119_0==59||(LA119_0>=71 && LA119_0<=72)) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // InternalCrossPlatform.g:4466:4: (lv_cmdList_1_0= ruleCommandOperation )
            	    {
            	    // InternalCrossPlatform.g:4466:4: (lv_cmdList_1_0= ruleCommandOperation )
            	    // InternalCrossPlatform.g:4467:5: lv_cmdList_1_0= ruleCommandOperation
            	    {

            	    					newCompositeNode(grammarAccess.getOpLogicoDoWhileAccess().getCmdListCommandOperationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_53);
            	    lv_cmdList_1_0=ruleCommandOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOpLogicoDoWhileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cmdList",
            	    						lv_cmdList_1_0,
            	    						"br.dslcross.crossplatform.CrossPlatform.CommandOperation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop119;
                }
            } while (true);

            otherlv_2=(Token)match(input,58,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getOpLogicoDoWhileAccess().getWhileKeyword_2());
            		
            // InternalCrossPlatform.g:4488:3: ( (lv_e_3_0= ruleExprLogica ) )
            // InternalCrossPlatform.g:4489:4: (lv_e_3_0= ruleExprLogica )
            {
            // InternalCrossPlatform.g:4489:4: (lv_e_3_0= ruleExprLogica )
            // InternalCrossPlatform.g:4490:5: lv_e_3_0= ruleExprLogica
            {

            					newCompositeNode(grammarAccess.getOpLogicoDoWhileAccess().getEExprLogicaParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_e_3_0=ruleExprLogica();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOpLogicoDoWhileRule());
            					}
            					set(
            						current,
            						"e",
            						lv_e_3_0,
            						"br.dslcross.crossplatform.CrossPlatform.ExprLogica");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpLogicoDoWhile"


    // $ANTLR start "entryRuleOpLogicoIF"
    // InternalCrossPlatform.g:4511:1: entryRuleOpLogicoIF returns [EObject current=null] : iv_ruleOpLogicoIF= ruleOpLogicoIF EOF ;
    public final EObject entryRuleOpLogicoIF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpLogicoIF = null;


        try {
            // InternalCrossPlatform.g:4511:51: (iv_ruleOpLogicoIF= ruleOpLogicoIF EOF )
            // InternalCrossPlatform.g:4512:2: iv_ruleOpLogicoIF= ruleOpLogicoIF EOF
            {
             newCompositeNode(grammarAccess.getOpLogicoIFRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpLogicoIF=ruleOpLogicoIF();

            state._fsp--;

             current =iv_ruleOpLogicoIF; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpLogicoIF"


    // $ANTLR start "ruleOpLogicoIF"
    // InternalCrossPlatform.g:4518:1: ruleOpLogicoIF returns [EObject current=null] : (otherlv_0= 'If' ( (lv_e_1_0= ruleExprLogica ) ) otherlv_2= '{' ( (lv_cmdList_3_0= ruleCommandOperation ) )* otherlv_4= '}' ( (lv_opElseIf_5_0= ruleOpElseIf ) )* ( (lv_opElse_6_0= ruleOpElse ) )? ) ;
    public final EObject ruleOpLogicoIF() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_e_1_0 = null;

        EObject lv_cmdList_3_0 = null;

        EObject lv_opElseIf_5_0 = null;

        EObject lv_opElse_6_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:4524:2: ( (otherlv_0= 'If' ( (lv_e_1_0= ruleExprLogica ) ) otherlv_2= '{' ( (lv_cmdList_3_0= ruleCommandOperation ) )* otherlv_4= '}' ( (lv_opElseIf_5_0= ruleOpElseIf ) )* ( (lv_opElse_6_0= ruleOpElse ) )? ) )
            // InternalCrossPlatform.g:4525:2: (otherlv_0= 'If' ( (lv_e_1_0= ruleExprLogica ) ) otherlv_2= '{' ( (lv_cmdList_3_0= ruleCommandOperation ) )* otherlv_4= '}' ( (lv_opElseIf_5_0= ruleOpElseIf ) )* ( (lv_opElse_6_0= ruleOpElse ) )? )
            {
            // InternalCrossPlatform.g:4525:2: (otherlv_0= 'If' ( (lv_e_1_0= ruleExprLogica ) ) otherlv_2= '{' ( (lv_cmdList_3_0= ruleCommandOperation ) )* otherlv_4= '}' ( (lv_opElseIf_5_0= ruleOpElseIf ) )* ( (lv_opElse_6_0= ruleOpElse ) )? )
            // InternalCrossPlatform.g:4526:3: otherlv_0= 'If' ( (lv_e_1_0= ruleExprLogica ) ) otherlv_2= '{' ( (lv_cmdList_3_0= ruleCommandOperation ) )* otherlv_4= '}' ( (lv_opElseIf_5_0= ruleOpElseIf ) )* ( (lv_opElse_6_0= ruleOpElse ) )?
            {
            otherlv_0=(Token)match(input,59,FOLLOW_52); 

            			newLeafNode(otherlv_0, grammarAccess.getOpLogicoIFAccess().getIfKeyword_0());
            		
            // InternalCrossPlatform.g:4530:3: ( (lv_e_1_0= ruleExprLogica ) )
            // InternalCrossPlatform.g:4531:4: (lv_e_1_0= ruleExprLogica )
            {
            // InternalCrossPlatform.g:4531:4: (lv_e_1_0= ruleExprLogica )
            // InternalCrossPlatform.g:4532:5: lv_e_1_0= ruleExprLogica
            {

            					newCompositeNode(grammarAccess.getOpLogicoIFAccess().getEExprLogicaParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_e_1_0=ruleExprLogica();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOpLogicoIFRule());
            					}
            					set(
            						current,
            						"e",
            						lv_e_1_0,
            						"br.dslcross.crossplatform.CrossPlatform.ExprLogica");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getOpLogicoIFAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCrossPlatform.g:4553:3: ( (lv_cmdList_3_0= ruleCommandOperation ) )*
            loop120:
            do {
                int alt120=2;
                int LA120_0 = input.LA(1);

                if ( (LA120_0==RULE_ID||LA120_0==RULE_STRINGTEMPLATE||LA120_0==33||LA120_0==42||(LA120_0>=48 && LA120_0<=51)||LA120_0==57||LA120_0==59||(LA120_0>=71 && LA120_0<=72)) ) {
                    alt120=1;
                }


                switch (alt120) {
            	case 1 :
            	    // InternalCrossPlatform.g:4554:4: (lv_cmdList_3_0= ruleCommandOperation )
            	    {
            	    // InternalCrossPlatform.g:4554:4: (lv_cmdList_3_0= ruleCommandOperation )
            	    // InternalCrossPlatform.g:4555:5: lv_cmdList_3_0= ruleCommandOperation
            	    {

            	    					newCompositeNode(grammarAccess.getOpLogicoIFAccess().getCmdListCommandOperationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_39);
            	    lv_cmdList_3_0=ruleCommandOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOpLogicoIFRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cmdList",
            	    						lv_cmdList_3_0,
            	    						"br.dslcross.crossplatform.CrossPlatform.CommandOperation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop120;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_54); 

            			newLeafNode(otherlv_4, grammarAccess.getOpLogicoIFAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalCrossPlatform.g:4576:3: ( (lv_opElseIf_5_0= ruleOpElseIf ) )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( (LA121_0==60) ) {
                    alt121=1;
                }


                switch (alt121) {
            	case 1 :
            	    // InternalCrossPlatform.g:4577:4: (lv_opElseIf_5_0= ruleOpElseIf )
            	    {
            	    // InternalCrossPlatform.g:4577:4: (lv_opElseIf_5_0= ruleOpElseIf )
            	    // InternalCrossPlatform.g:4578:5: lv_opElseIf_5_0= ruleOpElseIf
            	    {

            	    					newCompositeNode(grammarAccess.getOpLogicoIFAccess().getOpElseIfOpElseIfParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_54);
            	    lv_opElseIf_5_0=ruleOpElseIf();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOpLogicoIFRule());
            	    					}
            	    					add(
            	    						current,
            	    						"opElseIf",
            	    						lv_opElseIf_5_0,
            	    						"br.dslcross.crossplatform.CrossPlatform.OpElseIf");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop121;
                }
            } while (true);

            // InternalCrossPlatform.g:4595:3: ( (lv_opElse_6_0= ruleOpElse ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==61) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalCrossPlatform.g:4596:4: (lv_opElse_6_0= ruleOpElse )
                    {
                    // InternalCrossPlatform.g:4596:4: (lv_opElse_6_0= ruleOpElse )
                    // InternalCrossPlatform.g:4597:5: lv_opElse_6_0= ruleOpElse
                    {

                    					newCompositeNode(grammarAccess.getOpLogicoIFAccess().getOpElseOpElseParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_opElse_6_0=ruleOpElse();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOpLogicoIFRule());
                    					}
                    					add(
                    						current,
                    						"opElse",
                    						lv_opElse_6_0,
                    						"br.dslcross.crossplatform.CrossPlatform.OpElse");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpLogicoIF"


    // $ANTLR start "entryRuleOpElseIf"
    // InternalCrossPlatform.g:4618:1: entryRuleOpElseIf returns [EObject current=null] : iv_ruleOpElseIf= ruleOpElseIf EOF ;
    public final EObject entryRuleOpElseIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpElseIf = null;


        try {
            // InternalCrossPlatform.g:4618:49: (iv_ruleOpElseIf= ruleOpElseIf EOF )
            // InternalCrossPlatform.g:4619:2: iv_ruleOpElseIf= ruleOpElseIf EOF
            {
             newCompositeNode(grammarAccess.getOpElseIfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpElseIf=ruleOpElseIf();

            state._fsp--;

             current =iv_ruleOpElseIf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpElseIf"


    // $ANTLR start "ruleOpElseIf"
    // InternalCrossPlatform.g:4625:1: ruleOpElseIf returns [EObject current=null] : (otherlv_0= 'ElseIf' ( (lv_expLog_1_0= ruleExprLogica ) ) otherlv_2= '{' ( (lv_cmdList_3_0= ruleCommandOperation ) )* otherlv_4= '}' ) ;
    public final EObject ruleOpElseIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expLog_1_0 = null;

        EObject lv_cmdList_3_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:4631:2: ( (otherlv_0= 'ElseIf' ( (lv_expLog_1_0= ruleExprLogica ) ) otherlv_2= '{' ( (lv_cmdList_3_0= ruleCommandOperation ) )* otherlv_4= '}' ) )
            // InternalCrossPlatform.g:4632:2: (otherlv_0= 'ElseIf' ( (lv_expLog_1_0= ruleExprLogica ) ) otherlv_2= '{' ( (lv_cmdList_3_0= ruleCommandOperation ) )* otherlv_4= '}' )
            {
            // InternalCrossPlatform.g:4632:2: (otherlv_0= 'ElseIf' ( (lv_expLog_1_0= ruleExprLogica ) ) otherlv_2= '{' ( (lv_cmdList_3_0= ruleCommandOperation ) )* otherlv_4= '}' )
            // InternalCrossPlatform.g:4633:3: otherlv_0= 'ElseIf' ( (lv_expLog_1_0= ruleExprLogica ) ) otherlv_2= '{' ( (lv_cmdList_3_0= ruleCommandOperation ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_52); 

            			newLeafNode(otherlv_0, grammarAccess.getOpElseIfAccess().getElseIfKeyword_0());
            		
            // InternalCrossPlatform.g:4637:3: ( (lv_expLog_1_0= ruleExprLogica ) )
            // InternalCrossPlatform.g:4638:4: (lv_expLog_1_0= ruleExprLogica )
            {
            // InternalCrossPlatform.g:4638:4: (lv_expLog_1_0= ruleExprLogica )
            // InternalCrossPlatform.g:4639:5: lv_expLog_1_0= ruleExprLogica
            {

            					newCompositeNode(grammarAccess.getOpElseIfAccess().getExpLogExprLogicaParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_expLog_1_0=ruleExprLogica();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOpElseIfRule());
            					}
            					set(
            						current,
            						"expLog",
            						lv_expLog_1_0,
            						"br.dslcross.crossplatform.CrossPlatform.ExprLogica");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getOpElseIfAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCrossPlatform.g:4660:3: ( (lv_cmdList_3_0= ruleCommandOperation ) )*
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( (LA123_0==RULE_ID||LA123_0==RULE_STRINGTEMPLATE||LA123_0==33||LA123_0==42||(LA123_0>=48 && LA123_0<=51)||LA123_0==57||LA123_0==59||(LA123_0>=71 && LA123_0<=72)) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // InternalCrossPlatform.g:4661:4: (lv_cmdList_3_0= ruleCommandOperation )
            	    {
            	    // InternalCrossPlatform.g:4661:4: (lv_cmdList_3_0= ruleCommandOperation )
            	    // InternalCrossPlatform.g:4662:5: lv_cmdList_3_0= ruleCommandOperation
            	    {

            	    					newCompositeNode(grammarAccess.getOpElseIfAccess().getCmdListCommandOperationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_39);
            	    lv_cmdList_3_0=ruleCommandOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOpElseIfRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cmdList",
            	    						lv_cmdList_3_0,
            	    						"br.dslcross.crossplatform.CrossPlatform.CommandOperation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop123;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOpElseIfAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpElseIf"


    // $ANTLR start "entryRuleOpElse"
    // InternalCrossPlatform.g:4687:1: entryRuleOpElse returns [EObject current=null] : iv_ruleOpElse= ruleOpElse EOF ;
    public final EObject entryRuleOpElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpElse = null;


        try {
            // InternalCrossPlatform.g:4687:47: (iv_ruleOpElse= ruleOpElse EOF )
            // InternalCrossPlatform.g:4688:2: iv_ruleOpElse= ruleOpElse EOF
            {
             newCompositeNode(grammarAccess.getOpElseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpElse=ruleOpElse();

            state._fsp--;

             current =iv_ruleOpElse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpElse"


    // $ANTLR start "ruleOpElse"
    // InternalCrossPlatform.g:4694:1: ruleOpElse returns [EObject current=null] : ( () otherlv_1= 'Else' otherlv_2= '{' ( (lv_cmdList_3_0= ruleCommandOperation ) )* otherlv_4= '}' ) ;
    public final EObject ruleOpElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_cmdList_3_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:4700:2: ( ( () otherlv_1= 'Else' otherlv_2= '{' ( (lv_cmdList_3_0= ruleCommandOperation ) )* otherlv_4= '}' ) )
            // InternalCrossPlatform.g:4701:2: ( () otherlv_1= 'Else' otherlv_2= '{' ( (lv_cmdList_3_0= ruleCommandOperation ) )* otherlv_4= '}' )
            {
            // InternalCrossPlatform.g:4701:2: ( () otherlv_1= 'Else' otherlv_2= '{' ( (lv_cmdList_3_0= ruleCommandOperation ) )* otherlv_4= '}' )
            // InternalCrossPlatform.g:4702:3: () otherlv_1= 'Else' otherlv_2= '{' ( (lv_cmdList_3_0= ruleCommandOperation ) )* otherlv_4= '}'
            {
            // InternalCrossPlatform.g:4702:3: ()
            // InternalCrossPlatform.g:4703:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOpElseAccess().getOpElseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,61,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getOpElseAccess().getElseKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getOpElseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCrossPlatform.g:4717:3: ( (lv_cmdList_3_0= ruleCommandOperation ) )*
            loop124:
            do {
                int alt124=2;
                int LA124_0 = input.LA(1);

                if ( (LA124_0==RULE_ID||LA124_0==RULE_STRINGTEMPLATE||LA124_0==33||LA124_0==42||(LA124_0>=48 && LA124_0<=51)||LA124_0==57||LA124_0==59||(LA124_0>=71 && LA124_0<=72)) ) {
                    alt124=1;
                }


                switch (alt124) {
            	case 1 :
            	    // InternalCrossPlatform.g:4718:4: (lv_cmdList_3_0= ruleCommandOperation )
            	    {
            	    // InternalCrossPlatform.g:4718:4: (lv_cmdList_3_0= ruleCommandOperation )
            	    // InternalCrossPlatform.g:4719:5: lv_cmdList_3_0= ruleCommandOperation
            	    {

            	    					newCompositeNode(grammarAccess.getOpElseAccess().getCmdListCommandOperationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_39);
            	    lv_cmdList_3_0=ruleCommandOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOpElseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cmdList",
            	    						lv_cmdList_3_0,
            	    						"br.dslcross.crossplatform.CrossPlatform.CommandOperation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop124;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOpElseAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpElse"


    // $ANTLR start "entryRuleExprLogica"
    // InternalCrossPlatform.g:4744:1: entryRuleExprLogica returns [EObject current=null] : iv_ruleExprLogica= ruleExprLogica EOF ;
    public final EObject entryRuleExprLogica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprLogica = null;


        try {
            // InternalCrossPlatform.g:4744:51: (iv_ruleExprLogica= ruleExprLogica EOF )
            // InternalCrossPlatform.g:4745:2: iv_ruleExprLogica= ruleExprLogica EOF
            {
             newCompositeNode(grammarAccess.getExprLogicaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExprLogica=ruleExprLogica();

            state._fsp--;

             current =iv_ruleExprLogica; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprLogica"


    // $ANTLR start "ruleExprLogica"
    // InternalCrossPlatform.g:4751:1: ruleExprLogica returns [EObject current=null] : ( ( (lv_termos_0_0= ruleTermoLogico ) ) ( ( (lv_oplog_1_0= '||' ) ) ( (lv_termos_2_0= ruleTermoLogico ) ) )* ) ;
    public final EObject ruleExprLogica() throws RecognitionException {
        EObject current = null;

        Token lv_oplog_1_0=null;
        EObject lv_termos_0_0 = null;

        EObject lv_termos_2_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:4757:2: ( ( ( (lv_termos_0_0= ruleTermoLogico ) ) ( ( (lv_oplog_1_0= '||' ) ) ( (lv_termos_2_0= ruleTermoLogico ) ) )* ) )
            // InternalCrossPlatform.g:4758:2: ( ( (lv_termos_0_0= ruleTermoLogico ) ) ( ( (lv_oplog_1_0= '||' ) ) ( (lv_termos_2_0= ruleTermoLogico ) ) )* )
            {
            // InternalCrossPlatform.g:4758:2: ( ( (lv_termos_0_0= ruleTermoLogico ) ) ( ( (lv_oplog_1_0= '||' ) ) ( (lv_termos_2_0= ruleTermoLogico ) ) )* )
            // InternalCrossPlatform.g:4759:3: ( (lv_termos_0_0= ruleTermoLogico ) ) ( ( (lv_oplog_1_0= '||' ) ) ( (lv_termos_2_0= ruleTermoLogico ) ) )*
            {
            // InternalCrossPlatform.g:4759:3: ( (lv_termos_0_0= ruleTermoLogico ) )
            // InternalCrossPlatform.g:4760:4: (lv_termos_0_0= ruleTermoLogico )
            {
            // InternalCrossPlatform.g:4760:4: (lv_termos_0_0= ruleTermoLogico )
            // InternalCrossPlatform.g:4761:5: lv_termos_0_0= ruleTermoLogico
            {

            					newCompositeNode(grammarAccess.getExprLogicaAccess().getTermosTermoLogicoParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_55);
            lv_termos_0_0=ruleTermoLogico();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExprLogicaRule());
            					}
            					add(
            						current,
            						"termos",
            						lv_termos_0_0,
            						"br.dslcross.crossplatform.CrossPlatform.TermoLogico");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCrossPlatform.g:4778:3: ( ( (lv_oplog_1_0= '||' ) ) ( (lv_termos_2_0= ruleTermoLogico ) ) )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==62) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // InternalCrossPlatform.g:4779:4: ( (lv_oplog_1_0= '||' ) ) ( (lv_termos_2_0= ruleTermoLogico ) )
            	    {
            	    // InternalCrossPlatform.g:4779:4: ( (lv_oplog_1_0= '||' ) )
            	    // InternalCrossPlatform.g:4780:5: (lv_oplog_1_0= '||' )
            	    {
            	    // InternalCrossPlatform.g:4780:5: (lv_oplog_1_0= '||' )
            	    // InternalCrossPlatform.g:4781:6: lv_oplog_1_0= '||'
            	    {
            	    lv_oplog_1_0=(Token)match(input,62,FOLLOW_52); 

            	    						newLeafNode(lv_oplog_1_0, grammarAccess.getExprLogicaAccess().getOplogVerticalLineVerticalLineKeyword_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getExprLogicaRule());
            	    						}
            	    						addWithLastConsumed(current, "oplog", lv_oplog_1_0, "||");
            	    					

            	    }


            	    }

            	    // InternalCrossPlatform.g:4793:4: ( (lv_termos_2_0= ruleTermoLogico ) )
            	    // InternalCrossPlatform.g:4794:5: (lv_termos_2_0= ruleTermoLogico )
            	    {
            	    // InternalCrossPlatform.g:4794:5: (lv_termos_2_0= ruleTermoLogico )
            	    // InternalCrossPlatform.g:4795:6: lv_termos_2_0= ruleTermoLogico
            	    {

            	    						newCompositeNode(grammarAccess.getExprLogicaAccess().getTermosTermoLogicoParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_55);
            	    lv_termos_2_0=ruleTermoLogico();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExprLogicaRule());
            	    						}
            	    						add(
            	    							current,
            	    							"termos",
            	    							lv_termos_2_0,
            	    							"br.dslcross.crossplatform.CrossPlatform.TermoLogico");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop125;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprLogica"


    // $ANTLR start "entryRuleTermoLogico"
    // InternalCrossPlatform.g:4817:1: entryRuleTermoLogico returns [EObject current=null] : iv_ruleTermoLogico= ruleTermoLogico EOF ;
    public final EObject entryRuleTermoLogico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermoLogico = null;


        try {
            // InternalCrossPlatform.g:4817:52: (iv_ruleTermoLogico= ruleTermoLogico EOF )
            // InternalCrossPlatform.g:4818:2: iv_ruleTermoLogico= ruleTermoLogico EOF
            {
             newCompositeNode(grammarAccess.getTermoLogicoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTermoLogico=ruleTermoLogico();

            state._fsp--;

             current =iv_ruleTermoLogico; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTermoLogico"


    // $ANTLR start "ruleTermoLogico"
    // InternalCrossPlatform.g:4824:1: ruleTermoLogico returns [EObject current=null] : ( ( (lv_fatores_0_0= ruleFatorLogico ) ) ( ( (lv_oplog_1_0= '&&' ) ) ( (lv_fatores_2_0= ruleFatorLogico ) ) )* ) ;
    public final EObject ruleTermoLogico() throws RecognitionException {
        EObject current = null;

        Token lv_oplog_1_0=null;
        EObject lv_fatores_0_0 = null;

        EObject lv_fatores_2_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:4830:2: ( ( ( (lv_fatores_0_0= ruleFatorLogico ) ) ( ( (lv_oplog_1_0= '&&' ) ) ( (lv_fatores_2_0= ruleFatorLogico ) ) )* ) )
            // InternalCrossPlatform.g:4831:2: ( ( (lv_fatores_0_0= ruleFatorLogico ) ) ( ( (lv_oplog_1_0= '&&' ) ) ( (lv_fatores_2_0= ruleFatorLogico ) ) )* )
            {
            // InternalCrossPlatform.g:4831:2: ( ( (lv_fatores_0_0= ruleFatorLogico ) ) ( ( (lv_oplog_1_0= '&&' ) ) ( (lv_fatores_2_0= ruleFatorLogico ) ) )* )
            // InternalCrossPlatform.g:4832:3: ( (lv_fatores_0_0= ruleFatorLogico ) ) ( ( (lv_oplog_1_0= '&&' ) ) ( (lv_fatores_2_0= ruleFatorLogico ) ) )*
            {
            // InternalCrossPlatform.g:4832:3: ( (lv_fatores_0_0= ruleFatorLogico ) )
            // InternalCrossPlatform.g:4833:4: (lv_fatores_0_0= ruleFatorLogico )
            {
            // InternalCrossPlatform.g:4833:4: (lv_fatores_0_0= ruleFatorLogico )
            // InternalCrossPlatform.g:4834:5: lv_fatores_0_0= ruleFatorLogico
            {

            					newCompositeNode(grammarAccess.getTermoLogicoAccess().getFatoresFatorLogicoParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_56);
            lv_fatores_0_0=ruleFatorLogico();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTermoLogicoRule());
            					}
            					add(
            						current,
            						"fatores",
            						lv_fatores_0_0,
            						"br.dslcross.crossplatform.CrossPlatform.FatorLogico");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCrossPlatform.g:4851:3: ( ( (lv_oplog_1_0= '&&' ) ) ( (lv_fatores_2_0= ruleFatorLogico ) ) )*
            loop126:
            do {
                int alt126=2;
                int LA126_0 = input.LA(1);

                if ( (LA126_0==63) ) {
                    alt126=1;
                }


                switch (alt126) {
            	case 1 :
            	    // InternalCrossPlatform.g:4852:4: ( (lv_oplog_1_0= '&&' ) ) ( (lv_fatores_2_0= ruleFatorLogico ) )
            	    {
            	    // InternalCrossPlatform.g:4852:4: ( (lv_oplog_1_0= '&&' ) )
            	    // InternalCrossPlatform.g:4853:5: (lv_oplog_1_0= '&&' )
            	    {
            	    // InternalCrossPlatform.g:4853:5: (lv_oplog_1_0= '&&' )
            	    // InternalCrossPlatform.g:4854:6: lv_oplog_1_0= '&&'
            	    {
            	    lv_oplog_1_0=(Token)match(input,63,FOLLOW_52); 

            	    						newLeafNode(lv_oplog_1_0, grammarAccess.getTermoLogicoAccess().getOplogAmpersandAmpersandKeyword_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTermoLogicoRule());
            	    						}
            	    						addWithLastConsumed(current, "oplog", lv_oplog_1_0, "&&");
            	    					

            	    }


            	    }

            	    // InternalCrossPlatform.g:4866:4: ( (lv_fatores_2_0= ruleFatorLogico ) )
            	    // InternalCrossPlatform.g:4867:5: (lv_fatores_2_0= ruleFatorLogico )
            	    {
            	    // InternalCrossPlatform.g:4867:5: (lv_fatores_2_0= ruleFatorLogico )
            	    // InternalCrossPlatform.g:4868:6: lv_fatores_2_0= ruleFatorLogico
            	    {

            	    						newCompositeNode(grammarAccess.getTermoLogicoAccess().getFatoresFatorLogicoParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_56);
            	    lv_fatores_2_0=ruleFatorLogico();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTermoLogicoRule());
            	    						}
            	    						add(
            	    							current,
            	    							"fatores",
            	    							lv_fatores_2_0,
            	    							"br.dslcross.crossplatform.CrossPlatform.FatorLogico");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop126;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTermoLogico"


    // $ANTLR start "entryRuleFatorLogico"
    // InternalCrossPlatform.g:4890:1: entryRuleFatorLogico returns [EObject current=null] : iv_ruleFatorLogico= ruleFatorLogico EOF ;
    public final EObject entryRuleFatorLogico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFatorLogico = null;


        try {
            // InternalCrossPlatform.g:4890:52: (iv_ruleFatorLogico= ruleFatorLogico EOF )
            // InternalCrossPlatform.g:4891:2: iv_ruleFatorLogico= ruleFatorLogico EOF
            {
             newCompositeNode(grammarAccess.getFatorLogicoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFatorLogico=ruleFatorLogico();

            state._fsp--;

             current =iv_ruleFatorLogico; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFatorLogico"


    // $ANTLR start "ruleFatorLogico"
    // InternalCrossPlatform.g:4897:1: ruleFatorLogico returns [EObject current=null] : ( () ( ( ( (lv_n_1_0= '!' ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (lv_n_3_0= '!' ) )? ( (lv_op1_4_0= 'true' ) ) ) | ( ( (lv_n_5_0= '!' ) )? ( (lv_op2_6_0= 'false' ) ) ) | (otherlv_7= '(' ( (lv_exprLog_8_0= ruleExprLogica ) ) otherlv_9= ')' ) | ( ( (lv_n_10_0= '!' ) )? ( (lv_expr1_11_0= ruleExprL ) ) ( ( (lv_OpRel_12_1= '>' | lv_OpRel_12_2= '>=' | lv_OpRel_12_3= '<' | lv_OpRel_12_4= '<=' | lv_OpRel_12_5= '==' | lv_OpRel_12_6= '<>' ) ) ) ( (lv_expr2_13_0= ruleExprL ) ) ) ) ) ;
    public final EObject ruleFatorLogico() throws RecognitionException {
        EObject current = null;

        Token lv_n_1_0=null;
        Token otherlv_2=null;
        Token lv_n_3_0=null;
        Token lv_op1_4_0=null;
        Token lv_n_5_0=null;
        Token lv_op2_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_n_10_0=null;
        Token lv_OpRel_12_1=null;
        Token lv_OpRel_12_2=null;
        Token lv_OpRel_12_3=null;
        Token lv_OpRel_12_4=null;
        Token lv_OpRel_12_5=null;
        Token lv_OpRel_12_6=null;
        EObject lv_exprLog_8_0 = null;

        EObject lv_expr1_11_0 = null;

        EObject lv_expr2_13_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:4903:2: ( ( () ( ( ( (lv_n_1_0= '!' ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (lv_n_3_0= '!' ) )? ( (lv_op1_4_0= 'true' ) ) ) | ( ( (lv_n_5_0= '!' ) )? ( (lv_op2_6_0= 'false' ) ) ) | (otherlv_7= '(' ( (lv_exprLog_8_0= ruleExprLogica ) ) otherlv_9= ')' ) | ( ( (lv_n_10_0= '!' ) )? ( (lv_expr1_11_0= ruleExprL ) ) ( ( (lv_OpRel_12_1= '>' | lv_OpRel_12_2= '>=' | lv_OpRel_12_3= '<' | lv_OpRel_12_4= '<=' | lv_OpRel_12_5= '==' | lv_OpRel_12_6= '<>' ) ) ) ( (lv_expr2_13_0= ruleExprL ) ) ) ) ) )
            // InternalCrossPlatform.g:4904:2: ( () ( ( ( (lv_n_1_0= '!' ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (lv_n_3_0= '!' ) )? ( (lv_op1_4_0= 'true' ) ) ) | ( ( (lv_n_5_0= '!' ) )? ( (lv_op2_6_0= 'false' ) ) ) | (otherlv_7= '(' ( (lv_exprLog_8_0= ruleExprLogica ) ) otherlv_9= ')' ) | ( ( (lv_n_10_0= '!' ) )? ( (lv_expr1_11_0= ruleExprL ) ) ( ( (lv_OpRel_12_1= '>' | lv_OpRel_12_2= '>=' | lv_OpRel_12_3= '<' | lv_OpRel_12_4= '<=' | lv_OpRel_12_5= '==' | lv_OpRel_12_6= '<>' ) ) ) ( (lv_expr2_13_0= ruleExprL ) ) ) ) )
            {
            // InternalCrossPlatform.g:4904:2: ( () ( ( ( (lv_n_1_0= '!' ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (lv_n_3_0= '!' ) )? ( (lv_op1_4_0= 'true' ) ) ) | ( ( (lv_n_5_0= '!' ) )? ( (lv_op2_6_0= 'false' ) ) ) | (otherlv_7= '(' ( (lv_exprLog_8_0= ruleExprLogica ) ) otherlv_9= ')' ) | ( ( (lv_n_10_0= '!' ) )? ( (lv_expr1_11_0= ruleExprL ) ) ( ( (lv_OpRel_12_1= '>' | lv_OpRel_12_2= '>=' | lv_OpRel_12_3= '<' | lv_OpRel_12_4= '<=' | lv_OpRel_12_5= '==' | lv_OpRel_12_6= '<>' ) ) ) ( (lv_expr2_13_0= ruleExprL ) ) ) ) )
            // InternalCrossPlatform.g:4905:3: () ( ( ( (lv_n_1_0= '!' ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (lv_n_3_0= '!' ) )? ( (lv_op1_4_0= 'true' ) ) ) | ( ( (lv_n_5_0= '!' ) )? ( (lv_op2_6_0= 'false' ) ) ) | (otherlv_7= '(' ( (lv_exprLog_8_0= ruleExprLogica ) ) otherlv_9= ')' ) | ( ( (lv_n_10_0= '!' ) )? ( (lv_expr1_11_0= ruleExprL ) ) ( ( (lv_OpRel_12_1= '>' | lv_OpRel_12_2= '>=' | lv_OpRel_12_3= '<' | lv_OpRel_12_4= '<=' | lv_OpRel_12_5= '==' | lv_OpRel_12_6= '<>' ) ) ) ( (lv_expr2_13_0= ruleExprL ) ) ) )
            {
            // InternalCrossPlatform.g:4905:3: ()
            // InternalCrossPlatform.g:4906:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFatorLogicoAccess().getFatorLogicoAction_0(),
            					current);
            			

            }

            // InternalCrossPlatform.g:4912:3: ( ( ( (lv_n_1_0= '!' ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (lv_n_3_0= '!' ) )? ( (lv_op1_4_0= 'true' ) ) ) | ( ( (lv_n_5_0= '!' ) )? ( (lv_op2_6_0= 'false' ) ) ) | (otherlv_7= '(' ( (lv_exprLog_8_0= ruleExprLogica ) ) otherlv_9= ')' ) | ( ( (lv_n_10_0= '!' ) )? ( (lv_expr1_11_0= ruleExprL ) ) ( ( (lv_OpRel_12_1= '>' | lv_OpRel_12_2= '>=' | lv_OpRel_12_3= '<' | lv_OpRel_12_4= '<=' | lv_OpRel_12_5= '==' | lv_OpRel_12_6= '<>' ) ) ) ( (lv_expr2_13_0= ruleExprL ) ) ) )
            int alt132=5;
            alt132 = dfa132.predict(input);
            switch (alt132) {
                case 1 :
                    // InternalCrossPlatform.g:4913:4: ( ( (lv_n_1_0= '!' ) )? ( (otherlv_2= RULE_ID ) ) )
                    {
                    // InternalCrossPlatform.g:4913:4: ( ( (lv_n_1_0= '!' ) )? ( (otherlv_2= RULE_ID ) ) )
                    // InternalCrossPlatform.g:4914:5: ( (lv_n_1_0= '!' ) )? ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalCrossPlatform.g:4914:5: ( (lv_n_1_0= '!' ) )?
                    int alt127=2;
                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==64) ) {
                        alt127=1;
                    }
                    switch (alt127) {
                        case 1 :
                            // InternalCrossPlatform.g:4915:6: (lv_n_1_0= '!' )
                            {
                            // InternalCrossPlatform.g:4915:6: (lv_n_1_0= '!' )
                            // InternalCrossPlatform.g:4916:7: lv_n_1_0= '!'
                            {
                            lv_n_1_0=(Token)match(input,64,FOLLOW_4); 

                            							newLeafNode(lv_n_1_0, grammarAccess.getFatorLogicoAccess().getNExclamationMarkKeyword_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFatorLogicoRule());
                            							}
                            							setWithLastConsumed(current, "n", lv_n_1_0, "!");
                            						

                            }


                            }
                            break;

                    }

                    // InternalCrossPlatform.g:4928:5: ( (otherlv_2= RULE_ID ) )
                    // InternalCrossPlatform.g:4929:6: (otherlv_2= RULE_ID )
                    {
                    // InternalCrossPlatform.g:4929:6: (otherlv_2= RULE_ID )
                    // InternalCrossPlatform.g:4930:7: otherlv_2= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFatorLogicoRule());
                    							}
                    						
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    							newLeafNode(otherlv_2, grammarAccess.getFatorLogicoAccess().getVAttributeCrossReference_1_0_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCrossPlatform.g:4943:4: ( ( (lv_n_3_0= '!' ) )? ( (lv_op1_4_0= 'true' ) ) )
                    {
                    // InternalCrossPlatform.g:4943:4: ( ( (lv_n_3_0= '!' ) )? ( (lv_op1_4_0= 'true' ) ) )
                    // InternalCrossPlatform.g:4944:5: ( (lv_n_3_0= '!' ) )? ( (lv_op1_4_0= 'true' ) )
                    {
                    // InternalCrossPlatform.g:4944:5: ( (lv_n_3_0= '!' ) )?
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==64) ) {
                        alt128=1;
                    }
                    switch (alt128) {
                        case 1 :
                            // InternalCrossPlatform.g:4945:6: (lv_n_3_0= '!' )
                            {
                            // InternalCrossPlatform.g:4945:6: (lv_n_3_0= '!' )
                            // InternalCrossPlatform.g:4946:7: lv_n_3_0= '!'
                            {
                            lv_n_3_0=(Token)match(input,64,FOLLOW_57); 

                            							newLeafNode(lv_n_3_0, grammarAccess.getFatorLogicoAccess().getNExclamationMarkKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFatorLogicoRule());
                            							}
                            							setWithLastConsumed(current, "n", lv_n_3_0, "!");
                            						

                            }


                            }
                            break;

                    }

                    // InternalCrossPlatform.g:4958:5: ( (lv_op1_4_0= 'true' ) )
                    // InternalCrossPlatform.g:4959:6: (lv_op1_4_0= 'true' )
                    {
                    // InternalCrossPlatform.g:4959:6: (lv_op1_4_0= 'true' )
                    // InternalCrossPlatform.g:4960:7: lv_op1_4_0= 'true'
                    {
                    lv_op1_4_0=(Token)match(input,65,FOLLOW_2); 

                    							newLeafNode(lv_op1_4_0, grammarAccess.getFatorLogicoAccess().getOp1TrueKeyword_1_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFatorLogicoRule());
                    							}
                    							setWithLastConsumed(current, "op1", lv_op1_4_0, "true");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCrossPlatform.g:4974:4: ( ( (lv_n_5_0= '!' ) )? ( (lv_op2_6_0= 'false' ) ) )
                    {
                    // InternalCrossPlatform.g:4974:4: ( ( (lv_n_5_0= '!' ) )? ( (lv_op2_6_0= 'false' ) ) )
                    // InternalCrossPlatform.g:4975:5: ( (lv_n_5_0= '!' ) )? ( (lv_op2_6_0= 'false' ) )
                    {
                    // InternalCrossPlatform.g:4975:5: ( (lv_n_5_0= '!' ) )?
                    int alt129=2;
                    int LA129_0 = input.LA(1);

                    if ( (LA129_0==64) ) {
                        alt129=1;
                    }
                    switch (alt129) {
                        case 1 :
                            // InternalCrossPlatform.g:4976:6: (lv_n_5_0= '!' )
                            {
                            // InternalCrossPlatform.g:4976:6: (lv_n_5_0= '!' )
                            // InternalCrossPlatform.g:4977:7: lv_n_5_0= '!'
                            {
                            lv_n_5_0=(Token)match(input,64,FOLLOW_58); 

                            							newLeafNode(lv_n_5_0, grammarAccess.getFatorLogicoAccess().getNExclamationMarkKeyword_1_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFatorLogicoRule());
                            							}
                            							setWithLastConsumed(current, "n", lv_n_5_0, "!");
                            						

                            }


                            }
                            break;

                    }

                    // InternalCrossPlatform.g:4989:5: ( (lv_op2_6_0= 'false' ) )
                    // InternalCrossPlatform.g:4990:6: (lv_op2_6_0= 'false' )
                    {
                    // InternalCrossPlatform.g:4990:6: (lv_op2_6_0= 'false' )
                    // InternalCrossPlatform.g:4991:7: lv_op2_6_0= 'false'
                    {
                    lv_op2_6_0=(Token)match(input,66,FOLLOW_2); 

                    							newLeafNode(lv_op2_6_0, grammarAccess.getFatorLogicoAccess().getOp2FalseKeyword_1_2_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFatorLogicoRule());
                    							}
                    							setWithLastConsumed(current, "op2", lv_op2_6_0, "false");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalCrossPlatform.g:5005:4: (otherlv_7= '(' ( (lv_exprLog_8_0= ruleExprLogica ) ) otherlv_9= ')' )
                    {
                    // InternalCrossPlatform.g:5005:4: (otherlv_7= '(' ( (lv_exprLog_8_0= ruleExprLogica ) ) otherlv_9= ')' )
                    // InternalCrossPlatform.g:5006:5: otherlv_7= '(' ( (lv_exprLog_8_0= ruleExprLogica ) ) otherlv_9= ')'
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_52); 

                    					newLeafNode(otherlv_7, grammarAccess.getFatorLogicoAccess().getLeftParenthesisKeyword_1_3_0());
                    				
                    // InternalCrossPlatform.g:5010:5: ( (lv_exprLog_8_0= ruleExprLogica ) )
                    // InternalCrossPlatform.g:5011:6: (lv_exprLog_8_0= ruleExprLogica )
                    {
                    // InternalCrossPlatform.g:5011:6: (lv_exprLog_8_0= ruleExprLogica )
                    // InternalCrossPlatform.g:5012:7: lv_exprLog_8_0= ruleExprLogica
                    {

                    							newCompositeNode(grammarAccess.getFatorLogicoAccess().getExprLogExprLogicaParserRuleCall_1_3_1_0());
                    						
                    pushFollow(FOLLOW_59);
                    lv_exprLog_8_0=ruleExprLogica();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFatorLogicoRule());
                    							}
                    							set(
                    								current,
                    								"exprLog",
                    								lv_exprLog_8_0,
                    								"br.dslcross.crossplatform.CrossPlatform.ExprLogica");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_9=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(otherlv_9, grammarAccess.getFatorLogicoAccess().getRightParenthesisKeyword_1_3_2());
                    				

                    }


                    }
                    break;
                case 5 :
                    // InternalCrossPlatform.g:5035:4: ( ( (lv_n_10_0= '!' ) )? ( (lv_expr1_11_0= ruleExprL ) ) ( ( (lv_OpRel_12_1= '>' | lv_OpRel_12_2= '>=' | lv_OpRel_12_3= '<' | lv_OpRel_12_4= '<=' | lv_OpRel_12_5= '==' | lv_OpRel_12_6= '<>' ) ) ) ( (lv_expr2_13_0= ruleExprL ) ) )
                    {
                    // InternalCrossPlatform.g:5035:4: ( ( (lv_n_10_0= '!' ) )? ( (lv_expr1_11_0= ruleExprL ) ) ( ( (lv_OpRel_12_1= '>' | lv_OpRel_12_2= '>=' | lv_OpRel_12_3= '<' | lv_OpRel_12_4= '<=' | lv_OpRel_12_5= '==' | lv_OpRel_12_6= '<>' ) ) ) ( (lv_expr2_13_0= ruleExprL ) ) )
                    // InternalCrossPlatform.g:5036:5: ( (lv_n_10_0= '!' ) )? ( (lv_expr1_11_0= ruleExprL ) ) ( ( (lv_OpRel_12_1= '>' | lv_OpRel_12_2= '>=' | lv_OpRel_12_3= '<' | lv_OpRel_12_4= '<=' | lv_OpRel_12_5= '==' | lv_OpRel_12_6= '<>' ) ) ) ( (lv_expr2_13_0= ruleExprL ) )
                    {
                    // InternalCrossPlatform.g:5036:5: ( (lv_n_10_0= '!' ) )?
                    int alt130=2;
                    int LA130_0 = input.LA(1);

                    if ( (LA130_0==64) ) {
                        alt130=1;
                    }
                    switch (alt130) {
                        case 1 :
                            // InternalCrossPlatform.g:5037:6: (lv_n_10_0= '!' )
                            {
                            // InternalCrossPlatform.g:5037:6: (lv_n_10_0= '!' )
                            // InternalCrossPlatform.g:5038:7: lv_n_10_0= '!'
                            {
                            lv_n_10_0=(Token)match(input,64,FOLLOW_52); 

                            							newLeafNode(lv_n_10_0, grammarAccess.getFatorLogicoAccess().getNExclamationMarkKeyword_1_4_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFatorLogicoRule());
                            							}
                            							setWithLastConsumed(current, "n", lv_n_10_0, "!");
                            						

                            }


                            }
                            break;

                    }

                    // InternalCrossPlatform.g:5050:5: ( (lv_expr1_11_0= ruleExprL ) )
                    // InternalCrossPlatform.g:5051:6: (lv_expr1_11_0= ruleExprL )
                    {
                    // InternalCrossPlatform.g:5051:6: (lv_expr1_11_0= ruleExprL )
                    // InternalCrossPlatform.g:5052:7: lv_expr1_11_0= ruleExprL
                    {

                    							newCompositeNode(grammarAccess.getFatorLogicoAccess().getExpr1ExprLParserRuleCall_1_4_1_0());
                    						
                    pushFollow(FOLLOW_60);
                    lv_expr1_11_0=ruleExprL();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFatorLogicoRule());
                    							}
                    							set(
                    								current,
                    								"expr1",
                    								lv_expr1_11_0,
                    								"br.dslcross.crossplatform.CrossPlatform.ExprL");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalCrossPlatform.g:5069:5: ( ( (lv_OpRel_12_1= '>' | lv_OpRel_12_2= '>=' | lv_OpRel_12_3= '<' | lv_OpRel_12_4= '<=' | lv_OpRel_12_5= '==' | lv_OpRel_12_6= '<>' ) ) )
                    // InternalCrossPlatform.g:5070:6: ( (lv_OpRel_12_1= '>' | lv_OpRel_12_2= '>=' | lv_OpRel_12_3= '<' | lv_OpRel_12_4= '<=' | lv_OpRel_12_5= '==' | lv_OpRel_12_6= '<>' ) )
                    {
                    // InternalCrossPlatform.g:5070:6: ( (lv_OpRel_12_1= '>' | lv_OpRel_12_2= '>=' | lv_OpRel_12_3= '<' | lv_OpRel_12_4= '<=' | lv_OpRel_12_5= '==' | lv_OpRel_12_6= '<>' ) )
                    // InternalCrossPlatform.g:5071:7: (lv_OpRel_12_1= '>' | lv_OpRel_12_2= '>=' | lv_OpRel_12_3= '<' | lv_OpRel_12_4= '<=' | lv_OpRel_12_5= '==' | lv_OpRel_12_6= '<>' )
                    {
                    // InternalCrossPlatform.g:5071:7: (lv_OpRel_12_1= '>' | lv_OpRel_12_2= '>=' | lv_OpRel_12_3= '<' | lv_OpRel_12_4= '<=' | lv_OpRel_12_5= '==' | lv_OpRel_12_6= '<>' )
                    int alt131=6;
                    switch ( input.LA(1) ) {
                    case 27:
                        {
                        alt131=1;
                        }
                        break;
                    case 67:
                        {
                        alt131=2;
                        }
                        break;
                    case 25:
                        {
                        alt131=3;
                        }
                        break;
                    case 68:
                        {
                        alt131=4;
                        }
                        break;
                    case 69:
                        {
                        alt131=5;
                        }
                        break;
                    case 70:
                        {
                        alt131=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 131, 0, input);

                        throw nvae;
                    }

                    switch (alt131) {
                        case 1 :
                            // InternalCrossPlatform.g:5072:8: lv_OpRel_12_1= '>'
                            {
                            lv_OpRel_12_1=(Token)match(input,27,FOLLOW_52); 

                            								newLeafNode(lv_OpRel_12_1, grammarAccess.getFatorLogicoAccess().getOpRelGreaterThanSignKeyword_1_4_2_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getFatorLogicoRule());
                            								}
                            								setWithLastConsumed(current, "OpRel", lv_OpRel_12_1, null);
                            							

                            }
                            break;
                        case 2 :
                            // InternalCrossPlatform.g:5083:8: lv_OpRel_12_2= '>='
                            {
                            lv_OpRel_12_2=(Token)match(input,67,FOLLOW_52); 

                            								newLeafNode(lv_OpRel_12_2, grammarAccess.getFatorLogicoAccess().getOpRelGreaterThanSignEqualsSignKeyword_1_4_2_0_1());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getFatorLogicoRule());
                            								}
                            								setWithLastConsumed(current, "OpRel", lv_OpRel_12_2, null);
                            							

                            }
                            break;
                        case 3 :
                            // InternalCrossPlatform.g:5094:8: lv_OpRel_12_3= '<'
                            {
                            lv_OpRel_12_3=(Token)match(input,25,FOLLOW_52); 

                            								newLeafNode(lv_OpRel_12_3, grammarAccess.getFatorLogicoAccess().getOpRelLessThanSignKeyword_1_4_2_0_2());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getFatorLogicoRule());
                            								}
                            								setWithLastConsumed(current, "OpRel", lv_OpRel_12_3, null);
                            							

                            }
                            break;
                        case 4 :
                            // InternalCrossPlatform.g:5105:8: lv_OpRel_12_4= '<='
                            {
                            lv_OpRel_12_4=(Token)match(input,68,FOLLOW_52); 

                            								newLeafNode(lv_OpRel_12_4, grammarAccess.getFatorLogicoAccess().getOpRelLessThanSignEqualsSignKeyword_1_4_2_0_3());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getFatorLogicoRule());
                            								}
                            								setWithLastConsumed(current, "OpRel", lv_OpRel_12_4, null);
                            							

                            }
                            break;
                        case 5 :
                            // InternalCrossPlatform.g:5116:8: lv_OpRel_12_5= '=='
                            {
                            lv_OpRel_12_5=(Token)match(input,69,FOLLOW_52); 

                            								newLeafNode(lv_OpRel_12_5, grammarAccess.getFatorLogicoAccess().getOpRelEqualsSignEqualsSignKeyword_1_4_2_0_4());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getFatorLogicoRule());
                            								}
                            								setWithLastConsumed(current, "OpRel", lv_OpRel_12_5, null);
                            							

                            }
                            break;
                        case 6 :
                            // InternalCrossPlatform.g:5127:8: lv_OpRel_12_6= '<>'
                            {
                            lv_OpRel_12_6=(Token)match(input,70,FOLLOW_52); 

                            								newLeafNode(lv_OpRel_12_6, grammarAccess.getFatorLogicoAccess().getOpRelLessThanSignGreaterThanSignKeyword_1_4_2_0_5());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getFatorLogicoRule());
                            								}
                            								setWithLastConsumed(current, "OpRel", lv_OpRel_12_6, null);
                            							

                            }
                            break;

                    }


                    }


                    }

                    // InternalCrossPlatform.g:5140:5: ( (lv_expr2_13_0= ruleExprL ) )
                    // InternalCrossPlatform.g:5141:6: (lv_expr2_13_0= ruleExprL )
                    {
                    // InternalCrossPlatform.g:5141:6: (lv_expr2_13_0= ruleExprL )
                    // InternalCrossPlatform.g:5142:7: lv_expr2_13_0= ruleExprL
                    {

                    							newCompositeNode(grammarAccess.getFatorLogicoAccess().getExpr2ExprLParserRuleCall_1_4_3_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_expr2_13_0=ruleExprL();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFatorLogicoRule());
                    							}
                    							set(
                    								current,
                    								"expr2",
                    								lv_expr2_13_0,
                    								"br.dslcross.crossplatform.CrossPlatform.ExprL");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFatorLogico"


    // $ANTLR start "entryRuleComLog"
    // InternalCrossPlatform.g:5165:1: entryRuleComLog returns [EObject current=null] : iv_ruleComLog= ruleComLog EOF ;
    public final EObject entryRuleComLog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComLog = null;


        try {
            // InternalCrossPlatform.g:5165:47: (iv_ruleComLog= ruleComLog EOF )
            // InternalCrossPlatform.g:5166:2: iv_ruleComLog= ruleComLog EOF
            {
             newCompositeNode(grammarAccess.getComLogRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComLog=ruleComLog();

            state._fsp--;

             current =iv_ruleComLog; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComLog"


    // $ANTLR start "ruleComLog"
    // InternalCrossPlatform.g:5172:1: ruleComLog returns [EObject current=null] : ( () ( (lv_comLog_1_0= 'While' ) ) ) ;
    public final EObject ruleComLog() throws RecognitionException {
        EObject current = null;

        Token lv_comLog_1_0=null;


        	enterRule();

        try {
            // InternalCrossPlatform.g:5178:2: ( ( () ( (lv_comLog_1_0= 'While' ) ) ) )
            // InternalCrossPlatform.g:5179:2: ( () ( (lv_comLog_1_0= 'While' ) ) )
            {
            // InternalCrossPlatform.g:5179:2: ( () ( (lv_comLog_1_0= 'While' ) ) )
            // InternalCrossPlatform.g:5180:3: () ( (lv_comLog_1_0= 'While' ) )
            {
            // InternalCrossPlatform.g:5180:3: ()
            // InternalCrossPlatform.g:5181:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComLogAccess().getComLogAction_0(),
            					current);
            			

            }

            // InternalCrossPlatform.g:5187:3: ( (lv_comLog_1_0= 'While' ) )
            // InternalCrossPlatform.g:5188:4: (lv_comLog_1_0= 'While' )
            {
            // InternalCrossPlatform.g:5188:4: (lv_comLog_1_0= 'While' )
            // InternalCrossPlatform.g:5189:5: lv_comLog_1_0= 'While'
            {
            lv_comLog_1_0=(Token)match(input,71,FOLLOW_2); 

            					newLeafNode(lv_comLog_1_0, grammarAccess.getComLogAccess().getComLogWhileKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComLogRule());
            					}
            					setWithLastConsumed(current, "comLog", lv_comLog_1_0, "While");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComLog"


    // $ANTLR start "entryRuleExprL"
    // InternalCrossPlatform.g:5205:1: entryRuleExprL returns [EObject current=null] : iv_ruleExprL= ruleExprL EOF ;
    public final EObject entryRuleExprL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprL = null;


        try {
            // InternalCrossPlatform.g:5205:46: (iv_ruleExprL= ruleExprL EOF )
            // InternalCrossPlatform.g:5206:2: iv_ruleExprL= ruleExprL EOF
            {
             newCompositeNode(grammarAccess.getExprLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExprL=ruleExprL();

            state._fsp--;

             current =iv_ruleExprL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprL"


    // $ANTLR start "ruleExprL"
    // InternalCrossPlatform.g:5212:1: ruleExprL returns [EObject current=null] : ( ( () ( ( ( (lv_v_1_0= RULE_ID ) ) ( (lv_col1_2_0= '[' ) )? ( (lv_array_3_0= RULE_INT ) )? ( (lv_col2_4_0= ']' ) )? ) | ( ( (lv_i_5_0= RULE_INT ) ) (otherlv_6= '.' )? ( (lv_iD_7_0= RULE_INT ) )? ) | ( ( (lv_vAtr1_8_0= RULE_ID ) ) (otherlv_9= '.' ( (lv_vAtr2_10_0= ruleAttribID ) ) )+ ) ) ) | ( (lv_strVar_11_0= RULE_STRING ) ) | ( (lv_opLog_12_0= 'true' ) ) | ( (lv_opLog_13_0= 'false' ) ) ) ;
    public final EObject ruleExprL() throws RecognitionException {
        EObject current = null;

        Token lv_v_1_0=null;
        Token lv_col1_2_0=null;
        Token lv_array_3_0=null;
        Token lv_col2_4_0=null;
        Token lv_i_5_0=null;
        Token otherlv_6=null;
        Token lv_iD_7_0=null;
        Token lv_vAtr1_8_0=null;
        Token otherlv_9=null;
        Token lv_strVar_11_0=null;
        Token lv_opLog_12_0=null;
        Token lv_opLog_13_0=null;
        EObject lv_vAtr2_10_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:5218:2: ( ( ( () ( ( ( (lv_v_1_0= RULE_ID ) ) ( (lv_col1_2_0= '[' ) )? ( (lv_array_3_0= RULE_INT ) )? ( (lv_col2_4_0= ']' ) )? ) | ( ( (lv_i_5_0= RULE_INT ) ) (otherlv_6= '.' )? ( (lv_iD_7_0= RULE_INT ) )? ) | ( ( (lv_vAtr1_8_0= RULE_ID ) ) (otherlv_9= '.' ( (lv_vAtr2_10_0= ruleAttribID ) ) )+ ) ) ) | ( (lv_strVar_11_0= RULE_STRING ) ) | ( (lv_opLog_12_0= 'true' ) ) | ( (lv_opLog_13_0= 'false' ) ) ) )
            // InternalCrossPlatform.g:5219:2: ( ( () ( ( ( (lv_v_1_0= RULE_ID ) ) ( (lv_col1_2_0= '[' ) )? ( (lv_array_3_0= RULE_INT ) )? ( (lv_col2_4_0= ']' ) )? ) | ( ( (lv_i_5_0= RULE_INT ) ) (otherlv_6= '.' )? ( (lv_iD_7_0= RULE_INT ) )? ) | ( ( (lv_vAtr1_8_0= RULE_ID ) ) (otherlv_9= '.' ( (lv_vAtr2_10_0= ruleAttribID ) ) )+ ) ) ) | ( (lv_strVar_11_0= RULE_STRING ) ) | ( (lv_opLog_12_0= 'true' ) ) | ( (lv_opLog_13_0= 'false' ) ) )
            {
            // InternalCrossPlatform.g:5219:2: ( ( () ( ( ( (lv_v_1_0= RULE_ID ) ) ( (lv_col1_2_0= '[' ) )? ( (lv_array_3_0= RULE_INT ) )? ( (lv_col2_4_0= ']' ) )? ) | ( ( (lv_i_5_0= RULE_INT ) ) (otherlv_6= '.' )? ( (lv_iD_7_0= RULE_INT ) )? ) | ( ( (lv_vAtr1_8_0= RULE_ID ) ) (otherlv_9= '.' ( (lv_vAtr2_10_0= ruleAttribID ) ) )+ ) ) ) | ( (lv_strVar_11_0= RULE_STRING ) ) | ( (lv_opLog_12_0= 'true' ) ) | ( (lv_opLog_13_0= 'false' ) ) )
            int alt140=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_INT:
                {
                alt140=1;
                }
                break;
            case RULE_STRING:
                {
                alt140=2;
                }
                break;
            case 65:
                {
                alt140=3;
                }
                break;
            case 66:
                {
                alt140=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 140, 0, input);

                throw nvae;
            }

            switch (alt140) {
                case 1 :
                    // InternalCrossPlatform.g:5220:3: ( () ( ( ( (lv_v_1_0= RULE_ID ) ) ( (lv_col1_2_0= '[' ) )? ( (lv_array_3_0= RULE_INT ) )? ( (lv_col2_4_0= ']' ) )? ) | ( ( (lv_i_5_0= RULE_INT ) ) (otherlv_6= '.' )? ( (lv_iD_7_0= RULE_INT ) )? ) | ( ( (lv_vAtr1_8_0= RULE_ID ) ) (otherlv_9= '.' ( (lv_vAtr2_10_0= ruleAttribID ) ) )+ ) ) )
                    {
                    // InternalCrossPlatform.g:5220:3: ( () ( ( ( (lv_v_1_0= RULE_ID ) ) ( (lv_col1_2_0= '[' ) )? ( (lv_array_3_0= RULE_INT ) )? ( (lv_col2_4_0= ']' ) )? ) | ( ( (lv_i_5_0= RULE_INT ) ) (otherlv_6= '.' )? ( (lv_iD_7_0= RULE_INT ) )? ) | ( ( (lv_vAtr1_8_0= RULE_ID ) ) (otherlv_9= '.' ( (lv_vAtr2_10_0= ruleAttribID ) ) )+ ) ) )
                    // InternalCrossPlatform.g:5221:4: () ( ( ( (lv_v_1_0= RULE_ID ) ) ( (lv_col1_2_0= '[' ) )? ( (lv_array_3_0= RULE_INT ) )? ( (lv_col2_4_0= ']' ) )? ) | ( ( (lv_i_5_0= RULE_INT ) ) (otherlv_6= '.' )? ( (lv_iD_7_0= RULE_INT ) )? ) | ( ( (lv_vAtr1_8_0= RULE_ID ) ) (otherlv_9= '.' ( (lv_vAtr2_10_0= ruleAttribID ) ) )+ ) )
                    {
                    // InternalCrossPlatform.g:5221:4: ()
                    // InternalCrossPlatform.g:5222:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExprLAccess().getExprLAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCrossPlatform.g:5228:4: ( ( ( (lv_v_1_0= RULE_ID ) ) ( (lv_col1_2_0= '[' ) )? ( (lv_array_3_0= RULE_INT ) )? ( (lv_col2_4_0= ']' ) )? ) | ( ( (lv_i_5_0= RULE_INT ) ) (otherlv_6= '.' )? ( (lv_iD_7_0= RULE_INT ) )? ) | ( ( (lv_vAtr1_8_0= RULE_ID ) ) (otherlv_9= '.' ( (lv_vAtr2_10_0= ruleAttribID ) ) )+ ) )
                    int alt139=3;
                    int LA139_0 = input.LA(1);

                    if ( (LA139_0==RULE_ID) ) {
                        int LA139_1 = input.LA(2);

                        if ( (LA139_1==15) ) {
                            alt139=3;
                        }
                        else if ( (LA139_1==EOF||(LA139_1>=RULE_ID && LA139_1<=RULE_STRINGTEMPLATE)||(LA139_1>=13 && LA139_1<=14)||(LA139_1>=25 && LA139_1<=27)||(LA139_1>=29 && LA139_1<=31)||LA139_1==33||LA139_1==42||(LA139_1>=48 && LA139_1<=51)||(LA139_1>=57 && LA139_1<=59)||(LA139_1>=62 && LA139_1<=63)||(LA139_1>=67 && LA139_1<=72)) ) {
                            alt139=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 139, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA139_0==RULE_INT) ) {
                        alt139=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 139, 0, input);

                        throw nvae;
                    }
                    switch (alt139) {
                        case 1 :
                            // InternalCrossPlatform.g:5229:5: ( ( (lv_v_1_0= RULE_ID ) ) ( (lv_col1_2_0= '[' ) )? ( (lv_array_3_0= RULE_INT ) )? ( (lv_col2_4_0= ']' ) )? )
                            {
                            // InternalCrossPlatform.g:5229:5: ( ( (lv_v_1_0= RULE_ID ) ) ( (lv_col1_2_0= '[' ) )? ( (lv_array_3_0= RULE_INT ) )? ( (lv_col2_4_0= ']' ) )? )
                            // InternalCrossPlatform.g:5230:6: ( (lv_v_1_0= RULE_ID ) ) ( (lv_col1_2_0= '[' ) )? ( (lv_array_3_0= RULE_INT ) )? ( (lv_col2_4_0= ']' ) )?
                            {
                            // InternalCrossPlatform.g:5230:6: ( (lv_v_1_0= RULE_ID ) )
                            // InternalCrossPlatform.g:5231:7: (lv_v_1_0= RULE_ID )
                            {
                            // InternalCrossPlatform.g:5231:7: (lv_v_1_0= RULE_ID )
                            // InternalCrossPlatform.g:5232:8: lv_v_1_0= RULE_ID
                            {
                            lv_v_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                            								newLeafNode(lv_v_1_0, grammarAccess.getExprLAccess().getVIDTerminalRuleCall_0_1_0_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getExprLRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"v",
                            									lv_v_1_0,
                            									"org.eclipse.xtext.common.Terminals.ID");
                            							

                            }


                            }

                            // InternalCrossPlatform.g:5248:6: ( (lv_col1_2_0= '[' ) )?
                            int alt133=2;
                            int LA133_0 = input.LA(1);

                            if ( (LA133_0==30) ) {
                                alt133=1;
                            }
                            switch (alt133) {
                                case 1 :
                                    // InternalCrossPlatform.g:5249:7: (lv_col1_2_0= '[' )
                                    {
                                    // InternalCrossPlatform.g:5249:7: (lv_col1_2_0= '[' )
                                    // InternalCrossPlatform.g:5250:8: lv_col1_2_0= '['
                                    {
                                    lv_col1_2_0=(Token)match(input,30,FOLLOW_20); 

                                    								newLeafNode(lv_col1_2_0, grammarAccess.getExprLAccess().getCol1LeftSquareBracketKeyword_0_1_0_1_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getExprLRule());
                                    								}
                                    								setWithLastConsumed(current, "col1", lv_col1_2_0, "[");
                                    							

                                    }


                                    }
                                    break;

                            }

                            // InternalCrossPlatform.g:5262:6: ( (lv_array_3_0= RULE_INT ) )?
                            int alt134=2;
                            int LA134_0 = input.LA(1);

                            if ( (LA134_0==RULE_INT) ) {
                                alt134=1;
                            }
                            switch (alt134) {
                                case 1 :
                                    // InternalCrossPlatform.g:5263:7: (lv_array_3_0= RULE_INT )
                                    {
                                    // InternalCrossPlatform.g:5263:7: (lv_array_3_0= RULE_INT )
                                    // InternalCrossPlatform.g:5264:8: lv_array_3_0= RULE_INT
                                    {
                                    lv_array_3_0=(Token)match(input,RULE_INT,FOLLOW_21); 

                                    								newLeafNode(lv_array_3_0, grammarAccess.getExprLAccess().getArrayINTTerminalRuleCall_0_1_0_2_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getExprLRule());
                                    								}
                                    								setWithLastConsumed(
                                    									current,
                                    									"array",
                                    									lv_array_3_0,
                                    									"org.eclipse.xtext.common.Terminals.INT");
                                    							

                                    }


                                    }
                                    break;

                            }

                            // InternalCrossPlatform.g:5280:6: ( (lv_col2_4_0= ']' ) )?
                            int alt135=2;
                            int LA135_0 = input.LA(1);

                            if ( (LA135_0==31) ) {
                                alt135=1;
                            }
                            switch (alt135) {
                                case 1 :
                                    // InternalCrossPlatform.g:5281:7: (lv_col2_4_0= ']' )
                                    {
                                    // InternalCrossPlatform.g:5281:7: (lv_col2_4_0= ']' )
                                    // InternalCrossPlatform.g:5282:8: lv_col2_4_0= ']'
                                    {
                                    lv_col2_4_0=(Token)match(input,31,FOLLOW_2); 

                                    								newLeafNode(lv_col2_4_0, grammarAccess.getExprLAccess().getCol2RightSquareBracketKeyword_0_1_0_3_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getExprLRule());
                                    								}
                                    								setWithLastConsumed(current, "col2", lv_col2_4_0, "]");
                                    							

                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalCrossPlatform.g:5296:5: ( ( (lv_i_5_0= RULE_INT ) ) (otherlv_6= '.' )? ( (lv_iD_7_0= RULE_INT ) )? )
                            {
                            // InternalCrossPlatform.g:5296:5: ( ( (lv_i_5_0= RULE_INT ) ) (otherlv_6= '.' )? ( (lv_iD_7_0= RULE_INT ) )? )
                            // InternalCrossPlatform.g:5297:6: ( (lv_i_5_0= RULE_INT ) ) (otherlv_6= '.' )? ( (lv_iD_7_0= RULE_INT ) )?
                            {
                            // InternalCrossPlatform.g:5297:6: ( (lv_i_5_0= RULE_INT ) )
                            // InternalCrossPlatform.g:5298:7: (lv_i_5_0= RULE_INT )
                            {
                            // InternalCrossPlatform.g:5298:7: (lv_i_5_0= RULE_INT )
                            // InternalCrossPlatform.g:5299:8: lv_i_5_0= RULE_INT
                            {
                            lv_i_5_0=(Token)match(input,RULE_INT,FOLLOW_61); 

                            								newLeafNode(lv_i_5_0, grammarAccess.getExprLAccess().getIINTTerminalRuleCall_0_1_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getExprLRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"i",
                            									lv_i_5_0,
                            									"org.eclipse.xtext.common.Terminals.INT");
                            							

                            }


                            }

                            // InternalCrossPlatform.g:5315:6: (otherlv_6= '.' )?
                            int alt136=2;
                            int LA136_0 = input.LA(1);

                            if ( (LA136_0==15) ) {
                                alt136=1;
                            }
                            switch (alt136) {
                                case 1 :
                                    // InternalCrossPlatform.g:5316:7: otherlv_6= '.'
                                    {
                                    otherlv_6=(Token)match(input,15,FOLLOW_62); 

                                    							newLeafNode(otherlv_6, grammarAccess.getExprLAccess().getFullStopKeyword_0_1_1_1());
                                    						

                                    }
                                    break;

                            }

                            // InternalCrossPlatform.g:5321:6: ( (lv_iD_7_0= RULE_INT ) )?
                            int alt137=2;
                            int LA137_0 = input.LA(1);

                            if ( (LA137_0==RULE_INT) ) {
                                alt137=1;
                            }
                            switch (alt137) {
                                case 1 :
                                    // InternalCrossPlatform.g:5322:7: (lv_iD_7_0= RULE_INT )
                                    {
                                    // InternalCrossPlatform.g:5322:7: (lv_iD_7_0= RULE_INT )
                                    // InternalCrossPlatform.g:5323:8: lv_iD_7_0= RULE_INT
                                    {
                                    lv_iD_7_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                                    								newLeafNode(lv_iD_7_0, grammarAccess.getExprLAccess().getIDINTTerminalRuleCall_0_1_1_2_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getExprLRule());
                                    								}
                                    								setWithLastConsumed(
                                    									current,
                                    									"iD",
                                    									lv_iD_7_0,
                                    									"org.eclipse.xtext.common.Terminals.INT");
                                    							

                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalCrossPlatform.g:5341:5: ( ( (lv_vAtr1_8_0= RULE_ID ) ) (otherlv_9= '.' ( (lv_vAtr2_10_0= ruleAttribID ) ) )+ )
                            {
                            // InternalCrossPlatform.g:5341:5: ( ( (lv_vAtr1_8_0= RULE_ID ) ) (otherlv_9= '.' ( (lv_vAtr2_10_0= ruleAttribID ) ) )+ )
                            // InternalCrossPlatform.g:5342:6: ( (lv_vAtr1_8_0= RULE_ID ) ) (otherlv_9= '.' ( (lv_vAtr2_10_0= ruleAttribID ) ) )+
                            {
                            // InternalCrossPlatform.g:5342:6: ( (lv_vAtr1_8_0= RULE_ID ) )
                            // InternalCrossPlatform.g:5343:7: (lv_vAtr1_8_0= RULE_ID )
                            {
                            // InternalCrossPlatform.g:5343:7: (lv_vAtr1_8_0= RULE_ID )
                            // InternalCrossPlatform.g:5344:8: lv_vAtr1_8_0= RULE_ID
                            {
                            lv_vAtr1_8_0=(Token)match(input,RULE_ID,FOLLOW_48); 

                            								newLeafNode(lv_vAtr1_8_0, grammarAccess.getExprLAccess().getVAtr1IDTerminalRuleCall_0_1_2_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getExprLRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"vAtr1",
                            									lv_vAtr1_8_0,
                            									"org.eclipse.xtext.common.Terminals.ID");
                            							

                            }


                            }

                            // InternalCrossPlatform.g:5360:6: (otherlv_9= '.' ( (lv_vAtr2_10_0= ruleAttribID ) ) )+
                            int cnt138=0;
                            loop138:
                            do {
                                int alt138=2;
                                int LA138_0 = input.LA(1);

                                if ( (LA138_0==15) ) {
                                    alt138=1;
                                }


                                switch (alt138) {
                            	case 1 :
                            	    // InternalCrossPlatform.g:5361:7: otherlv_9= '.' ( (lv_vAtr2_10_0= ruleAttribID ) )
                            	    {
                            	    otherlv_9=(Token)match(input,15,FOLLOW_51); 

                            	    							newLeafNode(otherlv_9, grammarAccess.getExprLAccess().getFullStopKeyword_0_1_2_1_0());
                            	    						
                            	    // InternalCrossPlatform.g:5365:7: ( (lv_vAtr2_10_0= ruleAttribID ) )
                            	    // InternalCrossPlatform.g:5366:8: (lv_vAtr2_10_0= ruleAttribID )
                            	    {
                            	    // InternalCrossPlatform.g:5366:8: (lv_vAtr2_10_0= ruleAttribID )
                            	    // InternalCrossPlatform.g:5367:9: lv_vAtr2_10_0= ruleAttribID
                            	    {

                            	    									newCompositeNode(grammarAccess.getExprLAccess().getVAtr2AttribIDParserRuleCall_0_1_2_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_7);
                            	    lv_vAtr2_10_0=ruleAttribID();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getExprLRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"vAtr2",
                            	    										lv_vAtr2_10_0,
                            	    										"br.dslcross.crossplatform.CrossPlatform.AttribID");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt138 >= 1 ) break loop138;
                                        EarlyExitException eee =
                                            new EarlyExitException(138, input);
                                        throw eee;
                                }
                                cnt138++;
                            } while (true);


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCrossPlatform.g:5389:3: ( (lv_strVar_11_0= RULE_STRING ) )
                    {
                    // InternalCrossPlatform.g:5389:3: ( (lv_strVar_11_0= RULE_STRING ) )
                    // InternalCrossPlatform.g:5390:4: (lv_strVar_11_0= RULE_STRING )
                    {
                    // InternalCrossPlatform.g:5390:4: (lv_strVar_11_0= RULE_STRING )
                    // InternalCrossPlatform.g:5391:5: lv_strVar_11_0= RULE_STRING
                    {
                    lv_strVar_11_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_strVar_11_0, grammarAccess.getExprLAccess().getStrVarSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExprLRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"strVar",
                    						lv_strVar_11_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCrossPlatform.g:5408:3: ( (lv_opLog_12_0= 'true' ) )
                    {
                    // InternalCrossPlatform.g:5408:3: ( (lv_opLog_12_0= 'true' ) )
                    // InternalCrossPlatform.g:5409:4: (lv_opLog_12_0= 'true' )
                    {
                    // InternalCrossPlatform.g:5409:4: (lv_opLog_12_0= 'true' )
                    // InternalCrossPlatform.g:5410:5: lv_opLog_12_0= 'true'
                    {
                    lv_opLog_12_0=(Token)match(input,65,FOLLOW_2); 

                    					newLeafNode(lv_opLog_12_0, grammarAccess.getExprLAccess().getOpLogTrueKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExprLRule());
                    					}
                    					setWithLastConsumed(current, "opLog", lv_opLog_12_0, "true");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalCrossPlatform.g:5423:3: ( (lv_opLog_13_0= 'false' ) )
                    {
                    // InternalCrossPlatform.g:5423:3: ( (lv_opLog_13_0= 'false' ) )
                    // InternalCrossPlatform.g:5424:4: (lv_opLog_13_0= 'false' )
                    {
                    // InternalCrossPlatform.g:5424:4: (lv_opLog_13_0= 'false' )
                    // InternalCrossPlatform.g:5425:5: lv_opLog_13_0= 'false'
                    {
                    lv_opLog_13_0=(Token)match(input,66,FOLLOW_2); 

                    					newLeafNode(lv_opLog_13_0, grammarAccess.getExprLAccess().getOpLogFalseKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExprLRule());
                    					}
                    					setWithLastConsumed(current, "opLog", lv_opLog_13_0, "false");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprL"


    // $ANTLR start "entryRuleAttribID"
    // InternalCrossPlatform.g:5441:1: entryRuleAttribID returns [EObject current=null] : iv_ruleAttribID= ruleAttribID EOF ;
    public final EObject entryRuleAttribID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribID = null;


        try {
            // InternalCrossPlatform.g:5441:49: (iv_ruleAttribID= ruleAttribID EOF )
            // InternalCrossPlatform.g:5442:2: iv_ruleAttribID= ruleAttribID EOF
            {
             newCompositeNode(grammarAccess.getAttribIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribID=ruleAttribID();

            state._fsp--;

             current =iv_ruleAttribID; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribID"


    // $ANTLR start "ruleAttribID"
    // InternalCrossPlatform.g:5448:1: ruleAttribID returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_v_1_0= ruleVector ) ) ) ;
    public final EObject ruleAttribID() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_v_1_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:5454:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_v_1_0= ruleVector ) ) ) )
            // InternalCrossPlatform.g:5455:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_v_1_0= ruleVector ) ) )
            {
            // InternalCrossPlatform.g:5455:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_v_1_0= ruleVector ) ) )
            // InternalCrossPlatform.g:5456:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_v_1_0= ruleVector ) )
            {
            // InternalCrossPlatform.g:5456:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCrossPlatform.g:5457:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCrossPlatform.g:5457:4: (lv_name_0_0= RULE_ID )
            // InternalCrossPlatform.g:5458:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_63); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAttribIDAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttribIDRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCrossPlatform.g:5474:3: ( (lv_v_1_0= ruleVector ) )
            // InternalCrossPlatform.g:5475:4: (lv_v_1_0= ruleVector )
            {
            // InternalCrossPlatform.g:5475:4: (lv_v_1_0= ruleVector )
            // InternalCrossPlatform.g:5476:5: lv_v_1_0= ruleVector
            {

            					newCompositeNode(grammarAccess.getAttribIDAccess().getVVectorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_v_1_0=ruleVector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttribIDRule());
            					}
            					set(
            						current,
            						"v",
            						lv_v_1_0,
            						"br.dslcross.crossplatform.CrossPlatform.Vector");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribID"


    // $ANTLR start "entryRuleOpLogicoFor"
    // InternalCrossPlatform.g:5497:1: entryRuleOpLogicoFor returns [EObject current=null] : iv_ruleOpLogicoFor= ruleOpLogicoFor EOF ;
    public final EObject entryRuleOpLogicoFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpLogicoFor = null;


        try {
            // InternalCrossPlatform.g:5497:52: (iv_ruleOpLogicoFor= ruleOpLogicoFor EOF )
            // InternalCrossPlatform.g:5498:2: iv_ruleOpLogicoFor= ruleOpLogicoFor EOF
            {
             newCompositeNode(grammarAccess.getOpLogicoForRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpLogicoFor=ruleOpLogicoFor();

            state._fsp--;

             current =iv_ruleOpLogicoFor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpLogicoFor"


    // $ANTLR start "ruleOpLogicoFor"
    // InternalCrossPlatform.g:5504:1: ruleOpLogicoFor returns [EObject current=null] : (otherlv_0= 'For' ( (lv_exprLogic_1_0= ruleExprLogicFor ) ) otherlv_2= '{' ( (lv_cmdList_3_0= ruleCommandOperation ) )* otherlv_4= '}' ) ;
    public final EObject ruleOpLogicoFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_exprLogic_1_0 = null;

        EObject lv_cmdList_3_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:5510:2: ( (otherlv_0= 'For' ( (lv_exprLogic_1_0= ruleExprLogicFor ) ) otherlv_2= '{' ( (lv_cmdList_3_0= ruleCommandOperation ) )* otherlv_4= '}' ) )
            // InternalCrossPlatform.g:5511:2: (otherlv_0= 'For' ( (lv_exprLogic_1_0= ruleExprLogicFor ) ) otherlv_2= '{' ( (lv_cmdList_3_0= ruleCommandOperation ) )* otherlv_4= '}' )
            {
            // InternalCrossPlatform.g:5511:2: (otherlv_0= 'For' ( (lv_exprLogic_1_0= ruleExprLogicFor ) ) otherlv_2= '{' ( (lv_cmdList_3_0= ruleCommandOperation ) )* otherlv_4= '}' )
            // InternalCrossPlatform.g:5512:3: otherlv_0= 'For' ( (lv_exprLogic_1_0= ruleExprLogicFor ) ) otherlv_2= '{' ( (lv_cmdList_3_0= ruleCommandOperation ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_64); 

            			newLeafNode(otherlv_0, grammarAccess.getOpLogicoForAccess().getForKeyword_0());
            		
            // InternalCrossPlatform.g:5516:3: ( (lv_exprLogic_1_0= ruleExprLogicFor ) )
            // InternalCrossPlatform.g:5517:4: (lv_exprLogic_1_0= ruleExprLogicFor )
            {
            // InternalCrossPlatform.g:5517:4: (lv_exprLogic_1_0= ruleExprLogicFor )
            // InternalCrossPlatform.g:5518:5: lv_exprLogic_1_0= ruleExprLogicFor
            {

            					newCompositeNode(grammarAccess.getOpLogicoForAccess().getExprLogicExprLogicForParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_exprLogic_1_0=ruleExprLogicFor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOpLogicoForRule());
            					}
            					set(
            						current,
            						"exprLogic",
            						lv_exprLogic_1_0,
            						"br.dslcross.crossplatform.CrossPlatform.ExprLogicFor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getOpLogicoForAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCrossPlatform.g:5539:3: ( (lv_cmdList_3_0= ruleCommandOperation ) )*
            loop141:
            do {
                int alt141=2;
                int LA141_0 = input.LA(1);

                if ( (LA141_0==RULE_ID||LA141_0==RULE_STRINGTEMPLATE||LA141_0==33||LA141_0==42||(LA141_0>=48 && LA141_0<=51)||LA141_0==57||LA141_0==59||(LA141_0>=71 && LA141_0<=72)) ) {
                    alt141=1;
                }


                switch (alt141) {
            	case 1 :
            	    // InternalCrossPlatform.g:5540:4: (lv_cmdList_3_0= ruleCommandOperation )
            	    {
            	    // InternalCrossPlatform.g:5540:4: (lv_cmdList_3_0= ruleCommandOperation )
            	    // InternalCrossPlatform.g:5541:5: lv_cmdList_3_0= ruleCommandOperation
            	    {

            	    					newCompositeNode(grammarAccess.getOpLogicoForAccess().getCmdListCommandOperationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_39);
            	    lv_cmdList_3_0=ruleCommandOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOpLogicoForRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cmdList",
            	    						lv_cmdList_3_0,
            	    						"br.dslcross.crossplatform.CrossPlatform.CommandOperation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop141;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOpLogicoForAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpLogicoFor"


    // $ANTLR start "entryRuleExprLogicFor"
    // InternalCrossPlatform.g:5566:1: entryRuleExprLogicFor returns [EObject current=null] : iv_ruleExprLogicFor= ruleExprLogicFor EOF ;
    public final EObject entryRuleExprLogicFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprLogicFor = null;


        try {
            // InternalCrossPlatform.g:5566:53: (iv_ruleExprLogicFor= ruleExprLogicFor EOF )
            // InternalCrossPlatform.g:5567:2: iv_ruleExprLogicFor= ruleExprLogicFor EOF
            {
             newCompositeNode(grammarAccess.getExprLogicForRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExprLogicFor=ruleExprLogicFor();

            state._fsp--;

             current =iv_ruleExprLogicFor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprLogicFor"


    // $ANTLR start "ruleExprLogicFor"
    // InternalCrossPlatform.g:5573:1: ruleExprLogicFor returns [EObject current=null] : ( ( ( (lv_inicio_0_0= ruleAssignmentCmdFor ) ) otherlv_1= ',' ( (lv_condicao_2_0= ruleExprLogica ) ) otherlv_3= ',' ( (lv_abrevCmd_4_0= ruleCommandOperation ) ) ) | (otherlv_5= '(' ( (lv_inicio_6_0= ruleAssignmentCmdFor ) ) otherlv_7= ',' ( (lv_condicao_8_0= ruleExprLogica ) ) otherlv_9= ',' ( (lv_abrevCmd_10_0= ruleCommandOperation ) ) otherlv_11= ')' ) ) ;
    public final EObject ruleExprLogicFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_inicio_0_0 = null;

        EObject lv_condicao_2_0 = null;

        EObject lv_abrevCmd_4_0 = null;

        EObject lv_inicio_6_0 = null;

        EObject lv_condicao_8_0 = null;

        EObject lv_abrevCmd_10_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:5579:2: ( ( ( ( (lv_inicio_0_0= ruleAssignmentCmdFor ) ) otherlv_1= ',' ( (lv_condicao_2_0= ruleExprLogica ) ) otherlv_3= ',' ( (lv_abrevCmd_4_0= ruleCommandOperation ) ) ) | (otherlv_5= '(' ( (lv_inicio_6_0= ruleAssignmentCmdFor ) ) otherlv_7= ',' ( (lv_condicao_8_0= ruleExprLogica ) ) otherlv_9= ',' ( (lv_abrevCmd_10_0= ruleCommandOperation ) ) otherlv_11= ')' ) ) )
            // InternalCrossPlatform.g:5580:2: ( ( ( (lv_inicio_0_0= ruleAssignmentCmdFor ) ) otherlv_1= ',' ( (lv_condicao_2_0= ruleExprLogica ) ) otherlv_3= ',' ( (lv_abrevCmd_4_0= ruleCommandOperation ) ) ) | (otherlv_5= '(' ( (lv_inicio_6_0= ruleAssignmentCmdFor ) ) otherlv_7= ',' ( (lv_condicao_8_0= ruleExprLogica ) ) otherlv_9= ',' ( (lv_abrevCmd_10_0= ruleCommandOperation ) ) otherlv_11= ')' ) )
            {
            // InternalCrossPlatform.g:5580:2: ( ( ( (lv_inicio_0_0= ruleAssignmentCmdFor ) ) otherlv_1= ',' ( (lv_condicao_2_0= ruleExprLogica ) ) otherlv_3= ',' ( (lv_abrevCmd_4_0= ruleCommandOperation ) ) ) | (otherlv_5= '(' ( (lv_inicio_6_0= ruleAssignmentCmdFor ) ) otherlv_7= ',' ( (lv_condicao_8_0= ruleExprLogica ) ) otherlv_9= ',' ( (lv_abrevCmd_10_0= ruleCommandOperation ) ) otherlv_11= ')' ) )
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==RULE_ID) ) {
                alt142=1;
            }
            else if ( (LA142_0==28) ) {
                alt142=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;
            }
            switch (alt142) {
                case 1 :
                    // InternalCrossPlatform.g:5581:3: ( ( (lv_inicio_0_0= ruleAssignmentCmdFor ) ) otherlv_1= ',' ( (lv_condicao_2_0= ruleExprLogica ) ) otherlv_3= ',' ( (lv_abrevCmd_4_0= ruleCommandOperation ) ) )
                    {
                    // InternalCrossPlatform.g:5581:3: ( ( (lv_inicio_0_0= ruleAssignmentCmdFor ) ) otherlv_1= ',' ( (lv_condicao_2_0= ruleExprLogica ) ) otherlv_3= ',' ( (lv_abrevCmd_4_0= ruleCommandOperation ) ) )
                    // InternalCrossPlatform.g:5582:4: ( (lv_inicio_0_0= ruleAssignmentCmdFor ) ) otherlv_1= ',' ( (lv_condicao_2_0= ruleExprLogica ) ) otherlv_3= ',' ( (lv_abrevCmd_4_0= ruleCommandOperation ) )
                    {
                    // InternalCrossPlatform.g:5582:4: ( (lv_inicio_0_0= ruleAssignmentCmdFor ) )
                    // InternalCrossPlatform.g:5583:5: (lv_inicio_0_0= ruleAssignmentCmdFor )
                    {
                    // InternalCrossPlatform.g:5583:5: (lv_inicio_0_0= ruleAssignmentCmdFor )
                    // InternalCrossPlatform.g:5584:6: lv_inicio_0_0= ruleAssignmentCmdFor
                    {

                    						newCompositeNode(grammarAccess.getExprLogicForAccess().getInicioAssignmentCmdForParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_65);
                    lv_inicio_0_0=ruleAssignmentCmdFor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExprLogicForRule());
                    						}
                    						set(
                    							current,
                    							"inicio",
                    							lv_inicio_0_0,
                    							"br.dslcross.crossplatform.CrossPlatform.AssignmentCmdFor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,26,FOLLOW_52); 

                    				newLeafNode(otherlv_1, grammarAccess.getExprLogicForAccess().getCommaKeyword_0_1());
                    			
                    // InternalCrossPlatform.g:5605:4: ( (lv_condicao_2_0= ruleExprLogica ) )
                    // InternalCrossPlatform.g:5606:5: (lv_condicao_2_0= ruleExprLogica )
                    {
                    // InternalCrossPlatform.g:5606:5: (lv_condicao_2_0= ruleExprLogica )
                    // InternalCrossPlatform.g:5607:6: lv_condicao_2_0= ruleExprLogica
                    {

                    						newCompositeNode(grammarAccess.getExprLogicForAccess().getCondicaoExprLogicaParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_65);
                    lv_condicao_2_0=ruleExprLogica();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExprLogicForRule());
                    						}
                    						set(
                    							current,
                    							"condicao",
                    							lv_condicao_2_0,
                    							"br.dslcross.crossplatform.CrossPlatform.ExprLogica");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,26,FOLLOW_66); 

                    				newLeafNode(otherlv_3, grammarAccess.getExprLogicForAccess().getCommaKeyword_0_3());
                    			
                    // InternalCrossPlatform.g:5628:4: ( (lv_abrevCmd_4_0= ruleCommandOperation ) )
                    // InternalCrossPlatform.g:5629:5: (lv_abrevCmd_4_0= ruleCommandOperation )
                    {
                    // InternalCrossPlatform.g:5629:5: (lv_abrevCmd_4_0= ruleCommandOperation )
                    // InternalCrossPlatform.g:5630:6: lv_abrevCmd_4_0= ruleCommandOperation
                    {

                    						newCompositeNode(grammarAccess.getExprLogicForAccess().getAbrevCmdCommandOperationParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_abrevCmd_4_0=ruleCommandOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExprLogicForRule());
                    						}
                    						set(
                    							current,
                    							"abrevCmd",
                    							lv_abrevCmd_4_0,
                    							"br.dslcross.crossplatform.CrossPlatform.CommandOperation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCrossPlatform.g:5649:3: (otherlv_5= '(' ( (lv_inicio_6_0= ruleAssignmentCmdFor ) ) otherlv_7= ',' ( (lv_condicao_8_0= ruleExprLogica ) ) otherlv_9= ',' ( (lv_abrevCmd_10_0= ruleCommandOperation ) ) otherlv_11= ')' )
                    {
                    // InternalCrossPlatform.g:5649:3: (otherlv_5= '(' ( (lv_inicio_6_0= ruleAssignmentCmdFor ) ) otherlv_7= ',' ( (lv_condicao_8_0= ruleExprLogica ) ) otherlv_9= ',' ( (lv_abrevCmd_10_0= ruleCommandOperation ) ) otherlv_11= ')' )
                    // InternalCrossPlatform.g:5650:4: otherlv_5= '(' ( (lv_inicio_6_0= ruleAssignmentCmdFor ) ) otherlv_7= ',' ( (lv_condicao_8_0= ruleExprLogica ) ) otherlv_9= ',' ( (lv_abrevCmd_10_0= ruleCommandOperation ) ) otherlv_11= ')'
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getExprLogicForAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalCrossPlatform.g:5654:4: ( (lv_inicio_6_0= ruleAssignmentCmdFor ) )
                    // InternalCrossPlatform.g:5655:5: (lv_inicio_6_0= ruleAssignmentCmdFor )
                    {
                    // InternalCrossPlatform.g:5655:5: (lv_inicio_6_0= ruleAssignmentCmdFor )
                    // InternalCrossPlatform.g:5656:6: lv_inicio_6_0= ruleAssignmentCmdFor
                    {

                    						newCompositeNode(grammarAccess.getExprLogicForAccess().getInicioAssignmentCmdForParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_65);
                    lv_inicio_6_0=ruleAssignmentCmdFor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExprLogicForRule());
                    						}
                    						set(
                    							current,
                    							"inicio",
                    							lv_inicio_6_0,
                    							"br.dslcross.crossplatform.CrossPlatform.AssignmentCmdFor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,26,FOLLOW_52); 

                    				newLeafNode(otherlv_7, grammarAccess.getExprLogicForAccess().getCommaKeyword_1_2());
                    			
                    // InternalCrossPlatform.g:5677:4: ( (lv_condicao_8_0= ruleExprLogica ) )
                    // InternalCrossPlatform.g:5678:5: (lv_condicao_8_0= ruleExprLogica )
                    {
                    // InternalCrossPlatform.g:5678:5: (lv_condicao_8_0= ruleExprLogica )
                    // InternalCrossPlatform.g:5679:6: lv_condicao_8_0= ruleExprLogica
                    {

                    						newCompositeNode(grammarAccess.getExprLogicForAccess().getCondicaoExprLogicaParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_65);
                    lv_condicao_8_0=ruleExprLogica();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExprLogicForRule());
                    						}
                    						set(
                    							current,
                    							"condicao",
                    							lv_condicao_8_0,
                    							"br.dslcross.crossplatform.CrossPlatform.ExprLogica");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,26,FOLLOW_66); 

                    				newLeafNode(otherlv_9, grammarAccess.getExprLogicForAccess().getCommaKeyword_1_4());
                    			
                    // InternalCrossPlatform.g:5700:4: ( (lv_abrevCmd_10_0= ruleCommandOperation ) )
                    // InternalCrossPlatform.g:5701:5: (lv_abrevCmd_10_0= ruleCommandOperation )
                    {
                    // InternalCrossPlatform.g:5701:5: (lv_abrevCmd_10_0= ruleCommandOperation )
                    // InternalCrossPlatform.g:5702:6: lv_abrevCmd_10_0= ruleCommandOperation
                    {

                    						newCompositeNode(grammarAccess.getExprLogicForAccess().getAbrevCmdCommandOperationParserRuleCall_1_5_0());
                    					
                    pushFollow(FOLLOW_59);
                    lv_abrevCmd_10_0=ruleCommandOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExprLogicForRule());
                    						}
                    						set(
                    							current,
                    							"abrevCmd",
                    							lv_abrevCmd_10_0,
                    							"br.dslcross.crossplatform.CrossPlatform.CommandOperation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getExprLogicForAccess().getRightParenthesisKeyword_1_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprLogicFor"


    // $ANTLR start "entryRuleAssignmentCmdFor"
    // InternalCrossPlatform.g:5728:1: entryRuleAssignmentCmdFor returns [EObject current=null] : iv_ruleAssignmentCmdFor= ruleAssignmentCmdFor EOF ;
    public final EObject entryRuleAssignmentCmdFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentCmdFor = null;


        try {
            // InternalCrossPlatform.g:5728:57: (iv_ruleAssignmentCmdFor= ruleAssignmentCmdFor EOF )
            // InternalCrossPlatform.g:5729:2: iv_ruleAssignmentCmdFor= ruleAssignmentCmdFor EOF
            {
             newCompositeNode(grammarAccess.getAssignmentCmdForRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignmentCmdFor=ruleAssignmentCmdFor();

            state._fsp--;

             current =iv_ruleAssignmentCmdFor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignmentCmdFor"


    // $ANTLR start "ruleAssignmentCmdFor"
    // InternalCrossPlatform.g:5735:1: ruleAssignmentCmdFor returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_e_2_0= ruleExprArit ) ) ) ;
    public final EObject ruleAssignmentCmdFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_e_2_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:5741:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_e_2_0= ruleExprArit ) ) ) )
            // InternalCrossPlatform.g:5742:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_e_2_0= ruleExprArit ) ) )
            {
            // InternalCrossPlatform.g:5742:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_e_2_0= ruleExprArit ) ) )
            // InternalCrossPlatform.g:5743:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_e_2_0= ruleExprArit ) )
            {
            // InternalCrossPlatform.g:5743:3: ( (otherlv_0= RULE_ID ) )
            // InternalCrossPlatform.g:5744:4: (otherlv_0= RULE_ID )
            {
            // InternalCrossPlatform.g:5744:4: (otherlv_0= RULE_ID )
            // InternalCrossPlatform.g:5745:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentCmdForRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_67); 

            					newLeafNode(otherlv_0, grammarAccess.getAssignmentCmdForAccess().getLeftAttributeCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,73,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentCmdForAccess().getEqualsSignKeyword_1());
            		
            // InternalCrossPlatform.g:5760:3: ( (lv_e_2_0= ruleExprArit ) )
            // InternalCrossPlatform.g:5761:4: (lv_e_2_0= ruleExprArit )
            {
            // InternalCrossPlatform.g:5761:4: (lv_e_2_0= ruleExprArit )
            // InternalCrossPlatform.g:5762:5: lv_e_2_0= ruleExprArit
            {

            					newCompositeNode(grammarAccess.getAssignmentCmdForAccess().getEExprAritParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_e_2_0=ruleExprArit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentCmdForRule());
            					}
            					set(
            						current,
            						"e",
            						lv_e_2_0,
            						"br.dslcross.crossplatform.CrossPlatform.ExprArit");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignmentCmdFor"


    // $ANTLR start "entryRuleExprArit"
    // InternalCrossPlatform.g:5783:1: entryRuleExprArit returns [EObject current=null] : iv_ruleExprArit= ruleExprArit EOF ;
    public final EObject entryRuleExprArit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprArit = null;


        try {
            // InternalCrossPlatform.g:5783:49: (iv_ruleExprArit= ruleExprArit EOF )
            // InternalCrossPlatform.g:5784:2: iv_ruleExprArit= ruleExprArit EOF
            {
             newCompositeNode(grammarAccess.getExprAritRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExprArit=ruleExprArit();

            state._fsp--;

             current =iv_ruleExprArit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprArit"


    // $ANTLR start "ruleExprArit"
    // InternalCrossPlatform.g:5790:1: ruleExprArit returns [EObject current=null] : ( ( (lv_termos_0_0= ruleTermo ) ) ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_termos_2_0= ruleTermo ) ) )* ) ;
    public final EObject ruleExprArit() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        EObject lv_termos_0_0 = null;

        EObject lv_termos_2_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:5796:2: ( ( ( (lv_termos_0_0= ruleTermo ) ) ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_termos_2_0= ruleTermo ) ) )* ) )
            // InternalCrossPlatform.g:5797:2: ( ( (lv_termos_0_0= ruleTermo ) ) ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_termos_2_0= ruleTermo ) ) )* )
            {
            // InternalCrossPlatform.g:5797:2: ( ( (lv_termos_0_0= ruleTermo ) ) ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_termos_2_0= ruleTermo ) ) )* )
            // InternalCrossPlatform.g:5798:3: ( (lv_termos_0_0= ruleTermo ) ) ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_termos_2_0= ruleTermo ) ) )*
            {
            // InternalCrossPlatform.g:5798:3: ( (lv_termos_0_0= ruleTermo ) )
            // InternalCrossPlatform.g:5799:4: (lv_termos_0_0= ruleTermo )
            {
            // InternalCrossPlatform.g:5799:4: (lv_termos_0_0= ruleTermo )
            // InternalCrossPlatform.g:5800:5: lv_termos_0_0= ruleTermo
            {

            					newCompositeNode(grammarAccess.getExprAritAccess().getTermosTermoParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_68);
            lv_termos_0_0=ruleTermo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExprAritRule());
            					}
            					add(
            						current,
            						"termos",
            						lv_termos_0_0,
            						"br.dslcross.crossplatform.CrossPlatform.Termo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCrossPlatform.g:5817:3: ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_termos_2_0= ruleTermo ) ) )*
            loop144:
            do {
                int alt144=2;
                int LA144_0 = input.LA(1);

                if ( ((LA144_0>=74 && LA144_0<=75)) ) {
                    alt144=1;
                }


                switch (alt144) {
            	case 1 :
            	    // InternalCrossPlatform.g:5818:4: ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_termos_2_0= ruleTermo ) )
            	    {
            	    // InternalCrossPlatform.g:5818:4: ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) )
            	    // InternalCrossPlatform.g:5819:5: ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) )
            	    {
            	    // InternalCrossPlatform.g:5819:5: ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) )
            	    // InternalCrossPlatform.g:5820:6: (lv_op_1_1= '+' | lv_op_1_2= '-' )
            	    {
            	    // InternalCrossPlatform.g:5820:6: (lv_op_1_1= '+' | lv_op_1_2= '-' )
            	    int alt143=2;
            	    int LA143_0 = input.LA(1);

            	    if ( (LA143_0==74) ) {
            	        alt143=1;
            	    }
            	    else if ( (LA143_0==75) ) {
            	        alt143=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 143, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt143) {
            	        case 1 :
            	            // InternalCrossPlatform.g:5821:7: lv_op_1_1= '+'
            	            {
            	            lv_op_1_1=(Token)match(input,74,FOLLOW_40); 

            	            							newLeafNode(lv_op_1_1, grammarAccess.getExprAritAccess().getOpPlusSignKeyword_1_0_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getExprAritRule());
            	            							}
            	            							addWithLastConsumed(current, "op", lv_op_1_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalCrossPlatform.g:5832:7: lv_op_1_2= '-'
            	            {
            	            lv_op_1_2=(Token)match(input,75,FOLLOW_40); 

            	            							newLeafNode(lv_op_1_2, grammarAccess.getExprAritAccess().getOpHyphenMinusKeyword_1_0_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getExprAritRule());
            	            							}
            	            							addWithLastConsumed(current, "op", lv_op_1_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalCrossPlatform.g:5845:4: ( (lv_termos_2_0= ruleTermo ) )
            	    // InternalCrossPlatform.g:5846:5: (lv_termos_2_0= ruleTermo )
            	    {
            	    // InternalCrossPlatform.g:5846:5: (lv_termos_2_0= ruleTermo )
            	    // InternalCrossPlatform.g:5847:6: lv_termos_2_0= ruleTermo
            	    {

            	    						newCompositeNode(grammarAccess.getExprAritAccess().getTermosTermoParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_68);
            	    lv_termos_2_0=ruleTermo();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExprAritRule());
            	    						}
            	    						add(
            	    							current,
            	    							"termos",
            	    							lv_termos_2_0,
            	    							"br.dslcross.crossplatform.CrossPlatform.Termo");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop144;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprArit"


    // $ANTLR start "entryRuleTermo"
    // InternalCrossPlatform.g:5869:1: entryRuleTermo returns [EObject current=null] : iv_ruleTermo= ruleTermo EOF ;
    public final EObject entryRuleTermo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermo = null;


        try {
            // InternalCrossPlatform.g:5869:46: (iv_ruleTermo= ruleTermo EOF )
            // InternalCrossPlatform.g:5870:2: iv_ruleTermo= ruleTermo EOF
            {
             newCompositeNode(grammarAccess.getTermoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTermo=ruleTermo();

            state._fsp--;

             current =iv_ruleTermo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTermo"


    // $ANTLR start "ruleTermo"
    // InternalCrossPlatform.g:5876:1: ruleTermo returns [EObject current=null] : ( ( (lv_fatores_0_0= ruleFator ) ) ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' ) ) ) ( (lv_fatores_2_0= ruleFator ) ) )* ) ;
    public final EObject ruleTermo() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        EObject lv_fatores_0_0 = null;

        EObject lv_fatores_2_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:5882:2: ( ( ( (lv_fatores_0_0= ruleFator ) ) ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' ) ) ) ( (lv_fatores_2_0= ruleFator ) ) )* ) )
            // InternalCrossPlatform.g:5883:2: ( ( (lv_fatores_0_0= ruleFator ) ) ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' ) ) ) ( (lv_fatores_2_0= ruleFator ) ) )* )
            {
            // InternalCrossPlatform.g:5883:2: ( ( (lv_fatores_0_0= ruleFator ) ) ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' ) ) ) ( (lv_fatores_2_0= ruleFator ) ) )* )
            // InternalCrossPlatform.g:5884:3: ( (lv_fatores_0_0= ruleFator ) ) ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' ) ) ) ( (lv_fatores_2_0= ruleFator ) ) )*
            {
            // InternalCrossPlatform.g:5884:3: ( (lv_fatores_0_0= ruleFator ) )
            // InternalCrossPlatform.g:5885:4: (lv_fatores_0_0= ruleFator )
            {
            // InternalCrossPlatform.g:5885:4: (lv_fatores_0_0= ruleFator )
            // InternalCrossPlatform.g:5886:5: lv_fatores_0_0= ruleFator
            {

            					newCompositeNode(grammarAccess.getTermoAccess().getFatoresFatorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_69);
            lv_fatores_0_0=ruleFator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTermoRule());
            					}
            					add(
            						current,
            						"fatores",
            						lv_fatores_0_0,
            						"br.dslcross.crossplatform.CrossPlatform.Fator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCrossPlatform.g:5903:3: ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' ) ) ) ( (lv_fatores_2_0= ruleFator ) ) )*
            loop146:
            do {
                int alt146=2;
                int LA146_0 = input.LA(1);

                if ( ((LA146_0>=76 && LA146_0<=77)) ) {
                    alt146=1;
                }


                switch (alt146) {
            	case 1 :
            	    // InternalCrossPlatform.g:5904:4: ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' ) ) ) ( (lv_fatores_2_0= ruleFator ) )
            	    {
            	    // InternalCrossPlatform.g:5904:4: ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' ) ) )
            	    // InternalCrossPlatform.g:5905:5: ( (lv_op_1_1= '*' | lv_op_1_2= '/' ) )
            	    {
            	    // InternalCrossPlatform.g:5905:5: ( (lv_op_1_1= '*' | lv_op_1_2= '/' ) )
            	    // InternalCrossPlatform.g:5906:6: (lv_op_1_1= '*' | lv_op_1_2= '/' )
            	    {
            	    // InternalCrossPlatform.g:5906:6: (lv_op_1_1= '*' | lv_op_1_2= '/' )
            	    int alt145=2;
            	    int LA145_0 = input.LA(1);

            	    if ( (LA145_0==76) ) {
            	        alt145=1;
            	    }
            	    else if ( (LA145_0==77) ) {
            	        alt145=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 145, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt145) {
            	        case 1 :
            	            // InternalCrossPlatform.g:5907:7: lv_op_1_1= '*'
            	            {
            	            lv_op_1_1=(Token)match(input,76,FOLLOW_40); 

            	            							newLeafNode(lv_op_1_1, grammarAccess.getTermoAccess().getOpAsteriskKeyword_1_0_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getTermoRule());
            	            							}
            	            							addWithLastConsumed(current, "op", lv_op_1_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalCrossPlatform.g:5918:7: lv_op_1_2= '/'
            	            {
            	            lv_op_1_2=(Token)match(input,77,FOLLOW_40); 

            	            							newLeafNode(lv_op_1_2, grammarAccess.getTermoAccess().getOpSolidusKeyword_1_0_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getTermoRule());
            	            							}
            	            							addWithLastConsumed(current, "op", lv_op_1_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalCrossPlatform.g:5931:4: ( (lv_fatores_2_0= ruleFator ) )
            	    // InternalCrossPlatform.g:5932:5: (lv_fatores_2_0= ruleFator )
            	    {
            	    // InternalCrossPlatform.g:5932:5: (lv_fatores_2_0= ruleFator )
            	    // InternalCrossPlatform.g:5933:6: lv_fatores_2_0= ruleFator
            	    {

            	    						newCompositeNode(grammarAccess.getTermoAccess().getFatoresFatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_69);
            	    lv_fatores_2_0=ruleFator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTermoRule());
            	    						}
            	    						add(
            	    							current,
            	    							"fatores",
            	    							lv_fatores_2_0,
            	    							"br.dslcross.crossplatform.CrossPlatform.Fator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop146;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTermo"


    // $ANTLR start "entryRuleFator"
    // InternalCrossPlatform.g:5955:1: entryRuleFator returns [EObject current=null] : iv_ruleFator= ruleFator EOF ;
    public final EObject entryRuleFator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFator = null;


        try {
            // InternalCrossPlatform.g:5955:46: (iv_ruleFator= ruleFator EOF )
            // InternalCrossPlatform.g:5956:2: iv_ruleFator= ruleFator EOF
            {
             newCompositeNode(grammarAccess.getFatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFator=ruleFator();

            state._fsp--;

             current =iv_ruleFator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFator"


    // $ANTLR start "ruleFator"
    // InternalCrossPlatform.g:5962:1: ruleFator returns [EObject current=null] : ( () ( ( (lv_p_1_0= ruleParameter ) ) | ( ( (lv_v_2_0= RULE_ID ) ) ( (lv_col1_3_0= '[' ) )? ( (lv_array_4_0= RULE_INT ) )? ( (lv_array2_5_0= RULE_ID ) )? ( (lv_col2_6_0= ']' ) )? ) | ( (lv_d_7_0= ruleDECIMAL ) ) | ( (lv_strVar_8_0= RULE_STRING ) ) | ( (lv_mcOperation_9_0= ruleMethodCallOp ) ) | ( (lv_mcGlobal_10_0= ruleMethodCallGlob ) ) | (otherlv_11= '(' ( (lv_expr_12_0= ruleExprArit ) ) otherlv_13= ')' ) | ( ( (lv_vAtr1_14_0= ruleAttribID ) ) (otherlv_15= '.' ( (lv_vAtr2_16_0= ruleAttribID ) ) ( ( (lv_col_17_0= '(' ) ) ( ( (lv_value_18_0= ruleExprL ) ) (otherlv_19= ',' ( (lv_value_20_0= ruleExprL ) ) )* )? otherlv_21= ')' )? )+ ) ) ) ;
    public final EObject ruleFator() throws RecognitionException {
        EObject current = null;

        Token lv_v_2_0=null;
        Token lv_col1_3_0=null;
        Token lv_array_4_0=null;
        Token lv_array2_5_0=null;
        Token lv_col2_6_0=null;
        Token lv_strVar_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token lv_col_17_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject lv_p_1_0 = null;

        AntlrDatatypeRuleToken lv_d_7_0 = null;

        EObject lv_mcOperation_9_0 = null;

        EObject lv_mcGlobal_10_0 = null;

        EObject lv_expr_12_0 = null;

        EObject lv_vAtr1_14_0 = null;

        EObject lv_vAtr2_16_0 = null;

        EObject lv_value_18_0 = null;

        EObject lv_value_20_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:5968:2: ( ( () ( ( (lv_p_1_0= ruleParameter ) ) | ( ( (lv_v_2_0= RULE_ID ) ) ( (lv_col1_3_0= '[' ) )? ( (lv_array_4_0= RULE_INT ) )? ( (lv_array2_5_0= RULE_ID ) )? ( (lv_col2_6_0= ']' ) )? ) | ( (lv_d_7_0= ruleDECIMAL ) ) | ( (lv_strVar_8_0= RULE_STRING ) ) | ( (lv_mcOperation_9_0= ruleMethodCallOp ) ) | ( (lv_mcGlobal_10_0= ruleMethodCallGlob ) ) | (otherlv_11= '(' ( (lv_expr_12_0= ruleExprArit ) ) otherlv_13= ')' ) | ( ( (lv_vAtr1_14_0= ruleAttribID ) ) (otherlv_15= '.' ( (lv_vAtr2_16_0= ruleAttribID ) ) ( ( (lv_col_17_0= '(' ) ) ( ( (lv_value_18_0= ruleExprL ) ) (otherlv_19= ',' ( (lv_value_20_0= ruleExprL ) ) )* )? otherlv_21= ')' )? )+ ) ) ) )
            // InternalCrossPlatform.g:5969:2: ( () ( ( (lv_p_1_0= ruleParameter ) ) | ( ( (lv_v_2_0= RULE_ID ) ) ( (lv_col1_3_0= '[' ) )? ( (lv_array_4_0= RULE_INT ) )? ( (lv_array2_5_0= RULE_ID ) )? ( (lv_col2_6_0= ']' ) )? ) | ( (lv_d_7_0= ruleDECIMAL ) ) | ( (lv_strVar_8_0= RULE_STRING ) ) | ( (lv_mcOperation_9_0= ruleMethodCallOp ) ) | ( (lv_mcGlobal_10_0= ruleMethodCallGlob ) ) | (otherlv_11= '(' ( (lv_expr_12_0= ruleExprArit ) ) otherlv_13= ')' ) | ( ( (lv_vAtr1_14_0= ruleAttribID ) ) (otherlv_15= '.' ( (lv_vAtr2_16_0= ruleAttribID ) ) ( ( (lv_col_17_0= '(' ) ) ( ( (lv_value_18_0= ruleExprL ) ) (otherlv_19= ',' ( (lv_value_20_0= ruleExprL ) ) )* )? otherlv_21= ')' )? )+ ) ) )
            {
            // InternalCrossPlatform.g:5969:2: ( () ( ( (lv_p_1_0= ruleParameter ) ) | ( ( (lv_v_2_0= RULE_ID ) ) ( (lv_col1_3_0= '[' ) )? ( (lv_array_4_0= RULE_INT ) )? ( (lv_array2_5_0= RULE_ID ) )? ( (lv_col2_6_0= ']' ) )? ) | ( (lv_d_7_0= ruleDECIMAL ) ) | ( (lv_strVar_8_0= RULE_STRING ) ) | ( (lv_mcOperation_9_0= ruleMethodCallOp ) ) | ( (lv_mcGlobal_10_0= ruleMethodCallGlob ) ) | (otherlv_11= '(' ( (lv_expr_12_0= ruleExprArit ) ) otherlv_13= ')' ) | ( ( (lv_vAtr1_14_0= ruleAttribID ) ) (otherlv_15= '.' ( (lv_vAtr2_16_0= ruleAttribID ) ) ( ( (lv_col_17_0= '(' ) ) ( ( (lv_value_18_0= ruleExprL ) ) (otherlv_19= ',' ( (lv_value_20_0= ruleExprL ) ) )* )? otherlv_21= ')' )? )+ ) ) )
            // InternalCrossPlatform.g:5970:3: () ( ( (lv_p_1_0= ruleParameter ) ) | ( ( (lv_v_2_0= RULE_ID ) ) ( (lv_col1_3_0= '[' ) )? ( (lv_array_4_0= RULE_INT ) )? ( (lv_array2_5_0= RULE_ID ) )? ( (lv_col2_6_0= ']' ) )? ) | ( (lv_d_7_0= ruleDECIMAL ) ) | ( (lv_strVar_8_0= RULE_STRING ) ) | ( (lv_mcOperation_9_0= ruleMethodCallOp ) ) | ( (lv_mcGlobal_10_0= ruleMethodCallGlob ) ) | (otherlv_11= '(' ( (lv_expr_12_0= ruleExprArit ) ) otherlv_13= ')' ) | ( ( (lv_vAtr1_14_0= ruleAttribID ) ) (otherlv_15= '.' ( (lv_vAtr2_16_0= ruleAttribID ) ) ( ( (lv_col_17_0= '(' ) ) ( ( (lv_value_18_0= ruleExprL ) ) (otherlv_19= ',' ( (lv_value_20_0= ruleExprL ) ) )* )? otherlv_21= ')' )? )+ ) )
            {
            // InternalCrossPlatform.g:5970:3: ()
            // InternalCrossPlatform.g:5971:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFatorAccess().getFatorAction_0(),
            					current);
            			

            }

            // InternalCrossPlatform.g:5977:3: ( ( (lv_p_1_0= ruleParameter ) ) | ( ( (lv_v_2_0= RULE_ID ) ) ( (lv_col1_3_0= '[' ) )? ( (lv_array_4_0= RULE_INT ) )? ( (lv_array2_5_0= RULE_ID ) )? ( (lv_col2_6_0= ']' ) )? ) | ( (lv_d_7_0= ruleDECIMAL ) ) | ( (lv_strVar_8_0= RULE_STRING ) ) | ( (lv_mcOperation_9_0= ruleMethodCallOp ) ) | ( (lv_mcGlobal_10_0= ruleMethodCallGlob ) ) | (otherlv_11= '(' ( (lv_expr_12_0= ruleExprArit ) ) otherlv_13= ')' ) | ( ( (lv_vAtr1_14_0= ruleAttribID ) ) (otherlv_15= '.' ( (lv_vAtr2_16_0= ruleAttribID ) ) ( ( (lv_col_17_0= '(' ) ) ( ( (lv_value_18_0= ruleExprL ) ) (otherlv_19= ',' ( (lv_value_20_0= ruleExprL ) ) )* )? otherlv_21= ')' )? )+ ) )
            int alt155=8;
            alt155 = dfa155.predict(input);
            switch (alt155) {
                case 1 :
                    // InternalCrossPlatform.g:5978:4: ( (lv_p_1_0= ruleParameter ) )
                    {
                    // InternalCrossPlatform.g:5978:4: ( (lv_p_1_0= ruleParameter ) )
                    // InternalCrossPlatform.g:5979:5: (lv_p_1_0= ruleParameter )
                    {
                    // InternalCrossPlatform.g:5979:5: (lv_p_1_0= ruleParameter )
                    // InternalCrossPlatform.g:5980:6: lv_p_1_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getFatorAccess().getPParameterParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_p_1_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFatorRule());
                    						}
                    						set(
                    							current,
                    							"p",
                    							lv_p_1_0,
                    							"br.dslcross.crossplatform.CrossPlatform.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCrossPlatform.g:5998:4: ( ( (lv_v_2_0= RULE_ID ) ) ( (lv_col1_3_0= '[' ) )? ( (lv_array_4_0= RULE_INT ) )? ( (lv_array2_5_0= RULE_ID ) )? ( (lv_col2_6_0= ']' ) )? )
                    {
                    // InternalCrossPlatform.g:5998:4: ( ( (lv_v_2_0= RULE_ID ) ) ( (lv_col1_3_0= '[' ) )? ( (lv_array_4_0= RULE_INT ) )? ( (lv_array2_5_0= RULE_ID ) )? ( (lv_col2_6_0= ']' ) )? )
                    // InternalCrossPlatform.g:5999:5: ( (lv_v_2_0= RULE_ID ) ) ( (lv_col1_3_0= '[' ) )? ( (lv_array_4_0= RULE_INT ) )? ( (lv_array2_5_0= RULE_ID ) )? ( (lv_col2_6_0= ']' ) )?
                    {
                    // InternalCrossPlatform.g:5999:5: ( (lv_v_2_0= RULE_ID ) )
                    // InternalCrossPlatform.g:6000:6: (lv_v_2_0= RULE_ID )
                    {
                    // InternalCrossPlatform.g:6000:6: (lv_v_2_0= RULE_ID )
                    // InternalCrossPlatform.g:6001:7: lv_v_2_0= RULE_ID
                    {
                    lv_v_2_0=(Token)match(input,RULE_ID,FOLLOW_70); 

                    							newLeafNode(lv_v_2_0, grammarAccess.getFatorAccess().getVIDTerminalRuleCall_1_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFatorRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"v",
                    								lv_v_2_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }

                    // InternalCrossPlatform.g:6017:5: ( (lv_col1_3_0= '[' ) )?
                    int alt147=2;
                    int LA147_0 = input.LA(1);

                    if ( (LA147_0==30) ) {
                        alt147=1;
                    }
                    switch (alt147) {
                        case 1 :
                            // InternalCrossPlatform.g:6018:6: (lv_col1_3_0= '[' )
                            {
                            // InternalCrossPlatform.g:6018:6: (lv_col1_3_0= '[' )
                            // InternalCrossPlatform.g:6019:7: lv_col1_3_0= '['
                            {
                            lv_col1_3_0=(Token)match(input,30,FOLLOW_71); 

                            							newLeafNode(lv_col1_3_0, grammarAccess.getFatorAccess().getCol1LeftSquareBracketKeyword_1_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFatorRule());
                            							}
                            							setWithLastConsumed(current, "col1", lv_col1_3_0, "[");
                            						

                            }


                            }
                            break;

                    }

                    // InternalCrossPlatform.g:6031:5: ( (lv_array_4_0= RULE_INT ) )?
                    int alt148=2;
                    int LA148_0 = input.LA(1);

                    if ( (LA148_0==RULE_INT) ) {
                        alt148=1;
                    }
                    switch (alt148) {
                        case 1 :
                            // InternalCrossPlatform.g:6032:6: (lv_array_4_0= RULE_INT )
                            {
                            // InternalCrossPlatform.g:6032:6: (lv_array_4_0= RULE_INT )
                            // InternalCrossPlatform.g:6033:7: lv_array_4_0= RULE_INT
                            {
                            lv_array_4_0=(Token)match(input,RULE_INT,FOLLOW_72); 

                            							newLeafNode(lv_array_4_0, grammarAccess.getFatorAccess().getArrayINTTerminalRuleCall_1_1_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFatorRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"array",
                            								lv_array_4_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }
                            break;

                    }

                    // InternalCrossPlatform.g:6049:5: ( (lv_array2_5_0= RULE_ID ) )?
                    int alt149=2;
                    int LA149_0 = input.LA(1);

                    if ( (LA149_0==RULE_ID) ) {
                        int LA149_1 = input.LA(2);

                        if ( (LA149_1==31) ) {
                            int LA149_3 = input.LA(3);

                            if ( (LA149_3==EOF||LA149_3==RULE_ID||LA149_3==RULE_STRINGTEMPLATE||(LA149_3>=13 && LA149_3<=14)||LA149_3==26||LA149_3==29||LA149_3==33||(LA149_3>=41 && LA149_3<=44)||(LA149_3>=48 && LA149_3<=51)||(LA149_3>=57 && LA149_3<=59)||(LA149_3>=71 && LA149_3<=72)||(LA149_3>=74 && LA149_3<=77)) ) {
                                alt149=1;
                            }
                        }
                        else if ( (LA149_1==EOF||LA149_1==RULE_ID||LA149_1==RULE_STRINGTEMPLATE||(LA149_1>=13 && LA149_1<=14)||LA149_1==26||LA149_1==29||LA149_1==33||(LA149_1>=41 && LA149_1<=44)||(LA149_1>=48 && LA149_1<=51)||(LA149_1>=57 && LA149_1<=59)||(LA149_1>=71 && LA149_1<=72)||(LA149_1>=74 && LA149_1<=77)) ) {
                            alt149=1;
                        }
                    }
                    switch (alt149) {
                        case 1 :
                            // InternalCrossPlatform.g:6050:6: (lv_array2_5_0= RULE_ID )
                            {
                            // InternalCrossPlatform.g:6050:6: (lv_array2_5_0= RULE_ID )
                            // InternalCrossPlatform.g:6051:7: lv_array2_5_0= RULE_ID
                            {
                            lv_array2_5_0=(Token)match(input,RULE_ID,FOLLOW_21); 

                            							newLeafNode(lv_array2_5_0, grammarAccess.getFatorAccess().getArray2IDTerminalRuleCall_1_1_3_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFatorRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"array2",
                            								lv_array2_5_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }
                            break;

                    }

                    // InternalCrossPlatform.g:6067:5: ( (lv_col2_6_0= ']' ) )?
                    int alt150=2;
                    int LA150_0 = input.LA(1);

                    if ( (LA150_0==31) ) {
                        alt150=1;
                    }
                    switch (alt150) {
                        case 1 :
                            // InternalCrossPlatform.g:6068:6: (lv_col2_6_0= ']' )
                            {
                            // InternalCrossPlatform.g:6068:6: (lv_col2_6_0= ']' )
                            // InternalCrossPlatform.g:6069:7: lv_col2_6_0= ']'
                            {
                            lv_col2_6_0=(Token)match(input,31,FOLLOW_2); 

                            							newLeafNode(lv_col2_6_0, grammarAccess.getFatorAccess().getCol2RightSquareBracketKeyword_1_1_4_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFatorRule());
                            							}
                            							setWithLastConsumed(current, "col2", lv_col2_6_0, "]");
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCrossPlatform.g:6083:4: ( (lv_d_7_0= ruleDECIMAL ) )
                    {
                    // InternalCrossPlatform.g:6083:4: ( (lv_d_7_0= ruleDECIMAL ) )
                    // InternalCrossPlatform.g:6084:5: (lv_d_7_0= ruleDECIMAL )
                    {
                    // InternalCrossPlatform.g:6084:5: (lv_d_7_0= ruleDECIMAL )
                    // InternalCrossPlatform.g:6085:6: lv_d_7_0= ruleDECIMAL
                    {

                    						newCompositeNode(grammarAccess.getFatorAccess().getDDECIMALParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_d_7_0=ruleDECIMAL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFatorRule());
                    						}
                    						set(
                    							current,
                    							"d",
                    							lv_d_7_0,
                    							"br.dslcross.crossplatform.CrossPlatform.DECIMAL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalCrossPlatform.g:6103:4: ( (lv_strVar_8_0= RULE_STRING ) )
                    {
                    // InternalCrossPlatform.g:6103:4: ( (lv_strVar_8_0= RULE_STRING ) )
                    // InternalCrossPlatform.g:6104:5: (lv_strVar_8_0= RULE_STRING )
                    {
                    // InternalCrossPlatform.g:6104:5: (lv_strVar_8_0= RULE_STRING )
                    // InternalCrossPlatform.g:6105:6: lv_strVar_8_0= RULE_STRING
                    {
                    lv_strVar_8_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_strVar_8_0, grammarAccess.getFatorAccess().getStrVarSTRINGTerminalRuleCall_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFatorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"strVar",
                    							lv_strVar_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalCrossPlatform.g:6122:4: ( (lv_mcOperation_9_0= ruleMethodCallOp ) )
                    {
                    // InternalCrossPlatform.g:6122:4: ( (lv_mcOperation_9_0= ruleMethodCallOp ) )
                    // InternalCrossPlatform.g:6123:5: (lv_mcOperation_9_0= ruleMethodCallOp )
                    {
                    // InternalCrossPlatform.g:6123:5: (lv_mcOperation_9_0= ruleMethodCallOp )
                    // InternalCrossPlatform.g:6124:6: lv_mcOperation_9_0= ruleMethodCallOp
                    {

                    						newCompositeNode(grammarAccess.getFatorAccess().getMcOperationMethodCallOpParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_mcOperation_9_0=ruleMethodCallOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFatorRule());
                    						}
                    						set(
                    							current,
                    							"mcOperation",
                    							lv_mcOperation_9_0,
                    							"br.dslcross.crossplatform.CrossPlatform.MethodCallOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalCrossPlatform.g:6142:4: ( (lv_mcGlobal_10_0= ruleMethodCallGlob ) )
                    {
                    // InternalCrossPlatform.g:6142:4: ( (lv_mcGlobal_10_0= ruleMethodCallGlob ) )
                    // InternalCrossPlatform.g:6143:5: (lv_mcGlobal_10_0= ruleMethodCallGlob )
                    {
                    // InternalCrossPlatform.g:6143:5: (lv_mcGlobal_10_0= ruleMethodCallGlob )
                    // InternalCrossPlatform.g:6144:6: lv_mcGlobal_10_0= ruleMethodCallGlob
                    {

                    						newCompositeNode(grammarAccess.getFatorAccess().getMcGlobalMethodCallGlobParserRuleCall_1_5_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_mcGlobal_10_0=ruleMethodCallGlob();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFatorRule());
                    						}
                    						set(
                    							current,
                    							"mcGlobal",
                    							lv_mcGlobal_10_0,
                    							"br.dslcross.crossplatform.CrossPlatform.MethodCallGlob");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalCrossPlatform.g:6162:4: (otherlv_11= '(' ( (lv_expr_12_0= ruleExprArit ) ) otherlv_13= ')' )
                    {
                    // InternalCrossPlatform.g:6162:4: (otherlv_11= '(' ( (lv_expr_12_0= ruleExprArit ) ) otherlv_13= ')' )
                    // InternalCrossPlatform.g:6163:5: otherlv_11= '(' ( (lv_expr_12_0= ruleExprArit ) ) otherlv_13= ')'
                    {
                    otherlv_11=(Token)match(input,28,FOLLOW_40); 

                    					newLeafNode(otherlv_11, grammarAccess.getFatorAccess().getLeftParenthesisKeyword_1_6_0());
                    				
                    // InternalCrossPlatform.g:6167:5: ( (lv_expr_12_0= ruleExprArit ) )
                    // InternalCrossPlatform.g:6168:6: (lv_expr_12_0= ruleExprArit )
                    {
                    // InternalCrossPlatform.g:6168:6: (lv_expr_12_0= ruleExprArit )
                    // InternalCrossPlatform.g:6169:7: lv_expr_12_0= ruleExprArit
                    {

                    							newCompositeNode(grammarAccess.getFatorAccess().getExprExprAritParserRuleCall_1_6_1_0());
                    						
                    pushFollow(FOLLOW_59);
                    lv_expr_12_0=ruleExprArit();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFatorRule());
                    							}
                    							set(
                    								current,
                    								"expr",
                    								lv_expr_12_0,
                    								"br.dslcross.crossplatform.CrossPlatform.ExprArit");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_13=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(otherlv_13, grammarAccess.getFatorAccess().getRightParenthesisKeyword_1_6_2());
                    				

                    }


                    }
                    break;
                case 8 :
                    // InternalCrossPlatform.g:6192:4: ( ( (lv_vAtr1_14_0= ruleAttribID ) ) (otherlv_15= '.' ( (lv_vAtr2_16_0= ruleAttribID ) ) ( ( (lv_col_17_0= '(' ) ) ( ( (lv_value_18_0= ruleExprL ) ) (otherlv_19= ',' ( (lv_value_20_0= ruleExprL ) ) )* )? otherlv_21= ')' )? )+ )
                    {
                    // InternalCrossPlatform.g:6192:4: ( ( (lv_vAtr1_14_0= ruleAttribID ) ) (otherlv_15= '.' ( (lv_vAtr2_16_0= ruleAttribID ) ) ( ( (lv_col_17_0= '(' ) ) ( ( (lv_value_18_0= ruleExprL ) ) (otherlv_19= ',' ( (lv_value_20_0= ruleExprL ) ) )* )? otherlv_21= ')' )? )+ )
                    // InternalCrossPlatform.g:6193:5: ( (lv_vAtr1_14_0= ruleAttribID ) ) (otherlv_15= '.' ( (lv_vAtr2_16_0= ruleAttribID ) ) ( ( (lv_col_17_0= '(' ) ) ( ( (lv_value_18_0= ruleExprL ) ) (otherlv_19= ',' ( (lv_value_20_0= ruleExprL ) ) )* )? otherlv_21= ')' )? )+
                    {
                    // InternalCrossPlatform.g:6193:5: ( (lv_vAtr1_14_0= ruleAttribID ) )
                    // InternalCrossPlatform.g:6194:6: (lv_vAtr1_14_0= ruleAttribID )
                    {
                    // InternalCrossPlatform.g:6194:6: (lv_vAtr1_14_0= ruleAttribID )
                    // InternalCrossPlatform.g:6195:7: lv_vAtr1_14_0= ruleAttribID
                    {

                    							newCompositeNode(grammarAccess.getFatorAccess().getVAtr1AttribIDParserRuleCall_1_7_0_0());
                    						
                    pushFollow(FOLLOW_48);
                    lv_vAtr1_14_0=ruleAttribID();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFatorRule());
                    							}
                    							set(
                    								current,
                    								"vAtr1",
                    								lv_vAtr1_14_0,
                    								"br.dslcross.crossplatform.CrossPlatform.AttribID");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalCrossPlatform.g:6212:5: (otherlv_15= '.' ( (lv_vAtr2_16_0= ruleAttribID ) ) ( ( (lv_col_17_0= '(' ) ) ( ( (lv_value_18_0= ruleExprL ) ) (otherlv_19= ',' ( (lv_value_20_0= ruleExprL ) ) )* )? otherlv_21= ')' )? )+
                    int cnt154=0;
                    loop154:
                    do {
                        int alt154=2;
                        int LA154_0 = input.LA(1);

                        if ( (LA154_0==15) ) {
                            alt154=1;
                        }


                        switch (alt154) {
                    	case 1 :
                    	    // InternalCrossPlatform.g:6213:6: otherlv_15= '.' ( (lv_vAtr2_16_0= ruleAttribID ) ) ( ( (lv_col_17_0= '(' ) ) ( ( (lv_value_18_0= ruleExprL ) ) (otherlv_19= ',' ( (lv_value_20_0= ruleExprL ) ) )* )? otherlv_21= ')' )?
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_51); 

                    	    						newLeafNode(otherlv_15, grammarAccess.getFatorAccess().getFullStopKeyword_1_7_1_0());
                    	    					
                    	    // InternalCrossPlatform.g:6217:6: ( (lv_vAtr2_16_0= ruleAttribID ) )
                    	    // InternalCrossPlatform.g:6218:7: (lv_vAtr2_16_0= ruleAttribID )
                    	    {
                    	    // InternalCrossPlatform.g:6218:7: (lv_vAtr2_16_0= ruleAttribID )
                    	    // InternalCrossPlatform.g:6219:8: lv_vAtr2_16_0= ruleAttribID
                    	    {

                    	    								newCompositeNode(grammarAccess.getFatorAccess().getVAtr2AttribIDParserRuleCall_1_7_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_49);
                    	    lv_vAtr2_16_0=ruleAttribID();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getFatorRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"vAtr2",
                    	    									lv_vAtr2_16_0,
                    	    									"br.dslcross.crossplatform.CrossPlatform.AttribID");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }

                    	    // InternalCrossPlatform.g:6236:6: ( ( (lv_col_17_0= '(' ) ) ( ( (lv_value_18_0= ruleExprL ) ) (otherlv_19= ',' ( (lv_value_20_0= ruleExprL ) ) )* )? otherlv_21= ')' )?
                    	    int alt153=2;
                    	    int LA153_0 = input.LA(1);

                    	    if ( (LA153_0==28) ) {
                    	        alt153=1;
                    	    }
                    	    switch (alt153) {
                    	        case 1 :
                    	            // InternalCrossPlatform.g:6237:7: ( (lv_col_17_0= '(' ) ) ( ( (lv_value_18_0= ruleExprL ) ) (otherlv_19= ',' ( (lv_value_20_0= ruleExprL ) ) )* )? otherlv_21= ')'
                    	            {
                    	            // InternalCrossPlatform.g:6237:7: ( (lv_col_17_0= '(' ) )
                    	            // InternalCrossPlatform.g:6238:8: (lv_col_17_0= '(' )
                    	            {
                    	            // InternalCrossPlatform.g:6238:8: (lv_col_17_0= '(' )
                    	            // InternalCrossPlatform.g:6239:9: lv_col_17_0= '('
                    	            {
                    	            lv_col_17_0=(Token)match(input,28,FOLLOW_73); 

                    	            									newLeafNode(lv_col_17_0, grammarAccess.getFatorAccess().getColLeftParenthesisKeyword_1_7_1_2_0_0());
                    	            								

                    	            									if (current==null) {
                    	            										current = createModelElement(grammarAccess.getFatorRule());
                    	            									}
                    	            									addWithLastConsumed(current, "col", lv_col_17_0, "(");
                    	            								

                    	            }


                    	            }

                    	            // InternalCrossPlatform.g:6251:7: ( ( (lv_value_18_0= ruleExprL ) ) (otherlv_19= ',' ( (lv_value_20_0= ruleExprL ) ) )* )?
                    	            int alt152=2;
                    	            int LA152_0 = input.LA(1);

                    	            if ( ((LA152_0>=RULE_ID && LA152_0<=RULE_INT)||LA152_0==RULE_STRING||(LA152_0>=65 && LA152_0<=66)) ) {
                    	                alt152=1;
                    	            }
                    	            switch (alt152) {
                    	                case 1 :
                    	                    // InternalCrossPlatform.g:6252:8: ( (lv_value_18_0= ruleExprL ) ) (otherlv_19= ',' ( (lv_value_20_0= ruleExprL ) ) )*
                    	                    {
                    	                    // InternalCrossPlatform.g:6252:8: ( (lv_value_18_0= ruleExprL ) )
                    	                    // InternalCrossPlatform.g:6253:9: (lv_value_18_0= ruleExprL )
                    	                    {
                    	                    // InternalCrossPlatform.g:6253:9: (lv_value_18_0= ruleExprL )
                    	                    // InternalCrossPlatform.g:6254:10: lv_value_18_0= ruleExprL
                    	                    {

                    	                    										newCompositeNode(grammarAccess.getFatorAccess().getValueExprLParserRuleCall_1_7_1_2_1_0_0());
                    	                    									
                    	                    pushFollow(FOLLOW_16);
                    	                    lv_value_18_0=ruleExprL();

                    	                    state._fsp--;


                    	                    										if (current==null) {
                    	                    											current = createModelElementForParent(grammarAccess.getFatorRule());
                    	                    										}
                    	                    										add(
                    	                    											current,
                    	                    											"value",
                    	                    											lv_value_18_0,
                    	                    											"br.dslcross.crossplatform.CrossPlatform.ExprL");
                    	                    										afterParserOrEnumRuleCall();
                    	                    									

                    	                    }


                    	                    }

                    	                    // InternalCrossPlatform.g:6271:8: (otherlv_19= ',' ( (lv_value_20_0= ruleExprL ) ) )*
                    	                    loop151:
                    	                    do {
                    	                        int alt151=2;
                    	                        int LA151_0 = input.LA(1);

                    	                        if ( (LA151_0==26) ) {
                    	                            alt151=1;
                    	                        }


                    	                        switch (alt151) {
                    	                    	case 1 :
                    	                    	    // InternalCrossPlatform.g:6272:9: otherlv_19= ',' ( (lv_value_20_0= ruleExprL ) )
                    	                    	    {
                    	                    	    otherlv_19=(Token)match(input,26,FOLLOW_52); 

                    	                    	    									newLeafNode(otherlv_19, grammarAccess.getFatorAccess().getCommaKeyword_1_7_1_2_1_1_0());
                    	                    	    								
                    	                    	    // InternalCrossPlatform.g:6276:9: ( (lv_value_20_0= ruleExprL ) )
                    	                    	    // InternalCrossPlatform.g:6277:10: (lv_value_20_0= ruleExprL )
                    	                    	    {
                    	                    	    // InternalCrossPlatform.g:6277:10: (lv_value_20_0= ruleExprL )
                    	                    	    // InternalCrossPlatform.g:6278:11: lv_value_20_0= ruleExprL
                    	                    	    {

                    	                    	    											newCompositeNode(grammarAccess.getFatorAccess().getValueExprLParserRuleCall_1_7_1_2_1_1_1_0());
                    	                    	    										
                    	                    	    pushFollow(FOLLOW_16);
                    	                    	    lv_value_20_0=ruleExprL();

                    	                    	    state._fsp--;


                    	                    	    											if (current==null) {
                    	                    	    												current = createModelElementForParent(grammarAccess.getFatorRule());
                    	                    	    											}
                    	                    	    											add(
                    	                    	    												current,
                    	                    	    												"value",
                    	                    	    												lv_value_20_0,
                    	                    	    												"br.dslcross.crossplatform.CrossPlatform.ExprL");
                    	                    	    											afterParserOrEnumRuleCall();
                    	                    	    										

                    	                    	    }


                    	                    	    }


                    	                    	    }
                    	                    	    break;

                    	                    	default :
                    	                    	    break loop151;
                    	                        }
                    	                    } while (true);


                    	                    }
                    	                    break;

                    	            }

                    	            otherlv_21=(Token)match(input,29,FOLLOW_7); 

                    	            							newLeafNode(otherlv_21, grammarAccess.getFatorAccess().getRightParenthesisKeyword_1_7_1_2_2());
                    	            						

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt154 >= 1 ) break loop154;
                                EarlyExitException eee =
                                    new EarlyExitException(154, input);
                                throw eee;
                        }
                        cnt154++;
                    } while (true);


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFator"


    // $ANTLR start "entryRuleMethodCallOp"
    // InternalCrossPlatform.g:6309:1: entryRuleMethodCallOp returns [EObject current=null] : iv_ruleMethodCallOp= ruleMethodCallOp EOF ;
    public final EObject entryRuleMethodCallOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCallOp = null;


        try {
            // InternalCrossPlatform.g:6309:53: (iv_ruleMethodCallOp= ruleMethodCallOp EOF )
            // InternalCrossPlatform.g:6310:2: iv_ruleMethodCallOp= ruleMethodCallOp EOF
            {
             newCompositeNode(grammarAccess.getMethodCallOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodCallOp=ruleMethodCallOp();

            state._fsp--;

             current =iv_ruleMethodCallOp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodCallOp"


    // $ANTLR start "ruleMethodCallOp"
    // InternalCrossPlatform.g:6316:1: ruleMethodCallOp returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleAttributeCall ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleAttributeCall ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleMethodCallOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_args_2_0 = null;

        EObject lv_args_4_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:6322:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleAttributeCall ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleAttributeCall ) ) )* )? otherlv_5= ')' ) )
            // InternalCrossPlatform.g:6323:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleAttributeCall ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleAttributeCall ) ) )* )? otherlv_5= ')' )
            {
            // InternalCrossPlatform.g:6323:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleAttributeCall ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleAttributeCall ) ) )* )? otherlv_5= ')' )
            // InternalCrossPlatform.g:6324:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleAttributeCall ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleAttributeCall ) ) )* )? otherlv_5= ')'
            {
            // InternalCrossPlatform.g:6324:3: ( (otherlv_0= RULE_ID ) )
            // InternalCrossPlatform.g:6325:4: (otherlv_0= RULE_ID )
            {
            // InternalCrossPlatform.g:6325:4: (otherlv_0= RULE_ID )
            // InternalCrossPlatform.g:6326:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodCallOpRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_0, grammarAccess.getMethodCallOpAccess().getCallOperationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodCallOpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCrossPlatform.g:6341:3: ( ( (lv_args_2_0= ruleAttributeCall ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleAttributeCall ) ) )* )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==RULE_ID) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // InternalCrossPlatform.g:6342:4: ( (lv_args_2_0= ruleAttributeCall ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleAttributeCall ) ) )*
                    {
                    // InternalCrossPlatform.g:6342:4: ( (lv_args_2_0= ruleAttributeCall ) )
                    // InternalCrossPlatform.g:6343:5: (lv_args_2_0= ruleAttributeCall )
                    {
                    // InternalCrossPlatform.g:6343:5: (lv_args_2_0= ruleAttributeCall )
                    // InternalCrossPlatform.g:6344:6: lv_args_2_0= ruleAttributeCall
                    {

                    						newCompositeNode(grammarAccess.getMethodCallOpAccess().getArgsAttributeCallParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_args_2_0=ruleAttributeCall();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodCallOpRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_2_0,
                    							"br.dslcross.crossplatform.CrossPlatform.AttributeCall");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCrossPlatform.g:6361:4: (otherlv_3= ',' ( (lv_args_4_0= ruleAttributeCall ) ) )*
                    loop156:
                    do {
                        int alt156=2;
                        int LA156_0 = input.LA(1);

                        if ( (LA156_0==26) ) {
                            alt156=1;
                        }


                        switch (alt156) {
                    	case 1 :
                    	    // InternalCrossPlatform.g:6362:5: otherlv_3= ',' ( (lv_args_4_0= ruleAttributeCall ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getMethodCallOpAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalCrossPlatform.g:6366:5: ( (lv_args_4_0= ruleAttributeCall ) )
                    	    // InternalCrossPlatform.g:6367:6: (lv_args_4_0= ruleAttributeCall )
                    	    {
                    	    // InternalCrossPlatform.g:6367:6: (lv_args_4_0= ruleAttributeCall )
                    	    // InternalCrossPlatform.g:6368:7: lv_args_4_0= ruleAttributeCall
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodCallOpAccess().getArgsAttributeCallParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_args_4_0=ruleAttributeCall();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodCallOpRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_4_0,
                    	    								"br.dslcross.crossplatform.CrossPlatform.AttributeCall");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop156;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMethodCallOpAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodCallOp"


    // $ANTLR start "entryRuleMethodCallGlob"
    // InternalCrossPlatform.g:6395:1: entryRuleMethodCallGlob returns [EObject current=null] : iv_ruleMethodCallGlob= ruleMethodCallGlob EOF ;
    public final EObject entryRuleMethodCallGlob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCallGlob = null;


        try {
            // InternalCrossPlatform.g:6395:55: (iv_ruleMethodCallGlob= ruleMethodCallGlob EOF )
            // InternalCrossPlatform.g:6396:2: iv_ruleMethodCallGlob= ruleMethodCallGlob EOF
            {
             newCompositeNode(grammarAccess.getMethodCallGlobRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodCallGlob=ruleMethodCallGlob();

            state._fsp--;

             current =iv_ruleMethodCallGlob; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodCallGlob"


    // $ANTLR start "ruleMethodCallGlob"
    // InternalCrossPlatform.g:6402:1: ruleMethodCallGlob returns [EObject current=null] : (otherlv_0= 'global' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( (lv_args_5_0= ruleAttributeCall ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleAttributeCall ) ) )* )? otherlv_8= ')' ) ;
    public final EObject ruleMethodCallGlob() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_args_5_0 = null;

        EObject lv_args_7_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:6408:2: ( (otherlv_0= 'global' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( (lv_args_5_0= ruleAttributeCall ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleAttributeCall ) ) )* )? otherlv_8= ')' ) )
            // InternalCrossPlatform.g:6409:2: (otherlv_0= 'global' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( (lv_args_5_0= ruleAttributeCall ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleAttributeCall ) ) )* )? otherlv_8= ')' )
            {
            // InternalCrossPlatform.g:6409:2: (otherlv_0= 'global' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( (lv_args_5_0= ruleAttributeCall ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleAttributeCall ) ) )* )? otherlv_8= ')' )
            // InternalCrossPlatform.g:6410:3: otherlv_0= 'global' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( (lv_args_5_0= ruleAttributeCall ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleAttributeCall ) ) )* )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMethodCallGlobAccess().getGlobalKeyword_0());
            		
            // InternalCrossPlatform.g:6414:3: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==RULE_ID) ) {
                int LA158_1 = input.LA(2);

                if ( (LA158_1==15) ) {
                    alt158=1;
                }
            }
            switch (alt158) {
                case 1 :
                    // InternalCrossPlatform.g:6415:4: ( (otherlv_1= RULE_ID ) ) otherlv_2= '.'
                    {
                    // InternalCrossPlatform.g:6415:4: ( (otherlv_1= RULE_ID ) )
                    // InternalCrossPlatform.g:6416:5: (otherlv_1= RULE_ID )
                    {
                    // InternalCrossPlatform.g:6416:5: (otherlv_1= RULE_ID )
                    // InternalCrossPlatform.g:6417:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMethodCallGlobRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_48); 

                    						newLeafNode(otherlv_1, grammarAccess.getMethodCallGlobAccess().getObjAttributeCrossReference_1_0_0());
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getMethodCallGlobAccess().getFullStopKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalCrossPlatform.g:6433:3: ( (otherlv_3= RULE_ID ) )
            // InternalCrossPlatform.g:6434:4: (otherlv_3= RULE_ID )
            {
            // InternalCrossPlatform.g:6434:4: (otherlv_3= RULE_ID )
            // InternalCrossPlatform.g:6435:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodCallGlobRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_3, grammarAccess.getMethodCallGlobAccess().getCalledOpGlobalGlobalCrossReference_2_0());
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getMethodCallGlobAccess().getLeftParenthesisKeyword_3());
            		
            // InternalCrossPlatform.g:6450:3: ( ( (lv_args_5_0= ruleAttributeCall ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleAttributeCall ) ) )* )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==RULE_ID) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // InternalCrossPlatform.g:6451:4: ( (lv_args_5_0= ruleAttributeCall ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleAttributeCall ) ) )*
                    {
                    // InternalCrossPlatform.g:6451:4: ( (lv_args_5_0= ruleAttributeCall ) )
                    // InternalCrossPlatform.g:6452:5: (lv_args_5_0= ruleAttributeCall )
                    {
                    // InternalCrossPlatform.g:6452:5: (lv_args_5_0= ruleAttributeCall )
                    // InternalCrossPlatform.g:6453:6: lv_args_5_0= ruleAttributeCall
                    {

                    						newCompositeNode(grammarAccess.getMethodCallGlobAccess().getArgsAttributeCallParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_args_5_0=ruleAttributeCall();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodCallGlobRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_5_0,
                    							"br.dslcross.crossplatform.CrossPlatform.AttributeCall");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCrossPlatform.g:6470:4: (otherlv_6= ',' ( (lv_args_7_0= ruleAttributeCall ) ) )*
                    loop159:
                    do {
                        int alt159=2;
                        int LA159_0 = input.LA(1);

                        if ( (LA159_0==26) ) {
                            alt159=1;
                        }


                        switch (alt159) {
                    	case 1 :
                    	    // InternalCrossPlatform.g:6471:5: otherlv_6= ',' ( (lv_args_7_0= ruleAttributeCall ) )
                    	    {
                    	    otherlv_6=(Token)match(input,26,FOLLOW_4); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getMethodCallGlobAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalCrossPlatform.g:6475:5: ( (lv_args_7_0= ruleAttributeCall ) )
                    	    // InternalCrossPlatform.g:6476:6: (lv_args_7_0= ruleAttributeCall )
                    	    {
                    	    // InternalCrossPlatform.g:6476:6: (lv_args_7_0= ruleAttributeCall )
                    	    // InternalCrossPlatform.g:6477:7: lv_args_7_0= ruleAttributeCall
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodCallGlobAccess().getArgsAttributeCallParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_args_7_0=ruleAttributeCall();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodCallGlobRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_7_0,
                    	    								"br.dslcross.crossplatform.CrossPlatform.AttributeCall");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop159;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getMethodCallGlobAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodCallGlob"


    // $ANTLR start "entryRuleAttributeCall"
    // InternalCrossPlatform.g:6504:1: entryRuleAttributeCall returns [EObject current=null] : iv_ruleAttributeCall= ruleAttributeCall EOF ;
    public final EObject entryRuleAttributeCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeCall = null;


        try {
            // InternalCrossPlatform.g:6504:54: (iv_ruleAttributeCall= ruleAttributeCall EOF )
            // InternalCrossPlatform.g:6505:2: iv_ruleAttributeCall= ruleAttributeCall EOF
            {
             newCompositeNode(grammarAccess.getAttributeCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeCall=ruleAttributeCall();

            state._fsp--;

             current =iv_ruleAttributeCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeCall"


    // $ANTLR start "ruleAttributeCall"
    // InternalCrossPlatform.g:6511:1: ruleAttributeCall returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_col1_1_0= '[' ) )? ( (lv_array_2_0= RULE_INT ) )? ( (lv_col2_3_0= ']' ) )? (otherlv_4= '.' ( (lv_vAtr2_5_0= ruleAttribID ) ) ( ( (lv_col_6_0= '(' ) ) ( (lv_value_7_0= ruleExprL ) ) otherlv_8= ')' )? )* ) ;
    public final EObject ruleAttributeCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_col1_1_0=null;
        Token lv_array_2_0=null;
        Token lv_col2_3_0=null;
        Token otherlv_4=null;
        Token lv_col_6_0=null;
        Token otherlv_8=null;
        EObject lv_vAtr2_5_0 = null;

        EObject lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalCrossPlatform.g:6517:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_col1_1_0= '[' ) )? ( (lv_array_2_0= RULE_INT ) )? ( (lv_col2_3_0= ']' ) )? (otherlv_4= '.' ( (lv_vAtr2_5_0= ruleAttribID ) ) ( ( (lv_col_6_0= '(' ) ) ( (lv_value_7_0= ruleExprL ) ) otherlv_8= ')' )? )* ) )
            // InternalCrossPlatform.g:6518:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_col1_1_0= '[' ) )? ( (lv_array_2_0= RULE_INT ) )? ( (lv_col2_3_0= ']' ) )? (otherlv_4= '.' ( (lv_vAtr2_5_0= ruleAttribID ) ) ( ( (lv_col_6_0= '(' ) ) ( (lv_value_7_0= ruleExprL ) ) otherlv_8= ')' )? )* )
            {
            // InternalCrossPlatform.g:6518:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_col1_1_0= '[' ) )? ( (lv_array_2_0= RULE_INT ) )? ( (lv_col2_3_0= ']' ) )? (otherlv_4= '.' ( (lv_vAtr2_5_0= ruleAttribID ) ) ( ( (lv_col_6_0= '(' ) ) ( (lv_value_7_0= ruleExprL ) ) otherlv_8= ')' )? )* )
            // InternalCrossPlatform.g:6519:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_col1_1_0= '[' ) )? ( (lv_array_2_0= RULE_INT ) )? ( (lv_col2_3_0= ']' ) )? (otherlv_4= '.' ( (lv_vAtr2_5_0= ruleAttribID ) ) ( ( (lv_col_6_0= '(' ) ) ( (lv_value_7_0= ruleExprL ) ) otherlv_8= ')' )? )*
            {
            // InternalCrossPlatform.g:6519:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCrossPlatform.g:6520:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCrossPlatform.g:6520:4: (lv_name_0_0= RULE_ID )
            // InternalCrossPlatform.g:6521:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_74); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAttributeCallAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeCallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCrossPlatform.g:6537:3: ( (lv_col1_1_0= '[' ) )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==30) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // InternalCrossPlatform.g:6538:4: (lv_col1_1_0= '[' )
                    {
                    // InternalCrossPlatform.g:6538:4: (lv_col1_1_0= '[' )
                    // InternalCrossPlatform.g:6539:5: lv_col1_1_0= '['
                    {
                    lv_col1_1_0=(Token)match(input,30,FOLLOW_75); 

                    					newLeafNode(lv_col1_1_0, grammarAccess.getAttributeCallAccess().getCol1LeftSquareBracketKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeCallRule());
                    					}
                    					setWithLastConsumed(current, "col1", lv_col1_1_0, "[");
                    				

                    }


                    }
                    break;

            }

            // InternalCrossPlatform.g:6551:3: ( (lv_array_2_0= RULE_INT ) )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==RULE_INT) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // InternalCrossPlatform.g:6552:4: (lv_array_2_0= RULE_INT )
                    {
                    // InternalCrossPlatform.g:6552:4: (lv_array_2_0= RULE_INT )
                    // InternalCrossPlatform.g:6553:5: lv_array_2_0= RULE_INT
                    {
                    lv_array_2_0=(Token)match(input,RULE_INT,FOLLOW_76); 

                    					newLeafNode(lv_array_2_0, grammarAccess.getAttributeCallAccess().getArrayINTTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeCallRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"array",
                    						lv_array_2_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            // InternalCrossPlatform.g:6569:3: ( (lv_col2_3_0= ']' ) )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==31) ) {
                alt163=1;
            }
            switch (alt163) {
                case 1 :
                    // InternalCrossPlatform.g:6570:4: (lv_col2_3_0= ']' )
                    {
                    // InternalCrossPlatform.g:6570:4: (lv_col2_3_0= ']' )
                    // InternalCrossPlatform.g:6571:5: lv_col2_3_0= ']'
                    {
                    lv_col2_3_0=(Token)match(input,31,FOLLOW_7); 

                    					newLeafNode(lv_col2_3_0, grammarAccess.getAttributeCallAccess().getCol2RightSquareBracketKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeCallRule());
                    					}
                    					setWithLastConsumed(current, "col2", lv_col2_3_0, "]");
                    				

                    }


                    }
                    break;

            }

            // InternalCrossPlatform.g:6583:3: (otherlv_4= '.' ( (lv_vAtr2_5_0= ruleAttribID ) ) ( ( (lv_col_6_0= '(' ) ) ( (lv_value_7_0= ruleExprL ) ) otherlv_8= ')' )? )*
            loop165:
            do {
                int alt165=2;
                int LA165_0 = input.LA(1);

                if ( (LA165_0==15) ) {
                    alt165=1;
                }


                switch (alt165) {
            	case 1 :
            	    // InternalCrossPlatform.g:6584:4: otherlv_4= '.' ( (lv_vAtr2_5_0= ruleAttribID ) ) ( ( (lv_col_6_0= '(' ) ) ( (lv_value_7_0= ruleExprL ) ) otherlv_8= ')' )?
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_51); 

            	    				newLeafNode(otherlv_4, grammarAccess.getAttributeCallAccess().getFullStopKeyword_4_0());
            	    			
            	    // InternalCrossPlatform.g:6588:4: ( (lv_vAtr2_5_0= ruleAttribID ) )
            	    // InternalCrossPlatform.g:6589:5: (lv_vAtr2_5_0= ruleAttribID )
            	    {
            	    // InternalCrossPlatform.g:6589:5: (lv_vAtr2_5_0= ruleAttribID )
            	    // InternalCrossPlatform.g:6590:6: lv_vAtr2_5_0= ruleAttribID
            	    {

            	    						newCompositeNode(grammarAccess.getAttributeCallAccess().getVAtr2AttribIDParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_49);
            	    lv_vAtr2_5_0=ruleAttribID();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAttributeCallRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vAtr2",
            	    							lv_vAtr2_5_0,
            	    							"br.dslcross.crossplatform.CrossPlatform.AttribID");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalCrossPlatform.g:6607:4: ( ( (lv_col_6_0= '(' ) ) ( (lv_value_7_0= ruleExprL ) ) otherlv_8= ')' )?
            	    int alt164=2;
            	    int LA164_0 = input.LA(1);

            	    if ( (LA164_0==28) ) {
            	        alt164=1;
            	    }
            	    switch (alt164) {
            	        case 1 :
            	            // InternalCrossPlatform.g:6608:5: ( (lv_col_6_0= '(' ) ) ( (lv_value_7_0= ruleExprL ) ) otherlv_8= ')'
            	            {
            	            // InternalCrossPlatform.g:6608:5: ( (lv_col_6_0= '(' ) )
            	            // InternalCrossPlatform.g:6609:6: (lv_col_6_0= '(' )
            	            {
            	            // InternalCrossPlatform.g:6609:6: (lv_col_6_0= '(' )
            	            // InternalCrossPlatform.g:6610:7: lv_col_6_0= '('
            	            {
            	            lv_col_6_0=(Token)match(input,28,FOLLOW_52); 

            	            							newLeafNode(lv_col_6_0, grammarAccess.getAttributeCallAccess().getColLeftParenthesisKeyword_4_2_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAttributeCallRule());
            	            							}
            	            							addWithLastConsumed(current, "col", lv_col_6_0, "(");
            	            						

            	            }


            	            }

            	            // InternalCrossPlatform.g:6622:5: ( (lv_value_7_0= ruleExprL ) )
            	            // InternalCrossPlatform.g:6623:6: (lv_value_7_0= ruleExprL )
            	            {
            	            // InternalCrossPlatform.g:6623:6: (lv_value_7_0= ruleExprL )
            	            // InternalCrossPlatform.g:6624:7: lv_value_7_0= ruleExprL
            	            {

            	            							newCompositeNode(grammarAccess.getAttributeCallAccess().getValueExprLParserRuleCall_4_2_1_0());
            	            						
            	            pushFollow(FOLLOW_59);
            	            lv_value_7_0=ruleExprL();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getAttributeCallRule());
            	            							}
            	            							add(
            	            								current,
            	            								"value",
            	            								lv_value_7_0,
            	            								"br.dslcross.crossplatform.CrossPlatform.ExprL");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }

            	            otherlv_8=(Token)match(input,29,FOLLOW_7); 

            	            					newLeafNode(otherlv_8, grammarAccess.getAttributeCallAccess().getRightParenthesisKeyword_4_2_2());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop165;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeCall"


    // $ANTLR start "entryRuleDECIMAL"
    // InternalCrossPlatform.g:6651:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalCrossPlatform.g:6651:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalCrossPlatform.g:6652:2: iv_ruleDECIMAL= ruleDECIMAL EOF
            {
             newCompositeNode(grammarAccess.getDECIMALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDECIMAL=ruleDECIMAL();

            state._fsp--;

             current =iv_ruleDECIMAL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDECIMAL"


    // $ANTLR start "ruleDECIMAL"
    // InternalCrossPlatform.g:6658:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' )? (this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalCrossPlatform.g:6664:2: ( (this_INT_0= RULE_INT (kw= '.' )? (this_INT_2= RULE_INT )? ) )
            // InternalCrossPlatform.g:6665:2: (this_INT_0= RULE_INT (kw= '.' )? (this_INT_2= RULE_INT )? )
            {
            // InternalCrossPlatform.g:6665:2: (this_INT_0= RULE_INT (kw= '.' )? (this_INT_2= RULE_INT )? )
            // InternalCrossPlatform.g:6666:3: this_INT_0= RULE_INT (kw= '.' )? (this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_61); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0());
            		
            // InternalCrossPlatform.g:6673:3: (kw= '.' )?
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==15) ) {
                alt166=1;
            }
            switch (alt166) {
                case 1 :
                    // InternalCrossPlatform.g:6674:4: kw= '.'
                    {
                    kw=(Token)match(input,15,FOLLOW_62); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1());
                    			

                    }
                    break;

            }

            // InternalCrossPlatform.g:6680:3: (this_INT_2= RULE_INT )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==RULE_INT) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // InternalCrossPlatform.g:6681:4: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDECIMAL"

    // Delegated rules


    protected DFA104 dfa104 = new DFA104(this);
    protected DFA132 dfa132 = new DFA132(this);
    protected DFA155 dfa155 = new DFA155(this);
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\16\uffff\1\17\1\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\5\10\uffff\1\4\2\uffff\1\4\1\uffff";
    static final String dfa_4s = "\1\110\1\uffff\1\111\10\uffff\1\4\2\uffff\1\110\1\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\uffff\1\2\1\5\1\7\1\10\1\11\1\12\1\13\1\14\1\uffff\1\3\1\6\1\uffff\1\4";
    static final String dfa_6s = "\20\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\uffff\1\3\32\uffff\1\4\10\uffff\1\11\5\uffff\1\1\3\12\5\uffff\1\6\1\uffff\1\7\13\uffff\1\5\1\10",
            "",
            "\1\15\11\uffff\1\13\3\uffff\1\1\10\uffff\1\4\1\uffff\2\15\24\uffff\4\14\1\15\20\uffff\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\16",
            "",
            "",
            "\1\17\1\15\1\17\6\uffff\2\17\1\13\14\uffff\2\17\2\15\1\uffff\1\17\10\uffff\1\17\5\uffff\4\17\4\uffff\1\15\3\17\13\uffff\2\17",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA104 extends DFA {

        public DFA104(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 104;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3682:2: (this_Attribute_0= ruleAttribute | this_StringTemplateFreeCod_1= ruleStringTemplateFreeCod | this_AbrevCmd_2= ruleAbrevCmd | this_MethodCallCmd_3= ruleMethodCallCmd | this_MethodCallGlobal_4= ruleMethodCallGlobal | this_CallAttributeObject_5= ruleCallAttributeObject | this_OpLogicoWhile_6= ruleOpLogicoWhile | this_OpLogicoDoWhile_7= ruleOpLogicoDoWhile | this_OpLogicoIF_8= ruleOpLogicoIF | this_OpLogicoFor_9= ruleOpLogicoFor | this_EntityGlobCall_10= ruleEntityGlobCall | this_SpecialCommand_11= ruleSpecialCommand )";
        }
    }
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\2\uffff\1\7\1\10\1\11\5\uffff";
    static final String dfa_10s = "\5\4\5\uffff";
    static final String dfa_11s = "\2\102\3\110\5\uffff";
    static final String dfa_12s = "\5\uffff\1\4\1\5\1\1\1\2\1\3";
    static final String dfa_13s = "\12\uffff}>";
    static final String[] dfa_14s = {
            "\1\2\1\6\1\uffff\1\6\24\uffff\1\5\43\uffff\1\1\1\3\1\4",
            "\1\2\1\6\1\uffff\1\6\71\uffff\1\3\1\4",
            "\1\7\1\6\1\7\6\uffff\2\7\1\6\11\uffff\1\6\1\7\1\6\1\uffff\1\7\2\6\1\uffff\1\7\10\uffff\1\7\5\uffff\4\7\5\uffff\3\7\2\uffff\2\7\3\uffff\4\6\2\7",
            "\1\10\1\uffff\1\10\6\uffff\2\10\12\uffff\1\6\1\10\1\6\1\uffff\1\10\3\uffff\1\10\10\uffff\1\10\5\uffff\4\10\5\uffff\3\10\2\uffff\2\10\3\uffff\4\6\2\10",
            "\1\11\1\uffff\1\11\6\uffff\2\11\12\uffff\1\6\1\11\1\6\1\uffff\1\11\3\uffff\1\11\10\uffff\1\11\5\uffff\4\11\5\uffff\3\11\2\uffff\2\11\3\uffff\4\6\2\11",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA132 extends DFA {

        public DFA132(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 132;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "4912:3: ( ( ( (lv_n_1_0= '!' ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (lv_n_3_0= '!' ) )? ( (lv_op1_4_0= 'true' ) ) ) | ( ( (lv_n_5_0= '!' ) )? ( (lv_op2_6_0= 'false' ) ) ) | (otherlv_7= '(' ( (lv_exprLog_8_0= ruleExprLogica ) ) otherlv_9= ')' ) | ( ( (lv_n_10_0= '!' ) )? ( (lv_expr1_11_0= ruleExprL ) ) ( ( (lv_OpRel_12_1= '>' | lv_OpRel_12_2= '>=' | lv_OpRel_12_3= '<' | lv_OpRel_12_4= '<=' | lv_OpRel_12_5= '==' | lv_OpRel_12_6= '<>' ) ) ) ( (lv_expr2_13_0= ruleExprL ) ) ) )";
        }
    }
    static final String dfa_15s = "\15\uffff";
    static final String dfa_16s = "\1\uffff\1\14\5\uffff\3\14\3\uffff";
    static final String dfa_17s = "\2\4\5\uffff\3\4\3\uffff";
    static final String dfa_18s = "\1\41\1\115\5\uffff\3\115\3\uffff";
    static final String dfa_19s = "\2\uffff\1\3\1\4\1\6\1\7\1\5\3\uffff\1\10\1\1\1\2";
    static final String dfa_20s = "\15\uffff}>";
    static final String[] dfa_21s = {
            "\1\1\1\2\1\uffff\1\3\24\uffff\1\5\4\uffff\1\4",
            "\1\14\1\10\1\14\6\uffff\2\14\1\12\3\uffff\1\13\6\uffff\1\14\1\uffff\1\6\1\14\1\7\1\11\1\uffff\1\14\7\uffff\4\14\3\uffff\4\14\5\uffff\3\14\13\uffff\2\14\1\uffff\4\14",
            "",
            "",
            "",
            "",
            "",
            "\1\14\1\10\1\14\6\uffff\2\14\1\12\12\uffff\1\14\2\uffff\1\14\1\uffff\1\11\1\uffff\1\14\7\uffff\4\14\3\uffff\4\14\5\uffff\3\14\13\uffff\2\14\1\uffff\4\14",
            "\1\14\1\uffff\1\14\6\uffff\2\14\1\12\12\uffff\1\14\2\uffff\1\14\1\uffff\1\11\1\uffff\1\14\7\uffff\4\14\3\uffff\4\14\5\uffff\3\14\13\uffff\2\14\1\uffff\4\14",
            "\1\14\1\uffff\1\14\6\uffff\2\14\1\12\12\uffff\1\14\2\uffff\1\14\3\uffff\1\14\7\uffff\4\14\3\uffff\4\14\5\uffff\3\14\13\uffff\2\14\1\uffff\4\14",
            "",
            "",
            ""
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA155 extends DFA {

        public DFA155(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 155;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "5977:3: ( ( (lv_p_1_0= ruleParameter ) ) | ( ( (lv_v_2_0= RULE_ID ) ) ( (lv_col1_3_0= '[' ) )? ( (lv_array_4_0= RULE_INT ) )? ( (lv_array2_5_0= RULE_ID ) )? ( (lv_col2_6_0= ']' ) )? ) | ( (lv_d_7_0= ruleDECIMAL ) ) | ( (lv_strVar_8_0= RULE_STRING ) ) | ( (lv_mcOperation_9_0= ruleMethodCallOp ) ) | ( (lv_mcGlobal_10_0= ruleMethodCallGlob ) ) | (otherlv_11= '(' ( (lv_expr_12_0= ruleExprArit ) ) otherlv_13= ')' ) | ( ( (lv_vAtr1_14_0= ruleAttribID ) ) (otherlv_15= '.' ( (lv_vAtr2_16_0= ruleAttribID ) ) ( ( (lv_col_17_0= '(' ) ) ( ( (lv_value_18_0= ruleExprL ) ) (otherlv_19= ',' ( (lv_value_20_0= ruleExprL ) ) )* )? otherlv_21= ')' )? )+ ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000C701051002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000C701055000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0001F00000004010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000C2000022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000C0000022L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000022L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000082000022L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000082000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000002000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00011E0000004050L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000042000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000000C2082022L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000C2002022L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000C0002022L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000080002022L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000080002002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0A0F1E0200004050L,0x0000000000000180L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00011E02100000F0L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000000C2002020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00000000C0002020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000080002020L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000080002000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000010008002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0100000000008000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x00011E0000000050L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x00000000100000B0L,0x0000000000000007L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0E0F1E0200000050L,0x0000000000000180L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x000000000A000000L,0x0000000000000078L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000008022L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x00000000C0000020L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0A0F1E0200000050L,0x0000000000000180L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x00000000C0000032L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000080000032L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000080000012L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x00000000300000B0L,0x0000000000000007L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x00000000C0008022L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000080008022L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000080008002L});

}