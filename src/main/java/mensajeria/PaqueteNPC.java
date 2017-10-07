package mensajeria;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import dominio.Item;
import estados.Estado;

public class PaqueteNPC extends PaquetePeleable implements Serializable, Cloneable{
	
	
	private int defensa;
	
	public PaqueteNPC() throws IOException {
		raza = "NPC";
		estado = Estado.estadoOffline;
	}
	
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
}
