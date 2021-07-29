import java.util.HashSet;

public class CommonElement {

    public static boolean containsElement(String[] arr1, String[] arr2) {
        HashSet<String> hset = new HashSet<String>();
        for(int i=0; i<arr1.length; i++) {
            hset.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++) {
            if(hset.contains(arr2[i])) 
                return true;
        }
        return false;
    }
    public static void main(String args[]) {
        String[] arr1= {"a", "d", "f", "x"};
        String[] arr2= {"z", "y", "f", "i"};
        System.out.println(containsElement(arr1, arr2));
    }
}