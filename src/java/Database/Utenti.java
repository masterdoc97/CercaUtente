/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Leonardo
 */
@Entity
@Table(name = "utenti")
public class Utenti implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "Nome")
    private String nome;
    @Column(name = "Pass")
    private String pass;

    public Utenti() {
    }

    public Utenti(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
