import java.util.ArrayList;

public class PrimeNumbers {
      //método que verifica se um dado número é primo

      public  boolean isPrime(int number){
        if(number == 2){
            return true;
        } else if (number < 2){
            return false;
        }
       
        for(int i = 2; i < number; i++){
          if( number % i == 0){
            return false;    
          }      
        }
        return true;
      }
      
      //método que cria um arraylist e add todos os primos a esse arraylist
      public ArrayList<Integer> onlyPrimes(int[] numbers){

        ArrayList<Integer> primes = new ArrayList<Integer>();

        for(int num = 0; num < numbers.length; num++ ){
            if(isPrime(numbers[num])){
                primes.add(numbers[num]);
            }       
        }
        return primes;
      }
      
      public static void main(String[] args) { 
        //Instância
        PrimeNumbers prime = new PrimeNumbers();
        //Array de números aleatórios
        int[] numbers = {2, 3, 7, 11, 59, 61, 60, 6};
        
        boolean result = prime.isPrime(59);
        System.out.println(result);
        ArrayList<Integer> primos = prime.onlyPrimes(numbers);
        System.out.println(primos);
      }  
}
