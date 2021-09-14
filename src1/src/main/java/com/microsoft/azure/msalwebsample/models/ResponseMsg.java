// Welcome6.java

package com.microsoft.azure.msalwebsample.models;

import java.util.UUID;

public class ResponseMsg {
        private Object preferredLanguage;
        private String mail;
        private String displayName;
        private String givenName;
        private String jobTitle;
        private String odataContext;
        private String odataID;
        private String[] businessPhones;
        private Object mobilePhone;
        private String officeLocation;
        private String surname;
        private UUID id;
        private String userPrincipalName;

        public Object getPreferredLanguage() { return preferredLanguage; }
        public void setPreferredLanguage(Object value) { this.preferredLanguage = value; }

        public String getMail() { return mail; }
        public void setMail(String value) { this.mail = value; }

        public String getDisplayName() { return displayName; }
        public void setDisplayName(String value) { this.displayName = value; }

        public String getGivenName() { return givenName; }
        public void setGivenName(String value) { this.givenName = value; }

        public String getJobTitle() { return jobTitle; }
        public void setJobTitle(String value) { this.jobTitle = value; }

        public String getOdataContext() { return odataContext; }
        public void setOdataContext(String value) { this.odataContext = value; }

        public String getOdataID() { return odataID; }
        public void setOdataID(String value) { this.odataID = value; }

        public String[] getBusinessPhones() { return businessPhones; }
        public void setBusinessPhones(String[] value) { this.businessPhones = value; }

        public Object getMobilePhone() { return mobilePhone; }
        public void setMobilePhone(Object value) { this.mobilePhone = value; }

        public String getOfficeLocation() { return officeLocation; }
        public void setOfficeLocation(String value) { this.officeLocation = value; }

        public String getSurname() { return surname; }
        public void setSurname(String value) { this.surname = value; }

        public UUID getID() { return id; }
        public void setID(UUID value) { this.id = value; }

        public String getUserPrincipalName() { return userPrincipalName; }
        public void setUserPrincipalName(String value) { this.userPrincipalName = value; }
}
