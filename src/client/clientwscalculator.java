package client;

public class clientwscalculator {

    public static void main(String[] args) {
        int n1 = 545;
        int n2 = 234;
        
        System.out.println("Sum: " + sum(n1,n2));
        System.out.println("Rest: " + rest(n1,n2));
    }

    private static int sum(int n1, int n2) {
        client.Cacl_Service service = new client.Cacl_Service();
        client.Cacl port = service.getCaclPort();
        return port.sum(n1, n2);
    }

    private static int rest(int n1, int n2) {
        client.Cacl_Service service = new client.Cacl_Service();
        client.Cacl port = service.getCaclPort();
        return port.rest(n1, n2);
    }
    
}
