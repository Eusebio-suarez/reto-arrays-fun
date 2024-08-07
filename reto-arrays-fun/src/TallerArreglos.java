import java.util.Arrays;

public class TallerArreglos {
    public static void main(String[] args) {
        // 1. Declaración e inicialización de un arreglo
        int[] numeros = {5, 2, 8, 1, 9, 3, 7, 4, 6};

        // 2. Imprimir el arreglo original
        System.out.println("Arreglo original:");
        imprimirArreglo(numeros);

        // 3. Encontrar el número mayor
        int mayor = encontrarMayor(numeros);
        System.out.println("El número mayor es: " + mayor);

        // 4. Calcular el promedio
        double promedio = calcularPromedio(numeros);
        System.out.println("El promedio es: " + promedio);

        // 5. Invertir el arreglo
        invertirArreglo(numeros);
        System.out.println("Arreglo invertido:");
        imprimirArreglo(numeros);

        // 6. Ordenar el arreglo (implementa el método ordenarArreglo)
        ordenarArreglo(numeros);
        System.out.println("Arreglo ordenado:");
        imprimirArreglo(numeros);
    }

    // Método para imprimir el arreglo
    public static void imprimirArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Método para encontrar el número mayor
    public static int encontrarMayor(int[] arr) {
        int mayor = arr[0];
        for (int i = 1; i < arr.length; i++) { // Comenzamos desde el segundo elemento
                if (arr[i] > mayor) {
                    mayor = arr[i]; // Actualizamos el mayor si encontramos un elemento más grande
                }
        }
            return mayor; // Devolvemos el mayor valor encontrado
        }

    // Método para calcular el promedio
    public static double calcularPromedio(int[] numeros) {
        double promedio = 0;
        for (int i = 0; i <numeros.length; i++){
            promedio+=numeros[i];
        }
        return promedio/numeros.length;
    }

    // Método para invertir el arreglo
    public static void invertirArreglo(int[] numeros) {
        int n = numeros.length;
        for (int i = 0; i < n / 2; i++) {
            int temp= numeros[i];
            numeros[i] = numeros[n - 1 - i];
            numeros[n - 1 - i] = temp;
        }
    }

    // Método para ordenar el arreglo (puedes usar el algoritmo de burbuja)
    public static void ordenarArreglo(int[] arr) {
        int [] arrayordenado;
        Arrays.sort(arr);
    }
}