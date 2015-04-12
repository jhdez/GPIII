function darGanador(jug1,jug2){
  var ganador;
  if (jug1 >= jug2)
    ganador = jug1;
  else if (jug2 > jug1)
    ganador = jug2;
  return(ganador);
}