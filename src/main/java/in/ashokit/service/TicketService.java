package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.reppo.TicketResponserepo;
import in.ashokit.request.PassengerRequest;
import in.ashokit.response.TicketResponse;

@Service
public class TicketService {

	@Autowired
	private TicketResponserepo repo;
	
	public TicketResponse bookTicket(PassengerRequest request) {
		
		TicketResponse response = new TicketResponse();
		
			
	}
}
