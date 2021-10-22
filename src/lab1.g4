grammar lab1;


@rulecatch {
    // ANTLR does not generate its normal rule try/catch
    catch(RecognitionException e) {
        throw e;
    }
}



ZHU1:'//'~[\n\r]* -> skip;
ZHU2:'/*'.*'*/' -> skip;
LPAR: '(';
RPAR: ')';
LBRACE:'{';
RBRACE:'}';
FuncType_int: 'int';
Ident_main:'main';
RETURN:'return';
Semicolon:';';
Decimal_const:[1-9][0-9]*;
Octal_const:[0][0-7]*;
Hexadecimal_const:[0][x][0-9a-fA-F]+ | [0][X][0-9a-fA-F]+;
SPACE: ' ' -> skip;
WHITE_SPACE: [\n\r\t] -> skip;



compUnit : funcDef;
funcDef  :  funcType ident LPAR RPAR block;
funcType:  FuncType_int;
ident   :  Ident_main;
block  :  LBRACE stmt RBRACE;
stmt   :   RETURN number Semicolon;
number: Decimal_const | Octal_const | Hexadecimal_const;