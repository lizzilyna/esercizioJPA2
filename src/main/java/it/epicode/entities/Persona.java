package it.epicode.entities;

import javax.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "persona") //sennò postesql impazzisce per la maiuscola
public class Persona {

@Id //vuol dire che è la chiave primaria
@GeneratedValue (strategy = GenerationType.AUTO)//gli dico di creare il valore dell'id con la strategia auto;
private int id;

private String nome;
private String cognome;
@Column(name = "data_nascita") private LocalDate dataNascita;
@Enumerated(EnumType.STRING) private Mestiere mestiere;
    public Persona(){

    }

    public Persona(int id, String nome, String cognome, LocalDate dataNascita, Mestiere mestiere) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.mestiere = mestiere;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public Mestiere getMestiere() {
        return mestiere;
    }

    public void setMestiere(Mestiere mestiere) {
        this.mestiere = mestiere;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataNascita=" + dataNascita +
                ", mestiere=" + mestiere +
                '}';
    }
}
