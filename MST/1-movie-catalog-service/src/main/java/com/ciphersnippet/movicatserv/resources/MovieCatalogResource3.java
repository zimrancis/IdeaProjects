//package com.ciphersnippet.movicatserv.resources;
//
//import com.ciphersnippet.movicatserv.models.CatalogItem;
//import com.ciphersnippet.movicatserv.models.Movie;
//import com.ciphersnippet.movicatserv.models.UserRating;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.reactive.function.client.WebClient;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@RestController
//@RequestMapping("/catalog3")
//public class MovieCatalogResource3 {
//
//    @Autowired
//    private RestTemplate restTemplate;
//
//    @Autowired
//    WebClient.Builder webClientBuilder;
//
//    @RequestMapping("/{userId}")
//    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
//        UserRating userRating = restTemplate.getForObject("http://rating-data-service/ratingsdata/user/" + userId, UserRating.class);
//
//
//        return userRating.getRatings().stream().map(rating -> {
//            // for each movie ID, call movie info service and get details
//            Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(), Movie.class);
//            // put them all together
//            return new CatalogItem(movie.getName(), "Desc", rating.getRating());
//        })
//                .collect(Collectors.toList());
//
//    }//ANS: [[{"name":"Test name","desc":"Test","rating":4},{"name":"Test name","desc":"Test","rating":3}]]
//
//}
//    /*
//    Alternative WebClient way
//    Movie movie = webClientBuilder.build().get().uri("http://localhost:8082/movies/"+ rating.getMovieId())
//    .retrieve().bodyToMono(Movie.class).block();
//    */
//
//
//
//
//
