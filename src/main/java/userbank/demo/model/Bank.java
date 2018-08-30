package userbank.demo.model;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.ManyToAny;
import org.omg.CORBA.portable.Streamable;
import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.*;

@Entity
@Table(name = "/banks")
public class Bank {
    @Id
    @Column (name = "bank_id")
    private long idBank;
    @Column (name = "bank_name")
    private String name;
    @Column (name = "bank_account")
    private String account;
    @Column (name = "user_id")
    private long idUser;
    //@ManyToOne(fetch = "user_id")
    private User user;

    public long getIdBank() {
        return idBank;
    }

    public void setIdBank(long idBank) {
        this.idBank = idBank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }
}
