package com.qf.mapper;

import com.qf.pojo.MemberFav;

public interface MemberFavMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_fav
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_fav
     *
     * @mbggenerated
     */
    int insert(MemberFav record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_fav
     *
     * @mbggenerated
     */
    int insertSelective(MemberFav record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_fav
     *
     * @mbggenerated
     */
    MemberFav selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_fav
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MemberFav record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_fav
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MemberFav record);
}