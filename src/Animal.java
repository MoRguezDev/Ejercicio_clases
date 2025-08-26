public class Animal {
    String especie = "Mamífero";
    String nombre = "ElPerroDelVecino";

    public void comer(){
        System.out.println("El animal con nombre " + nombre + " está comiendo");
    }

    public void dormir(){
        System.out.println("El animal de especie " + especie + " y con nombre " + nombre + " está durmiendo");
    }
}