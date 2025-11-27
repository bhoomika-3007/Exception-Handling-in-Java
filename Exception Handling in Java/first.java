import java.io.FileInputStream; // iss file use hum data ko read karne ke liye use karte h // 
class first{
    public static void main(String[] args) {
        FileInputStream ps =  new FileInputStream("d:/abc.txt");  // ye compile time m hi exception show kara dega // 
    } // ye compile time pe hi excetion show kara dega or compiler bolega ki ye exception in future aa sakti h isse handle karo  // 
}        