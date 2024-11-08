package bg.softuni.books.model.dto.book;

import java.time.LocalDate;

public class ReviewViewDTO {
    private Long id;

    private Long userId;

    private String userUsername;

    private String comment;

    private int rating;

    private LocalDate created;

    public ReviewViewDTO() {}

    public String getUserUsername() {
        return userUsername;
    }

    public ReviewViewDTO setUserUsername(String userUsername) {
        this.userUsername = userUsername;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public ReviewViewDTO setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public int getRating() {
        return rating;
    }

    public ReviewViewDTO setRating(int rating) {
        this.rating = rating;
        return this;
    }

    public LocalDate getCreated() {
        return created;
    }

    public ReviewViewDTO setCreated(LocalDate created) {
        this.created = created;
        return this;
    }

    public Long getId() {
        return id;
    }

    public ReviewViewDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public ReviewViewDTO setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
}
