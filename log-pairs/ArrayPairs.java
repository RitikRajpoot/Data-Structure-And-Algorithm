// import java.util.*;

public class ArrayPairs {

    public static void logAllPairsOfArray(int[] boxes) {
        System.out.println("Pairs List");
        for(int i = 0; i< boxes.length; i++) {
            for(int j = 0; j< boxes.length; j++) {
                System.out.println("("+boxes[i]+","+boxes[j]+")");
            }
        }
    }
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter no of elements");
        // int n = sc.nextInt();
        // int[] boxes = new int[n];
        // for(int i = 0; i<n; i++) {
        //     boxes[i] = sc.nextInt();
        // }
        int[] boxes = {1,2,3,4,5};
        logAllPairsOfArray(boxes);
        // sc.close();
    }
}