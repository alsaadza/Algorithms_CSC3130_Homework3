public class TEST {

    public static void main(String args[]){

        Song song1 = new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47);
        Song song2 = new Song("Coral Crown", "Darren Korb", 4.14);
        Song song3 = new Song("CASANOVE POSSE", "ALI", 3.17);
        Song song4 = new Song("Coral Crown", "Darren Korb", 4.14);

        System.out.println();
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("TEST 1: ARRAYLIST (NON-GENERIC)");
        System.out.println();

        AList test1 = new AList();

        System.out.println("A call to songsList.toString() returns: \n"+ test1.toString());
        System.out.println();
        test1.addy(song1);
        test1.addy(song2);
        test1.addy(song3);
        test1.addy(song4);

        System.out.println("After adding 4 songs to the playlist:") ;
        System.out.println(test1.toString());
        System.out.println();

        test1.removy(1);
        System.out.println("After removing index 1:");
        System.out.println(test1.toString());

        System.out.println();
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("TEST 2: ARRAYLIST (GENERIC)");
        System.out.println();

        AList_GENERIC test6 = new AList_GENERIC();

        System.out.println("A call to songsList.toString() returns: \n"+ test1.toString());
        System.out.println();
        test6.addy(song1);
        test6.addy(song2);
        test6.addy(song3);
        test6.addy(song4);

        System.out.println("After adding 4 songs to the playlist:") ;
        System.out.println(test6.toString());
        System.out.println();

        test6.removy(1);
        System.out.println("After removing index 1:");
        System.out.println(test6.toString());


        System.out.println();
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("TEST 3: SINGLE LINKED LIST (NON-GENERIC)");
        System.out.println();


        SLList test2 = new SLList();

        System.out.println("A call to songsList.toString() returns: \n" + test2.toString());
        System.out.println();

        test2.addy(song1);
        test2.addy(song2);
        test2.addy(song3);
        test2.addy(song4);

        System.out.println("After adding 4 songs to the playlist:");
        System.out.println(test2.toString());
        System.out.println();

        test2.removy(1);
        System.out.println("After removing index 1:");
        System.out.println(test2.toString());

        System.out.println();
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("TEST 4: SINGLE LINKED LIST (GENERIC)");
        System.out.println();


        SLList_GENERIC test3 = new SLList_GENERIC();

        System.out.println("A call to songsList.toString() returns: \n" + test3.toString());
        System.out.println();

        test3.addy(song1);
        test3.addy(song2);
        test3.addy(song3);
        test3.addy(song4);

        System.out.println("After adding 4 songs to the playlist:");
        System.out.println(test3.toString());
        System.out.println();

        test3.removy(1);
        System.out.println("After removing index 1:");
        System.out.println(test3.toString());

        System.out.println();
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("TEST 5: DOUBLE LINKED LIST (NON-GENERIC)");
        System.out.println();


        DLList test4 = new DLList();

        System.out.println("A call to songsList.toString() returns: \n" + test4.toString());
        System.out.println();

        test4.addy(song1);
        test4.addy(song2);
        test4.addy(song3);
        test4.addy(song4);

        System.out.println("After adding 4 songs to the playlist:");
        System.out.println(test4.toString());
        System.out.println();

        test4.removy(1);
        System.out.println("After removing index 1:");
        System.out.println(test4.toString());


        System.out.println();
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("TEST 6: DOUBLE LINKED LIST (GENERIC)");
        System.out.println();


        DLList_GENERIC test5 = new DLList_GENERIC();

        System.out.println("A call to songsList.toString() returns: \n" + test5.toString());
        System.out.println();

        test5.addy(song1);
        test5.addy(song2);
        test5.addy(song3);
        test5.addy(song4);

        System.out.println("After adding 4 songs to the playlist:");
        System.out.println(test5.toString());
        System.out.println();

        test5.removy(1);
        System.out.println("After removing index 1:");
        System.out.println(test5.toString());





    }
    }


