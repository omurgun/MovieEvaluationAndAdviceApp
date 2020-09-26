package com.omurgun.movieevaluationandadviceapp.Data;

import com.omurgun.movieevaluationandadviceapp.Models.Movies.Actor;
import com.omurgun.movieevaluationandadviceapp.Models.Movies.Genre;
import com.omurgun.movieevaluationandadviceapp.Models.Movies.Movie;
import com.omurgun.movieevaluationandadviceapp.Models.Movies.Rating;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;


public class MovieData {

    public ArrayList<Movie> GetMovieByImDbID() throws JSONException {
        String s1 = "{\"Title\":\"The Avengers\",\"Year\":\"2012\",\"Rated\":\"PG-13\",\"Released\":\"04 May 2012\",\"Runtime\":\"143 min\",\"Genre\":\"Action, Adventure, Sci-Fi\",\"Director\":\"Joss Whedon\",\"Writer\":\"Joss Whedon (screenplay), Zak Penn (story), Joss Whedon (story)\",\"Actors\":\"Robert Downey Jr., Chris Evans, Mark Ruffalo, Chris Hemsworth\",\"Plot\":\"Earth's mightiest heroes must come together and learn to fight as a team if they are going to stop the mischievous Loki and his alien army from enslaving humanity.\",\"Language\":\"English, Russian, Hindi\",\"Country\":\"USA\",\"Awards\":\"Nominated for 1 Oscar. Another 38 wins & 79 nominations.\",\"Poster\":\"https:\\/\\/m.media-amazon.com\\/images\\/M\\/MV5BNDYxNjQyMjAtNTdiOS00NGYwLWFmNTAtNThmYjU5ZGI2YTI1XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_SX300.jpg\",\"Ratings\":[{\"Source\":\"Internet Movie Database\",\"Value\":\"8.0\\/10\"},{\"Source\":\"Rotten Tomatoes\",\"Value\":\"92%\"},{\"Source\":\"Metacritic\",\"Value\":\"69\\/100\"}],\"Metascore\":\"69\",\"imdbRating\":\"8.0\",\"imdbVotes\":\"1,234,641\",\"imdbID\":\"tt0848228\",\"Type\":\"movie\",\"DVD\":\"25 Sep 2012\",\"BoxOffice\":\"$623,279,547\",\"Production\":\"Walt Disney Pictures\",\"Website\":\"N\\/A\",\"Response\":\"True\"}";
        String s2 = "{\"Title\":\"Fast & Furious\",\"Year\":\"2009\",\"Rated\":\"PG-13\"," + "\"Released\":\"03 Apr 2009\",\"Runtime\":\"107 min\",\"Genre\":\"Action, Thriller\"" + ",\"Director\":\"Justin Lin\",\"Writer\":\"Chris Morgan, Gary Scott Thompson (characters)\"," + "\"Actors\":\"Vin Diesel, Paul Walker, Jordana Brewster, Michelle Rodriguez\"," + "\"Plot\":\"Brian O'Conner, back working for the FBI in Los Angeles, teams up with Dominic Toretto to bring down a heroin importer by infiltrating his operation.\"" + ",\"Language\":\"English, Spanish\",\"Country\":\"USA, Japan\",\"Awards\":\"6 wins & 2 nominations.\"," + "\"Poster\":\"https:\\/\\/m.media-amazon.com\\/images\\/M\\/MV5BYjQ1ZTMxNzgtZDcxOC00NWY5LTk3ZjAtYzRhMDhlNDZlOWEzXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg\"," + "\"Ratings\":[{\"Source\":\"Internet Movie Database\",\"Value\":\"6.6\\/10\"},{\"Source\":\"Rotten Tomatoes\",\"Value\":\"29%\"},{\"Source\":\"Metacritic\",\"Value\":\"46\\/100\"}],\"Metascore\":\"46\",\"imdbRating\":\"6.6\",\"imdbVotes\":\"255,771\"," + "\"imdbID\":\"tt1013752\",\"Type\":\"movie\",\"DVD\":\"27 Jul 2009\",\"BoxOffice\":\"$155,022,220\",\"Production\":\"Universal Pictures\",\"Website\":\"N\\/A\",\"Response\":\"True\"}";
        String s3 = "{\"Title\":\"The Amazing Spider-Man 2\",\"Year\":\"2014\",\"Rated\":\"PG-13\",\"Released\":\"02 May 2014\",\"Runtime\":\"142 min\",\"Genre\":\"Action, Adventure, Sci-Fi\",\"Director\":\"Marc Webb\",\"Writer\":\"Alex Kurtzman (screenplay), Roberto Orci (screenplay), Jeff Pinkner (screenplay), Alex Kurtzman (screen story), Roberto Orci (screen story), Jeff Pinkner (screen story), James Vanderbilt (screen story), Stan Lee (Marvel comic book), Steve Ditko (Marvel comic book)\",\"Actors\":\"Andrew Garfield, Emma Stone, Jamie Foxx, Dane DeHaan\",\"Plot\":\"When New York is put under siege by Oscorp, it is up to Spider-Man to save the city he swore to protect as well as his loved ones.\",\"Language\":\"English\",\"Country\":\"USA\",\"Awards\":\"4 wins & 30 nominations.\",\"Poster\":\"https:\\/\\/m.media-amazon.com\\/images\\/M\\/MV5BOTA5NDYxNTg0OV5BMl5BanBnXkFtZTgwODE5NzU1MTE@._V1_SX300.jpg\",\"Ratings\":[{\"Source\":\"Internet Movie Database\",\"Value\":\"6.6\\/10\"},{\"Source\":\"Rotten Tomatoes\",\"Value\":\"51%\"},{\"Source\":\"Metacritic\",\"Value\":\"53\\/100\"}],\"Metascore\":\"53\",\"imdbRating\":\"6.6\",\"imdbVotes\":\"406,976\",\"imdbID\":\"tt1872181\",\"Type\":\"movie\",\"DVD\":\"19 Aug 2014\",\"BoxOffice\":\"$183,277,573\",\"Production\":\"Sony Pictures\",\"Website\":\"N\\/A\",\"Response\":\"True\"}";
        String s4 = "{\"Title\":\"Doctor Strange\",\"Year\":\"2016\",\"Rated\":\"PG-13\",\"Released\":\"04 Nov 2016\",\"Runtime\":\"115 min\",\"Genre\":\"Action, Adventure, Fantasy, Sci-Fi\",\"Director\":\"Scott Derrickson\",\"Writer\":\"Jon Spaihts, Scott Derrickson, C. Robert Cargill, Stan Lee (based on the Marvel comics by), Steve Ditko (based on the Marvel comics by)\",\"Actors\":\"Benedict Cumberbatch, Chiwetel Ejiofor, Rachel McAdams, Benedict Wong\",\"Plot\":\"While on a journey of physical and spiritual healing, a brilliant neurosurgeon is drawn into the world of the mystic arts.\",\"Language\":\"English\",\"Country\":\"USA\",\"Awards\":\"Nominated for 1 Oscar. Another 20 wins & 65 nominations.\",\"Poster\":\"https:\\/\\/m.media-amazon.com\\/images\\/M\\/MV5BNjgwNzAzNjk1Nl5BMl5BanBnXkFtZTgwMzQ2NjI1OTE@._V1_SX300.jpg\",\"Ratings\":[{\"Source\":\"Internet Movie Database\",\"Value\":\"7.5\\/10\"},{\"Source\":\"Rotten Tomatoes\",\"Value\":\"89%\"},{\"Source\":\"Metacritic\",\"Value\":\"72\\/100\"}],\"Metascore\":\"72\",\"imdbRating\":\"7.5\",\"imdbVotes\":\"571,934\",\"imdbID\":\"tt1211837\",\"Type\":\"movie\",\"DVD\":\"28 Feb 2017\",\"BoxOffice\":\"$232,630,718\",\"Production\":\"Walt Disney Pictures\",\"Website\":\"N\\/A\",\"Response\":\"True\"}";
        String s5 = "{\"Title\":\"Spider-Man: Homecoming\",\"Year\":\"2017\",\"Rated\":\"PG-13\",\"Released\":\"07 Jul 2017\",\"Runtime\":\"133 min\",\"Genre\":\"Action, Adventure, Sci-Fi\",\"Director\":\"Jon Watts\",\"Writer\":\"Jonathan Goldstein (screenplay by), John Francis Daley (screenplay by), Jon Watts (screenplay by), Christopher Ford (screenplay by), Chris McKenna (screenplay by), Erik Sommers (screenplay by), Jonathan Goldstein (screen story by), John Francis Daley (screen story by), Stan Lee (based on the Marvel comic book by), Steve Ditko (based on the Marvel comic book by), Joe Simon (Captain America created by), Jack Kirby (Captain America created by)\",\"Actors\":\"Tom Holland, Michael Keaton, Robert Downey Jr., Marisa Tomei\",\"Plot\":\"Peter Parker balances his life as an ordinary high school student in Queens with his superhero alter-ego Spider-Man, and finds himself on the trail of a new menace prowling the skies of New York City.\",\"Language\":\"English, Spanish\",\"Country\":\"USA\",\"Awards\":\"7 wins & 9 nominations.\",\"Poster\":\"https:\\/\\/m.media-amazon.com\\/images\\/M\\/MV5BNTk4ODQ1MzgzNl5BMl5BanBnXkFtZTgwMTMyMzM4MTI@._V1_SX300.jpg\",\"Ratings\":[{\"Source\":\"Internet Movie Database\",\"Value\":\"7.4\\/10\"},{\"Source\":\"Rotten Tomatoes\",\"Value\":\"92%\"},{\"Source\":\"Metacritic\",\"Value\":\"73\\/100\"}],\"Metascore\":\"73\",\"imdbRating\":\"7.4\",\"imdbVotes\":\"490,635\",\"imdbID\":\"tt2250912\",\"Type\":\"movie\",\"DVD\":\"17 Oct 2017\",\"BoxOffice\":\"$334,166,825\",\"Production\":\"Sony Pictures\",\"Website\":\"N\\/A\",\"Response\":\"True\"}";
        String s6 = "{\"Title\":\"Guardians of the Galaxy Vol. 2\",\"Year\":\"2017\",\"Rated\":\"PG-13\",\"Released\":\"05 May 2017\",\"Runtime\":\"136 min\",\"Genre\":\"Action, Adventure, Comedy, Sci-Fi\",\"Director\":\"James Gunn\",\"Writer\":\"James Gunn, Dan Abnett (based on the Marvel comics by), Andy Lanning (based on the Marvel comics by), Steve Englehart (Star-Lord created by), Steve Gan (Star-Lord created by), Jim Starlin (Gamora and Drax created by), Stan Lee (Groot created by), Larry Lieber (Groot created by), Jack Kirby (Groot created by), Bill Mantlo (Rocket Raccoon created by), Keith Giffen (Rocket Raccoon created by), Steve Gerber (Howard the Duck created by), Val Mayerik (Howard the Duck created by)\",\"Actors\":\"Chris Pratt, Zoe Saldana, Dave Bautista, Vin Diesel\",\"Plot\":\"The Guardians struggle to keep together as a team while dealing with their personal family issues, notably Star-Lord's encounter with his father the ambitious celestial being Ego.\",\"Language\":\"English\",\"Country\":\"USA\",\"Awards\":\"Nominated for 1 Oscar. Another 15 wins & 56 nominations.\",\"Poster\":\"https:\\/\\/m.media-amazon.com\\/images\\/M\\/MV5BNjM0NTc0NzItM2FlYS00YzEwLWE0YmUtNTA2ZWIzODc2OTgxXkEyXkFqcGdeQXVyNTgwNzIyNzg@._V1_SX300.jpg\",\"Ratings\":[{\"Source\":\"Internet Movie Database\",\"Value\":\"7.6\\/10\"},{\"Source\":\"Rotten Tomatoes\",\"Value\":\"85%\"},{\"Source\":\"Metacritic\",\"Value\":\"67\\/100\"}],\"Metascore\":\"67\",\"imdbRating\":\"7.6\",\"imdbVotes\":\"545,424\",\"imdbID\":\"tt3896198\",\"Type\":\"movie\",\"DVD\":\"22 Aug 2017\",\"BoxOffice\":\"$389,804,217\",\"Production\":\"Walt Disney Pictures\",\"Website\":\"N\\/A\",\"Response\":\"True\"}";
        String s7 = "{\"Title\":\"Ant-Man\",\"Year\":\"2015\",\"Rated\":\"PG-13\",\"Released\":\"17 Jul 2015\",\"Runtime\":\"117 min\",\"Genre\":\"Action, Adventure, Comedy, Sci-Fi\",\"Director\":\"Peyton Reed\",\"Writer\":\"Edgar Wright (screenplay by), Joe Cornish (screenplay by), Adam McKay (screenplay by), Paul Rudd (screenplay by), Edgar Wright (story by), Joe Cornish (story by), Stan Lee (based on the Marvel comics by), Larry Lieber (based on the Marvel comics by), Jack Kirby (based on the Marvel comics by)\",\"Actors\":\"Paul Rudd, Michael Douglas, Evangeline Lilly, Corey Stoll\",\"Plot\":\"Armed with a super-suit with the astonishing ability to shrink in scale but increase in strength, cat burglar Scott Lang must embrace his inner hero and help his mentor, Dr. Hank Pym, plan and pull off a heist that will save the world.\",\"Language\":\"English\",\"Country\":\"USA\",\"Awards\":\"Nominated for 1 BAFTA Film Award. Another 4 wins & 33 nominations.\",\"Poster\":\"https:\\/\\/m.media-amazon.com\\/images\\/M\\/MV5BMjM2NTQ5Mzc2M15BMl5BanBnXkFtZTgwNTcxMDI2NTE@._V1_SX300.jpg\",\"Ratings\":[{\"Source\":\"Internet Movie Database\",\"Value\":\"7.3\\/10\"},{\"Source\":\"Rotten Tomatoes\",\"Value\":\"83%\"},{\"Source\":\"Metacritic\",\"Value\":\"64\\/100\"}],\"Metascore\":\"64\",\"imdbRating\":\"7.3\",\"imdbVotes\":\"548,178\",\"imdbID\":\"tt0478970\",\"Type\":\"movie\",\"DVD\":\"08 Dec 2015\",\"BoxOffice\":\"$138,002,223\",\"Production\":\"Disney\\/Marvel\",\"Website\":\"N\\/A\",\"Response\":\"True\"}";

        ArrayList<String> arrayList = new ArrayList();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);
        arrayList.add(s5);
        arrayList.add(s6);
        arrayList.add(s7);

