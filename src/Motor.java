public class Motor {
    int caballos;
    
    // Constructor
    public Motor(int caballos){
        this.caballos = caballos;
    }

    // Método para arrancar el motor
    public void arrancar(){
        System.out.println("El motor de " + caballos + " caballos arranca");
    }
}
