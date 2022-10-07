import java.util.Date;
import java.util.List;

public class Medico extends Persona{
    String codmedico;
    List <Servicio> servicios;
    Hospital hospital;

    public Medico() {
    }

    public Medico(String codmedico, List<Servicio> servicios, Hospital hospital) {
        this.codmedico = codmedico;
        this.servicios = servicios;
        this.hospital = hospital;
    }
}
