package com.javaex.ex02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws Exception{

		InputStream in = new FileInputStream("C:\\javaStudy\\workspace\\file\\img.jpg");
		BufferedInputStream bin = new BufferedInputStream(in);
		
		OutputStream out = new FileOutputStream("C:\\javaStudy\\workspace\\file\\bufferedimg.jpg");		
		BufferedOutputStream bout = new BufferedOutputStream(out); 
		
		
		while (true) {
			int data = bin.read();
			if (data == -1) {
				System.out.println("복사가 종료되었습니다"+data);
				break;
			}
			bout.write(data);
		}
		
		
		bin.close(); //in.close(); 포함
		bout.close(); //bout.close(); 포함
		
	}

}
