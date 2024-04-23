/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea_18;

/**
 *
 * @author Cole
 * @version 1.0
 */
public class Tarea_18 {

private int daño;
    private double defensa;
    private String nombre;
    private boolean hab_pas;
    private double vida;
    private int lv;
    private static final int lv_boss_secret = 50;
    int cont_ob = 0;

    //Ej 2
    //Constructor por defecto
    public Tarea_18() {
        this.daño = 1;
        this.defensa = 1;
        this.nombre = "Sin asignar";
        this.hab_pas = false;
        this.vida = 0;
        this.lv = 0;
        this.cont_ob++;
    }

    //Constructor solo numericos
    public Tarea_18(int daño, int lv, double defensa, double vida) {
        this.daño = daño;
        this.defensa = defensa;
        this.vida = vida;
        this.lv = lv;
        this.cont_ob++;
    }

    //Constructor todos los atributos sin contador
    public Tarea_18(int daño, int lv, double defensa, double vida, String nombre, boolean hab) {
        this.daño = daño;
        this.defensa = defensa;
        this.nombre = nombre;
        this.hab_pas = hab;
        this.vida = vida;
        this.lv = lv;
    }

    //Ej 3
    public int getDaño() {
        return this.daño;
    }

    public double getDefensa() {
        return this.defensa;
    }

    public String getNombre() {
        return this.nombre;
    }

    public boolean getHabilidad_pas() {
        return this.hab_pas;
    }

    public double getVida() {
        return this.vida;
    }

    public int getLV() {
        return this.lv;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public void setDefensa(double def) {
        this.defensa = def;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHabilidad_pas(boolean hab) {
        this.hab_pas = hab;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public void setLV(int lv) {
        this.lv = lv;
    }

    @Override
    public String toString() {
        return "Tu personaje se llama " + this.nombre + " tiene " + this.daño +
                " tiene " + this.defensa + tipo_hab() + " y tu vida es de " + this.vida + " puntos";
    }

    //Ej 4
    public double calcu_daño(Tarea_18 p) {
        return this.daño - p.getDefensa();
    }

    //Por gusto
    public String tipo_hab() {
        if (this.hab_pas == true) {
            return " tiene habilidad pasiva";
        } else {
            return " no tienen habilidad pasiva";
        }
    }

    public double calcu_vida() {
        return this.vida - this.calcu_daño(this);
    }

    //Estatico
    public boolean Fight_boss() {
        if (this.lv >= lv_boss_secret) {
            return true;
        } else {
            return false;
        }
    }

    //equals
    public String comp_Hab(Tarea_18 p) {
        if (this.nombre.equals(p.getNombre())) {
            return "Ya tienes un personaje con este nombre";
        } else {
            return "Nombre aceptado";
        }
    }

}

