package app.minsik;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.mapdb.DataInput2;
import org.mapdb.DataOutput2;
import org.mapdb.Serializer;
import org.springframework.web.socket.WebSocketSession;

public class SocketSerializer implements Serializable, Serializer<WebSocketSession> {
    private static final long serialVersionUID = 1L;

    @Override
    public void serialize(DataOutput2 out, WebSocketSession value) throws IOException {

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutput oo = null;

        try {
            oo = new ObjectOutputStream(bos);
            oo.writeObject(value);
            out.write(bos.toByteArray());
        } finally {
            try {
                if (oo != null) {
                    oo.close();
                }
            } catch (IOException ex) {
            }
            try {
                bos.close();
            } catch (IOException ex) {
            }
        }

    }

    @Override
    public WebSocketSession deserialize(DataInput2 input, int available) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(input.internalByteArray());
        ObjectInput in = null;
        WebSocketSession out = null;
        try {
            in = new ObjectInputStream(bis);
            out = (WebSocketSession) in.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                bis.close();
            } catch (IOException ex) {
            }
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
            }
        }
        return out;

    }
}