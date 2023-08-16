package headfirst.designpatterns.decorator._02_after.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = in.read();
        return (c == -1 ? c : Character.toLowerCase(c));
    }

    @Override
    public int read(byte[] b, int offer, int len) throws IOException {
        int result = in.read(b, offer, len);
        for (int i = offer; i < offer + result; i++) {
            b[i] = (byte) Character.toLowerCase(b[i]);
        }
        return result;
    }
}
