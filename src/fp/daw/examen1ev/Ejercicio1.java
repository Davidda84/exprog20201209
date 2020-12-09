package fp.daw.examen1ev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String entrada = reader.readLine();
		entrada = entrada.toLowerCase();
		System.out.println(entrada);
		char [] array = new char [entrada.length()];
		char [] salida = new char [entrada.length()];
		for (int i = 0; i < entrada.length();i++) {
			array[i]= entrada.charAt(i);
		}
		salida = InterDirecto(array);
		for (int i = 0; i < salida.length; i++) {
			System.out.print(salida[i] + " ");
		}
		

	}
	
	public static char [] InterDirecto(char [] array){
        int i, j;
        char aux;
        for(i = 0; i < array.length - 1; i++) {
             for(j = 0; j < array.length-i - 1; j++) {
                  if(array[j+1] < array[j]){
                     aux = array[j+1];
                     array[j+1] = array[j];
                     array[j] = aux;
                  }
             }
        }
        return array;
	}

}
