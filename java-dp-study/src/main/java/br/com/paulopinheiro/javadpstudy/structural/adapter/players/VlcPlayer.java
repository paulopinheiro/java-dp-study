package br.com.paulopinheiro.javadpstudy.structural.adapter.players;

public class VlcPlayer implements AdvancedMediaPlayer {
    private String file;
    @Override
    public void loadFilename(String file) {
        this.file = file;
    }

    @Override
    public void listen() {
        System.out.println("Playing VLC file: " + file);
    }
}
