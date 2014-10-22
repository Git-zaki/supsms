package com.supinfo.GameOfLife;

import java.util.*;
import java.io.*;
 
public class GameOfLife 
{
	int l=20,b=60;
	public static void main(String[] args)
	{
		GameOfLife now=new GameOfLife();
		now.setGame();
	}
	void setGame()
	{
		char[][] config=new char[l][b];
		startGame(config,l,b);
	}
	void startGame(char[][] mat,int l, int b)
	{
		Scanner s=new Scanner(System.in);
		String ch="";
		float per=0;
		while(!ch.equals("y"))
		{
			per=setConfig(mat);
			display2D(mat);
		}
		
		
	}
 
	
	float setConfig(char[][] arr)
	{
                float per=0.10f;
		for(int i=0;i<arr.length;i++)
			setConfig1D(arr[i],per);
		return per;
	}
	void setConfig1D(char[] arr,float per)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(Math.random()<per)
				arr[i]='°';
			else
				arr[i]='_';
		}
	}
	
        void display2D(char[][] arr)
	{
		for(int i=0;i<arr.length;i++)
			display1D(arr[i]);
		System.out.println();
	}
	
        void display1D(char[] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]);
		System.out.println();
	}
}
 