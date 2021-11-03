/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclo3.reto3.reto3.repositor;

import ciclo3.reto3.reto3.model.Client;
import ciclo3.reto3.reto3.repository.crud.ReservationCrudRepository;
import ciclo3.reto3.reto3.model.Reservation;
import ciclo3.reto3.reto3.reportes.contadorClient;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Diana Romero
 */
@Repository
public class ReservationRepository {

    @Autowired
    private ReservationCrudRepository reservationCrudRepository;

    public List<Reservation> getAll() {
        return (List<Reservation>) reservationCrudRepository.findAll();
    }

    public Optional<Reservation> getReservation(int id) {
        return reservationCrudRepository.findById(id);
    }

    public Reservation save(Reservation reservation) {
        return reservationCrudRepository.save(reservation);
    }

    public void delete(Reservation reservation) {
        reservationCrudRepository.delete(reservation);
    }
    
    public List<Reservation> ReservationStatusRepositorio (String status){
         return reservationCrudRepository.findAllByStatus(status);
     }
     
     public List<Reservation> ReservationTiempoRepositorio (Date a, Date b){
         return reservationCrudRepository.findAllByStartDateAfterAndStartDateBefore(a, b);
     
     }
     
     public List<contadorClient> getClientesRepositorio(){
         List<contadorClient> res = new ArrayList<>();
         List<Object[]> report = reservationCrudRepository.countTotalReservationsByClient();
         for(int i=0; i<report.size(); i++){
             res.add(new contadorClient((Long)report.get(i)[1],(Client) report.get(i)[0]));
         }
         return res;
     }

}
