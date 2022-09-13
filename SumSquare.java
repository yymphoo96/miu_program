public class SumSquare {
    int answerOne(int n)
    {   int found = 0;
        int foundNum = 0;
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                if (n == (i * i) + (j * j))
                {   if (foundNum != 0 && foundNum != j) found ++;
                    if (foundNum == 0) 
                    {
                        found ++;
                        foundNum = i;
                    }
                    
                    break;
                }
            }
        }
        if (found == 2) return 1;
        return 0;
    }
    public static void main (String args[])
    {
        SumSquare obj = new SumSquare();
        int result = obj.answerOne(13);
        System.out.println(result);
    }
    
}
