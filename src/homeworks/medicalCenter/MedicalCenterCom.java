package homeworks.medicalCenter;

import homeworks.medicalCenter.model.Profession;
import homeworks.medicalCenter.storage.PersonStorage;

import java.util.Scanner;

public interface MedicalCenterCom {
    Scanner scanner = new Scanner(System.in);
    PersonStorage personStorage = new PersonStorage();
    String EXIT = "0";
    String ADD_DOCTOR = "1";
    String SEARCH_DOCTOR_BY_PROFESSION = "2";
    String DELETE_DOCTOR_BY_ID = "3";
    String CHANGE_DOCTOR_BY_ID = "4";
    String ADD_PATIENT = "5";
    String PRINT_ALL_PATIENTS_BY_DOCTOR = "6";
    String PRINT_ALL_PATIENTS = "7";
    String GENERAL_PRACTITIONER = "1";
    String PEDIATRICIAN = "2";
    String CARDIOLOGIST = "3";
    String NEUROLOGIST = "4";
    String DERMATOLOGIST = "5";

    static void printCommands() {
        System.out.println("Please input '" + EXIT + "' for exit.");
        System.out.println("Please input '" + ADD_DOCTOR + "' for add doctor.");
        System.out.println("Please input '" + SEARCH_DOCTOR_BY_PROFESSION + "' for search doctor by profession.");
        System.out.println("Please input '" + DELETE_DOCTOR_BY_ID + "' for delete doctor by id.");
        System.out.println("Please input '" + CHANGE_DOCTOR_BY_ID + "' for change doctor by id.");
        System.out.println("Please input '" + ADD_PATIENT + "' for add patient.");
        System.out.println("Please input '" + PRINT_ALL_PATIENTS_BY_DOCTOR + "' for print all patients by doctor.");
        System.out.println("Please input '" + PRINT_ALL_PATIENTS + "' for print all patients.");
    }

    static void printProfession() {
        System.out.println("Please input '" + GENERAL_PRACTITIONER + "' to select a " + Profession.GENERAL_PRACTITIONER);
        System.out.println("Please input '" + PEDIATRICIAN + "' to select a " + Profession.PEDIATRICIAN);
        System.out.println("Please input '" + CARDIOLOGIST + "' to select a " + Profession.CARDIOLOGIST);
        System.out.println("Please input '" + NEUROLOGIST + "' to select a " + Profession.NEUROLOGIST);
        System.out.println("Please input '" + DERMATOLOGIST + "' to select a " + Profession.DERMATOLOGIST);
    }
}