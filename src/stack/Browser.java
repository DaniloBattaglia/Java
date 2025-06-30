package stack;

import java.util.Stack;

public class Browser {
    Stack<String> cronologia = new Stack<>();

    void visita(String url) {
        cronologia.push(url);
        System.out.println("Visito: " + url);
    }

    void indietro() {
    	
    	
        if (cronologia.size() > 1) {
            cronologia.pop();
            System.out.println("Torno a: " + cronologia.peek());
        } else {
            System.out.println("Nessuna pagina precedente.");
        }
    }

    void mostraCronologia() {
    	
    	
        System.out.println("Cronologia:");
        for (int i = cronologia.size() - 1; i >= 0; i--) {
            System.out.println("- " + cronologia.get(i));
        
        }
    }
}

