package org.example.fusionvibe.controller;

import org.example.fusionvibe.model.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MovieController {
    @RequestMapping("/movie")
    public String moviePage(){
        return "menu/movie/movie";
    }

    @GetMapping("/movies")
    public String getMovies(Model model) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1, "인셉셥", "A", " 놀란", "2010-07-16", "SF"));
        movies.add(new Movie(2, "인터스텔라", ".", " 놀란", "2014-11-07", "SF"));
        movies.add(new Movie(3, "다크나이트", ".", " Nolan", "2008-07-18", "Action"));

        model.addAttribute("movies", movies);
        return "menu/movie/movies";
    }
}
