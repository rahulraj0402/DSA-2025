package recursion.easy;

public class LinearSearch {
    public static void main(String[] args) {
        int []arr = {1 , 3 , 4 , 8 , 9 , 2};
        System.out.println(solve(arr, 20, 0));
    }

    public static boolean solve(int []arr , int target , int index){
        if (index == arr.length-1) return false;
        return arr[index] == target || solve(arr, target , index+1);
    }
}
