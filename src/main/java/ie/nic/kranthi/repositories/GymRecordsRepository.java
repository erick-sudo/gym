package ie.nic.kranthi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ie.nic.kranthi.entities.GymRecord;

public interface GymRecordsRepository extends JpaRepository<GymRecord, Long> {
}