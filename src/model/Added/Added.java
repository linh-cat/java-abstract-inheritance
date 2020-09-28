package model.Added;

import model.CalculaBase;

import model.Interface.MathProcessing;

public class Added extends CalculaBase implements MathProcessing {
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

    @Override
    public String getKeyword() {
        // TODO Auto-generated method stub
        return "add";
    }

    @Override
    public double doCalculation(double leftValue, double rightValue) {
        setLeftValue(leftValue);
        setRightValue(rightValue);
        calculate();
        return getResult();
    }

}
