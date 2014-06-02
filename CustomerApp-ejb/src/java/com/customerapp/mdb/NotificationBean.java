/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.customerapp.mdb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSDestinationDefinition;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 *
 * @author rory
 */
@JMSDestinationDefinition(name = "jms/NotificationQueue", interfaceName = "javax.jms.Queue", resourceAdapter = "jmsra", destinationName = "NotificationQueue")
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/NotificationQueue")
})
public class NotificationBean implements MessageListener {
    
    public NotificationBean() {
    }
    
    @Override
    public void onMessage(Message message) {
    }
}
