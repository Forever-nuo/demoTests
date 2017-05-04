package imgSameTest;

import org.junit.Test;

import java.io.IOException;

/**
 * Created by Administrator on 2017/4/11.
 */
public class StringTest {

    /**
     * 一个空对象 拼接一个字符串
     */
    @Test
    public void test1() throws IOException {
        String str = null;
        str = null + "abc";
        System.out.println(str); //null+字符串

    }

    /**
     * 切割字符串  如果没有切割符
     * 切割出来的字符串数组就是1个
     * @throws IOException
     */
    @Test
    public void testSplit() throws IOException {
        String[] split = "abc".split(","); //{adc}
    }

    /***
     * 字符是否包含
     */
    @Test
    public void testContain() {
        String test1 = "abcd";
        String test2 = "ac";
        boolean contains = test1.contains(test2);
        System.out.println(contains);

    }
}
