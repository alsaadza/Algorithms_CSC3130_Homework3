public class AList {
    private Song[]  SongList;
    int currentIndex;
    int maxSize;

    public AList(){
        maxSize = 1;
        currentIndex = 0;
        SongList = new Song[maxSize];
    }

    public void addy(Song p){
        if (currentIndex >= maxSize){
            maxSize = maxSize * 2;
            Song[] migratedList = new Song[maxSize];
            for (int i = 0; i < SongList.length; i++) {
                migratedList[i] = SongList[i];
            }
            SongList = migratedList;
        }

            SongList[currentIndex] = p;
            currentIndex++;

    }

    public void removy(int pos) {
        for (int i = pos; i < currentIndex - 1; i++) {

            SongList[i] = SongList[i + 1];

        }

        SongList[currentIndex - 1] = null;
        currentIndex--;
    }

    public String toString() {
        StringBuilder playstring = new StringBuilder();

        if (currentIndex == 0) {
            return "Playlist empty, add some music please!";
        }

        for (int i = 0; i < SongList.length; i++) {
            if(SongList[i] != null){
            playstring.append("Song #" + (i+1) + ": " + (SongList[i].toString()) + "\n");
            }
        }
        return playstring.toString();

    }



    public static void main(String[] args) {
        AList playlist = new AList();

        System.out.println("A call to songsList.toString() returns: \n"+ playlist.toString());
        System.out.println();

        Song song1 = new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47);
        Song song2 = new Song("Coral Crown", "Darren Korb", 4.14);
        Song song3 = new Song("CASANOVE POSSE", "ALI", 3.17);
        Song song4 = new Song("Coral Crown", "Darren Korb", 4.14);

        playlist.addy(song1);
        playlist.addy(song2);
        playlist.addy(song3);
        playlist.addy(song4);

        System.out.println("After adding 4 songs to the playlist:") ;
        System.out.println(playlist.toString());
        System.out.println();

        playlist.removy(1);
        System.out.println("After removing index 1:");
        System.out.println(playlist.toString());
    }

}
