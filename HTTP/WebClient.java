import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class WebClient {

    private final String USER__AGENT = "Mozilla/5.0";

    public static void main(String[]args) throws Exception {

        WebClient http = new WebClient();

        System.out.println("Testing 1 - Send Http GET request");
        http.sendGet();

        //System.out.println("\nTesting 2 - Send Http POST request");
        //http.sendPost();

    }

   //HTTP GET request
    private void sendGet() throws Exception {

//        String url = "http://www.gin.ics.ritsumei.ac.jp/";
        String url = "https://codeaid.jp/";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

       //optional default is GET
        con.setRequestMethod("GET");

       //add request header
        con.setRequestProperty("User-Agent", USER__AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        FileWriter fw = new FileWriter("output.txt", true);
        PrintWriter pw = new PrintWriter(fw);

        int flag = 0;
        while ((inputLine = in.readLine()) != null) {
            if (inputLine.indexOf("<body") != -1) {
                flag = 1;
            } else if (inputLine.indexOf("</body>") != -1) {
                flag = 0;
                pw.println(inputLine);
            }
            if (flag == 1) {
                pw.println(inputLine);
            }

            response.append(inputLine);
        }
        pw.close();
        in.close();

       //print result
        //System.out.println(response.toString());

    }

   //HTTP POST request
    private void sendPost() throws Exception {

        String url = "https://www.apple.com";
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

       //add reuqest header
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", USER__AGENT);
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

        //String urlParameters = "sn=C02G8416DRJM&cn=&locale=&caller=&num=12345";
        //Send post request
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        //wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        //System.out.println("Post parameters : " + urlParameters);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

       //print result
        System.out.println(response.toString());

    }

}
