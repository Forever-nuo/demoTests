package mathTest;

import org.junit.Test;

import java.text.NumberFormat;

/**
 * Created by Administrator on 2017/4/21.
 */
public class MathTest {

    /***
     * 将数字转成百分比
     */
    @Test
    public void test1() {
        float f = 0.1f;
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setMaximumIntegerDigits(2);
        numberFormat.setMinimumIntegerDigits(2);
        String format = numberFormat.format(f*100)+"%";
    }


    /***
     * 数字和null相加结果
     */
    @Test
    public void test2() {
        Integer a = 3;
        a= null;
        Integer num = a +1;

    }

}
