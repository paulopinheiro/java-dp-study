package br.com.paulopinheiro.javadpstudy.structural.adapter.players;

import java.security.InvalidParameterException;

public class AudioPlayer implements MediaPlayer {
    @Override
    //Plays MP3 by default
    public void play(String format, String file) {
        if (format.equalsIgnoreCase("mp3")) {
            System.out.println("Playing " + format + " file: " + file);
        } else {
            throw new InvalidParameterException("Invalid media. "  + format + " format is not supported");
        }
    }
}
