import java.io.*;
// i have no idea what im doing
public class CMIS_Client
{
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("test.txt");
            BufferedInputStream bin = new BufferedInputStream(in);
            CaptainMidnightInputStream cin = new CaptainMidnightInputStream(bin);
            
            try {
                int data = cin.read();
                while (data != -1) {
                    System.out.println(data - '0');
                }
            } catch (IOException e) {
                ;
            }
        } catch (FileNotFoundException e) {
            ;
        }
    }
}
