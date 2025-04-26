package academy.devdojo.javaoneforall.staticmodifier.domain;

public class Anime {
    private String name;
    private int[] episodes;
    // 0 - Static init block is executed when JVM loads the class and only once
    // 1 - Memory allocated
    // 2 - Each class atribute is initialized
    // 3 - init block is executed
    // 4 - the constructor is executed

    {
        System.out.println("Hello world");
    }

    public Anime() {
        episodes = new int[100];

        for(int i = 0; i < episodes.length; i++) {
            episodes[i] = i+1;
        }

        for(int episode: episodes) {
            System.out.print(episode + " ");
        }
    }
}
