public class AirConditioning implements HomeService {
    @Override 
    public String turnOn() {
        return "Aircondition is on...";
    } 

    @Override 
    public String turnOff() {
        return "Aircondition is off...";
    } 
}