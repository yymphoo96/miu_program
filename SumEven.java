public class SumEven {
   int sumeven(int[] a)
   {
       if (a.length % 2 != 0) return 0;
       int middle = a.length / 2;
       int frontsum = 0;
       int endsum = 0;
       for (int i=0; i< middle; i++)
       {
           frontsum += a[i];
       } 
       for (int j=middle; j< a.length; j++)
       {
           endsum += a[j];
       }
       if (frontsum == endsum) return 1;
       return 0;
   } 
   public static void main (String []args)
   {
       SumEven obj = new SumEven();
       int[] array = {5,4,3,2,3,4,6,2};
       int result = obj.sumeven(array);
       System.out.println(result);
   }
}
