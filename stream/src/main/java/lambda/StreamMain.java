package lambda;

import lambda.math.ExpressionExecutor;

public class StreamMain {

    public static void main(String[] args) {
    Processor processor = new Processor();


    Executor codeToExecute = () -> System.out.println("This is an example text.");
    processor.execute(codeToExecute);

    ExpressionExecutor expressionExecutor =  new ExpressionExecutor();
    expressionExecutor.executeExpression(10, 5, (a,b) -> a*b);
    }

}

