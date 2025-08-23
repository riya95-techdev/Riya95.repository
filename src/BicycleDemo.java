public class BicycleDemo {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        bike1.changeCadence(89);
        bike1.changeGear(4);
        bike1.speedUp(90);
        bike1.applyBreaks(50);

        bike2.changeCadence(60);
        bike2.changeGear(3);
        bike2.speedUp(200);
        bike2.applyBreaks(60);

        bike1.printStates();
        bike2.printStates();
    }
}
