package restfull.api.restfullapi.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Address implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	private Long addressId;
	
	@SuppressWarnings("unused")
	private String calle;
	
	@SuppressWarnings("unused")
	private String ciudad;
	
	@SuppressWarnings("unused")
	private String provincia;

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
}
