package Esame_java;

public class Main {
    public static void main(String[] args) {
        Studente s1 = new Studente("Danilo", "Battaglia", 1996);
        Studente s2 = new Studente("Luisa", "Verdi", 2003);

        s1.stampaScheda();
        s2.stampaScheda();
    }
}

