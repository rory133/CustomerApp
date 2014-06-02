/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.custormerapp.ejb;

import com.customerapp.entity.Customer;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author rory
 */
@Stateless
public class CustomerSessionBean implements CustomerSessionBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
@PersistenceContext
private EntityManager em;

    public List <Customer> retrive() {
       Query query = em.createNamedQuery("Customer.findAll");
       return query.getResultList();
    }

    public Customer update(Customer customer) {
        return em.merge(customer);
    }
}
