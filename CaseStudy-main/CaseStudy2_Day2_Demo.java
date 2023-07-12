public class Demo {
    public static void main(String[] args) {
        Travel t = new Travel();
        t.setModelOfTravel('F');
        t.setNoOfTickets(3);
        int fee = 0;
        switch (t.getModelOfTravel()){
            case 'F':
                fee = 500;
                break;
            case 'T':
                fee = 100;
                break;
            case 'B':
                fee = 50;
                break;
        }
        System.out.println("Total: " + fee * t.getNoOfTickets());
    }
}
