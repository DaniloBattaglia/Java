package Esame_java2;

public class Studente extends Persona {

	private String matricola;
	
	public Studente(String nome, String cognome, String matricola) {
		
		super(nome, cognome);
		this.matricola = matricola;
		
	}
	
	@Override
	public void Presentati() {
		System.out.println("Sono lo studente " + getNome() + " " + getCognome() + ", matricola: " + matricola);
	}
	
}
