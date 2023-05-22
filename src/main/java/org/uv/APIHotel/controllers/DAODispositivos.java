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
import org.uv.APIHotel.models.Dispositivo;
import org.uv.APIHotel.models.IDAODispositivos;

/**
 *
 * @author wbpat
 */
public class DAODispositivos implements IDAODispositivos<Dispositivo, Long> {

    @Override
    public Dispositivo createDis(Dispositivo d) {
        Session session = HibernateUtil.getSession();
        
        Transaction t= session.beginTransaction();
        session.save(d);
        t.commit();
        session.close();
        return d;
    }

    @Override
    public boolean deleteDis(Long id) {
        boolean b;
        Session session = HibernateUtil.getSession();
        Transaction t = session.beginTransaction();
        
        Dispositivo p = findByIdDis(id);
        if(p != null){
            session.delete(p);
            Logger.getLogger(Dispositivo.class.getName()).log(Level.INFO, "Se elimino dispositivo");
            b = true;
        }else{
            b = false;
        }
        
        t.commit();
        session.close();
        return b;
    }

    @Override
    public Dispositivo updateDis(Dispositivo d, Long id) {
        Session session = HibernateUtil.getSession();
        
        Transaction t= session.beginTransaction();
        session.update(d);
        t.commit();
        session.close();
        return d;
    }

    @Override
    public List<Dispositivo> findAllDis() {
        Session session = HibernateUtil.getSession();
        Transaction t= session.beginTransaction();
        List<Dispositivo> lstDis = session.createQuery("from Dispositivo", Dispositivo.class).list();
        t.commit();
        session.close();
        return lstDis;
    }

    @Override
    public Dispositivo findByIdDis(Long id) {
        Session session = HibernateUtil.getSession();
        Transaction t= session.beginTransaction();
        Dispositivo d = session.get(Dispositivo.class, id);
        t.commit();
        session.close();
        return d;
    }
    
}
