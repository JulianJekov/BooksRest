package bg.softuni.books.web;

import bg.softuni.books.model.dto.book.AddBookDTO;
import bg.softuni.books.model.dto.book.AllBooksDTO;
import bg.softuni.books.model.dto.book.BookDTO;
import bg.softuni.books.model.dto.book.BookDetailsDTO;
import bg.softuni.books.service.BookService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/details/{id}")
    public ResponseEntity<BookDetailsDTO> getBook(@PathVariable Long id) {
        return ResponseEntity.ok(bookService.findBookById(id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<BookDTO> deleteBook(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/all")
    public ResponseEntity<Page<AllBooksDTO>> getAllBooks(@PageableDefault(size = 3, sort = "id") Pageable pageable) {
        return ResponseEntity.ok(bookService.findAllBooks(pageable));
    }

    @PostMapping(value = "/add", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<AddBookDTO> addBook(@ModelAttribute AddBookDTO addBookDTO) throws IOException {
        bookService.createBook(addBookDTO);
        return ResponseEntity.ok().build();
    }

}
