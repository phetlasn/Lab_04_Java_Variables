public class Main {
    public static void main(String[] args) {
        int intOperandA = 1;
        int intOperandB = 5;
        int intSum = 13;
        int intProduct = 24;
        int intDifference = 32;
        int intQuotient = 36;
        int intModulo = 42;

        double doubleOperandA = 3.50;
        double doubleOperandB = 3.75;
        double doubleSum = 4.27;
        double doubleProduct = 18;
        double doubleDifference = 21;
        double doubleQuotient = 21.5;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " " + intOperandB + " is " + intSum);
        intProduct = intSum * intDifference;
        System.out.println("The product using ints of " + intSum + " " + intDifference + " is " + intProduct);
        intDifference = intQuotient - intModulo;
        System.out.println("The difference using ints of " + intQuotient + " " + intModulo + " is " + intDifference);
        intQuotient = intSum / intOperandA;
        System.out.println("The quotient using ints of " + intSum + " " + intOperandA + " is " + intQuotient);
        intModulo = intDifference % intProduct;
        System.out.println("The modulo using ints of " + intDifference + " " + intProduct + " is " + intModulo);

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using ints of " + doubleOperandA + " " + doubleOperandB + " is " + doubleSum);
        doubleProduct = doubleSum * doubleDifference;
        System.out.println("The product using ints of " + doubleSum + " " + doubleDifference + " is " + doubleProduct);
        doubleDifference = doubleQuotient - doubleSum;
        System.out.println("The difference using ints of " + doubleQuotient + " " + doubleSum + " is " + doubleDifference);
        doubleQuotient = doubleSum / doubleOperandA;
        System.out.println("The quotient using ints of " + doubleSum + " " + doubleOperandA + " is " + doubleQuotient);

        int numOfKids = 8;
        System.out.println("The number of kids in your family: " + numOfKids);

        boolean isRaining = true;
        boolean isSunny = false;
        boolean isRainingAndSunny = isRaining || isSunny;

        System.out.println("It is raining and sunny at the same time: " + isRainingAndSunny);

        double gasPrice = 3.55;
        System.out.println("The price of a gallon of gas is: " + gasPrice);

        int favNumber = 16;
        System.out.println("Your favorite number is: " + favNumber);

        int shoeSize = 11;
        System.out.println("Your shoe size is: " + shoeSize);

        String birthMonth = "December";
        System.out.println("Your birth month is: " + birthMonth);

        final String firstName = "Souriya";
        String lastName = "Phetlasymongkhon";
        String fullName = firstName + " " + lastName;
        System.out.println("Your fullname is: " +fullName);




    }
}