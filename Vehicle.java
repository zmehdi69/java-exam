public abstract class Vehicle {
    private int DistanceTraveled;
    private int Speed;
    private int Adhesion;
    private int Out;
    private String PilotName;
    private boolean End;

    public Vehicle(int Speed, int Adhesion, String PilotName) {
        this.Speed = Speed;
        this.Adhesion = Adhesion;
        this.PilotName = PilotName;
        Out = 0;
        End = false;
    }
    public int getSpeed(){
        return Speed; 
    }
    public int getDistanceTraveled(){
        return DistanceTraveled;
    }
    public int getAdhesion(){
        return Adhesion;
    }
    public int getOut(){
        return Out;
    }
    public String getPilotName() {
        return PilotName;
    }
    public boolean getEnd(){
        return End;
    }
    public void setOut(int newOut){
        this.Out = newOut;
    }
    public void setEnd(boolean newEnd){
        this.End = newEnd;
    }
    public void setDistanceTraveled(int newDistance){
        this.DistanceTraveled = newDistance;
    }
    public void Accident (Vehicle v){
        int n = (int) (Math.random()(10-1) + 1);
        if (n > getAdhesion()){
            setOut(n - getAdhesion());
        }

    }

    public void Forward(int DistanceTraveled, int Speed, int Adhesion){
        Accident(this);
        if (getOut() > 0){
            DistanceTraveled = 0;
            setOut(getOut()-1);
        }
        else{
            DistanceTraveled = Speed (11 - Adhesion);
        }
    }
}
