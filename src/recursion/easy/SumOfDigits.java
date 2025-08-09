package recursion.easy;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(solve(1234));
    }

    public static int solve(int num){
        if (num == 0) return 0;
        int lastDigit = num % 10;
        return lastDigit + solve(num / 10);
    }


}
