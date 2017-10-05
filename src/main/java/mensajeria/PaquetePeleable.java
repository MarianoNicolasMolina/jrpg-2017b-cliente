package mensajeria;

public abstract class PaquetePeleable extends Paquete{
	
	protected int id;
	protected int idMapa;
	protected int estado;
	protected String nombre;
	protected String raza;
	protected int saludTope;
	protected int energiaTope;
	protected int fuerza;
	protected int nivel = 1;
	
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMapa() {
		return idMapa;
	}

	public void setMapa(int idMapa) {
		this.idMapa = idMapa;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getSaludTope() {
		return saludTope;
	}

	public void setSaludTope(int saludTope) {
		this.saludTope = saludTope;
	}

	public int getEnergiaTope() {
		return energiaTope;
	}

	public void setEnergiaTope(int energiaTope) {
		this.energiaTope = energiaTope;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	

}
