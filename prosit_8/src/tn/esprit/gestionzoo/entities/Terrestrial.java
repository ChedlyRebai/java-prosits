
package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.enumss.Food;
import tn.esprit.gestionzoo.interfaces.Omnivore;

public class Terrestrial extends Animal implements Omnivore<Food> {

    @Override
    public void eatPlantAndMeet(Food food) {
        if(food == Food.BOTH){
            System.out.println("eat both");
        }
    }
    protected int nbrLegs;

    public Terrestrial(String family, String name, int age, boolean isMammal, String habitat, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public void nbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return this.nbrLegs;
    }

}
