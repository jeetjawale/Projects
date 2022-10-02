import java.util.*;

class Primes{
    int p;
    public boolean checkForPrime(int p){
        if(p<=1){
            return false;
        }
        for(int i=2; i<=p/2; i++){
            if ((p%i)==0){
                return false;
        }
    }
    return true;
    }
    
}

class TwinPrimes extends Primes{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int low_limit;
    int upper_limit;
    
    System.out.println("Enter the lower limit: ");
    low_limit=sc.nextInt();
    System.out.println("Enter the upper limit: ");
    upper_limit=sc.nextInt();

    Primes obj = new Primes();
    
    System.out.println("Required output is: ");
        for (int j=low_limit; j<upper_limit-2; j++){
            if (obj.checkForPrime(j) && obj.checkForPrime(j+2)){
                System.out.println("("+j+","+(j+2)+")");
            } 
        }
    }
}

