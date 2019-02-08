import ws.WSService;

import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        Endpoint.publish ("http://localhost:8087/ActivityTracker", new WSService ());

    }
}
