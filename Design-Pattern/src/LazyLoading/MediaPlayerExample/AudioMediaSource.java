/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LazyLoading.MediaPlayerExample;

/**
 *
 * @author Hamza
 */
public class AudioMediaSource implements MediaSource {
    private String source;

    public AudioMediaSource(String source) {
        this.source = source;
    }

    @Override
    public void play() {
        System.out.println("Playing audio from: " + source);
    }
}