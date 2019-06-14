/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Service.ICategoria;
import entidades.Categoria;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.Transaction;
import prueba.HibernateUtil;

/**
 *
 * @author USUARIOWIN10
 */
public class CategoriaDao implements ICategoria {

    Session session;

    @Override
    public void guardar(Categoria cate) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.save(cate);
        transaction.commit();
    }

    @Override
    public void actualizar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Categoria> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
