public class HomeApp {
    public static void main(String[] args) {
        HomeService light = new Light();
        HomeService tv = new TV();
        HomeService airCon = new AirConditioning();

        HomeInterface homeInterface = new HomeInterface(light, tv, airCon);

        System.out.println(homeInterface.turnOnAll());
        System.out.println("\n" + homeInterface.turnOffAll());
    }
}