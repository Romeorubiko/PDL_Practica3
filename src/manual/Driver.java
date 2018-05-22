package manual;

import java.util.ArrayList;

import generado.*;
import java_cup.runtime.*;

class Driver {

	public static void main(String[] args) throws Exception {
		Parser parser = new Parser();
		int i;
		parser.parse();
		
		if (parser.mensajeError.isEmpty()) {
			for (i=0; i<parser.salidaParser.size(); i++) {
				System.out.println(parser.salidaParser.get(i));
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