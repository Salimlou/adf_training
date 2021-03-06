package com.geminica.adf.chapter_three.model.entity;

import com.geminica.adf.chapter_three.model.entity.inheritance.MarketingBaseEmployeeEOImpl;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;

// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Mar 03 22:32:37 CET 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DepartmentEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        DepartmentId {
            public Object get(DepartmentEOImpl obj) {
                return obj.getDepartmentId();
            }

            public void put(DepartmentEOImpl obj, Object value) {
                obj.setDepartmentId((Integer)value);
            }
        }
        ,
        DepartmentName {
            public Object get(DepartmentEOImpl obj) {
                return obj.getDepartmentName();
            }

            public void put(DepartmentEOImpl obj, Object value) {
                obj.setDepartmentName((String)value);
            }
        }
        ,
        ManagerId {
            public Object get(DepartmentEOImpl obj) {
                return obj.getManagerId();
            }

            public void put(DepartmentEOImpl obj, Object value) {
                obj.setManagerId((Integer)value);
            }
        }
        ,
        LocationId {
            public Object get(DepartmentEOImpl obj) {
                return obj.getLocationId();
            }

            public void put(DepartmentEOImpl obj, Object value) {
                obj.setLocationId((Integer)value);
            }
        }
        ,
        Abbreviation {
            public Object get(DepartmentEOImpl obj) {
                return obj.getAbbreviation();
            }

            public void put(DepartmentEOImpl obj, Object value) {
                obj.setAbbreviation((String)value);
            }
        }
        ,
        Employee {
            public Object get(DepartmentEOImpl obj) {
                return obj.getEmployee();
            }

            public void put(DepartmentEOImpl obj, Object value) {
                obj.setEmployee((EmployeeEOImpl)value);
            }
        }
        ,
        Employee1 {
            public Object get(DepartmentEOImpl obj) {
                return obj.getEmployee1();
            }

            public void put(DepartmentEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        JobHistory {
            public Object get(DepartmentEOImpl obj) {
                return obj.getJobHistory();
            }

            public void put(DepartmentEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        TestAssoc {
            public Object get(DepartmentEOImpl obj) {
                return obj.getTestAssoc();
            }

            public void put(DepartmentEOImpl obj, Object value) {
                obj.setTestAssoc((TestAssocEOImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(DepartmentEOImpl object);

        public abstract void put(DepartmentEOImpl object, Object value);

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


    public static final int MARKETINGBASEEMPLOYEE = AttributesEnum.MarketingBaseEmployee.index();


    public static final int DEPARTMENTID = AttributesEnum.DepartmentId.index();
    public static final int DEPARTMENTNAME = AttributesEnum.DepartmentName.index();
    public static final int MANAGERID = AttributesEnum.ManagerId.index();
    public static final int LOCATIONID = AttributesEnum.LocationId.index();
    public static final int ABBREVIATION = AttributesEnum.Abbreviation.index();
    public static final int EMPLOYEE = AttributesEnum.Employee.index();
    public static final int EMPLOYEE1 = AttributesEnum.Employee1.index();
    public static final int JOBHISTORY = AttributesEnum.JobHistory.index();
    public static final int TESTASSOC = AttributesEnum.TestAssoc.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DepartmentEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.geminica.adf.chapter_three.model.entity.DepartmentEO");
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
     * Gets the attribute value for DepartmentName, using the alias name DepartmentName.
     * @return the value of DepartmentName
     */
    public String getDepartmentName() {
        return (String)getAttributeInternal(DEPARTMENTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for DepartmentName.
     * @param value value to set the DepartmentName
     */
    public void setDepartmentName(String value) {
        setAttributeInternal(DEPARTMENTNAME, value);
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
     * Gets the attribute value for LocationId, using the alias name LocationId.
     * @return the value of LocationId
     */
    public Integer getLocationId() {
        return (Integer)getAttributeInternal(LOCATIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LocationId.
     * @param value value to set the LocationId
     */
    public void setLocationId(Integer value) {
        setAttributeInternal(LOCATIONID, value);
    }

    /**
     * Gets the attribute value for Abbreviation, using the alias name Abbreviation.
     * @return the value of Abbreviation
     */
    public String getAbbreviation() {
        return (String)getAttributeInternal(ABBREVIATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Abbreviation.
     * @param value value to set the Abbreviation
     */
    public void setAbbreviation(String value) {
        setAttributeInternal(ABBREVIATION, value);
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
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EmployeeEOImpl getEmployee() {
        return (EmployeeEOImpl)getAttributeInternal(EMPLOYEE);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setEmployee(EmployeeEOImpl value) {
        setAttributeInternal(EMPLOYEE, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getEmployee1() {
        return (RowIterator)getAttributeInternal(EMPLOYEE1);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getJobHistory() {
        return (RowIterator)getAttributeInternal(JOBHISTORY);
    }


    /**
     * @return the associated entity TestAssocEOImpl.
     */
    public TestAssocEOImpl getTestAssoc() {
        return (TestAssocEOImpl)getAttributeInternal(TESTASSOC);
    }

    /**
     * Sets <code>value</code> as the associated entity TestAssocEOImpl.
     */
    public void setTestAssoc(TestAssocEOImpl value) {
        setAttributeInternal(TESTASSOC, value);
    }

    /**
     * @param departmentId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer departmentId) {
        return new Key(new Object[]{departmentId});
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
}
