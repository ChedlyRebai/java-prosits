
public class Main {
    public static void main(String[] args) {
        DepartementHashSet gesDepartement = new DepartementHashSet();

        Departement depInformatique = new Departement(0, "Informatique", 10);
        Departement depMathematique = new Departement(1, "Mathematiques", 15);
        Departement depPhysique = new Departement(2, "Physique", 20);
        Departement depChimie = new Departement(3, "Chimie", 25);
        Departement depBiologie = new Departement(4, "Biologie", 30);
        Departement depGeologie = new Departement(5, "Geologie", 35);

        gesDepartement.ajouterDepartement(depMathematique);
        gesDepartement.ajouterDepartement(depBiologie);
        gesDepartement.ajouterDepartement(depGeologie);
        gesDepartement.ajouterDepartement(depChimie);
        gesDepartement.ajouterDepartement(depPhysique);
        gesDepartement.ajouterDepartement(depInformatique);

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

        gesDepartement.trierDepartementById();
        


        gesDepartement.displayDepartement();

    }
}