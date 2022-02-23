package processing;

public class Database {

    //Прайс-лист
    public static final String[][] priceList = {
            {"Медведь", "Лягушка", "Кот", "Собака", "Лиса", "Мышь", "Чайка", "Черепаха","Слон","Кит"},
            {"15.3", "10.2", "5.6", "7.8", "3.0", "6.8", "12.1", "9.3","7.3","20.1"}
    };

    //Получить цену игрушки согласно прайс-листу
    public static double getPrice(String toy) {
        double price = 0;

        for (int i = 0; i < priceList[0].length; i++) {
            if (toy.equalsIgnoreCase(priceList[0][i])) {
                price = Double.parseDouble(priceList[1][i]);
            }
        }
        return price;
    }
}
