package ssm.pojo;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;

public class Employee {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_EMP.EMP_ID
     *
     * @mbg.generated Thu Feb 21 22:16:53 CST 2019
     */
    private Integer empId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_EMP.EMP_NAME
     *
     * @mbg.generated Thu Feb 21 22:16:53 CST 2019
     */
    @Pattern(regexp = "(^[a-zA-Z0-9_-]{6,16}$)|(^[\\u2E80-\\u9FFF]{2,5})"
    , message = "用户名必须是2-5位中文或者6-16位英文和数字的组合")
    private String empName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_EMP.GENDER
     *
     * @mbg.generated Thu Feb 21 22:16:53 CST 2019
     */
    private String gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_EMP.EMAIL
     *
     * @mbg.generated Thu Feb 21 22:16:53 CST 2019
     */
    @Pattern(regexp = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$"
    , message = "邮箱格式不正确")
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_EMP.D_ID
     *
     * @mbg.generated Thu Feb 21 22:16:53 CST 2019
     */
    private Integer dId;

    private Department department;

    public Employee() {
    }

    public Employee(Integer empId, String empName, String gender, String email, Integer dId) {
        this.empId = empId;
        this.empName = empName;
        this.gender = gender;
        this.email = email;
        this.dId = dId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_EMP.EMP_ID
     *
     * @return the value of TBL_EMP.EMP_ID
     *
     * @mbg.generated Thu Feb 21 22:16:53 CST 2019
     */
    public Integer getEmpId() {
        return empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_EMP.EMP_ID
     *
     * @param empId the value for TBL_EMP.EMP_ID
     *
     * @mbg.generated Thu Feb 21 22:16:53 CST 2019
     */
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_EMP.EMP_NAME
     *
     * @return the value of TBL_EMP.EMP_NAME
     *
     * @mbg.generated Thu Feb 21 22:16:53 CST 2019
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_EMP.EMP_NAME
     *
     * @param empName the value for TBL_EMP.EMP_NAME
     *
     * @mbg.generated Thu Feb 21 22:16:53 CST 2019
     */
    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_EMP.GENDER
     *
     * @return the value of TBL_EMP.GENDER
     *
     * @mbg.generated Thu Feb 21 22:16:53 CST 2019
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_EMP.GENDER
     *
     * @param gender the value for TBL_EMP.GENDER
     *
     * @mbg.generated Thu Feb 21 22:16:53 CST 2019
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_EMP.EMAIL
     *
     * @return the value of TBL_EMP.EMAIL
     *
     * @mbg.generated Thu Feb 21 22:16:53 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_EMP.EMAIL
     *
     * @param email the value for TBL_EMP.EMAIL
     *
     * @mbg.generated Thu Feb 21 22:16:53 CST 2019
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_EMP.D_ID
     *
     * @return the value of TBL_EMP.D_ID
     *
     * @mbg.generated Thu Feb 21 22:16:53 CST 2019
     */
    public Integer getdId() {
        return dId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_EMP.D_ID
     *
     * @param dId the value for TBL_EMP.D_ID
     *
     * @mbg.generated Thu Feb 21 22:16:53 CST 2019
     */
    public void setdId(Integer dId) {
        this.dId = dId;
    }
}