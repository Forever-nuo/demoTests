package collectionTest;

import org.junit.Test;

import java.util.ArrayList;

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
        int [] arr = {1,3,5,7,9,11,13,15,17,19,21,23};
        double v = Math.random() * 100;
    }   
}
