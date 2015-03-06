function checkNumber( cadena ){
  return ( parseFloat( cadena ) == cadena
    ? true
    : false );
}

test( 'Testeando checkNumber()', function() {
  ok( checkNumber( 0 ) );
  ok( checkNumber( 2 ) );
  ok( checkNumber( -4 ) );
  ok( checkNumber( 1 ) );
  ok( checkNumber( 'asdf' ) );
  ok( !checkNumber( 'asdf' ) );
} );
