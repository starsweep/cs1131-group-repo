public class HackingCyborg extends Cyborg {

    String cpu;

    public HackingCyborg(String model, String manufacturer, String cpu) {
        super(model, manufacturer);
        this.cpu = cpu;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("CPU: %s%n", cpu);
    }

    @Override
    public void performTask() {
        System.out.printf("%s is using %s to hack %s!%n", model, cpu, manufacturer);
    }
}
