public class Canine {
    // protected modifier allows variables to be accessed by child classes
    // private variables are not accessible to child classes
    protected double size;

    public Canine(double size){
        this.size = size;
    }

    // this method should not be made final since extending classes will have to make their own versions
    // it is good practice to make mthods that are data sensitivity or highly optimized to do something, final so that they don't get changed down the line
    public void bark(){
        System.out.println("Woof Woof");
    }
}
