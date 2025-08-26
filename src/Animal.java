public class Animal {
    String especie;
    String nombre;

    // Constructor
    public Animal(String especie, String nombre) {
        this.especie = especie;
        this.nombre = nombre;
    }

    public void comer(){
        System.out.println("El animal con nombre " + nombre + " está comiendo");
    }

    public void dormir(){
        System.out.println("El animal de especie " + especie + " y con nombre " + nombre + " está durmiendo");
    }
}