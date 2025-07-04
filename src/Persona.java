package Esame_java2;

public class Persona {

	String nome;
	String cognome;
	
	public Persona (String nome, String cognome) {
	
	this.nome = nome;
	this.cognome = cognome;
			
	}	
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCognome() {
		return cognome;
	}



	public void setCognome(String cognome) {
		this.cognome = cognome;
	}



	public void Presentati() {
		System.out.println("Ciao, sono " + nome + " " + cognome);
	}
	
}
