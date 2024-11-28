public class Main {
    public static void main(String[] args) {
        Personaggio p1 = new Personaggio("Ethan", 30);
        Personaggio p2 = new Medico("Gianluca", 23, "Dottore", "Ginecologo");
        Personaggio p3 = new Insegnante("Marco", 30, "Insegnate");
        Personaggio p4 = new MedicoOspedaliero("Chirugo", 23,"Santa Chiara", "Operazione a cuore aperto", "Niguarda");
        Medico m1 = new Medico("Medico", 37, "Studiare malattie", "Pediatra");
        Personaggio pc = (Personaggio) m1;
        p1 = p3; // tipo dato uguale dell''assegnazione semplice, contiene un oggetto diverso, cerco metodo se ha la stesso firma.
        System.out.println(pc.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        Insegnante i1 = new Insegnante("Laura", 50, "Informatica");
        Medico m2 = new MedicoOspedaliero("Carlo", 30, "Medico","Chirurgia plastica", "Santa Chiara");
        System.out.println(p1.partecipa("secondi"));
        System.out.println(p1.partecipa("minuti"));
        System.out.println(p1.partecipa("ore"));

    }
}