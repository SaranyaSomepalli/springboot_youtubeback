package com.example.demo.repositiory;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Video;

public interface VideoRepositiory extends CrudRepository<Video,Integer> {
		public Iterable<Video> deleteByVideoTitle(String videoTitle);
		public Video findByVideoTitle(String videoTitle);
		public Video findById(int id);
	//	public Video findById(int id);
}
