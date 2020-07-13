package com.ciphersnippet.ratingdataserv.resources;

import com.ciphersnippet.ratingdataserv.models.Rating;
import com.ciphersnippet.ratingdataserv.models.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

//@RestController
//@RequestMapping("/ratingsdata")
//public class RatingsDataResource {
//    /*
//        I have an api which just takes in a movie id and then returns
//        a rating for that. But I wanna do another api which takes in
//        a user id and then returns a list of movies that user has rated.
//     */
//
//    @Autowired
//    UserRating userRating;
//
//    @GetMapping("/movies/{movieId}")
//    public Rating getRating(@PathVariable("movieId") String movieId) {
//
//        if (movieId.equals("1234")) {
//            return new Rating(movieId, 4);
//        } else if (movieId.equals("5678")) {
//            return new Rating(movieId, 3);
//        } else
//            return new Rating(movieId, 0);
//    }
//
//    @GetMapping("user/{userId}")
//    public UserRating getUserRating(@PathVariable("userId") String userId) {
//        List<Rating> ratings = Arrays.asList(
//                new Rating("1234", 4),
//                new Rating("5678", 3));
//
//        //UserRating userRating = new UserRating();
//        userRating.setUserRating(ratings);
//        return userRating;
//
//    }
//}
@RestController
@RequestMapping("/ratingsdata2")
public class RatingsDataResource {

    @RequestMapping("/movies/{movieId}")
    public Rating getMovieRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }

    @RequestMapping("/user/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId) {
        UserRating userRating = new UserRating();
        //userRating.initData(userId);
        userRating.setUserId(userId);
    return userRating;

    }

}