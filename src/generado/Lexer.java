/* The following code was generated by JFlex 1.3.5 on 5/17/18 6:38 PM */

package generado; // paquete en el que se genera el fichero java
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;
import java.lang.*;
import java.io.InputStreamReader;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.3.5
 * on 5/17/18 6:38 PM from the specification file
 * <tt>file:/C:/Users/eldgb/git/PDL_Practica3/lexer.jflex</tt>
 */
public class Lexer implements sym, java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  final public static int YYEOF = -1;

  /** initial size of the lookahead buffer */
  final private static int YY_BUFFERSIZE = 16384;

  /** lexical states */
  final public static int CODESEG = 1;
  final public static int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  final private static String yycmap_packed = 
    "\11\0\1\1\1\3\1\0\1\1\1\2\22\0\1\1\1\54\3\0"+
    "\1\40\1\42\1\30\1\56\1\57\1\51\1\47\1\46\1\37\1\33"+
    "\1\55\1\34\7\32\2\31\1\0\1\45\1\52\1\44\1\53\2\0"+
    "\1\11\1\21\1\16\1\23\1\36\1\10\2\24\1\17\2\24\1\12"+
    "\1\20\1\14\1\15\2\24\1\5\1\13\1\4\1\6\1\22\1\24"+
    "\1\35\2\24\1\60\1\0\1\61\1\0\1\25\1\0\1\11\1\21"+
    "\1\16\1\23\1\7\1\10\2\24\1\17\2\24\1\12\1\20\1\14"+
    "\1\15\2\24\1\5\1\13\1\4\1\6\1\22\1\24\1\35\2\24"+
    "\1\62\1\43\1\63\56\0\1\41\u1f66\0\1\50\4\0\1\26\1\27"+
    "\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  final private static char [] yycmap = yy_unpack_cmap(yycmap_packed);

  /** 
   * Translates a state to a row index in the transition table
   */
  final private static int yy_rowMap [] = { 
        0,    52,   104,   104,   156,   208,   260,   312,   364,   416, 
      468,   520,   572,   624,   676,   728,   780,   832,   884,   936, 
      988,  1040,  1092,  1144,  1196,   104,   104,   104,  1248,   104, 
      104,   104,   104,   104,  1300,  1352,  1404,   104,   104,   104, 
      104,   104,   104,   104,  1456,  1508,  1560,  1612,  1664,  1716, 
     1768,  1820,   312,  1872,  1924,  1976,  2028,  2080,  2132,  2184, 
     2236,  2288,   104,  2340,   104,   104,   104,   104,   104,  2392, 
     2444,  2496,  2548,  2600,   312,  2652,   312,  2704,  2756,  2808, 
     2860,   104,  2912,  2964,  3016,   312,   312,  3068,  3120,  3172, 
     3224,  3276,   312,  3328,  3380,  3432,  3484,  3536,  3588,  3640, 
      312,   312,  3692,  3744,  3796,  3848,  3900,   312,  3952,  4004, 
     4056,  4108,  4160,   312,  4212,  4264,  4316,  4368,  4420,   312, 
     4472,   312,   312,   312,  4524,  4576,   312
  };

  /** 
   * The packed transition table of the DFA (part 0)
   */
  final private static String yy_packed0 = 
    "\1\3\1\4\1\5\1\4\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\10\1\14\1\15\1\16\1\17\1\10"+
    "\1\20\1\21\1\22\2\10\1\3\1\23\1\3\1\24"+
    "\2\25\1\26\1\27\1\10\1\11\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52"+
    "\1\53\1\54\64\3\67\0\1\4\64\0\1\10\1\55"+
    "\20\10\3\0\2\10\1\0\3\10\31\0\3\10\1\56"+
    "\16\10\3\0\2\10\1\0\2\10\1\56\31\0\22\10"+
    "\3\0\2\10\1\0\3\10\31\0\10\10\1\57\11\10"+
    "\3\0\2\10\1\0\3\10\31\0\5\10\1\60\5\10"+
    "\1\61\6\10\3\0\2\10\1\0\3\10\31\0\10\10"+
    "\1\62\11\10\3\0\2\10\1\0\3\10\31\0\13\10"+
    "\1\63\6\10\3\0\2\10\1\0\3\10\31\0\11\10"+
    "\1\64\10\10\3\0\2\10\1\0\3\10\31\0\1\10"+
    "\1\65\20\10\3\0\2\10\1\0\3\10\31\0\5\10"+
    "\1\66\14\10\3\0\2\10\1\0\3\10\31\0\13\10"+
    "\1\67\6\10\3\0\2\10\1\0\3\10\31\0\11\10"+
    "\1\70\10\10\3\0\2\10\1\0\3\10\31\0\3\10"+
    "\1\71\16\10\3\0\2\10\1\0\2\10\1\71\25\0"+
    "\2\72\2\0\60\72\2\73\2\0\60\73\31\0\2\74"+
    "\1\75\1\74\60\0\2\26\1\0\1\26\60\0\2\74"+
    "\1\75\1\74\1\76\101\0\1\77\50\0\1\100\67\0"+
    "\1\101\56\0\1\102\4\0\1\103\63\0\1\104\63\0"+
    "\1\105\23\0\2\10\1\106\17\10\3\0\2\10\1\0"+
    "\3\10\31\0\5\10\1\107\14\10\3\0\2\10\1\0"+
    "\3\10\31\0\1\110\21\10\3\0\2\10\1\0\3\10"+
    "\31\0\6\10\1\111\13\10\3\0\2\10\1\0\3\10"+
    "\31\0\10\10\1\112\11\10\3\0\2\10\1\0\3\10"+
    "\31\0\17\10\1\113\2\10\3\0\2\10\1\0\3\10"+
    "\31\0\10\10\1\114\11\10\3\0\2\10\1\0\3\10"+
    "\31\0\1\115\21\10\3\0\2\10\1\0\3\10\31\0"+
    "\1\10\1\116\20\10\3\0\2\10\1\0\3\10\31\0"+
    "\3\10\1\117\16\10\3\0\2\10\1\0\2\10\1\117"+
    "\31\0\11\10\1\120\10\10\3\0\2\10\1\0\3\10"+
    "\31\0\12\10\1\121\7\10\3\0\2\10\1\0\3\10"+
    "\54\0\1\122\64\0\1\122\64\0\2\74\1\26\1\74"+
    "\60\0\2\75\1\0\1\75\1\0\1\123\34\0\3\124"+
    "\4\0\1\124\2\0\1\124\1\0\1\124\5\0\2\124"+
    "\1\0\1\125\1\0\1\124\25\0\2\100\1\5\1\4"+
    "\60\100\4\0\3\10\1\126\16\10\3\0\2\10\1\0"+
    "\2\10\1\126\31\0\6\10\1\127\13\10\3\0\2\10"+
    "\1\0\3\10\31\0\3\10\1\130\5\10\1\131\10\10"+
    "\3\0\2\10\1\0\2\10\1\130\31\0\7\10\1\132"+
    "\12\10\3\0\2\10\1\0\3\10\31\0\7\10\1\133"+
    "\4\10\1\134\5\10\3\0\2\10\1\0\3\10\31\0"+
    "\11\10\1\135\10\10\3\0\2\10\1\0\3\10\31\0"+
    "\5\10\1\136\14\10\3\0\2\10\1\0\3\10\31\0"+
    "\10\10\1\137\11\10\3\0\2\10\1\0\3\10\31\0"+
    "\6\10\1\140\13\10\3\0\2\10\1\0\3\10\31\0"+
    "\1\141\21\10\3\0\2\10\1\0\3\10\56\0\2\142"+
    "\1\0\1\142\2\0\1\142\7\0\1\142\23\0\3\124"+
    "\4\0\1\124\2\0\1\124\1\0\1\124\5\0\2\124"+
    "\1\0\1\124\1\0\1\124\57\0\1\125\1\0\1\125"+
    "\33\0\1\10\1\143\20\10\3\0\2\10\1\0\3\10"+
    "\31\0\10\10\1\144\11\10\3\0\2\10\1\0\3\10"+
    "\31\0\3\10\1\145\16\10\3\0\2\10\1\0\2\10"+
    "\1\145\31\0\13\10\1\146\6\10\3\0\2\10\1\0"+
    "\3\10\31\0\13\10\1\147\6\10\3\0\2\10\1\0"+
    "\3\10\31\0\12\10\1\150\7\10\3\0\2\10\1\0"+
    "\3\10\31\0\1\151\21\10\3\0\2\10\1\0\3\10"+
    "\31\0\3\10\1\152\16\10\3\0\2\10\1\0\2\10"+
    "\1\152\31\0\11\10\1\153\10\10\3\0\2\10\1\0"+
    "\3\10\56\0\2\142\1\0\1\142\33\0\11\10\1\154"+
    "\10\10\3\0\2\10\1\0\3\10\31\0\12\10\1\155"+
    "\7\10\3\0\2\10\1\0\3\10\31\0\3\10\1\156"+
    "\16\10\3\0\2\10\1\0\2\10\1\156\31\0\1\157"+
    "\21\10\3\0\2\10\1\0\3\10\31\0\1\10\1\160"+
    "\20\10\3\0\2\10\1\0\3\10\31\0\5\10\1\161"+
    "\14\10\3\0\2\10\1\0\3\10\31\0\1\10\1\162"+
    "\20\10\3\0\2\10\1\0\3\10\31\0\3\10\1\163"+
    "\16\10\3\0\2\10\1\0\2\10\1\163\31\0\10\10"+
    "\1\164\11\10\3\0\2\10\1\0\3\10\31\0\3\10"+
    "\1\165\16\10\3\0\2\10\1\0\2\10\1\165\31\0"+
    "\5\10\1\166\14\10\3\0\2\10\1\0\3\10\31\0"+
    "\10\10\1\167\11\10\3\0\2\10\1\0\3\10\31\0"+
    "\7\10\1\170\12\10\3\0\2\10\1\0\3\10\31\0"+
    "\1\171\21\10\3\0\2\10\1\0\3\10\31\0\1\10"+
    "\1\172\20\10\3\0\2\10\1\0\3\10\31\0\7\10"+
    "\1\173\12\10\3\0\2\10\1\0\3\10\31\0\11\10"+
    "\1\174\10\10\3\0\2\10\1\0\3\10\31\0\1\10"+
    "\1\175\20\10\3\0\2\10\1\0\3\10\31\0\5\10"+
    "\1\176\14\10\3\0\2\10\1\0\3\10\31\0\7\10"+
    "\1\177\12\10\3\0\2\10\1\0\3\10\25\0";

  /** 
   * The transition table of the DFA
   */
  final private static int yytrans [] = yy_unpack();


  /* error codes */
  final private static int YY_UNKNOWN_ERROR = 0;
  final private static int YY_ILLEGAL_STATE = 1;
  final private static int YY_NO_MATCH = 2;
  final private static int YY_PUSHBACK_2BIG = 3;

  /* error messages for the codes above */
  final private static String YY_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Internal error: unknown state",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * YY_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private final static byte YY_ATTRIBUTE[] = {
     1,  0,  9,  9,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  9,  9,  9,  1,  9,  9,  9, 
     9,  9,  1,  1,  1,  9,  9,  9,  9,  9,  9,  9,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  0,  0,  1,  1,  0,  9,  1, 
     9,  9,  9,  9,  9,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  9,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1
  };

  /** the input device */
  private java.io.Reader yy_reader;

  /** the current state of the DFA */
  private int yy_state;

  /** the current lexical state */
  private int yy_lexical_state = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char yy_buffer[] = new char[YY_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int yy_markedPos;

  /** the textposition at the last state to be included in yytext */
  private int yy_pushbackPos;

  /** the current text position in the buffer */
  private int yy_currentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int yy_startRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int yy_endRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn; 

  /** 
   * yy_atBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean yy_atBOL = true;

  /** yy_atEOF == true <=> the scanner is at the EOF */
  private boolean yy_atEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean yy_eof_done;

  /* user code: */
	

    public Lexer(ComplexSymbolFactory sf, java.io.InputStream is){
		this(is);
        symbolFactory = sf;
    }
	public Lexer(ComplexSymbolFactory sf, java.io.Reader reader){
		this(reader);
        symbolFactory = sf;
    }
    
    private StringBuffer sb;
    private ComplexSymbolFactory symbolFactory;
    private int csline,cscolumn;

    public Symbol symbol(String name, int code){
		return symbolFactory.newSymbol(name, code,
						new Location(yyline+1,yycolumn+1, yychar), // -yylength()
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength())
				);
    }
    public Symbol symbol(String name, int code, String lexem){
	return symbolFactory.newSymbol(name, code, 
						new Location(yyline+1, yycolumn +1, yychar), 
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength()), lexem);
    }
    
    protected void emit_warning(String message){
    	System.out.println("scanner warning: " + message + " at : 2 "+ 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }
    
    protected void emit_error(String message){
    	System.out.println("scanner error: " + message + " at : 2" + 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.yy_reader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the split, compressed DFA transition table.
   *
   * @return the unpacked transition table
   */
  private static int [] yy_unpack() {
    int [] trans = new int[4628];
    int offset = 0;
    offset = yy_unpack(yy_packed0, offset, trans);
    return trans;
  }

  /** 
   * Unpacks the compressed DFA transition table.
   *
   * @param packed   the packed transition table
   * @return         the index of the last entry
   */
  private static int yy_unpack(String packed, int offset, int [] trans) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do trans[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] yy_unpack_cmap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 182) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   IOException  if any I/O-Error occurs
   */
  private boolean yy_refill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (yy_startRead > 0) {
      System.arraycopy(yy_buffer, yy_startRead, 
                       yy_buffer, 0, 
                       yy_endRead-yy_startRead);

      /* translate stored positions */
      yy_endRead-= yy_startRead;
      yy_currentPos-= yy_startRead;
      yy_markedPos-= yy_startRead;
      yy_pushbackPos-= yy_startRead;
      yy_startRead = 0;
    }

    /* is the buffer big enough? */
    if (yy_currentPos >= yy_buffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[yy_currentPos*2];
      System.arraycopy(yy_buffer, 0, newBuffer, 0, yy_buffer.length);
      yy_buffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = yy_reader.read(yy_buffer, yy_endRead, 
                                            yy_buffer.length-yy_endRead);

    if (numRead < 0) {
      return true;
    }
    else {
      yy_endRead+= numRead;  
      return false;
    }
  }


  /**
   * Closes the input stream.
   */
  final public void yyclose() throws java.io.IOException {
    yy_atEOF = true;            /* indicate end of file */
    yy_endRead = yy_startRead;  /* invalidate buffer    */

    if (yy_reader != null)
      yy_reader.close();
  }


  /**
   * Closes the current stream, and resets the
   * scanner to read from a new input stream.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>YY_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  final public void yyreset(java.io.Reader reader) throws java.io.IOException {
    yyclose();
    yy_reader = reader;
    yy_atBOL  = true;
    yy_atEOF  = false;
    yy_endRead = yy_startRead = 0;
    yy_currentPos = yy_markedPos = yy_pushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    yy_lexical_state = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  final public int yystate() {
    return yy_lexical_state;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  final public void yybegin(int newState) {
    yy_lexical_state = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  final public String yytext() {
    return new String( yy_buffer, yy_startRead, yy_markedPos-yy_startRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  final public char yycharat(int pos) {
    return yy_buffer[yy_startRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  final public int yylength() {
    return yy_markedPos-yy_startRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void yy_ScanError(int errorCode) {
    String message;
    try {
      message = YY_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = YY_ERROR_MSG[YY_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  private void yypushback(int number)  {
    if ( number > yylength() )
      yy_ScanError(YY_PUSHBACK_2BIG);

    yy_markedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void yy_do_eof() throws java.io.IOException {
    if (!yy_eof_done) {
      yy_eof_done = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int yy_input;
    int yy_action;

    // cached fields:
    int yy_currentPos_l;
    int yy_startRead_l;
    int yy_markedPos_l;
    int yy_endRead_l = yy_endRead;
    char [] yy_buffer_l = yy_buffer;
    char [] yycmap_l = yycmap;

    int [] yytrans_l = yytrans;
    int [] yy_rowMap_l = yy_rowMap;
    byte [] yy_attr_l = YY_ATTRIBUTE;

    while (true) {
      yy_markedPos_l = yy_markedPos;

      yychar+= yy_markedPos_l-yy_startRead;

      boolean yy_r = false;
      for (yy_currentPos_l = yy_startRead; yy_currentPos_l < yy_markedPos_l;
                                                             yy_currentPos_l++) {
        switch (yy_buffer_l[yy_currentPos_l]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          yy_r = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          yy_r = true;
          break;
        case '\n':
          if (yy_r)
            yy_r = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          yy_r = false;
          yycolumn++;
        }
      }

      if (yy_r) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean yy_peek;
        if (yy_markedPos_l < yy_endRead_l)
          yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        else if (yy_atEOF)
          yy_peek = false;
        else {
          boolean eof = yy_refill();
          yy_markedPos_l = yy_markedPos;
          yy_buffer_l = yy_buffer;
          if (eof) 
            yy_peek = false;
          else 
            yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        }
        if (yy_peek) yyline--;
      }
      yy_action = -1;

      yy_startRead_l = yy_currentPos_l = yy_currentPos = 
                       yy_startRead = yy_markedPos_l;

      yy_state = yy_lexical_state;


      yy_forAction: {
        while (true) {

          if (yy_currentPos_l < yy_endRead_l)
            yy_input = yy_buffer_l[yy_currentPos_l++];
          else if (yy_atEOF) {
            yy_input = YYEOF;
            break yy_forAction;
          }
          else {
            // store back cached positions
            yy_currentPos  = yy_currentPos_l;
            yy_markedPos   = yy_markedPos_l;
            boolean eof = yy_refill();
            // get translated positions and possibly new buffer
            yy_currentPos_l  = yy_currentPos;
            yy_markedPos_l   = yy_markedPos;
            yy_buffer_l      = yy_buffer;
            yy_endRead_l     = yy_endRead;
            if (eof) {
              yy_input = YYEOF;
              break yy_forAction;
            }
            else {
              yy_input = yy_buffer_l[yy_currentPos_l++];
            }
          }
          int yy_next = yytrans_l[ yy_rowMap_l[yy_state] + yycmap_l[yy_input] ];
          if (yy_next == -1) break yy_forAction;
          yy_state = yy_next;

          int yy_attributes = yy_attr_l[yy_state];
          if ( (yy_attributes & 1) == 1 ) {
            yy_action = yy_state; 
            yy_markedPos_l = yy_currentPos_l; 
            if ( (yy_attributes & 8) == 8 ) break yy_forAction;
          }

        }
      }

      // store back cached position
      yy_markedPos = yy_markedPos_l;

      switch (yy_action) {

        case 35: 
          {  return  symbolFactory.newSymbol("GT", GT);  }
        case 128: break;
        case 34: 
          {  return  symbolFactory.newSymbol("LT", LT);  }
        case 129: break;
        case 27: 
          {  return  symbolFactory.newSymbol("OR", OR);  }
        case 130: break;
        case 123: 
          {  return  symbolFactory.newSymbol("BOOLEANO", BOOLEANO, yytext());  }
        case 131: break;
        case 122: 
          {  return  symbolFactory.newSymbol("MIENTRAS", MIENTRAS, yytext());  }
        case 132: break;
        case 121: 
          {  return  symbolFactory.newSymbol("CARACTER", CARACTER, yytext());  }
        case 133: break;
        case 119: 
          {  return  symbolFactory.newSymbol("ENTONCES", ENTONCES, yytext());  }
        case 134: break;
        case 0: 
        case 20: 
        case 22: 
        case 59: 
          {  return symbolFactory.newSymbol("INT_NUMBER", INT_NUMBER, Integer.parseInt(yytext()));  }
        case 135: break;
        case 21: 
        case 60: 
          {  return symbolFactory.newSymbol("DEC_NUMBER", DEC_NUMBER, Float.parseFloat(yytext()));  }
        case 136: break;
        case 3: 
        case 4: 
          { /*ignorar*/ }
        case 137: break;
        case 63: 
          { /*ignorar*/ }
        case 138: break;
        case 5: 
        case 6: 
        case 7: 
        case 8: 
        case 9: 
        case 10: 
        case 11: 
        case 12: 
        case 13: 
        case 14: 
        case 15: 
        case 16: 
        case 17: 
        case 44: 
        case 45: 
        case 46: 
        case 47: 
        case 48: 
        case 49: 
        case 51: 
        case 53: 
        case 54: 
        case 55: 
        case 56: 
        case 69: 
        case 70: 
        case 71: 
        case 72: 
        case 73: 
        case 75: 
        case 77: 
        case 78: 
        case 79: 
        case 80: 
        case 87: 
        case 88: 
        case 89: 
        case 90: 
        case 91: 
        case 93: 
        case 94: 
        case 95: 
        case 96: 
        case 98: 
        case 99: 
        case 102: 
        case 103: 
        case 104: 
        case 105: 
        case 106: 
        case 108: 
        case 109: 
        case 110: 
        case 111: 
        case 112: 
        case 114: 
        case 115: 
        case 116: 
        case 117: 
        case 118: 
        case 120: 
        case 124: 
        case 125: 
          {  return  symbolFactory.newSymbol("ID", ID, yytext());  }
        case 139: break;
        case 50: 
          {  return  symbolFactory.newSymbol("SI", SI, yytext());  }
        case 140: break;
        case 52: 
          {  return  symbolFactory.newSymbol("OR", OR, yytext());  }
        case 141: break;
        case 33: 
          {  return  symbolFactory.newSymbol("TIMES", TIMES);  }
        case 142: break;
        case 32: 
          {  return  symbolFactory.newSymbol("MINUS", MINUS);  }
        case 143: break;
        case 23: 
          {  return  symbolFactory.newSymbol("MINUS", MINUS);  }
        case 144: break;
        case 68: 
          {  return  symbolFactory.newSymbol("NOTEQ", NOTEQ);  }
        case 145: break;
        case 84: 
          {  return symbolFactory.newSymbol("INT_NUMBER", INT_NUMBER, Integer.parseInt(yytext().substring(3, yytext().length()), 8)); }
        case 146: break;
        case 2: 
        case 18: 
        case 19: 
        case 24: 
        case 36: 
          {  emit_warning("Unrecognized character '" +yytext()+"' -- ignored");  }
        case 147: break;
        case 101: 
          {  return  symbolFactory.newSymbol("FINSI", FINSI, yytext());  }
        case 148: break;
        case 26: 
          {  return  symbolFactory.newSymbol("AND", AND);  }
        case 149: break;
        case 62: 
          {  return  symbolFactory.newSymbol("SAL", SAL);  }
        case 150: break;
        case 25: 
          {  return  symbolFactory.newSymbol("NOT", NOT, yytext());  }
        case 151: break;
        case 37: 
          {  return  symbolFactory.newSymbol("DIVIDEBY", DIVIDEBY);  }
        case 152: break;
        case 74: 
          {  return  symbolFactory.newSymbol("AND", AND, yytext());  }
        case 153: break;
        case 76: 
          {  return  symbolFactory.newSymbol("NOT", NOT, yytext());  }
        case 154: break;
        case 113: 
          {  return  symbolFactory.newSymbol("VECTOR", VECTOR, yytext());  }
        case 155: break;
        case 107: 
          {  return  symbolFactory.newSymbol("ENTERO", ENTERO, yytext());  }
        case 156: break;
        case 83: 
          {  return symbolFactory.newSymbol("INT_NUMBER", INT_NUMBER, Integer.parseInt(yytext().substring(2, yytext().length()), 16)); }
        case 157: break;
        case 31: 
          {  return  symbolFactory.newSymbol("PLUS", PLUS);  }
        case 158: break;
        case 30: 
          {  return  symbolFactory.newSymbol("COMA", COMA);  }
        case 159: break;
        case 29: 
          {  return  symbolFactory.newSymbol("SEMI", SEMI);  }
        case 160: break;
        case 28: 
          {  return  symbolFactory.newSymbol("ASIG", ASIG);  }
        case 161: break;
        case 64: 
          {  return  symbolFactory.newSymbol("EQEQ", EQEQ);  }
        case 162: break;
        case 65: 
          {  return  symbolFactory.newSymbol("ASIG", ASIG);  }
        case 163: break;
        case 66: 
          {  return  symbolFactory.newSymbol("LTEQ", LTEQ);  }
        case 164: break;
        case 67: 
          {  return  symbolFactory.newSymbol("GTEQ", GTEQ);  }
        case 165: break;
        case 92: 
          {  return  symbolFactory.newSymbol("SINO", SINO, yytext());  }
        case 166: break;
        case 86: 
          {  return  symbolFactory.newSymbol("REAL", REAL, yytext());  }
        case 167: break;
        case 38: 
          {  return  symbolFactory.newSymbol("LPAREN", LPAREN);  }
        case 168: break;
        case 39: 
          {  return  symbolFactory.newSymbol("RPAREN", RPAREN);  }
        case 169: break;
        case 40: 
          {  return  symbolFactory.newSymbol("LBRACK", LBRACK);  }
        case 170: break;
        case 41: 
          {  return  symbolFactory.newSymbol("RBRACK", RBRACK);  }
        case 171: break;
        case 42: 
          {  return  symbolFactory.newSymbol("LCURVY", LCURVY);  }
        case 172: break;
        case 43: 
          {  return  symbolFactory.newSymbol("RCURVY", RCURVY);  }
        case 173: break;
        case 82: 
        case 97: 
          {  return  symbolFactory.newSymbol("DEC_NUMBER", DEC_NUMBER, Float.parseFloat(yytext())); }
        case 174: break;
        case 126: 
          {  return  symbolFactory.newSymbol("FINMIENTRAS", FINMIENTRAS, yytext());  }
        case 175: break;
        case 100: 
          {  return  symbolFactory.newSymbol("BOOLEAN_LITERAL", BOOLEAN_LITERAL, Boolean.FALSE);  }
        case 176: break;
        case 85: 
          {  return  symbolFactory.newSymbol("BOOLEAN_LITERAL", BOOLEAN_LITERAL, Boolean.TRUE);  }
        case 177: break;
        case 81: 
          {  return  symbolFactory.newSymbol("CHAR", CHAR, String.valueOf(yytext()).charAt(1));  }
        case 178: break;
        default: 
          if (yy_input == YYEOF && yy_startRead == yy_currentPos) {
            yy_atEOF = true;
            yy_do_eof();
              {     return symbolFactory.newSymbol("EOF",sym.EOF);
 }
          } 
          else {
            yy_ScanError(YY_NO_MATCH);
          }
      }
    }
  }


}
