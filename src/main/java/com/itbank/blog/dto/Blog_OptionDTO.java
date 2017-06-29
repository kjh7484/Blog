package com.itbank.blog.dto;

public class Blog_OptionDTO {
	private String id;  //아이디
	private String blogname; //블로그 이름
	private int layout; //블로그 레이아웃 옵션
	private String profile; //블로그 프로필 이미지
	private String background; //블로그 배경화면 이미지
	private String header; //블로그 헤더 이미지
	private String nickname; //블로그에 사용할 별명
	private String introduce; //블로그 소개글
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBlogname() {
		return blogname;
	}
	public void setBlogname(String blogname) {
		this.blogname = blogname;
	}
	public int getLayout() {
		return layout;
	}
	public void setLayout(int layout) {
		this.layout = layout;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getBackground() {
		return background;
	}
	public void setBackground(String background) {
		this.background = background;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	
}