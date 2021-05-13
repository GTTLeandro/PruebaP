package Domain;

import Domain.Contratado;
import Domain.Empleado;
import Domain.Mantenimiento;
import Domain.Tarea;
import Domain.Exceptions.HorasNoDisponiblesException;
import Domain.Exceptions.SeniorityNoAlcanzadaException;

public class App {
	
	public static void main(String[] args) {
		Empleado e1 = new Contratado();
		Tarea t1 = new Mantenimiento();
		try {
			e1.agregar(t1);
		//} catch (HorasNoDisponiblesException | SeniorityNoAlcanzadaException e) {
		} catch (HorasNoDisponiblesException ex1) {
			ex1.printStackTrace();
			// mostrar ventana con mensaje de error
		} catch (SeniorityNoAlcanzadaException ex2) {
			ex2.printStackTrace();
		}
	}

}
