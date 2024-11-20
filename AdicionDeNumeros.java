import java.util.ArrayList;
import java.util.Scanner;
// Clase de prueba para verificar la sobrecarga de métodos
public class AdicionDeNumeros {
     public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        // Crear un objeto de la clase Adicion
        Adicion adicion = new Adicion();
        // Verificación con dos parámetros
        System.out.print("Ingrese el primer número para sumar: ");
        int num1 = lectura.nextInt();
        System.out.print("Ingrese el segundo número para sumar: ");
        int num2 = lectura.nextInt();
        int resultado2 = adicion.sumar(num1, num2);
        System.out.println("Resultado de la suma de dos números: " + resultado2);
        // Verificación con tres parámetros
        System.out.print("\nIngrese el tercer número para sumar: ");
        int num3 = lectura.nextInt();
        int resultado3 = adicion.sumar(num1, num2, num3);
         System.out.println("Resultado de la suma de tres números: " + resultado3);
        // Verificación con cuatro parámetros
        System.out.print("\nIngrese el cuarto número para sumar: ");
        int num4 = lectura.nextInt();
        int resultado4 = adicion.sumar(num1, num2, num3, num4);
        System.out.println("Resultado de la suma de cuatro números: " + resultado4);
        // Verificación con cinco parámetros
        System.out.print("\nIngrese el quinto número para sumar: ");
        int num5 = lectura.nextInt();
        int resultado5 = adicion.sumar(num1, num2, num3, num4, num5);
        System.out.println("Resultado de la suma de cinco números: " + resultado5);

    }
}