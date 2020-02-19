package Parking.dto;

public abstract class Plaza {
	private String plaId;
	private String plaParkId;
	private EstadoPlaza plaEstado;
	
	
	public Plaza(String plaId, String plaParkId, EstadoPlaza plaEstado) {
		super();
		this.plaId = plaId;
		this.plaParkId = plaParkId;
		this.plaEstado = plaEstado;
	}


	public String getPlaId() {
		return plaId;
	}


	public void setPlaId(String plaId) {
		this.plaId = plaId;
	}


	public String getPlaParkId() {
		return plaParkId;
	}


	public void setPlaParkId(String plaParkId) {
		this.plaParkId = plaParkId;
	}


	public EstadoPlaza getPlaEstado() {
		return plaEstado;
	}


	public void setPlaEstado(EstadoPlaza plaEstado) {
		this.plaEstado = plaEstado;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((plaEstado == null) ? 0 : plaEstado.hashCode());
		result = prime * result + ((plaId == null) ? 0 : plaId.hashCode());
		result = prime * result + ((plaParkId == null) ? 0 : plaParkId.hashCode());
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
		Plaza other = (Plaza) obj;
		if (plaEstado != other.plaEstado)
			return false;
		if (plaId == null) {
			if (other.plaId != null)
				return false;
		} else if (!plaId.equals(other.plaId))
			return false;
		if (plaParkId == null) {
			if (other.plaParkId != null)
				return false;
		} else if (!plaParkId.equals(other.plaParkId))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Plaza [plaId=" + plaId + ", plaParkId=" + plaParkId + ", plaEstado=" + plaEstado + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
