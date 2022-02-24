package processing;

import java.util.Scanner;

import static java.lang.System.*;

public class Offer {

    //Указать скидку для клиента и пересчитать цены
    public static double[] makeDiscount(double[] prices) {
        out.println("Введите процент скидки для клиента, %: ");
        Scanner scanner = new Scanner(in);
        double discount = scanner.nextDouble();

        for (int i = 0; i < prices.length; i++) {
            prices[i] *= (1 - discount / 100);
        }

        return prices;
    }

    //Вывести на экран коммерческое предложение
    public static void makeOffer(String[] toysList, double[] prices) {
        double sum = 0;
        out.println(">>Коммерческое предложение<<");

        for (int i = 0; i < toysList.length; i++) {
            if (prices[i] == 0) {
                out.printf("Позиция №%d: %s - Такой игрушки нет в нашем ассортименте;%n", (i + 1), toysList[i]);
            } else {
                out.printf("Позиция №%d: '%s' - цена за шт.: %.2f руб. без НДС;%n", (i + 1), toysList[i], prices[i]);
                sum += prices[i];
            }
        }
        out.printf("Сумма: %.2f руб. без НДС%n", sum);
        out.println("//.........................//");
        out.println("bag_fixed");
    }

}
