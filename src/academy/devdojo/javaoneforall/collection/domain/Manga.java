package academy.devdojo.javaoneforall.collection.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String title;
    private double price;
    private int quantity;

    public Manga(Long id, String title, double price, int quantity) {
        this(id, title, price);
        this.quantity = quantity;
    }

    public Manga(Long id, String title, double price) {
        Objects.requireNonNull(id, "Manga id must not be null");
        Objects.requireNonNull(title, "Manga title must not be null");
        this.id = id;
        this.title = title;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(title, manga.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Manga other) {
//        if(this.id < other.id) return -1;
//        else if(this.id.equals(other.id)) return 0;
//        else if(this.id > other.id) return 1;
//        return 0;
//        return this.id.compareTo(other.id);
        return this.title.compareTo(other.title);
//        return Double.compare(this.price, other.price);
    }
}
