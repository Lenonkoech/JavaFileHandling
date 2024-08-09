import java.io.FileWriter;//import file Writer class
import java.io.IOException;
public class writeToFile{
    public static void main(String[] args){
        try{
            FileWriter myWriter=new FileWriter("filename.txt");
            myWriter.write("Handling files with java is fun !!!");
            myWriter.close();
            System.out.println("Sucessfullu wrote to file");
        }catch(IOException e){
            System.out.println("An Error occurred");
            e.printStackTrace();
        }
    }
}