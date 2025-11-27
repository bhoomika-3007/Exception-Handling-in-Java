// throws keyword in java // 
import java.io.FileInputStream;
import java.io.FileNotFoundException; 
import java.io.FileOutputStream; 

public class RAW  {
    void readFile() throws FileNotFoundException 
    {
    FileInputStream fe = new FileInputStream("d:/abs.txt");  
            
    }
    void SaveFile() throws FileNotFoundException{
        String text  = "this is demo";
        FileOutputStream fs = new FileOutputStream("d:/xyz.txt"); 
    }
       
} 
class test {
    public static void main(String[] args) {
        RAW r  = new RAW();
        try {
            r.readFile();
            
        } catch (Exception e) {
            e.getStackTrace();   
        }
        try{
            r.SaveFile();
        }
        catch(Exception e){
            e.getStackTrace();   
        }
       
    }
} 
