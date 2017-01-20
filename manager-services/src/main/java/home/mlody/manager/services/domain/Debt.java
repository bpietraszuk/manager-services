package home.mlody.manager.services.domain;

import java.util.Date;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("debts")
public class Debt {

	@Id
	private ObjectId objectId;

	private String debtorName;
	private String receiverName;
	private double amount;
	private Date eventTime;
	private String comment;
	private boolean isPaid;

	public Debt() {
	}

	public Debt(ObjectId objectId, String debtorName, String receiverName, double amount, Date eventTime,
			String comment, boolean isPaid) {		
		this.objectId = objectId;
		this.debtorName = debtorName;
		this.receiverName = receiverName;
		this.amount = amount;
		this.eventTime = eventTime;
		this.comment = comment;
		this.isPaid = isPaid;
	}

	public String getDebtorName() {
		return debtorName;
	}

	public void setDebtorName(String debtorName) {
		this.debtorName = debtorName;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getEventTime() {
		return eventTime;
	}

	public void setEventTime(Date eventTime) {
		this.eventTime = eventTime;
	}

	public boolean isPaid() {
		return isPaid;
	}

	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}
}
