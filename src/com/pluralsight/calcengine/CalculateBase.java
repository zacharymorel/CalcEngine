package com.pluralsight.calcengine;

public abstract class CalculateBase {
    private double leftVal;
    private double rightVal;
    private double result;


    // GETTERS AND SETTERS
    public double getLeftVal() {
        return leftVal;
    }
    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }
    public double getRightVal() {
        return rightVal;
    }
    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }
    public double getResult() {
        return result;
    }
    public double setResult(double result) {
        return this.result = result;
    }


    // CONSTRUCTORS
    public CalculateBase() {}
    public CalculateBase(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }


    public abstract void calculate();

}
