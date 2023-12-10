/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LazyLoading.MediaPlayerExample;

/**
 *
 * @author Hamza
 */
public class VideoMediaSource implements MediaSource {
    private String source;

    public VideoMediaSource(String source) {
        this.source=source;
    }

    @Override
    public void play() {
        System.out.println("Playing Video from: " + source);}
    
}
