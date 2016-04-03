package pl.spring.demo.entity;

import pl.spring.demo.type.PersonalData;

import java.io.Serializable;

public class Author implements Serializable {

    protected Long id;

    protected String nickName;

    protected PersonalData personalData;

    protected long version;

    // for hibernate
    protected Author() {

    }

    public Author(Long id, PersonalData personalData, String nickName, long version) {
        this.id = id;
        this.version = version;
        this.personalData = personalData;
        this.nickName = nickName;
    }

    public Long getId() {
        return id;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public String getNickName() {
        return nickName;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }
}
