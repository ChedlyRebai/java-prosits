package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {

    protected float  swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal,String habitat,float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed=swimmingSpeed;
    }


    public float  getSwimmingSpeed(){
        return this.swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed){
        this.swimmingSpeed=swimmingSpeed;
    }

    
}
