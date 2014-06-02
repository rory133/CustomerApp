/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.custormerapp.ejb;


import com.customerapp.entity.Customer;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author rory
 */
@Stateless
@LocalBean
public class CustomerSession {
    @PersistenceContext(unitName = "CustomerApp-ejbPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public List <Customer> retrive() {
       Query query = em.createNamedQuery("Customer.findAll");
       return query.getResultList();
    }

    public Customer update(Customer customer) {
        return em.merge(customer);
    }

}
