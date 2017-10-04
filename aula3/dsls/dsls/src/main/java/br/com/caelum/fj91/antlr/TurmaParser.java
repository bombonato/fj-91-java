// $ANTLR 3.2 Sep 23, 2009 12:02:23 /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g 2012-03-01 17:25:51

  package br.com.caelum.fj91.antlr; 


import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

import br.com.caelum.fj91.modelo.Periodo;
import br.com.caelum.fj91.modelo.Sala;
import br.com.caelum.fj91.modelo.Sigla;
import br.com.caelum.fj91.modelo.Turma;

public class TurmaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PREPOSICAO", "ABR", "HYPHEN", "DOUBLE_DIGIT", "NOTURNO", "SABADO", "SALA", "DIGIT", "WS"
    };
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


        public TurmaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public TurmaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return TurmaParser.tokenNames; }
    public String getGrammarFileName() { return "/files/workspaces/workspace-antlr/dsl_externo/src/Turma.g"; }


    public static class turma_return extends ParserRuleReturnScope {
        public Turma turma;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "turma"
    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:19:1: turma returns [Turma turma] : siglaExpr= sigla ( ( ( PREPOSICAO )? periodoExpr= periodo ( PREPOSICAO )? salaExpr= sala ) | ( ( PREPOSICAO )? salaExpr= sala ( PREPOSICAO )? periodoExpr= periodo ) ) EOF ;
    public final Turma toTurma() throws RecognitionException {
        TurmaParser.turma_return retval = new TurmaParser.turma_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PREPOSICAO1=null;
        Token PREPOSICAO2=null;
        Token PREPOSICAO3=null;
        Token PREPOSICAO4=null;
        Token EOF5=null;
        TurmaParser.sigla_return siglaExpr = null;

        TurmaParser.periodo_return periodoExpr = null;

        TurmaParser.sala_return salaExpr = null;


        Object PREPOSICAO1_tree=null;
        Object PREPOSICAO2_tree=null;
        Object PREPOSICAO3_tree=null;
        Object PREPOSICAO4_tree=null;
        Object EOF5_tree=null;

        try {
            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:21:2: (siglaExpr= sigla ( ( ( PREPOSICAO )? periodoExpr= periodo ( PREPOSICAO )? salaExpr= sala ) | ( ( PREPOSICAO )? salaExpr= sala ( PREPOSICAO )? periodoExpr= periodo ) ) EOF )
            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:21:4: siglaExpr= sigla ( ( ( PREPOSICAO )? periodoExpr= periodo ( PREPOSICAO )? salaExpr= sala ) | ( ( PREPOSICAO )? salaExpr= sala ( PREPOSICAO )? periodoExpr= periodo ) ) EOF
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sigla_in_turma64);
            siglaExpr=sigla();

            state._fsp--;

            adaptor.addChild(root_0, siglaExpr.getTree());
            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:21:20: ( ( ( PREPOSICAO )? periodoExpr= periodo ( PREPOSICAO )? salaExpr= sala ) | ( ( PREPOSICAO )? salaExpr= sala ( PREPOSICAO )? periodoExpr= periodo ) )
            int alt5=2;
            switch ( input.LA(1) ) {
            case PREPOSICAO:
                {
                int LA5_1 = input.LA(2);

                if ( ((LA5_1>=NOTURNO && LA5_1<=SABADO)) ) {
                    alt5=1;
                }
                else if ( ((LA5_1>=SALA && LA5_1<=DIGIT)) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case NOTURNO:
            case SABADO:
                {
                alt5=1;
                }
                break;
            case SALA:
            case DIGIT:
                {
                alt5=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:23:4: ( ( PREPOSICAO )? periodoExpr= periodo ( PREPOSICAO )? salaExpr= sala )
                    {
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:23:4: ( ( PREPOSICAO )? periodoExpr= periodo ( PREPOSICAO )? salaExpr= sala )
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:23:5: ( PREPOSICAO )? periodoExpr= periodo ( PREPOSICAO )? salaExpr= sala
                    {
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:23:15: ( PREPOSICAO )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==PREPOSICAO) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:23:15: PREPOSICAO
                            {
                            PREPOSICAO1=(Token)match(input,PREPOSICAO,FOLLOW_PREPOSICAO_in_turma76); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_periodo_in_turma82);
                    periodoExpr=periodo();

                    state._fsp--;

                    adaptor.addChild(root_0, periodoExpr.getTree());
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:23:48: ( PREPOSICAO )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==PREPOSICAO) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:23:48: PREPOSICAO
                            {
                            PREPOSICAO2=(Token)match(input,PREPOSICAO,FOLLOW_PREPOSICAO_in_turma84); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_sala_in_turma90);
                    salaExpr=sala();

                    state._fsp--;

                    adaptor.addChild(root_0, salaExpr.getTree());

                    }


                    }
                    break;
                case 2 :
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:25:4: ( ( PREPOSICAO )? salaExpr= sala ( PREPOSICAO )? periodoExpr= periodo )
                    {
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:25:4: ( ( PREPOSICAO )? salaExpr= sala ( PREPOSICAO )? periodoExpr= periodo )
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:25:5: ( PREPOSICAO )? salaExpr= sala ( PREPOSICAO )? periodoExpr= periodo
                    {
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:25:15: ( PREPOSICAO )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==PREPOSICAO) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:25:15: PREPOSICAO
                            {
                            PREPOSICAO3=(Token)match(input,PREPOSICAO,FOLLOW_PREPOSICAO_in_turma104); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_sala_in_turma110);
                    salaExpr=sala();

                    state._fsp--;

                    adaptor.addChild(root_0, salaExpr.getTree());
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:25:42: ( PREPOSICAO )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==PREPOSICAO) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:25:42: PREPOSICAO
                            {
                            PREPOSICAO4=(Token)match(input,PREPOSICAO,FOLLOW_PREPOSICAO_in_turma112); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_periodo_in_turma118);
                    periodoExpr=periodo();

                    state._fsp--;

                    adaptor.addChild(root_0, periodoExpr.getTree());

                    }


                    }
                    break;

            }

            EOF5=(Token)match(input,EOF,FOLLOW_EOF_in_turma128); 
            retval.turma = new Turma((siglaExpr!=null?siglaExpr.sigla:null),periodoExpr.periodo, salaExpr.sala);

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval.turma;
    }
    // $ANTLR end "turma"

    public static class sigla_return extends ParserRuleReturnScope {
        public Sigla sigla;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sigla"
    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:31:1: sigla returns [Sigla sigla] : ( ABR )? ( HYPHEN )? exp= DOUBLE_DIGIT ;
    public final TurmaParser.sigla_return sigla() throws RecognitionException {
        TurmaParser.sigla_return retval = new TurmaParser.sigla_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token exp=null;
        Token ABR6=null;
        Token HYPHEN7=null;

        Object exp_tree=null;
        Object ABR6_tree=null;
        Object HYPHEN7_tree=null;

        try {
            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:32:2: ( ( ABR )? ( HYPHEN )? exp= DOUBLE_DIGIT )
            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:32:4: ( ABR )? ( HYPHEN )? exp= DOUBLE_DIGIT
            {
            root_0 = (Object)adaptor.nil();

            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:32:7: ( ABR )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ABR) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:32:7: ABR
                    {
                    ABR6=(Token)match(input,ABR,FOLLOW_ABR_in_sigla156); 

                    }
                    break;

            }

            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:32:16: ( HYPHEN )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==HYPHEN) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:32:16: HYPHEN
                    {
                    HYPHEN7=(Token)match(input,HYPHEN,FOLLOW_HYPHEN_in_sigla160); 

                    }
                    break;

            }

            exp=(Token)match(input,DOUBLE_DIGIT,FOLLOW_DOUBLE_DIGIT_in_sigla166); 
            exp_tree = (Object)adaptor.create(exp);
            adaptor.addChild(root_0, exp_tree);

            retval.sigla = new Sigla(Integer.valueOf((exp!=null?exp.getText():null)));

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sigla"

    public static class periodo_return extends ParserRuleReturnScope {
        public Periodo periodo;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "periodo"
    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:35:1: periodo returns [Periodo periodo] : (exp= NOTURNO | exp= SABADO );
    public final TurmaParser.periodo_return periodo() throws RecognitionException {
        TurmaParser.periodo_return retval = new TurmaParser.periodo_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token exp=null;

        Object exp_tree=null;

        try {
            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:36:2: (exp= NOTURNO | exp= SABADO )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==NOTURNO) ) {
                alt8=1;
            }
            else if ( (LA8_0==SABADO) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:36:4: exp= NOTURNO
                    {
                    root_0 = (Object)adaptor.nil();

                    exp=(Token)match(input,NOTURNO,FOLLOW_NOTURNO_in_periodo185); 
                    exp_tree = (Object)adaptor.create(exp);
                    adaptor.addChild(root_0, exp_tree);

                    retval.periodo = new Periodo((exp!=null?exp.getText():null));

                    }
                    break;
                case 2 :
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:36:54: exp= SABADO
                    {
                    root_0 = (Object)adaptor.nil();

                    exp=(Token)match(input,SABADO,FOLLOW_SABADO_in_periodo192); 
                    exp_tree = (Object)adaptor.create(exp);
                    adaptor.addChild(root_0, exp_tree);

                    retval.periodo = new Periodo((exp!=null?exp.getText():null));

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "periodo"

    public static class sala_return extends ParserRuleReturnScope {
        public Sala sala;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sala"
    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:39:1: sala returns [Sala sala] : ( SALA )? exp= DIGIT ;
    public final TurmaParser.sala_return sala() throws RecognitionException {
        TurmaParser.sala_return retval = new TurmaParser.sala_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token exp=null;
        Token SALA8=null;

        Object exp_tree=null;
        Object SALA8_tree=null;

        try {
            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:40:2: ( ( SALA )? exp= DIGIT )
            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:40:4: ( SALA )? exp= DIGIT
            {
            root_0 = (Object)adaptor.nil();

            // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:40:4: ( SALA )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==SALA) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /files/workspaces/workspace-antlr/dsl_externo/src/Turma.g:40:4: SALA
                    {
                    SALA8=(Token)match(input,SALA,FOLLOW_SALA_in_sala212); 
                    SALA8_tree = (Object)adaptor.create(SALA8);
                    adaptor.addChild(root_0, SALA8_tree);


                    }
                    break;

            }

            exp=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_sala217); 
            exp_tree = (Object)adaptor.create(exp);
            adaptor.addChild(root_0, exp_tree);

            retval.sala = new Sala(Integer.valueOf((exp!=null?exp.getText():null)));

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sala"

    // Delegated rules


 

    public static final BitSet FOLLOW_sigla_in_turma64 = new BitSet(new long[]{0x0000000000000F10L});
    public static final BitSet FOLLOW_PREPOSICAO_in_turma76 = new BitSet(new long[]{0x0000000000000310L});
    public static final BitSet FOLLOW_periodo_in_turma82 = new BitSet(new long[]{0x0000000000000F10L});
    public static final BitSet FOLLOW_PREPOSICAO_in_turma84 = new BitSet(new long[]{0x0000000000000F10L});
    public static final BitSet FOLLOW_sala_in_turma90 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_PREPOSICAO_in_turma104 = new BitSet(new long[]{0x0000000000000F10L});
    public static final BitSet FOLLOW_sala_in_turma110 = new BitSet(new long[]{0x0000000000000310L});
    public static final BitSet FOLLOW_PREPOSICAO_in_turma112 = new BitSet(new long[]{0x0000000000000310L});
    public static final BitSet FOLLOW_periodo_in_turma118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_turma128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABR_in_sigla156 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_HYPHEN_in_sigla160 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DOUBLE_DIGIT_in_sigla166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTURNO_in_periodo185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SABADO_in_periodo192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SALA_in_sala212 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DIGIT_in_sala217 = new BitSet(new long[]{0x0000000000000002L});

}