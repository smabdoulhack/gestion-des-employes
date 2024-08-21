import java.util.ArrayList;
import java.util.List;

public class Main {
    List<Employe> employes = new ArrayList<>();

    public static void main(String[] args) {

        Main gestion = new Main();

        gestion.addEmploye(new Employe("abdoul", "developpeur", 300.0));
        gestion.getEmployes();
    }

    public void getEmployes() {
        for (int i = 0; i < this.employes.size(); i++) {
            this.employes.get(i).getEmployee();
        }
    }

    public void addEmploye(Employe employe) {
        this.employes.add(employe);
    }
}
