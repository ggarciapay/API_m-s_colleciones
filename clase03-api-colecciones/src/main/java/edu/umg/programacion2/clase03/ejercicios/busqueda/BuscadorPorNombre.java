package edu.umg.programacion2.clase03.ejercicios.busqueda;

import java.util.List;

import edu.umg.programacion2.clase03.modelo.Usuario;

import java.util.ArrayList;

/**
 * TODO (estudiante): completar buscarPorNombreParcial().
 * <p>
 * Enunciado: recorrer la lista de usuarios y devolver solo los que
 * contengan el texto buscado en su nombre completo, sin importar
 * mayúsculas o minúsculas.
 * <p>
 * Entrada de ejemplo: lista con "Ana López", "Luis Pérez", "Marta Ruiz";
 * buscarPorNombreParcial(lista, "ana").
 * Salida esperada: una lista con solo "Ana López".
 * <p>
 * Pista: usa usuario.getNombreCompleto().toLowerCase().contains(texto.toLowerCase())
 * dentro de un for-each, y agrega las coincidencias a una lista nueva.
 * <p>
 * Criterios de evaluación:
 * - No modifica la lista original (usuarios).
 * - La búsqueda ignora mayúsculas/minúsculas.
 * - Si no hay coincidencias, retorna una lista vacía (no null).
 */
public class BuscadorPorNombre {

	public List<Usuario> buscarPorNombreParcial(List<Usuario> usuarios, String texto) {
		// TODO: reemplazar esta línea por la lógica descrita arriba.
		List<Usuario> resultado = new ArrayList<>();
		String textoBuscado = texto.toLowerCase();
		
		for(Usuario usuario : usuarios) {
			if(usuario.getNombreCompleto().toLowerCase().contains(textoBuscado)) {
				resultado.add(usuario);
			}
		}
	
		return resultado;
	}
	
	
}
