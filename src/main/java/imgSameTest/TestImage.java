package imgSameTest;

import java.io.*;
import java.security.MessageDigest;

/**
 * Created by Administrator on 2017/4/10.
 */
public class TestImage {

    public static String md5(byte[] s) {
        //16进制字符
        char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            byte[] strTemp = s;
            MessageDigest mdTemp = MessageDigest.getInstance("MD5");
            mdTemp.update(strTemp);
            byte[] md = mdTemp.digest();
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {      //移位 输出字符串
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 根据文件名 获得文件的字节
     * @param name
     * @return
     */
    public static byte[] getByte(String name) {
        File file = new File(name); //创建一个文件
        byte[] b = new byte[(int) file.length()]; //创建缓存区
        try {
            InputStream in = new FileInputStream(file);//创建文件读取流
            try {
                in.read(b);
                System.out.println(in.read());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        return b;
    }

    public static void main(String[] args) throws Exception {

        String img1 = md5(getByte("C:\\Users\\Administrator\\Desktop\\测试资源\\迷你书.pdf"));
        String img2 = md5(getByte("C:\\Users\\Administrator\\Desktop\\测试资源\\第二个.pdf"));
        if (img1.equals(img2))
            System.out.println("两图片是一样的");
        else
            System.out.println("两图片是不一样的");
    }

}

