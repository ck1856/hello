package com.qf.pojo;

public class Member {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.username
     *
     * @mbggenerated
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.password
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.source
     *
     * @mbggenerated
     */
    private Byte source;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.id
     *
     * @return the value of member.id
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.id
     *
     * @param id the value for member.id
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.username
     *
     * @return the value of member.username
     * @mbggenerated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.username
     *
     * @param username the value for member.username
     * @mbggenerated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.password
     *
     * @return the value of member.password
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.password
     *
     * @param password the value for member.password
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.source
     *
     * @return the value of member.source
     * @mbggenerated
     */
    public Byte getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.source
     *
     * @param source the value for member.source
     * @mbggenerated
     */
    public void setSource(Byte source) {
        this.source = source;
    }
}