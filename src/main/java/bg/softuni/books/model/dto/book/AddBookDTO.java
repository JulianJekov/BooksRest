package bg.softuni.books.model.dto.book;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;


public class AddBookDTO {


    private String title;

    private String author;

    private String publisher;

    private BigDecimal price;

    private MultipartFile imageUrl;


    public AddBookDTO() {
    }

    public String getTitle() {
        return title;
    }

    public AddBookDTO setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public AddBookDTO setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getPublisher() {
        return publisher;
    }

    public AddBookDTO setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public AddBookDTO setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public MultipartFile getImageUrl() {
        return imageUrl;
    }

    public AddBookDTO setImageUrl(MultipartFile imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
}
