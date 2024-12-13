# Proyecto de Estructuras Lineales

## Descripción

Este proyecto contiene soluciones a ejercicios prácticos sobre **estructuras de datos lineales**, específicamente utilizando pilas (Stacks). Se implementaron dos ejercicios principales:

1. **Ejercicio 01: Validación de Signos**: 
   - Este ejercicio se centra en la validación de cadenas de caracteres que contienen paréntesis, llaves y corchetes. La tarea consiste en verificar si los signos están correctamente balanceados y anidados.
   
2. **Ejercicio 02: Ordenar un Stack**: 
   - En este ejercicio, se implementa un algoritmo para ordenar una pila utilizando una pila adicional. El algoritmo coloca los elementos más pequeños en la cima de la pila.

## Requerimientos

- Java 11 o superior.
- Librerías estándar de Java (no se requieren librerías externas).

## Estructura del Proyecto

La estructura de directorios del proyecto es la siguiente:

src/ │ ├── Materia/ │ ├── Ejercicio_01_sign/ │ │ ├── StackValidator.java │ │ └── StackValidatorTest.java │ ├── Ejercicio_02_sorting/ │ │ ├── StackSorter.java │ │ ├── StackSorterTest.java │ └── Stacks/ │ ├── Stack.java │ └── StackGeneric.java


### Descripción de los Ejercicios

#### Ejercicio 01: Validación de Signos

**Objetivo**: Verificar si una cadena que solo contiene los caracteres '(', ')', '{', '}', '[' y ']' está balanceada.

**Implementación**: 
Para este ejercicio se utiliza una pila (`Stack`) para almacenar los signos de apertura. A medida que recorremos la cadena, cada vez que encontramos un signo de apertura (como `(`), lo apilamos. Cuando encontramos un signo de cierre (como `)`), comprobamos si el signo en la cima de la pila es el correspondiente de apertura. Si es así, lo desapilamos; de lo contrario, la cadena no está balanceada.

**Método utilizado**:
- `isValid(String s)` en la clase `StackValidator`.

**Casos de prueba**:
- Entrada: `"([]){}"`
  - Salida: `true` (Balanceado)
- Entrada: `"({)}"`
  - Salida: `false` (No balanceado)

#### Ejercicio 02: Ordenar un Stack

**Objetivo**: Ordenar una pila de enteros de tal manera que el elemento más pequeño quede en la cima.

**Implementación**:
En este ejercicio, se utiliza una pila temporal (`tempStack`) para almacenar los elementos mientras se ordenan. El algoritmo funciona de la siguiente manera:
1. Sacamos elementos de la pila original.
2. Insertamos cada elemento en su posición correspondiente en la pila temporal.
3. Finalmente, transferimos los elementos de la pila temporal de vuelta a la pila original para que estén ordenados.

**Método utilizado**:
- `sort(StackGeneric<T> stack)` en la clase `StackSorter`.

**Casos de prueba**:
- Entrada: `5 -> 1 -> 4 -> 2`
  - Salida: `1 -> 2 -> 4 -> 5`

## Cómo ejecutar el proyecto

1. **Clonar el repositorio**:
git clone https://github.com/tu-usuario/repositorio.git


2. **Compilar y ejecutar el código**:
Asegúrate de tener Java instalado en tu sistema y usa el siguiente comando para compilar:
javac -d bin src/Materia/Ejercicio_02_sorting/.java src/Ejercicio_01_sign/.java src/Materia/Stacks/*.java
Luego, ejecuta el programa:

3. **Ejecutar pruebas unitarias**:
Si has incluido pruebas unitarias, puedes ejecutarlas utilizando un marco de pruebas como **JUnit**. Asegúrate de tener JUnit instalado y usa los siguientes comandos para ejecutarlas:

## Versiones

**Versión 2.0.2** - Estructuras Lineales – Ejercicios

- **Funcionalidad agregada**: Implementación de dos ejercicios relacionados con las pilas:
- **Ejercicio 01**: Validación de signos utilizando una pila.
- **Ejercicio 02**: Ordenación de una pila utilizando otra pila temporal.

## Autor

- **Monica Peralta**  
- Estudiante de la carrera de Ciencias de la Computación.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT.


