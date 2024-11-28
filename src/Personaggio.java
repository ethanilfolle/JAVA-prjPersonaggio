public class Personaggio {
    private String nome;
    private int esperienza;

    public Personaggio(String nome, int esperienza) {
        this.nome = nome;
        this.esperienza = esperienza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEsperienza() {
        return esperienza;
    }

    public void setEsperienza(int esperienza) {
        this.esperienza = esperienza;
    }

    public String partecipa (String unita){
        return "Sto lavorando da : "+esperienza + " "+unita;
    }

    public String partecipa(double numero){
        return  "Sto lavorando da: "+esperienza+" "+numero;
    }

    @Override
    public String toString() {
        String testo = "";
        testo += nome + "\n";
        testo += esperienza + "\n";
        return testo;
    }
}
