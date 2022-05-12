public class TVShow {
    private String name;
    private int episodes;
    private String genre;

    public TVShow (String name, int episodes, String genre) {
        this.name = name;
        this.episodes = episodes;
        this.genre = genre;
    }

    public TVShow () {
        this.name = null;
        this.episodes = 0;
        this.genre = null;
    }

    public TVShow (String name, int episodes) {
        this.name = name;
        this.episodes = episodes;
        this.genre = null;
    }

    public TVShow (int episodes) {
        this.name = null;
        this.episodes = episodes;
        this.genre = null;
    }

    public TVShow (String genre) {
        this.name = null;
        this.episodes = 0;
        this.genre = genre;
    }

    public TVShow (int episodes, String genre) {
        this.name = null;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "The name of the show is " + getName() + " with " + getEpisodes() + " number of episodes."
                + " The genre is " + getGenre();
    }
}
