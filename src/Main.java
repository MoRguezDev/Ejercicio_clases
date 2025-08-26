public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Libros
        Libros libro1 = new Libros("El Quijote", "Cervantes");
        libro1.consultar();

        // Crear un objeto de la clase Animal
        Animal animal1 = new Animal("Perro", "Firulais");
        animal1.comer();
        animal1.dormir();

        // Crear un objeto de la clase Coche
        Coche coche1 = new Coche("Seat", 150);
        coche1.arrancar();
        coche1.acelerar();
        coche1.frenar();
    }
}
