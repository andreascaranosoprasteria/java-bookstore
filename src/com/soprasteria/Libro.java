package com.soprasteria;

import java.util.Scanner;

public class Libro {
	
	static Scanner sc = new Scanner(System.in);		//Oggetto della classe Scanner per acquisizione da tastiera.
	public static void main(String[] args) {
		String isbn;						//contiene l'identificativo univoco
		String title;						//titolo del libro
		String author;						//autore del libro
		int availability;					//disponibilità di copie del libro
		boolean isAvailable;				//il libro è disponibile?
		float price = 30.00f;						//prezzo del libro
		float sale;
		//acquisizione dei dati
		System.out.print("Inserisci ISBN del libro: -->");
		isbn = sc.nextLine();
		System.out.print("\n Inserisci il titolo: -->");
		title = sc.nextLine();
		System.out.print("\n Inserisci l'autore: -->");
		author = sc.nextLine();
		System.out.print("\n Inserisci disponibilità: -->");
		availability = sc.nextInt();
		
		sale = (price* 20) /100 ; //assegnazione sconto.
		price -= sale;
		if(availability > 0) isAvailable = true;
		else isAvailable = false;
		
		if(isAvailable == true)System.out.println("/n/n>>Il prodotto è disponibile!");
		else System.out.println("\n\n>>Il prodotto non è disponibile!<<");
		
	}

}
