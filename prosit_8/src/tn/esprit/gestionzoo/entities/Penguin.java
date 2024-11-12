package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.enumss.Food;

public class Penguin extends Aquatic {
    protected float swimmingDepth;

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return this.swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + " swimming depth: " + this.swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println("the penguin is eating meat");
        } else {
            System.out.println("the penguin does not eat this type of meat.");
        }
    }
}
