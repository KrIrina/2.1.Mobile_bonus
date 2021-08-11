public class Main {
    public static void main(String[] args) {
        int bill = 100;
        int transferAmount = 1100;
        int bonus = 100;
        int totalBill = (transferAmount > 1000) ? bill + transferAmount + transferAmount / bonus : bill + transferAmount;
        System.out.println(totalBill);
    }
}
