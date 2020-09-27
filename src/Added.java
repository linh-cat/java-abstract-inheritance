public class Added extends CalculaBase {
    public Added() {
    }

    public Added(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public void calculate() {
        double value = getLeftValue() + getRightValue();
        setResult(value);
        // TODO Auto-generated method stub

    }

}
