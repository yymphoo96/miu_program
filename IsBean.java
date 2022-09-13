public class IsBean {
    int isbean(int[] a)
    {
        if ((a.length == 1) && (a[0]==0)) return 1;
        for (int i=0; i<a.length; i++)
        {   int found = 0;
            for (int j=0; j<a.length; j++)
            {
                if((i != j) && (a[i] == a[j] *2) || (a[i]== (a[j] * 2)+1) || (a[i] == a[j]/2))
                {
                    found = 1;
                    break;
                }
            }
            if (found == 0) return 0;
        }
        return 1;
    }    

    public static void main(String args[])
    {
        IsBean obj = new IsBean();
        int[] array = {7,7,3,6};
        int result = obj.isbean(array);
        System.out.println(result);
    }
}
