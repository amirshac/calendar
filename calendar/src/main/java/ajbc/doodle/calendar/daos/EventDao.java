package ajbc.doodle.calendar.daos;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Transactional;

import ajbc.doodle.calendar.entities.Event;
import ajbc.doodle.calendar.entities.User;



@Transactional(rollbackFor = {DaoException.class}, readOnly = true)
public interface EventDao {

	//CRUD operations
	@Transactional(readOnly = false)
	public void addEvent(Event event) throws DaoException;

	@Transactional(readOnly = false)
	public void updateEvent(Event event) throws DaoException;

	public Event getEvent(int eventId) throws DaoException;

	@Transactional(readOnly = false)
	void deleteEvent(int eventId) throws DaoException;
	

//	@Transactional(readOnly = false)
//	public default void deleteUser(Integer userId) throws DaoException{
//		throw new DaoException("Method not implemented");
//	}
//	
//	//@Transactional(readOnly = false)
//	public default List<User> getAllUsers() throws DaoException{
//		throw new DaoException("Method not implemented");
//	}
//	
//	@Transactional(readOnly = false)
//	public default void hardDeleteAllUsers() throws DataAccessException, DaoException {
//		throw new DaoException("Method not implemented");
//	}

	//Queries
	
	
}
