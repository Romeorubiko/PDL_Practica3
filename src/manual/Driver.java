package manual;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import generado.*;
import java_cup.runtime.*;

class Driver {

	public static void main(String[] args) throws Exception {
		Parser parser = new Parser();
		int i;
		parser.parse();
		if (parser.mensajeError.isEmpty()) {
			System.out.println("----------------------Variables declaradas----------------------\n");
			for (i=0; i<parser.variables.size(); i++) {
				if (parser.variables.get(i).tipo.equals("VECTOR_REAL")||parser.variables.get(i).tipo.equals("VECTOR_ENTERO")||
					parser.variables.get(i).tipo.equals("VECTOR_BOOLEANO")||parser.variables.get(i).tipo.equals("VECTOR_CARACTER")) {
					System.out.print(parser.variables.get(i).id+" 		Tipo: "+parser.variables.get(i).tipo+"	 	Valores finales: ");
					for (int j = 0; j<parser.variables.get(i).vector.length; j++) {
						System.out.print(parser.variables.get(i).vector[j]+", ");
					}
					System.out.println();
				}
				else System.out.println(parser.variables.get(i).id+" 		Tipo: "+parser.variables.get(i).tipo+"	 	Valor final: "+parser.variables.get(i).valor);
			}
		}
		else {
			for (i=0; i<parser.mensajeError.size(); i++) {
				parser.report_error(parser.mensajeError.get(i), null);
				//System.out.println(parser.mensajeError.get(i));
			}
		}
		
	}
	
}