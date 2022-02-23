package com.evoke.auditing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.evoke.auditing.entity.OnlineBookStoreApp;
import com.evoke.auditing.repo.AuditBookRepo;

@Service
public class AuditService {
	@Autowired
	private AuditBookRepo auditRepo;

	public List<OnlineBookStoreApp> getAllBookDetails() {
		return auditRepo.findAll();

	}

	public OnlineBookStoreApp createBook(OnlineBookStoreApp bookStore) {
		return auditRepo.save(bookStore);

	}

	public OnlineBookStoreApp updateBook(OnlineBookStoreApp bookStore) {
		return auditRepo.save(bookStore);
	}

	public String deleteBook(int bookId) {
		 auditRepo.deleteById(bookId);
		return "In bookStoreApp with bookId "+bookId + "  is deleted successfully..";

	}
}
