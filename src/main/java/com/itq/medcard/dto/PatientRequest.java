//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.04.01 at 10:36:05 AM CDT
//


package com.itq.medcard.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="age"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minExclusive value="0"/&gt;
 *               &lt;maxInclusive value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gender"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Female"/&gt;
 *               &lt;enumeration value="Male"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="email"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[^@]+@[^.]+\..+"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="curp"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^[A-Z]{4}\d{6}[HM]{1}[A-Z]{2}[B-DF-HJ-NP-TV-Z]{3}\d{3}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="direction"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="outerNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="interiorNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="cologne" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="zipCode"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;pattern value="[0-9]{5}"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "fullName",
        "age",
        "gender",
        "email",
        "curp",
        "direction"
})
@XmlRootElement(name = "PatientRequest")
public class PatientRequest {

    @XmlElement(required = true)
    protected String fullName;
    protected int age;
    @XmlElement(required = true)
    protected String gender;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String curp;
    @XmlElement(required = true)
    protected PatientRequest.Direction direction;

    /**
     * Gets the value of the fullName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the age property.
     *
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     *
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * Gets the value of the gender property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the email property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the curp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCurp() {
        return curp;
    }

    /**
     * Sets the value of the curp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCurp(String value) {
        this.curp = value;
    }

    /**
     * Gets the value of the direction property.
     *
     * @return
     *     possible object is
     *     {@link PatientRequest.Direction }
     *
     */
    public PatientRequest.Direction getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     *
     * @param value
     *     allowed object is
     *     {@link PatientRequest.Direction }
     *
     */
    public void setDirection(PatientRequest.Direction value) {
        this.direction = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="outerNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="interiorNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="cologne" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="zipCode"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;pattern value="[0-9]{5}"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "street",
            "outerNumber",
            "interiorNumber",
            "cologne",
            "zipCode",
            "city",
            "state"
    })
    public static class Direction {

        @XmlElement(required = true)
        protected String street;
        @XmlElement(required = true)
        protected String outerNumber;
        protected String interiorNumber;
        @XmlElement(required = true)
        protected String cologne;
        @XmlElement(required = true)
        protected String zipCode;
        @XmlElement(required = true)
        protected String city;
        @XmlElement(required = true)
        protected String state;

        /**
         * Gets the value of the street property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getStreet() {
            return street;
        }

        /**
         * Sets the value of the street property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setStreet(String value) {
            this.street = value;
        }

        /**
         * Gets the value of the outerNumber property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getOuterNumber() {
            return outerNumber;
        }

        /**
         * Sets the value of the outerNumber property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setOuterNumber(String value) {
            this.outerNumber = value;
        }

        /**
         * Gets the value of the interiorNumber property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getInteriorNumber() {
            return interiorNumber;
        }

        /**
         * Sets the value of the interiorNumber property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setInteriorNumber(String value) {
            this.interiorNumber = value;
        }

        /**
         * Gets the value of the cologne property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCologne() {
            return cologne;
        }

        /**
         * Sets the value of the cologne property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCologne(String value) {
            this.cologne = value;
        }

        /**
         * Gets the value of the zipCode property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getZipCode() {
            return zipCode;
        }

        /**
         * Sets the value of the zipCode property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setZipCode(String value) {
            this.zipCode = value;
        }

        /**
         * Gets the value of the city property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCity() {
            return city;
        }

        /**
         * Sets the value of the city property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCity(String value) {
            this.city = value;
        }

        /**
         * Gets the value of the state property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getState() {
            return state;
        }

        /**
         * Sets the value of the state property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setState(String value) {
            this.state = value;
        }

    }

}
