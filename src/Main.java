public class Main {
    public static void main(String[] args) {
        int value1 = 100;
        int value2 = -2;
        int totalValue = returnValue(value1, value2);
        System.out.println(totalValue);
    }
    public static int returnValue(int value1, int value2) {
        int min = Math.min(value1, value2);
        if ((value1 + value2) < 0) {
            return 0;
        }
        else {
            return (min);
        }
    }
}
