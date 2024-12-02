import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {
    Set<Departement> Departements = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement t) {
        this.Departements.add((Departement) t);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement departement : Departements) {
            if (nom.equals(departement.getNom())) {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement t) {

        if (this.Departements.contains(t)) {
            return true;
        }
        return false;
    }

    @Override
    public void supprimerDepartement(Departement t) {
        if (this.Departements.contains(t)) {
            if (this.Departements.remove(t)) {
                System.out.println("department " + t.getNom() + " supprimer avec succes \n");
            }
        } else {
            System.out.println("Element n'exist pas \n");
        }
    }


    @Override
    public void displayDepartement() {
        if (this.Departements.isEmpty()) {
            System.out.println("Department est vide");
        } else {
            Iterator<Departement> iterator = this.Departements.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }

    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> newSet = new TreeSet<>(this.Departements);
        return newSet;
    }

}