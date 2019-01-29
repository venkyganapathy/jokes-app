package learner.venky.jokesapp.controller;

import learner.venky.jokesapp.service.JokeRetriever;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/Jokes")
public class JokesController {

    private JokeRetriever jokeRetriever;

    @Autowired
    public JokesController(JokeRetriever jokeRetriever) {
        this.jokeRetriever = jokeRetriever;
    }

    @RequestMapping("/getNextJoke")
    public String getNextJoke(Model model){
        String nextJoke = jokeRetriever.retrieveNextJoke();
        model.addAttribute("joke",nextJoke);
        return ViewNames.chuckNorris;
    }
}
