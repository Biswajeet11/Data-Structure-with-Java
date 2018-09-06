package com.myjavapractce;

public class MergeSort {
	
	public void mergesort(int input[]) {
		int mid=(input.length)/2;
		 int arr1[] =new int[mid];
		 int arr2[]=new int[(input.length)-(mid)];
		for(int i=0;i<mid;i++) {
			arr1[i]=input[i];
		}
		int k=0;
		for(int j=mid+1;j<input.length;j++) {
			arr2[k]=input[j];
			k++;
		}
		
		mergesort(arr1);
		mergesort(arr2);
		merge(input,arr1, arr2);
	}
	
	public void merge(int output[],int arr1[],int arr2[]) {
		
		int i = 0,j=0,k=0;
		while(i<arr1.length && j<arr2.length) {
		if(arr1[i]<arr2[j]) {
			output[k]=arr1[i];
			i++;
			k++;
			}
		else {
			output[k]=arr2[j];
			j++;
			k++;
			}
		}
		while(i<arr1.length) {
			output[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			output[k]=arr2[j];
			j++;
			k++;
		}
	}
	public void display(int a1[],int size) {
		for(int i=0;i<size;i++) {
			System.out.print(a1[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		MergeSort a=new MergeSort();
		int input[]= {1,24,67,8,9,10};
	
		a.mergesort(input);
		

	}

}
