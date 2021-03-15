package com.example.demo.Controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Video;
import com.example.demo.service.VideoService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private VideoService service;
	
	@PostMapping("/save-video")
	@Transactional
	@CrossOrigin(origins = "http://localhost:4200")
	public String createVideo(@RequestBody Video video) {
		service.saveMyVideo(video);
		return "Hello"+video.getVideoTitle()+"success";
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/all-videos")
	public Iterable<Video> showAllVideos(){
		return service.showAllVideos();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/delete/{videoTitle}")
	@Transactional
	public Iterable<Video> deleteVideo(@PathVariable String videoTitle){
		return service.deleteByVideoTitle(videoTitle);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/search/{videoTitle}")
	public Video searchVideo(@PathVariable String videoTitle) {
		return service.findByVideoTitle(videoTitle);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/find/{id}")
	public Video searchVideo(@PathVariable int id) {
		return service.findById(id);
	}
	
	/*@PutMapping("/video/{id}")
	  Video replaceVideo(@RequestBody Video newVideo, @PathVariable int id) {
	    
	    return service.findById(id)
	      .map(video -> {
	        video.setVideoTitle(newVideo.getVideoTitle());
	        video.setChannelName(newVideo.getChannelName());
	        video.setViews(newVideo.getViews());
	        video.setDuration(newVideo.getDuration());
	        video.setTime(newVideo.getTime());
	        return service.save(video);
	      })
	      .orElseGet(() -> {
	    	  newVideo.setId(id);
	        return service.save(newVideo);
	      });
	  }*/
}
