package com.ktplayer;

import javafx.beans.property.*;
import javafx.scene.image.Image;

public class Song {

    private StringProperty id;
    private StringProperty name;
    private StringProperty genre;
    private StringProperty artist;
    private StringProperty album;
    private StringProperty  year;
    private StringProperty lyrics;
    //private BooleanProperty favorite;
    private StringProperty length;
    private StringProperty duration;

    private StringProperty url;

    private Image image;

    public Song() {}

    public Song(String url) {
        this.url = new SimpleStringProperty(url);
    }

    public Song(String id, String name,String genre, String artist, String album, String year, String lyrics, String url) {
        this.id = new SimpleStringProperty(id);
        this.name = new SimpleStringProperty(name);
        this.genre = new SimpleStringProperty(genre);
        this.artist = new SimpleStringProperty(artist);
        this.album = new SimpleStringProperty(album);
        this.year = new SimpleStringProperty(year);
        this.lyrics = new SimpleStringProperty(lyrics);
        //this.favorite = new SimpleBooleanProperty(favorite);
        this.url = new SimpleStringProperty(url);

    }
    public String getId() { return id.get(); }

    public StringProperty idProperty() { return id;}

    public void setId(String id) { this.id.set(id); }

    public String getName() { return name.get();}
    public void setName(String name) {this.name.set(name);}
    public StringProperty nameProperty() {return name;}


    public String getGenre() { return genre.get();}
    public void setGenre(String genre) {this.genre.set(genre);}
    public StringProperty genreProperty() {return genre;}


    public String getArtist() {
        return artist.get();
    }
    public void setArtist(String artist) { this.artist.set(artist);}
    public StringProperty artistProperty() {
        return artist;
    }



    public String getAlbum() {
        return album.get();
    }
    public void setAlbum(String album) {
        this.album.set(album);
    }
    public StringProperty albumProperty() {
        return album;
    }


    public String getYear() {return year.get();}
    public void setYear(String year) {
        this.year.set(year);
    }
    public StringProperty yearProperty() {
        return year;
    }

//ver si formato está bien
    public String getFormat() {
        return lyrics.get();
    }

    public void setLyrics(String format) {
        this.lyrics.set(format);
    }
    public StringProperty formatProperty() {
        return lyrics;
    }

/*
    public Boolean getFavorite() {
        return favorite.get();
    }

    public void setLyrics(Boolean favorite) {
        this.favorite.set(favorite);
    }
    public BooleanProperty favoriteProperty() {
        return favorite;
    }
*/
    public String getDuration() {
    return length.get();
}

    public void setDuration(String duration) {
        this.length.set(duration);
    }

    public StringProperty durationProperty() {
        return length;
    }

    public String getRate() {
        return duration.get();
    }

    public StringProperty rateProperty() {
        return duration;
    }

    public void setRate(String rate) {
        this.duration.set(rate);
    }

    public String getUrl() {
        return url.get();
    }

    public StringProperty urlProperty() {
        return url;
    }

    public void setUrl(String url) {
        this.url.set(url);
    }

    public Image getImage() { return image;}

    public void setImage(Image image) {this.image = image;
    }

}

