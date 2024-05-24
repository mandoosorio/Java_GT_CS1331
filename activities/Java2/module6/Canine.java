// abstract classes are classes that contain at least one abstract method
// an abstract method is a method that has no definition but is made abstract so that extending classes are forced to define the abstract method themselves
// if we made Canine implement Groomable, all child classes would also inherit the implementation
public abstract class Canine implements Groomable{
    protected double size;
    public Canine(double size){
        this.size = size;
    }
    public void bark(){
        System.out.println("Woof Woof");
    }
    //public abstract void groom();
}
