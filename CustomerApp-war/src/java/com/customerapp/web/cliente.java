/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.customerapp.web;

import com.custormerapp.ejb.CustomerSession;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author rory
 */
@Named(value = "cliente")
@SessionScoped
public class cliente implements Serializable {
    @EJB
    private CustomerSession customerSession;

    /**
     * Creates a new instance of cliente
     */
    public cliente() {
    }
    
    
}
