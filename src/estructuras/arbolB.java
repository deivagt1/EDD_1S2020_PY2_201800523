/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

/**
 *
 * @author David
 */
public class arbolB {

    public nodoArbolB raiz;
    public int minimo;
    String encabezado;

    // Constructor (Initializes tree as empty) 
    public arbolB(int minimo) {
	
	this.raiz = null;
	this.minimo = minimo;
    }

    // function to traverse the tree 
    public void atravesar() {
	if (this.raiz != null) {
	    this.raiz.atravesar();
	}
	
    }
    
        public void imprimir() {
	if (this.raiz != null) {
	   String a = "digraph G { \nnode [shape = record,height=.1];\n";
	   String b = "";
	     b += this.raiz.imprimir(b, 0);
	   System.out.println(a+b);
	}
	
    }

    // function to search a key in this tree 
    public nodoArbolB buscar(int id) {
	if (this.raiz == null) {
	    return null;
	} else {
	    return this.raiz.buscar(id);
	}
    }

     public void insertar(libro nuevoLibro) {
	if (raiz == null) {
	    raiz = new nodoArbolB(minimo, true);
	    raiz.libros[0] = nuevoLibro;
	    raiz.cantidad = 1;
	} else {
	    if (raiz.cantidad == 2*minimo -1) {
		nodoArbolB temp = new nodoArbolB(minimo, false);
		temp.hijos[0] = raiz;
		temp.partir(0, raiz);
		
		int i = 0;
		if(temp.libros[0].isbn < nuevoLibro.isbn){
		    i++;
		}
		
		temp.hijos[i].insertarMedioLleno(nuevoLibro);
		
		raiz = temp;
	    }else{
		raiz.insertarMedioLleno(nuevoLibro);
	    }

	}
    }

     public void borrar(int isbn){
	if(raiz == null){
	    System.out.println("El arbol esta vacio");
	    return;
	}
	
	raiz.borrar(isbn);
	if(raiz.cantidad == 0){
	    nodoArbolB temp = raiz;
	    if(raiz.esHoja == true){
		raiz = null;
	    }
	    else{
		raiz = raiz.hijos[0];
	    }
	}
    }
     
  
     
}
