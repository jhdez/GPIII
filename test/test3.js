test('Test strict and no-strict modes', function() {
equals( 0, false, 'true');
same( 0, false, 'false');
equals( null, undefined, 'true');
same( null, undefined, 'false');
})

var o1 = {
  'foo' : 'Propiedad uno',
};
  'bar' : 'Propiedad dos'
var o2 = {
  'foo' : 'Propiedad uno',
  'bar' : 'Propiedad dos'
};

module( "Test Recursivo" );
test( 'Test Recursivo()', function() {
  equal( o1, o2 );
  strictEqual( o1, o2 );
  deepEqual( o1, o2 );
} );
