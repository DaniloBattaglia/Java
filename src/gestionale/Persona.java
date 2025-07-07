package gestionale;

public abstract class Persona {
    protected String nome;
    protected String cognome;
    protected double stipendio;

    public Persona(String nome, String cognome, double stipendio) {
        this.nome = nome;
        this.cognome = cognome;
        this.stipendio = stipendio;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }
    
    public double getStipendio() {
    	return stipendio;
    }

    public abstract String getDettagli(); 
}
