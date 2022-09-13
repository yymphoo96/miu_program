public class ArrayOddNumber{
    public static int aa(int[] a){
        System.out.println(a.length);
        if (a == null || a.length % 2 == 0) return 2;
        int midIndex = a.length /2;
        int midItem = a[midIndex];
        for (int i=0; i<a.length; i++)
        {
            if (i != midIndex && midItem >= a[i])
                return 0;
        }
        return 1;
    }

    public static void main(String[] args){
        ArrayOddNumber obj = new ArrayOddNumber();

        int[] data ={1,2,0,4,5};
        int result = obj.aa(data);
        System.out.println(result);
    }
}