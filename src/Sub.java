public class Sub extends CalculaBase {
    public Sub() {
    }

    public Sub(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public void calculate() {
        double value = getLeftValue() - getRightValue();
        setResult(value);
        // TODO Auto-generated method stub

    }

}
