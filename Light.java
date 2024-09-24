public class Light implements HomeService {
    @Override 
    public String turnOn() {
        return "Lights are on...";
    } 

    @Override 
    public String turnOff() {
        return "Lights are off...";
    } 
}