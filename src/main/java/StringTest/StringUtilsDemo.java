package StringTest;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/5/17.
 */
public class StringUtilsDemo {

    /***************************************************************join方法******************************/
    /***
     * 拼接字符串  没有分隔符
     * 参数,可变参数
     */
    @Test
    public void testJoin3() {
        String str = StringUtils.join("a", 1); //结果a1
    }


    /**
     * 拼接字符串
     * 参数1: 数组
     * 参数2:分隔符 可以是字符串或者字符
     */
    @Test
    public void testJoin2() {
        String join = StringUtils.join(new Integer[]{111, 3, 44}, ",");
    }


    /***
     * 基本类型的数组
     * 第二个参数是'' 字符分隔符
     */
    @Test
    public void testJoin1() {
        int[] arr = {1, 2, 3};
        String join = StringUtils.join(arr, '-');
    }

    /***
     * 参数1:集合
     * 参数2:分隔符
     */
    @Test
    public void testJoin4() {
        List<String> integers = new ArrayList<>();
        integers.add("1");
        integers.add("aaa");
        String join = StringUtils.join(integers, ",");
    }


    /***
     * 数组对象的部分拼接字符串
     */

    @Test
    public void testJoin5() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String join = StringUtils.join(arr, '-', 1, 8);
    }


    /******************************************joinWith方法****************************************/

    /**
     * joinWith
     * 参数1: 字符串分隔符
     * 参数2: 可变参数对象 不能是基本数据类型
     */
    @Test
    public void testJoinWith() {
        Integer[] arr = {1, 3, 5};
        String s = StringUtils.joinWith(",", arr);//
    }


    /***
     * joinWith
     * 参数2: 不能传集合对象  会把其当成一个 数组 第一个数组元素就是list
     */
    @Test
    public void testJoinWith1() {
        List<String> integers = new ArrayList<>();
        integers.add("1");
        integers.add("aaa");
        String s = StringUtils.joinWith("--", integers);
    }


    /***********************capitalize方法*********************************************/
    /***
     * 自将字符串的首字母转换成大写
     */
    @Test
    public void testCapitalize() {
        String capitalize = StringUtils.capitalize("111");   // 111
        String capitalize1 = StringUtils.capitalize("111aaaBBBcc");//111aaaBBBcc
        String aAbbc1AA = StringUtils.capitalize("AAbbc1AA");//AAbbc1AA
        String aBBBB111c = StringUtils.capitalize("aBBBB111c");//ABBBB111c
    }


    /*************************************
     * 字符串省略
     *****************/
    @Test
    public void testAbbreviate() {
        String aaaa2222 = StringUtils.abbreviate("aaaa2222121234", 11);
        String a1 = StringUtils.abbreviate("aaaa2222", 4);
     }


    /****
     *
     */
    @Test
    public void testAbbreviateMiddle() {
        String aaaa2222 = StringUtils.abbreviateMiddle("aaaa2222", "33", 6);
    }


    /******************************
     * 字符串居中
     *************************/
    @Test
    public void testCenter() {
        //  String a = StringUtils.center("弦断无人听",8);
        String ab = StringUtils.center("弦断无人听", 9, "*-");
    }

    @Test
    public void testChomp() {
        String chomp = StringUtils.chomp(" 我  ");
    }


    /**********************************isEmpty方法***********************/
    /**
     * 判断是否为空
     * <p/>
     * public static boolean isEmpty(CharSequence cs) {
     * return cs == null || cs.length() == 0;
     * }
     */

    @Test
    public void testIsEmpty() {
        boolean empty = StringUtils.isEmpty(new String()); //trues
        String str = null;
        System.out.println(StringUtils.isEmpty(str)); //true

        System.out.println(StringUtils.isEmpty(""));//true
        System.out.println(StringUtils.isEmpty("  "));//false
        //System.out.println(str.isEmpty());  //String.isEmpty 方法 如果是空字符串会报异常
        System.out.println(StringUtils.isEmpty(new String("333")));
    }


    /***
     * 判断是否为非空 !isEmpty()
     */
    @Test
    public void test1() {
        boolean empty = StringUtils.isNotEmpty(new String()); //trues
        String str = null;
        System.out.println(StringUtils.isNotEmpty(str)); //false

        System.out.println(StringUtils.isNotEmpty(""));//false
        System.out.println(StringUtils.isNotEmpty("  "));//true
        //System.out.println(str.isEmpty());  //String.isEmpty 方法 如果是空字符串会报异常
        System.out.println(StringUtils.isNotEmpty(new String("333"))); //true
    }


    /***********************************************************判断字符串是否为空白字符串***********************/

    /****
     * 判断字符串是否为空,长度为0,是否为空格字符串
     */
    @Test
    public void testBlank() {
        String string = "2222";
        boolean flag = StringUtils.isBlank("22222");
        flag = StringUtils.isBlank(null);
        flag = StringUtils.isBlank("");
        flag = StringUtils.isBlank(new String());
        flag = StringUtils.isBlank("    ");
        flag = StringUtils.isBlank("\t\n\f\r");
    }


    /**********
     * 1.trim "" 返回"";
     * 2.trim  null  返回null
     * 3.去除2端的空白符
     */
    @Test
    public void testTrim() {
        System.out.println(111);
        String trim = StringUtils.trim("");
        trim = StringUtils.trim(null);
        trim = StringUtils.trim("\t\n\r\f");
        trim = StringUtils.trim("     ");
        trim = StringUtils.trim("  333   ");
        trim = StringUtils.trim("  3 3 ");
    }

    /**
     * 1.和trim 的区别 去除两端空格 返回的是"" 返回结果为null
     * 去除两边空格
     */
    @Test
    public void testTrimNull() {
        System.out.println(111);
        String trim = StringUtils.trimToNull("");
        trim = StringUtils.trimToNull(null);
        trim = StringUtils.trimToNull("\t\n\r\f");
        trim = StringUtils.trimToNull("     ");
        trim = StringUtils.trimToNull("  333   ");
        trim = StringUtils.trimToNull("  3 3 ");
    }


    /***
     * 去除两端空格
     * null 和去除两端空格后 都是 ""
     */
    @Test
    public void testTrimEmpty() {
        System.out.println(111);
        String trim = StringUtils.trimToEmpty("");
        trim = StringUtils.trimToEmpty(null);
        trim = StringUtils.trimToEmpty("\b\t\n\r\f");
        trim = StringUtils.trimToEmpty("     ");
        System.out.println(trim.length());
        trim = StringUtils.trimToEmpty("  333   ");
        trim = StringUtils.trimToEmpty("  3 3 ");
    }


    /**************************************************trip方法***********************************************/
    /**
     * 和 trim 的区别
     * trim 会把 \b 也当成空格处理
     * strip 不会把\b 当成空格处理
     * <p/>
     * stripToEmpty方法 和StripToNull 方法 和trim的方法差不多
     */
    @Test
    public void testStrip() {
        System.out.println(111);
        String trim = StringUtils.trimToEmpty("");// ""
        trim = StringUtils.strip(null); // null
        trim = StringUtils.strip("\b\t\n\r\f");// \b
        trim = StringUtils.strip("     ");  // ""
        System.out.println(trim.length());
        trim = StringUtils.strip("  333\b   "); //333\b
        trim = StringUtils.strip("  3 3 ");
    }

    /****
     * Strip 方法使用2
     * 2个参数
     * 在参数1中两端去除  参数2的字符串
     * 如果参数1 ""  返回 ""
     * 如果参数1 null 返回 null
     * 如果参数2 " " 返回参数1 本身
     */
    @Test
    public void testStrip2() {
        String result = StringUtils.strip("", "aa");
        result = StringUtils.strip(null, "aa");
        result = StringUtils.strip("aabbbaa", "aa");
        result = StringUtils.strip("aabbbaa", "  aa  ");
        result = StringUtils.strip("aabbbaa", "");
        result = StringUtils.strip(null, "");
        result = StringUtils.strip("", "");
    }

    /***
     * 和strip差不多
     * strip 是去除2端的
     * stripStart 是去除起始的
     */
    @Test
    public void testStart() {
        String result = StringUtils.stripStart("", "aa");
        result = StringUtils.stripStart(null, "aa");
        result = StringUtils.stripStart("aabbbaa", "aa");
        result = StringUtils.stripStart("aabbbaa", "  aa  ");
        result = StringUtils.stripStart("aabbbaa", "");
        result = StringUtils.stripStart(null, "");
        result = StringUtils.stripStart("", "");
    }

    /***
     * StripEnd 去除以第二个参数结尾的
     */
    @Test
    public void testEnd() {
        String result = StringUtils.strip("", "aa");
        result = StringUtils.strip(null, "aa");
        result = StringUtils.strip("aabbbaa", "aa");
        result = StringUtils.strip("aabbbaa", "  aa  ");
        result = StringUtils.strip("aabbbaa", "");
        result = StringUtils.strip(null, "");
        result = StringUtils.strip("", "");
    }


    /**
     * 参数: 可变参数数组
     * 第一个参数 是字符串数组
     * 对数组中的每个元素 进行 strip 方法
     * 如果数组是 null 或者长度为0 返回数组本身
     */
    @Test
    public void testStripAll() {
        String[] str = {};
        String[] str1 = {"aabbbaa"};
        String[] strings = StringUtils.stripAll(str, "aa");
        strings = StringUtils.stripAll(null, "aa");
        strings = StringUtils.stripAll(str1, "aa");
        strings = StringUtils.stripAll(str1, "  aa  ");
        strings = StringUtils.stripAll("aabbbaa", "");
        strings = StringUtils.stripAll(null, "");
        strings = StringUtils.stripAll("", "");
    }


    /***
     * 比较两个字符串是否相等
     * 如果都为null 也相等
     */
    @Test
    public void testEquals() {
        System.out.println(StringUtils.equals("", null)); //false
        System.out.println(StringUtils.equals(null, null));//true
        System.out.println(StringUtils.equals("a", "a"));//true
        System.out.println(StringUtils.equals("a", "a "));//false
        System.out.println(StringUtils.equals("a", "A"));//false
    }


    /***
     * 比较2个字符串是否相等  忽略大小写
     */
    @Test
    public void testEqualsIgnoreCase() {
        System.out.println(StringUtils.equalsIgnoreCase("", null)); //false
        System.out.println(StringUtils.equalsIgnoreCase(null, null));//true
        System.out.println(StringUtils.equalsIgnoreCase("a", "a"));//true
        System.out.println(StringUtils.equalsIgnoreCase("a", "a "));//false
        System.out.println(StringUtils.equalsIgnoreCase("a", "A"));//true
    }


    /**
     * 参数1: 寻找中的字符串
     * 参数2:需要找的字符串
     * 如果为null,"",或者没有找到 返回结果为-1
     */
    @Test
    public void testIndexOf() {
        System.out.println(StringUtils.indexOf("bbbbccc", "bb")); //0
        System.out.println(StringUtils.indexOf("bbaaccc", "aa")); //2
        System.out.println(StringUtils.indexOf("bbaaccc", "ad")); //-1
        System.out.println(StringUtils.indexOf("bbbbccc", "aa")); //-1
        System.out.println(StringUtils.indexOf("", "aa")); //-1
        System.out.println(StringUtils.indexOf(null, "aa"));//-1
        System.out.println(StringUtils.indexOf(null, ""));//-1
        System.out.println(StringUtils.indexOf("bbbbccc", null));//-1
    }

    /***
     * 3个参数
     * 参数3:从第几个角标开始
     */
    @Test
    public void testIndexOf2() {
        System.out.println(StringUtils.indexOf("bbbbccc", "bb", 2)); //2
        System.out.println(StringUtils.indexOf("bbaaccc", "aa", 3)); //-1
        System.out.println(StringUtils.indexOf("bbaaccc", "ad", 2)); //-1
        System.out.println(StringUtils.indexOf("bbbbccc", "aa")); //-1
        System.out.println(StringUtils.indexOf("", "aa")); //-1
        System.out.println(StringUtils.indexOf(null, "aa"));//-1
        System.out.println(StringUtils.indexOf(null, ""));//-1
        System.out.println(StringUtils.indexOf("   ", "aaa  "));//-1
        System.out.println(StringUtils.indexOf("   ", " "));//0
        System.out.println(StringUtils.indexOf("aaaaa", " "));//-1
    }


    /***
     * 字符串2 在字符串1中 第几次出现的位置
     */
    @Test
    public void testOrdinalIndexOf() {
        System.out.println(StringUtils.ordinalIndexOf("aabbbaac", "aa", 2));//5
        System.out.println(StringUtils.ordinalIndexOf("", "aa", 2));//-1
        System.out.println(StringUtils.ordinalIndexOf("null", "aa", 2));//-1
        System.out.println(StringUtils.ordinalIndexOf(" ", "", '*'));//0
        System.out.println(StringUtils.ordinalIndexOf("   ", "", 2));//0

    }

    /***
     * 最后一次出现的位置
     */
    @Test
    public void testLastIndexOf() {
        System.out.println(StringUtils.lastIndexOf("aabbbaac", "aa"));//5
    }


    /***
     * 字符串a出是否包含字符串b
     * 如果字符串a为null,或者"" 返回false
     * 如果字符串a中没有b, 返回false
     */
    @Test
    public void testContains() {
        System.out.println(StringUtils.contains("aaaabbbbc", "bbbb"));//true
        System.out.println(StringUtils.contains("aaaabbbbc", "bbbbb"));//false
        System.out.println(StringUtils.contains("aaaabbbbc", ""));//true
        System.out.println(StringUtils.contains("", "bbbbb"));//false
        System.out.println(StringUtils.contains(null, "bbbbb"));//false
    }


    /***
     * 不区分大小写
     * 看是否有包含
     */
    @Test
    public void testContainsIgnoreCase() {
        System.out.println(StringUtils.containsIgnoreCase("aaaabbbbc", "bbbb"));//true
        System.out.println(StringUtils.containsIgnoreCase("aaaabbbbc", "BBB"));//true
        System.out.println(StringUtils.containsIgnoreCase("aaaabbbbc", ""));//true
        System.out.println(StringUtils.containsIgnoreCase("", "bbbbb"));//false
        System.out.println(StringUtils.containsIgnoreCase(null, "bbbbb"));//false
    }

    /***
     * 参数1: 字符串a
     * 参数2: 字符串b
     * <p/>
     * 字符串b中的字符在字符串a中第一次出现的位置
     */
    @Test
    public void testIndexOfAny() {
        System.out.println(StringUtils.indexOfAny("aaabbbcccddd", "bc"));
        System.out.println(StringUtils.indexOfAny("aaabbbcccddd", " "));
        System.out.println(StringUtils.indexOfAny("aaabbbcccddd", "cf"));
        System.out.println(StringUtils.indexOfAny("aaabbbcccddd", "e "));
        System.out.println(StringUtils.indexOfAny("aaabbbcccddd", "ml"));
    }


    /***
     * 参数1:字符串a
     * 参数2: 字符数组
     * 字符数组中的字符在字符串a中第一次出现的位置
     */
    @Test
    public void testIndexOfAny1() {
        System.out.println(StringUtils.indexOfAny("aaabbbcccddd", new char[]{'a', ' ', 'c'}));
        System.out.println(StringUtils.indexOfAny("aaabbbcccddd", new char[]{'d', ' ', 'c'}));
        System.out.println(StringUtils.indexOfAny("aaabbbcccddd", new char[]{'d', ' '}));
        System.out.println(StringUtils.indexOfAny("aaabbbcccddd", new char[]{' '}));
        System.out.println(StringUtils.indexOfAny("aaabbbcccddd", "ml"));
    }


    /***
     * 参数1:字符串a
     * 参数2:字符数组
     * 不在字符数组中 字符串a中的第一个元素的位置
     * 都在字符数组中 则返回-1
     * 如果字符串为""或者null 则返回-1
     */
    @Test
    public void testIndexOfBut() {
        System.out.println(StringUtils.indexOfAnyBut("aaabbbcccddd", new char[]{'a', ' ', 'c'}));//字符b不在字符数组中
        System.out.println(StringUtils.indexOfAnyBut("aaabbbcccddd", new char[]{'d', 'c', 'a', 'b'}));//都在字符数组中就返回-1
        System.out.println(StringUtils.indexOfAnyBut("", new char[]{'d', ' '}));
        System.out.println(StringUtils.indexOfAnyBut(null, new char[]{' '}));
        System.out.println(StringUtils.indexOfAnyBut("aaabbbcccddd", "ml"));
    }


    /***
     * 参数1:字符串a
     * 参数2:字符串b
     * 在字符串a中  字符串b没有的字符
     */
    @Test
    public void testIndexOfBut2() {
        System.out.println(StringUtils.indexOfAnyBut("aaabbbcccddd", "abc"));//字符b不在字符数组中  9
        System.out.println(StringUtils.indexOfAnyBut("aaabbbcccddd", "abcdf"));//都在字符数组中就返回-1
        System.out.println(StringUtils.indexOfAnyBut("", "abcdf")); //   -1
        System.out.println(StringUtils.indexOfAnyBut(null, "abcdf"));//-1
        System.out.println(StringUtils.indexOfAnyBut("aaabbbcccddd", "ml"));//0
    }


    @Test
    public void testContainsOnly() {
        //参数1:字符串 中的每个字符 是否都在字符数组中  如果都在 返回true  有一个不在返回false
        System.out.println(StringUtils.containsOnly("aaaaabbbcc", new char[]{'a', 'b', 'c'}));//true
        System.out.println(StringUtils.containsOnly("aaaaabbbcc", new char[]{'a', 'b'}));//false
        System.out.println(StringUtils.containsOnly("aaaaabbbcc", new char[]{'a', 'b', 'c', 'd'}));//true
        System.out.println(StringUtils.containsOnly("aaaaabbbcc", new char[]{'a', 'b', 'c', ' '}));//true
    }

    @Test
    public void testContainsOnly2() {
        //参数1:字符串 中的每个字符 是否都在字符数组中  如果都在 返回true  有一个不在返回false
        System.out.println(StringUtils.containsOnly("aaaaabbbcc", "abc"));//true
        System.out.println(StringUtils.containsOnly("aaaaabbbcc", "ab"));//false
        System.out.println(StringUtils.containsOnly("aaaaabbbcc", "abcd"));//true
        System.out.println(StringUtils.containsOnly("aaaaabbbcc", "cabcv"));//true
    }


    /***
     * 参数1:字符串a
     * 参数2:字符数组b
     * 如果字符串a中 有字符数组b中的元素 则返回false, 没有则返回true
     */
    @Test
    public void testContainsNone() {
        System.out.println(StringUtils.containsNone("abcbc", new char[]{'a'})); //false
        System.out.println(StringUtils.containsNone("abcbc", new char[]{'d'})); //true
        System.out.println(StringUtils.containsNone("abcbc", new char[]{' '})); //true
    }

    /***
     * 截取子字符串
     * 参数1:要截取的字符串
     * 参数2:从字符串的某个位置截取 到最后一个
     * 如果值为负数  比如;-4 从|-4| 从后往前数 第4个 ,如果大于长度 截取所有
     */
    @Test
    public void testSubString() {
        System.out.println(StringUtils.substring("aaavvccddd", 3)); //vvccddd
        System.out.println(StringUtils.substring("aaavvccddd", 12)); //" "
        System.out.println(StringUtils.substring("aaavvccddd", 0));// aaavvccddd
        System.out.println(StringUtils.substring("aaavvccddd", -2));//dd
        System.out.println(StringUtils.substring("aaavvccddd", -10));//aaavvccddd
        System.out.println(StringUtils.substring("aaavvccddd", -11));//aaavvvccddd
    }

    @Test
    public void testSubString2() {
        System.out.println(StringUtils.substring("aaavvccddd", 3, 5)); //vv
        System.out.println(StringUtils.substring("aaavvccddd", 3, 2)); //""   第二个参数比第一个参数大 ""
        System.out.println(StringUtils.substring("aaavvccddd", 12, 5)); //" "
        System.out.println(StringUtils.substring("aaavvccddd", 0, 12));// aaavvccddd

        System.out.println(StringUtils.substring("aaavvccddd", -2, -6) + "好的");//  都为负数  第二个参数绝对值大 返回""
        System.out.println(StringUtils.substring("aaavvccddd", -10, -9));//a
        System.out.println(StringUtils.substring("aaavvccddd", -11, -8));//aa


        /***
         * 一正一负 第一个参数  第一个参数的绝对值要比第二个参数绝对值小
         */
        System.out.println(StringUtils.substring("aaavvccddd", 0, -8) + "真的");// aa
        System.out.println(StringUtils.substring("aaavvccddd", -8, 10) + "真的");// aa
        System.out.println(StringUtils.substring("aaavvccddd", 9, -8) + "真的1");// aa
    }

    /***
     * 参数1:字符串
     * 参数2:截取字符串的长度
     */
    @Test
    public void testLeft() {
        System.out.println(StringUtils.left("aaaaavvvvcc", 2));
        System.out.println(StringUtils.left("d", 2));
        System.out.println(StringUtils.left("", 2));  //""  返回 ""
        System.out.println(StringUtils.left(null, 2));// null
        System.out.println(StringUtils.left("aaaaavvvvcc", -2));// 负数返回""
    }

    /***
     * 参数1:字符串
     * 参数2:截取字符串的长度
     */
    @Test
    public void testRight() {
        System.out.println(StringUtils.right("aaaaavvvvcc", 2));//cc
        System.out.println(StringUtils.right("d", 2)); //d
        System.out.println(StringUtils.right("", 2));  //""  返回 ""
        System.out.println(StringUtils.right(null, 2));// null
        System.out.println(StringUtils.right("aaaaavvvvcc", -2));// 负数返回""
    }


    /***
     * 中间截取 固定长度
     */
    @Test
    public void testMid() {
        /***
         * 参数1:要截取的字符串  如果参数1为null或者"" 返回他本身 null 为null "" 为""
         * 参数2:从角标开始   如果是负数 则设为0   如果角标值 大于长度返回""
         * 参数3:截取的长度  如果为负数 返回""
         */
        System.out.println(StringUtils.mid("aaaaavvvvcc", 0, 2));//cc
        System.out.println(StringUtils.mid("aaaaavvvvcc", 5, 2));//cc
        System.out.println(StringUtils.mid("aaaaavvvvcc", -1, 2));//cc
        System.out.println(StringUtils.mid(" ", -1, 2));//cc
        System.out.println(StringUtils.mid(null, 2, 5)); //d
    }


    /**
     * 截取字符串 第一次出现之后的子字符串
     */
    @Test
    public void testSubstringAfter() {
        // 返回之后的元素 不包括本身
        System.out.println(StringUtils.substringAfter("aaabbbbcc", "bb")); //
        System.out.println(StringUtils.substringAfter("", "bb"));       //""
        System.out.println(StringUtils.substringAfter(null, "bb"));  // null
        System.out.println(StringUtils.substringAfter("aaabbbbcc", ""));  //"" 返回参数1本身
        System.out.println(StringUtils.substringAfter("aaabbbbcc", null)); //参数2为null 返回""
    }


    /**
     * 同substringAfter
     */
    @Test
    public void testSubstringBefore() {
        // 返回之后的元素 不包括本身
        System.out.println(StringUtils.substringBefore("aaabbbbcc", "bb")); //
        System.out.println(StringUtils.substringBefore("", "bb"));       //""
        System.out.println(StringUtils.substringBefore(null, "bb"));  // null
        System.out.println(StringUtils.substringBefore("aaabbbbcc", ""));  //"" 返回参数1本身
        System.out.println(StringUtils.substringBefore("aaabbbbcc", null)); //参数2为null 返回""
    }

    /**
     * 截取字符串 最后一次出现之后的子字符串
     */
    @Test
    public void testSubstringAfterLast() {
        // 返回之后的元素 不包括本身
        System.out.println(StringUtils.substringAfterLast("aaabbbbcc", "bb")); //
        System.out.println(StringUtils.substringAfterLast("", "bb"));       //""
        System.out.println(StringUtils.substringAfterLast(null, "bb"));  // null
        System.out.println(StringUtils.substringAfterLast("aaabbbbcc", ""));  //"" 返回参数1本身
        System.out.println(StringUtils.substringAfterLast("aaabbbbcc", null)); //参数2为null 返回""
    }

    @Test
    public void testSubstringBetween() {
        // 返回之后的元素 不包括本身
        System.out.println(StringUtils.substringBetween("aaabbbbcc", "bb") + "结果1"); // ""
        System.out.println(StringUtils.substringBetween("", "bb") + "结果2");       //null
        System.out.println(StringUtils.substringBetween(null, "bb") + "结果3");  // null
        System.out.println(StringUtils.substringBetween("aaabbbbccaa", "aa") + "结果4");  //"abbbbc" 返回参数1本身
        System.out.println(StringUtils.substringBetween("aaafbbbbccf", "f") + "结果5"); //"bbbbccf"
        System.out.println(StringUtils.substringBetween("aaafbbbbccf", "") + "结果6"); //""
        System.out.println(StringUtils.substringBetween("aaafbbbbccf", null) + "结果7"); //null
    }


    /**
     * 3个参数
     */
    @Test
    public void testSubstringBetween1() {
        // 返回之后的元素 不包括本身
        System.out.println(StringUtils.substringBetween("aaabbbbcc", "bb", "c") + "结果1"); // "bb"
        System.out.println(StringUtils.substringBetween("", "bb") + "结果2");       //null
        System.out.println(StringUtils.substringBetween(null, "bb") + "结果3");  // null
        System.out.println(StringUtils.substringBetween("aaabbbbccaa", "aa", "cc") + "结果4");  //"abbbb" 返回参数1本身
        System.out.println(StringUtils.substringBetween("aaafbbbbccf", "f") + "结果5"); //"bbbbcc"
        System.out.println(StringUtils.substringBetween("aaafbbbbccf", "", "") + "结果6"); //""
        System.out.println(StringUtils.substringBetween("aaafbbbbccf", null) + "结果7"); //null
    }


    /***
     * 返回所有之间的子字符串数组
     */
    @Test
    public void testSubStringsBetween() {
        // 返回之后的元素 不包括本身
        System.out.println(StringUtils.substringsBetween("aaabbbbcc", "bb", "c") + "结果1"); // "bb"
        System.out.println(StringUtils.substringsBetween("", "bb", "c") + "结果2");       //null
        System.out.println(StringUtils.substringsBetween(null, "bb", "c") + "结果3");  // null
        System.out.println(StringUtils.substringsBetween("aaabbbbccaa", "aa", "cc") + "结果4");  //"abbbb" 返回参数1本身
        System.out.println(StringUtils.substringsBetween("aaafbbbbccf", "f", "d") + "结果5"); //"bbbbcc"
        System.out.println(StringUtils.substringsBetween("aaafbbbbccf", "", "") + "结果6"); //""
        System.out.println(StringUtils.substringsBetween("aaafbbbbccf", null, "") + "结果7"); //null
    }


    @Test
    public void testSplit() {
        //切割字符串
        String str = "aaa bbb ccc";
        String[] split = StringUtils.split(str);//{aaa, bbb, ccc}
    }

    /**
     * 去除字符串中的所有的空白
     */
    @Test
    public void testDeleteWhitespace() {
        String str = " aaa cc ddd  eee";
        System.out.println(StringUtils.deleteWhitespace(str));
    }


    /***
     * 去除 包含
     */
    @Test
    public void testRemove() {
        System.out.println(StringUtils.remove("aabbbccaaddd", "a"));//bbbccddd
        System.out.println(StringUtils.remove("aabbbccaaadddda", "aa"));//bbbccadddda
    }

    /****
     * 去除 以什么开头的
     */
    @Test
    public void testRemoveFirst() {
        System.out.println(StringUtils.removeFirst("dfaaabbbccc", "df"));//aaabbbccc
        System.out.println(StringUtils.removeFirst("dfaaabbbccc", "aa"));//dfabbbccc
        System.out.println(StringUtils.removeFirst("dfaaabbbccc", "ccc"));//dfaaabbb
    }

    /**
     * 去除 以什么结尾的
     */
    @Test
    public void testRemoveEnd() {
        System.out.println(StringUtils.removeEnd("dfaaabbbccc", "df"));//dfabbbccc
        System.out.println(StringUtils.removeEnd("dfaaabbbccc", "aa"));//dfabbbccc
        System.out.println(StringUtils.removeEnd("dfaaabbbccc", "ccc"));//dfaaabbb
    }


    /***
     * 去除字符串最后一个字符
     */
    @Test
    public void testChop() {
        System.out.println(StringUtils.chop("dddadet"));//dddade
        System.out.println(StringUtils.chop("dddadet\t"));//dddadet
        System.out.println(StringUtils.chop("dddadet\r\n"));//dddadet
        System.out.println(StringUtils.chop("dddadet\r"));//dddadet
    }

    /***
     * 替换
     */
    @Test
    public void testReplace() {
        /**
         * 替换所有
         */

        Pattern compile1 = Pattern.compile("(?<=<img src=\").*?(?=\">)");
        String content = "aa好的<img src=\"../../file\">真的很的<img src=\"../../file/ooo\">";
        Matcher matcher = compile1.matcher("aa好的<img src=\"../../file\">真的很的<img src=\"../../file/ooo\">");
        while (matcher.find()) {
            System.out.println(matcher.group());

        }




        System.out.println(StringUtils.replace("aa好的<img src=\"../../file\">", "aaa", "bb"));//dddffbbacccbb

        /**
         * 替换一次
         */
        System.out.println(StringUtils.replaceOnce("dddffaaacccaa", "aa", "bb"));//dddffbbacccaa

        /**
         * 替换多次
         * 如果次数为负数 则为全部
         */
        System.out.println(StringUtils.replace("dddffaaacccaa", "aa", "bb", 1));//dddffbbacccaa
        System.out.println(StringUtils.replace("dddffaaacccaa", "aa", "bb", -8));//dddffbbacccaa
    }


    @Test
    public void testOverlay() {
        System.out.println(StringUtils.overlay("aaaafffwee", "bb", 2, 5));//aabbffwee
        /**
         * 都小于0 都设为0
         */
        System.out.println(StringUtils.overlay("aaaafffwee", "bb", -2, -5));//bbaaaafffwee
        /**
         * 参数3 大于 参数4
         * 则替换位置
         */
        System.out.println(StringUtils.overlay("aaaafffwee", "bb", 5, 2));//aabbffwee
        /**
         * 如果大于字符串的长度 则设为字符串的长度
         */
        System.out.println(StringUtils.overlay("aaaafffwee", "bb", 11, 15));//aabbffweebb
    }


    @Test
    public void testReplaceEach() {
        String content = "aa好的<img src=\"../../file\" />真的<img src=\"../../file\" />很的<img src=\"../../file/ooo\">";
        String s = StringUtils.replaceEach(content, new String[]{"<img src=\"../../file\" />","<img src=\"../../file\" />", "<img src=\"../../file/ooo\">"}, new String[]{"../../file","../../file/ooo1", "../../file/ooo"});
        List<String> list = new ArrayList();
        String s1 = StringUtils.replaceEach(content, list.toArray(new String[list.size()]), list.toArray(new String[list.size()]));
       String [] str= new String[]{};
        System.out.println(str.length);
    }


    /***
     * 字符串重复出现
     */
    @Test
    public void testRepeat() {
        System.out.println(StringUtils.repeat("aaab", 3));//aaabaaabaaab
        System.out.println(StringUtils.repeat("", 3));//""
        System.out.println(StringUtils.repeat(null, 3));//null
        System.out.println(StringUtils.repeat("aaab", 0));//""
        System.out.println(StringUtils.repeat("aaab", -1));//""
    }


    /***
     * 右边添加
     */
    @Test
    public void testRightPad() {
        System.out.println(StringUtils.rightPad("dddeeafff", 3)); //参数2长度小于 字符串长度 返回本身
        System.out.println(StringUtils.rightPad("dddeeafff", 15)); //参数2 长度大于 字符串长度 右边补全空字符串
        System.out.println(StringUtils.rightPad(null, 15)); //null
    }

    @Test
    public void testRightPad1() {
        System.out.println(StringUtils.rightPad("dddeeafff", 3, "33")); //参数2长度小于 字符串长度 返回本身
        System.out.println(StringUtils.rightPad("dddeeafff", 15, "332")); //参数2 长度大于 字符串长度 右边补全空字符串
        System.out.println(StringUtils.rightPad(null, 15, "333")); //null
    }

    @Test
    public void testCenter1() {
        //补全的字符串 大于原本的字符串  让原本的字符串位于中心
        System.out.println(StringUtils.center("333", 5, "a"));//a333a
        System.out.println(StringUtils.center("333", 6, "a"));//a333aa
        //长度 小于字符串 返回字符串本身
        System.out.println(StringUtils.center("333", 2, "a"));//333
    }


    @Test
    public void testSwap() {
        //将原来的 大写转为小写 小写转换为大写
        System.out.println(StringUtils.swapCase("aaaffGGGdddEe"));//AAAFFgggDDDeE
    }


    /***
     * 统计 子字符串在母字符串中出现的次数
     */
    @Test
    public void test() {
        System.out.println(StringUtils.countMatches("aaaddddfffcccaa", "aa"));
    }


    @Test
    public void test11() {
        String str = "统计 子字符串在母字符串中出现的次数";
        if(str.length()>=10);
        String substring =str.length()>=10? str.substring(0, 10)+"...":str;

    }
    
}
