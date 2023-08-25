import entities.Comment;
import entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip! ");
        Comment c2 = new Comment( "Wow that's awesome! ");
        LocalDateTime moment = LocalDateTime.parse("21/06/2018 13:05:44", format);
        Post p1 = new Post(
                moment,
                "Traveling to new Zealand",
                "I'm going to visit this wonderful country!",
                12);
        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);




    }
}