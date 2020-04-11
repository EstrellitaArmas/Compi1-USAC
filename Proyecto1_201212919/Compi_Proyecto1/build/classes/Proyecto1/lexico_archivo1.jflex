package Proyecto1;
import java_cup.runtime.Symbol;

%%
%class analizador1
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
<YYINITIAL> "configuracion"   { return new Symbol(sym.config,yychar,yyline,new String(yytext()));}
<YYINITIAL> "fondo"           { return new Symbol(sym.fondo,yychar,yyline,new String(yytext()));}
<YYINITIAL> "figura"          { return new Symbol(sym.figura,yychar,yyline,new String(yytext()));}
<YYINITIAL> "diseno"          { return new Symbol(sym.diseno,yychar,yyline,new String(yytext()));}
<YYINITIAL> "nombre"            { return new Symbol(sym.nombre,yychar,yyline,new String(yytext()));}  
<YYINITIAL> "imagen"            { return new Symbol(sym.imagen,yychar,yyline,new String(yytext()));}  
<YYINITIAL> "tipo"              { return new Symbol(sym.tipo,yychar,yyline,new String(yytext()));}
<YYINITIAL> "descripcion"       { return new Symbol(sym.descripcion,yychar,yyline,new String(yytext()));}
<YYINITIAL> "destruir"          { return new Symbol(sym.destruir,yychar,yyline,new String(yytext()));}
<YYINITIAL> "creditos"          { return new Symbol(sym.destruir,yychar,yyline,new String(yytext()));}
<YYINITIAL> "vida"        { return new Symbol(sym.vida,yychar,yyline,new String(yytext()));}
<YYINITIAL> ";"           { return new Symbol(sym.pcoma,yychar,yyline,new String(yytext()));}
<YYINITIAL> "{"           { return new Symbol(sym.llaveizq,yychar,yyline,new String(yytext()));}
<YYINITIAL> "}"           { return new Symbol(sym.llaveder,yychar,yyline,new String(yytext()));}
<YYINITIAL> "="           { return new Symbol(sym.igual,yychar,yyline,new String(yytext()));}
<YYINITIAL> ","           { return new Symbol(sym.coma,yychar,yyline,new String(yytext()));}
<YYINITIAL> "<"           { return new Symbol(sym.menorq,yychar,yyline,new String(yytext()));}
<YYINITIAL> "/"           { return new Symbol(sym.slash,yychar,yyline,new String(yytext()));}
<YYINITIAL> ">"           { return new Symbol(sym.mayorq,yychar,yyline,new String(yytext()));}
<YYINITIAL> "'"           { return new Symbol(sym.comilla,yychar,yyline,new String(yytext()));}
<YYINITIAL> "."           { return new Symbol(sym.punto, yychar,yyline,new String(yytext()));}
<YYINITIAL> "jpg"         { return new Symbol(sym.ext, yychar,yyline,new String(yytext()));}
<YYINITIAL> {WHITE_SPACE} {/*no hace nada, aumenta una columna*/yychar++;}
<YYINITIAL> {num}         { return new Symbol(sym.num, yychar,yyline,new String(yytext()));}
<YYINITIAL> {id}          { return new Symbol(sym.id, yychar,yyline,new String(yytext()));}
<YYINITIAL> {NEW_LINE}    {yychar=0; yyline=0;}
<YYINITIAL> {InputCharacter} {/*se ignoran */}
<YYINITIAL> {LineTerminator} {/*se ignoran */}


[ \t\r\f\n]+    { /* Se ignoran */}
 .                   { System.out.println("Error lexico: "+yytext());}