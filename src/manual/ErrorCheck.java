package manual;

public class ErrorCheck {
	
	public boolean asignacion_check (String k, Object e2) {
		if(String.valueOf(e2).equals("null")) return false;
		if ((k.equals("REAL") || k.equals("VECTOR_REAL")) && !e2.getClass().getSimpleName().equals("Boolean"))
				return true;
		
		else if ((k.equals("BOOLEANO")||k.equals("VECTOR_BOOLEANO")) && e2.getClass().getSimpleName().equals("Boolean")) 
				return true;

		else if ((k.equals("ENTERO")||k.equals("VECTOR_ENTERO"))&& (e2.getClass().getSimpleName().equals("Integer")||e2.getClass().getSimpleName().equals("Character")))
				return true;
		
		else if ((k.equals("CARACTER")||k.equals("VECTOR_CARACTER"))&& (e2.getClass().getSimpleName().equals("Character")||e2.getClass().getSimpleName().equals("Integer"))) 
			return true;
	
		
		else {
			//if (type.equals("asig")) System.out.println ("Error: "+e1+" = "+String.valueOf(e2));
			//else if (type.equals("decl")) System.out.println ("Error: "+k+" "+e1+" = "+String.valueOf(e2));
			//System.out.println ("No se puede asignar una variable de tipo "+e2.getClass().getSimpleName()+ " a un "+k);
			return false;
		}

	}
	
	public int checkOperation(Object e1, Object e2) {
		if(String.valueOf(e1).equals("null")) return -1;
		if(String.valueOf(e2).equals("null")) return -1;
		if (e1.getClass().getSimpleName().equals("Boolean")&& e2.getClass().getSimpleName().equals("Boolean")) return 0;
		if (e1.getClass().getSimpleName().equals("Boolean")|| e2.getClass().getSimpleName().equals("Boolean")) return -2;
		return 0;
	}
}
