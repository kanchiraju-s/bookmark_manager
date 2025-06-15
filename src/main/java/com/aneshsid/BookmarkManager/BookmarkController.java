package com.aneshsid.BookmarkManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookmarks")
public class BookmarkController {
	
	@Autowired
	private BookmarkService bookmarkService;
	
	@GetMapping
	public List<Bookmark> getBookmarks(){
		return bookmarkService.getAll();
	}
	
	@PostMapping
	public void addBookmark(@RequestBody Bookmark bookmark) {
		bookmarkService.add(bookmark);
	}
	
	@DeleteMapping
	public void deleteBookmark(@RequestParam String url) {
		bookmarkService.delete(url);
	}

}
