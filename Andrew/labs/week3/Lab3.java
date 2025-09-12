public class Lab3 {

    public long multiply(long num1, long num2){
        long total = 0;
        for (int i = 0; i < num2; i++){
            total += num1;
        }
        return total;
    }

    public long power(long input, long pow){
        long total = 1;
        for (int i = 0; i < pow; i++){
            total = multiply(total, input);
        }
        return total;
    }

    public long log(long base, long input){
        long total = 0;
        while (power(base, total) < input){
            total++;
        }
        return total;
    }

    public void printPowers(long input, long pow){
        System.out.printf("%4s %8s %8s%n", "Base", "Exponent", "Power");
        for (int i = 0; i <= pow; i++){
            System.out.printf("%4s %8s %8s%n", input, i, power(input, i));
        }
    }

    public void printLogs(long base, long input){
        System.out.printf("%4s %8s %8s%n", "Base", "Argument", "Exponent");
        for (int i = 0; i <= log(base, input); i++){
            System.out.printf("%4s %8s %8s%n", base, power(base, i), log(base, power(base, i)));
        }
    }

    public static void main(String[] args){
        Lab3 lab3 = new Lab3();
        
        lab3.printPowers(2, 8);
        lab3.printPowers(3, 8);
        lab3.printLogs(2, 256);
        lab3.printLogs(3, 6561);
    }
}
