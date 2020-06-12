import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Principal  {
	

	public Principal() {
		
	
	
	}





	public static void main(String[] args) {
		
		
		int []  numeros= new  int []{0,1,2,3,4,5,6,7,8,9};
		int n =6;
		
		  n=  numeros[numeros [n/2]];
		  System.out.println(n);
		System.out.println(numeros[n]/2);

		
		System.out.println("-------------------------- Valor Columnas  como String LLamando a metodo  separacion Digitos  en Array String----------------------------------");
		
		String []  arre1=reduccion("12345668");
		
		/*for(int ir=0; ir<=arre1.length-1;ir++) {
			System.out.println("transformado columna 1 a arreglo1 "+" " + arre1[ir]);
		}
		*/
		
		String []  arre2=reduccion("1234569");
		
		/*for(int ir2=0; ir2<=arre2.length-1;ir2++) {
			System.out.println("transformado columna 2 a arreglo "+" " + arre2[ir2]);
		}*/
		int l= arre2.length-1;
		System.out.println("Columna 1 contiene columna 2 ?"+ " "+funcion(arre1, arre2, l));
		System.out.println("");
		
		System.out.println("--------------------------simulacion Datos Manuales Ingresados a Array----------------------------------");
		
		String [] arr1 = new  String [] {"1","2"};
		String [] arr2 = new  String [] {"1","2"};
		int longitud1= arr2.length-1;
		System.out.println("La primera Col contiene a la segunda Col ?"+ " "+funcion(arr1, arr2, longitud1));
		
	
			
	}
	
	


	 
	 static boolean  funcion (String[] arreglo1, String[] arreglo2, int longitud) {
		 
		 if(longitud==0) {
			 if(arreglo1[longitud].equals(arreglo2[longitud])) {
				 
				 return true;
				 
			 }
			 else { return false;}
			 
			 
		 }
		 else if(longitud> arreglo1.length-1) {return false;}
		 else {
			 
			 
		return  funcion(arreglo1, arreglo2, longitud-1) && arreglo1[longitud].equals(arreglo2[longitud]) ;	 
		 }
		 
		
		 
	 }
	 
	 
	 static  String [] reduccion (String valortabla) {
		 

		
		 int longitud= valortabla.length();
		 String [] arreglo=  new String[longitud];
		 System.out.println("--------------------------Fragmentado valor columna  ----------------------------------");
		 for(int i =0; i< longitud; i++) {
			 
			arreglo[i]= valortabla.substring(i, i+1);
			 System.out.println(arreglo[i]);
		 }
		 
		 return arreglo;
		 
		 
	 }
	 
}
