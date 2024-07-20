package bg.softuni.books.service.impl;

import bg.softuni.books.exceptions.ObjectNotFoundException;
import bg.softuni.books.model.dto.book.AddBookDTO;
import bg.softuni.books.model.dto.book.AllBooksDTO;
import bg.softuni.books.model.dto.book.BookDetailsDTO;
import bg.softuni.books.model.entity.Book;
import bg.softuni.books.repository.BookRepository;
import bg.softuni.books.service.BookService;
import bg.softuni.books.util.ISBNUtil;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final ModelMapper modelMapper;
    private final ImageCloudService imageCloudService;

    public BookServiceImpl(BookRepository bookRepository, ModelMapper modelMapper, ImageCloudService imageCloudService) {
        this.bookRepository = bookRepository;
        this.modelMapper = modelMapper;
        this.imageCloudService = imageCloudService;
    }

    @Override
    public void createBook(AddBookDTO addBookDTO) throws IOException {
        Book book = modelMapper.map(addBookDTO, Book.class);
        book.setIsbn(ISBNUtil.generateISBN());
        book.setImageUrl(imageCloudService.uploadImg(addBookDTO.getImageUrl()));
        bookRepository.save(book);
    }

    @Override
    public Page<AllBooksDTO> findAllBooks(Pageable pageable) {
        return bookRepository.findAll(pageable)
                .map(book -> modelMapper.map(book, AllBooksDTO.class));
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public BookDetailsDTO findBookById(Long id) {
        return bookRepository.findById(id).map(book -> modelMapper.map(book, BookDetailsDTO.class))
                .orElseThrow(() -> new ObjectNotFoundException("Not Found"));
    }

}
