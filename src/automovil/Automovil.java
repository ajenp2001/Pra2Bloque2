package automovil;
public class Automovil {
    // Enumeraciones para representar valores posibles de atributos
    public enum Color {
        BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA
    }

    public enum Combustible {
        GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL
    }

    //Aqui he añadido dos tipos de automovil más para los ejemplos de la utilización de la clase en el main
    public enum TipoAutomovil {
        COCHE_CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV, SEDAN, DEPORTIVO
    }

    // Atributos privados para almacenar información sobre el automóvil
    private final String marca; // Marca del automóvil
    private final int modelo; // Año de fabricación del automóvil
    private final double motor; // Tamaño del motor en litros
    private final Combustible tipoCombustible; // Tipo de combustible
    private final TipoAutomovil tipoAutomovil; // Tipo de automóvil
    private final int numeroPuertas; // Número de puertas
    private final int cantidadAsientos; // Cantidad de asientos
    private final double velocidadMaxima; // Velocidad máxima en km/h
    private final Color color; // Color del automóvil
    private double velocidadActual; // Velocidad actual en km/h

    // Constructor para inicializar los atributos del automóvil al crear una instancia
    public Automovil(String marca, int modelo, double motor, Combustible tipoCombustible, TipoAutomovil tipoAutomovil, int numeroPuertas, int cantidadAsientos, double velocidadMaxima, Color color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = 0; // Inicializa la velocidad actual en 0 km/h
    }

    // Métodos para operar con el automóvil
    public void acelerar(double velocidad) {
        // Verifica si la velocidad actual más la velocidad a acelerar no supera la velocidad máxima
        if (this.velocidadActual + velocidad > this.velocidadMaxima) {
            System.out.println("No se puede acelerar más allá de la velocidad máxima permitida para el automóvil.");
        } else {
            this.velocidadActual += velocidad; // Aumenta la velocidad actual
        }
    }

    public void desacelerar(double velocidad) {
        // Verifica que la velocidad no sea negativa
        if (this.velocidadActual - velocidad < 0) {
            System.out.println("No es posible desacelerar a una velocidad negativa.");
        } else {
            this.velocidadActual -= velocidad; // Reduce la velocidad actual
        }
    }

    public void frenar() {
        this.velocidadActual = 0; // Frena el automóvil estableciendo la velocidad actual en 0 km/h
    }

    public double calcularTiempoEstimadoLlegada(double distancia) {
        // Calcula el tiempo estimado de llegada dividiendo la distancia por la velocidad actual
        return distancia / this.velocidadActual;
    }

    // Método para mostrar los atributos del automóvil
    public void mostrarAtributos() {
        System.out.println("Marca = " + this.marca);
        System.out.println("Modelo = " + this.modelo);
        System.out.println("Motor = " + this.motor);
        System.out.println("Tipo de combustible = " + this.tipoCombustible);
        System.out.println("Tipo de automóvil = " + this.tipoAutomovil);
        System.out.println("Número de puertas = " + this.numeroPuertas);
        System.out.println("Cantidad de asientos = " + this.cantidadAsientos);
        System.out.println("Velocidad máxima = " + this.velocidadMaxima);
        System.out.println("Color = " + this.color);
    }

public static void main(String[] args) {
    // Ejemplos de creación de instancias de Automovil y operaciones con ellos
    Automovil auto1 = new Automovil("Ford", 2018, 3.0, Automovil.Combustible.DIESEL, Automovil.TipoAutomovil.EJECUTIVO, 5, 6, 250, Automovil.Color.NEGRO);
    auto1.mostrarAtributos();
    auto1.acelerar(100);
    System.out.println("Velocidad actual = " + auto1.velocidadActual + " km/h");
    auto1.acelerar(20);
    System.out.println("Velocidad actual = " + auto1.velocidadActual + " km/h");
    auto1.desacelerar(50);
    auto1.calcularTiempoEstimadoLlegada(1000);
    System.out.println("Velocidad actual = " + auto1.velocidadActual + " km/h");
    auto1.frenar();
    System.out.println("Velocidad actual = " + auto1.velocidadActual + " km/h");
    auto1.desacelerar(10);

    System.out.println("--------------------------------------------------");

    Automovil auto2 = new Automovil("Toyota", 2020, 2.5, Automovil.Combustible.GASOLINA, Automovil.TipoAutomovil.SEDAN, 4, 5, 220, Automovil.Color.AZUL);
    auto2.mostrarAtributos();
    auto2.acelerar(90);
    System.out.println("Velocidad actual = " + auto2.velocidadActual + " km/h");
    auto2.acelerar(30);
    System.out.println("Velocidad actual = " + auto2.velocidadActual + " km/h");
    auto2.desacelerar(50);
    System.out.println("Velocidad actual = " + auto2.velocidadActual + " km/h");
    auto2.frenar();
    System.out.println("Velocidad actual = " + auto2.velocidadActual + " km/h");
    auto2.desacelerar(10);
    System.out.println("--------------------------------------------------");

    Automovil auto3 = new Automovil("Chevrolet", 2019, 2.0, Automovil.Combustible.GASOLINA, Automovil.TipoAutomovil.SUBCOMPACTO, 4, 5, 180, Automovil.Color.ROJO);
    auto3.mostrarAtributos();
    auto3.acelerar(80);
    System.out.println("Velocidad actual = " + auto3.velocidadActual + " km/h");
    auto3.acelerar(10);
    System.out.println("Velocidad actual = " + auto3.velocidadActual + " km/h");
    auto3.desacelerar(30);
    System.out.println("Velocidad actual = " + auto3.velocidadActual + " km/h");
    auto3.frenar();
    System.out.println("Velocidad actual = " + auto3.velocidadActual + " km/h");
    auto3.acelerar(190);
    System.out.println("Velocidad actual = " + auto3.velocidadActual + " km/h");
}
}

































