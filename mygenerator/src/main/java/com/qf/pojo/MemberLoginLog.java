package com.qf.pojo;

public class MemberLoginLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_login_log.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_login_log.member_id
     *
     * @mbggenerated
     */
    private Long memberId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_login_log.login_time
     *
     * @mbggenerated
     */
    private Integer loginTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_login_log.is_first
     *
     * @mbggenerated
     */
    private Byte isFirst;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_login_log.login_ip
     *
     * @mbggenerated
     */
    private String loginIp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_login_log.id
     *
     * @return the value of member_login_log.id
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_login_log.id
     *
     * @param id the value for member_login_log.id
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_login_log.member_id
     *
     * @return the value of member_login_log.member_id
     * @mbggenerated
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_login_log.member_id
     *
     * @param memberId the value for member_login_log.member_id
     * @mbggenerated
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_login_log.login_time
     *
     * @return the value of member_login_log.login_time
     * @mbggenerated
     */
    public Integer getLoginTime() {
        return loginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_login_log.login_time
     *
     * @param loginTime the value for member_login_log.login_time
     * @mbggenerated
     */
    public void setLoginTime(Integer loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_login_log.is_first
     *
     * @return the value of member_login_log.is_first
     * @mbggenerated
     */
    public Byte getIsFirst() {
        return isFirst;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_login_log.is_first
     *
     * @param isFirst the value for member_login_log.is_first
     * @mbggenerated
     */
    public void setIsFirst(Byte isFirst) {
        this.isFirst = isFirst;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_login_log.login_ip
     *
     * @return the value of member_login_log.login_ip
     * @mbggenerated
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_login_log.login_ip
     *
     * @param loginIp the value for member_login_log.login_ip
     * @mbggenerated
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }
}