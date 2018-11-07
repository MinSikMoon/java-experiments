package app.minsik;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.security.Principal;
import java.util.List;
import java.util.Map;

import org.mapdb.DB;
import org.mapdb.DBMaker;
import org.springframework.http.HttpHeaders;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketExtension;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import app.minsik.SocketSerializer;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        DB db = DBMaker.memoryDB().make();
        WebSocketSession ws = new WebSocketSession() {

            @Override
            public void setTextMessageSizeLimit(int messageSizeLimit) {

            }

            @Override
            public void setBinaryMessageSizeLimit(int messageSizeLimit) {

            }

            @Override
            public void sendMessage(WebSocketMessage<?> message) throws IOException {

            }

            @Override
            public boolean isOpen() {
                return false;
            }

            @Override
            public URI getUri() {
                return null;
            }

            @Override
            public int getTextMessageSizeLimit() {
                return 0;
            }

            @Override
            public InetSocketAddress getRemoteAddress() {
                return null;
            }

            @Override
            public Principal getPrincipal() {
                return null;
            }

            @Override
            public InetSocketAddress getLocalAddress() {
                return null;
            }

            @Override
            public String getId() {
                return "minsikmoon";
            }

            @Override
            public HttpHeaders getHandshakeHeaders() {
                return null;
            }

            @Override
            public List<WebSocketExtension> getExtensions() {
                return null;
            }

            @Override
            public int getBinaryMessageSizeLimit() {
                return 0;
            }

            @Override
            public Map<String, Object> getAttributes() {
                return null;
            }

            @Override
            public String getAcceptedProtocol() {
                return null;
            }

            @Override
            public void close(CloseStatus status) throws IOException {

            }

            @Override
            public void close() throws IOException {

            }
        };
        SocketSerializer ss = new SocketSerializer();
        Map<String, WebSocketSession> map = (Map<String, WebSocketSession>) db.hashMap("testmap").create();
        map.put("testws", ws);
        System.out.println(map.get("testws").getId());
        // map.put("name", "minsik222");
        // System.out.println(map.get("name"));
    }

}
