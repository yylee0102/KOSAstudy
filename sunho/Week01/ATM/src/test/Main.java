package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arrNum = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0;i<n;i++) {
			arrNum[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arrNum);
		int[] temp = new int[n];
		int sum = 0;
		for (int i=0;i<n;i++) {
			sum = arrNum[i] + sum;
			temp[i] = sum;
		}
		sum = 0;
		for (int i : temp) {
			sum += i;
		}
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
	}

}