public class ReverseIntegre {
   static int reverse(int num)
   {
        int sign = 1;
        if (num == 0) return 0;
        if (num < 0)
        {
            sign = -1;
            num = -num;
        }
            

        int reverse = 0;
        while (num != 0)
        {
            reverse = (reverse * 10) + (num % 10);
            num /= 10;
        }
        System.out.print(reverse);
        System.out.print(sign);
        return reverse * sign;
         
   } 

   public static void main (String[] args)
   {
       ReverseIntegre obj = new ReverseIntegre();
       int num = -3424;
       int result = obj.reverse(num);
       System.out.println(result);
   }
}
