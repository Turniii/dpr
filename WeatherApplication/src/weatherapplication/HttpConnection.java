/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherapplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;


/**
 *
 * @author Turni
 */
public class HttpConnection {
    
    public HashMap getData() throws Exception {
        HashMap<String, String> currentWeather = new HashMap<>();
        String url = "http://dataservice.accuweather.com/currentconditions/v1/249208?apikey=tgQMNUCr7vXGY9Mwl4VYDsFQklErF25Z";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        
        
        StringBuilder response;
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()))) {
            String inputLine;
            response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
        }
        String resInter = response.toString();
        String res = resInter.substring(1, resInter.length()-1);
        JSONObject obJson = new JSONObject(res);
        currentWeather.put("WeatherText", obJson.get("WeatherText").toString());
        currentWeather.put("IsDayTime", obJson.get("IsDayTime").toString());
        JSONObject temperature = obJson.getJSONObject("Temperature");
        obJson = temperature.getJSONObject("Metric");
        currentWeather.put("Temperature", obJson.get("Value").toString());
        return currentWeather;
    }
}
