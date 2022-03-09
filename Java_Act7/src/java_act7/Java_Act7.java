package java_act7;

import java.util.Scanner;

public class Java_Act7 {

    public static int[] calcularPrimos(int cantidad) {
        int[] primos = new int[cantidad];
        int posicion = 0;
        int numero = 2;

        //Se reccore la cantidad de numeros indicados por el usuario
        //Y se evalua si es primo o no
        while(primos[primos.length-1] == 0){
            if (esPrimo(numero)) {
                primos[posicion] = numero;
                posicion++;
            }
            numero++;
        }
        return primos;
    }

    public static boolean esPrimo(int numero) {
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            if (numero % x == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static int[] calcularFibonacci(int cantidad){
        
        int[] fibonacci = new int[cantidad];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        int n2 = 1;
        int posicion = 2;
        

        //Se reccore la cantidad de numeros indicados por el usuario
        //Y se evalua si es primo o no
        while(fibonacci[fibonacci.length-1] == 0){
            fibonacci[posicion] = fibonacci[posicion-1] + fibonacci[posicion-2];
            posicion++;
        }
        return fibonacci;
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.println("");
            }
            System.out.print(array[i] + ", ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tope = 10;
        System.out.println("Indique la cantidad de numeros que quiere calcular");
        tope = entrada.nextInt();
        
        imprimirArray(calcularPrimos(tope));
        imprimirArray(calcularFibonacci(tope));
    }
}
