public class CoundSquarePair {
    int isPerfectSquare(int a)
    {   int num = 1;
        while(num < a)
        {
            if (num * num == a) return 1;
            num ++;
        }
        return 0;
    }

    int countSquarePairs(int[] a)
    {   int count = 0;
        for (int i=0; i<a.length; i++)
        {
            for (int j=0; j<a.length; j++)
            {
                if (i!=j && a[i] > 0 && a[j] > 0 && a[i] < a[j])
                {
                    if (isPerfectSquare(a[i] + a[j]) == 1) count ++;
                }
            }
        }
        return count;
    }

    public static void main(String args[])
    {
        CoundSquarePair obj = new CoundSquarePair();
        int[] array = {9};
        int result = obj.countSquarePairs(array);
        System.out.print(result);
    }
}
