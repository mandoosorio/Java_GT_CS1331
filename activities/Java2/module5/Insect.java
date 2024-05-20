public class Insect {
    // Instance variables
    private double weight;
    private int x;
    private int y; 

    // Static constants/variables
    public static final int DEFAULT_X = 0;
    public static final int DEFAULT_Y = 0;
    // having a public FINAL constant doesn't violate encapsulation since it can't be changed outside its class (or even within its class after its values has been assigned);
    private final double DIST_WEIGHT_LOSS_FACTOR = .0001;
    private static int population = 0;
    private static final String[] FACTS = {
        "The two main groups of insects are winged and wingless",
        "There are more than 1 million insect species", 
        "Insects are cold-blooded",
        "Spiders are not considered insects"
    };

    // 
    
    // calling a less specific contructor first so that we can use the 'this' word and call on the more specific constructor
    public Insect(double initWeight){
        this(initWeight, DEFAULT_X, DEFAULT_Y);
    }
    // The constructor is public since we ultimately want other classes to have the ability to create instances of the class
    public Insect(double weight, int x, int y){
        this.weight = weight;
        this.x = x;
        this.y = y;
        population++;
    }

    // methods

    public double getWeight(){
        return weight;
    }

    public int getX(){
        return x;
    }
    public void setX(int newX){
        if(isLegalX(newX)){
            x = newX;
        }
    }

    public int getY(){
        return y;
    }
    public void setY(int newY){
        if(isLegalY(newY)){
            y = newY;
        }
    }

    public static boolean isLegalX(int newX){
        return (newX >= 0 ? true : false);
    }
    public static boolean isLegalY(int newY){
        return (newY >= 0 ? true : false);
    }

    public static int getPopulation(){
        return population;
    }

    public void eat(double amount){
        System.out.println("Nibble Nibble");
        weight = weight + amount;
    }

    public void move(int newX, int newY){
        double distance = calculateDistance(x, y, newX, newY);

        if(distance > 0){
            x = newX;
            y = newY;
            weight = weight * DIST_WEIGHT_LOSS_FACTOR * distance;
            System.out.printf("Moved %.2f units\n", distance);
        }
        else {
            System.out.println("Staying put");
        }
    }

    // private only to be used internally
    // static - not something you invoke on an instance of a class
    private static double calculateDistance(double x1, double y1, double x2, double y2){
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

    public static String produceRandomFact(){
        int index = (int)(Math.random() * ((FACTS.length - 1) + 1));
        return FACTS[index];
    }

    public String toString(){
        return "weight: " + weight + ", x: " + x + ", y: " + y;
    }

    // test method
    public static void main(String[] args){
        System.out.println("Insect Population: " + population);
        // Insect buzz1 = new Insect(); will fail
        // Insect buzz2 = new Insect(); will fail
        Insect bug1 = new Insect(10, 100, 90);
        System.out.println("Insect Population: " + population);
        Insect bug2 = new Insect(4, -300, 400);
        System.out.println("Insect Population: " + population);

        bug1.move(1,10);
        bug2.move(-300, 400);

        System.out.println(produceRandomFact());
    }
}
