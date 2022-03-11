package cigma.pfe.models;

import javax.persistence.*;
import java.util.Date;

@Entity()
public class Facture {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Column
    Date date;
    @Column
    double amount;
    public Facture(){

    }

    public Facture(Date date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Facture{" + "id=" + id + ", date=" + date + ", amount=" + amount + '}';
    }
}
