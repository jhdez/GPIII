//Mi Primera Prueba QUNIT

function HolaQueTal(user1,user2){
    var resultado ="Hola que tal estais " + user1 +" y " + user2;   
        alert(resultado);
        return resultado;
}
 
test("Primera Prueba",function () {
    ok(HolaQueTal("Albert","Jorge"),"Satisfactorio");
});
