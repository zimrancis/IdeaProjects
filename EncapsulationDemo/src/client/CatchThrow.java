package client;

public class CatchThrow {

    private static void throwsMethod() throws NumberFormatException {
        String intNumber = "5A";

        Integer.parseInt(intNumber);
    }

    private static void catchMethod() {
        try {

            throwsMethod();

        } catch (NumberFormatException e) {
            System.out.println("Conversion Error");
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        catchMethod();
    }
    
}