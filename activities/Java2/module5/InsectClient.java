public class InsectClient {
    public static void main(String[] args){
        System.out.println(Insect.produceRandomFact());
        Insect bug1 = new Insect(13, 31, 0);
        System.out.println(bug1.getWeight());
        System.out.println(bug1.getX());
        bug1.setX(-314);
        System.out.println(bug1.getX());
        System.out.println(bug1.getY());
        bug1.setY(133);
        System.out.println(bug1.getY());

        Insect bug2 = new Insect(31);
        System.out.println(bug2.toString());
        // since getPopulation() is defined as static, we don't need to instantiate Insect to use it, the way we use getWeight() for example
        System.out.println(Insect.getPopulation());
    }
}
