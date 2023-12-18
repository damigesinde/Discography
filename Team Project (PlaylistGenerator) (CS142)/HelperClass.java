
// Import File class: Make1 methods usable in Main file
package com.playlistgenerater;

// Import Scanner class
import java.util.Scanner;  

// Import ArrayList class
import java.util.ArrayList;

// Import HashMap class
import java.util.HashMap;

// Import Map class
import java.util.Map;

// Import Random class
import java.util.Random;

// Import Arrays class
import java.util.Arrays;

// Import List class
import java.util.List;

//import com.oracle.truffle.api.dsl.Cached.Exclusive;

public class HelperClass 
{

  // Create Scanner object
  static Scanner input = new Scanner(System.in); 

  // Create a Random object
  static Random random = new Random();
  
  private static Map<String, ArrayList<String>> playlists = new HashMap<>();
  private static int playlistCounter = 1;
  
  // Introduction
  public static void Introduction()
  {
    String intro = ("This program is a Playlist Generator designed to make music organization seamless. Through a user-friendly interface, individuals can input the name of an artist, a song, and a genre. Users are given the flexibility to curate their playlists strictly based on a specific genre or artist. Alternatively, they can opt for a mixed-genre playlist, a unique feature suggesting artists that complement each other seamlessly, resulting in a playlist that effortlessly blends different music genres based on the compatibility of artists. \n\nUsers enjoy the ability to name their playlists, add or remove songs at their discretion, delete playlists they no longer need, and easily track the number of songs in each playlist. The program conveniently stores these playlists, allowing users to revisit their curated music collections whenever they desire.");
    System.out.println(intro);
    System.out.println("\nNOTE: Generated playlist, before being named, will be called playlist1, playlist2, and so on.");
  }

  
  // Menu
  public static void Menu()
  {
    System.out.println();
    String menu = ("1. Make a playlist \n2. Name a playlist(s) \n3. Add/Remove songs from a playlist(s) \n4. Display song count in playlist(s) \n5. Display Playlist(s) \n6. Delete Playlist(s)");
    System.out.println(menu);
    int menuChoice = input.nextInt();
    input.nextLine();
  

    if(menuChoice == 1)
    {
      HelperClass.Menu1();
    }
    else if(menuChoice == 2)
    {
      HelperClass.Menu2();
    }
    else if(menuChoice == 3)
    {
      HelperClass.Menu3();
    }
    else if(menuChoice == 4)
    {
      HelperClass.Menu4();
    }
    else if(menuChoice == 5)
    {
      HelperClass.Menu5();
    }
    else if(menuChoice == 6)
    {
      HelperClass.Menu6();
    }
    else
    {
      System.out.println("Please choice a valid option");
      System.out.println("Options are: \n '1', '2', '3', '4', '5', or '6'");
      HelperClass.Menu();
    }    
  }
  
  // Menu Option 1: Choose what type of playlist
  public static void Menu1()
  {
    System.out.println("To make a playlist, enter the type of playlist. \n1. General \n2. Artist \n3. Genre \n4. Mixed-Genre ");
    int playlistChoice = input.nextInt();
    input.nextLine();
    if(playlistChoice == 1)
    {
      HelperClass.MakeGeneralPlaylist();
    }
    else if(playlistChoice == 2)
    {
      HelperClass.MakeArtistPlaylist();
    }
    else if(playlistChoice == 3)
    {
      HelperClass.MakeGenrePlaylist();
    }
    else if(playlistChoice == 4)
    {
      HelperClass.MakeMixedGenrePlaylist();
    }
    else
    {
      System.out.println("Please choice a valid option");
      System.out.println("Options are: \n '1', '2', '3', '4'");
      HelperClass.Menu1();
    }
  }

  // Menu Option 2
  public static void Menu2()
  {
    HelperClass.NamePlaylist();
  }

  // Menu Option 3
  public static void Menu3()
  {
    HelperClass.AddRemoveSongs();
  }

