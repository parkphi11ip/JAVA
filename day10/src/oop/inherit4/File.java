package oop.inherit4;

public class File {

	private String filename;
	private int filesize;

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public int getFilesize() {
		return filesize;
	}

	public void setFilesize(int filesize) {
		this.filesize = filesize;
	}
	public void execute() {
		System.out.println("execute :: ");
	}
	
}
