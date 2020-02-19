package dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ticket {
	private Integer TickId;
	private String TickUser;
	private String TickParking;
	private LocalDate TickFecha;
	private LocalTime TickHoraIni;
	private LocalTime TickHoraFin;
	
	public Ticket(Integer tickId, String tickUser, String tickParking, LocalDate tickFecha, LocalTime tickHoraIni,
			LocalTime tickHoraFin) {
		super();
		TickId = tickId;
		TickUser = tickUser;
		TickParking = tickParking;
		TickFecha = tickFecha;
		TickHoraIni = tickHoraIni;
		TickHoraFin = tickHoraFin;
	}

	public Integer getTickId() {
		return TickId;
	}

	public void setTickId(Integer tickId) {
		TickId = tickId;
	}

	public String getTickUser() {
		return TickUser;
	}

	public void setTickUser(String tickUser) {
		TickUser = tickUser;
	}

	public String getTickParking() {
		return TickParking;
	}

	public void setTickParking(String tickParking) {
		TickParking = tickParking;
	}

	public LocalDate getTickFecha() {
		return TickFecha;
	}

	public void setTickFecha(LocalDate tickFecha) {
		TickFecha = tickFecha;
	}

	public LocalTime getTickHoraIni() {
		return TickHoraIni;
	}

	public void setTickHoraIni(LocalTime tickHoraIni) {
		TickHoraIni = tickHoraIni;
	}

	public LocalTime getTickHoraFin() {
		return TickHoraFin;
	}

	public void setTickHoraFin(LocalTime tickHoraFin) {
		TickHoraFin = tickHoraFin;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((TickFecha == null) ? 0 : TickFecha.hashCode());
		result = prime * result + ((TickHoraFin == null) ? 0 : TickHoraFin.hashCode());
		result = prime * result + ((TickHoraIni == null) ? 0 : TickHoraIni.hashCode());
		result = prime * result + ((TickId == null) ? 0 : TickId.hashCode());
		result = prime * result + ((TickParking == null) ? 0 : TickParking.hashCode());
		result = prime * result + ((TickUser == null) ? 0 : TickUser.hashCode());
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
		Ticket other = (Ticket) obj;
		if (TickFecha == null) {
			if (other.TickFecha != null)
				return false;
		} else if (!TickFecha.equals(other.TickFecha))
			return false;
		if (TickHoraFin == null) {
			if (other.TickHoraFin != null)
				return false;
		} else if (!TickHoraFin.equals(other.TickHoraFin))
			return false;
		if (TickHoraIni == null) {
			if (other.TickHoraIni != null)
				return false;
		} else if (!TickHoraIni.equals(other.TickHoraIni))
			return false;
		if (TickId == null) {
			if (other.TickId != null)
				return false;
		} else if (!TickId.equals(other.TickId))
			return false;
		if (TickParking == null) {
			if (other.TickParking != null)
				return false;
		} else if (!TickParking.equals(other.TickParking))
			return false;
		if (TickUser == null) {
			if (other.TickUser != null)
				return false;
		} else if (!TickUser.equals(other.TickUser))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ticket [TickId=" + TickId + ", TickUser=" + TickUser + ", TickParking=" + TickParking + ", TickFecha="
				+ TickFecha + ", TickHoraIni=" + TickHoraIni + ", TickHoraFin=" + TickHoraFin + "]";
	}
	
	
	
	
	
	
	

}
