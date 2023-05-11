package com.marcador.util;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.marcador.pojos.Slip;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

/**
 * 
 * @author Jose.leite
 * @author vitor.santos
 */
public class Request {

    public static String retorno() {
        Slip mensagem = null;
        try {
            HttpClient client = HttpClient.newBuilder().build();
            HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create("https://api.adviceslip.com/advice")).build();
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            if (response.body() != null) {
                mensagem = new Gson().fromJson(response.body(), Slip.class);
            }
        } catch (JsonSyntaxException | IOException | InterruptedException e) {
           return "Sem Conexão";
        }
        return mensagem != null? mensagem.getSlip().getAdvice():"";
    }

}
