package hastane;

public class HospitalRunner {

	private static Hospital hpt1 = new Hospital();

	public static void main(String[] args) {
		String patientCase = "Corona", title = doctorTitle(patientCase);

		hpt1.setDoctor(findDoctor(title));
		hpt1.setPatient(findPatient(patientCase));

		System.out.print("Doctor Name : "+hpt1.getDoctor().getName());
		System.out.println("," + hpt1.getDoctor().getLastName());
		System.out.println("Doctor Title : "+hpt1.getDoctor().getTitle());
		System.out.print("\nPatient Name : " + hpt1.getPatient().getName());
		System.out.println("," + hpt1.getPatient().getLastName());
		System.out.println("Patient ID :"+hpt1.getPatient().getPatientId());
		System.out.println("Patient Actual Case :"+hpt1.getPatient().getPatientCase().getActualCase());
		System.out.println("Patient Emergency :"+hpt1.getPatient().getPatientCase().getEmergency());

	}

	public static String doctorTitle(String actualCase) {
		if (actualCase.equals("Allergies"))
			return hpt1.titles[0];
		else if (actualCase.equals("Diabetes"))
			return hpt1.titles[1];
		else if (actualCase.equals("Heart diseases"))
			return hpt1.titles[2];
		else if (actualCase.equals("Migraine"))
			return hpt1.titles[3];
		else if (actualCase.equals("Corona"))
			return hpt1.titles[4];
		else if (actualCase.equals("Cold"))
			return hpt1.titles[5];
		else if (actualCase.equals("Headaches"))
			return hpt1.titles[6];
		else
			return "wrong title";

	}

	public static Doctor findDoctor(String title) {
		Doctor doctor = new Doctor();
		for (int i = 0; i < hpt1.titles.length; i++) {
			if(hpt1.titles[i].equals(title)){
				doctor.setName(hpt1.doctorNames[i]);
				doctor.setLastName(hpt1.doctorLastNames[i]);
				doctor.setTitle(hpt1.titles[i]);
			}

		}
		return doctor;
	}

	public static Case findPatientCase(String actualCase) {
		Case patientCase = new Case();
		switch (actualCase) {
		case "Allergies":
			patientCase.setEmergency(false);
			break;
		case "Diabetes":
			patientCase.setEmergency(false);
			break;
		case "Heart diseases":
			patientCase.setEmergency(true);
			break;
		case "Migraine":
			patientCase.setEmergency(true);
			break;
		case "Corona":
			patientCase.setEmergency(true);
			break;
		case "Cold":
			patientCase.setEmergency(false);
			break;
		case "Headaches":
			patientCase.setEmergency(false);
			break;
		default:
			System.out.println("Not a valid case");
			break;

		}

		patientCase.setActualCase(actualCase);
		return patientCase;
	}

	public static Patient findPatient(String actualCase) {
		Patient patient = new Patient();

		for (int i = 0; i < hpt1.cases.length; i++) {
			if (actualCase.equals(hpt1.cases[i])) {
				patient.setPatientCase(findPatientCase(actualCase));
				patient.setName(hpt1.patientNames[i]);
				patient.setLastName(hpt1.patientLastNames[i]);
				patient.setPatientId(hpt1.patientIds[i]);
			}
		}

		return patient;
	}
}
