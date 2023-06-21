import java.util.ArrayList;
import java.util.Arrays;

public class ForumPost {

    String author;
    String text;
    int upVotes;
    ArrayList<String> replies = new ArrayList<>();

    public ForumPost(String author, String text, int upVotes) {
        this.author = author;
        this.text = text;
        this.upVotes = upVotes;
    }

    public ForumPost(String author, String text) {
        this.author = author;
        this.text = text;
    }
    public String format(){
        StringBuilder sb = new StringBuilder(String.format("%s / by %s, %d votes. %n", text, author, upVotes));

        if (replies.isEmpty()) {
            return sb.append("- No replies").append(System.lineSeparator()).toString();
        }
        for (String reply: replies) {
            sb.append("- ").append(reply).append(System.lineSeparator());
        }
        return sb.append(System.lineSeparator()).toString();
    }
}
