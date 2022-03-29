/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import javax.swing.JOptionPane;

/**
 *
 * @author jasonvillarrreal
 */
public class colabodar extends persona {
    private String puesto;
    private String deparmento;
    private int salario;

    public colabodar(String puesto, String deparmento, int salario, String nombre, int edad, char genero) {
        super(nombre, edad, genero);
        this.puesto = puesto;
        this.deparmento = deparmento;
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDeparmento() {
        return deparmento;
    }

    public void setDeparmento(String deparmento) {
        this.deparmento = deparmento;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void MostrarDatos() {
        JOptionPane.showMessageDialog(null,"El nombre es :" +getNombre()
        +"\n la edad es :" +getEdad()
        +"\n El genero es :"+getGenero()
        +"\n El salario es :"+salario
        +"El puesto es :" +puesto
        +"\n El departamento es :"+deparmento);
    
    }
    
    
    
}
