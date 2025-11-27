// use of throw keyword in java // 
// mostly hum throw keyword a use customised exception handling m hi use karte h // 
// or hum isse mostly runtime exception m hi use karte h // 
import java.util.Scanner;
class YoungerAgeException extends RuntimeException{

     YoungerAgeException(String msg)  {    // ye hum ne ek constructor bana diya h // 
      super(msg);
    
    }
    
}
class voting{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Age ");
        int age = s.nextInt();
        try{ 
        if (age<18){
            throw new YoungerAgeException("You are not eligible for voting");
        }
    
        else {
            System.out.println("You can vote Successfully");  // try catch ka use compulsory h exception lo handle karane ke liye // 
        }
    }
        catch (Exception e ){
            e.printStackTrace();  
        }   
        System.out.println("Hello "); // hello iss liye print kara rhe h taki pata chal sake ki humara code successfully run hua h ki nahi // 
    }


}
  
