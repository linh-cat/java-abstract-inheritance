package model.Devide;

import model.CalculaBase;

public class Dev extends CalculaBase {
    public Dev() {
    }

    public Dev(double leftValue, double rightValue) {
        super(leftValue, rightValue);

    }

    @Override
    public void calculate() {
        if (getRightValue() == 0) {
            System.out.println("Can't zero");
            return;
        } else {
            double value = getLeftValue() / getRightValue();
            setResult(value);
        }

        // TODO Auto-generated method stub

    }
}
