package Proyecto1;
import java_cup.runtime.Symbol;

%%
%class analizador3
%cupsym simbolo
%full
%cup
%public
%unicode
%public
%line
%char
%ignorecase

%eofval{
return new Symbol(sym.EOF, null); 
%eofval}

num     =[0-9]+
id      =[A-Za-z][A-Za-z0-9_]*  
     
NEW_LINE=(\n|\r)
WHITE_SPACE=([\ |\t|\f])
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]

%%
<YYINITIAL> "<escenarios>"   { return new Symbol(sym.escenarios,yychar,yyline,new String(yytext()));}
<YYINITIAL> "</escenarios>"   { return new Symbol(sym.cescenarios,yychar,yyline,new String(yytext()));}
<YYINITIAL> "escenario"   { return new Symbol(sym.escenario,yychar,yyline,new String(yytext()));}
<YYINITIAL> "nombre"      { return new Symbol(sym.nombre,yychar,yyline,new String(yytext()));}
<YYINITIAL> "orden"       { return new Symbol(sym.orden,yychar,yyline,new String(yytext()));}
<YYINITIAL> ";"           { return new Symbol(sym.pcoma,yychar,yyline,new String(yytext()));}
<YYINITIAL> "/"           { return new Symbol(sym.slash,yychar,yyline,new String(yytext()));}
<YYINITIAL> "<"           { return new Symbol(sym.menorq,yychar,yyline,new String(yytext()));}
<YYINITIAL> ">"           { return new Symbol(sym.mayorq,yychar,yyline,new String(yytext()));}
<YYINITIAL> "="           { return new Symbol(sym.igual,yychar,yyline,new String(yytext()));}
<YYINITIAL> {WHITE_SPACE} {/*no hace nada, aumenta una columna*/yychar++;}
<YYINITIAL> {num}         { return new Symbol(sym.num, yychar,yyline,new String(yytext()));}
<YYINITIAL> {id}          { return new Symbol(sym.id, yychar,yyline,new String(yytext()));}
<YYINITIAL> {NEW_LINE}    {yychar=0; yyline=0;}
<YYINITIAL> {InputCharacter} {/*se ignoran */}
<YYINITIAL> {LineTerminator} {/*se ignoran */}


[ \t\r\f\n]+    { /* Se ignoran */}
 .                   { System.out.println("Error lexico: "+yytext());}