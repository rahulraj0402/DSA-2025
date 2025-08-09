package recursion.easy;

public class BS {
    public static void main(String[] args) {
        int []array = {1 , 2 , 3 , 4 };
        System.out.println(search(array , 3 , 0 , array.length-1));
    }
    public static int search(int []array , int target , int start , int end){
        if (start > end){
            // this means not found the ans
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (array[mid] == target){
            return mid;
        }

        if (target < array[mid]){
            return search(array , target , start , mid - 1);
        }
        return search(array , target , mid+1 , end);

    }
}
