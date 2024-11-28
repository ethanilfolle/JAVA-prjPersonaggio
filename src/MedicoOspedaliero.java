public class MedicoOspedaliero extends Medico{
    private String ospedale;

    public MedicoOspedaliero(String nome, int esperienza, String ruolo, String specializzazione, String ospedale) {
        super(nome, esperienza, ruolo, specializzazione);
        this.ospedale = ospedale;
    }

    public String getOspedale() {
        return ospedale;
    }

    public void setOspedale(String ospedale) {
        this.ospedale = ospedale;
    }

    public String partecipazione (double numero){
        return "Sta lavorando da: "+getSpecializzazione()+ ospedale + numero;
    }

    @Override
    public String toString() {
        String testo = "";
        testo += ospedale + "\n";
        return testo;
    }
}
