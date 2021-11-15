package in.ashokit.reppo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.response.TicketResponse;

public interface TicketResponserepo extends JpaRepository<TicketResponse, Serializable>{

}
