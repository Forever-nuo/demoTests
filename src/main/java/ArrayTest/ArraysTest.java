package ArrayTest;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/4/28.
 */
public class ArraysTest {

    @Test
    public void test1() {
        int[] a = {};
        System.out.println(a.length);
    }


    /***
     * 二分查找
     */
    @Test
    public void testBinarySearch() {
        int[] arr = {1, 3, 6, 8, 11};
        int i = Arrays.binarySearch(arr, 11);
    }


    /***
     * 空数组的特性
     */
    @Test
    public void test2() {
        Integer[] arr = {};
        String join = StringUtils.join(arr, ",");
        List ara = new ArrayList();
        String join1 = StringUtils.join(ara, ",");
    }


    /***
     * 将数组装成list
     */
    @Test
    public void test3() {
        Arrays.asList();
    }


    /****
     * 数组的选择排序
     */
    @Test
    public void test4() {
        int[] x = {3, 2, 5, 9, 8, 7, 4, 2};

/*        for (int i = 0; i < x.length-1; i++) {
            for (int j = i+1; j < x.length; j++) {
                if(x[i]>x[j]){
                    int temp = x[i];
                    x[i]=x[j];
                    x[j]=temp;
                }
            }

        }*/

        for (int i = 0; i < x.length - 1; i++) {
            for (int j = 0; j < x.length - 1 - i; j++) {
                if (x[j] > x[j + 1]) {
                    int temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }

            }

        }

        System.out.println(x);
    }


    /***
     * arrays转换成的list不能增删操作
     */
    @Test
    public void testArraysRemove() {
        String[] str = {"11", "22", "33"};
        String[] str2 = {"22", "33", "44"};
        List<String> strings = Arrays.asList(str);
        List<String> strings2 = Arrays.asList(str2);
        strings.removeAll(strings2);
    }


    /***
     * list中可以添加 null
     */
    @Test
    public void testAddNull() {
        List list = new ArrayList();
        list.add(null);
        list.add(2);
    }

    @Test
    public void test56() {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);

        for (Integer integer : list) {
            if (integer != 3)
                list.add(3);
        }
    }


    @Test
    public void test54() {
    }

    /***
     * 测试两个数组是否相等
     * <p/>
     * <p/>
     * 顺序不一样 内容一样  数组也判断不一样
     */
    @Test
    public void testEquals() {
        String[] str1 = {"ef", "bb", "bf"};
        String[] str2 = {"bb", "ef", "bf"};
        String[] str3 = {"ef", "bb", "bf"};
        boolean equals = Arrays.equals(str1, str2);
        System.out.println(equals);
        boolean equals1 = Arrays.equals(str1, str3);
        System.out.println(equals1);

    }


}
