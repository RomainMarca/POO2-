public class Hangar{

    public static void main(String[] args) {

        Car batmobile = new Car("Lamboghini");
        System.out.println(batmobile.doStuff());

        Boat titanic = new Boat("Titanic");
        System.out.println(titanic.doStuff());
    }
}