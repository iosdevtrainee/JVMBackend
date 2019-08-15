package reactive;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class ReactiveClient {

    private final WebClient client = WebClient.create("http://localhost:8080");

    private Mono<ClientResponse> result = client.get()
                        .uri("hello")
                        .accept(MediaType.TEXT_PLAIN)
                        .exchange();

    public String getResponse() {
        return "Received a message" + result.flatMap(resp -> resp.bodyToMono(String.class)).block();
    }
}
