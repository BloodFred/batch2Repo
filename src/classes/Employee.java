package classes;

/**
 * Created by JPMPC-B205 on 11/10/2016.
 */
public class Employee extends Person {

    public String department;
    public long sssId;
    public long pagibigId;


    public String getDepartment(){ return department;}

    public void setDepartment(String department) {this.department = department;}

    public long getSssId() {return sssId;}

    public void setSssId(long sssId) {this.sssId = sssId;}

    public long getPagibigId() {return pagibigId;}

    public void setPagibigId(long pagibigId) {this.pagibigId = pagibigId;}




}
