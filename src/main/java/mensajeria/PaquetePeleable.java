package mensajeria;

public abstract class PaquetePeleable extends Paquete{
	
	public PaquetePeleable() {

	}

	public PaquetePeleable(String mensaje, String nick, String ip, int comando) {
		super(mensaje,"creoQueEstoNoSeUsa",ip,comando);
	}

	public PaquetePeleable(String mensaje, int comando) {
		super(mensaje,comando);
	}

	public PaquetePeleable(int comando) {
		super(comando);
	}

}
