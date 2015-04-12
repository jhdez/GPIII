test( 'Testing sumarPuntuaciones(punutacion1, puntuacion2)', function() {
	equal( sumarPuntuaciones(3,1), 4);
	equal( sumarPuntuaciones(2,6), 8);
	equal( sumarPuntuaciones(1,1), 2);
	equal( sumarPuntuaciones(1,3), 3); //Fallará
} );