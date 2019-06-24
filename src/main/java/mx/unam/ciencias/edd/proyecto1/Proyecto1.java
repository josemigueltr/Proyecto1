package mx.unam.ciencias.edd.proyecto1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Clase que contiene el Main.
 *
 **/

public class Proyecto1 {

/**
   ////pendiente a comentar
 **/


static void imprime(Archivos archivo){
								if(archivo!=null) {
																Comparador a = new Comparador();
																Lista<String> b = leer.lista.mergeSort(a);
																for (String s : b) {
																								System.out.println(s);
																}
								}
}


/**/
static void reversa(Archivos archivo){
								if(archivo!=null) {
																Comparador a = new Comparador();
																Lista<String> b = archivo.lista.mergeSort(a);
																b=b.reversa();
																for (String s : b) {
																								System.out.println(s);
																}
								}

}


static void uso(){
	System.out.println("Uso: java -jar proyecto1.jar [-r|-o] <archivo>");
	System.exit(1);
}

public static void main(String[] args) throws IOException, FileNotFoundException {
								Archivos archivo = new Archivos();
								if (args.length == 0) {
																archivo.EntradaEstandar();
																imprime(archivo);
								}
								else{
									//variable que me determinara si el ususrio ingreso una bandera en los comentarios
			 		String bandera=args[0];
																String nombreArchivo = args[1];

																if( !bandera.equals("-r") && !bandera.equals("-o"))
																  uso();

																if(bandera.equals("-r")) {
																								for (int i=1; i<args.length; i++) {
																																archivo.leerArchivo(args[i]);
																								}
																								reversa(archivo);
																}else
																{
																								archivo.Escribirarchivos(nombreArchivo);
																}

								}

}

}
