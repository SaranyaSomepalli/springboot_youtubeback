package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Video;
import com.example.demo.repositiory.VideoRepositiory;

@Service
public class VideoService {
	
	@Autowired
	private VideoRepositiory repo;
	
	public VideoService() {}
	
	public VideoService(VideoRepositiory repo) {
		super();
		this.repo = repo;
	}
	
	public void saveMyVideo(Video video) {
		repo.save(video);
	}
	
	public Iterable<Video> showAllVideos(){
		return repo.findAll();
	}
	
	public Iterable<Video> deleteByVideoTitle(String videoTitle){
		repo.deleteByVideoTitle(videoTitle);
		return repo.findAll();
	}
	
	public Video findByVideoTitle(String videoTitle) {
		return repo.findByVideoTitle(videoTitle);
	}
	
		public Video findById(int id) {
		return repo.findById(id);
	}
}
