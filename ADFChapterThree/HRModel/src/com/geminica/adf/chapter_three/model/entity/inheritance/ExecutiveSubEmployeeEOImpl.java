package com.geminica.adf.chapter_three.model.entity.inheritance;

import java.math.BigDecimal;

import oracle.jbo.Key;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Mar 04 23:10:35 CET 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ExecutiveSubEmployeeEOImpl extends MarketingBaseEmployeeEOImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Salary {
            public Object get(ExecutiveSubEmployeeEOImpl obj) {
                return obj.getSalary();
            }

            public void put(ExecutiveSubEmployeeEOImpl obj, Object value) {
                obj.setSalary((BigDecimal)value);
            }
        }
        ,
        CommissionPct {
            public Object get(ExecutiveSubEmployeeEOImpl obj) {
                return obj.getCommissionPct();
            }

            public void put(ExecutiveSubEmployeeEOImpl obj, Object value) {
                obj.setCommissionPct((BigDecimal)value);
            }
        }
        ,
        MarketingBaseEmployee {
            public Object get(ExecutiveSubEmployeeEOImpl obj) {
                return obj.getMarketingBaseEmployee();
            }

            public void put(ExecutiveSubEmployeeEOImpl obj, Object value) {
                obj.setMarketingBaseEmployee((MarketingBaseEmployeeEOImpl)value);
            }
        }
        ,
        SalesSubEmployee {
            public Object get(ExecutiveSubEmployeeEOImpl obj) {
                return obj.getSalesSubEmployee();
            }

            public void put(ExecutiveSubEmployeeEOImpl obj, Object value) {
                obj.setSalesSubEmployee((SalesSubEmployeeEOImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = EntityDefImpl.findDefObjectNoSub("com.geminica.adf.chapter_three.model.entity.inheritance.MarketingBaseEmployeeEO").getAttributeCount();

        public abstract Object get(ExecutiveSubEmployeeEOImpl object);

        public abstract void put(ExecutiveSubEmployeeEOImpl object, Object value);

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
    public static final int SALARY = AttributesEnum.Salary.index();
    public static final int COMMISSIONPCT = AttributesEnum.CommissionPct.index();
    public static final int MARKETINGBASEEMPLOYEE = AttributesEnum.MarketingBaseEmployee.index();
    public static final int SALESSUBEMPLOYEE = AttributesEnum.SalesSubEmployee.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ExecutiveSubEmployeeEOImpl() {
    }

    /**
     * Gets the attribute value for DepartmentId, using the alias name DepartmentId.
     * @return the value of DepartmentId
     */
    public Integer getDepartmentId() {
        return super.getDepartmentId();
    }

    /**
     * Sets <code>value</code> as the attribute value for DepartmentId.
     * @param value value to set the DepartmentId
     */
    public void setDepartmentId(Integer value) {
        super.setDepartmentId(value);
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
     * @return the associated entity SalesSubEmployeeEOImpl.
     */
    public SalesSubEmployeeEOImpl getSalesSubEmployee() {
        return (SalesSubEmployeeEOImpl)getAttributeInternal(SALESSUBEMPLOYEE);
    }

    /**
     * Sets <code>value</code> as the associated entity SalesSubEmployeeEOImpl.
     */
    public void setSalesSubEmployee(SalesSubEmployeeEOImpl value) {
        setAttributeInternal(SALESSUBEMPLOYEE, value);
    }

    /**
     * @param employeeId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer employeeId) {
        return new Key(new Object[]{employeeId});
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.geminica.adf.chapter_three.model.entity.inheritance.ExecutiveSubEmployeeEO");
    }
}
