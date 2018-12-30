import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class String_count {


    public static void main(String[] args) {

        String inputStr = null;
        StringBuilder builder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
       // while (scanner.hasNextLine()) {
            builder.append(scanner.nextLine());

            // nextLine съедает символ перехода на следующую строку, и получается
            // что последнее слово линии и первое слово следующей строки будут слитными
            builder.append(" ");
       // }
        inputStr = builder.toString(); //"Мама мыла-мыла-мыла раму!";
        inputStr = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.";

        List<String> items = Arrays.asList(inputStr.toLowerCase().split("[^\\p{L}\\p{Digit}_]+"));
        Map<String, Long> counting = items.stream().collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //Map<String, Long> finalMap = new LinkedHashMap<>();

        //Sort a map and add to finalMap
        counting.entrySet().stream()

                .sorted(Map.Entry.<String, Long>comparingByValue()
                        .reversed()
                        .thenComparing(e -> e.getKey()))
                .limit(10)
                .map(e->e.getKey().toLowerCase())             // из каждой пары возьмем слово
                .forEachOrdered(System.out::println);
        //.forEachOrdered(e -> finalMap.put(e.getKey().toLowerCase(), e.getValue()));
        counting.entrySet().stream().forEach(System.out::println);

        //.forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

        // System.out.println(finalMap);
        /*
        .sorted(descendingFrequencyOrder()) // отсортируем
                .limit(10)                          // возьмем первые 10
                .map(Map.Entry::getKey)             // из каждой пары возьмем слово
                .forEach(System.out::println);*/

        //System.out.println(counting.values());

    }
    }

