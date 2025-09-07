package recursion.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int []arr = {1 , 3 , 4 , 8 ,8, 9 , 2};
//        System.out.println(solve(arr, 20, 0));
//        System.out.println(findIndex(arr,8 , 0));
//        addAllTheIndex(arr, 8,0);
//        System.out.println(list);
        ArrayList<Integer> ans = new ArrayList<>();
        System.out.println(addAllIndexReturnArrayList(ans , arr , 8 , 0));
        ArrayList<Integer> list2 = addAllIndexReturnArrayList2(arr,8,0);
        System.out.println(list2);
    }

    public static ArrayList<Integer> addAllIndexReturnArrayList2( int arr[] , int target , int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length-1) return list;

        // this list will contain ans for that particular function call only
        if (arr[index] == target) list.add(index);
        ArrayList<Integer> ansFromBelowCalls =  addAllIndexReturnArrayList2(arr,target,index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }

    public static ArrayList<Integer> addAllIndexReturnArrayList(ArrayList<Integer> ans , int arr[] , int target , int index){
        if (index == arr.length-1) return ans;
        if (arr[index] == target) ans.add(index);
        return addAllIndexReturnArrayList(ans,arr,target,index+1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    public static void addAllTheIndex(int []arr , int target , int index){
        if (index == arr.length - 1) return;
        if (arr[index] == target) {
            list.add(index);
        }
        addAllTheIndex(arr, target , index+1);
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
