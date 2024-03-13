//34

Un algoritmo es un conjunto ordenado de instrucciones diseñado para resolver un problema o realizar una tarea específica. 
Se caracteriza por ser preciso, finito y efectivo, produciendo un resultado esperado en un número finito de pasos. 

//35

public class FactorialIterativo {
    public static int calcularFactorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        int numero = 5; // Cambia este valor por el número deseado
        System.out.println("El factorial de " + numero + " es: " + calcularFactorial(numero));
    }
}
//c
#include <stdio.h>

int calcularFactorial(int n) {
    int resultado = 1;
    for (int i = 1; i <= n; i++) {
        resultado *= i;
    }
    return resultado;
}

int main() {
    int numero = 5; // Cambia este valor por el número deseado
    printf("El factorial de %d es: %d\n", numero, calcularFactorial(numero));
    return 0;
}

public class FactorialRecursivo {
    public static int calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int numero = 5; // Cambia este valor por el número deseado
        System.out.println("El factorial de " + numero + " es: " + calcularFactorial(numero));
    }
}

//c
#include <stdio.h>

int calcularFactorial(int n) {
    if (n == 0 || n == 1) {
        return 1;
    } else {
        return n * calcularFactorial(n - 1);
    }
}

int main() {
    int numero = 5; // Cambia este valor por el número deseado
    printf("El factorial de %d es: %d\n", numero, calcularFactorial(numero));
    return 0;
}

//36


La notación O(n) representa la complejidad asintótica de un algoritmo, donde n es el tamaño del problema. 
Se define como el conjunto de funciones que crecen a lo sumo proporcionalmente a una función lineal de n cuando n tiende a infinito.

//37

//38 
Este método simplemente devuelve el primer elemento de la lista, lo que implica una operación de acceso que no varía con el tamaño de la lista. 
Por lo tanto, la complejidad temporal es constante.

//39

FactorialIterativo:(O(n))
FactorialRecursivo:(O(2^n))
el enfoque iterativo es más eficiente que el enfoque recursivo para calcular factoriales, especialmente para valores grandes de 
n, debido a su complejidad temporal lineal en comparación con la complejidad exponencial del enfoque recursivo.

//42

la complejidad temporal del algoritmo l en términos de n en Java es cuadrática, (2)O(n2 ).
Esto significa que el tiempo de ejecución del algoritmo aumenta cuadráticamente con el tamaño del conjunto A.

//44

public static boolean buscar(int e, int[] array)
{
    for (int i = 0; i < array.length; i++) 
    {
        if (array[i] == e) 
        {
            return true; // Se encontró el elemento
        }
    }
    return false; // El elemento no se encontró
}

//46

public static int fibonacciRecursivo(int n) 
{
    if (n <= 1) 
    {
        return n;
    }
    return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
}

//47

A medida que el tamaño de la entrada aumenta, el tiempo de ejecución del método sumaNPrimeros() también aumenta de manera lineal, 
lo que sugiere una complejidad temporal (O(n)).

//49
La definición \( T(n) \in O(f(n)) \) indica que la función \( T(n) \) está en el orden de \( f(n) \), 
lo que significa que \( T(n) \) es acotada superiormente por una constante \( k \) multiplicada por \( f(n) \). 
Esto implica que para valores de \( n \) mayores que \( n_0 \), \( T(n) \) no crece más rápido que \( f(n) \).

//51
Para estudiar de forma comparativa el crecimiento de las funciones dadas:

1. \( f_0(x) = 1 \) es constante, su valor no cambia con \( x \).
2. \( f_1(x) = x \) es lineal, su crecimiento es proporcional a \( x \).
3. \( f_2(x) = x^2 \) es cuadrática, su crecimiento es proporcional al cuadrado de \( x \).
4. \( f_3(x) = \log_2(x) \) es logarítmica, su crecimiento es lento y se estabiliza a medida que \( x \) aumenta.
5. \( f_4(x) = 2^x \) es exponencial, su crecimiento es rápido y se acelera a medida que \( x \) aumenta.

//53

En un ArrayList no ordenado, la inserción en el peor caso es de complejidad O(n), ya que puede requerir desplazar todos los elementos para hacer espacio. 
En un ArrayList ordenado, la inserción también es O(n) en el peor caso, debido a la búsqueda del lugar correcto y el posible desplazamiento de elementos.
En resumen, la complejidad de inserción puede variar dependiendo de si el ArrayList está ordenado o no, pero en ambos casos, es O(n) en el peor caso.

//54
Para calcular el tiempo requerido para diferentes números de ejecuciones, teniendo en cuenta que una instrucción tarda 10 ns:

1. Para log(n): 20 ns (para n = 100), 30 ns (para n = 100,000)
2. Para n: 1 µs (para n = 100), 100 ms (para n = 100,000)
3. Para n log(n): 200 µs (para n = 100), 30 s (para n = 100,000)
4. Para n^2: 100 µs (para n = 100), 10 s (para n = 100,000)
5. Para n^8: 10 ms (para n = 100), 3.17 × 10^12 años (para n = 100,000)
6. Para 10n: 1 µs (para n = 100), 100 ms (para n = 100,000)












