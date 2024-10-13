

package tn.esprit.gestionzoo.entities;
public class Terrestrial extends Animal {
    protected int nbrLegs;

    public Terrestrial(String family, String name, int age, boolean isMammal, String habitat, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }


    public void nbrLegs(int nbrLegs){
        this.nbrLegs=nbrLegs;
    }

    public int getNbrLegs(){
        return this.nbrLegs;
    }

}
