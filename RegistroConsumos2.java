import java.util.ArrayList;
import java.util.Scanner;

public class RegistroConsumos2 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        // Crear un objeto de la clase Clientes
        Clientes cliente = new Clientes();
        
        // Solicitar al usuario que ingrese los consumos
        System.out.print("Ingrese el consumo 1: ");
        cliente.setConsumo1(lectura.nextDouble());
        System.out.print("Ingrese el consumo 2: ");
        cliente.setConsumo2(lectura.nextDouble());
        System.out.print("Ingrese el consumo 3: ");
        cliente.setConsumo3(lectura.nextDouble());
        System.out.print("Ingrese el consumo 4: ");
        cliente.setConsumo4(lectura.nextDouble());
        
        // Mostrar los resultados
        System.out.println("\nTotal de consumos: " + cliente.obtenerTotal());
        System.out.println("Promedio de consumos: " + cliente.obtenerPromedio());
        System.out.println("Mayor consumo: " + cliente.obtenerMayor());
        System.out.println("Menor consumo: " + cliente.obtenerMenor());

            }
}