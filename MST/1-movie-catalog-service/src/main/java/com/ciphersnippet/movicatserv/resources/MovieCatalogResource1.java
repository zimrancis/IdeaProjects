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
//@RequestMapping("/catalog1")
//public class MovieCatalogResource1 {
//
//    @RequestMapping("/{userId}")
//    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
//        //get all rated movie IDs
//        // for each movie ID, call movie info service and get details
//        // put them all together
//
//        RestTemplate restTemplate = new RestTemplate();
//        List<Rating> ratings = Arrays.asList(
//                new Rating("1234", 4),
//                new Rating("5678", 3)
//        );
//        return ratings.stream().map(rating ->
//                new CatalogItem("Transformers", "Test", 4))
//                .collect(Collectors.toList());
//            /*return Collections.singletonList(
//                    new CatalogItem("Transformers", "Test", 4)
//            );*/ //ANS: [[{"name":"Transformers","desc":"Test","rating":4},{"name":"Transformers","desc":"Test","rating":4}]]
//    }
//}