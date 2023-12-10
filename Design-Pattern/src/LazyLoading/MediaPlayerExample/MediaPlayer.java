/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LazyLoading.MediaPlayerExample;

/**
 *
 * @author Hamza
 */
public class MediaPlayer {
    private static MediaPlayer instance;

    private MediaPlayer() {
        // Private constructor to prevent direct instantiation
    }

    public static synchronized MediaPlayer getInstance() {
        if (instance == null) {
            instance = new MediaPlayer();
        }
        return instance;
    }
}
