package bg.softuni.books.model.dto.book;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;



public class EditBookDTO {

    private Long id;


    private String title;


    private String author;


    private String publisher;


    private String isbn;


    private BigDecimal price;

    private MultipartFile imageUrl;


    public EditBookDTO() {
    }

    public String getTitle() {
        return title;
    }

    public EditBookDTO setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public EditBookDTO setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getPublisher() {
        return publisher;
    }

    public EditBookDTO setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public EditBookDTO setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public MultipartFile getImageUrl() {
        return imageUrl;
    }

    public EditBookDTO setImageUrl(MultipartFile imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getIsbn() {
        return isbn;
    }

    public EditBookDTO setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public Long getId() {
        return id;
    }

    public EditBookDTO setId(Long id) {
        this.id = id;
        return this;
    }
}
