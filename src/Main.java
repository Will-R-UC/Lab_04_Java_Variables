public class Main {
    public static void main(String[] args) {
        //int operands
        int intOperandA = 5;
        int intOperandB = 4;

        System.out.print("\n");
        System.out.println(">>> Integer Math <<<");

        //int sum
        int intSum = 100;
        intSum = intOperandA + intOperandB;
        System.out.println("For integers, " + intOperandA + " plus " + intOperandB + " equals " + intSum);

        //int product
        int intProduct = 200;
        intProduct = intOperandA * intOperandB;
        System.out.println("For integers, " + intOperandA + " times " + intOperandB + " equals " + intProduct);

        //int difference
        int intDifference = 300;
        intDifference = intOperandA - intOperandB;
        System.out.println("For integers, " + intOperandA + " minus " + intOperandB + " equals " + intDifference);

        //int quotient
        int intQuotient = 400;
        intQuotient = intOperandA / intOperandB;
        System.out.println("For integers, " + intOperandA + " divided by " + intOperandB + " equals " + intQuotient);

        int intModulo = 500;
        intModulo = intOperandA % intOperandB;
        System.out.println("For integers, " + intOperandA + " mod " + intOperandB + " equals " + intModulo);

        //double operands
        double doubleOperandA = 2.5;
        double doubleOperandB = 3.5;

        System.out.print("\n");
        System.out.println(">>> Double Math <<<");

        //double sum
        double doubleSum = 100.0;
        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("For doubles, " + doubleOperandA + " plus " + doubleOperandB + " equals " + doubleSum);

        //double product
        double doubleProduct = 200.0;
        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("For doubles, " + doubleOperandA + " times " + doubleOperandB + " equals " + doubleProduct);

        //double difference
        double doubleDifference = 300.0;
        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("For doubles, " + doubleOperandA + " minus " + doubleOperandB + " equals " + doubleDifference);

        //double quotient
        double doubleQuotient = 400.0;
        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("For doubles, " + doubleOperandA + " divided by " + doubleOperandB + " equals " + doubleQuotient);

    }
}