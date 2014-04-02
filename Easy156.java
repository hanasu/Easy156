import java.io.*;

/**
 * Given an encoded string where each character's ASCII value has had 4 added to it, this program
 * will decode and output the decoded string to uncover the secret message.
 * 
 * @author Brendan O'Dowd
 * @version 4/2/14
 */
public class Easy156
{
    public static void main(String[] args) throws IOException {
        char[] decoded = new char[1000]; //will contain the decoded output as separate characters
        char[] encoded = new char[1000]; //will contain the encoded String read from file as separate characters
        int asciiVal; //will contain the current char's value on ASCII table
        File file = new File("encodetext.dat");
        file.createNewFile();
        FileReader fr = new FileReader(file);
        
        fr.read(encoded); //read the encoded data into the array
        
        for(int i=0;i<encoded.length-1;i++) { //index 0 (since it's an array) requires the length to be one value less
            if (encoded[i]!=0) { //as long as the ASCII value is not 0, ie the message has not been finished
                asciiVal = (int)encoded[i]-4; //subtract 4 from the ASCII value to get the decoded output
                decoded[i] = (char)asciiVal; //store the decoded character with the correct ASCII value in the decoded array
            }
        }
        
        for (int j=0;j<decoded.length-1;j++) { //index 0 (since it's an array) requires the length to be one value less
            System.out.print(decoded[j]); //print each character in the array
        }
    }    
}
