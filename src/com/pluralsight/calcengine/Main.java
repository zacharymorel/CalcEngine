package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        // TEST CODE FOR WHEN SOME ONE IS EXPLORING OUT CLASSES TO TEST AND SEE WHAT THEY DO.
//        MathEquation testEquation = new MathEquation();
//        testEquation.excute();
//        System.out.print("test = ");
//        System.out.println(testEquation.getResult());


         // This creates the Array it's self.
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s',225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);

        for(MathEquation equation: equations) {
            equation.excute();
            System.out.println("the result = ");
            System.out.println(equation.getResult());
        }
    }

//    public static MathEquation create(double leftVal, double rightVal, char opCode) {
//        MathEquation equation = new MathEquation();
//        equation.setLeftVal(leftVal);
//        equation.setRightVal(rightVal);
//        equation.setOpCode(opCode);
//
//        return equation;
//    }
}
