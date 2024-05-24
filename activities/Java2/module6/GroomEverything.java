public class GroomEverything {
    public static void main(String[] args){
        // if Canine was changed to Object, then groom() would not be found in the Canine object and there would be compiler errors
        // Car class would not be able to be a part of this array because the array if made up of a different class type
        /*Canine[] groomer = {
            new Wolf(17.01, 3),
            new Poodle("richie", 9, "Lux Brand", "Rich Brand"),
            new Wolf(16, 5),
            new Poodle("pixy", 4, "Top Shelf", "Only the Best")
        };*/

        // this is now an array of classes that implement the groom method from Groomable so we are able to include the Car class
        Groomable[] groomer = {
            new Wolf(17.01, 3),
            new Poodle("richie", 9, "Lux Brand", "Rich Brand"),
            new Wolf(16, 5),
            new Poodle("pixy", 4, "Top Shelf", "Only the Best"),
            new Car("Yuhina", "Spark", 2037)
        };

        /*for(Canine c : groomer){
            // groom() has to exist in the object that each object extends from
            c.groom();
        }*/

        for(Groomable c : groomer){
            // groom() has to exist in the object that each object extends from
            c.groom();
        }
    }
}
