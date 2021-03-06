package nl.pa3bmg.els.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import nl.pa3bmg.els.model.Book;
import nl.pa3bmg.els.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

	@Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public void delete(Book book) {
        bookRepository.delete(book);
    }

    public Book findOne(String id) {
    		return bookRepository.findById(id).get();
    }

    public Iterable<Book> findAll() {
    		System.out.println("Books findAll");
    		List<Book> books = new ArrayList<>();
    		Iterable<Book> result = bookRepository.findAll();
    		result.forEach(books::add);
    		for (Book book : books) {
    			System.out.println(book.getAuthor());
    		}
        return result;
    }

    public Page<Book> findByAuthor(String author, PageRequest pageRequest) {
        return bookRepository.findByAuthor(author, pageRequest);
    }

    public List<Book> findByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

}
