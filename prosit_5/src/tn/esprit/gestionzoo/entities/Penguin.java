package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    protected float  swimmingDepth;

    public Penguin(String family, String name, int age, boolean isMammal,String habitat,float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth=swimmingDepth;
    }


    public float  getSwimmingDepth(){
        return this.swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth){
        this.swimmingDepth=swimmingDepth;
    }
    
}
