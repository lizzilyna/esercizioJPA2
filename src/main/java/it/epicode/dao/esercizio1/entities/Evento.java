package it.epicode.dao.esercizio1.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table (name="evento")
public class Evento {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String titolo;
    @Column(name="data_evento", nullable = false)
    private LocalDate dataEvento;

  @Enumerated(EnumType.STRING)
  private TipoEvento tipoEvento;

    @Column(name = "numero_partecipanti", nullable = false)
    private int numeroPartecipanti;

    public Evento() {
        this.id = id;
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.tipoEvento = tipoEvento;
        this.numeroPartecipanti = numeroPartecipanti;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getNumeroPartecipanti() {
        return numeroPartecipanti;
    }

    public void setNumeroPartecipanti(int numeroPartecipanti) {
        this.numeroPartecipanti = numeroPartecipanti;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", dataEvento=" + dataEvento +
                ", tipoEvento=" + tipoEvento +
                ", numeroPartecipanti=" + numeroPartecipanti +
                '}';
    }
}
