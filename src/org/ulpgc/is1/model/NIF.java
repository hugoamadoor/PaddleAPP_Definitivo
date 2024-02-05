package org.ulpgc.is1.model;

public class NIF {
    private String number;

    public NIF(String number) {
        setNumber(number);
    }

    private boolean isValid(String number) {
        if (number == null || number.length() != 9 || !Character.isLetter(number.charAt(8))) {
            return false;
        }

        String num = number.substring(0, 8).toUpperCase(); // Ensure consistency in letter case
        char letter = Character.toUpperCase(number.charAt(8));

        int dni;
        try {
            dni = Integer.parseInt(num);
        } catch (NumberFormatException e) {
            return false; // Invalid number format

        }

        String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letterCount = letters.charAt(dni % 23);
        return true;

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (isValid(number)) {
            this.number = number;
        } else {

            this.number = "XXXX";
        }
    }

    @Override
    public String toString() {
        return number;
    }
}