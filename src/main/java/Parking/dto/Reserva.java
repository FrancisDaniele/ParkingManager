package Parking.dto;


import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
	private Integer resId;
	private Integer resTickId;
	private String resPlazaId;
	private LocalDate resFecha;
	private LocalTime resHoraIni;
	private LocalTime resHoraFin;
	private Boolean cocheElectrico;
	private Boolean asientosFull;
	
	public Reserva(Integer resId, Integer resTickId, String resPlazaId, LocalDate resFecha, LocalTime resHoraIni,
			LocalTime resHoraFin, Boolean cocheElectrico, Boolean asientosFull) {
		super();
		this.resId = resId;
		this.resTickId = resTickId;
		this.resPlazaId = resPlazaId;
		this.resFecha = resFecha;
		this.resHoraIni = resHoraIni;
		this.resHoraFin = resHoraFin;
		this.cocheElectrico = cocheElectrico;
		this.asientosFull = asientosFull;
	}

	public Integer getResId() {
		return resId;
	}

	public void setResId(Integer resId) {
		this.resId = resId;
	}

	public Integer getResTickId() {
		return resTickId;
	}

	public void setResTickId(Integer resTickId) {
		this.resTickId = resTickId;
	}

	public String getResPlazaId() {
		return resPlazaId;
	}

	public void setResPlazaId(String resPlazaId) {
		this.resPlazaId = resPlazaId;
	}

	public LocalDate getResFecha() {
		return resFecha;
	}

	public void setResFecha(LocalDate resFecha) {
		this.resFecha = resFecha;
	}

	public LocalTime getResHoraIni() {
		return resHoraIni;
	}

	public void setResHoraIni(LocalTime resHoraIni) {
		this.resHoraIni = resHoraIni;
	}

	public LocalTime getResHoraFin() {
		return resHoraFin;
	}

	public void setResHoraFin(LocalTime resHoraFin) {
		this.resHoraFin = resHoraFin;
	}

	public Boolean getCocheElectrico() {
		return cocheElectrico;
	}

	public void setCocheElectrico(Boolean cocheElectrico) {
		this.cocheElectrico = cocheElectrico;
	}

	public Boolean getAsientosFull() {
		return asientosFull;
	}

	public void setAsientosFull(Boolean asientosFull) {
		this.asientosFull = asientosFull;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((asientosFull == null) ? 0 : asientosFull.hashCode());
		result = prime * result + ((cocheElectrico == null) ? 0 : cocheElectrico.hashCode());
		result = prime * result + ((resFecha == null) ? 0 : resFecha.hashCode());
		result = prime * result + ((resHoraFin == null) ? 0 : resHoraFin.hashCode());
		result = prime * result + ((resHoraIni == null) ? 0 : resHoraIni.hashCode());
		result = prime * result + ((resId == null) ? 0 : resId.hashCode());
		result = prime * result + ((resPlazaId == null) ? 0 : resPlazaId.hashCode());
		result = prime * result + ((resTickId == null) ? 0 : resTickId.hashCode());
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
		Reserva other = (Reserva) obj;
		if (asientosFull == null) {
			if (other.asientosFull != null)
				return false;
		} else if (!asientosFull.equals(other.asientosFull))
			return false;
		if (cocheElectrico == null) {
			if (other.cocheElectrico != null)
				return false;
		} else if (!cocheElectrico.equals(other.cocheElectrico))
			return false;
		if (resFecha == null) {
			if (other.resFecha != null)
				return false;
		} else if (!resFecha.equals(other.resFecha))
			return false;
		if (resHoraFin == null) {
			if (other.resHoraFin != null)
				return false;
		} else if (!resHoraFin.equals(other.resHoraFin))
			return false;
		if (resHoraIni == null) {
			if (other.resHoraIni != null)
				return false;
		} else if (!resHoraIni.equals(other.resHoraIni))
			return false;
		if (resId == null) {
			if (other.resId != null)
				return false;
		} else if (!resId.equals(other.resId))
			return false;
		if (resPlazaId == null) {
			if (other.resPlazaId != null)
				return false;
		} else if (!resPlazaId.equals(other.resPlazaId))
			return false;
		if (resTickId == null) {
			if (other.resTickId != null)
				return false;
		} else if (!resTickId.equals(other.resTickId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Reserva [resId=" + resId + ", resTickId=" + resTickId + ", resPlazaId=" + resPlazaId + ", resFecha="
				+ resFecha + ", resHoraIni=" + resHoraIni + ", resHoraFin=" + resHoraFin + ", cocheElectrico="
				+ cocheElectrico + ", asientosFull=" + asientosFull + "]";
	}
	
	
	
	
	
	
	
}
