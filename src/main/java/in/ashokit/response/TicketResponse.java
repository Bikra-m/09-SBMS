package in.ashokit.response;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Ticket_Response")
public class TicketResponse {

	@Id
	private Integer trainNo;
	private String name;
	private String from;
	private String to;
	private String trainName;
	private String status;
	private Integer price;	
	private Integer seatNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(Integer trainNo) {
		this.trainNo = trainNo;
	}

	public Integer getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(Integer seatNo) {
		this.seatNo = seatNo;
	}

	@Override
	public String toString() {
		return "TicketResponse [name=" + name + ", from=" + from + ", to=" + to + ", trainName=" + trainName
				+ ", status=" + status + ", price=" + price + ", trainNo=" + trainNo + ", seatNo=" + seatNo + "]";
	}

}
