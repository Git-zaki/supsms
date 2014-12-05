/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supsms.dao;

import javax.ejb.Local;
import supsms.dao.entity.User;
/**
 *
 * @author Oto
 */
@Local
public interface UserDao {

    User addUser(User user);

}
