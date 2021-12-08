package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws Exception{
//		io 스트리밍
		
//		원래 try catch 를 써서 파일이 없을 경우를 준비해야하지만 수업을 간결하기 위해 throws Exception 사용(애러는 다음으로 미룬다는뜻)
		
		
		/*
//		파일에 빨대를 댄다
		InputStream in = new FileInputStream("C:\\javaStudy\\workspace\\file\\img.jpg");
		
//		파일 내보내는곳 지정. 같은위치 같은파일이름 조심.
		OutputStream out = new FileOutputStream("C:\\javaStudy\\workspace\\file\\byteimg.jpg");
		
		System.out.println("복사시작");
		
//		파일 끝날떄까지 계속 읽어와라. 끝을 모르는 반복에 while문 
		while (true) {
			int data = in.read(); //파일의 마지막은 -1로 들어오게 되어있기 떄문에 int로 받는다
			
			if (data == -1 ) {
				System.out.println("복사 완료되었습니다."+data); //data에 -1이 찍힐것 
				break;
			}
			out.write(data);
		}
		
		System.out.println("파일이 없습니다");
		*/
		
		
//		복사속도가 너무 느리니까 byte 배열을 이용해서 속도 상승

//		파일에 빨대를 댄다
		InputStream in = new FileInputStream("C:\\javaStudy\\workspace\\file\\img.jpg");
		
//		파일 내보내는곳 지정. 같은위치 같은파일이름 조심.
		OutputStream out = new FileOutputStream("C:\\javaStudy\\workspace\\file\\byteimg.jpg");
		
		
		
//		int[] intArray = new int[3];
		byte[] buff = new byte[1024]; //1024만큼 복사할 데이터를 좀더 한꺼번에 처리 
		
		System.out.println("복사시작");
		
		while(true) {
//			복사할 데이터를 buff에 왕창 담아라 
			int data = in.read(buff);
			
			if (data == -1) {
				System.out.println("복사가 끝났습니다"+data);
				break;
			}
			out.write(buff);
		}
		
		
//		파일 빨대 꼿았으면 빼는 명령어도 넣어둘것
		in.close();
		out.close();
		
		
	}

}
