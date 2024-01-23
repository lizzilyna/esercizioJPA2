package it.epicode.dao.esercizio1.dao;

import it.epicode.dao.esercizio1.entities.Evento;
import it.epicode.dao.esercizio1.entities.TipoEvento;

import java.time.LocalDate;

public class UsaEventoDAO {
    public static void main(String[] args) {
        EventoDAO dao=new EventoDAO();
        Evento e =new Evento();
        e.setTitolo("festa pensionamento");
        e.setTipoEvento(TipoEvento.PRIVATO);
        e.setNumeroPartecipanti(18);
        e.setDataEvento(LocalDate.of(2024,11,10));

        Evento e2=new Evento();
        e.setTitolo("inaugurazione ipermercato");
        e.setTipoEvento(TipoEvento.PUBBLICO);
        e.setNumeroPartecipanti(50);
        e.setDataEvento(LocalDate.of(2024, 3, 1));

        dao.mostrarEvento(e);
        System.out.println(e);

        dao.mostrarEvento(e2);
        System.out.println(e2);
    }
}
