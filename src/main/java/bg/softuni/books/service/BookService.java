package bg.softuni.books.service;

import bg.softuni.books.model.dto.book.AddBookDTO;
import bg.softuni.books.model.dto.book.AllBooksDTO;
import bg.softuni.books.model.dto.book.BookDetailsDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.IOException;

public interface BookService {

    void createBook(AddBookDTO addBookDTO) throws IOException;
    Page<AllBooksDTO> findAllBooks(Pageable pageable);
    void deleteBook(Long id);
    BookDetailsDTO findBookById(Long id);
}
