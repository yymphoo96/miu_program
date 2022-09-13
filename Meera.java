public class Meera {
    int isMerra(int a[])
    {   int foundone = 0;
        int foundnine = 0;
        for (int i=0; i<a.length;i++)
        {
            if (a[i] == 1)
            {
                foundone = 1;
            }
            if (a[i] == 9)
            {
                foundnine = 1;
            }
        }
        if (foundnine == 1 && foundone==1)
        {
            return 1;
        }
        return 0;
    }
    public static void main(String args[])
    {
        Meera obj = new Meera();
        int[] array = {7,9,0,10};
        int result = obj.isMerra(array);
        System.out.println(result);
    }
    
}
