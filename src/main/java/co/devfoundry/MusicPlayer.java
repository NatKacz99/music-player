package co.devfoundry;

import java.util.Arrays;
import java.util.List;

public class MusicPlayer {
    List<String> tracks = Arrays.asList("Track 1", "Track 2", "Track 3");
    int currentTrackNumber = 0;

    public void playNextTrack() {
        currentTrackNumber++;
        if (currentTrackNumber > 2) {
            currentTrackNumber = 0;
        }
        System.out.println("Play next track " + tracks.get(currentTrackNumber));
    }

    public void playFirstTrack(){
        currentTrackNumber = 0;
        System.out.println("Play first track " + tracks.get(currentTrackNumber));
    }

    public void playRandomTrack(){
        int randomTrackNumber = (int) (Math.random() * (3));
        System.out.println("Play random track " + tracks.get(randomTrackNumber));
    }
}
