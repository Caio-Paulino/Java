package academy.devdojo.javaoneforall.inicializationblock.domain;

public class Anime {
    private String name;
    private int[] episodes;

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
