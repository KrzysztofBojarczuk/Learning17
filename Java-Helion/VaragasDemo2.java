public class VaragasDemo2
{
    public static void main(String[] args) {
        double total;

        BankAccount account1 = new BankAccount(100.0);
        BankAccount account2 = new BankAccount(500.0);
        BankAccount account3 = new BankAccount(1500.0);

        total = totalBalance(account1);
        System.out.println("Suma: " + total + " zlotych.");

        total = totalBalance(account1, account2);
        System.out.println("Suma: " + total + " zlotych.");

        total = totalBalance(account1, account2, account3);

        System.out.println("Suma: " + total + " zlotych.");
    }
        public static double totalBalance(BankAccount... accounts)
        {
            double total = 0.0;

            for (BankAccount acctObject : accounts)

                total += acctObject.getBalance();

            return total;
        }
}
