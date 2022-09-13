class CharPositionLength{
    static char[] f(char[] a, int start, int len)
    {
        if (len > a.length || start+len > a.length) return null;
        char[] array = new char[len];
        for (int i=start, j=0; i<len; i++, j++)
        {
            array[j] = a[i];
        }
        return array;
    }
    public static void main(String[] args)
    {
        CharPositionLength obj = new CharPositionLength();
        char[] array = {'a', 'b', 'c'};
        char[] result = obj.f(array, 0, 2);
        System.out.println(result);
    }
}