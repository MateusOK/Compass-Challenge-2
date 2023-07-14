package br.com.pb.compasso.library.entity;

import br.com.pb.compasso.library.dto.request.BookResquestDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "book")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "book_title")
    private String bookTitle;

    @Column(name = "author")
    private String author;

    @Column(name = "release_date")
    private String releaseDate;

    @Column(name = "pages")
    private Integer pages;

    @Column(name = "rating")
    private Double rating;

    @Column(name = "genre")
    private String genre;

    public Book(BookResquestDto request){
        this.bookTitle = request.bookTitle();
        this.author = request.author();
        this.releaseDate = request.releaseDate();
        this.pages = request.pages();
        this.rating = request.rating();
        this.genre = request.genre();
    }

}
