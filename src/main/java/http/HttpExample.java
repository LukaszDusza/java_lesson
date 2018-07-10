package http;



import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class HttpExample {
    public static void main(String[] args) throws ClientProtocolException, IOException {
        HttpExample http = new HttpExample();

        // Wysłanie żądania metodą GET
        http.sendGetRequest("https://www.google.com/search?q=ejak.pl");

        // Wysłanie żądania metodą POST
        http.sendPostRequest("http://example.com", "Marian", "Nowak");
    }

    public void sendGetRequest(String url) throws ClientProtocolException, IOException {

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet get = new HttpGet(url);

        CloseableHttpResponse response = httpClient.execute(get);

        try {
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                InputStream in = entity.getContent();
                try {
                    // Wypisujemy odpowiedź na konsolę
                    System.out.println(EntityUtils.toString(entity));
                } finally {
                    in.close();
                }
            }
        } finally {
            response.close();
        }
    }

    public void sendPostRequest(String url, String name, String surname) throws ClientProtocolException, IOException{

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);

        // Dodajemy parametry
        List parameters = new ArrayList();
        parameters.add(new BasicNameValuePair("name", name));
        parameters.add(new BasicNameValuePair("surname", surname));

        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(parameters, Consts.UTF_8);
        httpPost.setEntity(entity);

        CloseableHttpResponse response = httpClient.execute(httpPost);

        try {
            HttpEntity responseEntity = response.getEntity();
            if (responseEntity != null) {
                InputStream in = responseEntity.getContent();
                try {
                    // Wypisujemy odpowiedź na konsolę
                    System.out.println(EntityUtils.toString(responseEntity));
                } finally {
                    in.close();
                }
            }
        } finally {
            response.close();
        }
    }
}
