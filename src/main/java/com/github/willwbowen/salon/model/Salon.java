package com.github.willwbowen.salon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="salons")
public class Salon {
    @Id
    @Column(name="salon_id", nullable = false)
    String salonId;
    @Column(name = "name", nullable = false)
    String name;
    @Column(name="contact_name", nullable = false)
    String contactName;
    @Column(name="contact_email", nullable = false)
    String contactEmail;
    @Column(name="contact_phone", nullable = false)
    String contactPhone;

    public String getSalonId() {
        return salonId;
    }

    public void setSalonId(String salonId) {
        this.salonId = salonId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
}
