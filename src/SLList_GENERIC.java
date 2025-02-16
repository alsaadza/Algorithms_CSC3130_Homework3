public class SLList_GENERIC {

    private SLNode_GENERIC head;
    private int size;

    public SLList_GENERIC() {
        head = null;
        size = 0;
    }

    public void addy(Object song) {
        SLNode_GENERIC newNode = new SLNode_GENERIC(song);
        if (head == null) {
            head = newNode;
        } else {
            SLNode_GENERIC current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void removy(int pos) {
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid position.");
            return;
        }

        if (pos == 0) {
            head = head.next;
        } else {
            SLNode_GENERIC current = head;
            for (int i = 0; i < pos - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    public String toString() {
        if (size == 0) {
            return "Playlist empty, add some music please!";
        }

        StringBuilder playstring = new StringBuilder();
        SLNode_GENERIC current = head;
        int index = 1;
        while (current != null) {
            playstring.append("Song #" + index + ": " + current.data.toString() + "\n");
            current = current.next;
            index++;
        }
        return playstring.toString();
    }

    public static void main(String[] args) {
        SLList playlist = new SLList();

        System.out.println("A call to songsList.toString() returns: \n" + playlist.toString());
        System.out.println();

        Song song1 = new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47);
        Song song2 = new Song("Coral Crown", "Darren Korb", 4.14);
        Song song3 = new Song("CASANOVE POSSE", "ALI", 3.17);
        Song song4 = new Song("Coral Crown", "Darren Korb", 4.14);

        playlist.addy(song1);
        playlist.addy(song2);
        playlist.addy(song3);
        playlist.addy(song4);

        System.out.println("After adding 4 songs to the playlist:");
        System.out.println(playlist.toString());
        System.out.println();

        playlist.removy(1);
        System.out.println("After removing index 1:");
        System.out.println(playlist.toString());
    }

}
