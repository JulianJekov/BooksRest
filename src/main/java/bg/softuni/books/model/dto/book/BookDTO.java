package bg.softuni.books.model.dto.book;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;


public class BookDTO {


    private String title;

    private String author;

    private String publisher;

    private BigDecimal price;

    private MultipartFile imageUrl;


    public BookDTO() {
    }

    public String getTitle() {
        return title;
    }

    public BookDTO setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public BookDTO setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getPublisher() {
        return publisher;
    }

    public BookDTO setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BookDTO setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public MultipartFile getImageUrl() {
        return imageUrl;
    }

    public BookDTO setImageUrl(MultipartFile imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
}
