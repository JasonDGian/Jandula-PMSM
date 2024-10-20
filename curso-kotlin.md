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

## 🔹 Arreglos - ARRAY
Un array en Kotlin es una colección que tiene un tamaño fijo, pero puede cambiar los valores de sus elementos.   
```kotlin
val arreglo: Array<Int> = arrayOf(1, 2, 3, 4)
println(arreglo.joinToString())  // Output: 1, 2, 3, 4

arreglo[0] = 10  // Cambiar el valor en el índice 0
println(arreglo.joinToString())  // Output: 10, 2, 3, 4
```

# 📌 Declaracion de funciones.
Para declarar funciones en kotlin usamos la palabra clave `fun`.   

>[!CAUTION]
> **Importante:** El tipo de retorno se coloca después de los parámetros de la función.

**Función CON retorno**
```kotlin
fun nombreFuncion(parametro1: Tipo, parametro2: Tipo): TipoDeRetorno {
    // Cuerpo de la función
    return valorDeRetorno
}
```
   
**Función SIN retorno**    
Para codificar funciones sin valor de retorno podemos explicitar que no devuelven nada mediante la palabra reservada `Unit` o sencillamente no explicitar retorno.
```kotlin
// La función 
fun saludar(): Unit {
    println("¡Hola!")
}
// Es equivalente a 
fun saludar() {
    println("¡Hola!")
}
```

>[!NOTE]
> En las funciones que no tienen `return` la palabra `unit` es equivalente al `void` de **Java**, pero no es obligatoria.

# 📌 Operadores.

## 🔹 Aritmeticos.
Estos operadores se usan para realizar operaciones matemáticas básicas.
<table border="1">
    <tr>
        <th>Operador</th>
        <th>Descripción</th>
        <th>Ejemplo</th>
    </tr>
    <tr>
        <td>+</td>
        <td>Suma</td>
        <td>a + b</td>
    </tr>
    <tr>
        <td>-</td>
        <td>Resta</td>
        <td>a - b</td>
    </tr>
    <tr>
        <td>*</td>
        <td>Multiplicación</td>
        <td>a * b</td>
    </tr>
    <tr>
        <td>/</td>
        <td>División</td>
        <td>a / b</td>
    </tr>
    <tr>
        <td>%</td>
        <td>Módulo (resto)</td>
        <td>a % b</td>
    </tr>
</table>


## 🔹 Asignación.
Se utilizan para asignar valores a las variables.
<table border="1">
    <tr>
        <th>Operador</th>
        <th>Descripción</th>
        <th>Ejemplo</th>
    </tr>
    <tr>
        <td>=</td>
        <td>Asignación simple</td>
        <td>a = b</td>
    </tr>
    <tr>
        <td>+=</td>
        <td>Suma y asigna</td>
        <td>a += b</td>
    </tr>
    <tr>
        <td>-=</td>
        <td>Resta y asigna</td>
        <td>a -= b</td>
    </tr>
    <tr>
        <td>*=</td>
        <td>Multiplica y asigna</td>
        <td>a *= b</td>
    </tr>
    <tr>
        <td>/=</td>
        <td>Divide y asigna</td>
        <td>a /= b</td>
    </tr>
    <tr>
        <td>%=</td>
        <td>Módulo y asigna</td>
        <td>a %= b</td>
    </tr>
</table>


## 🔹 Unarios.
Son operadores que actúan sobre un solo operando.
<table border="1">
    <tr>
        <th>Operador</th>
        <th>Descripción</th>
        <th>Ejemplo</th>
    </tr>
    <tr>
        <td>+</td>
        <td>Operador unario positivo</td>
        <td>+a</td>
    </tr>
    <tr>
        <td>-</td>
        <td>Operador unario negativo</td>
        <td>-a</td>
    </tr>
    <tr>
        <td>++</td>
        <td>Incremento</td>
        <td>a++ o ++a</td>
    </tr>
    <tr>
        <td>--</td>
        <td>Decremento</td>
        <td>a-- o --a</td>
    </tr>
    <tr>
        <td>!</td>
        <td>Negación lógica</td>
        <td>!a</td>
    </tr>
</table>


