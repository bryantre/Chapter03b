import java.io.*;
// Bryan Trejo
public class CaptainMidnightInputStream extends FilterInputStream {

    public CaptainMidnightInputStream (InputStream in) {
        super(in);
    }
 
    public int read() throws IOException {
        int c = in.read();
        return (c == -1 ? c : Character.toUpperCase(c));
    }
        
    public int read(byte[] b, int offset, int len) throws IOException {
        int result = in.read(b, offset, len);
        for (int i = offset; i < offset+result; i++) {
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }
}