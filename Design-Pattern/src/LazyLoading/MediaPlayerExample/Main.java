/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LazyLoading.MediaPlayerExample;

/**
 *
 * @author Hamza
 */
public class Main {
    public static void main(String[] args) {
        MediaPlayer player = MediaPlayer.getInstance();

        MediaSource audioProxy = new MediaProxy("audio.mp3");
        MediaSource videoProxy = new MediaProxy("video.mp4");

        MediaPlayback playback = new MediaPlayback();
        playback.registerObserver(new AudioDisplay());
        playback.registerObserver(new VideoDisplay());

        playback.notifyObservers();

        audioProxy.play(); // Will load and play audio from disk
        videoProxy.play(); // Will load and play video from disk

        playback.notifyObservers();
    }
}

