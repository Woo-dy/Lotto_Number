package com.ict.day16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lotto_Number {
	public static void main(String[] args) {
		// 로또 생성기 (5줄, 보너스 번호)
		
		for (int i = 1; i < 6; i++) {
			Set<Integer> lottoNum = new HashSet<Integer>();
			
			while (lottoNum.size() < 6) {
				int number = (int)(Math.random()*45) + 1 ; // 1부터 45
				lottoNum.add(number);
			}
			
			int bonusNum = (int)(Math.random()*45) + 1 ; // 1부터 45
			
		
			
			if (lottoNum.contains(bonusNum)) {
				i--;
				continue;
			} 
			
			//System.out.println(lottoNum);
			
			System.out.println("로또번호 " + i + " : " + lottoNum + " + bonus : " + bonusNum);
		}
		
		
	}
}
