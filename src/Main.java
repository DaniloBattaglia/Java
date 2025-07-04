package Esame_java2;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Studente("Danilo", "Battaglia", "S123");
        Persona p2 = new Professore("Marco", "Verdi", "Matematica");
        Persona p3 = new Persona("Anna", "Neri");

        Persona[] persone = {p1, p2, p3};

        for (Persona p : persone) {
            p.Presentati();
        }
    }
}
