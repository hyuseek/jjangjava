package org.jjang.day10.oop.motel.controller;

import java.util.ArrayList;
import java.util.List;

import org.jjang.day10.oop.motel.model.vo.Room;

public class MotelController {
	// * VO 없이 할 수도 있음
	List<Boolean> rooms;
	
	// *With VO - Room
	List<Room> roomList;

	public MotelController() {
		rooms = new ArrayList<Boolean>();
		roomList = new ArrayList<Room>(10);
		for (int i=0; i<10; i++) {
			rooms.add(false);
			roomList.add(new Room(false));
		}
	}
	
	
	
//	List<Room> roomList;
//
//	public MotelController() {
//		roomList = new ArrayList<Room>(10);
//		for (int i=0; i<10; i++) {
//			roomList.add(new Room(false));
//		}
//	}

	public void checkIn(int rnum) {
		// TODO Auto-generated method stub
		//rooms.add(true);
		rooms.set(rnum-1, true);
		roomList.set(rnum-1, new Room(true));
	}

	public void checkOut(int rnum) {
		// TODO Auto-generated method stub
		//rooms.add(false);
		rooms.set(rnum-1, false);
		roomList.set(rnum-1, new Room(false));
	}
	
	public List<Room> printAllRooms() {
		// TODO Auto-generated method stub
		return roomList;
	}

}
