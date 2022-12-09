public class ZinsDemo {
    public static void main(String[] args) {
        int kontostand = 100;
        double zinsen = 2.0;

        System.out.println("Zinsen = " + zinsen + " % von " + kontostand + " = " + (kontostand *(zinsen/100)));
        System.out.println("Zinsen = " + zinsen + " % von " + kontostand + " = " + zinsberechnung(kontostand,zinsen));
    }
    public static double zinsberechnung(int kontostand, double zinsen){
        return (kontostand *(zinsen/100.0));
    }

}
