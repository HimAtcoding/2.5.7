/*************************************
 * Sample solution for Activity 2.5.7
 *
 * A MediaLib class for the MediaLibrary program
 *  
 * See comments for each step
 **************************************/
public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;
  public static String owner = "Ryan";
  private static int numEntries = 0;

  public void addMovie(Movie m) {
    if (movie != null) {
      System.out.println("Sorry, you have reached the maximum of 1 movie in the library");
    } else {
      movie = m;
      numEntries++;
    }
  }
  public void addBook(Book b)
  {
    /* book started off to be null, as it wasnt given a proper memory address, and this looks to see if book was modified to equal a real Book object reference, and if so, you will be told that you have reached the max of 1 book, else you get a book stored, and number of entries raised */
    if (book != null) {
      System.out.println("Sorry, you already have a maximum of 1 book in the library");
    } else {
      book = b;
      numEntries++;
    }
  }
  public void addSong(Song b)
  {
    /* book started off to be null, as it wasnt given a proper memory address, and this looks to see if book was modified to equal a real Book object reference, and if so, you will be told that you have reached the max of 1 book, else you get a book stored, and number of entries raised */
    if (song != null) {
      System.out.println("Sorry, you already have a maximum of 1 song in the library");
    } else {
      song = b;
      numEntries++;
    }
  }


  // new step 18-22
  /* test scenario
  public void testBook(Book tester)
  {
    tester.setTitle("Animal Farm");
    // show state chagne with one of the following
    System.out.println(" in test: " + tester);
    System.out.println(" in test: " + tester.getTitle());
  }
  */

  public String toString()  
  {
    String info = "";

  // Step 5, avoid crashing by testing that book is not null before using its toString method
    if (book != null) {
      info += "Book: " + book + "\n";
    }
    if (movie != null) {
      info += "Movie: " + movie + "\n";
    }
    if (song != null) {
      info += "Song: " + song + "\n";
    }
    return info;
  }
  
  public static String getOwner() {
    return owner;
  }
  
  public static String changeOwner(String newOwner) {
    owner = newOwner;
    return owner;
  }
  
  public static int getNumEntries() {
    return numEntries;
  }
}
