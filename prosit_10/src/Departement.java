
public class Departement implements Comparable<Departement> {
    private int id;
    private String nom;
    private int nbEmploye;

    public Departement(int id, String nom, int nbEmploye) {
        this.id = id;
        this.nom = nom;
        this.nbEmploye = nbEmploye;
    }

    public Departement() {}

    @Override
    public boolean equals(Object ob) {
        if(this == ob){
            return true;
        }

        if(ob == null || getClass().equals( ob.getClass())){
            return false;
        }
        
        Departement newDep = (Departement) ob;
        if (this.id == newDep.getId() && this.nom.equals(newDep.getNom())) {
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "Departement [id=" + id + ", nom=" + nom + ", nbEmploye=" + nbEmploye + "]";
    }

    @Override
    public int compareTo(Departement o) {
        return Integer.compare(this.id, o.getId());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbEmploye() {
        return nbEmploye;
    }

    public void setNbEmploye(int nbEmploye) {
        this.nbEmploye = nbEmploye;
    }

}
