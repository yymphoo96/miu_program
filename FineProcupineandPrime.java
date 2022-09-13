public class FineProcupineandPrime {
    int isPrime(int n){
        if (n%2 == 0 || n%3 == 0 || n%5 == 0 || n%11 == 0 || n%13 == 0){
            return 0;
        }
        return 1;
    }
    int findPorcupineNumber(int n){
        int result = isPrime(n);
        System.out.println(result);
        int next_prime = 0;
        int next_number = n+1;
        if (result == 1 && n%10 == 9){
            while (next_prime !=1){
                if(isPrime(next_number) == 1){
                    System.out.println(next_number);
                    next_prime = 1;
                    break;
                }
                next_number ++;
            }
            if (next_number % 10 ==9) return 1;
        }
        return 0;
    }

    public static void main (String args[]){
        FineProcupineandPrime obj = new FineProcupineandPrime();
        int result = obj.findPorcupineNumber(156);
        System.out.println(result);
    }
}
