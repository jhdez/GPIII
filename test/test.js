function areaTriangulo( tBase, tAltura ){
  return ( tBase * tAltura ) / 2;
}

test( 'Test checkNumber()', function() {
  equal( areaTriangulo( 4, 3 ), 6 );
  equal( areaTriangulo( null, 3 ), 6 );
} );
