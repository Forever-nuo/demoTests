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
            int [] a = {};
        System.out.println(a.length);
    }


    /***
     * 二分查找
     */
    @Test
    public void testBinarySearch() {
        int[] arr = {1,3,6,8,11};
        int i = Arrays.binarySearch(arr, 11);
    }


    /***
     * 空数组的特性
     */
    @Test
    public void test2() {
        Integer [] arr = {};
        String join = StringUtils.join(arr, ",");
        List ara =new ArrayList();
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
            int [] x  =  {3,2,5,9,8,7,4,2};

/*        for (int i = 0; i < x.length-1; i++) {
            for (int j = i+1; j < x.length; j++) {
                if(x[i]>x[j]){
                    int temp = x[i];
                    x[i]=x[j];
                    x[j]=temp;
                }

            }

        }*/

        for (int i = 0; i < x.length-1; i++) {
            for (int j = 0; j < x.length-1-i; j++) {
                if(x[j]>x[j+1]){
                    int temp = x[j];
                    x[j]=x[j+1];
                    x[j+1]=temp;
                }

            }

        }

        System.out.println( x);
    }



}