## 🔹 Relacionales (de comparación).
Se usan para comparar valores y devuelven un valor booleano (true o false).
<table border="1">
    <tr>
        <th>Operador</th>
        <th>Descripción</th>
        <th>Ejemplo</th>
    </tr>
    <tr>
        <td>==</td>
        <td>Igualdad</td>
        <td>a == b</td>
    </tr>
    <tr>
        <td>!=</td>
        <td>Desigualdad</td>
        <td>a != b</td>
    </tr>
    <tr>
        <td>&lt;</td>
        <td>Menor que</td>
        <td>a &lt; b</td>
    </tr>
    <tr>
        <td>&gt;</td>
        <td>Mayor que</td>
        <td>a &gt; b</td>
    </tr>
    <tr>
        <td>&lt;=</td>
        <td>Menor o igual que</td>
        <td>a &lt;= b</td>
    </tr>
    <tr>
        <td>&gt;=</td>
        <td>Mayor o igual que</td>
        <td>a &gt;= b</td>
    </tr>
</table>


## 🔹 Lógicos.
Se usan para operaciones lógicas y combinan expresiones booleanas.
<table border="1">
    <tr>
        <th>Operador</th>
        <th>Descripción</th>
        <th>Ejemplo</th>
    </tr>
    <tr>
        <td>&&</td>
        <td>AND lógico (y)</td>
        <td>a && b</td>
    </tr>
    <tr>
        <td>||</td>
        <td>OR lógico (o)</td>
        <td>a || b</td>
    </tr>
    <tr>
        <td>!</td>
        <td>NOT lógico (negación)</td>
        <td>!a</td>
    </tr>
</table>


## 🔹 De comparación especiales.
Estos operadores permiten la comparación de referencias de objetos y la verificación de tipos.
<table border="1">
    <tr>
        <th>Operador</th>
        <th>Descripción</th>
        <th>Ejemplo</th>
    </tr>
    <tr>
        <td>===</td>
        <td>Igualdad referencial (misma instancia)</td>
        <td>a === b</td>
    </tr>
    <tr>
        <td>!==</td>
        <td>Desigualdad referencial</td>
        <td>a !== b</td>
    </tr>
    <tr>
        <td>is</td>
        <td>Verificar tipo</td>
        <td>a is String</td>
    </tr>
    <tr>
        <td>!is</td>
        <td>Verificar tipo negativo</td>
        <td>a !is String</td>
    </tr>
</table>

## 🔹 De rango.
Se utilizan para trabajar con rangos de valores.
<table border="1">
    <tr>
        <th>Operador</th>
        <th>Descripción</th>
        <th>Ejemplo</th>
    </tr>
    <tr>
        <td>..</td>
        <td>Crea un rango</td>
        <td>a..b</td>
    </tr>
    <tr>
        <td>in</td>
        <td>Comprueba si un valor está en un rango</td>
        <td>x in a..b</td>
    </tr>
    <tr>
        <td>!in</td>
        <td>Comprueba si un valor no está en un rango</td>
        <td>x !in a..b</td>
    </tr>
</table>

## 🔹 De Indexación.
Se usan para acceder o modificar elementos en estructuras como listas o arrays.
<table border="1">
    <tr>
        <th>Operador</th>
        <th>Descripción</th>
        <th>Ejemplo</th>
    </tr>
    <tr>
        <td>[]</td>
        <td>Indexación (obtener valor)</td>
        <td>a[i]</td>
    </tr>
    <tr>
        <td>[] =</td>
        <td>Indexación (asignar valor)</td>
        <td>a[i] = valor</td>
    </tr>
</table>


## 🔹 De invocación de funciones.
Se usan para invocar funciones.
<table border="1">
    <tr>
        <th>Operador</th>
        <th>Descripción</th>
        <th>Ejemplo</th>
    </tr>
    <tr>
        <td>()</td>
        <td>Invocación de función</td>
        <td>funcion()</td>
    </tr>
</table>


## 🔹 De sobrecarga.
En Kotlin, muchos de los operadores pueden ser sobrecargados al implementar funciones específicas en tus clases. 
<table border="1">
    <tr>
        <th>Operador</th>
        <th>Función correspondiente</th>
    </tr>
    <tr>
        <td>+</td>
        <td>plus()</td>
    </tr>
    <tr>
        <td>-</td>
        <td>minus()</td>
    </tr>
    <tr>
        <td>*</td>
        <td>times()</td>
    </tr>
    <tr>
        <td>/</td>
        <td>div()</td>
    </tr>
    <tr>
        <td>%</td>
        <td>mod()</td>
    </tr>
    <tr>
        <td>==</td>
        <td>equals()</td>
    </tr>
</table>

