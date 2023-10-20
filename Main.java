/**
 * Main
 */
public class Main {

    public static Exception throwException() {
        return new Exception("Hi");
    }

    public static void main(String[] args) {
        Exception k = new Exception("Hi");
        Exception d = throwException();

    }
}