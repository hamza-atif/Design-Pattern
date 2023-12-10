/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LazyLoading.MediaPlayerExample;

/**
 *
 * @author Hamza
 */
import java.util.ArrayList;
import java.util.List;

public class MediaPlayback {
    private List<MediaDisplay> observers = new ArrayList<>();

    public void registerObserver(MediaDisplay observer) {
        observers.add(observer);
    }

    public void removeObserver(MediaDisplay observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (MediaDisplay observer : observers) {
            observer.update();
        }
    }
}


