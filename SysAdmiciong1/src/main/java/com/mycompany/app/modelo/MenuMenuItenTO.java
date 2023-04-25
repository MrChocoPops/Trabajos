/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app.modelo;

/**
 *
 * @author Data_Science
 */
import lombok.Data;

@Data
public class MenuMenuItenTO {

    public String menunombre, menuitemnombre, nombreObj;

    public MenuMenuItenTO(String menunombre, String menuitemnombre, String nombreObj) {
        this.menunombre = menunombre;
        this.menuitemnombre = menuitemnombre;
        this.nombreObj = nombreObj;
    }

    public MenuMenuItenTO() {
    }
    
    
}
