public class Mul extends CalculaBase {
    public Mul() {
    }

    public Mul(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public void calculate() {
        double value = getLeftValue() - getRightValue();
        setResult(value);

        // TODO Auto-generated method stub

    }

}
