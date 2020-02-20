package dto;

public class Parking {
	private Integer id;
	private String nombre;
	private String municipio;
	private Integer disponibles;
	private Integer totales;
	
	public Parking(Integer id, String nombre, String municipio, Integer disponibles, Integer totales) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.municipio = municipio;
		this.disponibles = disponibles;
		this.totales = totales;
	}

	public Parking(Integer id, String nombre, String municipio, Integer totales) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.municipio = municipio;
		this.totales = totales;
	}
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public Integer getDisponibles() {
		return disponibles;
	}

	public void setDisponibles(Integer disponibles) {
		this.disponibles = disponibles;
	}

	public Integer getTotales() {
		return totales;
	}

	public void setTotales(Integer totales) {
		this.totales = totales;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((disponibles == null) ? 0 : disponibles.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((municipio == null) ? 0 : municipio.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((totales == null) ? 0 : totales.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parking other = (Parking) obj;
		if (disponibles == null) {
			if (other.disponibles != null)
				return false;
		} else if (!disponibles.equals(other.disponibles))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (municipio == null) {
			if (other.municipio != null)
				return false;
		} else if (!municipio.equals(other.municipio))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (totales == null) {
			if (other.totales != null)
				return false;
		} else if (!totales.equals(other.totales))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Parking [id=" + id + ", nombre=" + nombre + ", municipio=" + municipio + ", disponibles=" + disponibles
				+ ", totales=" + totales + "]";
	}

	public void add(Parking parking) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	

}
