public class P44_AmazonWhatsAppCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You have Entered Amazon chat!");
        String request = sc.nextLine();
        String ignoreUppercaseRequest = request.toLowerCase();
        if(ignoreUppercaseRequest.equals("hello") || ignoreUppercaseRequest.equals("hi")){
            System.out.println("Hello sir/ma'am, welcome to Amazon.");
            System.out.println("What's Your Good Name and your registered Mobile Number?");
            System.out.print("Name:");
            String name = sc.nextLine();
            System.out.print("Mobile Number:");
            long mobileNumber = sc.nextLong();
            if(mobileNumber < 1000000000){
                System.out.println("Enter a valid number please.");
            }else{
                System.out.println("To track your order press 1");
                System.out.println("To cancel your order press 2");
                System.out.println("To contact our customer case press 3");
                int input = sc.nextInt();
                switch(input){
                    case 1 :
                        System.out.println("Your order has been dispatched. It will arrive to you soon!");
                        break;
                    case 2:
                        System.out.println("Your order will be canceled\n" +
                                "To conform press 1\n" +
                                "To decline press 2\n");
                        int cancel = sc.nextInt();
                        if(cancel == 1){
                            System.out.println("Your order is cancelled!");
                        }else if (cancel == 2){
                            System.out.println("Your order will be delivered!");
                        }else{
                            System.out.println("Apologies,we couldn't understand your request!");
                        }
                        break;
                    case 3 :
                        System.out.println("WELCOME TO AMAZON CUSTOMER CARE CHAT\n" +
                                "How can i help you?");




                }
            }


        }else {
            System.out.println("Apologies,we couldn't understand your request!");
        }
    }
}
