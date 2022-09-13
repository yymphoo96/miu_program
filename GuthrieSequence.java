public class GuthrieSequence {
    int isGuthrieSequence(int[] a)
    {
        if (a[a.length - 1] != 1) return 0;
        for (int i=0; i<a.length-1; i++)
        {
            if (a[i] % 2 == 0 && a[i +1] != a[i]/2) return 0;
            else if (a[i] % 2 != 0 && a[i+1] != 3* a[i] +1) return 0; 
        }
        return 1;
    }
    public static void main(String args[])
    {
        GuthrieSequence obj = new GuthrieSequence();
        int array[] = {8,4,2};
        int result = obj.isGuthrieSequence(array);
        System.out.println(result);
    }
    
}
