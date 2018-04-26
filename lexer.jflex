package generado; // paquete en el que se genera el fichero java
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;
import java.lang.*;
import java.io.InputStreamReader;
%%

%class Lexer
%implements sym
%public
%unicode
%line
%column
%cup
%char
%{
	

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
%}

Whitespace = [ \t\f] | {LineTerminator}
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]

/*Palabras reservadas*/
True = [Tt][Rr][Uu][Ee]
False = [Ff][Aa][Ll][Ss][Ee]
Entero = [Ee][Nn][Tt][Ee][Rr][Oo]
Caracter = [Cc][Aa][Rr][Aa][Cc][Tt][Ee][Rr]
Real = [Rr][Ee][Aa][Ll]
Finmientras = [Ff][Ii][Nn][Mm][Ii][Ee][Nn][Tt][Rr][Aa][Ss]
Not = [Nn][Oo][Tt]
Booleano = [Bb][Oo][Oo][Ll][Ee][Aa][Nn][Oo]
Vector = [Vv][Ee][Cc][Tt][Oo][Rr]
Mientras = [Mm][Ii][Ee][Nn][Tt][Rr][Aa][Ss]
Si = [Ss][Ii]
Entonces = [Ee][Nn][Tt][Oo][Nn][Cc][Ee][Ss]
Sino = [Ss][Ii][Nn][Oo]
Finsi = [Ff][Ii][Nn][Ss][Ii]
And = [Aa][Nn][Dd]
Or = [Oo][Rr]

/*Identificador*/
Identificador = [a-zA-Z] {subIden}*
subIden=  [a-zA-Z]* | "_" | {NumLiteral}

/*char*/
Char = "‘" {InputCharacter} "’" | "'" {InputCharacter} "'"

/*Numeros*/
NumLiteral = [0-9]*
HexLiteral = [0-9a-fA-F]*
OctLiteral = [0-7]*
Int_Number = {NumLiteral}
Dec_Number = {NumLiteral}"."{NumLiteral} | "."{NumLiteral}
Hex_Number = 0 [xX] [1-9a-fA-F] {HexLiteral}
Oct_Number = 0 [xX] 0 {OctLiteral}
ScientificNotation = [0-9]"."{NumLiteral}[E][+-]{0,1}{NumLiteral}

/*Comentarios*/
Comentario = "%%" {InputCharacter}* {LineTerminator}?
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]

%eofval{
    return symbolFactory.newSymbol("EOF",sym.EOF);
%eofval}

%state CODESEG

%%  

