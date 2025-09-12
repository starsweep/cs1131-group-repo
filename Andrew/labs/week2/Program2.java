public class Program2 {
    private String classifyTobaccoAsh(String texture, String color, boolean particles, int nicotine){
        switch (nicotine){
            case 1:
                return "Roman";
            case 2:
                switch (color){
                    case "dark":
                        return "Trichinopoly";
                    case "pale":
                        switch (texture){
                            case "flaky":
                                return "Heritage";
                            case "fluffy":
                                return "West Country";
                            default:
                                return "INVALID_DATA";
                        }
                    case "gray":
                        switch (texture){
                            case "granular":
                                return "Lunkah";
                            case "flaky":
                                return "MacDuffy";
                            case "caked":
                                return "Top Hat";
                            default:
                                return "INVALID_DATA";
                        }
                    case "brown":
                        switch (texture){
                            case "caked":
                                if (particles == true){
                                    return "Old Wood";
                                }
                                else{
                                    //londoner
                                    return "UNKNOWN";
                                }
                            default:
                                return "Old Wood";
                        }
                    default:
                        return "INVALID_DATA";
                    }
            case 3:
                return "Espanada";
            default:
                return "INVALID_DATA";
        }
    }
    public static void main(String[] args) {
        Program2 program2 = new Program2();
        if (program2.classifyTobaccoAsh("caked","dark",false,3).equals("Espanada")) {
            System.out.println("Espanada (caked,dark,false,3) test passed.");
        } else {
            System.out.println("Espanada (caked,dark,false,3) test failed.");
        }

        if (program2.classifyTobaccoAsh("flaky","pale",false,2).equals("Heritage")) {
            System.out.println("Heritage (flaky,pale,false,2) test passed.");
        } else {
            System.out.println("Heritage (flaky,pale,false,2) test failed.");
        }

        if (program2.classifyTobaccoAsh("caked","dark",true,1).equals("Roman")) {
            System.out.println("Roman (caked,dark,true,1) test passed.");
        } else {
            System.out.println("Roman (caked,dark,true,1) test failed.");
        }

        if (program2.classifyTobaccoAsh("caked","brown",false,2).equals("UNKNOWN")) {
            System.out.println("Londoner (caked,brown,false,2) test successfully returned \"UNKNOWN\" due to multiple possible matches.");
        } else {
            System.out.println("Londoner (caked,brown,false,2) test failed.");
        }

        if (program2.classifyTobaccoAsh("granular","gray",false,2).equals("Lunkah")) {
            System.out.println("Lunkah (granular,gray,false,2) test passed.");
        } else {
            System.out.println("Lunkah (granular,gray,false,2) test failed.");
        }

        if (program2.classifyTobaccoAsh("flaky","gray",false,2).equals("MacDuffy")) {
            System.out.println("MacDuffy (granular,gray,false,2) test passed.");
        } else {
            System.out.println("MacDuffy (granular,gray,false,2) test failed.");
        }

        if (program2.classifyTobaccoAsh("caked","brown",true,2).equals("Old Wood")) {
            System.out.println("Old Wood (caked,brown,true,2) test passed.");
        } else {
            System.out.println("Old Wood (caked,brown,true,2) test failed.");
        }

        if (program2.classifyTobaccoAsh("caked","gray",false,2).equals("Top Hat")) {
            System.out.println("Top Hat (caked,gray,false,2) test passed.");
        } else {
            System.out.println("Top Hat (caked,gray,false,2) test failed.");
        }

        if (program2.classifyTobaccoAsh("flaky","dark",false,2).equals("Trichinopoly")) {
            System.out.println("Trichinopoly (flaky,dark,false,2) test passed.");
        } else {
            System.out.println("Trichinopoly (flaky,dark,false,2) test failed.");
        }

        if (program2.classifyTobaccoAsh("fluffy","pale",true,2).equals("West Country")) {
            System.out.println("West Country (fluffy,pale,true,2) test passed.");
        } else {
            System.out.println("West Country (fluffy,pale,true,2) test failed.");
        }

        if (program2.classifyTobaccoAsh("spongy","red",false,5).equals("INVALID_DATA")) {
            System.out.println("INVALID (spongy,red,false,5) test passed.");
        } else {
            System.out.println("INVALID (spongy,red,false,5) test failed.");
        }
    }
}
