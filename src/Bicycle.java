public class Bicycle {
    int cadence=0;
    int gear =1;
    int speed = 0;

    void  changeCadence(int newValue){
        cadence +=newValue;
    }
    void changeGear(int newValue){
        gear= newValue;
    }
    void speedUp(int increment){
        speed+=increment;
    }
    void applyBreaks(int decrement){
        speed-=decrement;
    }
    void printStates(){
        System.out.println("Current cadence: "+cadence+
                ", Current gear: "+ gear+
                ",Current speed :"+speed);

    }
}
