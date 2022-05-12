public class TVShow {
    private String name;
    private int episodes;
    private String genre;

    public TVShow (String name, int episodes, String genre) {
        this.name = name;
        this.episodes = episodes;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public int getEpisodes() {
        return episodes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "The name of the show is " + getName() + " with " + getEpisodes() + " number of episodes."
                + " The genre is " + getGenre();
    }
}
