package rutas;

import javax.swing.JOptionPane;

public class Rutas {

	public static void main(String[] args) {
		String cant = JOptionPane.showInputDialog("Ingrese cantidad de ciudades:");
		int cantint = Integer.valueOf(cant);
		int ciudades[] = new int[cantint];
		for (int i = 0; i < cantint; i++) {

			String kmciudad = JOptionPane.showInputDialog("Ingrese km de ciudades:" + i);
			int kmcint = Integer.valueOf(kmciudad);
			ciudades[i] = kmcint;
		}
		float promedioDistancia = 0;
		int diferencia = 0;
		int distancia = 0;
		int distMax = 0;
		for (int i = 0; i < ciudades.length - 1; i++) {
			diferencia = (ciudades[i + 1] - ciudades[i]);
			// acumular las diferencias de kms entre ciudades
			distancia += diferencia;
			if (diferencia > distMax) {
				distMax = diferencia;
			}

		}

//		resultados
		promedioDistancia = distancia / (cantint - 1);
		System.out.println("El promedio de distancia entre ciudades es: " + promedioDistancia);
		System.out.println("Distancia maxima entre ciudades: " + distMax);

	}

}
