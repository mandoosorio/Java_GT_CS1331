// abstract classes are classes that contain at least one abstract method
// an abstract method is a method that has no definition but is made abstract so that extending classes are forced to define the abstract method themselves
public abstract class AbstractCanine {
    protected double size;
    public AbstractCanine(double size){
        this.size = size;
    }
    public void bark(){
        System.out.println("Woof Woof");
    }
    public abstract void groom();
}
