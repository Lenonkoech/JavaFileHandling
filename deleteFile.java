import java.io.File;
public class deleteFile{
    public static void main(String[] args){
        File obj=new File("filename.txt");
    if(obj.delete()){
            System.out.println("Delete the file: "+obj.getName());
        } else{
            System.out.println("Failed to delete File");
        }
    }
}