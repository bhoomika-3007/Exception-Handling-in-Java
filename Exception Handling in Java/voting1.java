// customized Exception in java or User Defined Exception in java //
class UnderAgeException extends Exception{

      UnderAgeException() {
        super("You are in under age");
    }
    UnderAgeException(String message){
        super(message);
    }

    
}
class Voting1{
    public static void main(String[] args) {
 
        int age = 17;
        try{
        if(age<18){
            throw new UnderAgeException(); 
        }
        else {
            System.out.println("You can vote ");  
        }
    }
    catch(UnderAgeException e){
        e.printStackTrace();  
    }
    }
}
