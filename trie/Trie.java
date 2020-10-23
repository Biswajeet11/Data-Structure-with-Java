package com.myjavapractce;


public class Trie {
	
	static final int alphabetsize=26;
	
	static class TrieNode{
		
		TrieNode[] children=new TrieNode[alphabetsize];
		boolean isEndOfWord=false;
		public TrieNode() {
			for(int i=0;i<alphabetsize;i++) {
				children[i]=null;
				
			}
		}
	}
	
		static TrieNode root;
		
		static void insert(String key) {
			int level;
			int length=key.length();
			int index;
			
			TrieNode pcrawl =root;
			
			for(level=0;level<length;level++) {
				index=key.charAt(level)-'a';
				if(pcrawl.children[index]==null) {
					pcrawl.children[index]=new TrieNode();
					pcrawl=pcrawl.children[index];
				}
				pcrawl.isEndOfWord=true;
			}
		}
			
			static boolean search(String key) {
				int level;
				int length =key.length();
				int index;
				TrieNode pcrawl=root;
				
				for(level=0;level<length;level++) {
					index=key.charAt(level)-'a';
					if(pcrawl.children[index]==null) {
						return false;
				}
					pcrawl=pcrawl.children[index];
					}
				
				return (pcrawl!=null && pcrawl.isEndOfWord);
			}
			
			
			public static void main(String args[])
		    {
		        String keys[] = {"the", "a", "there", "answer", "any"};
		        String output[] = {"Not present in trie ", "Present in trie "};
		        root = new TrieNode();
		        int i;
		        for (i = 0; i < keys.length ; i++)
		            insert(keys[i]);
		        if(search("the") == true)
		            System.out.println("the " + output[1]);
		        else System.out.println("the " + output[0]);
		         
		        if(search("these") == true)
		            System.out.println("these " + output[1]);
		        else System.out.println("these " + output[0]);
		        
		        if(search("their") == true)
		            System.out.println("their " + output[1]);
		        else System.out.println("their " + output[0]);
		                
		    }
		}
			
		
	