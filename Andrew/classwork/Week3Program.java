/*
 * @author Andrew Martin
 */

class Week3Program {
    public long printMenu () {
        // Declare vars
        int max = 0B1111111;
        double price = 0;
        String message = "", comboString;
        // Loop through all iterations
        for (int combos = 0B0000000; combos <= max; combos++) {
            // Format number to 7 bit binary string
            comboString = String.format("%7s", Integer.toBinaryString(combos)).replace(' ', '0');
            // Reset price for this iteration
            price = 99;
            // Add "with" only if there are params (AKA not 0000000)
            if (comboString.contains("1")){
                message = "with";
            }
            //Check for params, act accordingly
            if (comboString.charAt(6) == '1') {
                message += " ketchup,";
                price += 15;
            }
            if (comboString.charAt(5) == '1') {
                message += " mustard,";
                price += 17;
            }
            if (comboString.charAt(4) == '1') {
                message += " chopped onions,";
                price += 20;
            }
            if (comboString.charAt(3) == '1') {
                message += " tomato wedge,";
                price += 25;
            }
            if (comboString.charAt(2) == '1') {
                message += " sweet relish,";
                price += 30;
            }
            if (comboString.charAt(1) == '1') {
                message += " sport peppers,";
                price += 35;
            }
            if (comboString.charAt(0) == '1') {
                message += " sauerkraut,";
                price += 45;
            }
            // Cut final comma
            if (comboString.contains("1")){
                message = message.substring(0, message.length() - 1);
            }
            // Print result
            System.out.printf("%3d Dog in Bun %-100s $%.2f%n", (combos + 1), message, (price / 100));
        }
        // Return the number of combinations
        return Long.valueOf(max + 1);
    }
    public static void main(String[] args) {
        Week3Program obj = new Week3Program();
        long count = obj.printMenu();
        assert count == 128;
    }
}
