import java.util.* ;
public class Ejercicio4{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int me = -1000;
		int e;
		int ne;

		System.out.println("");
		System.out.println("*********Ejercicio4************");
		System.out.println("");

		for(int i = 1; i <= 20; i++){
			System.out.println("Ingrese la edad " + i);
		    e = scanner.nextInt();
		    if(e > me){
		    	me = e;
		    }
		    else{

		    }

		}

		System.out.println("La edad mayor es: " + me);
		
	}
}