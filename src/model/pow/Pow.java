package model.pow;

import model.Interface.MathProcessing;

public class Pow implements MathProcessing {
    private String formattedOutput;

    @Override
    public String getKeyword() {
        // TODO Auto-generated method stub
        return "power";
    }

    @Override
    public String getFormattedOutput() {
        return formattedOutput;
    }

    @Override
    public double doCalculation(double leftValue, double rightValue) {
        double product = Math.pow(leftValue, rightValue);
        formattedOutput = leftValue + " to the power of" + rightValue + " is" + product;
        return product;
    }
}
