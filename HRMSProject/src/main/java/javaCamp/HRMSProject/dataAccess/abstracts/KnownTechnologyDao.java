package javaCamp.HRMSProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javaCamp.HRMSProject.entities.concretes.KnownTechnology;

public interface KnownTechnologyDao extends JpaRepository<KnownTechnology,Integer>{

}
