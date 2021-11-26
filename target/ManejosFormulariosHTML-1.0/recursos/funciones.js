function validarFormulario(Formulario) {
    var usuario = Formulario.usuario;
    if (usuario.value == "" || usuario.value == "Escribir Usuario") {
        alert("Debe ingresar un nombre de Usuario");
        usuario.focus();
        usuario.select();
        return false;
    }

    var contrasenia = Formulario.contrasenia;
    if (contrasenia.value == "" || contrasenia.lenght < 3) {
        alert("Debe ingresar una constrasenia mayor a 2 caracteres");
        contrasenia.focus();
        contrasenia.select();
    }

    var tec = Formulario.tecnologia;
    var seleccionCheck = false;
    
    
    for(var i = 0; i < tec.length; i++){
        if(tec[i].checked){
            seleccionCheck = true;
        }
    }
    
    if(!seleccionCheck){
        alert("Debe seleccionar al menos una tecnologia");
        return false;
    }
   
    
    var generos = Formulario.genero;
    var radioSeleccion = false;
    
    for (var i = 0; i < generos.length; i++) {
        if(generos[i].checked){
            radioSeleccion = true
        }
    }
    if(!radioSeleccion){
        alert("Debe seleccionar un genero");
        return false;
    }
    
    var ocupacion = Formulario.ocupacion;
    if(ocupacion.value == ""){
        alert("Debe seleccionar al menos una ocupacion");
        return false;
    }
    
    
    alert("Formulario es valido para procesar el formulario");
    return true;
}








