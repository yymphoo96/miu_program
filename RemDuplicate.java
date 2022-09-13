import java.util.*;

public class RemDuplicate {

    public static void removeDuplicates(List<String> array) {

        for (int i = 0; i < array.size() - 1; i++) {
            System.out.println(array.get(i));
            System.out.println(array.get(i+1));
            if (array.get(i).equals(array.get(i + 1))) {
                array.remove(i + 1);
                System.out.println("Here");
                i--;
            }
            System.out.println("T");
        }
        System.out.println(array);
        
    }
    public static void main(String[] args){
        String[] strArray = {"good", "better", "best", "best", "first", "last", "last", "last","good"};
        List<String> arrList = new ArrayList<String>(Arrays.asList(strArray));
        RemDuplicate obj = new RemDuplicate();
        obj.removeDuplicates(arrList);
    }
    
}
