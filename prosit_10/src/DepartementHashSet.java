import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

@SuppressWarnings("rawtypes")
public class DepartementHashSet implements IDepartement {
    Set<Departement> Departements = new HashSet<>();

    @Override
    public void ajouterDepartement(Object t) {
        this.Departements.add((Departement) t);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement departement : Departements) {
            if(nom.equals(departement.getNom())){
                return true;
             }
        }

        return false;
    
    }

    @Override
    public boolean rechercherDepartement(Object t) {
        Departement dep = (Departement) t;
        if (this.Departements.contains(dep)) {
            return true;
        }
        return false;
    }

    
    @Override
    public void supprimerDepartement(Object t) {
        this.Departements.remove(t);
    }

    @Override
    public void displayDepartement() {
        Iterator<Departement> iterator = this.Departements.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    @Override
    public TreeSet trierDepartementById() {
        TreeSet newSet = (TreeSet) this.Departements;
        return newSet;
    }

}