  // Menu Option 4
  public static void Menu4()
  {
    HelperClass.DisplaySongCount();
  }

  // Menu Option 5
  public static void Menu5()
  {
    HelperClass.DisplayPlaylists();
  }

  // Menu Option 6
  public static void Menu6()
  {
    HelperClass.DeletePlaylist();
  }


  // Make a regular playlist 
  public static void MakeGeneralPlaylist()
  {
    
    // Creates a identifier for the playlist
    String playlistId = generateIdentifier();

    ArrayList<String> playlist1 = new ArrayList<>();

    System.out.println("To make a playlist, choose a song or a list of songs. \nEnter the name of the arist, song, and genre. \nWhen done, type 'done'.");
    String end = ("done");
    while(true)
    {
      System.out.println("Enter the name of the artist, song, and genre: ");
      String artistName = input.nextLine();
      String songName = input.nextLine();
      String genreName = input.nextLine();

      //Check if the user wants to end
      if((artistName.equals(end)) || (songName.equals(end)) || (genreName.equals(end)))
      {
        break;
      }

      //Add song to array
      String song = (artistName + ", " + songName + ", " + genreName);
      playlist1.add(song);
    }   

    //Display playlist
    for (String i : playlist1) 
    {
      System.out.println(i);
    }

    // Store Playlist
    StorePlaylist(playlistId, playlist1);

    // Back to Menu
    HelperClass.Menu();

  }

  //Make genre playlist
  public static void MakeArtistPlaylist()
  {

    // Creates a identifier for the playlist
    String playlistId = generateIdentifier();
    
    ArrayList<String> playlist1 = new ArrayList<>();

    System.out.println("To make a artist playlist, choose a song or a list of songs. \nEnter the name of the arist, song, and genre. \nWhen done, type 'done'.");
    String end = ("done");
    
    System.out.println("Enter the name of the artist: ");
    String artistName = input.nextLine();
    playlist1.add(artistName);
    
    while(true)
    {
      System.out.println("Enter the name of the song and genre: ");
      String songName = input.nextLine();
      String genreName = input.nextLine();

      //Check if the user wants to end
      if((songName.equals(end)) || (genreName.equals(end)))
      {
        break;
      }

      //Add song to array
      String song = (songName + ", " + genreName);
      playlist1.add(song);
    }   

    //Display playlist
    for (String i : playlist1) 
    {
      System.out.println(i);
    }

    // Store Playlist
    StorePlaylist(playlistId, playlist1);

    // Back to Menu
    HelperClass.Menu();
  }

  //Make artist playlist
  public static void MakeGenrePlaylist()
  {

    // Creates a identifier for the playlist
    String playlistId = generateIdentifier();  
    
    ArrayList<String> playlist1 = new ArrayList<>();

    System.out.println("To make a genre playlist, choose a song or a list of songs. \nEnter the name of the arist, song, and genre. \nWhen done, type 'done'.");
    String end = ("done");

    System.out.println("Enter the name of the genre: ");
    String genreName = input.nextLine();
    playlist1.add(genreName);

    while(true)
    {
      System.out.println("Enter the name of the artist and song: ");
      String artistName = input.nextLine();
      String songName = input.nextLine();

      //Check if the user wants to end
      if((artistName.equals(end)) || (songName.equals(end)))
      {
        break;
      }

      //Add song to array
      String song = (artistName + ", " + songName);
      playlist1.add(song);
    }   

    //Display playlist
    for (String i : playlist1) 
    {
      System.out.println(i);
    }

    // Store Playlist
    StorePlaylist(playlistId, playlist1);

    // Back to Menu
    HelperClass.Menu();
  }

