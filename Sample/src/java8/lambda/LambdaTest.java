package java8.lambda;

import java.util.Collection;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class LambdaTest {

	public static void main(String[] args) {
		Predicate<Integer> isOdd = n -> n % 2 != 0;
		BinaryOperator<Integer> sum = (x, y) -> x + y;
		Runnable runner = () -> { System.out.println("Hello World!"); };

	}

}
