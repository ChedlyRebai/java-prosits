import java.util.Map;

public class AffectationHashMap {
    private Map<Employee,Departement> affectation;

    public void ajouterEmployeDepartement(Employee e, Departement d){
        this.affectation.put(e, d);
    }

    
}
