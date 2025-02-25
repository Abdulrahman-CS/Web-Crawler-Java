package web_crawler.web_crawler;

import javafx.scene.control.TextArea;

public class Slave {
    private String port;
    private String IP;

    public Slave(String port, String IP, TextArea updates) {
        this.port = port;
        this.IP = IP;
        updates.appendText("ServerSocket " +
                "created. Waiting for connection from Master\n");
        System.out.println("New slave made, IP is: " + IP + ":" + port);
        Thread t1 = new Thread(new SlaveThread(port, updates));
        t1.setName("FirstThread");
        t1.start();
    }

}