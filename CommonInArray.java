
public class CommonInArray {
    int[] f(int[] first, int[] second)
    {   
        if (first == null || second == null) return null;
        int min = first.length;
        int[] common = new int[min];
        if (second.length < first.length)
        {
            min = second.length;
        }

        int k = 0;
        for (int i=0; i < first.length; i++)
        {
            for (int j=0; j< second.length; j++)
            {
                if (first[i] == second[j])
                {
                    common[k] = second[j];
                    k++;
                }
            }
        }
        int[] retArray = new int[k];
        for (int t=0; t<k; t++)
        {
            retArray[t] = common[t];
        }
        // System.out.println(common);
        return retArray;
    }

    public static void main (String[] args)
    {
        int[] first = {1,2,3,5};
        int[] second = {2,3,6};
        CommonInArray obj = new CommonInArray();
        int[] result = obj.f(first, second);
        System.out.print((result.toString()));
    }
    
}
