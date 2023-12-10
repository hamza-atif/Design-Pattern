/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LazyLoading.MediaPlayerExample;

/**
 *
 * @author Hamza
 */
public class MediaFactory {
    public static MediaSource createMediaSource(String mediaType, String source) {
        if ("audio".equalsIgnoreCase(mediaType)) {
            return new AudioMediaSource(source);
        } else if ("video".equalsIgnoreCase(mediaType)) {
            return new VideoMediaSource(source);
        }
        // Add more types as needed
        return null;
    }
}

