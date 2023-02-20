import java.util.Random;

public class Bike extends Vehicle {

    static int Speed = new Random().nextInt(1, 5 + 1);
    static int Adhesion = new Random().nextInt(1, 5 + 1);

    public Bike(String pilotName) {
        super(Speed, Adhesion, pilotName);
    }

    public String toString(){
        String sSpeed = "";
        String sAdhesion = "";
        if (Bike.Speed == 1 || Bike.Speed == 2){
            sSpeed = "slow";
        } else if (Bike.Speed == 3 || Bike.Speed == 4){
            sSpeed = "rather slow";
        } else if (Bike.Speed == 5 || Bike.Speed == 6) {
            sSpeed = "rather fast";
        } else if (Bike.Speed == 7 || Bike.Speed == 8) {
            sSpeed = "fast";
        } else if (Bike.Speed == 9 || Bike.Speed == 10) {
            sSpeed = "very fast";
        }
        if (Bike.Adhesion == 1 || Bike.Adhesion == 2){
            sAdhesion = "barely sticks to the ground";
        } else if (Bike.Adhesion == 3 || Bike.Adhesion == 4){
            sAdhesion = "sticks to the ground";
        } else if (Bike.Adhesion == 5 || Bike.Adhesion == 6) {
            sAdhesion = "grips the ground quite well";
        } else if (Bike.Adhesion == 7 || Bike.Adhesion == 8) {
            sAdhesion = "adheres well to the ground";
        } else if (Bike.Adhesion == 9 || Bike.Adhesion == 10) {
            sAdhesion = "adheres perfectly to the ground";
        }
       return "This Bike is " + sSpeed + ", it has a " + Bike.Speed + " speed value, and it " + sAdhesion + " with a " + Bike.Adhesion + " value of adhesion";
    }

}