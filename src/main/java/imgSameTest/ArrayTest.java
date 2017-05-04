package imgSameTest;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/4/12.
 */
public class ArrayTest {
    @Test
    public void test() {
        String[] str1 = {"62868cafda9cf828827fffcff7fb01f7", "93a30c23762a9098377ac2045be80678", "22222"};
        String[] str2 = {"93a30c23762a9098377ac2045be80678", "62868cafda9cf828827fffcff7fb01f7"};
        Arrays.sort(str1);
        Arrays.sort(str2);
        boolean equals = Arrays.equals(str1, str2);
    }

    @Test
    public void test1() {
        String[] str1 = {"abc", "bcd"};
        String[] str2 = {"bcd", "lll"};
        List<String> strings1 = Arrays.asList(str1);
        List<String> strings2 = Arrays.asList(str2); //数组转成的集合 不能进行修改操作
        List<String> newStr = new ArrayList<String>(strings1);
        newStr.removeAll(strings2);
    }
    @Test
    public void test2() {
        String [] str = {"1","a","slwle"};
        String string = Arrays.toString(str);
    }

    @Test
    public void test3() {
        int [] x = {1,3,5,7,9,11,13,15,17,19};
        int[] subarray = ArrayUtils.subarray(x, 5, 7);
        
        int[] ints = Arrays.copyOfRange(x, 2, 5);
        List<Integer> lists = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            Integer y = i;
            lists.add(y);
        }
        List<Integer> integers = lists.subList(2, 3);
    }
    
    
}
