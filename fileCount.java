/*
Counting number of characters in a file
*/
import java.io.*;
public class fileCount{
    public static void main(String[] args) throws IOException{
        File file =  new File("filename.txt");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input= new InputStreamReader(fileStream); 
        try (BufferedReader reader = new BufferedReader(input)) {
            String line;
            //initializing counters
            int countWord=0;
            int sentanceCount=0;
            int characterCount=0;
            int paragraphCount=1;
            int whitespaceCount=0;
            //reading file line by line until a null is returned
            while((line = reader.readLine()) != null){
                if(line.equals("")){
                    paragraphCount++;
                }else{
                    characterCount +=line.length();
                    // \\s+ is space delimitter in java
                    String[] wordList = line.split("\\s+");
                    countWord += wordList.length;
                    whitespaceCount += countWord -1;
                    // [!?.:]+ is the sentance delimitter in java
                    String[] sentanceList = line.split("[!?.:]");
                    sentanceCount += sentanceList.length;
                }
            }
            System.out.println("Total word count is: "+countWord);
            System.out.println("Total number of sentances: "+sentanceCount);
            System.out.println("Total number of characters: "+characterCount);
            System.out.println("Number of paragraphs: "+ paragraphCount);
            System.out.println("Total number of whiteSpaces "+ whitespaceCount);
        }
    }
}