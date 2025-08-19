package recursion.easy;

public class LinearSearch {
    public static void main(String[] args) {
        int []arr = {1 , 3 , 4 , 8 , 9 , 2};
        System.out.println(solve(arr, 20, 0));
        System.out.println(findIndex(arr,8 , 0));
    }

    public static boolean solve(int []arr , int target , int index){
        if (index == arr.length-1) return false;
        return arr[index] == target || solve(arr, target , index+1);
    }

    public static int findIndex(int []arr , int target , int index){
        if (index == arr.length-1) return -1;
        if (arr[index] == target) return index;
        else {
            return findIndex(arr , target , index +1);
        }
    }
}
