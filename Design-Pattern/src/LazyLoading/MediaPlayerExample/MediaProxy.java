/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LazyLoading.MediaPlayerExample;

/**
 *
 * @author Hamza
 */
public class MediaProxy implements MediaSource {
    private MediaSource media;
    private String source;

    public MediaProxy(String source) {
        this.source = source;
    }

    @Override
    public void play() {
        if (media == null) {
            media = new RealMedia(source);
        }
        media.play();
    }
}