## 🔹 De bit a bit.
Estos operadores se usan para realizar operaciones a nivel de bits en números enteros.
<table border="1">
    <tr>
        <th>Operador</th>
        <th>Descripción</th>
        <th>Ejemplo</th>
    </tr>
    <tr>
        <td>shl</td>
        <td>Desplazamiento a la izquierda</td>
        <td>a shl b</td>
    </tr>
    <tr>
        <td>shr</td>
        <td>Desplazamiento a la derecha</td>
        <td>a shr b</td>
    </tr>
    <tr>
        <td>ushr</td>
        <td>Desplazamiento a la derecha sin signo</td>
        <td>a ushr b</td>
    </tr>
    <tr>
        <td>and</td>
        <td>AND bit a bit</td>
        <td>a and b</td>
    </tr>
    <tr>
        <td>or</td>
        <td>OR bit a bit</td>
        <td>a or b</td>
    </tr>
    <tr>
        <td>xor</td>
        <td>XOR bit a bit</td>
        <td>a xor b</td>
    </tr>
    <tr>
        <td>inv</td>
        <td>Inversión de bits</td>
        <td>a.inv()</td>
    </tr>
</table>


## 🔹 Operadores de Elvis y de coalescencia Nula.
Estos operadores se utilizan para manejar valores nulos.
<table border="1">
    <tr>
        <th>Operador</th>
        <th>Descripción</th>
        <th>Ejemplo</th>
    </tr>
    <tr>
        <td>?:</td>
        <td>Operador Elvis (valor por defecto si es nulo)</td>
        <td>a ?: b</td>
    </tr>
</table>

## 🔹 Operadores de Llamada Segura
Se utiliza para realizar una operación solo si un objeto no es nulo.
<table border="1">
    <tr>
        <th>Operador</th>
        <th>Descripción</th>
        <th>Ejemplo</th>
    </tr>
    <tr>
        <td>?.</td>
        <td>Llamada segura (no lanza excepción si es nulo)</td>
        <td>a?.metodo()</td>
    </tr>
</table>

**Ejemplo**   
```kotlin
// Declaramos variable que puede o no ser nula. 
// El signo "?" va después del tipo para indicar posibilidad de null.
var cadenaNula: String? = null

// Invocación a ejecución condicional.
cadenaNula?.let {
    // Bloque que se ejecutará solo si la variable NO ES nula.
    println("La cadena no es nula: $it")
} ?: run {
    // Bloque que se ejecutará solo si la variable ES nula.
    println("La cadena es nula.")
}
```
>[!NOTE]
>En Kotlin, el bloque de código dentro de let recibe un argumento implícito llamado `it`, que representa el valor no nulo de la variable sobre la cual se está llamando el método let.


# 📌 Logger - Uso básico del Log
Para registrar el flujo del programa en Kotlin se emplea la clase `Log`.     
      
**¿Debo instanciar la clase?**     
No. La clase Log es una clase utilitaria, y todos sus métodos son estáticos. Esto significa que puedes llamar a sus métodos directamente sin tener que crear una instancia de la clase.     
   
Los métodos más comunes de registro son:   
- `Log.d(tag, message)` — Debug: Para mensajes de depuración que pueden ser útiles durante el desarrollo.
- `Log.i(tag, message)` — Info: Para mensajes informativos.
- `Log.w(tag, message)` — Warning: Para advertencias, eventos no críticos.
- `Log.e(tag, message)` — Error: Para mensajes de error.
- `Log.v(tag, message)` — Verbose: Para mensajes más detallados.

**¿Qué parametros espera el logger?**   
- `tag`: Es una etiqueta que identifica la clase o componente desde el que se está logueando. Se recomienda usar el nombre de la clase o algo descriptivo.
- `message`: El mensaje que deseas registrar en el log.

>[!TIP]
> Es una muy buena idea crear una constante al inicio de la clase que la identifique y usarla como tag en los logs. 

**Ejemplo**
```kotlin
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Declarar TAG como una constante dentro de la clase
    companion object {
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Loguear un mensaje de depuración (debug)
        Log.d(TAG, "Aplicación iniciada correctamente")

        // Loguear un mensaje informativo (info)
        Log.i(TAG, "Cargando datos desde el servidor")

        // Loguear una advertencia (warning)
        Log.w(TAG, "Falta conexión a internet")

        // Loguear un error
        Log.e(TAG, "Error al cargar los datos")

        // Loguear un mensaje detallado (verbose)
        Log.v(TAG, "Detalles adicionales para diagnóstico")
    }
}

```











