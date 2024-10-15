package br.com.paulopinheiro.javadpstudy.structural.adapter;

import br.com.paulopinheiro.javadpstudy.structural.adapter.players.AdvancedMediaPlayer;
import br.com.paulopinheiro.javadpstudy.structural.adapter.players.MediaPlayer;

public class AdvancedMediaPlayerAdapter implements MediaPlayer {
    private final AdvancedMediaPlayer amPlayer;
    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer amPlayer) {
        this.amPlayer = amPlayer;
    }

    @Override
    public void play(String format, String file) {
        amPlayer.loadFilename(file);
        amPlayer.listen();
    }
}
