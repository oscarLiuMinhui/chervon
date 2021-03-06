package com.chervon.iot.mobile.mapper;

import com.chervon.iot.mobile.model.MsgTable;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface MsgTableMapper {
    /**
     * 批量插入数据
     * @param msgTables
     */
    void insertBatch(List<MsgTable> msgTables);

    /**
     * 根据类型查询json字段
     * @param msgtype
     * @return
     */
    List<MsgTable> selectByMsgtype(MsgTable msgtype);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msgtable
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msgtable
     *
     * @mbggenerated
     */
    int insert(MsgTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msgtable
     *
     * @mbggenerated
     */
    int insertSelective(MsgTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msgtable
     *
     * @mbggenerated
     */
    MsgTable selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msgtable
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MsgTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msgtable
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MsgTable record);

    class Priority {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database column priority.id
         *
         * @mbggenerated
         */
        private Integer id;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database column priority.code
         *
         * @mbggenerated
         */
        private Integer code;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database column priority.msgtype
         *
         * @mbggenerated
         */
        private String msgtype;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database column priority.number
         *
         * @mbggenerated
         */
        private Long number;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database column priority.createtime
         *
         * @mbggenerated
         */
        private Date createtime;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database column priority.durtime
         *
         * @mbggenerated
         */
        private Date durtime;

        /**
         * This method was generated by MyBatis Generator.
         * This method returns the value of the database column priority.id
         *
         * @return the value of priority.id
         *
         * @mbggenerated
         */
        public Integer getId() {
            return id;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column priority.id
         *
         * @param id the value for priority.id
         *
         * @mbggenerated
         */
        public void setId(Integer id) {
            this.id = id;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method returns the value of the database column priority.code
         *
         * @return the value of priority.code
         *
         * @mbggenerated
         */
        public Integer getCode() {
            return code;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column priority.code
         *
         * @param code the value for priority.code
         *
         * @mbggenerated
         */
        public void setCode(Integer code) {
            this.code = code;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method returns the value of the database column priority.msgtype
         *
         * @return the value of priority.msgtype
         *
         * @mbggenerated
         */
        public String getMsgtype() {
            return msgtype;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column priority.msgtype
         *
         * @param msgtype the value for priority.msgtype
         *
         * @mbggenerated
         */
        public void setMsgtype(String msgtype) {
            this.msgtype = msgtype == null ? null : msgtype.trim();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method returns the value of the database column priority.number
         *
         * @return the value of priority.number
         *
         * @mbggenerated
         */
        public Long getNumber() {
            return number;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column priority.number
         *
         * @param number the value for priority.number
         *
         * @mbggenerated
         */
        public void setNumber(Long number) {
            this.number = number;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method returns the value of the database column priority.createtime
         *
         * @return the value of priority.createtime
         *
         * @mbggenerated
         */
        public Date getCreatetime() {
            return createtime;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column priority.createtime
         *
         * @param createtime the value for priority.createtime
         *
         * @mbggenerated
         */
        public void setCreatetime(Date createtime) {
            this.createtime = createtime;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method returns the value of the database column priority.durtime
         *
         * @return the value of priority.durtime
         *
         * @mbggenerated
         */
        public Date getDurtime() {
            return durtime;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column priority.durtime
         *
         * @param durtime the value for priority.durtime
         *
         * @mbggenerated
         */
        public void setDurtime(Date durtime) {
            this.durtime = durtime;
        }
    }
}