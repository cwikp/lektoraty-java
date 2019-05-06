package lab3;

public class HomeworkArrays {

    public static void main(String[] args) {
        String[] youtubers = {"PewDiePie", "T-Series", "WWE", "Smosh", "nigahiga", "5-Minute Crafts", "Justin Bieber"};

        for (String youtuber : youtubers){
            System.out.println(youtuber.toUpperCase() + " " + youtuber.length());
        }
        String longestYoutuberName = "";

        for (String youtuber : youtubers){
           if (youtuber.length() > longestYoutuberName.length()){
               longestYoutuberName = youtuber;
            }
        }
        System.out.println("Longest youtuber name: '" + longestYoutuberName + "' contains " + longestYoutuberName.length() + " chars");
    }
}
