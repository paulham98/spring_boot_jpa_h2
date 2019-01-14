package com.apicall.naver;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import static org.springframework.data.repository.init.ResourceReader.Type.JSON;

public class Practice {

    public static void main(String[] args) {
        String clientId = "0YWmAAZVcF4QBIAeYnu4";//애플리케이션 클라이언트 아이디값";
        String clientSecret = "a7XyTYjawx";//애플리케이션 클라이언트 시크릿값";
        BufferedReader br = null;
        try {
            String text = URLEncoder.encode("메이플스토리", "UTF-8");
            String apiURL = "https://openapi.naver.com/v1/search/webkr.json?query=" + text;
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            int responseCode = con.getResponseCode();
            if (responseCode == 200) { // 정상 호출
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // 에러 발생
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();
            ObjectMapper mapper = new ObjectMapper();
            JsonNode actualObj = mapper.readTree(response.toString());
            System.out.println(response.toString());

            System.out.println(actualObj.get("total"));
            System.out.println(actualObj.get("items"));
        } catch (Exception e) {

            System.out.println(e);
        }
    }
}
