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
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@RestController
//@RequestMapping("/catalog2")
//public class MovieCatalogResource2 {
//
//    @Autowired
//    private RestTemplate restTemplate;
//
//    @RequestMapping("/{userId}")
//    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
//
//        RestTemplate restTemplate = new RestTemplate();
//
//        //I need to first create an instance of RestTemplate, rT is gonna be
//        //the utility object which lets me make this calls.
//        List<Rating> ratings = Arrays.asList(
//                new Rating("1234", 4),
//                new Rating("5678", 3)
//        );
//
//        return ratings.stream().map(rating -> {
//            Movie movie = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(), Movie.class);
//            return new CatalogItem(movie.getName(), "Test", rating.getRating());
//        })
//                .collect(Collectors.toList());
//    } //ANS: [[{"name":"Test name","desc":"Test","rating":4},{"name":"Test name","desc":"Test","rating":3}]]
//}