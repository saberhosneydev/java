package code;

public class CustomException extends Exception {
	private String codeNumber = null;
    public CustomException(String text, String code) {
        super(text);
        codeNumber = code;
    }
    @Override
    public String getMessage(){
    	return "Bus Ticket Reservation :" + super.getMessage();
    }

    public String getMessageAndCode(){
    	return "BusTicketReservation:" + super.getMessage() + " error no." + codeNumber;
    }

}
