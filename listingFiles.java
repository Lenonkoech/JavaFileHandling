/*
java program tha lists the files available in a folder
*/
import java.io.File;
public class listingFiles{
    public static void main(String[] args){
        int count=0;
        File file=new File("/home/lenon/Desktop/learning");
        String[] fileList=file.list();
        for(String str : fileList){
            System.out.println(str);
            count++;
        }
        System.out.println("Total files "+count);
    }
}
