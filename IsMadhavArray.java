public class IsMadhavArray {
   int arraytest(int[] array)
   {
    if (array.length < 3) return 0;
    int arrayLength = array.length;
    int n = 1;
    int cont = 0;
     while (n < arrayLength)
    {
        if (arrayLength == (n * (n+1))/2 && (n * (n+1))%2==0)
        {
            cont = 1;
            break;
        }
        n ++;
    }

    if (cont == 1)
    {   System.out.println(n);
        int sumTime = n;
        int index = arrayLength -1;
        
        while(sumTime > 1)
        {
            int sumTotal = 0;
            int sumCount = 0;
            while (index > 0)
            {
                sumTotal += array[index];
                sumCount ++;
                index --;
                if (sumCount == sumTime)
                {
                    break;
                }
            }
            if (array[0] != sumTotal) return 0;
            sumTime --;
        }
        return 1;
    }
    return 0;  
   } 

   public static void main(String args[])
   {
       IsMadhavArray obj = new IsMadhavArray();
       int[] array = {3,1,2,3,0};
       int result = obj.arraytest(array);
       System.out.println(result);

   }
}
