public class StantonMeasure {
    int measure(int[] a)
    {
        if (a.length == 1) return 1;
        int count = 0;
        int result = 0;
        for (int i=0; i< a.length; i++)
        {
            if (a[i] == 1) count ++;
        }
        for (int j=0; j<a.length; j++)
        {
            if (a[j] == count) result ++;
        }
        System.out.println(count);
        return result;
    }

    public static void main (String args[])
    {
        StantonMeasure obj = new StantonMeasure();
        int[] array = {1,3,1,1,3,3,2,3,3,3,4};
        int result = obj.measure(array);
        System.out.println(result);
    }

    
}
