package nl.pa3bmg.els.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Getter;
import lombok.Setter;

@Document(indexName = "pa3bmg", type = "books")
public class Book {
	@Id
    @Getter @Setter private String id;
	@Getter @Setter private String title;
	@Getter @Setter private String author;
	@Getter @Setter private String releaseDate;

    public Book() {
    }

    public Book(String id, String title, String author, String releaseDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
    }
    
    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
