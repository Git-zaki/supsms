
package supsms.dao;

import javax.ejb.Local;
import supsms.dao.entity.SupUser;

@Local
public interface UserDao {

    SupUser addUser(SupUser user);

}
