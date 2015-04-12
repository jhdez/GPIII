test( 'Testing darGanador(jugador1, jugador2)', function() {
	equal( darGanador(8,2), 8);
	equal( darGanador(1,8), 8);
	equal( darGanador(2,2), 2);
	equal( darGanador(3,12), 3); //Fallará
} );
