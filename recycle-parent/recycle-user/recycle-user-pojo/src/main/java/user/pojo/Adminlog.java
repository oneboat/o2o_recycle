package user.pojo;

import java.io.Serializable;
import java.util.Date;

public class Adminlog implements Serializable{
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column adminlog.id
     *
     * @mbg.generated Thu Mar 15 10:40:36 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column adminlog.adminId
     *
     * @mbg.generated Thu Mar 15 10:40:36 CST 2018
     */
    private String adminid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column adminlog.adminOperationTime
     *
     * @mbg.generated Thu Mar 15 10:40:36 CST 2018
     */
    private Date adminoperationtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column adminlog.adminOperationTable
     *
     * @mbg.generated Thu Mar 15 10:40:36 CST 2018
     */
    private String adminoperationtable;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column adminlog.adminOperationAction
     *
     * @mbg.generated Thu Mar 15 10:40:36 CST 2018
     */
    private String adminoperationaction;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column adminlog.id
     *
     * @return the value of adminlog.id
     *
     * @mbg.generated Thu Mar 15 10:40:36 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column adminlog.id
     *
     * @param id the value for adminlog.id
     *
     * @mbg.generated Thu Mar 15 10:40:36 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column adminlog.adminId
     *
     * @return the value of adminlog.adminId
     *
     * @mbg.generated Thu Mar 15 10:40:36 CST 2018
     */
    public String getAdminid() {
        return adminid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column adminlog.adminId
     *
     * @param adminid the value for adminlog.adminId
     *
     * @mbg.generated Thu Mar 15 10:40:36 CST 2018
     */
    public void setAdminid(String adminid) {
        this.adminid = adminid == null ? null : adminid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column adminlog.adminOperationTime
     *
     * @return the value of adminlog.adminOperationTime
     *
     * @mbg.generated Thu Mar 15 10:40:36 CST 2018
     */
    public Date getAdminoperationtime() {
        return adminoperationtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column adminlog.adminOperationTime
     *
     * @param adminoperationtime the value for adminlog.adminOperationTime
     *
     * @mbg.generated Thu Mar 15 10:40:36 CST 2018
     */
    public void setAdminoperationtime(Date adminoperationtime) {
        this.adminoperationtime = adminoperationtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column adminlog.adminOperationTable
     *
     * @return the value of adminlog.adminOperationTable
     *
     * @mbg.generated Thu Mar 15 10:40:36 CST 2018
     */
    public String getAdminoperationtable() {
        return adminoperationtable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column adminlog.adminOperationTable
     *
     * @param adminoperationtable the value for adminlog.adminOperationTable
     *
     * @mbg.generated Thu Mar 15 10:40:36 CST 2018
     */
    public void setAdminoperationtable(String adminoperationtable) {
        this.adminoperationtable = adminoperationtable == null ? null : adminoperationtable.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column adminlog.adminOperationAction
     *
     * @return the value of adminlog.adminOperationAction
     *
     * @mbg.generated Thu Mar 15 10:40:36 CST 2018
     */
    public String getAdminoperationaction() {
        return adminoperationaction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column adminlog.adminOperationAction
     *
     * @param adminoperationaction the value for adminlog.adminOperationAction
     *
     * @mbg.generated Thu Mar 15 10:40:36 CST 2018
     */
    public void setAdminoperationaction(String adminoperationaction) {
        this.adminoperationaction = adminoperationaction == null ? null : adminoperationaction.trim();
    }
}