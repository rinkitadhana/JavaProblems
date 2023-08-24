public class P48_ConstructorChallengeRunner {
    public static void main(String[] args) {
        P47_ConstructorChallenge customer = new P47_ConstructorChallenge("Rinkit",1000,"therinkit@gmail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getGetEmail());
    }
}
