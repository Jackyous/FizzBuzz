package lab1;

public class Reduce {
    public static void main() {
        int n = 100;
        reduce(n);
    }

    private static int reduce(int n) {
        int steps = 0;
        while(n != 0){
            if (n % 2 == 0){
                n = n / 2;
            }
            else{
                n--;
            }
            steps++;
        }
        return steps;
    }
}
