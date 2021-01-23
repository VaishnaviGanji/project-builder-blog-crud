package service;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import model.Blog;

public class CRUDOperations {
	static List<Blog> list=new ArrayList<Blog>(); // Store the blog in the list
	
	public List<Blog> addBlog(Blog blog) throws IOException {
		list.add(blog);
		return list;
	}
	
	public List<Blog> viewBlog(Blog blog) throws IOException{
		list.add(blog);
		for(Blog bg : list) {
			System.out.println(bg);
		}
		return list;
		
	}
	
	public List setSortByTitle(List<Blog> blogs) {
		blogs.sort((Blog b1,Blog b2)->b1.getBlogTitle().compareTo(b2.getBlogTitle()));
		return blogs;
	}
	
	public List mapSortByTitle(List<Blog> blogs) {
		TreeMap<String, Blog> map = new TreeMap<String, Blog>();
		for (Blog bg : blogs) {
			map.put(bg.getBlogTitle(), bg);
		}
		return (List)map.values();
	}
	
	public List mapSortByDate(List<Blog> blogs) {
		TreeMap<LocalDate, Blog> map = new TreeMap<LocalDate, Blog>();
		for (Blog bg : blogs) {
			map.put(bg.getDate(), bg);
		}
		return (List)map.values();
	}
	
	public List setSortByDate(List<Blog> blogs) {
		blogs.sort((Blog b1,Blog b2)->b1.getDate().compareTo(b2.getDate()));
		return blogs;
	}
	
	public List<Blog> updateBlog(Blog blog) throws IOException{
		return null;
	
	}
	public List<Blog> deleteBlog(Blog blog) throws IOException{
		return null;
		
	}
}
