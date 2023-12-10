/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LazyLoading.MediaPlayerExample;

/**
 *
 * @author Hamza
 */
public class RealMedia implements MediaSource {
    private String source;

    public RealMedia(String source) {
        this.source = source;
        loadFromDisk();
    }

    @Override
    public void play() {
        System.out.println("Playing media from: " + source);
    }

    private void loadFromDisk() {
        System.out.println("Loading media: " + source + " from disk...");
    }
}
