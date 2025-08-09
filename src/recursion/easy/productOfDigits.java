package recursion.easy;

public class productOfDigits {
    public static void main(String[] args) {
        System.out.println(solve(123451234));
    }
    public static int solve(int num){
        if (num%10 == num) return num;

        return num % 10 * solve(num / 10);
    }
}
