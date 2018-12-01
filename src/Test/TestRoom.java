package Test;

import org.junit.*;

import domain.login.*;
import static org.junit.Assert.*;
public class TestRoom {
	@Test
	public void testAddRoom() {
		Room r = new Room();
		RoomDao roomDao = new RoomDaoImpl();
		r.setNumberOfRooms("2");
		r.setRoomType("Presidential Suite");
		r.setRoomNumber("801");
		boolean a = true;
		if(roomDao.addNewRoom(r) == 0) {
			a = false;
		}	
		assertTrue ("abc", a);
		assertTrue ("THIS IS WORKING", true);
	}
}