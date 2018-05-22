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
				System.out.println(parser.variables.get(i).id+" 		Tipo: "+parser.variables.get(i).tipo+"	 	Valor final: "+parser.variables.get(i).valor);
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