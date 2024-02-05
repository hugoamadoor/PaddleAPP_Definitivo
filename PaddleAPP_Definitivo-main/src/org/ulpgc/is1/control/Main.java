package org.ulpgc.is1.control;
import org.ulpgc.is1.model.*;

public class Main {
    public static void init (PaddleManager manager) {

        manager.addCustomer("Paco", "Martel", "54161181E", 1, "Los Majuelos", 9, 35217, "Valsequillo");
        manager.addCustomer("Amador", "Rivas", "12SD34TT4");

        manager.addCourt("Fast Court", 30, CourtType.FastCourt);
        manager.addCourt("Slow Court", 20, CourtType.SlowCourt);

    }
    public static void main(String[] args) {
        PaddleManager controller = new PaddleManager();
        init(controller);

        System.out.println(controller.getCustomer(0));
        System.out.println(controller.getCustomer(1));
        System.out.println("Existen actualmente " + controller.countCustomer() + " miembro/s en el club. \n");

        System.out.println(controller.getCourt(1) + "\n");

        Reservation reservation = new Reservation(controller.getCustomer(0), controller.getCourt(1));
        reservation.addExtra(new Umpire("Cristian", "Estupiñan", 90));
        reservation.addExtra(new Equipment("2 Raquetas + 4 pelotas", 20));
        controller.reserve(reservation);

        controller.remove(1);
        System.out.println("Miembro eliminado. \n");

        System.out.println(controller.getCustomer(1) == null ? "No existe" : controller.getCustomer(1));
        System.out.println("Existen actualmente " + controller.countCustomer() + " miembro/s en el club. \n\n");

        for (Reservation res: controller.getReservations()){
            System.out.println(res);
        }
    }
}