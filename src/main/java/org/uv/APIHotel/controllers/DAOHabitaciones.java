/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.APIHotel.controllers;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.uv.APIHotel.models.Habitaciones;
import org.uv.APIHotel.models.IDAOHabitaciones;

/**
 *
 * @author wbpat
 */
public class DAOHabitaciones implements IDAOHabitaciones<Habitaciones, Long>{

    @Override
    public Habitaciones createHab(Habitaciones h) {
        Session session = HibernateUtil.getSession();
        
        Transaction t= session.beginTransaction();
        session.save(h);
        t.commit();
        session.close();
        return h;
    }

    @Override
    public boolean deleteHab(Long id) {
        boolean b;
        Session session = HibernateUtil.getSession();
        Transaction t = session.beginTransaction();
        
        Habitaciones h = findByIdHab(id);
        if(h != null){
            session.delete(h);
            Logger.getLogger(Habitaciones.class.getName()).log(Level.INFO, "Se elimino producto");
            b = true;
        }else{
            b = false;
        }
        
        t.commit();
        session.close();
        return b;
    }

    @Override
    public Habitaciones updateHab(Habitaciones h, Long id) {
        Session session = HibernateUtil.getSession();
        
        Transaction t= session.beginTransaction();
        session.update(h);
        t.commit();
        session.close();
        return h;
    }

    @Override
    public List<Habitaciones> findAllHab() {
        Session session = HibernateUtil.getSession();
        Transaction t= session.beginTransaction();
        List<Habitaciones> lstHab = session.createQuery("from Habitaciones", Habitaciones.class).list();
        t.commit();
        session.close();
        return lstHab;
    }

    @Override
    public Habitaciones findByIdHab(Long id) {
        Session session = HibernateUtil.getSession();
        Transaction t= session.beginTransaction();
        Habitaciones h = session.get(Habitaciones.class, id);
        t.commit();
        session.close();
        return h;
    }

    
    
}
