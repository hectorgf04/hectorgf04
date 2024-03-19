package practica5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * El programa se ejecuta y imprime un tablero 10X10 con dos equipos de 5 campeones cada uno que
 * competiran para conquistar el territorio del equipo contrario. Los campeones pueden ser de 3
 * tipos, esto sera aleatorio como el lugar donde aparecen los campeones dentro de una zona 
 * determinada. Tambien aparecen minions cada 10 turnos que ayudan a un equipo.
 * @author Hector Garcia
 */
public class Tablero {
	
	/**
	 * Pre: ---
	 * Post: En el método principal se ejecutaran los metodos principales de este juego, primero crea
	 * el tablero de 10x10 casillas, segundo dos listas donde se van a almacenar los campeones del 
	 * equipo azul y rojo, tercero un array donde se pondran en comun todos los equipos y luego
	 * tendriamos la ejecución de metodos que comentare más tarde.
	 * 
	 */
	public static void main(String[] argumentos) {
		Casilla[][] tablero = new Casilla[10][10];
		ArrayList<Objeto> copiaEquipos = new ArrayList<>();
		ArrayList<Objeto> minions = new ArrayList<>();
		campo(tablero, copiaEquipos);
		ArrayList<Objeto> equipoAzul = new ArrayList<>();
		ArrayList<Objeto> equipoRojo = new ArrayList<>();
		ArrayList<Objeto> equipos = new ArrayList<>();
		equipos(equipoAzul, equipoRojo);
		System.out.println("     Bienvenidos a la grieta del invocador");
		System.out.println("===============================================");
		imprimirEquipos(equipoAzul, equipoRojo, tablero);
		// for (int i = 0; i < equipoAzul.size(); i++) {
		// System.out.println(equipoAzul.get(i));
		// }
		// for (int i = 0; i < equipoRojo.size(); i++) {
		// System.out.println(equipoRojo.get(i));
		// }
		turnos(equipoAzul, equipoRojo, tablero, equipos, copiaEquipos, minions);
	}
	
