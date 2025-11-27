public class ca {
    public static void main(String[] args) {
        ca a = new ca();
        a.display();  
        System.out.println("hello");       
        
    }
    void display(){ // ye program m humne object banaya h //   
        try{
            int a = 100, b =0, c;
            c=a/b;
            System.out.println(c); 
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
