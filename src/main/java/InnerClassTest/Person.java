package InnerClassTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Administrator on 2017/5/4.
 */
public class Person {

    @Test
    public void test1() {
        List<Person> persons = new ArrayList<Person>();
        Collections.sort(persons, new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return 0;
            }
        });

    }






}