  //Make mixed-genre playlist
  public static void MakeMixedGenrePlaylist()
  {
    
    // Creates a identifier for the playlist
    String playlistId = generateIdentifier();  

    ArrayList<String> playlist1 = new ArrayList<>();
    
    System.out.println("To make a mixed-genre playlist, choose a song or a list of songs. \nEnter the name of the arist, song, and genre. \nBased on the artist name, a list of recommended artists will be displayed. \nWhen done, type 'done'");
    String end = ("done");
    
    while(true)
    {
      System.out.println("Enter the name of the artist, song, and genre: ");
      String artistName = input.nextLine();
      String songName = input.nextLine();
      String genreName = input.nextLine();

      RecommendedArtists(artistName);

      //Check if the user wants to end
      if((artistName.equals(end)) || (songName.equals(end)) || (genreName.equals(end)))
      {
        break;
      }

      //Add song to array
      String song = (artistName + ", " + songName + ", " + genreName);
      playlist1.add(song);
    }  

    //Display playlist
    for (String i : playlist1) 
    {
      System.out.println(i);
    }

    // Store Playlist
    StorePlaylist(playlistId, playlist1);

    // Back to Menu
    HelperClass.Menu();
    
  }

  
  // Name a playlist(s)
  public static void NamePlaylist()
  {
    System.out.println("To name a playlist, enter the name of the playlist: ");
    String playlistId = input.nextLine();
    ArrayList<String> playlist = GetPlaylist(playlistId);

    System.out.println("Enter the updated playlist name: ");
    String newPlaylistId = input.nextLine();

    // Delete old playlist
    playlists.remove(playlistId);

    // Store new playlist
    playlists.put(newPlaylistId, playlist);

    // Back to Menu
    HelperClass.Menu();
  }
    

  
  // Add/Remove songs 
  public static void AddRemoveSongs()
  {
    System.out.println("Would you like to 'add' or 'remove' a song?");
    String choice = input.nextLine();

    if(choice.equals("add"))
    {
      System.out.println("To add a song to a playlist, enter the name of the playlist: "); 
      String playlistId = input.nextLine();
      ArrayList<String> playlist = GetPlaylist(playlistId);

      System.out.println("Enter the type of playlist:\n'general', 'artist', 'genre', or 'mixed-genre' ");
      String playlistType = input.nextLine();

      if(playlistType.equals("general"))
      {
        while(true)
        {
          System.out.println("Enter the name of the artist, song, and genre. \nWhen done, type 'done': ");
          String artistName = input.nextLine();
          String songName = input.nextLine();
          String genreName = input.nextLine();

          //Check if the user wants to end
          if((artistName.equals("done")) || (songName.equals("done")) || (genreName.equals("done")))
          {
            break;
          }

          //Add song to array
          String song = (artistName + ", " + songName + ", " + genreName);
          playlist.add(song);
        }

        //Display playlist
        for (String i : playlist) 
        {
          System.out.println(i);
        }

        // Back to Menu
        HelperClass.Menu();
      }
      else if(playlistType.equals("artist"))
      {
        while(true)
        {
          System.out.println("Enter the name of the song and genre. \nWhen done, type 'done': ");
          String songName = input.nextLine();
          String genreName = input.nextLine();

          //Check if the user wants to end
          if((songName.equals("done")) || (genreName.equals("done")))
          {
            break;
          }

          //Add song to array
          String song = (songName + ", " + genreName);
          playlist.add(song);
        }
        
        //Display playlist
        for (String i : playlist) 
        {
          System.out.println(i);
        }

        // Back to Menu
        HelperClass.Menu();
      }
      else if(playlistType.equals("genre"))
      {
        while(true)
        {
          System.out.println("Enter the name of the artist and song. \nWhen done, type 'done': ");
          String artistName = input.nextLine();
          String songName = input.nextLine();

          //Check if the user wants to end
          if((artistName.equals("done")) || (songName.equals("done")))
          {
            break;
          }

          //Add song to array
          String song = (artistName + ", " + songName);
          playlist.add(song);
        }

        //Display playlist
        for (String i : playlist) 
        {
          System.out.println(i);
        }

        // Back to Menu
        HelperClass.Menu();
      }
      else if(playlistType.equals("mixed-genre"))
      {
        while(true)
        {
          System.out.println("Enter the name of the artist, song, and genre. \nWhen done, type 'done': ");
          String artistName = input.nextLine();
          String songName = input.nextLine();
          String genreName = input.nextLine();

          RecommendedArtists(artistName);

          //Check if the user wants to end
          if((artistName.equals("done")) || (songName.equals("done")) || (genreName.equals("done")))
          {
            break;
          }

          //Add song to array
          String song = (artistName + ", " + songName + ", " + genreName);
          playlist.add(song);
        }

        //Display playlist
        for (String i : playlist) 
        {
          System.out.println(i);
        }

        // Back to Menu
        HelperClass.Menu();
      }
      else
      {
        System.out.println("Invalid option. \nOptions are:\n'general', 'artist', 'genre', or 'mixed-genre'");
        AddRemoveSongs();
      }
    }
    else if(choice.equals("remove"))
    {
      System.out.println("To remove a song from a playlist, enter the name of the playlist: "); 
      String playlistId = input.nextLine();
      ArrayList<String> playlist = GetPlaylist(playlistId);

      System.out.println("Enter the type of playlist:\n('general', 'artist', 'genre', or 'mixed-genre') ");
      String playlistType = input.nextLine();

      if(playlistType.equals("general"))
      {
        while(true)
        {
          System.out.println("Enter the name of the artist, song, and genre. \nWhen done, type 'done': ");
          String artistName = input.nextLine();
          String songName = input.nextLine();
          String genreName = input.nextLine();

          //Check if the user wants to end
          if((artistName.equals("done")) || (songName.equals("done")) || (genreName.equals("done")))
          {
            break;
          }

          //Remove song from array
          String song = (artistName + ", " + songName + ", " + genreName);
          playlist.remove(song);
        }

        // Store Playlist
        StorePlaylist(playlistId, playlist);

        //Display playlist
        for (String i : playlist) 
        {
          System.out.println(i);
        }

        // Back to Menu
        HelperClass.Menu();
      }
      else if(playlistType.equals("artist"))
      {
        while(true)
        {
          System.out.println("Enter the name of the song and genre. \nWhen done, type 'done': ");
          String songName = input.nextLine();
          String genreName = input.nextLine();

          //Check if the user wants to end
          if((songName.equals("done")) || (genreName.equals("done")))
          {
            break;
          }

          //Remove song from array
          String song = (songName + ", " + genreName);
          playlist.remove(song);
        }

        // Store Playlist
        StorePlaylist(playlistId, playlist);

        //Display playlist
        for (String i : playlist) 
        {
          System.out.println(i);
        }

        // Back to Menu
        HelperClass.Menu();
      }
      else if(playlistType.equals("genre"))
      {
        while(true)
        {
          System.out.println("Enter the name of the artist and song. \nWhen done, type 'done': ");
          String artistName = input.nextLine();
          String songName = input.nextLine();

          //Check if the user wants to end
          if((artistName.equals("done")) || (songName.equals("done")))
          {
            break;
          }

          //Remove song from array
          String song = (artistName + ", " + songName);
          playlist.remove(song);
        }

        // Store Playlist
        StorePlaylist(playlistId, playlist);

        //Display playlist
        for (String i : playlist) 
        {
          System.out.println(i);
        }

        // Back to Menu
        HelperClass.Menu();
      }
      if(playlistType.equals("mixed-genre"))
      {
        while(true)
        {
          System.out.println("Enter the name of the artist, song, and genre. \nWhen done, type 'done': ");
          String artistName = input.nextLine();
          String songName = input.nextLine();
          String genreName = input.nextLine();

          RecommendedArtists(artistName);

          //Check if the user wants to end
          if((artistName.equals("done")) || (songName.equals("done")) || (genreName.equals("done")))
          {
            break;
          }

          //Remove song from array
          String song = (artistName + ", " + songName + ", " + genreName);
          playlist.remove(song);
        }

        // Store Playlist
        StorePlaylist(playlistId, playlist);

        //Display playlist
        for (String i : playlist) 
        {
          System.out.println(i);
        }

        // Back to Menu
        HelperClass.Menu();
      }
      else
      {
        System.out.println("Invalid option. \nOptions are:\n'general', 'artist', 'genre', or 'mixed-genre'");
        AddRemoveSongs();
      }
    }
    else
    {
      System.out.println("Invalid option. \nOptions are:\n'add' or 'remove'");
      AddRemoveSongs();
    }
  }

  
  // Display song count
  public static void DisplaySongCount()
  {
    System.out.println("To display the song count of a playlist, enter the type of playlist:\n('general', 'artist', 'genre', or 'mixed-genre') ");
    String playlistType = input.nextLine();

    if(playlistType.equals("general"))
    {
      
      System.out.println("Enter the name of the playlist: ");
      String playlistId = input.nextLine();

      ArrayList<String> playlist = GetPlaylist(playlistId);
      int songCount = playlist.size();

      System.out.println("The song count is: " + songCount);

      // Back to Menu
      HelperClass.Menu();
      
    }
    else if(playlistType.equals("artist"))
    {
      
      System.out.println("Enter the name of the playlist: ");
      String playlistId = input.nextLine();

      ArrayList<String> playlist = GetPlaylist(playlistId);
      int songCount = playlist.size() - 1;

      System.out.println("The song count is: " + songCount);

      // Back to Menu
      HelperClass.Menu();
      
    }
    else if(playlistType.equals("genre"))
    {

      System.out.println("Enter the name of the playlist: ");
      String playlistId = input.nextLine();

      ArrayList<String> playlist = GetPlaylist(playlistId);
      int songCount = playlist.size() - 1;

      System.out.println("The song count is: " + songCount);

      // Back to Menu
      HelperClass.Menu();
    }
    else if(playlistType.equals("mixed-genre"))
    {
      
      System.out.println("Enter the name of the playlist: ");
      String playlistId = input.nextLine();

      ArrayList<String> playlist = GetPlaylist(playlistId);
      int songCount = playlist.size();

      System.out.println("The song count is: " + songCount);

      // Back to Menu
      HelperClass.Menu();
  
    }
    else
    {
      System.out.println("Invalid option. \nOptions are:\n'general', 'artist', 'genre', or 'mixed-genre'");
      DisplaySongCount();
    }
    
  }


