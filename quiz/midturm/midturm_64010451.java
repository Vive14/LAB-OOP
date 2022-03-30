public class midturm_64010451 {
    public static void main(String[] args) {
        gas_pump panpA = new gas_pump("Golden Fuel", "gasoline", 1000, 10, 40);
        gas_pump panpB = new gas_pump("Super Station", "gasoline_E20", 1000, 10);
        gas_pump panpC = new gas_pump("Fuel for Thought", "gasoline_85", 1000, 10, 40);

        panpA.get_baht_per_gallon();
        panpB.get_baht_per_gallon();
        panpC.get_baht_per_gallon();

        panpA.buy_oil(400);
        panpB.buy_oil(4800);
        panpC.buy_oil(500);

        panpA.display();
        System.out.println("");
        panpB.display();
        System.out.println("");
        panpC.display();

    }
}
