import java.util.Scanner;
class Clientes {
    // Atributos privados
    private double consumo1;
    private double consumo2;
    private double consumo3;
    private double consumo4;
    // Métodos 'get' y 'set' para cada consumo
    public double getConsumo1() {
        return consumo1;
    }
    public void setConsumo1(double consumo1) {
        this.consumo1 = consumo1;
    }
    public double getConsumo2() {
        return consumo2;
    }
    public void setConsumo2(double consumo2) {
        this.consumo2 = consumo2;
    }
    public double getConsumo3() {
        return consumo3;
    }
    public void setConsumo3(double consumo3) {
        this.consumo3 = consumo3;
    }
    public double getConsumo4() {
        return consumo4;
    }
    public void setConsumo4(double consumo4) {
        this.consumo4 = consumo4;
    }
    // Método para obtener el total de los consumos
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