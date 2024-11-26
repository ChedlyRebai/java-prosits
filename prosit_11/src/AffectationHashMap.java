import java.util.Iterator;
import java.util.Map;

public class AffectationHashMap {
    private Map<Employee,Departement> affectation;

    public void ajouterEmployeDepartement(Employee e, Departement d){
        this.affectation.put(e, d);
    }

    public void afficherEmployesEtDepartements(){
        for(Map.Entry<Employee, Departement>  entry :affectation.entrySet() ){
            System.out.println("key "+entry.getKey() + " value :"+entry.getValue());
        }
    }
}
