public class Class1 {
    public static void main(String [] args){
        int sum = 0;

        for (int i= 1; i<10; i++){
           if(i%5==0 || i%3==0){
               System.out.println(i);
              sum+=i;
           }//end if  
        }//end for
        
        System.out.println("The sum of all natural numbers below 10 which is a multiple of 3 or 5 is ---> "+sum);//23
    }
}