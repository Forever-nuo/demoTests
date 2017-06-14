package StringTest;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/5/23.
 */
public class PatternDemo {

    @Test
    public void test1() {
        String str = "2007年12月11日";
        Pattern p = Pattern.compile("[年月日]");
        String[] dataArr = p.split(str);
        for (String strTmp : dataArr) {
            System.out.println(strTmp);
        }
    }

    /***
     * pattern的matches方法
     */
    @Test
    public void testMatches() {

        /***
         * 等价于 Pattern.matches("正则表达式","匹配文本")方法
         */
        Pattern compile = Pattern.compile("\\d{5}");
        Matcher matcher = compile.matcher("88873");
        boolean matches = matcher.matches();


        boolean matches1 = Pattern.matches("\\d{5}", "33344");
    }


    @Test
    public void testSplit() {
        String str = "2007年12月11日";
        Pattern compile = Pattern.compile("[年月日]");
        String[] split = compile.split(str);
        for (String s : split) {
            System.out.println(s);
        }


        String[] split1 = str.split("[年月日]");
        for (String s : split1) {
            System.out.println(s);
        }

    }


    @Test
    public void testReplace() {
        String str = "10元 1000人民币 10000元 100000RMB";
        str = str.replaceAll("(?<=\\d+)(元|人民币|RMB)", "￥");
        System.out.println(str);

        String str1 = "10元 1000人民币 10000元 100000RMB";
        String ￥ = StringUtils.replaceAll(str1, "(?<=\\d+)(元|人民币|RMB)", "￥");
        System.out.println(￥);

        String str2 = "10元 1000人民币 10000元 100000RMB";
        Pattern compile = Pattern.compile("(?<=\\d+)(元|人民币|RMB)");
        Matcher matcher = compile.matcher(str2);
        String ￥1 = matcher.replaceAll("￥");
        System.out.println(￥1);
    }


    @Test
    public void test() {
        Pattern p = Pattern.compile("m(o+)n", Pattern.CASE_INSENSITIVE);

        // 用Pattern类的matcher()方法生成一个Matcher对象
        Matcher m = p.matcher("moon mooon cccd Mon mooooon Mooon aadd ");
        StringBuffer sb = new StringBuffer();


        // 使用循环找出模式匹配的内容替换之,再将内容加到sb里
        while (m.find()) {
            m.appendReplacement(sb, "moon");
        }
        // 最后调用appendTail()方法将最后一次匹配后的剩余字符串加到sb里；
        m.appendTail(sb);

        System.out.println("替换后内容是" + sb.toString());
    }


    /***
     * 把整个 img 标签 替换为 url地址的值
     */
    @Test
    public void test2() {
        Pattern compile1 = Pattern.compile("<img.*?src=.*?>");
        String content = "aa好的<img src=\"../../file\" />真的很的<img src=\"../../file/ooo\">";
        Matcher matcher = compile1.matcher("aa好的<img src=\"../../file\" />真的很的<img src=\"../../file/ooo\">");
        while (matcher.find()) {
            System.out.println(matcher.group());

        }
    }

    @Test
    public void test3() {
        Pattern compile1 = Pattern.compile("<img.*?src=\".*?\".*?>");
        String content = "aa好的<img src=\"../../file\" />真的很的<img src=\"../../file/ooo\">";
        Matcher matcher = compile1.matcher(content);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }


    private List<String> getImgTagsByContent(String content) {
        Matcher matcher = Pattern.compile("<img.*?src=\".*?\".*?>").matcher(content);
        List<String> paths = new ArrayList<>();
        while (matcher.find()) {
            paths.add(matcher.group());
        }
        return paths;
    }


    @Test
    public void test6() {
        String content = "aa好的<img src=\"../../file\" />真的很的<img src=\"../../file/ooo\">";
        List<String> imgTagsByContent = getImgTagsByContent(content);
        for (String s : imgTagsByContent) {
            Matcher matcher = Pattern.compile("(?<=src=\").*?(?=\".*?>)").matcher(s);
            matcher.find();
            String group = matcher.group();
            System.out.println(group);
        }

    }


    @Test
    public void test7() {
        String content =  "aa好的<img src=\"../../file\" />真的很的<img src=\"../../file/ooo\">";
        Matcher matcher = Pattern.compile("<img.*?src=\"(.*?)\".*?>").matcher(content);
        List<String> paths = new ArrayList<>();
        while (matcher.find()) {
            paths.add(matcher.group());
            System.out.println(matcher.group(1));
        }
    }


}
