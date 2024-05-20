public class Frog {
    protected String name;
    protected int age;
    protected double tongueSpeed;
    // A Frog is a froglet if it is more than 1 month old but fewer than 7 months old
    protected boolean isFroglet;

    protected static String species = "Rare Pepe";

    public Frog(String name){
        this(name, 5, 5);
    }
    public Frog(String name, double ageInYears, double tongueSpeed){
        this.name = name;
        this.age = 12 * ((int) ageInYears);
        this.tongueSpeed = tongueSpeed;
        if(age > 1 && age < 7){
            isFroglet = true;
        }
        else {
            isFroglet = false;
        }
    }
    public Frog(String name, int age, double tongueSpeed){
        this.name = name;
        this.age = age;
        this.tongueSpeed = tongueSpeed;
        if(age > 1 && age < 7){
            isFroglet = true;
        }
        else {
            isFroglet = false;
        }
    }

    public void grow(){
        age++;
        if(age > 1 && age < 7){
            isFroglet = true;
        }
        else {
            isFroglet = false;
        }
    }

    public void grow(int month){
        age += month;
        for(int i = 0; i < month; i++){
            age++;
            if(age < 12){
                tongueSpeed++;
            }
            if(age > 30 && tongueSpeed > 5){
                tongueSpeed--;
            }
        }
        if(age > 1 && age < 7){
            isFroglet = true;
        }
        else {
            isFroglet = false;
        }
    }

    public void eat(Object o){
        Fly fly = (Fly) o;
        boolean isDead = fly.isDead();
        boolean isCaught;
        if(tongueSpeed > fly.getSpeed()){
            isCaught = true;
        }
        else {
            isCaught= false;
        }
        if(isCaught){
            fly.setMass(0);
            if(fly.getMass() > age * .5){
                grow(1);
            }
        } else {
            double flyMass = fly.getMass();
            fly.setMass(flyMass++);
        }
    }

    public String toString(){
        if(isFroglet){
            return "My name is " + name + " and I'm a rare froglet! I'm " + age + " months old and my tongue has a speed of " + tongueSpeed + ".";
        }
        else {
            return "My name is " + name + " and I'm a rare frog. I'm " + age + " months old and my tongue has a speed of " + tongueSpeed + ".";
        }
    }

    public String getSpecies(){
        return species;
    }
    public void setSpecies(String specie){
        species = specie;
    }
}
