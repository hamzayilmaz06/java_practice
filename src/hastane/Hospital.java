package hastane;

public class Hospital extends Data {

	Doctor doctor = new Doctor();
	Patient patient = new Patient();

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public static void main(String[] args) {
		
	}
}
