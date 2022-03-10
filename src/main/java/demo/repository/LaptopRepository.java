package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.beans.Laptop;

/**
 * @author Corey Connor - cconnor3
 * CIS175 - Spring 2022
 * Mar 10, 2022
 */

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

}
