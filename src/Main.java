import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> hashset = new HashSet<>();
        hashset.add("Восьмое чувство");
        hashset.add("Игра престолов");
        hashset.add("Ведьмак");
        hashset.add("Отпуск");
        hashset.add("Джини и Джорджия");
        System.out.println("Сериалы которые смотрел в последнее время:");
        for (String i : hashset)
            System.out.println(i);
        System.out.println("--------------------------");
        if(hashset.remove("Игра престолов") == true)
        System.out.println("Игра престолов мой любимый сериал");
        System.out.println("-------------------------");
        if(hashset.contains("Джини и Джорджия") == true)
            System.out.println("Не понравился сериал \"Джини и Джорджия\"");


        Set<Integer> linkedhashset = new LinkedHashSet<>();
        linkedhashset.add(12);
        linkedhashset.add(55);
        linkedhashset.add(3);
        linkedhashset.add(54);
        linkedhashset.add(99);
        for (Integer i : linkedhashset)
            System.out.println(i);
        System.out.println("-------------------------------");
        System.out.println(linkedhashset.remove(54));
        System.out.println("--------------------------------");
        System.out.println(linkedhashset.contains(99));
    }
}
