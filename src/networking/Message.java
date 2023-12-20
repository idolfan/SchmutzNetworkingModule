package networking;

/** Provides static-methods which (de)construct messages. */
public class Message {
    
    public static String exampleWriteServer(){
        String type = "EXAMPLE";
        NetworkManager manager = new NetworkManager();
        manager.messageType = type;
        manager.addPackage("INFORMATION", "This is an example message from the server.");
        manager.addPackage("INFORMATION", "You can add as many packages as you want. Even with the same name.");
       
        return manager.constructMessage();
    }

    public static boolean exampleReadClient(NetworkManager manager){
        String[] information = manager.getPackagesByName("INFORMATION");
        System.out.println("These are example messages from the server: \n");
        for(String info : information){
            System.out.println(info);
        }
        return true;
    }

}
