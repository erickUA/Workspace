package cl.curso.java.guia9;

import java.util.Scanner;

public class Libro {

	private String nombre;
	private String autor;
	private String editorial;
	private String isbn;
	/**
	 * 
	 */
	public Libro() {
	}
	
	/**
	 * @param nombre
	 * @param autor
	 * @param editorial
	 * @param isbn
	 */
	public Libro(String nombre, String autor, String editorial, String isbn) {
		this.nombre = nombre;
		this.autor = autor;
		this.editorial = editorial;
		this.isbn = isbn;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the editorial
	 */
	public String getEditorial() {
		return editorial;
	}

	/**
	 * @param editorial the editorial to set
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public void verificarISbn()
	{
		
		
		String subsIsbn = " ";
		String dverificador= " ";
		int residuo= 0;
		int checksum = 0;
		
		do{
			
			
			subsIsbn = this.getIsbn().split("-")[0];
			dverificador = this.getIsbn().split("-")[1];
			
			int numMulti = 10;
			int resultMulti = 0;
			for (int i = 0; i < subsIsbn.length(); i++)
			{
				
				resultMulti = resultMulti+(Integer.parseInt(""+subsIsbn.charAt(i))*numMulti);
				numMulti--;
				
			}
			
			
			residuo = resultMulti%11;
			checksum = 11-residuo;
			if(this.getIsbn().length()<10 || this.getIsbn().length()>11)
			{
				System.out.println("Error, El ISBN es incorrecto.");
			}
			else
			{
				if(residuo == 0)
				{
					System.out.println("Checksum del ISBN es:"+residuo);
				}
				else
				{
					if(residuo !=0 )
					{
						
						System.out.println("Checksum del ISBN es:"+checksum);
					}
				}
				if(checksum ==10)
				{
					System.out.println("Checksum del ISBN es:"+checksum+"X");
				}
			}
			
			
		}while(isbn.length()!=11);
		
	}
	
	public String toString()
	{
		return "\nLibro"
			+"\nNombre del Libro: "+getNombre()
			+"\nNombre autor: "+getAutor()
			+"\nNombre editorial: "+getEditorial()
			+"\nISBN: "+getIsbn();
	}
}
