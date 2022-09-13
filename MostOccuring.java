public class MostOccuring {
    static int mm(int[] arr){
        int count = 0;
        int maxcount = 0;
        int value = arr[0];
        int valueMax = arr[0];
        for (int i=0; i<arr.length; i++)
        {   count = 0;
            for (int j=0; j<arr.length; j++)
            {
                if (i != j && (arr[i] == arr[j])){
                    value = arr[i];
                    count ++;
                }
            }
            if (count > maxcount)
            {
                maxcount = count;
                valueMax = value;
            }
        }
        return valueMax;
    }

    public static void main(String[] args)
    {
        MostOccuring obj = new MostOccuring();
        int[] arr = {1,2,3,4,5,4,6,2,3,2};
        int result = obj.mm(arr);
        System.out.println(result);
    }
    
    
}
