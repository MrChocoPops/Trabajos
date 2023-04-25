/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app.dao;

/**
 *
 * @author Data_Science
 */
import java.util.List;
import java.util.Properties;
import com.mycompany.app.modelo.MenuMenuItenTO;
public interface MenuMenuItenDaoI {
public List<MenuMenuItenTO> listaAccesos(String perfil, Properties idioma);
}