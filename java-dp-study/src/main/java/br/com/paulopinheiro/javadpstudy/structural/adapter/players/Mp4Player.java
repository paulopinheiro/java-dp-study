package br.com.paulopinheiro.javadpstudy.structural.adapter.players;

public class Mp4Player implements AdvancedMediaPlayer {
    private String file;
    
    @Override
    public void loadFilename(String file) {
        this.file = file;
    }

    @Override
    public void listen() {
        System.out.println("Playing MP4 file: " + file);
    }
}
