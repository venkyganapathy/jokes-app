package learner.venky.jokesapp.service;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Component;

@Component
public class JokeRetrieverService implements JokeRetriever{

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeRetrieverService(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String retrieveNextJoke() {

        return chuckNorrisQuotes.getRandomQuote();

    }

}
