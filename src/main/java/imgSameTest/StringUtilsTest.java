package imgSameTest;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * Created by Administrator on 2017/4/17.
 */
public class StringUtilsTest {


    /***
     * 字符串 缩写省略
     */
    @Test
    public void testAbbreviate1() {
        String str = StringUtils.abbreviate("真的么", 8); //参数1 字符串的长度 小于 参数2长度
    }

    @Test
    public void testAbbreviate2() {
        String str = StringUtils.abbreviate("真的么还好吧真的对啊对不是", 8); //参数1 字符串的长度 小于 参数2长度  结果"真的么还好..."
        System.out.println(str);
    }

    /***
     * 将数组中的元素拼接成字符串
     * 并且以逗号隔开
     */
    @Test
    public void testJoin() {
        int[] x = {1, 2, 3, 9, 4};
        String result = StringUtils.join(x, "");
        System.out.println(result);//1,2,3,9,4

        Integer[] y = {1, 2, 3, 5, 7};
        String result1 = StringUtils.join(y, "");
        System.out.println(result1);//1好的2好的3好的5好的7
    }

    @Test
    public void test1() {
        int[] x = {1, 2, 3};
        String str = "好的";
        String s = StringUtils.joinWith(",", x, str);
        System.out.println(s);
    }


    /**
     * 首字母大写
     */
    @Test
    public void testCapitalize() {
        System.out.println(StringUtils.capitalize("testcapitalize"));//Testcapitalize
    }


}
