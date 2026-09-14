package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main() {
        DoFizzBuzz();
    }

    public static void DoFizzBuzz() {
        int i = 0;
        while(i <= 100){
        //for (int i = 1; i <= 100; i++) {
            //Statement 1 is executed (one time) before the execution of the code block.
            //
            //Statement 2 defines the condition for executing the code block.
            //
            //Statement 3 is executed (every time) after the code block has been executed.
            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            i += 1;
            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {
            //java's '&&' means python's 'and', java's '||' means python's 'or'
                System.out.println("Fizz Buzz");

            } else if (divisibleBy3) {

                System.out.println("Fizz");

            } else if (divisibleBy5) {

                System.out.println("Buzz");

            } else {

                System.out.println(i);

            }
        }
    }
}
