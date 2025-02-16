public class DLList {

    private DLLNode head;
    private DLLNode tail;
    private int size;

    public DLList() {
        head = null;
        tail = null;
        size = 0;
    }


    public void addy(Song song) {
        DLLNode newNode = new DLLNode(song);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }


    public void removy(int pos) {
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid position.");
            return;
        }

        if (pos == 0) {
            if (head.next == null) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        } else if (pos == size - 1) {
            tail = tail.prev;
            tail.next = null;
        } else {
            DLLNode current = head;
            for (int i = 0; i < pos; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
    }


    public String toString() {
        if (size == 0) {
            return "Playlist empty, add some music please!";
        }

        StringBuilder playstring = new StringBuilder();
        DLLNode current = head;
        int index = 1;
        while (current != null) {
            playstring.append("Song #" + index + ": " + current.data.toString() + "\n");
            current = current.next;
            index++;
        }
        return playstring.toString();
    }


    public static void main(String[] args) {
        DLList playlist = new DLList();

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
