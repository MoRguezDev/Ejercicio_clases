public class Coche {
    String marca;
    Motor motor;

    // Constructor
    public Coche(String marca, int caballos){
        this.marca = marca;
        this.motor = new Motor(caballos);
    }

    // Método para arrancar el coche
    public void arrancar(){
        motor.arrancar();
    }

    // Método para acelerar el coche
    public void acelerar(){
        System.out.println("El coche de marca " + marca + " acelera");
    }

    // Método para frenar el coche
    public void frenar(){
        System.out.println("El coche de marca " + marca + " frena");
    }
}
