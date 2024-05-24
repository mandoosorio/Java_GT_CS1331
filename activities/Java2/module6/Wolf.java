import java.util.Arrays;
// <Wolf> allows us to give the interface information about how we want the method to be used
public class Wolf extends Canine implements Comparable<Wolf>{
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

    public void bark(int barkMultiple){
        for(int i = 1; i <= barkMultiple; i++){
            super.bark();
        }
    }

    public void groom(){
        System.out.println("lick");
    }

    // type T is used as the method's formal parameter type
    public int compareTo(Wolf anotherWolf){
        return -(rank - (anotherWolf).rank);
    }

    public String toString(){
        return ("Rank " + rank + ", Size " + size);
    }

    public static void selectionSort(int[] list){
        int minIndex;
        int nextSmallest;

        for(int unSortedStart = 0; unSortedStart < list.length - 1; unSortedStart++){
            minIndex = unSortedStart;
            for(int currentIndex = unSortedStart + 1; currentIndex < list.length; currentIndex++){
                if(list[currentIndex] < list[minIndex]){
                    minIndex = currentIndex;
                }
            }

            nextSmallest = list[minIndex];
            list[minIndex] = list[unSortedStart];
            list[unSortedStart] = nextSmallest;
        }
    }

    public static void selectionSort(double[] list){
        int minIndex;
        double nextSmallest;

        for(int unSortedStart = 0; unSortedStart < list.length - 1; unSortedStart++){
            minIndex = unSortedStart;
            for(int currentIndex = unSortedStart + 1; currentIndex < list.length; currentIndex++){
                if(list[currentIndex] < list[minIndex]){
                    minIndex = currentIndex;
                }
            }

            nextSmallest = list[minIndex];
            list[minIndex] = list[unSortedStart];
            list[unSortedStart] = nextSmallest;
        }
    }

    public static void selectionSort(Comparable[] list){
        int minIndex;
        Comparable nextSmallest;

        for(int unSortedStart = 0; unSortedStart < list.length - 1; unSortedStart++){
            minIndex = unSortedStart;
            for(int currentIndex = unSortedStart + 1; currentIndex < list.length; currentIndex++){
                if(list[currentIndex].compareTo(list[minIndex]) < 0){
                    minIndex = currentIndex;
                }
            }

            nextSmallest = list[minIndex];
            list[minIndex] = list[unSortedStart];
            list[unSortedStart] = nextSmallest;
        }
    }

    public static void main(String[] args){
        Wolf[] pack = {
            new Wolf(17.1, 2),
            new Wolf(3, 10),
            new Wolf(9.2, 7),
            new Wolf(9.1, 8),
            new Wolf(17.01, 3),
            new Wolf(16.2, 1),
            new Wolf(16, 4),
            new Wolf(16, 5),
            new Wolf(10, 6),
            new Wolf(5, 9)
        };

        System.out.println("Unsorted Pack: " + Arrays.toString(pack));
        Arrays.sort(pack);
        System.out.println("====================================");
        System.out.println("Sorted Pack: " + Arrays.toString(pack));
    }
}