/* Reglas para detectar los tokens y acciones asociadas */
<YYINITIAL> {
	  {Whitespace}  {/*ignorar*/}
	  {Comentario} 	{/*ignorar*/}
	  {True}	    { return  symbolFactory.newSymbol("BOOLEAN_LITERAL", BOOLEAN_LITERAL, Boolean.TRUE); }
	  {False} 		{ return  symbolFactory.newSymbol("BOOLEAN_LITERAL", BOOLEAN_LITERAL, Boolean.FALSE); }
	  {Entero}		{ return  symbolFactory.newSymbol("ENTERO", ENTERO, yytext()); }
	  {Real} 		{ return  symbolFactory.newSymbol("REAL", REAL, yytext()); }
	  {Finmientras} { return  symbolFactory.newSymbol("FINMIENTRAS", FINMIENTRAS, yytext()); }
	  {Not} 		{ return  symbolFactory.newSymbol("NOT", NOT, yytext()); }
	  "¬"			{ return  symbolFactory.newSymbol("NOT", NOT, yytext()); }
	  {Booleano} 	{ return  symbolFactory.newSymbol("BOOLEANO", BOOLEANO, yytext()); }
	  {Vector} 		{ return  symbolFactory.newSymbol("VECTOR", VECTOR, yytext()); }
	  {Caracter} 	{ return  symbolFactory.newSymbol("CARACTER", CARACTER, yytext()); }
	  {Mientras} 	{ return  symbolFactory.newSymbol("MIENTRAS", MIENTRAS, yytext()); }
	  {Si} 			{ return  symbolFactory.newSymbol("SI", SI, yytext()); }
	  {Entonces} 	{ return  symbolFactory.newSymbol("ENTONCES", ENTONCES, yytext()); }
	  {Sino} 		{ return  symbolFactory.newSymbol("SINO", SINO, yytext()); }
	  {Finsi} 		{ return  symbolFactory.newSymbol("FINSI", FINSI, yytext()); }
	  {And} 		{ return  symbolFactory.newSymbol("AND", AND, yytext()); }
	  "&"	 		{ return  symbolFactory.newSymbol("AND", AND); }
	  {Or} 			{ return  symbolFactory.newSymbol("OR", OR, yytext()); }
  	  "|"			{ return  symbolFactory.newSymbol("OR", OR); }
	  "="          	{ return  symbolFactory.newSymbol("ASIG", ASIG); }
 	  ";"          	{ return  symbolFactory.newSymbol("SEMI", SEMI); }
 	  ","          	{ return  symbolFactory.newSymbol("COMA", COMA); }
  	  "+"          	{ return  symbolFactory.newSymbol("PLUS", PLUS); }
   	  "-"          	{ return  symbolFactory.newSymbol("MINUS", MINUS); }
   	  "–"			{ return  symbolFactory.newSymbol("MINUS", MINUS); }
  	  "*"          	{ return  symbolFactory.newSymbol("TIMES", TIMES); }
  	  "=="		   	{ return  symbolFactory.newSymbol("EQEQ", EQEQ); }
  	  "<="		   	{ return  symbolFactory.newSymbol("LTEQ", LTEQ); }
  	  ">="		   	{ return  symbolFactory.newSymbol("GTEQ", GTEQ); }
  	  "!="		   	{ return  symbolFactory.newSymbol("NOTEQ", NOTEQ); }
  	  "<"		   	{ return  symbolFactory.newSymbol("LT", LT); }
  	  ">"		   	{ return  symbolFactory.newSymbol("GT", GT); }
  	  "<-"			{ return  symbolFactory.newSymbol("ASIG", ASIG); }
  	  "->"			{ return  symbolFactory.newSymbol("SAL", SAL); }
  	  "/"			{ return  symbolFactory.newSymbol("DIVIDEBY", DIVIDEBY); }
  	  "("		   	{ return  symbolFactory.newSymbol("LPAREN", LPAREN); }
  	  ")"		   	{ return  symbolFactory.newSymbol("RPAREN", RPAREN); }
  	  "["		   	{ return  symbolFactory.newSymbol("LBRACK", LBRACK); }
  	  "]"		   	{ return  symbolFactory.newSymbol("RBRACK", RBRACK); }
  	  "{"		   	{ return  symbolFactory.newSymbol("LCURVY", LCURVY); }
  	  "}"		   	{ return  symbolFactory.newSymbol("RCURVY", RCURVY); }
	  {Int_Number} { return symbolFactory.newSymbol("INT_NUMBER", INT_NUMBER, Integer.parseInt(yytext())); }
	  {Dec_Number} { return symbolFactory.newSymbol("DEC_NUMBER", DEC_NUMBER, Float.parseFloat(yytext())); }
	  {Hex_Number} { return symbolFactory.newSymbol("INT_NUMBER", INT_NUMBER, Integer.parseInt(yytext().substring(2, yytext().length()), 16));}
	  {Oct_Number} { return symbolFactory.newSymbol("INT_NUMBER", INT_NUMBER, Integer.parseInt(yytext().substring(3, yytext().length()), 8));}
      {ScientificNotation} { return  symbolFactory.newSymbol("DEC_NUMBER", DEC_NUMBER, Float.parseFloat(yytext()));}
      {Identificador} { return  symbolFactory.newSymbol("ID", ID, yytext()); }
      {Char} 		{ return  symbolFactory.newSymbol("CHAR", CHAR, String.valueOf(yytext()).charAt(1)); }

}



// error fallback
.|\n          { emit_warning("Unrecognized character '" +yytext()+"' -- ignored"); }
