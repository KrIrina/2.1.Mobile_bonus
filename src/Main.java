public class Main {
    public static void main(String[] args) {
        int bill = 100;
        int transfer_amount = 1100;
        int bonus = 100;
        int total_bill = (transfer_amount > 1000) ? bill + transfer_amount + transfer_amount / bonus : bill + transfer_amount;
        System.out.println(total_bill);
    }
}
