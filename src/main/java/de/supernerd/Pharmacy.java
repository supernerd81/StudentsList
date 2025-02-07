package de.supernerd;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Pharmacy {

    Map<String, Medication> medications;

    public Pharmacy() {
        medications = new HashMap<>();
    }

    public void save(Medication medication) {
        medications.put(medication.getName(), medication);
    }

    public int getCount() {
        return medications.size();
    }

    public Medication find(String medicationName) {

        if(medications.containsKey(medicationName)) {
            return medications.get(medicationName);
        }

        System.out.println("Medikament nicht vorhanden!");
        return null;
    }

    public void printAllMedis() {
        for (Medication obj : medications.values()) {
            System.out.println(obj);
        }
    }

    public void delete(String medicationName) {
        if(medications.containsKey(medicationName)) {
            medications.remove(medicationName);
            System.out.println("Medikament wurde gelöscht!");
        } else {
            System.out.println("Medikament nicht vorhanden und konnte daher nicht gelöscht werden!");
        }
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "medications=" + medications +
                '}';
    }

    public Pharmacy(Map<String, Medication> medications) {
        this.medications = medications;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return Objects.equals(medications, pharmacy.medications);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(medications);
    }
}
