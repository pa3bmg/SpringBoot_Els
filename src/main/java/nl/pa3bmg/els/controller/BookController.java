package nl.pa3bmg.els.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import nl.pa3bmg.els.service.BookService;

@Controller
public class BookController {
	BookService bookService;
	
	public BookController(BookService _bookService) {
		bookService = _bookService;
	}
	
	@RequestMapping({"/books"})
    public String getBook(Model model) {
		model.addAttribute("books",bookService.findAll());
		return "books";
	}
}
