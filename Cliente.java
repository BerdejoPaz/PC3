import java.util.Scanner;

class Cliente {
    // Atributos
    private double consumo1;
    private double consumo2;
    private double consumo3;
    private double consumo4;

    // Constructor para inicializar los consumos
    public Cliente(double consumo1, double consumo2, double consumo3, double consumo4) {
        this.consumo1 = consumo1;
        this.consumo2 = consumo2;
        this.consumo3 = consumo3;
        this.consumo4 = consumo4;
    }

    // Métodos para obtener el total de los consumos
    public double obtenerTotal() {
        return consumo1 + consumo2 + consumo3 + consumo4;
    }

    // Método para obtener el promedio de los consumos
    public double obtenerPromedio() {
        return obtenerTotal() / 4;
    }

    // Método para obtener el mayor consumo
    public double obtenerMayor() {
        return Math.max(consumo1, Math.max(consumo2, Math.max(consumo3, consumo4)));
    }

    // Método para obtener el menor consumo
    public double obtenerMenor() {
        return Math.min(consumo1, Math.min(consumo2, Math.min(consumo3, consumo4)));
    }
}