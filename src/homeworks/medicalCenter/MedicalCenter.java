package homeworks.medicalCenter;

import homeworks.medicalCenter.model.Doctor;
import homeworks.medicalCenter.model.Patient;
import homeworks.medicalCenter.model.Profession;
import homeworks.medicalCenter.util.DateUtil;
import java.text.ParseException;
import java.util.Date;

public class MedicalCenter implements MedicalCenterCom {
    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            MedicalCenterCom.printCommands();
            String commands = scanner.nextLine();
            switch (commands) {
                case EXIT -> isRun = exit();
                case ADD_DOCTOR -> addDoctor();
                case SEARCH_DOCTOR_BY_PROFESSION -> personStorage.searchDoctorByProfession(doctorProfession());
                case DELETE_DOCTOR_BY_ID -> personStorage.deleteDoctorById(chooseDoctorId());
                case CHANGE_DOCTOR_BY_ID -> changeDoctorById(personStorage.getDoctorById(chooseDoctorId()));
                case ADD_PATIENT -> addPatient();
                case PRINT_ALL_PATIENTS_BY_DOCTOR -> personStorage.getPatientByDoctor(personStorage.getDoctorById(chooseDoctorId()));
                case PRINT_ALL_PATIENTS -> personStorage.printPatients();
            }
        }
    }

    private static void addPatient() {
        Patient patient = new Patient(patientID(), patientName(), patientSurname(), patientPhone(), personStorage.getDoctorById(chooseDoctorId()), patientRegisterDate());
        personStorage.add(patient);
        System.out.println("Patient added!");
    }

    private static Date patientRegisterDate() {
        System.out.print("Please input PATIENT_REGISTER_TIME(example: 01-01 09:00): ");
        String dateStr = check(scanner.nextLine());
        Date date = null;
        boolean right = true;
        while (right) {
            try {
                date = DateUtil.fromStringToDate(dateStr);
                right = false;
            } catch (ParseException e) {
                System.out.print("The entered the date incorrectly. " + e + " Try again(example: 01-01 09:00): ");
                dateStr = check(scanner.nextLine());
            }
        }
        return date;
    }

    private static String patientPhone() {
        System.out.print("Please input PATIENT_PHONE: ");
        String phone = check(scanner.nextLine());
        while (personStorage.checkPhone(phone)) {
            System.out.print("Such an PHONE already exists. Please input new PHONE: ");
            phone = check(scanner.nextLine());
        }
        return phone;
    }

    private static String patientSurname() {
        System.out.print("Please input PATIENT_SURNAME: ");
        return check(scanner.nextLine());
    }

    private static String patientName() {
        System.out.print("Please input PATIENT_NAME: ");
        return check(scanner.nextLine());
    }

    private static String patientID() {
        System.out.print("Please input PATIENT_ID: ");
        String id = check(scanner.nextLine());
        while (personStorage.checkId(id, true)) {
            System.out.print("Such an ID already exists. Please input new ID: ");
            id = check(scanner.nextLine());
        }
        return id;
    }

    private static void changeDoctorById(Doctor doctorByID) {
        if (doctorByID != null) {
            doctorByID.setName(doctorName());
            doctorByID.setSurname(doctorSurname());
            doctorByID.setPhone(doctorPhone());
            doctorByID.setEmail(doctorEmail());
            doctorByID.setProfession(doctorProfession());
        } else {
            System.out.println("Such an ID does not exist");
        }
    }

    private static void addDoctor() {
        Doctor doctor = new Doctor(doctorId(), doctorName(), doctorSurname(), doctorPhone(), doctorEmail(), doctorProfession());
        personStorage.add(doctor);
        System.out.println("doctor added!");
    }

    private static String doctorId() {
        System.out.print("Please input DOCTOR_ID: ");
        String id = check(scanner.nextLine());
        while (personStorage.checkId(id, true)) {
            System.out.print("Such an ID already exists. Please input new ID: ");
            id = check(scanner.nextLine());
        }
        return id;
    }

    private static String chooseDoctorId() {
        System.out.print("Please input DOCTOR_ID: ");
        String id = check(scanner.nextLine());
        while (personStorage.checkId(id, false)) {
            System.out.print("Such an ID does not exist. Please input an existing ID: ");
            id = scanner.nextLine();
        }
        return id;
    }

    private static String doctorName() {
        System.out.print("Please input DOCTOR_NAME: ");
        return check(scanner.nextLine());
    }

    private static String doctorSurname() {
        System.out.print("Please input DOCTOR_SURNAME: ");
        return check(scanner.nextLine());
    }

    private static String doctorPhone() {
        System.out.print("Please input DOCTOR_PHONE: ");
        String phone = check(scanner.nextLine());
        while (personStorage.checkPhone(phone)) {
            System.out.print("Such an PHONE already exists. Please input new PHONE: ");
            phone = check(scanner.nextLine());
        }
        return phone;
    }

    private static String doctorEmail() {
        System.out.print("Please input DOCTOR_EMAIL: ");
        String email = check(scanner.nextLine());
        while (personStorage.checkEmail(email)) {
            System.out.print("Such an EMAIL already exists. Please input new EMAIL: ");
            email = check(scanner.nextLine());
        }
        return email;
    }

    private static Profession doctorProfession() {
        MedicalCenterCom.printProfession();
        while (true) {
            String commands = scanner.nextLine();
            switch (commands) {
                case GENERAL_PRACTITIONER -> {
                    return Profession.GENERAL_PRACTITIONER;
                }
                case PEDIATRICIAN -> {
                    return Profession.PEDIATRICIAN;
                }
                case CARDIOLOGIST -> {
                    return Profession.CARDIOLOGIST;
                }
                case NEUROLOGIST -> {
                    return Profession.NEUROLOGIST;
                }
                case DERMATOLOGIST -> {
                    return Profession.DERMATOLOGIST;
                }
                default -> System.out.print("Wrong command. Try again: ");
            }
        }
    }

    private static boolean exit() {
        System.out.print("The application has shut down.");
        return false;
    }

    private static String check(String check) {
        boolean right = true;
        if (!check.isEmpty()) {
            return check;
        }
        while (right) {
            System.out.print("You haven't entered anything, try AGAIN: ");
            check = scanner.nextLine();
            if (!check.isEmpty()) {
                right = false;
            }
        }
        return check;
    }
}