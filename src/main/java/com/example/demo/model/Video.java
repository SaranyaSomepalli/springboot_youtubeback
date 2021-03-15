package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mytable")

public class Video {
	
		@Id
		private int id;
		private String videoTitle;
		private String channelName;
		private String views;
		private String duration;
		private String time;
		
		public Video() {}
		
		public Video(int id,String videoTitle, String channelName, String views, String duration, String time) {
			super();
			this.id=id;
			this.videoTitle = videoTitle;
			this.channelName = channelName;
			this.views = views;
			this.duration = duration;
			this.time = time;
		}
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public String getVideoTitle() {
			return videoTitle;
		}
		public void setVideoTitle(String videoTitle) {
			this.videoTitle = videoTitle;
		}
		public String getChannelName() {
			return channelName;
		}
		public void setChannelName(String channelName) {
			this.channelName = channelName;
		}
		public String getViews() {
			return views;
		}
		public void setViews(String views) {
			this.views = views;
		}
		public String getDuration() {
			return duration;
		}
		public void setDuration(String duration) {
			this.duration = duration;
		}
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}

		
		
}
