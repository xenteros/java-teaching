package patterns.model;

import java.util.Date;
import java.util.List;

/**
 * Created by agurgul on 05.07.2017.
 */
public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private Date createdAt;
    private Date lastUpdate;
    private List<String> moderationRoles;
    private String profileDescription;

    public User(Long id, String firstName, String lastName, Date dateOfBirth, Date createdAt, Date lastUpdate, List<String> moderationRoles, String profileDescription) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.createdAt = createdAt;
        this.lastUpdate = lastUpdate;
        this.moderationRoles = moderationRoles;
        this.profileDescription = profileDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public List<String> getModerationRoles() {
        return moderationRoles;
    }

    public void setModerationRoles(List<String> moderationRoles) {
        this.moderationRoles = moderationRoles;
    }

    public String getProfileDescription() {
        return profileDescription;
    }

    public void setProfileDescription(String profileDescription) {
        this.profileDescription = profileDescription;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", createdAt=" + createdAt +
                ", lastUpdate=" + lastUpdate +
                ", moderationRoles=" + moderationRoles +
                ", profileDescription='" + profileDescription + '\'' +
                '}';
    }

    public static class Builder {
        private Long id;
        private String firstName;
        private String lastName;
        private Date dateOfBirth;
        private Date createdAt;
        private Date lastUpdate;
        private List<String> moderationRoles;
        private String profileDescription;

        public Builder() {}

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withDateOfBirth(Date dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder withCreatedAt(Date createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder withUpdatedAt(Date updatedAt) {
            this.lastUpdate = updatedAt;
            return this;
        }

        public Builder withModerationRoles(List<String> moderationRoles) {
            this.moderationRoles = moderationRoles;
            return this;
        }

        public Builder withProfileDescription(String description) {
            this.profileDescription = description;
            return this;
        }

        public User build() {
            return of(this);
        }

        private User of(Builder builder) {
            return new User(id, firstName, lastName, dateOfBirth, createdAt, lastUpdate, moderationRoles, profileDescription);
        }









    }
}
