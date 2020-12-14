grammar ddsql;


prog: main_prog+;

main_prog  : (ID TK_PUNTOYCOMA| guardar TK_PUNTOYCOMA| save TK_PUNTOYCOMA);
guardar: (TK_PUNTO ID var)?;
save: (attribute ID var)?;
var: (TK_PAR_IZQ expression TK_PAR_DER);
expression: num //NORMAL
    | TK_REF TK_COMA factor //REF
    | TK_TXT TK_COMA factor //TXT
;
attribute: ID;
factor: ID | num;
num: INT | DOUBLE;

TK_PAR_IZQ: '(';
TK_PAR_DER: ')';
TK_PUNTO: '.';
TK_PUNTOYCOMA: ';';
TK_COMA: ',';
TK_REF: 'ref';
TK_TXT: 'txt';


INT: [0-9]+;
DOUBLE: [0-9]+ '.' [0-9]+;
ID : [a-zA-Z]+ ;
FID: [a-zA-Z0-9_]*;
ESP : [ \t\r\n]+ -> skip ;
