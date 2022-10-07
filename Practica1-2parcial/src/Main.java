public class Main {
    public static void main (String [] args) {
        Ciudad c1 = new Ciudad("123", "La Paz");
        Ciudad c2 = new Ciudad("132", "Cochabamba");
        Ciudad c3 = new Ciudad("231", "Santa Cruz");
        Ciudad c4 = new Ciudad("213", "Potosi");
        Ciudad c5 = new Ciudad("321", "Beni");
        Ciudad c6 = new Ciudad("312", "Sucre");

        Paciente p1 = new Paciente();
        Paciente p2 = new Paciente();
        Paciente p3 = new Paciente();

        Historial h1 = new Historial("01P1",p1);
        Historial h2 = new Historial("02P2",p2);
        Historial h3 = new Historial("03P3",p3);

        Persona p1 = Persona();
        Persona p2 = Persona();
        Persona p3 = Persona();

        Medico m1 = new Medico();
        Medico m2 = new Medico();
        Medico m3 = new Medico();
        Medico m4 = new Medico();
    }
}
