import processing.Database;
import processing.Offer;
import processing.Request;


public class Main {
    public static void main(String[] args) {

        //Запрос клиента
        String[] clientRequest = {"Медведь один", "Одна.Лягушка", "Один кот","Кит","Крот-3"};
        Request.printUnsortedRequest(clientRequest);

        //Обработка запроса клиента
        String[] sortedReuqest = Request.sortRequest(clientRequest);
        double[] prices = new double[sortedReuqest.length];

        for (int i = 0; i < sortedReuqest.length; i++) {
            prices[i] = Database.getPrice(sortedReuqest[i]);
        }

        //Коммерческое предложение
        Request.printSortedRequest(sortedReuqest, prices);
        prices = Offer.makeDiscount(prices);
        Offer.makeOffer(sortedReuqest, prices);
    }
}
