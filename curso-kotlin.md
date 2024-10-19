# ⚪ Qué es Kotlin ❔
Kotlin es un lenguaje de programación fuertemente tipado desarrollado por JetBrains. Ha sido influenciado por lenguajes como Groovy, Scala y C#. Permite generar código para la máquina virtual de Java, JavaScript y, en las últimas versiones, incluso ejecutables nativos.

Tiene menos características que Scala, pero es mucho más familiar y tiene un tiempo de compilación con mejor rendimiento en comparación con este último.   
En pocas palabras Kotlin es una version mejorada de Java enderezado al mundo del desarrollo movil que integra mejora inspiradas en otros lenguajes.

# 📌 Configuracion de entorno de desarrollo.
Para desarrollar en Kotlin utilizamos su IDE oficial, Android Studio.
Para descargar la ultima versión nos dirigiremos a su página web oficial.   

![Android Studio]("https://developer.android.com/studio?hl=es-419").


Para comentar la linea en la que se ubica el cursor usamos `CTRL` + `/`. De no estar configurado podemos ir a Ajustes, en el buscador introducir 'comments' y configurarlo 
![image](https://github.com/user-attachments/assets/0dd7618a-64e8-408d-b0ca-11984b2eb676)
       
![image](https://github.com/user-attachments/assets/214a2494-4345-431b-92aa-6905866e97af)
      
![image](https://github.com/user-attachments/assets/a3e26fdb-f8e6-4062-bf2b-ad612dace1be)




# 📌 Comentarios.
```kotlin

// Comeentario linea singular.

/*
Comentario multilinea o de bloque.
*/
```

# 📌 Variables y constantes.
Existen dos tipos de declaraciones, de declaracion normal y la declaración con tipo explicitado.   
   
**Declaraciones**
```kotlin
// Declaracion de variable.
var nombreVariable = "Valor"

// Declaracion de constante.
val nombreConstante = "Valor"
```

**Declaraciones con tipo explicito**    
Este tipo de declaración incluye el tipo de dato que almacena la variable o constante.   
```kotlin
// Declaracion de variable.
var nombreVariable: String = "Valor"

// Declaracion de constante.
val nombreConstante: Int = 25
```

# 📌 Tipos de datos.
En kotlin podemos diferenciar en distintos tipos de datos. Estos pueden ser los siguientes.

## 🔹 Enteros.   
- Byte: 8 bits (rango: -128 a 127)
- Short: 16 bits (rango: -32,768 a 32,767)
- Int: 32 bits (rango: -2^31 a 2^31 - 1)
- Long: 64 bits (rango: -2^63 a 2^63 - 1)
```kotlin
val byteValue: Byte = 10
val shortValue: Short = 1000
val intValue: Int = 100000
val longValue: Long = 10000000000L
```

## 🔹 Decimales.
- Float: 32 bits, precisión simple   
- Double: 64 bits, precisión doble   
```kotlin
val floatValue: Float = 10.5f
val doubleValue: Double = 20.99
```

## 🔹 Cadenas y caracteres.
- caracteres unicos con `' '`
- cadenas de caracteres con `" "`
```kotlin
val letra: Char = 'A'
val saludo: String = "Hola, Kotlin"
```

**Interpolación de cadenas.**
```kotlin
val edad: Int = 20
val mensaje: String = "Juan tiene $edad años!"
```


## 🔹 Booleanos.
Tiene solo dos posibles valores: true o false.
```kotlin
val esVerdadero: Boolean = true
val esFalso: Boolean = false
```

# 📌 Colecciones.
- Listas: Ordenadas, pueden ser mutables o inmutables.
- Conjuntos: No permiten duplicados, pueden ser mutables o inmutables.
- Mapas: Colección de pares clave-valor, pueden ser mutables o inmutables.
- Arreglos: Colección de tamaño fijo, pero con valores modificables.
     
## 🔹 Listas inmutables.
```kotlin
val listaInmutable: List<String> = listOf("Manzana", "Banana", "Cereza")
println(listaInmutable)  // Output: [Manzana, Banana, Cereza]
```

## 🔹 Listas mutables.
```kotlin
val listaMutable: MutableList<String> = mutableListOf("Manzana", "Banana", "Cereza")
listaMutable.add("Durazno")  // Se puede agregar un elemento
println(listaMutable)  // Output: [Manzana, Banana, Cereza, Durazno]
```

## 🔹 Conjunto inmutable - SET.
```kotlin
val conjuntoInmutable: Set<Int> = setOf(1, 2, 3, 3)  // El 3 duplicado será ignorado
println(conjuntoInmutable)  // Output: [1, 2, 3]
```

## 🔹 Conjunto mutable - MUTABLESET.
```kotlin
val conjuntoMutable: MutableSet<Int> = mutableSetOf(1, 2, 3)
conjuntoMutable.add(4)  // Se puede agregar un elemento
println(conjuntoMutable)  // Output: [1, 2, 3, 4]
```

## 🔹 Mapa inmutable - MAP.
```kotlin
val mapaInmutable: Map<String, Int> = mapOf("uno" to 1, "dos" to 2, "tres" to 3)
println(mapaInmutable)  // Output: {uno=1, dos=2, tres=3}
```

## 🔹 Mapa mutable - MUTABLEMAP.
```kotlin
val mapaMutable: MutableMap<String, Int> = mutableMapOf("uno" to 1, "dos" to 2)
mapaMutable["tres"] = 3  // Se puede agregar o modificar un par clave-valor
println(mapaMutable)  // Output: {uno=1, dos=2, tres=3}
```


