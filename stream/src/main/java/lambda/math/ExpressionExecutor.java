package lambda.math;

import lambda.math.MathExpression;

public class ExpressionExecutor {

    public void executeExpression(double a, double b, MathExpression mathExpression) {

        double result = mathExpression.calculateExpression(a, b);
        System.out.println("result" + result);
    }


}


