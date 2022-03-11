package pc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pc.beans.Hardware;

/**
 * @author Owen Miner - osminer
 * CIS175 - Spring 2022
 * Mar 10, 2022
 */
@Repository
public interface HardwareRepository extends JpaRepository<Hardware, Long>{

}
