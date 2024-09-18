package homeworks.medicalCenter.storage;

import homeworks.medicalCenter.model.Doctor;
import homeworks.medicalCenter.model.Patient;
import homeworks.medicalCenter.model.Person;
import homeworks.medicalCenter.model.Profession;

public class PersonStorage {
    Person[] data = new Person[10];
    int size;

    public void add(Person person) {
        if (size == data.length) {
            extendsStorage();
        }
        data[size++] = person;
    }

    private void extendsStorage() {
        Person[] tmp = new Person[10 + data.length];
        System.arraycopy(data, 0, tmp, 0, size);
        data = tmp;
    }

    public void printPatients() {
        for (Person person : data) {
            if (person instanceof Patient) {
                System.out.println(person);
            }
        }
    }

    public boolean checkId(String id, boolean right) {
        for (int i = 0; i < size; i++) {
            if (data[i].getId().equalsIgnoreCase(id)) {
                return right;
            }
        }
        return !right;
    }

    public boolean checkPhone(String phone) {
        for (int i = 0; i < size; i++) {
            if (data[i].getPhone().equalsIgnoreCase(phone)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (data[i] instanceof Doctor doctor) {
                if (doctor.getEmail().equals(email)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void searchDoctorByProfession(Profession profession) {
        for (int i = 0; i < size; i++) {
            if (data[i] instanceof Doctor doctor) {
                if (doctor.getProfession().equals(profession)) {
                    System.out.println(doctor);
                }
            }
        }
    }

    public void deleteDoctorById(String id) {
        int index = getIndexByDoctorId(id);
        if (index != -1) {
            for (int i = index + 1; i < size; i++) {
                data[i - 1] = data[i];
            }
        }
    }

    private int getIndexByDoctorId(String id) {
        for (int i = 0; i < size; i++) {
            if (data[i] instanceof Doctor) {
                if (data[i].getId().equalsIgnoreCase(id)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public Doctor getDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            if (data[i] instanceof Doctor doctor) {
                if (doctor.getId().equalsIgnoreCase(id)) {
                    return doctor;
                }
            }
        }
        return null;
    }

    public void getPatientByDoctor(Doctor doctorById) {
        for (int i = 0; i < size; i++) {
            if (data[i] instanceof Patient patient){
                if (patient.getDoctor().equals(doctorById)) {
                    System.out.println(patient);
                }
            }
        }
    }
}