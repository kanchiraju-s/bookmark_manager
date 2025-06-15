package com.aneshsid.BookmarkManager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookmarkService { 
	private final List<Bookmark> bookmarks = new ArrayList<>();
	
	public List<Bookmark> getAll() {
        return bookmarks;
    }

    public void add(Bookmark bookmark) {
        bookmarks.add(bookmark);
    }

    public void delete(String url) {
        bookmarks.removeIf(b -> b.getUrl().equals(url));
    }
	
}
