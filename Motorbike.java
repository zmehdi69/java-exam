import java.util.Random;

public class Motorbike extends Vehicle {

    static int Speed = new Random().nextInt(5, 10 + 1);
    static int Adhesion = new Random().nextInt(5, 10 + 1);

    public Motorbike(String pilotName) {
        super(Speed, Adhesion, pilotName);
    }

    public String toString(){
        String sSpeed = "";
        String sAdhesion = "";
        if (Motorbike.Speed == 1 || Motorbike.Speed == 2){
            sSpeed = "slow";
        } else if (Motorbike.Speed == 3 || Motorbike.Speed == 4){
            sSpeed = "rather slow";
        } else if (Motorbike.Speed == 5 || Motorbike.Speed == 6) {
            sSpeed = "rather fast";
        } else if (Motorbike.Speed == 7 || Motorbike.Speed == 8) {
            sSpeed = "fast";
        } else if (Motorbike.Speed == 9 || Motorbike.Speed == 10) {
            sSpeed = "very fast";
        }
        if (Motorbike.Adhesion == 1 || Motorbike.Adhesion == 2){
            sAdhesion = "barely sticks to the ground";
        } else if (Motorbike.Adhesion == 3 || Motorbike.Adhesion == 4){
            sAdhesion = "sticks to the ground";
        } else if (Motorbike.Adhesion == 5 || Motorbike.Adhesion == 6) {
            sAdhesion = "grips the ground quite well";
        } else if (Motorbike.Adhesion == 7 || Motorbike.Adhesion == 8) {
            sAdhesion = "adheres well to the ground";
        } else if (Motorbike.Adhesion == 9 || Motorbike.Adhesion == 10) {
            sAdhesion = "adheres perfectly to the ground";
        }
       return "This Motorbike is " + sSpeed + ", it has a " + Motorbike.Speed + " speed value, and it " + sAdhesion + " with a " + Motorbike.Adhesion + " value of adhesion";
    }

}