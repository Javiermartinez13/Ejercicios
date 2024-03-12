package Ejercicios;

import java.util.Scanner;

//1
Explique qué es un método recursivo.

Un método recursivo en Java es una función que se llama a sí misma para resolver un problema dividiéndolo en instancias más pequeñas.
Debe tener un caso base que define la condición de término. 
Cada llamada recursiva reduce el problema hasta alcanzar el caso base.

//3
¿En qué consiste el problema de las Torres de Hanoi? ¿Cómo puede resolverse?

El problema de las Torres de Hanoi consiste en mover una torre de discos de un poste a otro,
utilizando un tercer poste como auxiliar, siguiendo reglas específicas. Se resuelve de manera recursiva: 
mover n-1 discos al poste auxiliar, mover el disco más grande al destino y luego mover los n-1 discos al destino, 
utilizando el origen como auxiliar. 
Este enfoque garantiza que se cumplan las reglas de no colocar discos más grandes sobre discos más pequeños. 

//5
¿Por qué la ejecución de un método recursivo puede levantaruna 
excepción de desbordamiento de pila con la misma entrada 
que la versiónno recursiva no provoca tal excepción?

La ejecución de un método recursivo puede causar desbordamiento de pila si realiza demasiadas llamadas, 
llenando la memoria de la pila. Esto se debe a que cada llamada recursiva agrega un nuevo marco a la pila. 
La versión no recursiva puede no experimentar este problema, 
ya que utiliza estructuras iterativas que no generan nuevos marcos en la pila en cada iteración, 
optimizando el uso de memoria.

public class Ejercicio {
    //4
      public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el límite Inferior:");
        double limInf = scanner.nextDouble();
        System.out.println("Ingrese el límite Superior:");
        double limSup = scanner.nextDouble();
        System.out.println("Ingrese la altura:");
        double h = scanner.nextDouble();
        double resultado = integralEXCuadrado(limInf, limSup, h);
        System.out.println("El resultado de la integral de e^x^2 en el intervalo (" + limInf + "," + limSup + ") con h = " + h + " es: " + resultado);
    }

    public static double integralEXCuadrado(double limInf, double limSup, double h) 
    {
        if (limInf >= limSup) 
        {
            return 0;
        } 
        else 
        {
            double x = limInf + h;
            return h * Math.exp(x * x) + integralEXCuadrado(x, limSup, h);
        }
    }
    
    //6
    public static void main(String[] args) 
    {
        String cadena = " Hola ";
        int resultado = sumaCodigos(cadena);
        System.out.println("La suma de los códigos de la cadena " + cadena + " es: " + resultado);
    }

    public static int sumaCodigos(String str) 
    {
        return sumaCodigosRecursiva(str, 0);
    }

    private static int sumaCodigosRecursiva(String str, int index) 
    {
        if (index == str.length()) 
        {
            return 0; 
        } 
        else 
        {
            char caracter = str.charAt(index);
            return (int) caracter + sumaCodigosRecursiva(str, index + 1);
        }
    }

    //7
    public static void main(String[] args) 
    {
        String mensaje = "Hola Mundo";
        int desplazamiento = 3;
        String mensajeCifrado = cifrarCadena(mensaje, desplazamiento);
        System.out.println("Mensaje cifrado: " + mensajeCifrado);

    }
    
        public static String cifrarCadena(String str, int desplazamiento) 
        {
            if (str.isEmpty()) 
            {
                return ""; 
            }
            else 
            {
                char caracter = str.charAt(0);
                char caracterCifrado = cifrarCaracter(caracter, desplazamiento);
                return caracterCifrado + cifrarCadena(str.substring(1), desplazamiento);
            }
        }
    
        private static char cifrarCaracter(char caracter, int desplazamiento) 
        {
            if (Character.isLetter(caracter)) 
            {
                char base = Character.isUpperCase(caracter) ? 'A' : 'a';
                return (char) ((caracter - base + desplazamiento) % 26 + base);
            } 
            else 
            {
                return caracter; 
            }
        }

    //8
    public static void main(String[] args) 
    {
        String cadena = "Llego mañana";
        String resultado = conCodigoPar(cadena);
        System.out.println("Cadena con códigos pares: " + resultado);

    }
    
        public static String conCodigoPar(String str) 
        
        {
            if (str.isEmpty()) {
                return ""; // Caso base: cadena vacía
            } 
            else 
            {
            char caracter = str.charAt(0);

                if ((int) caracter % 2 == 0) 
                {
                    return caracter + conCodigoPar(str.substring(1));
                } 
                else 
                {
                    return conCodigoPar(str.substring(1));
                }
            }
        }
    



}


