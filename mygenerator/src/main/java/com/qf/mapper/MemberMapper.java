package com.qf.mapper;

import com.qf.pojo.Member;

public interface MemberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbggenerated
     */
    int insert(Member record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbggenerated
     */
    int insertSelective(Member record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbggenerated
     */
    Member selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Member record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Member record);
}