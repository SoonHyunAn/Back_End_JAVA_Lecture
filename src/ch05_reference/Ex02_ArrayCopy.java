package ch05_reference;

import java.util.Arrays;

public class Ex02_ArrayCopy {

	public static void main(String[] args) {
		int src[] = {1, 2, 4, 8};
		int[] dst = src;
		System.out.println(Arrays.toString(dst));
		
		
		
		dst[2] = 5;
		System.out.println(Arrays.toString(dst));
		System.out.println(Arrays.toString(src)); // side Effect : 원치않은 src의 내용도 바뀜
		
		
		
		int[] newSrc = {3, 4, 7, 9};
		int[] newDst = new int[4];
		System.arraycopy(newSrc, 0, newDst, 0, newSrc.length);
		System.out.println(Arrays.toString(newDst));
		
		newDst[2] = 15;
		System.out.println(Arrays.toString(newDst));
		System.out.println(Arrays.toString(newSrc)); // 안바뀜

		
	}

}
