public class Boat extends Vehicule {

    public Boat(String brand) {
        super(brand);
    }

    @Override
    public String doStuff() {
        String brand = this.getBrand();
        return "Je suis " + brand + " et je fais glou glou !";
    }
}