import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        DepartementHashSet gesDepartement = new DepartementHashSet();

        Departement depInformatique = new Departement(1, "Informatique", 10);
        Departement depPhysique = new Departement(2, "Physique", 20);
        Departement depChimie = new Departement(3, "Chimie", 25);
        Departement depBiologie = new Departement(4, "Biologie", 30);
        Departement depMathematique = new Departement(6, "Mathematiques", 15);
        Departement depGeologie = new Departement(5, "Geologie", 35);


        gesDepartement.ajouterDepartement(depChimie);
        gesDepartement.ajouterDepartement(depMathematique);
        gesDepartement.ajouterDepartement(depBiologie);
        gesDepartement.ajouterDepartement(depGeologie);
        gesDepartement.ajouterDepartement(depPhysique);
        gesDepartement.ajouterDepartement(depInformatique);
        gesDepartement.displayDepartement();



        if (gesDepartement.rechercherDepartement(depMathematique)) {
            System.out.println("Department exist \n");
        } else {
            System.out.println("Department n'existe pas \n");
        }

        String nomDep = "Informatique";
        if (gesDepartement.rechercherDepartement(nomDep)) {
            System.out.println("department " + nomDep + " exist \n");
        } else {
            System.out.println("department " + nomDep + " n'exist pas \n");
        }

        gesDepartement.supprimerDepartement(depMathematique);
        
        
        System.out.println(" New treeSet :\n");
        TreeSet<Departement> newDepartments= gesDepartement.trierDepartementById();
        newDepartments.forEach((element)->{
            System.out.println(element);
        });

        

    }
}