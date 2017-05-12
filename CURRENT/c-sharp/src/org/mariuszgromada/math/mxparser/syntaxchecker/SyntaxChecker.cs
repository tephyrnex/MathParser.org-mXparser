/* Generated By: CSCC: 4.0 (03/25/2012)  Do not edit this line. SyntaxChecker.cs */
namespace org.mariuszgromada.math.mxparser.syntaxchecker{



using System;
using System.IO;

public class SyntaxChecker : SyntaxCheckerConstants {

        public void checkSyntax() {
                start();
        }

/*
 * Lexer logic - grammar
 */
  public void start() {
    switch ((jj_ntk==-1)?jj_init_ntk():jj_ntk) {
    case LEFT_PAR:
    case PLUS:
    case MINUS:
    case UNIT:
    case NOT:
    case BITNOT:
    case NUMBER_CONSTANT:
    case IDENTIFIER:
    case FUNCTION:
    case 46:
      expression();
      jj_consume_token(0);
      break;
    case 0:
      jj_consume_token(0);
      break;
    default:
      jj_la1[0] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
		#if !PCL && !CORE && !NETSTANDARD && !ANDROID && !IOS
			break;
		#endif      
    }
  }

/*
 * Grammar for expression
 */
  public void expression() {
    binaryExpression();
  }

/*
 * Grammar for binary operators
 */
  public void binaryExpression() {
    unaryRigthExpression();
    while (true) {
      switch ((jj_ntk==-1)?jj_init_ntk():jj_ntk) {
      case PLUS:
      case MINUS:
      case MULTIPLY:
      case DIV:
      case POWER:
      case MODULO:
      case EQ:
      case NEQ:
      case LT:
      case LEQ:
      case GT:
      case GEQ:
      case OR:
      case AND:
      case IMP:
      case CIMP:
      case NIMP:
      case CNIMP:
      case NAND:
      case EQV:
      case NOR:
      case BITWISE:
      case XOR:
        ;
        break;
      default:
        jj_la1[1] = jj_gen;
        goto label_1;
		#if !PCL && !CORE && !NETSTANDARD && !ANDROID && !IOS
			break;
		#endif        
      }
      switch ((jj_ntk==-1)?jj_init_ntk():jj_ntk) {
      case PLUS:
        jj_consume_token(PLUS);
        unaryRigthExpression();
        break;
      case MINUS:
        jj_consume_token(MINUS);
        unaryRigthExpression();
        break;
      case MULTIPLY:
        jj_consume_token(MULTIPLY);
        unaryRigthExpression();
        break;
      case DIV:
        jj_consume_token(DIV);
        unaryRigthExpression();
        break;
      case MODULO:
        jj_consume_token(MODULO);
        unaryRigthExpression();
        break;
      case POWER:
        jj_consume_token(POWER);
        unaryRigthExpression();
        break;
      case EQ:
        jj_consume_token(EQ);
        unaryRigthExpression();
        break;
      case NEQ:
        jj_consume_token(NEQ);
        unaryRigthExpression();
        break;
      case GT:
        jj_consume_token(GT);
        unaryRigthExpression();
        break;
      case GEQ:
        jj_consume_token(GEQ);
        unaryRigthExpression();
        break;
      case LT:
        jj_consume_token(LT);
        unaryRigthExpression();
        break;
      case LEQ:
        jj_consume_token(LEQ);
        unaryRigthExpression();
        break;
      case OR:
        jj_consume_token(OR);
        unaryRigthExpression();
        break;
      case AND:
        jj_consume_token(AND);
        unaryRigthExpression();
        break;
      case NOR:
        jj_consume_token(NOR);
        unaryRigthExpression();
        break;
      case NAND:
        jj_consume_token(NAND);
        unaryRigthExpression();
        break;
      case XOR:
        jj_consume_token(XOR);
        unaryRigthExpression();
        break;
      case IMP:
        jj_consume_token(IMP);
        unaryRigthExpression();
        break;
      case CIMP:
        jj_consume_token(CIMP);
        unaryRigthExpression();
        break;
      case NIMP:
        jj_consume_token(NIMP);
        unaryRigthExpression();
        break;
      case CNIMP:
        jj_consume_token(CNIMP);
        unaryRigthExpression();
        break;
      case EQV:
        jj_consume_token(EQV);
        unaryRigthExpression();
        break;
      case BITWISE:
        jj_consume_token(BITWISE);
        unaryRigthExpression();
        break;
      default:
        jj_la1[2] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
		#if !PCL && !CORE && !NETSTANDARD && !ANDROID && !IOS
			break;
		#endif        
      }
    }
    label_1: ;
    
  }

/*
 * Grammar for unary rigth operators
 */
  public void unaryRigthExpression() {
    unaryLeftExpression();
    switch ((jj_ntk==-1)?jj_init_ntk():jj_ntk) {
    case FACTORIAL:
      jj_consume_token(FACTORIAL);
      break;
    default:
      jj_la1[3] = jj_gen;
      ;break;
      
    }
  }

/*
 * Grammar for unary left operators
 */
  public void unaryLeftExpression() {
    switch ((jj_ntk==-1)?jj_init_ntk():jj_ntk) {
    case NOT:
    case BITNOT:
      switch ((jj_ntk==-1)?jj_init_ntk():jj_ntk) {
      case NOT:
        jj_consume_token(NOT);
        break;
      case BITNOT:
        jj_consume_token(BITNOT);
        break;
      default:
        jj_la1[4] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
		#if !PCL && !CORE && !NETSTANDARD && !ANDROID && !IOS
			break;
		#endif        
      }
      break;
    default:
      jj_la1[5] = jj_gen;
      ;break;
      
    }
    itemExpression();
  }

/*
 * Grammar for items
 */
  public void itemExpression() {
    switch ((jj_ntk==-1)?jj_init_ntk():jj_ntk) {
    case PLUS:
    case MINUS:
      switch ((jj_ntk==-1)?jj_init_ntk():jj_ntk) {
      case PLUS:
        jj_consume_token(PLUS);
        break;
      case MINUS:
        jj_consume_token(MINUS);
        break;
      default:
        jj_la1[6] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
		#if !PCL && !CORE && !NETSTANDARD && !ANDROID && !IOS
			break;
		#endif        
      }
      break;
    default:
      jj_la1[7] = jj_gen;
      ;break;
      
    }
    switch ((jj_ntk==-1)?jj_init_ntk():jj_ntk) {
    case NUMBER_CONSTANT:
      jj_consume_token(NUMBER_CONSTANT);
      break;
    case UNIT:
    case IDENTIFIER:
    case FUNCTION:
    case 46:
      switch ((jj_ntk==-1)?jj_init_ntk():jj_ntk) {
      case UNIT:
      case IDENTIFIER:
      case 46:
        identifierGr();
        break;
      case FUNCTION:
        jj_consume_token(FUNCTION);
        break;
      default:
        jj_la1[8] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
		#if !PCL && !CORE && !NETSTANDARD && !ANDROID && !IOS
			break;
		#endif        
      }
      switch ((jj_ntk==-1)?jj_init_ntk():jj_ntk) {
      case LEFT_PAR:
        jj_consume_token(LEFT_PAR);
        argumentList();
        jj_consume_token(RIGHT_PAR);
        break;
      default:
        jj_la1[9] = jj_gen;
        ;break;
        
      }
      break;
    case LEFT_PAR:
      jj_consume_token(LEFT_PAR);
      expression();
      jj_consume_token(RIGHT_PAR);
      break;
    default:
      jj_la1[10] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
		#if !PCL && !CORE && !NETSTANDARD && !ANDROID && !IOS
			break;
		#endif      
    }
  }

/*
 * Grammar for arguments list
 */
  public void argumentList() {
    switch ((jj_ntk==-1)?jj_init_ntk():jj_ntk) {
    case LEFT_PAR:
    case PLUS:
    case MINUS:
    case UNIT:
    case NOT:
    case BITNOT:
    case NUMBER_CONSTANT:
    case IDENTIFIER:
    case FUNCTION:
    case 46:
      expression();
      while (true) {
        switch ((jj_ntk==-1)?jj_init_ntk():jj_ntk) {
        case COMMA:
        case SEMICOLON:
          ;
          break;
        default:
          jj_la1[11] = jj_gen;
          goto label_2;
		#if !PCL && !CORE && !NETSTANDARD && !ANDROID && !IOS
			break;
		#endif          
        }
        switch ((jj_ntk==-1)?jj_init_ntk():jj_ntk) {
        case COMMA:
          jj_consume_token(COMMA);
          break;
        case SEMICOLON:
          jj_consume_token(SEMICOLON);
          break;
        default:
          jj_la1[12] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
		#if !PCL && !CORE && !NETSTANDARD && !ANDROID && !IOS
			break;
		#endif          
        }
        expression();
      }
      label_2: ;
      
      break;
    default:
      jj_la1[13] = jj_gen;
      ;break;
      
    }
  }

/*
 * Grammar for identifiers
 */
  public void identifierGr() {
    switch ((jj_ntk==-1)?jj_init_ntk():jj_ntk) {
    case IDENTIFIER:
      jj_consume_token(IDENTIFIER);
      break;
    case UNIT:
      jj_consume_token(UNIT);
      break;
    case 46:
      jj_consume_token(46);
      while (true) {
        switch ((jj_ntk==-1)?jj_init_ntk():jj_ntk) {
        case CHAR:
          jj_consume_token(CHAR);
          break;
        case IDENTIFIER:
          jj_consume_token(IDENTIFIER);
          while (true) {
            switch ((jj_ntk==-1)?jj_init_ntk():jj_ntk) {
            case LEFT_PAR:
            case RIGHT_PAR:
            case PLUS:
            case MINUS:
            case MULTIPLY:
            case DIV:
            case POWER:
            case MODULO:
            case COMMA:
            case LT:
            case GT:
            case OR:
            case AND:
            case NOT:
            case NUMBER_CONSTANT:
              ;
              break;
            default:
              jj_la1[14] = jj_gen;
              goto label_4;
				#if !PCL && !CORE && !NETSTANDARD && !ANDROID && !IOS
					break;
				#endif              
            }
            switch ((jj_ntk==-1)?jj_init_ntk():jj_ntk) {
            case NOT:
              jj_consume_token(NOT);
              break;
            case MODULO:
              jj_consume_token(MODULO);
              break;
            case POWER:
              jj_consume_token(POWER);
              break;
            case AND:
              jj_consume_token(AND);
              break;
            case MULTIPLY:
              jj_consume_token(MULTIPLY);
              break;
            case DIV:
              jj_consume_token(DIV);
              break;
            case LEFT_PAR:
              jj_consume_token(LEFT_PAR);
              break;
            case RIGHT_PAR:
              jj_consume_token(RIGHT_PAR);
              break;
            case MINUS:
              jj_consume_token(MINUS);
              break;
            case PLUS:
              jj_consume_token(PLUS);
              break;
            case COMMA:
              jj_consume_token(COMMA);
              break;
            case OR:
              jj_consume_token(OR);
              break;
            case GT:
              jj_consume_token(GT);
              break;
            case LT:
              jj_consume_token(LT);
              break;
            case NUMBER_CONSTANT:
              jj_consume_token(NUMBER_CONSTANT);
              break;
            default:
              jj_la1[15] = jj_gen;
              jj_consume_token(-1);
              throw new ParseException();
			#if !PCL && !CORE && !NETSTANDARD && !ANDROID && !IOS
				break;
			#endif              
            }
          }
          label_4: ;
          
          break;
        default:
          jj_la1[16] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
		#if !PCL && !CORE && !NETSTANDARD && !ANDROID && !IOS
			break;
		#endif  
        }
        switch ((jj_ntk==-1)?jj_init_ntk():jj_ntk) {
        case CHAR:
        case IDENTIFIER:
          ;
          break;
        default:
          jj_la1[17] = jj_gen;
          goto label_3;
		#if !PCL && !CORE && !NETSTANDARD && !ANDROID && !IOS
			break;
		#endif  
        }
      }
      label_3: ;
      
      jj_consume_token(47);
      break;
    default:
      jj_la1[18] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
		#if !PCL && !CORE && !NETSTANDARD && !ANDROID && !IOS
			break;
		#endif  
    }
  }

