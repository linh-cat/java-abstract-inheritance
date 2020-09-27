public class App {
    public static void main(String[] args) throws Exception {
        // Added add1 = new Added();
        // doCalculation(add1, 100.0d, 50.0d);
        // Sub sub1 = new Sub();
        // doCalculation(sub1, 200.0d, 100.0d);
        performMoreCalculations();

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
}
