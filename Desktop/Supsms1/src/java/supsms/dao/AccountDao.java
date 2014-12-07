
package supsms.dao;

import javax.ejb.Local;
import supsms.dao.entity.User;

@Local
public interface UserDao {

    User addUser(User user);

}
