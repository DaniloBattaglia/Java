package gestionale;

public class Professore extends Persona {
    private String dipartimento;

    public Professore(String nome, String cognome, double stipendio, String dipartimento) {
        super(nome, cognome, stipendio);
        this.dipartimento = dipartimento;
    }

    public String getDipartimento() {
        return dipartimento;
    }

    @Override
    public String getDettagli() {
        return "Professore - Dipartimento: " + dipartimento;
    }
}