  public SyntaxCheckerTokenManager token_source;
  SimpleCharStream jj_input_stream;
  public Token token, jj_nt;
  private long jj_ntk;
  private long jj_gen;
  private long[] jj_la1 = new long[19];
  static private long[] jj_la1_0;
  static private long[] jj_la1_1;
  static SyntaxChecker(){
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new long[] {0x60201a01,0x9fd1f800,0x9fd1f800,0x20000,0x60000000,0x60000000,0x1800,0x1800,0x200000,0x200,0x200200,0xc0000,0xc0000,0x60201a00,0x3a85fe00,0x3a85fe00,0x0,0x0,0x200000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new long[] {0x7800,0xff,0xff,0x0,0x0,0x0,0x0,0x0,0x7000,0x0,0x7800,0x0,0x0,0x7800,0x800,0x800,0x1100,0x1100,0x5000,};
   }

  public SyntaxChecker(System.IO.Stream stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new SyntaxCheckerTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  public void ReInit(System.IO.Stream stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  public SyntaxChecker(System.IO.TextReader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new SyntaxCheckerTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  public void ReInit(System.IO.TextReader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  public SyntaxChecker(SyntaxCheckerTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  public void ReInit(SyntaxCheckerTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind){
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

  public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private long jj_init_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private System.Collections.Generic.List<long[]> jj_expentries = new System.Collections.Generic.List<long[]>();
  private long[] jj_expentry;
  private long jj_kind = -1;

  public ParseException generateParseException() {
    jj_expentries.Clear();
    bool[] la1tokens = new bool[50];
    for (int i = 0; i < 50; i++) {
      la1tokens[i] = false;
    }
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 19; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 50; i++) {
      if (la1tokens[i]) {
        jj_expentry = new long[1];
        jj_expentry[0] = i;
        jj_expentries.Add(jj_expentry);
      }
    }
    long[][] exptokseq = new long[jj_expentries.Count][];
    for (int i = 0; i < jj_expentries.Count; i++) {
      exptokseq[i] = (long[])jj_expentries[i];
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  public void enable_tracing() {
  }

  public void disable_tracing() {
  }

}
}

