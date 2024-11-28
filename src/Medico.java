public class Medico extends Insegnante{
    private String specializzazione;

    public Medico(String nome, int esperienza, String ruolo, String specializzazione) {
        super(nome, esperienza, ruolo);
        this.specializzazione = specializzazione;
    }

    public String getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    public String partacipa (){
        return "Sta lavorando da: "+specializzazione;
    }

    @Override
    public String toString() {
        String testo = "";
        testo += specializzazione + "\n";
        return testo;
    }
}
