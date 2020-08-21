
import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;
import java.util.Scanner;

public class idmb {
    public static void main(String args[]) throws IOException {
        sendRequest("");
    }

    static void sendRequest(String request) throws IOException {
        Scanner title=new Scanner(System.in);
        String t=title.nextLine();
        int y=title.nextInt();
        String concatonate="http://www.omdbapi.com/?apikey=9b2a3742&t="+t+"&y="+y;
        request = concatonate;
        URL url = new URL("https://www.youtube.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setDoOutput(true);
        connection.setInstanceFollowRedirects(false);
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type", "text/plain");
        connection.setRequestProperty("charset", "utf-8");
        Scanner sc = new Scanner(url.openStream());
        //Instantiating the StringBuffer class to hold the result
        StringBuffer sb = new StringBuffer();
        while(sc.hasNext()) {
            sb.append(sc.next());
            //System.out.println(sc.next());




        }
        //Retrieving the String from the String Buffer object
        String result = sb.toString();
        System.out.println(result);



    }
}
