package elte_2023_fall.unit05.math.textual;

public class Adder {

    public static boolean intTryParse(String a) {

        try {

            Integer.parseInt(a);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    public static boolean doubleTryParse(String a) {

        try {

            Double.parseDouble(a);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    public static String addAsText(String a, String b) {
        if (intTryParse(a) && intTryParse(b)) {
            return Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
        }

        if (doubleTryParse(a) && doubleTryParse(b)) {
            return Double.toString(Double.parseDouble(a) + Double.parseDouble(b));
        }

        throw new UnsupportedOperationException("Operands are not numbers");
    }
}
