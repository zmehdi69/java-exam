import java.util.Random;

public class Kart extends Vehicle {

    static int Speed = new Random().nextInt(5, 10 + 1);
    static int Adhesion = new Random().nextInt(5, 10 + 1);

    public Kart(String pilotName) {
        super(Speed, Adhesion, pilotName);
    }

    public String toString(){
        String sSpeed = "";
        String sAdhesion = "";
        if (Kart.Speed == 1 || Kart.Speed == 2){
            sSpeed = "slow";
        } else if (Kart.Speed == 3 || Kart.Speed == 4){
            sSpeed = "rather slow";
        } else if (Kart.Speed == 5 || Kart.Speed == 6) {
            sSpeed = "rather fast";
        } else if (Kart.Speed == 7 || Kart.Speed == 8) {
            sSpeed = "fast";
        } else if (Kart.Speed == 9 || Kart.Speed == 10) {
            sSpeed = "very fast";
        }
        if (Kart.Adhesion == 1 || Kart.Adhesion == 2){
            sAdhesion = "barely sticks to the ground";
        } else if (Kart.Adhesion == 3 || Kart.Adhesion == 4){
            sAdhesion = "sticks to the ground";
        } else if (Kart.Adhesion == 5 || Kart.Adhesion == 6) {
            sAdhesion = "grips the ground quite well";
        } else if (Kart.Adhesion == 7 || Kart.Adhesion == 8) {
            sAdhesion = "adheres well to the ground";
        } else if (Kart.Adhesion == 9 || Kart.Adhesion == 10) {
            sAdhesion = "adheres perfectly to the ground";
        }
       return "This KART is " + sSpeed + ", it has a " + Kart.Speed + " speed value, and it " + sAdhesion + " with a " + Kart.Adhesion + " value of adhesion";
    }

}