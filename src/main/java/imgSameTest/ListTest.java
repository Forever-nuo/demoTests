package imgSameTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/17.
 */
public class ListTest {


    /***
     * list如果为null
     * 就不能 迭代 否则报 NullPointerException
     */
    @Test
    public void test1() {
        List<Integer> lists = new ArrayList<Integer>();
        lists = null;
        for (Integer list : lists) {
            System.out.println(list);
        }
    }

    /***
     * list如果为null
     * 就不能 迭代 否则报 NullPointerException
     *
     * 可以将初始化为一个新的list
     *
     */
    @Test
    public void test2() {
        List<Integer> lists = null;
        lists= new ArrayList<Integer>();
        for (int i = 0; i < lists.size(); i++) {
                lists.get(i);
        }
    }

    @Test
    public void test3() {
        List<Integer> lists =   new ArrayList<Integer>();
            lists.get(0);
    }

}
