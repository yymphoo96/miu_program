public class SumEvenOdd {
    int f(int[] a)
    {
        int sumeven = 0;
        int sumodd = 0;
        for (int i=0; i<a.length; i++)
        {
            if (a[i] % 2 == 0) sumeven += a[i];
            else sumodd += a[i];
        }
        return sumodd - sumeven;
    } 

    public static void main(String args[])
    {
        SumEvenOdd obj = new SumEvenOdd();
        int array[] = {} ;
        int result = obj.f(array);
        System.out.println(result);
    }
}
