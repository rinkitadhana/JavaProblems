public class P47_ConstructorChallenge {
    private String name ;
    private double creditLimit;
    private String getEmail;

    public P47_ConstructorChallenge(String name, double creditLimit, String getEmail) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.getEmail = getEmail;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getGetEmail() {
        return getEmail;
    }

    public String getName() {
        return name;
    }
}
