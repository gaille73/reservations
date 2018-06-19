package org.ballet.guy.reservations.data.repository;

import org.ballet.guy.reservations.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room,Long> {
	Room findByNumber(String number);
}
