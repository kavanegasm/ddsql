grammar ddsql;

prog: main_prog  TK_PUNTOYCOMA;

main_prog  : (ID | guardar | save);
guardar: (TK_PUNTO ID more)?;
save: (attribute ID more)?;
attribute: ID;
more: (TK_PAR_IZQ INT TK_PAR_DER);



TK_PAR_IZQ: '(';
TK_PAR_DER: ')';
TK_PUNTO: '.';
TK_PUNTOYCOMA: ';';
TK_REF: 'ref';

INT: [0-9]+;
ID: [a-zA-Z0-9_]*;

ESP : [ \t\r\n]+ -> skip ;
