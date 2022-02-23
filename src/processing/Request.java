package processing;

import java.util.Arrays;

import static java.lang.System.*;

public class Request {

    //Вывести на экран запрос клиента
    public static void printUnsortedRequest(String[] Request) {
        out.println(">>Запрос клиента<<");
        for (int i = 0; i < Request.length; i++) {
            out.printf("%d) %s%n", i+1,Request[i]);
        }
        out.println("//.............//");
    }

    //Поиск совпадений в запросе клиента и прайс-листе
    public static String[] sortRequest(String[] toysRequest) {
        int startIndex, exitIndex;
        String[] sortedList = Arrays.copyOf(toysRequest, toysRequest.length);

        for (int i = 0; i < sortedList.length; i++) {
            for (int j = 0; j < Database.priceList[0].length; j++) {
                if (sortedList[i].toLowerCase().contains(Database.priceList[0][j].toLowerCase())) {
                    sortedList[i] = Database.priceList[0][j];
                }
            }
        }
        return sortedList;
    }

    //Вывести на экран отсортированный запрос клиента
    public static void printSortedRequest(String[] sortedRequest, double[] prices) {
        out.println(">>Список игрушек требуемых клиенту<<");
        for (int i = 0; i < sortedRequest.length; i++) {
            if (prices[i] == 0) {
                out.printf("%d) '%s' - Такой игрушки нет в нашем ассортименте;%n",(i+1), sortedRequest[i]);
            } else {
                out.printf("%d) %s - цена за шт.: %.2f руб. без НДС%n", (i + 1), sortedRequest[i], prices[i]);
            }
        }
        out.println("//................................//");
    }
}