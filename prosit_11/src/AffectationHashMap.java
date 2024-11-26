import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {

    private Map<Employee, Departement> affectation;

    AffectationHashMap() {
        this.affectation = new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employee e, Departement d) {
        this.affectation.put(e, d);
    }

    public void afficherEmployesEtDepartements() {
        for (Map.Entry<Employee, Departement> entry : affectation.entrySet()) {
            System.out.println("key " + entry.getKey() + " value :" + entry.getValue());
        }
    }

    public void supprimerEmploye(Employee e) {
        this.affectation.remove(e);
    }

    public void supprimerEmployeEtDepartement(Employee e, Departement d) {
        if (this.affectation.containsKey(e) && this.affectation.get(e).equals(d)) {
            this.affectation.remove(e);
        }
    }

    public void afficherEmployes() {
        for (Employee e : this.affectation.keySet()) {
            System.out.println(e);
        }
    }

    public void afficherDepartements() {
        for (Departement d : this.affectation.values()) {
            System.out.println(d);
        }
    }

    public boolean rechercherEmploye(Employee e) {
        return this.affectation.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return this.affectation.containsValue(d);
    }

    public TreeMap<Employee, Departement> trierMap() {
        return new TreeMap<>(this.affectation);
    }
}