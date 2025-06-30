package EsercizioPosts;

public class GestionePosta {
    public static void main(String[] args) {
        Posta posta = new Posta();

        // Aggiungo persone
        posta.entraInCoda(new Persona("Marco"));
        posta.entraInCoda(new Persona("Anna"));
        posta.entraInCoda(new Persona("Luca"));

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

