package net.instituto.desa;

public class Game {
	private static final String ABAJO = "Abajo";
	private static final String ARRIBA = "Arriba";
	private static final String IZQUIERDA = "Izquierda";
	private static final String DERECHA = "Derecha";
	Jugador j;

	public void movimiento(String m) {
		if (m.equalsIgnoreCase(DERECHA)) {
			derecha();
		}
		if (m.equalsIgnoreCase(IZQUIERDA)) {
			izquierda();
		}
		if (m.equalsIgnoreCase(ARRIBA)) {
			arriba();
		}
		if (m.equalsIgnoreCase(ABAJO)) {
			abajo();
		}
	}

	public void abajo() {
		j.setY(j.getY() + 1);
	}

	public void arriba() {
		j.setY(j.getY() - 1);
	}

	public void izquierda() {
		j.setX(j.getX() - 1);
	}

	public void derecha() {
		j.setX(j.getX() + 1);
	}
}
