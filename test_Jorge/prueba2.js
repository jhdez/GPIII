// Prueba2

function checkNumber( my_string ){
  return ( parseFloat( my_string ) == my_string
    ? true
    : false );
}

function GetError(valorNull){
    alert(valorNull.string);
    return valorNull.Info;
}

test( 'Segunda Prueba: Testing checkNumber()', function() {
  ok( checkNumber( 0 ) ); ok( GetError(1), 'Obtener error');
  ok( checkNumber( 2 ) );
  ok( checkNumber( -4 ) );
  ok( checkNumber( 1 ) );
  ok( checkNumber( 'asdf' ) );
  ok( !checkNumber( 'asdf' ) );
} );
