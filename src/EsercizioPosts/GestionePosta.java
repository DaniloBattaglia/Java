package EsercizioPosts;

public class GestionePosta {
    public static void main(String[] args) {
        Posta posta = new Posta();

        // Aggiungo persone
        Persona p1 = new Persona("Marco");
        Persona p2 = new Persona("Anna");
        Persona p3 = new Persona("Luca");

        posta.entraInCoda(p1);
        posta.entraInCoda(p2);
        posta.entraInCoda(p3);


        // Mostro la coda
        posta.mostraCoda();

        // Prossimo da servire
        System.out.println("Prossimo da servire: " + posta.chiEIlProssimo());

        // Servo due persone
        System.out.println("Servito: " + posta.servireProssimo());
        System.out.println("Servito: " + posta.servireProssimo());

        // Mostro la coda rimanente
        posta.mostraCoda();
    }
}