  // Display Playist(s)
  public static void DisplayPlaylists()
  {
    System.out.println("To display a playlist, enter the name of the playlist: ");
    String playlistId = input.nextLine();

    ArrayList<String> playlist = GetPlaylist(playlistId);  
    
    for (String i : playlist) 
    {
      System.out.println(i);
    }

    // Back to Menu
    HelperClass.Menu();
  }
  

  // Delete Playlist(s)
  public static void DeletePlaylist()
  {
    System.out.println("To delete a playlist, enter the name of playlist: ");
    String playlistId = input.nextLine();
    
    System.out.println("Are you sure? \n'yes' or 'no'");
    String choice = input.nextLine();

    if(choice.equals("yes"))
    {
      if(playlists.containsKey(playlistId)) 
      {
        playlists.remove(playlistId);
        System.out.println("Playlist deleted: " + playlistId);

        // Back to Menu
        HelperClass.Menu();
      } 
      else 
      {
        System.out.println("Playlist not found: " + playlistId);
      
        // Back to Menu
        HelperClass.Menu();
      }
    }
    else
    {
      // Back to Menu
      HelperClass.Menu();
    }
  }


  // Creates Identifiers for playlist(s)
  public static String generateIdentifier() 
  {
    return "playlist" + playlistCounter++;
  }


