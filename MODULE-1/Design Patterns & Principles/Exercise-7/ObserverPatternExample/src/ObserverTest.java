public class ObserverTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileUser = new MobileApp("Rahul");
        Observer webUser = new WebApp("Priya");

        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        System.out.println("Stock Price Updated:");

        stockMarket.setStockData("TCS", 3850.50);

        System.out.println();

        stockMarket.setStockData("Infosys", 1675.75);
    }
}