/* 
code to check and print local ip adress of machine
*/
import java.net.*;
public class localAdress{
    public static void main(String[] args){
        try{
            InetAddress adress = InetAddress.getLocalHost();
            System.out.println(adress);
        }
        catch(Exception e){
            System.out.println("Could not find adress");
        }
    }
}