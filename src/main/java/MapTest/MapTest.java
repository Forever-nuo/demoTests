package MapTest;

import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/11.
 */
public class MapTest {

    @Test
    public void test1() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "1");
        map.put(2, "3");
        map.put(1, "2");
        Collection<String> values = map.values();


    }
}
