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
public interface IDAODispositivos <T, ID> {
    public T createDis(T d);
    public boolean deleteDis(ID id);
    public T updateDis(T d, ID id);

    public List<T> findAllDis();
    public T findByIdDis(ID id);
}
