public class App {
    public static void main(String[] args) throws Exception {

        Persona persona = new Persona();

        persona.setEdad(25);
        persona.setNombre("Ana");
        persona.setTelefono("3005650009");


        System.out.println("Hola " + persona.getNombre() + ", Veo que tienes " + persona.getEdad() + " años y que tu número de teléfono es " + persona.getTelefono() + ". Mucho gusto!");
    }

}

class Persona {
    private int Edad;
    private String Nombre;
    private String Telefono;
    
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getEdad() {
        return this.Edad;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getTelefono() {
        return this.Telefono;
    }
}