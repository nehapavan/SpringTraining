package com.evoke.auditing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.evoke.auditing.entity.OnlineBookStoreApp;
import com.evoke.auditing.service.AuditService;

@RestController
public class AuditController {
	@Autowired
	private AuditService auditService;

	@GetMapping("/getallBookdetails")
	public List<OnlineBookStoreApp> getAllBookDetails() {
		return auditService.getAllBookDetails();

	}

	@PostMapping("/createBook")
	public OnlineBookStoreApp createBook(@RequestBody OnlineBookStoreApp bookStore) {
		return auditService.createBook(bookStore);

	}

	@PutMapping("/updateBook")
	public OnlineBookStoreApp updateBook(@RequestBody OnlineBookStoreApp bookStore) {
		return auditService.updateBook(bookStore);

	}

	@DeleteMapping("/deleteBook/{bookId}")
	public String deleteBook(@PathVariable int bookId) {
		auditService.deleteBook(bookId);
		return "In bookStoreApp with bookId " + bookId + "  is deleted successfully..";

	}
}
