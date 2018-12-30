
import org.apache.commons.io.IOUtils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.Properties;


public class MavenApacheIO {
    public static void main(String[] args) throws IOException, CloneNotSupportedException {
        String sss;
        sss = PropertyReader.read("jdbcPassword");
        System.out.println(sss);

        InputStream is = new ByteArrayInputStream(new byte[] {48, 49, 50, 127});
        int b;
        int ww = ((13 * 13) / 10)%1000;
        while ((b = is.read()) != -1) {
            System.out.println(b<<1);
        }
        String result = IOUtils.toString(is, "UTF-8");
       String result1 = IOUtils.toString(is, StandardCharsets.UTF_8);
        System.out.println(result);

// Cloning example
        City city = new City("Dehradun");
        Person person1 = new Person("Naresh", 10000, city);
        System.out.println(person1);
        Person person2 = person1.clone();
        System.out.println(person2);
        if (person1 == person2) {
            System.out.println("Both person1 and person2 holds same object");
        }
        if (person1.equals(person2)) {
            System.out.println("But both person1 and person2 are equal and have same content");
        }
        if (person2.getCity()==person1.getCity()) {
            System.out.println("Both person1 and person2 have same city object");
        }
        System.out.println(person1.getCity());
        System.out.println(person2.getCity());


        //arraylist duplicate delete exmpl+ ссылки на методы
        List<String> list = new ArrayList<>();



        ArrayListPrivate<String> list3 = new ArrayListPrivate<>();
        list3.add("привет");
        list3.add("bbb");
        boolean asd = list3.remove ("bbb");
        list.add ("aaa");
        boolean ss = list3.contains("sss");
        String as = list3.get(0);
        Set<String> list1 = new LinkedHashSet<>(list);
        for (String s: list1)
            System.out.println(s);
            System.out.println();

        list.forEach(e->System.out.println(e));

        pseudoRandomStream(123456).limit(10).forEach(System.out::println);


        System.out.println(ss+as+asd+"привет");



    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> ( (n * n) / 10 ) % 1000  );
    }
    }
