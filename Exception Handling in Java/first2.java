import java.io.FileInputStream; 
public class first2 {
public static void main(String[] args) { // ye compile time exception h //  
    try {
        FileInputStream fs = new FileInputStream("c:/abc.txt");
    } catch (Exception e) {
        System.out.println(e);    // ye program exception show kar rha h // 
    }   // file not found exception show kar rha h // 
    System.out.println("Hello this is the Exeption Handling Program in java"); 
    // ye program compile bhi ho rha h or run bhi ho rha h // 
    // ye program bilkul sahi h //        
}    
}  
   