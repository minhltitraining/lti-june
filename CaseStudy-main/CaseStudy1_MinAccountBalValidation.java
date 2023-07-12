public class MinAccountBalValidation {
    public static void main(String[] args) {
        Account ac = new Account();
        ac.setAccAmount(5000);
        if (ac.getAccAmount() < 500){
            System.out.println("The balance is below minimum value");
        } else {
            System.out.println(ac.getAccAmount());
        }
    }
}
