public class Calculator {
    public static void main(String[] args) {
    	int x = 2;
    	int y = 7;
    	char mathOperation = '+';

    	if (mathOperation == '+') {
	    System.out.println(x + y);
	} else if (mathOperation == '-') {
	    System.out.println(x - y);
	} else if (mathOperation == '*') {
	    System.out.println(x * y);
	} else if (mathOperation == '/') {
	    System.out.println(x / y);
	} else if (mathOperation == '^') {
	    int result = 1;
	    for (int i = 1; i <= y; i++) {
		 result *= x;
	    }
	    System.out.println(result);
 } else if (mathOperation == '%') {
	System.out.println(x % y);			
        }
      }
}
