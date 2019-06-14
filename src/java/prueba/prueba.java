/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import Dao.CategoriaDao;
import entidades.Categoria;

/**
 *
 * @author USUARIOWIN10
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CategoriaDao catedao = new CategoriaDao();
        Categoria cate= new Categoria(20, "Metales", "A");
        catedao.guardar(cate);
    }
    
}
