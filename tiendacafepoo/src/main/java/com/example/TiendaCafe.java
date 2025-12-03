package com.example;

public class TiendaCafe {
    public static void main(String[] args) {
        System.out.println("=== TIENDA DE CAFE COLOMBIANO ===");

        // Crear 3 objetos Cafe
        Cafe cafe1 = new Cafe("Cafe de Nariño", "Nariño", 35000, 50.5f);
        Cafe cafe2 = new Cafe("Cafe de Antioquia", "Antioquia", 32000, 75.2f);
        Cafe cafe3 = new Cafe("Cafe del Eje Cafetero", "Caldas", 38000, 42.8f);

        // Mostrar información
        System.out.println("\n--- Informacion de los Cafes ---");
        cafe1.mostrarInformacion();
        cafe2.mostrarInformacion();
        cafe3.mostrarInformacion();

        // Calcular precios totales
        System.out.println("--- Precios Totales ---");
        System.out.println("Total Cafe Nariño: $" + cafe1.calcularPrecioTotal() + " COP");
        System.out.println("Total Cafe Antioquia: $" + cafe2.calcularPrecioTotal() + " COP");
        System.out.println("Total Cafe Eje Cafetero: $" + cafe3.calcularPrecioTotal() + " COP");

        // Actualizar cantidad
        System.out.println("\n--- Actualizando Cantidad ---");
        cafe1.actualizarCantidad(40.0f);

        // Mostrar información actualizada
        System.out.println("\n--- Informacion Actualizada ---");
        cafe1.mostrarInformacion();
    }
}