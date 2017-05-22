package timeTest;

import org.junit.Test;

/**
 * Created by Administrator on 2017/5/5.
 */
public class TimeTest {
    /**
     *678021354
     * 678007023
     * -677915795
     * -677805778
     * -677782787
     */
    @Test
    public void test1() {
        Integer id ;
       id= (int)System.currentTimeMillis();//+new Random().nextInt(10000)));
        System.out.println( id);
    }
}
