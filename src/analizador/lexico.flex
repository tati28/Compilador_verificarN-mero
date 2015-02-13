package analizador;
import java_cup.runtime.Symbol;
import static analizador.Token.*;

%%
%class Analizador
%line
%column
%cup
FIJO=[02]+
CLARO= [09]+
MOVISTAR=[08]+
DIGITO=[0-9]+
white=[ ,\n]

%{

%}
%%

{FIJO} {return new Symbol(sym.NumeroReservadofijo, yychar, yyline, yytext());}
{CLARO} {return new Symbol(sym.NumeroReservadoclaro, yychar, yyline, yytext());}
{MOVISTAR} {return new Symbol(sym.NumeroReservadomovistar, yychar, yyline, yytext());}
{DIGITO}{return new Symbol(sym.DIGITO, yychar, yyline, yytext()); }

"=" {return new Symbol(sym.IGUAL, yychar, yyline, yytext());}
"-" {return new Symbol(sym.GUION, yychar, yyline, yytext());}
. {System.out.println("Error  se permite solo números\n"+ yyline+"linea\n"+ yycolumn+ "columa\n"); System.exit(1);}
