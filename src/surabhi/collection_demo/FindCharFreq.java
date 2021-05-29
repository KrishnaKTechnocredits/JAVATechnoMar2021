package surabhi.collection_demo;

import java.util.HashMap;

public class FindCharFreq {
	
	void getFrequencyOfChars(String str) {
		char[] ch=str.toCharArray();
		char maxch=' ';
		int count=0;
		HashMap<Character, Integer> hm=new HashMap<Character,Integer>();
		for(int index=0;index<ch.length;index++) {
			char letter=ch[index];
			if(hm.containsKey(letter)) {
				hm.put(letter, hm.get(letter)+1);
				if(count<hm.get(letter)) {
					count=hm.get(letter);
					maxch=letter;
				}
			}else {
				hm.put(letter, 1);
			}
		}
		System.out.println(hm);
		System.out.println(maxch+"-> "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FindCharFreq().getFrequencyOfChars("surabshisastasl");

	}

}
