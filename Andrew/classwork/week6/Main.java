public class Main {
    public static void main(String[] args) {
        Cyborg basicCyborg = new Cyborg("Basic-01", "CyborgCorp");
        Cyborg visionCyborg = new EnhancedVisionCyborg("VisionX", "OptiTech", "Night Vision");
        Cyborg stealthCyborg = new StealthCyborg("SpyBot-3000", "The CIA", "Shadow Cloak");
        Cyborg hackingCyborg = new HackingCyborg("Mr. Hack", "The FBI", "AMD Ryzen Threadripper PRO 9995WX");


        basicCyborg.displayInfo();
        basicCyborg.performTask();

        System.out.println();

        visionCyborg.displayInfo();
        visionCyborg.performTask();

        System.out.println();

        stealthCyborg.displayInfo();
        stealthCyborg.performTask();

        System.out.println();

        hackingCyborg.displayInfo();
        hackingCyborg.performTask();
    }
}
