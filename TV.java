public class TV implements HomeService {
    @Override 
    public String turnOn() {
        return "TV is on...";
    } 

    @Override 
    public String turnOff() {
        return "TV is off...";
    } 
}