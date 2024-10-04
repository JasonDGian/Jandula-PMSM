# Apuntes PSYM
Los atributos de la clase de kotlin deben de estar inicializados en el mismo momento de creación del objeto. De no inicializar los atributos levanta error.   

El constructor de las clases de Kotlin es de tipo inferido pero para poder definir un constructor secundario necesitamos ante un constructor primario.

Esta filosofia de diseño impide la generación de clases "nulas".

```kotlin
class Persona {
var nombre = "";
var edad = 0;
}
```

## Constructor base parametrizado.

```kotlin
// Clase con constructor parametrizado (no se puede instanciar de otra manera). 
class Persona constructor(nombre: String, edad: Int) {

init {
    // bloque de código que se fuerza su ejecucion al instanciar la clase.
}

}
```
## Constructores secundarios.
Los constructores secundarios DEBEN de estar diferenciados mediante la palabra reservada `constructor`.    
**Clase con constructor secundario**   
```kotlin
class Persona constructor(nombre: String, edad: Int) {

constructor():this(0,0,0) { // Este es un constructor que llama al constructor principal mediante 'this(0,0,0)' -> Esto ultimo es una instanciación.
// logica de construcción alterada.
}

init {
    // bloque de código que se fuerza su ejecucion al instanciar la clase.
}

}
```

En kotlin la palabra **new** está inferida. 
```kotlin
persona1 = Persona()
```

## Metodos de clase.
Al crear metodos dentro de una clase, que se alimentan de otros metodos de la misma clase, no es necesario instanciar esa clase, se puede realizar la llamada automaticamente.

> [!IMPORTANT]  
> Los metodos de kotlin son publicos por defecto, para crear metodos privados debemos de especificar la palabra clave `private`.   

```kotlin
private fun sumar(){
// logica.
}
```

### Metodos de acceso.
Los metodos de acceso en Kotlin vienen "prefabricados" y no es necesario especificarlos a no ser que se quiera impelentar algun tipo de validación o control en ellos. 

**Metodos de acceso modificados**
Los metodos de acceso de kotlin van justo debajo del atributo al que van asociados. Esto altera por completo la estructura del código en comparación por ejemplo con Java.

```kotlin
class Persona {
var nombre: String = "";

set(valor){
    field = valor.toUpperCase()
}
get(){
    return "(" + field + ")"
}


}
```
