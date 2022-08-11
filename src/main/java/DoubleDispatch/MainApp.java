package DoubleDispatch;

import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Post> posts = Arrays.asList(new Text(), new Picture());
        List<Sns> sns = Arrays.asList(new Instagram(), new Twitter());

        posts.forEach(post -> sns.forEach(post::postOn));
    }
}
