package EstudoApi;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class TesteApi {
    public static void main(String[] args) throws Exception{
        try {
            Scanner sc = new Scanner(System.in);

            String cep = sc.nextLine();
            String cepLimpo = cep.replace("-", "").replace(" ", "");
            String url = "https://viacep.com.br/ws/" + cepLimpo + "/json/";

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                System.out.println("resposta api: ");
                System.out.println(response.body());
            } else {
                System.out.println("erro: " + response.statusCode());
            }

            sc.close();

        } catch (Exception e) {
            System.out.println("falha na conexão" + e.getMessage());
        }
    }
}
