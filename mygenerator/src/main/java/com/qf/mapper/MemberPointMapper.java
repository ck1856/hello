package com.qf.mapper;

import com.qf.pojo.MemberPoint;

public interface MemberPointMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_point
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_point
     *
     * @mbggenerated
     */
    int insert(MemberPoint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_point
     *
     * @mbggenerated
     */
    int insertSelective(MemberPoint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_point
     *
     * @mbggenerated
     */
    MemberPoint selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_point
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MemberPoint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_point
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MemberPoint record);
}