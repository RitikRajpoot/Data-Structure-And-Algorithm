import java.util.HashSet;

public class PairSumGoogle {
    public static boolean checkPairSum(int[] list,int sum) {
        HashSet<Integer> complimentList = new HashSet<Integer>();
        for(int i = 0; i< list.length; i++) {
            if(complimentList.contains(list[i])) {
                return true;
            }
            complimentList.add(sum-list[i]);
        }
        return false;
    }
    public static void main(String args[]) {
        int sum = 13;
        int[] list = {1,2,4,9,12};
        System.out.println(checkPairSum(list, sum));
    }
}
