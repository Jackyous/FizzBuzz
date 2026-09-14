package lab1;

public class Multiples {
    public static void main() {
        int num = 16;
        int count = multiples(num, 3, 5);
        System.out.println("There are "+ count + " multiples of 3 or 5 there are below "+ num);
        System.out.println(0 % 3);
    }

    public static int multiples(int n,int a,int b) {
        int i = 1;
        int count_in_method = 0;
        while(i < n){
            if (i % a == 0 || i % b == 0){
                count_in_method++;
            }
            i++;
        }
        return count_in_method;
    }

    public static int multiples(){
        int i = 1;
        int count_in_method = 0;
        while(i < 1000){
            if (i % 3 == 0 || i % 5 == 0){
                count_in_method++;
            }
            i++;
        }
        return count_in_method;
    }
}
