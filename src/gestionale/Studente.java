package gestionale;

public class Studente extends Persona{
	
	private String matricola;
	
	public Studente(String nome, String cognome, double stipendio, String matricola) {
		super(nome, cognome , stipendio);
		this.matricola = matricola;
	} 
	
	public String getMatricola() {
		return matricola;
	}
	
	@Override
	public String getDettagli() {
		return "Studente - Matricola: " + matricola;
	}
	
	
}
