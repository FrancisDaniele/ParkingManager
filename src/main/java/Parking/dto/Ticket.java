package Parking.dto;

public class Ticket {
	private Integer TickId;
	private String TickUser;
	private String TickReserva1;
	private String TickReserva2;
	private String TickReserva3;
	
	//constructor con una reserva//
	public Ticket(Integer tickId, String tickUser, String tickReserva1) {
		super();
		TickId = tickId;
		TickUser = tickUser;
		TickReserva1 = tickReserva1;
	}
	
	//constructor con dos reservas//
	public Ticket(Integer tickId, String tickUser, String tickReserva1, String tickReserva2) {
		super();
		TickId = tickId;
		TickUser = tickUser;
		TickReserva1 = tickReserva1;
		TickReserva2 = tickReserva2;
	}
	
	//constructor con tres reservas//
	public Ticket(Integer tickId, String tickUser, String tickReserva1, String tickReserva2, String tickReserva3) {
		super();
		TickId = tickId;
		TickUser = tickUser;
		TickReserva1 = tickReserva1;
		TickReserva2 = tickReserva2;
		TickReserva3 = tickReserva3;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((TickId == null) ? 0 : TickId.hashCode());
		result = prime * result + ((TickReserva1 == null) ? 0 : TickReserva1.hashCode());
		result = prime * result + ((TickReserva2 == null) ? 0 : TickReserva2.hashCode());
		result = prime * result + ((TickReserva3 == null) ? 0 : TickReserva3.hashCode());
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
		if (TickId == null) {
			if (other.TickId != null)
				return false;
		} else if (!TickId.equals(other.TickId))
			return false;
		if (TickReserva1 == null) {
			if (other.TickReserva1 != null)
				return false;
		} else if (!TickReserva1.equals(other.TickReserva1))
			return false;
		if (TickReserva2 == null) {
			if (other.TickReserva2 != null)
				return false;
		} else if (!TickReserva2.equals(other.TickReserva2))
			return false;
		if (TickReserva3 == null) {
			if (other.TickReserva3 != null)
				return false;
		} else if (!TickReserva3.equals(other.TickReserva3))
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
		return "Ticket [TickId=" + TickId + ", TickUser=" + TickUser + ", TickReserva1=" + TickReserva1
				+ ", TickReserva2=" + TickReserva2 + ", TickReserva3=" + TickReserva3 + "]";
	}
	
		
	
	

}
