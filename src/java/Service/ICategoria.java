/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import entidades.Categoria;
import java.util.ArrayList;

/**
 *
 * @author USUARIOWIN10
 */
public interface ICategoria {
    public abstract void guardar(Categoria cate);
    public abstract void actualizar();
    public abstract ArrayList<Categoria> listar();
    public abstract void eliminar();
            
   
    
}
