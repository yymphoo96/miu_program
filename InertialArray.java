public class InertialArray {
    int isInertial(int[] a)
    {
        if (a.length == 1) return 0;
        int even_array[] = new int [a.length];
        int odd_array[] = new int [a.length];
        int even_index =0;
        int odd_index=0;
        int max_even = 0;
        for(int i=0;i<a.length;i++)
        {
            if (a[i]%2 == 1){
                odd_array[odd_index] = a[i];
                odd_index++;
                System.out.println(odd_index);
            }
            else{
                even_array[even_index] = a[i];
                even_index++; 
                System.out.println(even_index);
                if (max_even < a[i]) max_even = a[i];
            }

        }
        if (odd_index == 0 || even_index == 0) return 0;
        System.out.println(max_even);
        for (int j=0;j<odd_index;j++){
            for(int k=0;k<even_index;k++){
                if (even_array[k] != max_even && odd_array[j] < even_array[k]){
                    return 0;
                }
            }
        }
        System.out.println(max_even);
        return 1;
    } 
    public static void main(String args[])
    {
        InertialArray obj = new InertialArray();
        int[] array = {2,12,12,4,6,8,11};
        int result = obj.isInertial(array);
        System.out.println(result);
    }
}
