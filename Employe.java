import java.time.Instant;

public class Employe {
    private String ID;
    public String nom;
    public String poste;
    public Double salaire;

    Employe(String nom, String poste, Double salaire) {

        this.ID = uuid();
        this.nom = nom;
        this.poste = poste;
        this.salaire = salaire;
    }

    public void getEmployee() {
        System.err.println("ID : " + this.ID);
        System.err.println("NOM : " + this.nom);
        System.err.println("POSTE : " + this.poste);
        System.err.println("SALAIRE : " + this.salaire);
    }

    public void setEmployee(String id, String nom, String poste, Double salaire) {
        this.ID = id;
        this.nom = nom;
        this.poste = poste;
        this.salaire = salaire;
    }

    static String uuid() {
        Instant now = Instant.now();
        String id = now.toString();
        return id;
    }
}
