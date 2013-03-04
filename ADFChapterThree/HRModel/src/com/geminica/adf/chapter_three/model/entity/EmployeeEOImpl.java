package com.geminica.adf.chapter_three.model.entity;

import com.geminica.adf.chapter_three.model.entity.inheritance.MarketingBaseEmployeeEOImpl;

import java.math.BigDecimal;

import java.util.Locale;
import java.util.ResourceBundle;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.common.ResourceBundleDef;
import oracle.jbo.common.StringManager;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;


// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Mar 03 23:17:15 CET 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EmployeeEOImpl extends EntityImpl {
    private boolean isEmailUpdatable() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        EmployeeId {
            public Object get(EmployeeEOImpl obj) {
                return obj.getEmployeeId();
            }

            public void put(EmployeeEOImpl obj, Object value) {
                obj.setEmployeeId((Integer)value);
            }
        }
        ,
        FirstName {
            public Object get(EmployeeEOImpl obj) {
                return obj.getFirstName();
            }

            public void put(EmployeeEOImpl obj, Object value) {
                obj.setFirstName((String)value);
            }
        }
        ,
        LastName {
            public Object get(EmployeeEOImpl obj) {
                return obj.getLastName();
            }

            public void put(EmployeeEOImpl obj, Object value) {
                obj.setLastName((String)value);
            }
        }
        ,
        Email {
            public Object get(EmployeeEOImpl obj) {
                return obj.getEmail();
            }

            public void put(EmployeeEOImpl obj, Object value) {
                obj.setEmail((String)value);
            }
        }
        ,
        PhoneNumber {
            public Object get(EmployeeEOImpl obj) {
                return obj.getPhoneNumber();
            }

            public void put(EmployeeEOImpl obj, Object value) {
                obj.setPhoneNumber((String)value);
            }
        }
        ,
        HireDate {
            public Object get(EmployeeEOImpl obj) {
                return obj.getHireDate();
            }

            public void put(EmployeeEOImpl obj, Object value) {
                obj.setHireDate((Timestamp)value);
            }
        }
        ,
        JobId {
            public Object get(EmployeeEOImpl obj) {
                return obj.getJobId();
            }

            public void put(EmployeeEOImpl obj, Object value) {
                obj.setJobId((String)value);
            }
        }
        ,
        Salary {
            public Object get(EmployeeEOImpl obj) {
                return obj.getSalary();
            }

            public void put(EmployeeEOImpl obj, Object value) {
                obj.setSalary((BigDecimal)value);
            }
        }
        ,
        CommissionPct {
            public Object get(EmployeeEOImpl obj) {
                return obj.getCommissionPct();
            }

            public void put(EmployeeEOImpl obj, Object value) {
                obj.setCommissionPct((BigDecimal)value);
            }
        }
        ,
        ManagerId {
            public Object get(EmployeeEOImpl obj) {
                return obj.getManagerId();
            }

            public void put(EmployeeEOImpl obj, Object value) {
                obj.setManagerId((Integer)value);
            }
        }
        ,
        DepartmentId {
            public Object get(EmployeeEOImpl obj) {
                return obj.getDepartmentId();
            }

            public void put(EmployeeEOImpl obj, Object value) {
                obj.setDepartmentId((Integer)value);
            }
        }
        ,
        Employee {
            public Object get(EmployeeEOImpl obj) {
                return obj.getEmployee();
            }

            public void put(EmployeeEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ManagerIdEmployee {
            public Object get(EmployeeEOImpl obj) {
                return obj.getManagerIdEmployee();
            }

            public void put(EmployeeEOImpl obj, Object value) {
                obj.setManagerIdEmployee((EmployeeEOImpl)value);
            }
        }
        ,
        Department {
            public Object get(EmployeeEOImpl obj) {
                return obj.getDepartment();
            }

            public void put(EmployeeEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Department1 {
            public Object get(EmployeeEOImpl obj) {
                return obj.getDepartment1();
            }

            public void put(EmployeeEOImpl obj, Object value) {
                obj.setDepartment1((DepartmentEOImpl)value);
            }
        }
        ,
        JobHistory {
            public Object get(EmployeeEOImpl obj) {
                return obj.getJobHistory();
            }

            public void put(EmployeeEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        MarketingBaseEmployee {
            public Object get(EmployeeEOImpl obj) {
                return obj.getMarketingBaseEmployee();
            }

            public void put(EmployeeEOImpl obj, Object value) {
                obj.setMarketingBaseEmployee((MarketingBaseEmployeeEOImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(EmployeeEOImpl object);

        public abstract void put(EmployeeEOImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int EMPLOYEEID = AttributesEnum.EmployeeId.index();
    public static final int FIRSTNAME = AttributesEnum.FirstName.index();
    public static final int LASTNAME = AttributesEnum.LastName.index();
    public static final int EMAIL = AttributesEnum.Email.index();
    public static final int PHONENUMBER = AttributesEnum.PhoneNumber.index();
    public static final int HIREDATE = AttributesEnum.HireDate.index();
    public static final int JOBID = AttributesEnum.JobId.index();
    public static final int SALARY = AttributesEnum.Salary.index();
    public static final int COMMISSIONPCT = AttributesEnum.CommissionPct.index();
    public static final int MANAGERID = AttributesEnum.ManagerId.index();
    public static final int DEPARTMENTID = AttributesEnum.DepartmentId.index();
    public static final int EMPLOYEE = AttributesEnum.Employee.index();
    public static final int MANAGERIDEMPLOYEE = AttributesEnum.ManagerIdEmployee.index();
    public static final int DEPARTMENT = AttributesEnum.Department.index();
    public static final int DEPARTMENT1 = AttributesEnum.Department1.index();
    public static final int JOBHISTORY = AttributesEnum.JobHistory.index();
    public static final int MARKETINGBASEEMPLOYEE = AttributesEnum.MarketingBaseEmployee.index();

    /**
     * This is the default constructor (do not remove).
     */
    public EmployeeEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.geminica.adf.chapter_three.model.entity.EmployeeEO");
    }

    /**
     * Gets the attribute value for EmployeeId, using the alias name EmployeeId.
     * @return the value of EmployeeId
     */
    public Integer getEmployeeId() {
        return (Integer)getAttributeInternal(EMPLOYEEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmployeeId.
     * @param value value to set the EmployeeId
     */
    public void setEmployeeId(Integer value) {
        setAttributeInternal(EMPLOYEEID, value);
    }

    /**
     * Gets the attribute value for FirstName, using the alias name FirstName.
     * @return the value of FirstName
     */
    public String getFirstName() {
        return (String)getAttributeInternal(FIRSTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for FirstName.
     * @param value value to set the FirstName
     */
    public void setFirstName(String value) {
        setAttributeInternal(FIRSTNAME, value);
    }

    /**
     * Gets the attribute value for LastName, using the alias name LastName.
     * @return the value of LastName
     */
    public String getLastName() {
        return (String)getAttributeInternal(LASTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastName.
     * @param value value to set the LastName
     */
    public void setLastName(String value) {
        setAttributeInternal(LASTNAME, value);
    }

    /**
     * Gets the attribute value for Email, using the alias name Email.
     * @return the value of Email
     */
    public String getEmail() {
        return (String)getAttributeInternal(EMAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Email.
     * @param value value to set the Email
     */
    public void setEmail(String value) {
        boolean bUpdateAllowed = true;
        
        String emailUpdateCheckEnforced = 
            (String)getDefinitionObject().getAttributeDef(EMAIL).getProperty("UPDATE_CHECK_ENFORCED");
        if ("true".equalsIgnoreCase(emailUpdateCheckEnforced)) {
            bUpdateAllowed = isEmailUpdatable();
        }
        
        if (true == bUpdateAllowed) {
            setAttributeInternal(EMAIL, value);    
        }
    }

    /**
     * Gets the attribute value for PhoneNumber, using the alias name PhoneNumber.
     * @return the value of PhoneNumber
     */
    public String getPhoneNumber() {
        return (String)getAttributeInternal(PHONENUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for PhoneNumber.
     * @param value value to set the PhoneNumber
     */
    public void setPhoneNumber(String value) {
        setAttributeInternal(PHONENUMBER, value);
    }

    /**
     * Gets the attribute value for HireDate, using the alias name HireDate.
     * @return the value of HireDate
     */
    public Timestamp getHireDate() {
        return (Timestamp)getAttributeInternal(HIREDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for HireDate.
     * @param value value to set the HireDate
     */
    public void setHireDate(Timestamp value) {
        setAttributeInternal(HIREDATE, value);
    }

    /**
     * Gets the attribute value for JobId, using the alias name JobId.
     * @return the value of JobId
     */
    public String getJobId() {
        return (String)getAttributeInternal(JOBID);
    }

    /**
     * Sets <code>value</code> as the attribute value for JobId.
     * @param value value to set the JobId
     */
    public void setJobId(String value) {
        setAttributeInternal(JOBID, value);
    }

    /**
     * Gets the attribute value for Salary, using the alias name Salary.
     * @return the value of Salary
     */
    public BigDecimal getSalary() {
        return (BigDecimal)getAttributeInternal(SALARY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Salary.
     * @param value value to set the Salary
     */
    public void setSalary(BigDecimal value) {
        setAttributeInternal(SALARY, value);
    }

    /**
     * Gets the attribute value for CommissionPct, using the alias name CommissionPct.
     * @return the value of CommissionPct
     */
    public BigDecimal getCommissionPct() {
        return (BigDecimal)getAttributeInternal(COMMISSIONPCT);
    }

    /**
     * Sets <code>value</code> as the attribute value for CommissionPct.
     * @param value value to set the CommissionPct
     */
    public void setCommissionPct(BigDecimal value) {
        setAttributeInternal(COMMISSIONPCT, value);
    }

    /**
     * Gets the attribute value for ManagerId, using the alias name ManagerId.
     * @return the value of ManagerId
     */
    public Integer getManagerId() {
        return (Integer)getAttributeInternal(MANAGERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ManagerId.
     * @param value value to set the ManagerId
     */
    public void setManagerId(Integer value) {
        setAttributeInternal(MANAGERID, value);
    }

    /**
     * Gets the attribute value for DepartmentId, using the alias name DepartmentId.
     * @return the value of DepartmentId
     */
    public Integer getDepartmentId() {
        return (Integer)getAttributeInternal(DEPARTMENTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DepartmentId.
     * @param value value to set the DepartmentId
     */
    public void setDepartmentId(Integer value) {
        setAttributeInternal(DEPARTMENTID, value);
    }


    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getEmployee() {
        return (RowIterator)getAttributeInternal(EMPLOYEE);
    }

    /**
     * @return the associated entity EmployeeEOImpl.
     */
    public EmployeeEOImpl getManagerIdEmployee() {
        return (EmployeeEOImpl)getAttributeInternal(MANAGERIDEMPLOYEE);
    }

    /**
     * Sets <code>value</code> as the associated entity EmployeeEOImpl.
     */
    public void setManagerIdEmployee(EmployeeEOImpl value) {
        setAttributeInternal(MANAGERIDEMPLOYEE, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDepartment() {
        return (RowIterator)getAttributeInternal(DEPARTMENT);
    }

    /**
     * @return the associated entity DepartmentEOImpl.
     */
    public DepartmentEOImpl getDepartment1() {
        return (DepartmentEOImpl)getAttributeInternal(DEPARTMENT1);
    }

    /**
     * Sets <code>value</code> as the associated entity DepartmentEOImpl.
     */
    public void setDepartment1(DepartmentEOImpl value) {
        setAttributeInternal(DEPARTMENT1, value);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getJobHistory() {
        return (RowIterator)getAttributeInternal(JOBHISTORY);
    }


    /**
     * @return the associated entity MarketingBaseEmployeeEOImpl.
     */
    public MarketingBaseEmployeeEOImpl getMarketingBaseEmployee() {
        return (MarketingBaseEmployeeEOImpl)getAttributeInternal(MARKETINGBASEEMPLOYEE);
    }

    /**
     * Sets <code>value</code> as the associated entity MarketingBaseEmployeeEOImpl.
     */
    public void setMarketingBaseEmployee(MarketingBaseEmployeeEOImpl value) {
        setAttributeInternal(MARKETINGBASEEMPLOYEE, value);
    }


    /**
     * @param employeeId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer employeeId) {
        return new Key(new Object[]{employeeId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
    }
    
    /**
     * Returns localized string from the resource bundle for key
     * @param p_sKey
     * @return
     */
    public String getLocalizedValue(String p_sKey) {
        ResourceBundleDef resourceDef = getResourceBundleDef();
        Locale locale = getDBTransaction().getSession().getLocale();
        
        String localizedValue = 
            StringManager.getLocalizedStringFromResourceDef(resourceDef
                                             , p_sKey
                                             , null
                                             , locale
                                             , null
                                             , false);
        System.out.println(new StringBuilder("localizedValue: ").append(localizedValue).toString());
        return localizedValue;
    }

    public String getStringFromResBundle(String key) {
        //Get the user locale
        Locale currentLocale = this.getDBTransaction().getSession().getLocale();
        ResourceBundle myResources = ResourceBundle.getBundle("HRModelBundle", currentLocale);
        return myResources.getString(key);
    }
    
    /**
     * finds employee entity instance by given key
     * @param p_nEmployeeId
     * @return
     */
    private EmployeeEOImpl findEmployeeById(int p_nEmployeeId) {
        EntityDefImpl employeeDef = EmployeeEOImpl.getDefinitionObject();
        Key employeeKey = EmployeeEOImpl.createPrimaryKey(p_nEmployeeId);
        
        //include subtypes in chierarchy
        return (EmployeeEOImpl)employeeDef.findByPKExtended(getDBTransaction(), employeeKey, true);
    }
}
