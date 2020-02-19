package dto;

public class Parking {
	private Integer parkId;
	private String parkDesc;
	private String parkMuni;
	private Integer parkPlazas;
	
	public final static Double preuHora = 1.5 ;
	public final static String horari = "De 7:00 a 21:00";
	
	
	public Parking(Integer parkId, String parkDesc, String parkMuni, Integer parkPlazas) {
		super();
		this.parkId = parkId;
		this.parkDesc = parkDesc;
		this.parkMuni = parkMuni;
		this.parkPlazas = parkPlazas;
	}


	public Integer getParkId() {
		return parkId;
	}


	public void setParkId(Integer parkId) {
		this.parkId = parkId;
	}


	public String getParkDesc() {
		return parkDesc;
	}


	public void setParkDesc(String parkDesc) {
		this.parkDesc = parkDesc;
	}


	public String getParkMuni() {
		return parkMuni;
	}


	public void setParkMuni(String parkMuni) {
		this.parkMuni = parkMuni;
	}


	public Integer getParkPlazas() {
		return parkPlazas;
	}


	public void setParkPlazas(Integer parkPlazas) {
		this.parkPlazas = parkPlazas;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((parkDesc == null) ? 0 : parkDesc.hashCode());
		result = prime * result + ((parkId == null) ? 0 : parkId.hashCode());
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
		if (parkDesc == null) {
			if (other.parkDesc != null)
				return false;
		} else if (!parkDesc.equals(other.parkDesc))
			return false;
		if (parkId == null) {
			if (other.parkId != null)
				return false;
		} else if (!parkId.equals(other.parkId))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Parking [parkId=" + parkId + ", parkDesc=" + parkDesc + ", parkMuni=" + parkMuni + ", parkPlazas="
				+ parkPlazas + "]";
	}


	
	
	

	
	
	
}
