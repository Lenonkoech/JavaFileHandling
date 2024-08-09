import java.io.File;//import file class
import java.io.IOException;//import Exception class to handle errors
public class createFile{
    public static void main(String[] args){
        try{
            File obj=new File("filename.txt");
            if(obj.createNewFile()){
                System.out.println("File created "+obj.getName());
            }else{
                System.out.println("File already exist !!");
            }
        }
        catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}