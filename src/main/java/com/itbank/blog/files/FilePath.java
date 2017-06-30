package com.itbank.blog.files;

import java.io.File;

public class FilePath {

	public void FilePath(){
		File dir = new File(this.getClass().getResource("").getPath());
		File profile =  new File(dir,"profile");
	}
}
