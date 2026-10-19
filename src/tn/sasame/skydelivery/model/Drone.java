package tn.sasame.skydelivery.model;


import lombok.Getter;
import lombok.Setter;
import tn.sasame.skydelivery.enumerations.DroneStatus;
@Getter //generates all getters methods
@Setter //generate all setters methods
public class Drone {
    public static final double MAX_BATTERY=100.0;
    public static final double BASE_COST=1.2;
    public static final double LOAD_COST=0.4;
    public static final double CHARGE_RATE=1.5;
    private static int instanceCount=0;
    private String model;
    private DroneStatus status;
    private final String id;
    public Drone(){
        status=DroneStatus.IDLE;
        model="";
        //instanceCount++;
        //id=String.format("%03d",instanceCount);
        //or
        id=String.format("%03d",++instanceCount);

    }

    /*public Drone(String model, DroneStatus status, String id) {
        this.model = model;
        this.status = status;
        this.id = String.format("%03d",++instanceCount);
    }*/

    //or
    public Drone(String model, DroneStatus status, String id) {
        this(); //call the constructor with no args
        this.model = model;
        this.status = status;
    }



}
