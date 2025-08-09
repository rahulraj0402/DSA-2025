package recursion.easy;

public class productNto1 {
    public static void main(String[] args) {

        // this is a code for factorial we can say
        System.out.println(fun(10));
    }
    static int fun(int n){
        if (n == 1) return 1;

        return n * fun(n - 1);
    }
}
