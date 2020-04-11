package Proyecto1;
import java_cup.runtime.Symbol;

%%
%class analizador2
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
<YYINITIAL> "escenario"   { return new Symbol(sym.escenario,yychar,yyline,new String(yytext()));}
<YYINITIAL> "</escenario>"   { return new Symbol(sym.cescenario,yychar,yyline,new String(yytext()));}
<YYINITIAL> "<personajes>"   { return new Symbol(sym.personajes,yychar,yyline,new String(yytext()));}
<YYINITIAL> "</personajes>"  { return new Symbol(sym.cpersonajes,yychar,yyline,new String(yytext()));}
<YYINITIAL> "<paredes>"      { return new Symbol(sym.paredes,yychar,yyline,new String(yytext()));}
<YYINITIAL> "</paredes>"     { return new Symbol(sym.cparedes,yychar,yyline,new String(yytext()));}
<YYINITIAL> "<suelo>"        { return new Symbol(sym.suelo,yychar,yyline,new String(yytext()));}
<YYINITIAL> "</suelo>"       { return new Symbol(sym.csuelo,yychar,yyline,new String(yytext()));}
<YYINITIAL> "<extras>"       { return new Symbol(sym.extras,yychar,yyline,new String(yytext()));}  
<YYINITIAL> "</extras>"      { return new Symbol(sym.cextras,yychar,yyline,new String(yytext()));}  
<YYINITIAL> "<meta>"         { return new Symbol(sym.meta,yychar,yyline,new String(yytext()));}  
<YYINITIAL> "</meta>"        { return new Symbol(sym.cmeta,yychar,yyline,new String(yytext()));}  
<YYINITIAL> "<heroes>"       { return new Symbol(sym.heroes,yychar,yyline,new String(yytext()));}
<YYINITIAL> "</heroes>"       { return new Symbol(sym.cheroes,yychar,yyline,new String(yytext()));}
<YYINITIAL> "<villanos>"     { return new Symbol(sym.villanos,yychar,yyline,new String(yytext()));}
<YYINITIAL> "</villanos>"    { return new Symbol(sym.cvillanos,yychar,yyline,new String(yytext()));}
<YYINITIAL> "<armas>"        { return new Symbol(sym.armas,yychar,yyline,new String(yytext()));}
<YYINITIAL> "</armas>"       { return new Symbol(sym.carmas,yychar,yyline,new String(yytext()));}
<YYINITIAL> "<bonus>"        { return new Symbol(sym.bonus,yychar,yyline,new String(yytext()));}
<YYINITIAL> "</bonus>"       { return new Symbol(sym.cbonus,yychar,yyline,new String(yytext()));}
<YYINITIAL> "nombre"         { return new Symbol(sym.nombre,yychar,yyline,new String(yytext()));}
<YYINITIAL> "fondo"          { return new Symbol(sym.fondo,yychar,yyline,new String(yytext()));}
<YYINITIAL> "ancho"          { return new Symbol(sym.ancho, yychar,yyline,new String(yytext()));}
<YYINITIAL> "alto"         { return new Symbol(sym.alto, yychar,yyline,new String(yytext()));}
<YYINITIAL> ";"           { return new Symbol(sym.pcoma,yychar,yyline,new String(yytext()));}
<YYINITIAL> "("           { return new Symbol(sym.pizq,yychar,yyline,new String(yytext()));}
<YYINITIAL> ")"           { return new Symbol(sym.pder,yychar,yyline,new String(yytext()));}
<YYINITIAL> ","           { return new Symbol(sym.coma,yychar,yyline,new String(yytext()));}
<YYINITIAL> "<"           { return new Symbol(sym.menorq,yychar,yyline,new String(yytext()));}
<YYINITIAL> ">"           { return new Symbol(sym.mayorq,yychar,yyline,new String(yytext()));}
<YYINITIAL> ".."           { return new Symbol(sym.rp,yychar,yyline,new String(yytext()));}
<YYINITIAL> "="           { return new Symbol(sym.igual,yychar,yyline,new String(yytext()));}
<YYINITIAL> {WHITE_SPACE} {/*no hace nada, aumenta una columna*/yychar++;}
<YYINITIAL> {num}         { return new Symbol(sym.num, yychar,yyline,new String(yytext()));}
<YYINITIAL> {id}          { return new Symbol(sym.id, yychar,yyline,new String(yytext()));}
<YYINITIAL> {NEW_LINE}    {yychar=0; yyline=0;}
<YYINITIAL> {InputCharacter} {/*se ignoran */}
<YYINITIAL> {LineTerminator} {/*se ignoran */}


[ \t\r\f\n]+    { /* Se ignoran */}
 .                   { System.out.println("Error lexico: "+yytext());}