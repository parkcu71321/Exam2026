package kr.ac.kopo.pcu.exam2026.repository;

import kr.ac.kopo.pcu.exam2026.domain.Member3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Entity이름과 Repository 이름이 일치해야한다.
@Repository
public interface Member3Repository extends JpaRepository<Member3, Integer> {

}
