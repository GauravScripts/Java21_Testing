package Virtual_Thread;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestingVirtualThread {
    public static void main(String[] args) {
 int MAX=4000;

     for (int i = 0; i < MAX; i++) {
         Thread.startVirtualThread(TestingVirtualThread::doWork);
//                 new Thread(TestingVirtualThread::doWork).start();
 }

}
   public static void doWork(){
    try {
        URL url = new URL("https://api.instaspaces.in/api/quotes/random");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");

        int responseCode = conn.getResponseCode();
        System.out.println("Response Code: " + responseCode);

        if (responseCode != 200) {
            System.out.println("Failed to get response from server");
            throw new RuntimeException("Failed : HTTP error code : " + responseCode);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

        String output;
        System.out.println("Output from Server .... \n");
        while ((output = br.readLine()) != null) {
            System.out.println(output);
        }

        conn.disconnect();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    }
