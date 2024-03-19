package practica7;

/**
 * En este objeto se guardaran los datos importantes de cada accidentes de avion y luego si se 
 * muestra, mostrara todos sus datos
 */
public class Accidente {
	private String date;
	private String time;
	private String location;
	private String type;
	private String fatalities;
	
	public Accidente(String date,String time,String location,String type,String fatalities) {
		this.date = date;
		this.time = time;
		this.location = location;
		this.type = type;
		this.fatalities = fatalities;
	}
	

	public String getDate() {
		return date;
	}


	public String getTime() {
		return time;
	}


	public String getLocation() {
		return location;
	}


	public String getType() {
		return type;
	}


	public String getFatalities() {
		return fatalities;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public void setType(String type) {
		this.type = type;
	}


	public void setFatalities(String fatalities) {
		this.fatalities = fatalities;
	}


	@Override
	public String toString() {
		return "Accidente [date=" + date + ", time=" + time + ", location=" + location + ", type=" + type
				+ ", fatalities=" + fatalities + "]";
	}
	
}
