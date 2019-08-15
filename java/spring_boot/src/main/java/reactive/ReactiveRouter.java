package reactive;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.*;

import javax.print.attribute.standard.Media;

public class ReactiveRouter {

    @Bean
    public RouterFunction<ServerResponse> serverMessage(ReactiveHandler handler) {
        return RouterFunctions.route(RequestPredicates.GET("/hello").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), handler::getMessage);
    }
}
