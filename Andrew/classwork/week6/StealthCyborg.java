public class StealthCyborg extends Cyborg {

    String cloakingDevice;

    public StealthCyborg(String model, String manufacturer, String cloakingDevice) {
        super(model, manufacturer);
        this.cloakingDevice = cloakingDevice;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Cloaking Device: %s%n", cloakingDevice);
    }

    @Override
    public void performTask() {
        System.out.printf("%s is using %s to sneak stealthily.%n", model, cloakingDevice);
    }
}
