/**
 * CalculaBase
 */
public abstract class CalculaBase {

    private double leftValue;
    private double rightValue;
    private double result;

    public CalculaBase() {
    }

    public CalculaBase(double leftValue, double rightValue) {
        this.leftValue = leftValue;
        this.rightValue = rightValue;
    }

    public double getLeftValue() {
        return leftValue;
    }

    public void setLeftValue(double leftValue) {
        this.leftValue = leftValue;
    }

    public double getRightValue() {
        return rightValue;
    }

    public void setRightValue(double rightValue) {
        this.rightValue = rightValue;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public abstract void calculate();
}