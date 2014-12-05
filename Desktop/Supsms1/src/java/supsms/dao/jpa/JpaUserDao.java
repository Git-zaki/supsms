/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supsms.dao.jpa;

/**
 *
 * @author Oto
 */
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import supsms.dao.UserDao;
import supsms.dao.entity.User;

@Stateless
public class JpaUserDao implements UserDao {

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public User addUser(User user) {
        em.persist(user);
        return user;
    }
    
}
