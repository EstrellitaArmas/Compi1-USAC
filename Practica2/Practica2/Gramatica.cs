using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using Irony.Ast;
using Irony.Parsing;

namespace Practica2
{
    class Gramatica : Irony.Parsing.Grammar
    {
         public Gramatica() : base(false) {


            //se definenn los terminales                     nombre en el ast, expresion regular
            RegexBasedTerminal entero = new RegexBasedTerminal("entero", "[0-9]+");
            RegexBasedTerminal id = new RegexBasedTerminal("id", "[a-zA-Z|_][a-zA-Z0-9|_]*");
            RegexBasedTerminal flotante = new RegexBasedTerminal("flotante", "[0-9]+.[0-9]+");
            RegexBasedTerminal caracter = new RegexBasedTerminal("caracter", "'[a-zA-Z0-9]'");
            RegexBasedTerminal cadena = new RegexBasedTerminal("cadena", "'[a-zA-Z][a-zA-Z0-9|_]*'");
            CommentTerminal comm = new CommentTerminal("comm", "\n", "\r");
            base.NonGrammarTerminals.Add(comm);
            
            //se definen los no terminales       nombre en el ast
            NonTerminal inicio = new NonTerminal("inicio");
            NonTerminal FUNCION = new NonTerminal("FUNCION");
            NonTerminal TIPO = new NonTerminal("TIPO");
            NonTerminal T = new NonTerminal("T");
            NonTerminal BLOQUE = new NonTerminal("BLOQUE");
            NonTerminal INSTRUCCION = new NonTerminal("INSTRUCCION");
            NonTerminal ASIGNACION  = new NonTerminal("ASIGNACION");
            NonTerminal DECLARACION = new NonTerminal("DECLARACION");          
            NonTerminal DOWHILE = new NonTerminal("DO_WHILE");
            NonTerminal FOR = new NonTerminal("FOR");
            NonTerminal WHILE_ = new NonTerminal("WHILE");
            NonTerminal SWITCH_ = new NonTerminal("SWITCH");
            NonTerminal IF_ELSE = new NonTerminal("IF_ELSE");
            NonTerminal ELSE = new NonTerminal("ELSE");
            NonTerminal COMENTARIO = new NonTerminal("COMENTARIO");
            NonTerminal LLAMADAS_F = new NonTerminal("LLAMADA_FUNCION");
            NonTerminal IGUAL_A = new NonTerminal("IGUAL_A");
            NonTerminal E = new NonTerminal("E");
            NonTerminal F = new NonTerminal("F");
            NonTerminal C = new NonTerminal("C");
            NonTerminal R = new NonTerminal("R");
            NonTerminal EXPRESION = new NonTerminal("EXP");
            NonTerminal CASE_ = new NonTerminal("CASE");
             //se declara el inicio de la gramatica
            this.Root = FUNCION;

            FUNCION.Rule = TIPO + id + ToTerm("(")        +        ToTerm(")") + ToTerm("{") + BLOQUE + ToTerm("return") + T + ToTerm(";") + ToTerm("}")
                        |  TIPO + id + ToTerm("(") + DECLARACION + ToTerm(")") + ToTerm("{") + BLOQUE + ToTerm("return") + T + ToTerm(";") + ToTerm("}");

            TIPO.Rule =   ToTerm("int")
                        | ToTerm("char")
                        | ToTerm("float")
                        | ToTerm("char*");
            BLOQUE.Rule = BLOQUE + INSTRUCCION
                        | INSTRUCCION;

            INSTRUCCION.Rule = DECLARACION
                        | ASIGNACION
                        | DOWHILE
                        | FOR
                        | WHILE_
                        | SWITCH_
                        | IF_ELSE
                        | COMENTARIO
                        | LLAMADAS_F;

            DECLARACION.Rule = TIPO + id + ToTerm(";")
                | TIPO + ASIGNACION;

            ASIGNACION.Rule =  id + ToTerm("=") + IGUAL_A + ToTerm(";");

            DOWHILE.Rule = ToTerm("do")+ ToTerm("{")+ BLOQUE + ToTerm("}") +ToTerm ("while") + ToTerm("(") + EXPRESION  + ToTerm(")") + ToTerm(";") ;

            FOR.Rule = ToTerm("for") + ToTerm("(") + DECLARACION + ToTerm(";") + R  + ToTerm(";") + EXPRESION + ToTerm(")") + ToTerm("{") + BLOQUE + ToTerm("}");

            WHILE_.Rule = ToTerm("while") + ToTerm("(") + R + ToTerm(")") + ToTerm("{") + BLOQUE + ToTerm("}");

            SWITCH_.Rule = ToTerm("swith") + ToTerm("(") + EXPRESION + ToTerm(")") + ToTerm("{") + CASE_ + ToTerm("}");
            CASE_.Rule =  CASE_ + ToTerm("case") + EXPRESION + ToTerm(":") + ToTerm("[") + BLOQUE + ToTerm("]") + ToTerm("[") + ToTerm("break;") + ToTerm("]") 
                                | ToTerm("case") + EXPRESION + ToTerm(":") + ToTerm("[") + BLOQUE + ToTerm("]") + ToTerm("[") + ToTerm("break;") + ToTerm("]")
                                | ToTerm("[") + ToTerm("default:") + BLOQUE + ToTerm("]") ;


            IF_ELSE.Rule = ToTerm("if") + ToTerm("(") + EXPRESION + ToTerm(")") + ToTerm("{") + BLOQUE + ToTerm("}")
                         | ToTerm("if") + ToTerm("(") + EXPRESION + ToTerm(")") + ToTerm("{") + BLOQUE + ToTerm("}") + ELSE;
            ELSE.Rule = ELSE + ToTerm("else") + ToTerm("if") + ToTerm("(") + EXPRESION + ToTerm(")") + ToTerm("{") + BLOQUE + ToTerm("}") 
                             | ToTerm("else") + ToTerm("(") + EXPRESION + ToTerm(")") + ToTerm("{") + BLOQUE + ToTerm("}");


            LLAMADAS_F.Rule = id + ToTerm("(") + EXPRESION + ToTerm(")") + ToTerm(";")
                            | id + ToTerm("(") + ToTerm(")") + ToTerm(";") ;

            IGUAL_A.Rule = LLAMADAS_F
                | T;

            COMENTARIO.Rule = ToTerm("/*") + C + ToTerm("*/")
                            | ToTerm("//") + C;
            C.Rule = C + id
                       | id;

            EXPRESION.Rule = EXPRESION + ToTerm("&&") + R
                           | EXPRESION + ToTerm("&&") + R
                           | R;
            R.Rule = R + ToTerm("==") + E
                | R + ToTerm("!=") + E
                | R + ToTerm("<") + E
                | R + ToTerm(">") + E
                | R + ToTerm("<=") + E
                | R + ToTerm(">=") + E
                | E;
            E.Rule = E + ToTerm("+") + T
              | E + ToTerm("-") + T 
              | T;

            F.Rule = F + ToTerm("*") + T 
                | F  + ToTerm("/") + T 
                | T ;
             
            T.Rule= entero
                | flotante
                | caracter
                | cadena
                | id;

        }
    }
}



   
