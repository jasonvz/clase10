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
public class PrincipalColaborador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Colaborador datos = new Colaborador();
       datos.setNombre(JOptionPane.showInputDialog("Digite el nombre del colaborador:"));
       datos.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del colaborador:")));
       datos.setNombre(JOptionPane.showInputDialog("Digite el genero del M O F").charAt(0));
       datos.setSalario(Integer.parseInt(JOptionPane.showInputDialog("Digite el salario del colaborador:")));
       datos.setPuesto(JOptionPane.showInputDialog("Digite el Puesto del colaborador:"));
       datos.setDeparmento(JOptionPane.showInputDialog("Digite el departamento del colaborador:"));
       datos.MostrarDatos();
        
       
    }
    
}
