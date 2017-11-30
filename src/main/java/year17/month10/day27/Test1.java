package year17.month10.day27;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test1
{
    @Test
    public void test() {
        String ids = "12,23,3,4";
        String[] split = StringUtils.split(ids, ",");


        Set<Integer> idSet = new HashSet(Arrays.asList(split));

        System.out.println(1);
    }


    /**
     * 原来的不会替换
     *
     * 返回一个新的 是替换后的
     */
    @Test
    public void testSplit() {

        String str = "abcde";
        String str2 = str.replaceFirst("a", "c");
        System.out.println(str);
    }

}
