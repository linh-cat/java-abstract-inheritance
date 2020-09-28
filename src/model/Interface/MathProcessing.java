package model.Interface;

public interface MathProcessing {
    String SEPARATOR = " ";

    public String getKeyword();

    public double doCalculation(double leftValue, double rightValue);

    default String getFormattedOutput() {
        return null;
    }
}
