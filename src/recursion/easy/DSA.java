package recursion.easy;

import java.util.*;

public class DSA {
    public static void main(String[] args) {
        int [][]mat = {{1,2,3},{4,5,6},{7,8,9}};
        int []ans = findDiagonalOrder(mat);
        for (int n : ans){
            System.out.print(n + " ");
        }
    }

    static public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        // using hashmap to store the diagonals
        Map<Integer, List<Integer>> map = new HashMap<>();

        // fill the map with diagonals
        for (int i = 0 ; i < m ; i++){
            for (int j = 0 ; j < n ; j++){
                int key = i + j;
                map.putIfAbsent(key, new ArrayList<>());
                map.get(key).add(mat[i][j]);
            }
        }

        List<Integer> resultList = new ArrayList<>();
        boolean flip = true;

        // now we have to process the diagonal in incrasing order
        for (int k = 0 ; k <= 4 ; k++){
            // okay so we will take the elements for diagonal and put it in the list ans
            List<Integer> diagonal = map.get(k);

            if (flip){
                Collections.reverse(diagonal);
            }
            resultList.addAll(diagonal);
            flip = !flip;
        }

        int []ans = new int[resultList.size()];
        for (int i = 0 ; i < resultList.size() ; i++){
            ans[i] = resultList.get(i);
        }
        return ans;
    }
}