	/**
	 * Pre: ---
	 * Post: En este método se recorre todo el tablero que hemos creado antes para configurar nuestro
	 * tablero con las indicaciones de abajo y así quedaria un tablero como nos han pedido en el 
	 * enunciado, con su jungla, nexo y camino normal
	 */
	public static void campo(Casilla[][] tablero, ArrayList<Objeto> copiaEquipos) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				if ((i >= 2 && i <= 7) && (j == 2 || j == 3 || j == 6 || j == 7)) {
					tablero[i][j] = new Casilla(" X ");
				} else if (i == 0 && (j == 4 || j == 5)) {
					tablero[i][j] = new Nexo(" - ", "A");
					copiaEquipos.add(tablero[i][j]);
				} else if (i == 9 && (j == 4 || j == 5)) {
					tablero[i][j] = new Nexo(" - ", "R");
					copiaEquipos.add(tablero[i][j]);
				} else {
					tablero[i][j] = new Casilla(" · ");
				}
			}
		}
	}

	/**
	 * Pre: ---
	 * Post: Este método nos sirvira para cada vez que pase algo en el tablero verlo facilmente
	 */
	public static void imprimirTablero(Casilla[][] tablero) {
		for (int c = 0; c < tablero.length; c++) {
			for (int d = 0; d < tablero[c].length; d++) {
				System.out.print(String.format("%-5s", tablero[c][d].getContenido()) + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * Pre: ---
	 * Post: En este método se organizaran los equipos de forma random, los equipos seran de 5 
	 * integrantes cada uno. Cada equipo estara formado aleatoriamente por los 3 tipos de
	 * campeones y para diferenciarlos de los demas les asigno su equipo y el indice que tiene
	 * por si acaso en el mismo equipo hay dos campeones del mismo tipo que se le pueda reconocer
	 * facilmente.
	 */
	public static void equipos(ArrayList<Objeto> equipoAzul, ArrayList<Objeto> equipoRojo) {
		Random random = new Random();
		for (int e = 0; e < 5; e++) {
			int num = random.nextInt(3) + 1;
			if (num == 1) {
				Campeon guerrero = new Guerrero();
				guerrero.setEquipo("A");
				guerrero.setIndice(e);
				equipoAzul.add(guerrero);
			} else if (num == 2) {
				Campeon mago = new Mago();
				mago.setEquipo("A");
				mago.setIndice(e);
				equipoAzul.add(mago);
			} else {
				Campeon arquero = new Arquero();
				arquero.setEquipo("A");
				arquero.setIndice(e);
				equipoAzul.add(arquero);
			}
		}
		Collections.shuffle(equipoAzul);

		for (int z = 0; z < 5; z++) {
			int num2 = random.nextInt(3) + 1;
			if (num2 == 1) {
				Campeon guerrero = new Guerrero();
				guerrero.setEquipo("R");
				guerrero.setIndice(z);
				equipoRojo.add(guerrero);
			} else if (num2 == 2) {
				Campeon mago = new Mago();
				mago.setEquipo("R");
				mago.setIndice(z);
				equipoRojo.add(mago);
			} else {
				Campeon arquero = new Arquero();
				arquero.setEquipo("R");
				arquero.setIndice(z);
				equipoRojo.add(arquero);
			}
		}
		Collections.shuffle(equipoRojo);
	}

	/**
	 * Pre: ---
	 * Post: En este método imprimira de una forma aleatoria a los campeones teniendo en cuenta que
	 * esa zona esta delimitada por las casillas de abajo antes de que empiece la jungla sin contar 
	 * los nexos y lo mismo con la zona de arriba. 
	 */
	public static void imprimirEquipos(ArrayList<Objeto> equipoAzul, ArrayList<Objeto> equipoRojo,
			Casilla[][] tablero) {
		Random random = new Random();
		List<Integer> azulX1 = new ArrayList<>(List.of(0, 1, 2, 3, 6, 7, 8, 9));
		List<Integer> azulX2 = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
		Collections.shuffle(azulX1);
		Collections.shuffle(azulX2);
		for (int i = 0; i < 5; i++) {
			int num = random.nextInt(2);
			if (num == 1) {
				int x = azulX2.get(i);
				tablero[1][x].setContenido(equipoAzul.get(i).toString());
			} else {
				int x = azulX1.get(i);
				tablero[0][x].setContenido(equipoAzul.get(i).toString());
			}
		}
		List<Integer> rojoX1 = new ArrayList<>(List.of(0, 1, 2, 3, 6, 7, 8, 9));
		List<Integer> rojoX2 = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
		Collections.shuffle(rojoX1);
		Collections.shuffle(rojoX2);
		for (int i = 0; i < 5; i++) {
			int num = random.nextInt(2) + 8;
			if (num == 8) {
				int x = rojoX2.get(i);
				tablero[8][x].setContenido(equipoRojo.get(i).toString());
			} else {
				int x = rojoX1.get(i);
				tablero[9][x].setContenido(equipoRojo.get(i).toString());
			}
		}

		for (int c = 0; c < tablero.length; c++) {
			for (int d = 0; d < tablero[c].length; d++) {
				System.out.print(String.format("%-5s", tablero[c][d]));
			}
			System.out.println();
		}
	}
	
	/**
	 * Pre: ---
	 * Post: En este método se asignara aleatoriamente quien empieza de cada equipo, se utilizara el
	 * shuffle para reordenar la tabla aleatoriamente y con if decir quien empieza primero dependiendo
	 * del random. Despues ira al método movimiento para ahora si empezar con el juego
	 */
	public static void turnos(ArrayList<Objeto> equipoAzul, ArrayList<Objeto> equipoRojo, Casilla[][] tablero,
			ArrayList<Objeto> equipos,ArrayList<Objeto> copiaEquipos, ArrayList<Objeto> minions ) {
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();
		int num = random.nextInt(2);
		Collections.shuffle(equipoAzul);
		Collections.shuffle(equipoRojo);
		if (num == 0) {
			System.out.println("Empieza la batalla y comienza el equipo azul");
			for (int i = 0; i < 5; i++) {
				equipos.add(equipoAzul.get(i));
				equipos.add(equipoRojo.get(i));
				copiaEquipos.add(equipoAzul.get(i));
				copiaEquipos.add(equipoRojo.get(i));
			}
			movimiento(tablero, equipos, copiaEquipos, minions);

		} else {
			System.out.println("Empieza la batalla y comienza el equipo rojo");
			for (int i = 0; i < 5; i++) {
				equipos.add(equipoRojo.get(i));
				equipos.add(equipoAzul.get(i));
				copiaEquipos.add(equipoRojo.get(i));
				copiaEquipos.add(equipoAzul.get(i));
			}
			movimiento(tablero, equipos, copiaEquipos, minions);
		}
	}
	
	/**
	 * Pre: ---
	 * Post: En este método ya nos dara la opcion de que queremos hacer con el campeon que le toca 
	 * 1 para moverse y accedera al metodo desplazar, 2 para atacar que accede a combate y luego el 
	 * 3 para aplicar una pocima en un campeon. Tambien tenemos el sistema de turnos que servira 
	 * para la aparicion de minions
	 */
	public static void movimiento(Casilla[][] tablero, ArrayList<Objeto> equipos, ArrayList<Objeto> copiaEquipos,
			ArrayList<Objeto> minions) {
		Scanner teclado = new Scanner(System.in);
		// Ver si estan correctos los turnos
		// for (int j = 0; j < 9; j++) {
		// System.out.println(equipos.get(j));
		// }
		int turnos = 1;
		while (true) {
			System.out.println("----- Turno " + turnos + " -----");
			for (int i = 0; i < equipos.size(); i++) {
				if ((i == 0) || (i % 2 == 0)) {
					System.out.println("El turno es de " + equipos.get(i));
				} else {
					System.out.println("El turno es de " + equipos.get(i));
				}
				while (true) {
					System.out.println("Elige 1(desplazarse), 2(ataque) o 3(curacion)");
					int eleccion = teclado.nextInt();
					teclado.nextLine();
					int a = 0;
					int b = 0;
					for (int c = 0; c < tablero.length; c++) {
						for (int d = 0; d < tablero[c].length; d++) {
							if (tablero[c][d].getContenido().trim().equals(equipos.get(i).toString())) {
								a = c;
								b = d;
							}
						}
					}
					// Ver si esta correcta la posición del campeon
					// System.out.println("a = " + a + " / b = " + b);
					if (eleccion == 1) {
						if (desplazar(tablero, equipos, a, b, i)) {
							imprimirTablero(tablero);
							break;
						}
					} else if (eleccion == 2) {
						if (enemigosEnRango(tablero, equipos, a, b, i)) {
							combate(tablero, equipos, a, b, i, copiaEquipos);
							imprimirTablero(tablero);
							break;
						} else {
							System.out.println("No hay nadie en rango para atacar");
						}

					} else if (eleccion == 3) {
						((Campeon) equipos.get(i)).aplicarPocima();
						break;
					}
				}
				mirarAtaqueMinion(tablero, equipos,copiaEquipos, minions);
			}
			turnos++;
			int vidaNexo = 0;
			boolean aparecieronMinions = false;
			for (int i = 0; i < tablero.length; i++) {
				for (int j = 0; j < tablero[i].length; j++) {
					if (tablero[i][j] instanceof Nexo) {
						Nexo nexo = (Nexo) tablero[i][j];
						vidaNexo = nexo.getHp();
						if (vidaNexo <= (nexo.getVidaMaxima() * 30 / 100)) {
							if (turnos % 2 == 0) {
								System.out.println("Aparecieron super minions");
								apareceSuperMinion(tablero, nexo, copiaEquipos, minions);
								imprimirTablero(tablero);
							}
						} else {
							if (turnos % 10 == 0 && !aparecieronMinions) {
								System.out.println("");
								System.out.println("Aparecieron minions");
								apareceMinionAsedio(tablero, copiaEquipos, minions);
								aparecieronMinions = true;
								imprimirTablero(tablero);
							}
						}
					}
				}
			}
		}
	}
	
	/**
	 * Pre: ---
	 * Post: En este método se desplaza al campeon según las intrucciones que nos dice el jugador
	 */
	public static boolean desplazar(Casilla[][] tablero, ArrayList<Objeto> equipos, int a, int b, int i) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Elige A/W/S/D");
		String movimiento = teclado.nextLine();
		try {
			if (movimiento.equalsIgnoreCase("A") && tablero[a][b - 1].getContenido().trim().equals("·") && b - 1 >= 0) {
				// Mover hacia la izquierda
				tablero[a][b].setContenido(" · ");
				tablero[a][b - 1].setContenido(" " + equipos.get(i) + " ");
				return true;
			} else if (movimiento.equalsIgnoreCase("W") && tablero[a - 1][b].getContenido().trim().equals("·")
					&& a - 1 >= 0) {
				// Mover hacia arriba
				tablero[a][b].setContenido(" · ");
				tablero[a - 1][b].setContenido(" " + equipos.get(i) + " ");
				return true;
			} else if (movimiento.equalsIgnoreCase("S") && tablero[a + 1][b].getContenido().trim().equals("·")
					&& a + 1 < tablero.length) {
				// Mover hacia abajo
				tablero[a][b].setContenido(" · ");
				tablero[a + 1][b].setContenido(" " + equipos.get(i) + " ");
				return true;
			} else if (movimiento.equalsIgnoreCase("D") && tablero[a][b + 1].getContenido().trim().equals("·")
					&& b + 1 < tablero[0].length) {
				// Mover hacia la derecha
				tablero[a][b].setContenido(" · ");
				tablero[a][b + 1].setContenido(" " + equipos.get(i) + " ");
				return true;
			} else {
				System.out.println("Movimiento inválido. El campeón no puede salir del tablero.");
				return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Movimiento inválido. El campeón no puede salir del tablero.");
			return false;
		}
	}
	
	/**
	 * Pre: ---
	 * Post: En este método se realiza un combate entre un campeón atacante y los enemigos que 
	 * detecta otro método, dando la elección al jugador para que elija a quién atacar o diciendole
	 * que no hay ningun objetivo. Podremos atacar a tres tipos de enemigos, a otro campeon, a un 
	 * minion o al nexo. Tambien estara la posibilidad de derrotar a un campeon o un minion o acabar
	 * la partida quitandole toda la vida al nexo.
	 */
	public static void combate(Casilla[][] tablero, ArrayList<Objeto> equipos, int a, int b, int i,
			ArrayList<Objeto> copiaEquipos) {
		ArrayList<String> enemigosAlrededor = mirarAlrededor(tablero, equipos, a, b, i);
		Campeon campeonAtacante = (Campeon) equipos.get(i);
		int z = 0;
		int y = 0;
		if (enemigosAlrededor.isEmpty()) {
			System.out.println("No hay nadie en rango para atacar.");
			return;
		}
		Scanner teclado = new Scanner(System.in);
		boolean enemigoEncontrado = false;
		Objeto enemigo = null;
		while (!enemigoEncontrado) {
			System.out.print("A quien quieres atacar: ");
			for (int v = 0; v < enemigosAlrededor.size(); v++) {
				System.out.print(enemigosAlrededor.get(v) + " ");
			}
			System.out.println("");
			System.out.print("Escribe aqui la elección: ");
			String eleccion = teclado.nextLine();
			for (int j = 0; j < copiaEquipos.size(); j++) {
				enemigo = copiaEquipos.get(j);
				if (enemigo instanceof Campeon && enemigo.toString().equals(eleccion)) {
					if(enemigo instanceof Campeon) {
						Campeon campeonEnemigo = (Campeon) enemigo;
						int dañoCausado = daño(campeonAtacante, campeonEnemigo);
						(campeonAtacante).aumentarDaño(dañoCausado);
						(campeonEnemigo).recibirGolpe(dañoCausado, campeonAtacante);
						enemigoEncontrado = true;
						if (campeonEnemigo.getHp() <= 0) {
							System.out.println("El campeon " + campeonEnemigo + "ha sido derrotado");
							for (int c = 0; c < tablero.length; c++) {
								for (int d = 0; d < tablero[c].length; d++) {
									if (tablero[c][d].getContenido().trim().equals(campeonEnemigo.toString())) {
										z = c;
										y = d;
									}
								}
							}
							equipos.remove(campeonEnemigo);
							copiaEquipos.remove(campeonEnemigo);
							break;
						} else {
							System.out.println("La vida de " + campeonEnemigo + " es:" + campeonEnemigo.getHp());
							System.out.println("");
							contrataque(enemigo, tablero, campeonAtacante, a, b,equipos);
							break;
						}
					}
				} else if (enemigo instanceof Minion && enemigo.toString().equals(eleccion)) {
					int dañoCausado = 0;
					if (campeonAtacante instanceof Mago) {
						Mago magoAtacante = (Mago) campeonAtacante;
						if (magoAtacante.realizarCritico()) {
							System.out.println("¡Aplico un crítico!");
							dañoCausado = campeonAtacante.getAd() * 2;
						} else {
							dañoCausado = campeonAtacante.getAd();
						}
					} else {
						dañoCausado = campeonAtacante.getAd();
					}
					if (enemigo instanceof Minion) {
				        ((Minion) enemigo).recibirGolpe(dañoCausado, campeonAtacante);
				        enemigoEncontrado = true;
				        if (((Minion) enemigo).getHp() <= 0) {
							System.out.println("El campeon " + ((Minion) enemigo) + "ha sido derrotado");
							for (int c = 0; c < tablero.length; c++) {
								for (int d = 0; d < tablero[c].length; d++) {
									if (tablero[c][d].getContenido().trim().equals(((Minion) enemigo).toString())) {
										z = c;
										y = d;
									}
								}
							}
							copiaEquipos.remove((Minion) enemigo);
							tablero[z][y].setContenido(" · ");
							break;
						} else {
							System.out.println("La vida de " + ((Minion) enemigo) + " es:" + ((Minion) enemigo).getHp());
							System.out.println("");
							contrataqueMinion(enemigo, tablero, copiaEquipos.get(i), a, b);
						}
				    }
					
				} else if (enemigo instanceof Nexo && enemigo.toString().trim().equals("-") && eleccion.trim().equals("-")) {
					int dañoCausado = 0;
					if (campeonAtacante instanceof Mago) {
						Mago magoAtacante = (Mago) campeonAtacante;
						if (magoAtacante.realizarCritico()) {
							System.out.println("¡Aplico un crítico!");
							dañoCausado = campeonAtacante.getAd() * 2;
						} else {
							dañoCausado = campeonAtacante.getAd();
						}
					} else {
						dañoCausado = campeonAtacante.getAd();
					}
					((Nexo) enemigo).recibirGolpe(dañoCausado, campeonAtacante);
					enemigoEncontrado = true;
					if (((Nexo) enemigo).getHp() <= 0) {
						if (((Nexo) enemigo).getEquipo().equals("A")) {
							System.out.println("El nexo azul ha caido");
							System.out.println("El equipo rojo ha ganado!!!");
						} else {
							System.out.println("El nexo rojo ha caido");
							System.out.println("El equipo azul ha ganado!!!");
						}
						System.exit(0);
					} else {
						System.out.println("La vida de " + ((Nexo) enemigo) + " es: " + ((Nexo) enemigo).getHp());
						System.out.println("");
						break;
					}
				}
			}

			if (!enemigoEncontrado) {
				System.out.println("Enemigo no válido. Elige un enemigo de la lista.");
			}
		}

		if (campeonAtacante instanceof Campeon && enemigo instanceof Campeon) {
			Campeon campeonA = campeonAtacante;
			Campeon campeonE = (Campeon) enemigo;

			// Ver si el campeon enemigo esta bien y si hacen bien el daño
			//System.out.println(campeonE);
			//System.out.println(campeonA.getDañoCausado());
			System.out.println(campeonE.getDañoCausado());
			if(campeonA.getHp() > 0 && campeonE.getHp() > 0) {
				if (campeonA.getDañoCausado() > campeonE.getDañoCausado()) {
					System.out.println("El campeón " + campeonE + " ha perdido la batalla.");
					System.out.print("Por lo tanto " + campeonA + "sube a nivel ");
					campeonA.ganarBatalla();
					teleport(tablero, campeonE);
				} else if (campeonE.getDañoCausado() > campeonA.getDañoCausado()) {
					System.out.println("El campeón " + campeonA + " ha perdido la batalla.");
					System.out.print("Por lo tanto " + campeonE + "sube a nivel ");
					campeonE.ganarBatalla();
					teleport(tablero, campeonA);
				} else {
					System.out.println("La batalla terminó en empate.");
					teleport(tablero, campeonA);
					teleport(tablero, campeonE);
				}
			} else {
				tablero[z][y].setContenido(" · ");
			}
			
		}
	}
	
	/**
	 * Pre: ---
	 * Post: En este método se identifica y devuelve una lista de enemigos cercanos al campeon que 
	 * esta como atacante en el método de combate. Tambien vera si nuestro campeon es Arquero, 
	 * Guerrero o Mago y asi ver con que rango puede atacar nuestro campeon 
	 */
	public static ArrayList<String> mirarAlrededor(Casilla[][] tablero, ArrayList<Objeto> equipos, int a, int b,
			int i) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> dFila = new ArrayList<>();
		ArrayList<Integer> dColumna = new ArrayList<>();
		ArrayList<String> enemigosAlrededor = new ArrayList<>();
		String prefijoEquipo = equipos.get(i).toString().substring(0, 1);
		
		//Rango segun el campeon
		if (equipos.get(i) instanceof Arquero) {
			dFila.addAll(List.of(3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 0, 0, 0, 0, -1, -1, -1, -1, -2,
					-2, -2, -2, -2, -2, -2, -3, -3, -3, -3, -3, -3, -3));
			dColumna.addAll(List.of(3, 2, 1, 0, -1, -2, -3, 3, -3, 2, 1, 0, -1, -2, 3, -3, 2, -2, 3, -3, 2, -2, 3, -3,
					2, -2, 3, -3, 2, 1, 0, -1, 2, 3, 2, 1, 0, -1, -2, -3));
		} else if (equipos.get(i) instanceof Guerrero) {
			dFila.addAll(List.of(-1, 1, 0, 0, -1, -1, 1, 1));
			dColumna.addAll(List.of(0, 0, -1, 1, -1, 1, -1, 1));
		} else if (equipos.get(i) instanceof Mago) {
			dFila.addAll(List.of(2, 2, 2, 2, 2, 1, 1, 0, 0, -1, -1, -2, -2, -2, -2, -2));
			dColumna.addAll(List.of(2, 1, 0, -1, -2, 2, -2, 2, -2, 2, -2, 2, 1, 0, -1, -2));
		}
		for (int f = 0; f < dFila.size(); f++) {
			int nFila = a + dFila.get(f);
			int nColumna = b + dColumna.get(f);
			// Mostrar el rango
			// System.out.println("nFila: " + nFila + ", nColumna: " + nColumna);
			if (nFila >= 0 && nFila < tablero.length && nColumna >= 0 && nColumna < tablero[0].length && nColumna < 9) {
				String contenido = tablero[nFila][nColumna].getContenido().trim();
				if (!contenido.equals("·") && !contenido.equals("X")) {
					String equipoEnemigo = contenido.substring(0, 1);
					if (!equipoEnemigo.equals(prefijoEquipo)) {
						enemigosAlrededor.add(contenido);
					}
				}
			}
		}
		return enemigosAlrededor;
	}
	
	/**
	 * Pre: ---
	 * Post: método que devuelve true si hay enemigos en el rango de nuestro campeon o false si no 
	 * los hay. Se utiliza el método mirarAlrededor para obtener la lista.
	 */
	public static boolean enemigosEnRango(Casilla[][] tablero, ArrayList<Objeto> equipos, int a, int b, int i) {
		ArrayList<String> enemigosAlrededor = mirarAlrededor(tablero, equipos, a, b, i);
		return !enemigosAlrededor.isEmpty();
	}
	
	/**
	 * Pre: ---
	 * Post: en el método se realiza el contrataque del enemigo al atacante, tambien se mirara el 
	 * rango dependiendo del tipo del campeon que sea, se mirara la posición del enemigo y se 
	 * realizara el contrataque. Es parecido al metodo combate.
	 */
	public static void contrataque(Objeto enemigo, Casilla[][] tablero, Objeto atacante, int a, int b, ArrayList<Objeto> equipos) {
		ArrayList<Integer> dFilaE = new ArrayList<>();
		ArrayList<Integer> dColumnaE = new ArrayList<>();
		if (enemigo instanceof Arquero) {
			dFilaE.addAll(List.of(3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 0, 0, 0, 0, -1, -1, -1, -1, -2,
					-2, -2, -2, -2, -2, -2, -3, -3, -3, -3, -3, -3, -3));
			dColumnaE.addAll(List.of(3, 2, 1, 0, -1, -2, -3, 3, -3, 2, 1, 0, -1, -2, 3, -3, 2, -2, 3, -3, 2, -2, 3, -3,
					2, -2, 3, -3, 2, 1, 0, -1, 2, 3, 2, 1, 0, -1, -2, -3));
		} else if (enemigo instanceof Guerrero) {
			dFilaE.addAll(List.of(-1, 1, 0, 0, -1, -1, 1, 1));
			dColumnaE.addAll(List.of(0, 0, -1, 1, -1, 1, -1, 1));
		} else if (enemigo instanceof Mago) {
			dFilaE.addAll(List.of(2, 2, 2, 2, 2, 1, 1, 0, 0, -1, -1, -2, -2, -2, -2, -2));
			dColumnaE.addAll(List.of(2, 1, 0, -1, -2, 2, -2, 2, -2, 2, -2, 2, 1, 0, -1, -2));
		}
		boolean contrataco = false;

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				if (tablero[i][j].getContenido().trim().equals(enemigo.toString())) {
					for (int f = 0; f < dFilaE.size(); f++) {
						int nFila = i + dFilaE.get(f);
						int nColumna = j + dColumnaE.get(f);
						if (nFila == a && nColumna == b) {
							int dañoCausado = daño((Campeon) enemigo, (Campeon) atacante);
							((Campeon) atacante).recibirGolpe(dañoCausado, ((Campeon) enemigo));
							System.out.println(((Campeon) enemigo) + " pudo contratacar, la vida de "
									+ ((Campeon) atacante) + " ha sido reducida a " + ((Campeon) atacante).getHp());
							((Campeon) enemigo).aumentarDaño(dañoCausado);
							if (((Campeon)atacante).getHp() <= 0) {
								System.out.println("El campeon " + (Campeon)atacante + "ha sido derrotado");
								int z = 0;
								int y = 0;
								for (int c = 0; c < tablero.length; c++) {
									for (int d = 0; d < tablero[c].length; d++) {
										if (tablero[c][d].getContenido().trim().equals(((Campeon)atacante).toString())) {
											z = c;
											y = d;
										}
									}
								}
								equipos.remove(((Campeon)atacante));
								tablero[z][y].setContenido(" · ");
								break;
							} 
							contrataco = true;
							break;
						}
					}
				}
			}
		}

		if (!contrataco) {
			System.out.println(((Campeon) enemigo) + " no ha podido contratacar");
		}
	}
	
	/**
	 * Pre: ---
	 * Post: en el método se realiza el contrataque del enemigo Minion al campeon atacante.
	 * Tambien se mira a quien se ataca porque el campeon Arquero y Guerrero tienen atributos
	 * que pueden hacer que no se les pueda atacarEs parecido al metodo combate.
	 */
	public static void contrataqueMinion(Objeto enemigo, Casilla[][] tablero, Objeto atacante, int a, int b) {
		ArrayList<Integer> dFilaE = new ArrayList<>();
		ArrayList<Integer> dColumnaE = new ArrayList<>();
		dFilaE.addAll(List.of(-1, 1, 0, 0, -1, -1, 1, 1));
		dColumnaE.addAll(List.of(0, 0, -1, 1, -1, 1, -1, 1));
		boolean contrataco = false;

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				if (tablero[i][j].getContenido().trim().equals(enemigo.toString())) {
					for (int f = 0; f < dFilaE.size(); f++) {
						int nFila = i + dFilaE.get(f);
						int nColumna = j + dColumnaE.get(f);
						if (nFila == a && nColumna == b) {
							int dañoCausado = 0;
							if ((Campeon) atacante instanceof Arquero) {
								Arquero arqueroEnemigo = (Arquero) enemigo;
								if (arqueroEnemigo.esquivarAtaque()) {
									System.out.println("¡Esquivó el ataque!");
								} else {
									dañoCausado = ((Minion) enemigo).getAd();
								}
							} else if ((Campeon) enemigo instanceof Guerrero) {
								Guerrero guerreroEnemigo = (Guerrero) enemigo;
								if (guerreroEnemigo.bloquearAtaque()) {
									System.out.println("¡Bloqueo el ataque!");
								} else {
									dañoCausado = ((Minion) enemigo).getAd();
								}
							} else {
								dañoCausado = ((Minion) enemigo).getAd();
							}
							((Campeon) atacante).recibirGolpe(dañoCausado, ((Minion) enemigo));
							System.out.println(((Minion) enemigo) + " pudo contratacar, la vida de "
									+ ((Campeon) atacante) + " ha sido reducida a " + ((Campeon) atacante).getHp());
							contrataco = true;
							break;
						}
					}
				}
			}
		}

		if (!contrataco) {
			System.out.println(((Minion) enemigo) + " no ha podido contratacar");
		}
	}
	
	/**
	 * Pre: ---
	 * Post: en el método dependiendo del resultado en el combate teletransporta a una posición
	 * aleatoria dependiendo de que equipo, es parecido a la aparición de personajes.
	 */
	public static void teleport(Casilla[][] tablero, Campeon campeon) {
		Random random = new Random();
		int fila = 0;
		int columna = 0;
		while (true) {
			if (campeon.getEquipo().trim().equals("A")) {
				List<Integer> azulX1 = new ArrayList<>(List.of(0, 1, 2, 3, 6, 7, 8, 9));
				List<Integer> azulX2 = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
				Collections.shuffle(azulX1);
				Collections.shuffle(azulX2);
				for (int i = 0; i < 1; i++) {
					int num = random.nextInt(2);
					if (num == 1) {
						fila = 1;
						columna = azulX2.get(i);
					} else {
						fila = 0;
						columna = azulX1.get(i);
					}
				}
			} else {
				List<Integer> rojoX1 = new ArrayList<>(List.of(0, 1, 2, 3, 6, 7, 8, 9));
				List<Integer> rojoX2 = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
				Collections.shuffle(rojoX1);
				Collections.shuffle(rojoX2);
				for (int i = 0; i < 1; i++) {
					int num = random.nextInt(2) + 8;
					if (num == 8) {
						fila = 8;
						columna = rojoX2.get(i);
					} else {
						fila = 9;
						columna = rojoX1.get(i);
					}
				}
			}
			if (tablero[fila][columna].getContenido().trim().equals("·")) {
				break;
			}
		}
		int filaC = 0;
		int columnaC = 0;
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				if (tablero[i][j].getContenido().trim().equals(campeon.toString())) {
					filaC = i;
					columnaC = j;
				}
			}
		}

		tablero[fila][columna].setContenido(campeon.toString());
		tablero[filaC][columnaC].setContenido(" · ");
	}
	
	/**
	 * Pre: ---
	 * Post: en el método se calcula el daño causado por el campeón que ataca a otro enemigo. 
	 * Tambien se tiene en cuenta el tipo de campeon segun sus atributos.
	 */
	public static int daño(Campeon atacante, Campeon enemigo) {
		int dañoCausado = 0;
		if ((Campeon) enemigo instanceof Arquero) {
			Arquero arqueroEnemigo = (Arquero) enemigo;
			if (arqueroEnemigo.esquivarAtaque()) {
				System.out.println("¡Esquivó el ataque!");
			} else {
				dañoCausado = atacante.getAd();
			}
		} else if ((Campeon) enemigo instanceof Guerrero) {
			Guerrero guerreroEnemigo = (Guerrero) enemigo;
			if (guerreroEnemigo.bloquearAtaque()) {
				System.out.println("¡Bloqueo el ataque!");
			} else {
				dañoCausado = atacante.getAd();
			}
		} else if ((Campeon) atacante instanceof Mago) {
			Mago magoAtacante = (Mago) atacante;
			if (magoAtacante.realizarCritico()) {
				System.out.println("¡Aplico un crítico!");
				dañoCausado = atacante.getAd() * 2;
			} else {
				dañoCausado = atacante.getAd();
			}
		} else if ((Campeon) enemigo instanceof Mago) {
			dañoCausado = atacante.getAd();
		}
		return dañoCausado;
	}

	/**
	 * Pre: ---
	 * Post: en el método se genera y coloca en el tablero dos minions de tipo asedio, uno para cada
	 * equipo. Crea a los dos minions y los posiciona de manera parecida a la aparición de personajes.
	 */
	public static void apareceMinionAsedio(Casilla[][] tablero, ArrayList<Objeto> copiaEquipos, ArrayList<Objeto> minions) {
		Random random = new Random();
		int filaA = 0;
		int columnaA = 0;
		int filaR = 0;
		int columnaR = 0;
		Minion minionAsedioA = new Asedio();
		minionAsedioA.setEquipo("A");
		Minion minionAsedioR = new Asedio();
		minionAsedioR.setEquipo("R");
		while (true) {
			List<Integer> azulX1 = new ArrayList<>(List.of(0, 1, 2, 3, 6, 7, 8, 9));
			List<Integer> azulX2 = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
			Collections.shuffle(azulX1);
			Collections.shuffle(azulX2);
			for (int i = 0; i < 1; i++) {
				int num = random.nextInt(2);
				if (num == 1) {
					filaA = 1;
					columnaA = azulX2.get(i);
				} else {
					filaA = 0;
					columnaA = azulX1.get(i);
				}
			}
			List<Integer> rojoX1 = new ArrayList<>(List.of(0, 1, 2, 3, 6, 7, 8, 9));
			List<Integer> rojoX2 = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
			Collections.shuffle(rojoX1);
			Collections.shuffle(rojoX2);
			for (int i = 0; i < 1; i++) {
				int num = random.nextInt(2) + 8;
				if (num == 8) {
					filaR = 8;
					columnaR = rojoX2.get(i);
				} else {
					filaR = 9;
					columnaR = rojoX1.get(i);
				}
			}
			if (tablero[filaA][columnaA].getContenido().trim().equals("·")) {
				break;
			} else if (tablero[filaR][columnaR].getContenido().trim().equals("·")) {
				break;
			}
		}
		tablero[filaA][columnaA].setContenido(minionAsedioA.toString());
		tablero[filaR][columnaR].setContenido(minionAsedioR.toString());
		copiaEquipos.add(minionAsedioA);
		copiaEquipos.add(minionAsedioR);
		minions.add(minionAsedioA);
		minions.add(minionAsedioR);
	}
	
	/**
	 * Pre: ---
	 * Post: igual que en el método anterior pero aqui se generara un super minion si el nexo tiene
	 * un 30% de su vida.
	 */
	public static void apareceSuperMinion(Casilla[][] tablero, Nexo nexo, ArrayList<Objeto> copiaEquipos, ArrayList<Objeto> minions) {
		Random random = new Random();
		int fila = 0;
		int columna = 0;
		Minion superMinion = new SuperMinion();
		while (true) {
			if (nexo.getEquipo().equals("A")) {
				superMinion.setEquipo("A");
				List<Integer> azulX1 = new ArrayList<>(List.of(0, 1, 2, 3, 6, 7, 8, 9));
				List<Integer> azulX2 = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
				Collections.shuffle(azulX1);
				Collections.shuffle(azulX2);
				for (int i = 0; i < 1; i++) {
					int num = random.nextInt(2);
					if (num == 1) {
						fila = 1;
						columna = azulX2.get(i);
					} else {
						fila = 0;
						columna = azulX1.get(i);
					}
				}
			} else {
				superMinion.setEquipo("R");
				List<Integer> rojoX1 = new ArrayList<>(List.of(0, 1, 2, 3, 6, 7, 8, 9));
				List<Integer> rojoX2 = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
				Collections.shuffle(rojoX1);
				Collections.shuffle(rojoX2);
				for (int i = 0; i < 1; i++) {
					int num = random.nextInt(2) + 8;
					if (num == 8) {
						fila = 8;
						columna = rojoX2.get(i);
					} else {
						fila = 9;
						columna = rojoX1.get(i);
					}
				}
			}
			if (tablero[fila][columna].getContenido().trim().equals("·")) {
				break;
			}
		}
		tablero[fila][columna].setContenido(superMinion.toString());
		copiaEquipos.add(superMinion);
		minions.add(superMinion);
	}
	
	/**
	 * Pre: ---
	 * Post: en este método se realiza una revisión del rango de un minion para ver si puede atacar a un campeon y hacerlo
	 */
	public static void mirarAtaqueMinion(Casilla[][] tablero, ArrayList<Objeto> equipos,
			ArrayList<Objeto> copiaEquipos,ArrayList<Objeto> minions ) {
		for (int i = 0; i < minions.size(); i++) {
		    Minion minion = (Minion) minions.get(i);
		    for (int k = 0; k < tablero.length; k++) {
		        for (int j = 0; j < tablero[k].length; j++) {
		            if (tablero[k][j].getContenido().trim().equals(minion.toString())) {
		                for (int x = k - 1; x <= k + 1; x++) {
		                    for (int y = j - 1; y <= j + 1; y++) {
		                        if (x >= 0 && x < tablero.length && y >= 0 && y < tablero[x].length) {
		                            for (int z = 0; z < equipos.size(); z++) {
		                                if (equipos.get(z) instanceof Campeon) {
		                                    Campeon campeon = (Campeon) equipos.get(z);
		                                    for (int h = 0; h < tablero.length; h++) {
		                                        for (int v = 0; v < tablero[h].length; v++) {
		                                            if (tablero[h][v].getContenido().trim().equals(campeon.toString())) {
		                                                int filaCampeon = h;
		                                                int columnaCampeon = v;
		                                                if (x == filaCampeon && y == columnaCampeon) {
		                                                    (campeon).recibirGolpe(minion.getAd(), minion);
		                                                    System.out.println(campeon + " ha recibido " + minion.getAd() + " ,tiene " + campeon.getHp() + " de vida");
		                                                }
		                                            }
		                                        }
		                                    }  
		                                }
		                            }
		                        }
		                    }
		                }
		            }
		        }
		    }
		}
		
	}
}
