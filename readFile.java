import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class readFile{
    public static void main(String[] args){
try{
    File obj=new File("filename.txt");
    Scanner scan=new Scanner(obj);
    while(scan.hasNextLine()){
        String  data =scan.nextLine();
        System.out.println(data);
    }
    scan.close();
}
catch(FileNotFoundException e){
    System.out.println("An error occured");
    e.printStackTrace();
}
}
}