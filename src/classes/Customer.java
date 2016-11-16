package classes;

/**
 * Created by JPMPC-B205 on 11/10/2016.
 */
public class Customer extends Person{

    public long customerId;
    public int membershipLevel;
    public long creditCardNumber;


    public long getCustomerId() {return customerId;}

    public void setCustomerId(long customerId) {this.customerId = customerId;}

    public int getMembershipLevel() {return membershipLevel;}

    public void setMembershipLevel(int membershipLevel) {this.membershipLevel = membershipLevel;}

    public long getCreditCardNumber() {return creditCardNumber;}

    public void setCreditCardNumber(long creditCardNumber) {this.creditCardNumber = creditCardNumber;}
}
