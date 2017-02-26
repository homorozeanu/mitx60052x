public class Main {

    public static void main(String[] args) {
        System.out.println(stringValue(857, 10));
    }

    /**
     * Convert an integer to a string representation with a given base.
     *
     * @param n    integer to convert to string
     * @param base base for the representation. Requires 2<=base<=10.
     * @return n represented as a string of digits in the specified base, with
     * a minus sign if n<0.
     */
    public static String stringValue(int n, int base) {
        if (n < 0) return stringValue(-n, base);
        if (n == 0) {
            return "";
        } else {
            return stringValue(n / base, base) + "0123456789".charAt(n % base);
        }
    }
}
