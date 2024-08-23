import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

    public static void main(String[] args) {
        System.out.println("\n№1");
        oddNumbers();
        System.out.println("\n№2");
        uniqueSortedEvenNumbers(nums);
        System.out.println("\n№3");
        uniqueWords(strings);
        System.out.println("\n№4");
        countDuplicatesWords(strings);
    }

    public static void oddNumbers() {
        /* № 1.Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
        Код должен работать с любой последовательностью и объемом списка чисел. */
        for (Integer number : nums) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
    }

    public static void uniqueSortedEvenNumbers(List<Integer> numbers) {
        /* № 2. Напишите код, с помощью которого можно напечатать только четные числа без повторений
        в порядке возрастания. Код должен работать с любой последовательностью и объемом списка чисел.*/
        Set<Integer> evenNumbers = new HashSet<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        for (Integer number : evenNumbers) {
            System.out.print(number + " ");
        }
    }

    public static void uniqueWords(List<String> strings) {
        /* № 3. Напишите код, который выводит в консоль все уникальные слова из списка слов, в котором
        могут встречаться дубли. Код должен работать с любой последовательностью и объемом списка слов.*/
        Set<String> uniqueWords = new HashSet<>(strings);
        for (String word : uniqueWords) {
            System.out.print(word + " ");
        }
    }

    public static void countDuplicatesWords(List<String> strings) {
        /* № 4. Напишите код, который выводит в консоль количество дублей для каждого уникального слова.
        Код должен работать с любой последовательностью и объемом списка слов.*/
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : strings) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println("У слова " + "<" + entry.getKey() + "> " + (entry.getValue() - 1) + " дубль/я/ей");
        }
    }
}
