public class MusicPlayer {
    public static void main(String[] args) {
        PlayList playlist = new PlayList();
        playlist.addSong("Shape of You");
        playlist.addSong("Bohemian Rhapsody");
        playlist.addSong("Blinding Lights");

        Iterator<String> iterator = playlist.createIterator();

        System.out.println("Now Playing:");

        while (iterator.hasNext()) {
            System.out.println("🎵 " + iterator.next());
        }

    }
}
