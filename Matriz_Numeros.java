import java.util.Scanner;
/**
Matriz ingresada:
1 2 3 
4 5 6 
7 8 9 

Suma de los n�meros impares: 25
Cantidad de n�meros pares: 4
 */
public class Matriz_Numeros {
    public static void main(String[] args) {
        // Crear una matriz de 3x3
        int[ ][ ] matriz = new int[3][3];
        Scanner lectura = new Scanner(System.in);
                // Variables para la suma de los números impares y el conteo de números pares
        int sumaImpares = 0;
        int cantidadPares = 0;
        int i,j;
                // Registrar los números en la matriz
        System.out.println("Ingrese los números enteros en una matriz de 3x3:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("Ingrese el número en la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = lectura.nextInt();
                                // Verificar si el número es impar o par
                if (matriz[i][j] % 2 == 0) {
                    cantidadPares++;  // Contar los números pares
                } else {
                    sumaImpares += matriz[i][j];  // Sumar los números impares
                }
            }
        }
                // Visualizar la matriz ingresada
        System.out.println("\nMatriz ingresada:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        // Mostrar resultados
        System.out.println("\nSuma de los números impares: " + sumaImpares);
        System.out.println("Cantidad de números pares: " + cantidadPares);
                
    }
}
