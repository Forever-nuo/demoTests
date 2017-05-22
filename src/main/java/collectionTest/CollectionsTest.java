package collectionTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Administrator on 2017/5/3.
 */
public class CollectionsTest {

    /***
     * 打乱集合中元素的顺序
     * 洗牌法
     */
    @Test
    public void test1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add('A');
        arrayList.add('B');
        arrayList.add('C');
        arrayList.add('E');
        arrayList.add('F');
        arrayList.add('G');
        arrayList.add('H');
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
    }


    /***
     * 一个数组 然后打乱数组中的元素
     */
    @Test
    public void test2() {
        int[] arr = {1, 2, 3, 5, 7, 9, 11};
        int[] arrTemp = new int[arr.length];
        int end = arr.length;
        Random rad = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = rad.nextInt(end);
            arrTemp[i] = arr[index];
            arr[index] = arr[end - 1];
            end--;
        }
    }


    @Test
    public void test3() {

    }



}
