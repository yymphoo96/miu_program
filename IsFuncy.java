public class IsFuncy {
    static int isfuncy(int num)
    { 
        int funncyNum = 0;
        int first = 1;
        int second = 1;
        int result = 0;
        while(funncyNum < num)
        {
            funncyNum = 3* first + 2* second;
            second = first;
            first = funncyNum;
            if (funncyNum == num)
            {
                result = 1;
                break;
            }
            
        }
        return result;
        
    }

    public static void main(String []args)
    {
        IsFuncy obj = new IsFuncy();
        int result = obj.isfuncy(21);
        System.out.println(result);
    }
    
}
