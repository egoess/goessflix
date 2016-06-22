package net.apoplectic.goessflix.domain;

import org.springframework.data.annotation.Id;

public class UserProfile {

    enum AccountType {
        limited,
        full,
        trial
    }

    @Id
    private String id;
    private String firstName;
    private String lastName;

    private String username;
    private String passwordHash;

    private String recoveryQuestion;
    private String recoveryAnswerHash; //hash the answer?

    private Boolean isLocked;
    private AccountType accountType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getRecoveryQuestion() {
        return recoveryQuestion;
    }

    public void setRecoveryQuestion(String recoveryQuestion) {
        this.recoveryQuestion = recoveryQuestion;
    }

    public String getRecoveryAnswerHash() {
        return recoveryAnswerHash;
    }

    public void setRecoveryAnswerHash(String recoveryAnswerHash) {
        this.recoveryAnswerHash = recoveryAnswerHash;
    }

    public Boolean getLocked() {
        return isLocked;
    }

    public void setLocked(Boolean locked) {
        isLocked = locked;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
}
