package in.ashokit.request;

public class PassengerRequest {

	private String name;
	private String from;
	private String to;
	private String trainName;
	private Integer trainNo;
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
		return "PassengerRequest [name=" + name + ", from=" + from + ", to=" + to + ", trainName=" + trainName
				+ ", trainNo=" + trainNo + ", seatNo=" + seatNo + "]";
	}

}
