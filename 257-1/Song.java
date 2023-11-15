/*************************************
 * Sample solution for Activity 2.5.7
 *  
 * A MediaLib class for the MediaLibrary program
 *  
 * See comments for each step
 **************************************/
public class Song
{
  private int rating;
  private String title;

  /*** Constructor ****/
  public Book(String t, int r)
  {
    title = t;
    rating = r;
  }

   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public int getRating() {
    return rating;
  }

  public String toString()  
  {
    String info = "\"" + title + "\"";
    if (rating != 0) {
      info += ", rating is " + rating;
    }
    return info;
  }

  // Step 23 - 29
  public boolean equals(Song b)
  {
  // variations of the if statement:
  // if(b.title.equals(getTitle()) && b.author.equals(getAuthor()))
  // if(title.equals(b.title) && author.equals(b.author))
  // if(b.title.equals(title) && b.author.equals(author))
    if(this.title.equals(b.title) && this.rating.equals(b.rating)) {
      return true;
    }
    return false;

  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

    // Step 7: create the method
  public void adjustRating(int r)
  {
    // Step 10-11 improve the method
    if ((rating + r >= 0) && (rating + r <= 10)) {
      rating += r;
    }
    r = 10;// Step 9: changing the param here has no effect in the runner

    }

  }

