import java.util.Date;
public class Paciente extends Persona {
    String codPaciente;
    String numeroSeguridadSocial;

    public Paciente() {

    }

    public Paciente(String codPaciente, String numeroSeguridadSocial) {
        this.codPaciente = codPaciente;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }
}
