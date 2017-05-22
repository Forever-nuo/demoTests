package collectionTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/28.
 */
public class ListTest {
    @Test
    public void test1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add('A');
        arrayList.add('B');
        arrayList.add('C');
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add('A');
        arrayList2.add('C');
        boolean b = arrayList.containsAll(arrayList2);


    }


    @Test
    public void test2() {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23};
        double v = Math.random() * 100;
    }


    @Test
    public void test3() {
        List<String> str = new ArrayList<>();
        str.add("abc");
        str.add("1");
        str.add("2");
        List<String> str2 = new ArrayList<>();
        str2.add("abc");
        str2.add("2");
        str2.add("1");
        boolean b = str.containsAll(str2);

    }


}
