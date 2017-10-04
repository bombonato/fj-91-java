// $ANTLR 3.2 Sep 23, 2009 12:02:23 /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g 2012-03-01 17:25:51

  package br.com.caelum.fj91.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TurmaLexer extends Lexer {
    public static final int NOTURNO=8;
    public static final int ABR=5;
    public static final int WS=12;
    public static final int SABADO=9;
    public static final int HYPHEN=6;
    public static final int DOUBLE_DIGIT=7;
    public static final int PREPOSICAO=4;
    public static final int DIGIT=11;
    public static final int EOF=-1;
    public static final int SALA=10;

    // delegates
    // delegators

    public TurmaLexer() {;} 
    public TurmaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TurmaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/files/workspaces/workspace-antlr/dsl_externo/src/Turma.g"; }

    // $ANTLR start "PREPOSICAO"
    public final void mPREPOSICAO() throws RecognitionException {
        try {
            int _type = PREPOSICAO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:45:11: ( 'ao' | 'aos' | 'de' | 'no' | 'na' )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 'a':
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='o') ) {
                    int LA1_4 = input.LA(3);

                    if ( (LA1_4=='s') ) {
                        alt1=2;
                    }
                    else {
                        alt1=1;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 'd':
                {
                alt1=3;
                }
                break;
            case 'n':
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3=='o') ) {
                    alt1=4;
                }
                else if ( (LA1_3=='a') ) {
                    alt1=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:45:13: 'ao'
                    {
                    match("ao"); 


                    }
                    break;
                case 2 :
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:45:20: 'aos'
                    {
                    match("aos"); 


                    }
                    break;
                case 3 :
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:45:28: 'de'
                    {
                    match("de"); 


                    }
                    break;
                case 4 :
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:45:35: 'no'
                    {
                    match("no"); 


                    }
                    break;
                case 5 :
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:45:42: 'na'
                    {
                    match("na"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PREPOSICAO"

    // $ANTLR start "SABADO"
    public final void mSABADO() throws RecognitionException {
        try {
            int _type = SABADO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:47:7: ( 'sabado' | 'sabados' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='s') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='a') ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2=='b') ) {
                        int LA2_3 = input.LA(4);

                        if ( (LA2_3=='a') ) {
                            int LA2_4 = input.LA(5);

                            if ( (LA2_4=='d') ) {
                                int LA2_5 = input.LA(6);

                                if ( (LA2_5=='o') ) {
                                    int LA2_6 = input.LA(7);

                                    if ( (LA2_6=='s') ) {
                                        alt2=2;
                                    }
                                    else {
                                        alt2=1;}
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 2, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:47:9: 'sabado'
                    {
                    match("sabado"); 


                    }
                    break;
                case 2 :
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:47:20: 'sabados'
                    {
                    match("sabados"); 

                    setText("sabado");

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SABADO"

    // $ANTLR start "NOTURNO"
    public final void mNOTURNO() throws RecognitionException {
        try {
            int _type = NOTURNO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:48:8: ( 'noturno' | 'noturnos' | 'noturna' | 'noturnas' )
            int alt3=4;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:48:10: 'noturno'
                    {
                    match("noturno"); 


                    }
                    break;
                case 2 :
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:48:22: 'noturnos'
                    {
                    match("noturnos"); 


                    }
                    break;
                case 3 :
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:48:35: 'noturna'
                    {
                    match("noturna"); 


                    }
                    break;
                case 4 :
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:48:47: 'noturnas'
                    {
                    match("noturnas"); 

                    setText("noturno");

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTURNO"

    // $ANTLR start "SALA"
    public final void mSALA() throws RecognitionException {
        try {
            int _type = SALA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:49:5: ( 'sala' )
            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:49:8: 'sala'
            {
            match("sala"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SALA"

    // $ANTLR start "DOUBLE_DIGIT"
    public final void mDOUBLE_DIGIT() throws RecognitionException {
        try {
            int _type = DOUBLE_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:51:13: ( DIGIT DIGIT )
            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:51:15: DIGIT DIGIT
            {
            mDIGIT(); 
            mDIGIT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE_DIGIT"

    // $ANTLR start "HYPHEN"
    public final void mHYPHEN() throws RecognitionException {
        try {
            int _type = HYPHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:52:7: ( '-' )
            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:52:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HYPHEN"

    // $ANTLR start "ABR"
    public final void mABR() throws RecognitionException {
        try {
            int _type = ABR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:53:4: ( 'fj' | 'FJ' | 'rr' | 'RR' | 'cs' | 'CS' | 'pm' | 'PM' | 'wd' | 'WD' )
            int alt4=10;
            switch ( input.LA(1) ) {
            case 'f':
                {
                alt4=1;
                }
                break;
            case 'F':
                {
                alt4=2;
                }
                break;
            case 'r':
                {
                alt4=3;
                }
                break;
            case 'R':
                {
                alt4=4;
                }
                break;
            case 'c':
                {
                alt4=5;
                }
                break;
            case 'C':
                {
                alt4=6;
                }
                break;
            case 'p':
                {
                alt4=7;
                }
                break;
            case 'P':
                {
                alt4=8;
                }
                break;
            case 'w':
                {
                alt4=9;
                }
                break;
            case 'W':
                {
                alt4=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:53:6: 'fj'
                    {
                    match("fj"); 


                    }
                    break;
                case 2 :
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:53:11: 'FJ'
                    {
                    match("FJ"); 


                    }
                    break;
                case 3 :
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:53:16: 'rr'
                    {
                    match("rr"); 


                    }
                    break;
                case 4 :
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:53:21: 'RR'
                    {
                    match("RR"); 


                    }
                    break;
                case 5 :
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:53:26: 'cs'
                    {
                    match("cs"); 


                    }
                    break;
                case 6 :
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:53:31: 'CS'
                    {
                    match("CS"); 


                    }
                    break;
                case 7 :
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:53:36: 'pm'
                    {
                    match("pm"); 


                    }
                    break;
                case 8 :
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:53:41: 'PM'
                    {
                    match("PM"); 


                    }
                    break;
                case 9 :
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:53:46: 'wd'
                    {
                    match("wd"); 


                    }
                    break;
                case 10 :
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:53:51: 'WD'
                    {
                    match("WD"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ABR"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:54:3: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+ )
            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:54:5: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+
            {
            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:54:5: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\t' && LA5_0<='\n')||(LA5_0>='\f' && LA5_0<='\r')||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            int _type = DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:56:6: ( '0' .. '9' )
            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:56:9: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    public void mTokens() throws RecognitionException {
        // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:1:8: ( PREPOSICAO | SABADO | NOTURNO | SALA | DOUBLE_DIGIT | HYPHEN | ABR | WS | DIGIT )
        int alt6=9;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:1:10: PREPOSICAO
                {
                mPREPOSICAO(); 

                }
                break;
            case 2 :
                // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:1:21: SABADO
                {
                mSABADO(); 

                }
                break;
            case 3 :
                // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:1:28: NOTURNO
                {
                mNOTURNO(); 

                }
                break;
            case 4 :
                // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:1:36: SALA
                {
                mSALA(); 

                }
                break;
            case 5 :
                // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:1:41: DOUBLE_DIGIT
                {
                mDOUBLE_DIGIT(); 

                }
                break;
            case 6 :
                // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:1:54: HYPHEN
                {
                mHYPHEN(); 

                }
                break;
            case 7 :
                // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:1:61: ABR
                {
                mABR(); 

                }
                break;
            case 8 :
                // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:1:65: WS
                {
                mWS(); 

                }
                break;
            case 9 :
                // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:1:68: DIGIT
                {
                mDIGIT(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA3_eotS =
        "\7\uffff\1\12\1\14\4\uffff";
    static final String DFA3_eofS =
        "\15\uffff";
    static final String DFA3_minS =
        "\1\156\1\157\1\164\1\165\1\162\1\156\1\141\2\163\4\uffff";
    static final String DFA3_maxS =
        "\1\156\1\157\1\164\1\165\1\162\1\156\1\157\2\163\4\uffff";
    static final String DFA3_acceptS =
        "\11\uffff\1\2\1\1\1\4\1\3";
    static final String DFA3_specialS =
        "\15\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\10\15\uffff\1\7",
            "\1\11",
            "\1\13",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "48:1: NOTURNO : ( 'noturno' | 'noturnos' | 'noturna' | 'noturnas' );";
        }
    }
    static final String DFA6_eotS =
        "\4\uffff\1\12\3\uffff\1\1\6\uffff";
    static final String DFA6_eofS =
        "\17\uffff";
    static final String DFA6_minS =
        "\1\11\1\uffff\2\141\1\60\3\uffff\1\164\1\142\5\uffff";
    static final String DFA6_maxS =
        "\1\167\1\uffff\1\157\1\141\1\71\3\uffff\1\164\1\154\5\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\3\uffff\1\6\1\7\1\10\2\uffff\1\11\1\5\1\3\1\2\1\4";
    static final String DFA6_specialS =
        "\17\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\7\1\uffff\2\7\22\uffff\1\7\14\uffff\1\5\2\uffff\12\4\11\uffff"+
            "\1\6\2\uffff\1\6\11\uffff\1\6\1\uffff\1\6\4\uffff\1\6\11\uffff"+
            "\1\1\1\uffff\1\6\1\1\1\uffff\1\6\7\uffff\1\2\1\uffff\1\6\1\uffff"+
            "\1\6\1\3\3\uffff\1\6",
            "",
            "\1\1\15\uffff\1\10",
            "\1\11",
            "\12\13",
            "",
            "",
            "",
            "\1\14",
            "\1\15\11\uffff\1\16",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( PREPOSICAO | SABADO | NOTURNO | SALA | DOUBLE_DIGIT | HYPHEN | ABR | WS | DIGIT );";
        }
    }
 

}