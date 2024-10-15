package br.com.paulopinheiro.javadpstudy.structural.adapter;

import br.com.paulopinheiro.javadpstudy.structural.adapter.players.AudioPlayer;
import br.com.paulopinheiro.javadpstudy.structural.adapter.players.MediaPlayer;
import br.com.paulopinheiro.javadpstudy.structural.adapter.players.Mp4Player;
import br.com.paulopinheiro.javadpstudy.structural.adapter.players.VlcPlayer;
import java.security.InvalidParameterException;

public class Client {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();
        MediaPlayer vlcPlayer = new AdvancedMediaPlayerAdapter(new VlcPlayer());
        MediaPlayer mp4Player = new AdvancedMediaPlayerAdapter(new Mp4Player());

        try {
            audioPlayer.play("mp3", "Sunday Bloody Sunday.mp3");
            vlcPlayer.play("vlc", "Ordinary World.vlc");
            mp4Player.play("mp4", "Bohemian Rapsody.mp4");
            audioPlayer.play("avi","Gone With The Wind.avi");
        } catch (InvalidParameterException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
