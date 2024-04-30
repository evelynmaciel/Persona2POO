public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    double estatura;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad<0) {
            System.out.println(" edad es invilida");
            
        }else{
            this.edad = edad;
        }
        
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        if (estatura<0) {
            System.out.println("estatura invalida");
            
        } else{
            this.estatura = estatura;
        }
        
    }

    public void mostrarNombre() {
        System.out.println(" mi nombre es: " + this.nombre);

    }

    public void mostrarApellido() {
        System.out.println("mi apellido es: " + this.apellido);
    }


    public void mostrarEstatura(){
        System.out.println("mi estatura es: " +this.estatura);
      
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", estatura=" + estatura + "]";
        
    }
}