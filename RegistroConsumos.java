import java.util.ArrayList;
import java.util.Scanner;

public class RegistroConsumos {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese los consumos
        System.out.print("Ingrese el consumo 1: ");
        double consumo1 = lectura.nextDouble();
        System.out.print("Ingrese el consumo 2: ");
        double consumo2 = lectura.nextDouble();
        System.out.print("Ingrese el consumo 3: ");
        double consumo3 = lectura.nextDouble();
        System.out.print("Ingrese el consumo 4: ");
        double consumo4 = lectura.nextDouble();
        
        // Crear un objeto de la clase Cliente con los consumos ingresados
        Cliente cliente = new Cliente(consumo1, consumo2, consumo3, consumo4);
        
        // Mostrar los resultados
        System.out.println("\nTotal de consumos: " + cliente.obtenerTotal());
        System.out.println("Promedio de consumos: " + cliente.obtenerPromedio());
        System.out.println("Mayor consumo: " + cliente.obtenerMayor());
        System.out.println("Menor consumo: " + cliente.obtenerMenor());
      
    }
}