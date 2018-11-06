package app.minsik;

import java.util.concurrent.ConcurrentMap;

import org.mapdb.DB;
import org.mapdb.DBMaker;
import org.mapdb.Serializer;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        DB db = DBMaker.memoryDB().make();
        ConcurrentMap<String, String> map = db.hashMap("map", Serializer.STRING, Serializer.STRING).createOrOpen();
        map.put("name", "minsik222");
        System.out.println(map.get("name"));
    }

}
