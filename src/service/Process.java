package service;

import java.util.Scanner;

import player.Joueur;

public class Process {
	private Joueur joueur;
	
	public Process(Joueur j) {
		this.joueur = j;
		
	}
	
	/*
	 *进入
	 * */
	public void start() {
		
		//测试代码 ，用后删除！！！
		System.out.println("玩家" + this.joueur.getNumj());
		joueur.choisirUneOperation();
		joueur.setDone(true);
		pass();
	}
	public void pass() {
		if(joueur.getNextJoueur().isDone() == false) {
			joueur.getNextJoueur().process();
		}
	}
	
}




















