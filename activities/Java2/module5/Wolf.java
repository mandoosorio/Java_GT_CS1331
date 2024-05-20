public class Wolf extends Canine{
    protected int rank;

    public Wolf(double size, int rank){
        // super referes to the parent class' constructor
        // if extending a class, the class needs to be instatiated with the constructor
        // if super is left out, java still automatically calls the super constructor without parameters super()
        // to call on the Canine class, it needs paramters because no parameterless constructor has been created
        super(size);
        this.rank = rank;
    }

    public int getRank(){
        return rank;
    }

    // this method is overriding Canine's bark method
    // if Canine had the final modifier on bark, then this class would not be able to be overridden
    public void bark(){
        for(int i = 1; i <= 3; i++){
            super.bark();
        }
    }

    public static void main(String[] args){
        Wolf alpha = new Wolf(17.1, 1);
        alpha.bark();
    }
}
