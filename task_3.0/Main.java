public class Main {
    public static void main(String[] args) {
        bbb(39,100);
    }
    
    static void calculateExchange(int price, int bill) {
        int exchange = bill - price;
        
        while (exchange - 50 >= 0) {
            System.out.println("50 руб");
            exchange = exchange - 50;
        }

        while (exchange - 10 >= 0) {
            System.out.println("10 руб");
            exchange = exchange - 10;
        }

        while (exchange - 5 >= 0) {
            System.out.println("5 руб");
            exchange = exchange - 5;
        }

        while (exchange - 1 >= 0) {
            System.out.println("1 руб");
            exchange = exchange - 1;
        }
    }
}
