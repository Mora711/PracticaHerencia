import java.util.Date;
public class Persona {
    String nombre;
    String primerApellido;
    String segundoApellido;
    String DNI;
    Date fechaNacimiento;

    public Persona() {

    }

    public Persona(String nombre, String primerApellido, String segundoApellido, String DNI, Date fechaNacimiento) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.DNI = DNI;
        this.fechaNacimiento = fechaNacimiento;
    }
}
