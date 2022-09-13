class SumDiff{
    int f(int[] a){
        int sumofodd = 0;
        int sumofeven = 0;
        if (a.length == 1) return a[0];

        for (int i=0; i<a.length; i++)
        {
            if (a[i] % 2 == 0)
                sumofeven += a[i];
            else
                sumofodd += a[i];
        }
        return sumofodd - sumofeven;
    }
    public static void main(String[] args){
        SumDiff obj = new SumDiff();
        int[] array = {4,1,2,3};
        int result = obj.f(array);
        System.out.println(result);
    }
}