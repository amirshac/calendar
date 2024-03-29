package ajbc.doodle.calendar.daos;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Transactional;

import ajbc.doodle.calendar.entities.User;


@Transactional(rollbackFor = {DaoException.class}, readOnly = true)
public interface UserDao {

	@Transactional(readOnly = false)
	public default void addUser(User user) throws DaoException {
		throw new DaoException("Method not implemented");
	}
	
	@Transactional(readOnly = false)
	public default void updateUser(User user) throws DaoException {
		throw new DaoException("Method not implemented");
	}

	@Transactional
	public default User getUserById(Integer userId) throws DaoException {
		throw new DaoException("Method not implemented");
	}
	
	public User getUserByEmail(String email) throws DaoException;
	
	@Transactional(readOnly = false)
	public default void deleteUser(Integer userId) throws DaoException{
		throw new DaoException("Method not implemented");
	}
	
	public default List<User> getAllUsers() throws DaoException{
		throw new DaoException("Method not implemented");
	}
	
	@Transactional(readOnly = false)
	public default void hardDeleteAllUsers() throws DataAccessException, DaoException {
		throw new DaoException("Method not implemented");
	}	
	
}
