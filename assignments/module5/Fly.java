public class Fly {
    protected double mass;
    protected double speed;

    public Fly(){
        this(5, 10);
    }
    public Fly(double mass){
        this(mass, 10);
    }
    public Fly(double mass, double speed){
        this.mass = mass;
        this.speed = speed;
    }

    public double getMass(){
        return mass;
    }
    public void setMass(double newMass){
        grow(newMass);
    }

    public double getSpeed(){
        return speed;
    }
    public void setSpeed(double newSpeed){
        speed = newSpeed;
    }

    public String toString(){
        if(mass == 0){
            return "I'm dead, but I used to be a fly with a speed of " + String.format("%.2f", speed) + ".";
        }
        else {
            return "I'm a speedy fly with " + String.format("%.2f", speed) + " speed and " + String.format("%.2f", mass) + " mass.";
        }
    }
    public void grow(double addedMass){
        mass += addedMass;
        if(mass < 20){
            speed++;
        }
        else if(mass > 20){
            for(int i = 0; i < (mass - 20); i++){
                speed -= .5;
            }
        }
    }
    public boolean isDead(){
        if(mass == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
