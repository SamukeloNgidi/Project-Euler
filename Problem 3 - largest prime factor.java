//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?

public static void main(String[] args) {
        long num = 600851475143L;
        for(long i = 2 ; i <= Math.sqrt(num); i++)
        {
            while( num % i == 0)
            {
                num = num / i;
            }
        }
        System.out.println("Largest Prime factor : "+ num);     
    }