  // Store playlist(s)
  public static void StorePlaylist(String playlistId, ArrayList<String> playlist)
  {
    playlists.put(playlistId, playlist);
  }


  // Returns playlist(s)
  public static ArrayList<String> GetPlaylist(String playlistId) 
  {
    ArrayList<String> playlist = playlists.get(playlistId);
    if (playlist == null) 
    {
      System.out.println("Playlist not found: " + playlistId);
    }
    return playlist;
  }


  // Returns Recommended Artist(s)
  public static void RecommendedArtists(String artistName)
  {
    // List of Recommended Artists
    List<String[]> artistList = new ArrayList<>();
    
    String[] genRap = {"nardo wick", "nle choppa", "lil baby", "lil uzi vert", "drake", "kanye west", "travis scott", "lil yatchy"," future", "j. cole", "21 savage", "metro boomin", "gunna", "young thug"};
    artistList.add(genRap);

    String[] undergroundRap = {"kankan", "autumn!", "nettspend", "LUCKI", "summrs", "babytron", "osamason", "rich amiri", "jace!", "dom corleo", "xaviersobased"};
    artistList.add(undergroundRap);

    String[] girlRap = {"sexyy red", "flo milli", "ice spice", "stunna girl", "glorilla",  "monaleo", "lola brooke", "nicki minaj"};
    artistList.add(girlRap);

    String[] opiumRap = {"destroy lonley", "ken carson", "playboi carti", "yeat", "homixide gang", "lil uzi vert"};
    artistList.add(opiumRap);

    String[] emo = {"current joys", "slowdive", "my bloody valentine", "cocteau twins", "salvia palth", "duster", "strawberry guy", "have a nice life", "fugazi", "cults"};
    artistList.add(emo);

    String[] metal = {"limp bizkit", "slipknot", "pierce the veil", "paramore", "falling in reverse", "system of a down", "sleeping with sirens", "korn", "deftones", "my chemical romance", "metallica", "rob zombie", "iron maiden", "megadeth", "black sabbath"};
    artistList.add(metal);

    String[] emoRock = {"jeff buckley", "the smiths", "pixies", "radiohead", "the cure", "morrissey", "echo & the bunnymen", "sonic youth", "the velvet underground", "the smashing pumpkins", "thom yorke", "pavement", "the garden", "weezer"};
    artistList.add(emoRock);

    String[] emoGirl = {"lana del rey", "mitski", "fiona apple", "loving", "cults", "men i trust", "mazzy star", "eyedress", "starwberry guy", "alex g", "cigarettes after sex"};
    artistList.add(emoGirl);

    String[] girlRock = {"lana del rey", "mitski", "the neighborhood", "atric monkeys", "tv girl", "the smiths", "loving", "mazzy star", "radiohead", "car seat headrest"};
    artistList.add(girlRock);

    String[] deepRock = {"the strokes", "artic monkeys", "blur"};
    artistList.add(deepRock);

    String[] midWestEmo = {"title fight", "american football", "the front bottoms"};
    artistList.add(midWestEmo);

    String[] pop = {"ariana grande", "taylor swift", "billie eilish", "olivia rodrigo", "conan gray", "harry styles", "selena gomez"};
    artistList.add(pop);

    String[] indie = {"lovejoy”, wallows", "coin"};
    artistList.add(indie);
    
    // Check if artist is in recommended artists list
    for(String[] recList : artistList) 
    {
      if(Arrays.asList(recList).contains(artistName)) 
      {
        int startIndex = Math.max(0, random.nextInt(recList.length - 2)); // Ensure enough room for three artists
        int endIndex = startIndex + 2;

        System.out.println();
        System.out.println("Recommended Artists: ");

        // Display three random artists
        for(int i = startIndex; i <= endIndex; i++) 
        {
          System.out.print(recList[i] + " ");
          System.out.println();
        }
        System.out.println();
      }
    }
  }
}


