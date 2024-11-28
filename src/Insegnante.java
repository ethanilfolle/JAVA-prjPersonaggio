public class Insegnante extends Personaggio{
    private String ruolo;

    public Insegnante(String nome, int esperienza, String ruolo) {
        super(nome, esperienza);
        this.ruolo = ruolo;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public String partecipa (){
        return "Sto lavorando da: "+ruolo;
    }

    @Override
    public String toString() {
        String testo = "";
        testo += ruolo + "\n";
        return testo;
    }
}
