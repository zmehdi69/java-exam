import java.util.Random;

public class Truck extends Vehicle {

    static int Speed = new Random().nextInt(1, 5 + 1);
    static int Adhesion = new Random().nextInt(5, 10 + 1);

    public Truck(String pilotName) {
        super(Speed, Adhesion, pilotName);
    }

    public String toString(){
        String sSpeed = "";
        String sAdhesion = "";
        if (Truck.Speed == 1 || Truck.Speed == 2){
            sSpeed = "slow";
        } else if (Truck.Speed == 3 || Truck.Speed == 4){
            sSpeed = "rather slow";
        } else if (Truck.Speed == 5 || Truck.Speed == 6) {
            sSpeed = "rather fast";
        } else if (Truck.Speed == 7 || Truck.Speed == 8) {
            sSpeed = "fast";
        } else if (Truck.Speed == 9 || Truck.Speed == 10) {
            sSpeed = "very fast";
        }
        if (Truck.Adhesion == 1 || Truck.Adhesion == 2){
            sAdhesion = "barely sticks to the ground";
        } else if (Truck.Adhesion == 3 || Truck.Adhesion == 4){
            sAdhesion = "sticks to the ground";
        } else if (Truck.Adhesion == 5 || Truck.Adhesion == 6) {
            sAdhesion = "grips the ground quite well";
        } else if (Truck.Adhesion == 7 || Truck.Adhesion == 8) {
            sAdhesion = "adheres well to the ground";
        } else if (Truck.Adhesion == 9 || Truck.Adhesion == 10) {
            sAdhesion = "adheres perfectly to the ground";
        }
       return "This Truck is " + sSpeed + ", it has a " + Truck.Speed + " speed value, and it " + sAdhesion + " with a " + Truck.Adhesion + " value of adhesion";
    }

}