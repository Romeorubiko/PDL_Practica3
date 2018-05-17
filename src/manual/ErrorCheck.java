package manual;

public class ErrorCheck {
	
	public boolean asignacion_check (String k, String e1, Object e2, String type) {
		if (k.equals("REAL") && !e2.getClass().getSimpleName().equals("Boolean"))
				return true;
		
		else if (k.equals("BOOLEAN") && e2.getClass().getSimpleName().equals("Boolean")) 
				return true;

		else if (k.equals("ENTERO")&& (e2.getClass().getSimpleName().equals("Integer")||e2.getClass().getSimpleName().equals("Character")))
				return true;
		
		else if (k.equals("CARACTER")&& e2.getClass().getSimpleName().equals("Character")) 
			return true;
		
		
		else {
			if (type.equals("asig")) System.out.println ("Error: "+e1+" = "+String.valueOf(e2));
			else if (type.equals("decl")) System.out.println ("Error: "+k+" "+e1+" = "+String.valueOf(e2));
			System.out.println ("No se puede asignar una variable de tipo "+e2.getClass().getSimpleName()+ " a un "+k);
			return false;
		}

	}
	
}
