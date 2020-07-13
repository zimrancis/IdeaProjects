//package com.ciphersnippet.movicatserv.resources;
//
//import com.ciphersnippet.movicatserv.models.CatalogItem;
//import com.ciphersnippet.movicatserv.models.Movie;
//import com.ciphersnippet.movicatserv.models.Rating;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.reactive.function.client.WebClient;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@RestController
//@RequestMapping("/catalog")
//public class MovieCatalogResource {
//
//    @Autowired
//    private WebClient.Builder webClientBuilder;
//
//    @RequestMapping("/{userId}")
//    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
//        List<Rating> ratings = Arrays.asList(
//                new Rating("1234", 4),
//                new Rating("5678", 3)
//        );
//
//        return ratings.stream().map(rating -> {
//            //Movie movie = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(), Movie.class);
//            Movie movie = webClientBuilder.build()
//                    .get() //or put() or post()
//                    .uri("http://localhost:8082/movies/" + rating.getMovieId())
//                    .retrieve()
//                    .bodyToMono(Movie.class)
//                    .block();
//
//            return new CatalogItem(movie.getName(), "Test", rating.getRating());
//        })
//                .collect(Collectors.toList());
//    }
//}