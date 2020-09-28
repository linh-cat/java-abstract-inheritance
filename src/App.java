import java.util.Scanner;

import model.*;
import model.Added.*;
import model.Subtract.*;
import model.Multibly.*;
import model.Devide.*;
import model.DynamicHelper.DynamicHelper;
import model.Enum.*;
import model.Interface.MathProcessing;

public class App {
    public static void main(String[] args) throws Exception {
        // performMoreCalculations();
        // executeInteractively();
        dynamicInteractivity();

    }

    private static void performMoreCalculations() {
        CalculaBase[] calculations = { new Added(225.0d, 92.0d), new Sub(225.0d, 25.0d), new Mul(11.0d, 3.0d),
                new Dev(100.0d, 50.0d) };

        System.out.println();
        System.out.println("Array Calculations");
        for (CalculaBase calculation : calculations) {
            calculation.calculate();
            System.out.println("result = " + calculation.getResult());
        }
        System.out.println();
    }

    static void doCalculation(CalculaBase calculaBase, double leftValue, double rightValue) {
        calculaBase.setLeftValue(leftValue);
        calculaBase.setRightValue(rightValue);
        calculaBase.calculate();
        System.out.println("Calculation result = " + calculaBase.getResult());
    }

    private static void dynamicInteractivity() {
        DynamicHelper helper = new DynamicHelper(new MathProcessing[] { new Added() });

        System.out.println("Enter an operation and two numbers:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        helper.process(userInput);
    }

    static void executeInteractively() {
        System.out.println("Enter an operation and two numbers:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);

    }

    private static void performOperation(String[] parts) {
        MathOperations operations = MathOperations.valueOf(parts[0].toUpperCase());
        double leftValue = Double.parseDouble(parts[1]);
        double rightValue = Double.parseDouble(parts[2]);
        CalculaBase calculation = createCalculation(operations, leftValue, rightValue);
        calculation.calculate();
        System.out.println("Operation performed: " + operations);
        System.out.println(calculation.getResult());
    }

    private static CalculaBase createCalculation(MathOperations operations, double leftValue, double rightValue) {
        CalculaBase calculaBase = null;
        switch (operations) {
            case ADD:
                calculaBase = new Added(leftValue, rightValue);
                break;
            case SUBTRACT:
                calculaBase = new Sub(leftValue, rightValue);
                break;
            case MULTIBLY:
                calculaBase = new Mul(leftValue, rightValue);
                break;
            case DEVIDE:
                calculaBase = new Dev(leftValue, rightValue);
                break;
        }
        return calculaBase;
    }
}
