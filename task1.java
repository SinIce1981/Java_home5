// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task1{
    
       // Метод, который добавляет номера в книгу
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }
    // Метод, который печатает список контактов
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Иванов И.И.", 89123698, bookPhone);
        addNumber("Иванов И.И.", 7231458, bookPhone);
        addNumber("Петров П.П.", 8546585, bookPhone);
        addNumber("Сидоров С.С.", 8495477, bookPhone);
        addNumber("Иванов И.И.", 1234567, bookPhone);
        addNumber("Петров П.П.", 3333333, bookPhone);
        printBook(bookPhone);
       }
}
