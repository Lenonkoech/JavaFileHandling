import java.io.File;
public class FileInfo{
    public static void main(String[] args){
        File obj=new File("filename.txt");
        if(obj.exists()){
            System.out.println("File name "+obj.getName());
            System.out.println("Absolute path "+obj.getAbsolutePath());
            System.out.println("Writable "+obj.canWrite());
            System.out.println("Readable "+obj.canRead());
            System.out.println("File size in Bytes "+obj.length());
        }else{
            System.out.println("The file does not exist");
        }
    }
}