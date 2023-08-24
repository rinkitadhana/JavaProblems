public class P51_Browser {
    public void navigation(String address){
        String ip =  findIpAddress(address);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    private String sendHttpRequest(String ip) {
        return "<html></html>";
    }


    private String findIpAddress(String address) {
        return "123.0.0";
    }
}
class Main{
    public static void main(String[] args) {
        var browser = new P51_Browser();


    }
}
