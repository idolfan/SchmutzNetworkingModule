import networking.Client;
import networking.Server;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("This is an example project for the networking package.");

        // Start Server on port 25565
        Server.startServer(new int[] { 25565 });
        // Start and connect Client to localhost:25565
        Client.startClient("localhost", 25565);

    }
}
