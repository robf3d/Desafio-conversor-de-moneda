import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {


    public Monedas convertirMonedas (String base, String target, double cantidad) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/ba9261901ad12c7936841ba5/pair/" +
                base + "/" +
                target + "/" +
                cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