        ArrayList<Movie> movieArrayList= new ArrayList<>();

        for (int j=0;j<arrayList.size();j++)
        {
            JSONObject response1 = new JSONObject(arrayList.get(j));
            ArrayList<Genre> genreArrayList = new ArrayList<>();
            ArrayList<Actor> actorArrayList = new ArrayList<>();
            ArrayList<Rating> ratingArrayList = new ArrayList<>();

            String title1 = response1.getString("Title");
            String rated1 = response1.getString("Rated");
            String released1 = response1.getString("Released");
            String runtime1 = response1.getString("Runtime");
            String genre1 = response1.getString("Genre");
            String[] genres = genre1.split(",");
            for (String i:genres)
            {
                genreArrayList.add(new Genre(i));
            }
            String director1 = response1.getString("Director");
            String actors1 = response1.getString("Actors");
            String[] actors = actors1.split(",");
            for (String i:actors)
            {
                actorArrayList.add(new Actor(i));
            }
            String plot1 = response1.getString("Plot");
            String poster1 = response1.getString("Poster");
            JSONArray ratings1 = response1.getJSONArray("Ratings");
            for (int i=0;i<ratings1.length();i++)
            {
                JSONObject jsonObject = (JSONObject)ratings1.get(i);
                String source = jsonObject.getString("Source");
                String value =jsonObject.getString("Value");
                ratingArrayList.add(new Rating(source,value));
            }

            String imdbID1 = response1.getString("imdbID");
            String boxOffice1 = response1.getString("BoxOffice");
            String production1 = response1.getString("Production");

            movieArrayList.add(new Movie(title1,rated1,released1,runtime1,genreArrayList,director1,actorArrayList,plot1,poster1,ratingArrayList,imdbID1,boxOffice1,production1));
        }
        return  movieArrayList;
    }
}

