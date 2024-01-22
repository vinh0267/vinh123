package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        Playable audioPlayer = new AudioPlayer();
        Playable videoPlayer = new VideoPlayer();

        audioPlayer.play();
        videoPlayer.play();
    }
}