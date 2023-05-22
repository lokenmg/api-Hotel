/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.uv.APIHotel.models;

import java.util.List;

/**
 *
 * @author wbpat
 */
public interface IDAOHabitaciones <T, ID> {
    public T createHab(T h);
    public boolean deleteHab(ID id);
    public T updateHab(T h, ID id);

    public List<T> findAllHab();
    public T findByIdHab(ID id);
}
