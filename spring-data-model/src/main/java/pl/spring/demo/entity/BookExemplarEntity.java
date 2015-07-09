package pl.spring.demo.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "BOOK_EXEMPLAR")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class BookExemplarEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    @Column(nullable = false, length = 15)
    protected String serialNumber;

    protected boolean available;

    @ManyToOne
    @JoinColumn(name = "BOOK_FK", nullable = false)
    protected BookEntity book;

    @ManyToOne
    @JoinColumn(name = "LOAN_FK", nullable = true)
    protected LoanEntity loan;

    // for hibernate
    protected BookExemplarEntity() {
    }

    public BookExemplarEntity(String serialNumber, boolean available) {
        this.serialNumber = serialNumber;
        this.available = available;
    }

    public BookExemplarEntity(Long id, String serialNumber, boolean available) {
        this(serialNumber, available);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public BookEntity getBook() {
        return book;
    }

    public void setBook(BookEntity book) {
        this.book = book;
    }

    public LoanEntity getLoan() {
        return loan;
    }

    public void setLoan(LoanEntity loan) {
        this.loan = loan;
    }
}
