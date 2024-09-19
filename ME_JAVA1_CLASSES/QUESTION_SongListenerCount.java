import java.util.*;

class Solution {
    String title;
    String artist;
    int songListnerCount;

    public Solution(String title, String artist){
       this.title = title;
       this.artist = artist;
    }

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public int howMany(int num){
       return this.songListnerCount = songListnerCount + num;
    }

    public static void main(String args[]) {
        Solution hikaruNara = new Solution("Hikaru Nara", "Goose House");
        assert hikaruNara.getArtist().equals("Goose House") : "Expect \"Goose House\" for getArtist() when Solution = [\"Hikaru Nara\", \"Goose House\"]";
        assert hikaruNara.getTitle().equals("Hikaru Nara") : "Expect \"Hikaru Nara\" for getTitle() when Solution = [\"Hikaru Nara\", \"Goose House\"]";
        assert hikaruNara.howMany(5) == 5 : "howMany for Hikaru Naru => 3";
        assert hikaruNara.howMany(22) == 27 : "howMany for Hikaru Naru => 27";

        System.out.println("All test cases in main function passed");

    }
}

