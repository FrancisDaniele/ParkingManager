package dto;

public class Usuario {
	private String nieDni;
	private String email;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String vehiculo1;
	private Boolean vehiculo1Electrico;
	private String vehiculo2;
	private Boolean vehiculo2Electrico;
	private String vehiculo3;
	private Boolean vehiculo3Electrico;
	
	public Usuario(String nieDni, String email, String nombre, String apellidos, String telefono, String vehiculo1,
			Boolean vehiculo1Electrico) {
		super();
		this.nieDni = nieDni;
		this.email = email;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.vehiculo1 = vehiculo1;
		this.vehiculo1Electrico = vehiculo1Electrico;
	}

	public Usuario(String nieDni, String email, String nombre, String apellidos, String telefono, String vehiculo1,
			Boolean vehiculo1Electrico, String vehiculo2, Boolean vehiculo2Electrico) {
		super();
		this.nieDni = nieDni;
		this.email = email;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.vehiculo1 = vehiculo1;
		this.vehiculo1Electrico = vehiculo1Electrico;
		this.vehiculo2 = vehiculo2;
		this.vehiculo2Electrico = vehiculo2Electrico;
	}

	public Usuario(String nieDni, String email, String nombre, String apellidos, String telefono, String vehiculo1,
			Boolean vehiculo1Electrico, String vehiculo2, Boolean vehiculo2Electrico, String vehiculo3,
			Boolean vehiculo3Electrico) {
		super();
		this.nieDni = nieDni;
		this.email = email;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.vehiculo1 = vehiculo1;
		this.vehiculo1Electrico = vehiculo1Electrico;
		this.vehiculo2 = vehiculo2;
		this.vehiculo2Electrico = vehiculo2Electrico;
		this.vehiculo3 = vehiculo3;
		this.vehiculo3Electrico = vehiculo3Electrico;
	}

	public String getNieDni() {
		return nieDni;
	}

	public void setNieDni(String nieDni) {
		this.nieDni = nieDni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getVehiculo1() {
		return vehiculo1;
	}

	public void setVehiculo1(String vehiculo1) {
		this.vehiculo1 = vehiculo1;
	}

	public Boolean getVehiculo1Electrico() {
		return vehiculo1Electrico;
	}

	public void setVehiculo1Electrico(Boolean vehiculo1Electrico) {
		this.vehiculo1Electrico = vehiculo1Electrico;
	}

	public String getVehiculo2() {
		return vehiculo2;
	}

	public void setVehiculo2(String vehiculo2) {
		this.vehiculo2 = vehiculo2;
	}

	public Boolean getVehiculo2Electrico() {
		return vehiculo2Electrico;
	}

	public void setVehiculo2Electrico(Boolean vehiculo2Electrico) {
		this.vehiculo2Electrico = vehiculo2Electrico;
	}

	public String getVehiculo3() {
		return vehiculo3;
	}

	public void setVehiculo3(String vehiculo3) {
		this.vehiculo3 = vehiculo3;
	}

	public Boolean getVehiculo3Electrico() {
		return vehiculo3Electrico;
	}

	public void setVehiculo3Electrico(Boolean vehiculo3Electrico) {
		this.vehiculo3Electrico = vehiculo3Electrico;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((nieDni == null) ? 0 : nieDni.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		result = prime * result + ((vehiculo1 == null) ? 0 : vehiculo1.hashCode());
		result = prime * result + ((vehiculo1Electrico == null) ? 0 : vehiculo1Electrico.hashCode());
		result = prime * result + ((vehiculo2 == null) ? 0 : vehiculo2.hashCode());
		result = prime * result + ((vehiculo2Electrico == null) ? 0 : vehiculo2Electrico.hashCode());
		result = prime * result + ((vehiculo3 == null) ? 0 : vehiculo3.hashCode());
		result = prime * result + ((vehiculo3Electrico == null) ? 0 : vehiculo3Electrico.hashCode());
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
		Usuario other = (Usuario) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (nieDni == null) {
			if (other.nieDni != null)
				return false;
		} else if (!nieDni.equals(other.nieDni))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		if (vehiculo1 == null) {
			if (other.vehiculo1 != null)
				return false;
		} else if (!vehiculo1.equals(other.vehiculo1))
			return false;
		if (vehiculo1Electrico == null) {
			if (other.vehiculo1Electrico != null)
				return false;
		} else if (!vehiculo1Electrico.equals(other.vehiculo1Electrico))
			return false;
		if (vehiculo2 == null) {
			if (other.vehiculo2 != null)
				return false;
		} else if (!vehiculo2.equals(other.vehiculo2))
			return false;
		if (vehiculo2Electrico == null) {
			if (other.vehiculo2Electrico != null)
				return false;
		} else if (!vehiculo2Electrico.equals(other.vehiculo2Electrico))
			return false;
		if (vehiculo3 == null) {
			if (other.vehiculo3 != null)
				return false;
		} else if (!vehiculo3.equals(other.vehiculo3))
			return false;
		if (vehiculo3Electrico == null) {
			if (other.vehiculo3Electrico != null)
				return false;
		} else if (!vehiculo3Electrico.equals(other.vehiculo3Electrico))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [nieDni=" + nieDni + ", email=" + email + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", telefono=" + telefono + ", vehiculo1=" + vehiculo1 + ", vehiculo1Electrico=" + vehiculo1Electrico
				+ ", vehiculo2=" + vehiculo2 + ", vehiculo2Electrico=" + vehiculo2Electrico + ", vehiculo3=" + vehiculo3
				+ ", vehiculo3Electrico=" + vehiculo3Electrico + "]";
	}
	
	
	
	
	
	
	
}
