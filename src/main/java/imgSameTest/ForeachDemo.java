package imgSameTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/13.
 */
public class ForeachDemo {

    @Test
    public  void  test1(){

        String [] str = {"1","2","3"};
        for (String s : str) {
            System.out.println(s);
        }
        List<Object> objectList = new ArrayList<Object>();
        objectList.add("111");
        objectList.add("22");
        objectList.add(33);
        objectList.add(444);
        for (Object object :new ArrayList<Object>(objectList)){
            System.out.println( object);
        }
    }
}
