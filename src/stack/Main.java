package stack;

public class Main {
    public static void main(String[] args) {
        Browser b = new Browser();

        b.visita("google.com");
        b.visita("youtube.com");
        b.visita("wikipedia.org");
        b.visita(null);
        b.visita("instagram.com");
        b.visita("masterchef.it");

        b.indietro(); 
        b.indietro();
       

        b.mostraCronologia();
    }
}

