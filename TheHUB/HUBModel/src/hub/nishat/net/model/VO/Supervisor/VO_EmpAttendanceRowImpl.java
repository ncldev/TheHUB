package hub.nishat.net.model.VO.Supervisor;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;

import view.nishat.net.Helper.CommonUtil;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Aug 10 14:28:32 PKT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class VO_EmpAttendanceRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        EmpAtdId {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getEmpAtdId();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setEmpAtdId((Number)value);
            }
        }
        ,
        Description {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getDescription();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setDescription((String)value);
            }
        }
        ,
        EmpId {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getEmpId();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setEmpId((Number)value);
            }
        }
        ,
        EmpName {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getEmpName();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setEmpName((String)value);
            }
        }
        ,
        CardNum {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getCardNum();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setCardNum((String)value);
            }
        }
        ,
        LeaveCancelled {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getLeaveCancelled();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setLeaveCancelled((String)value);
            }
        }
        ,
        ExpectedWorkHours {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getExpectedWorkHours();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setExpectedWorkHours((String)value);
            }
        }
        ,
        MinInTime {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getMinInTime();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setMinInTime((Date)value);
            }
        }
        ,
        MaxOutTime {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getMaxOutTime();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setMaxOutTime((Date)value);
            }
        }
        ,
        PreviousDayOutTime {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getPreviousDayOutTime();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setPreviousDayOutTime((String)value);
            }
        }
        ,
        PreviousDayEffectiveHours {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getPreviousDayEffectiveHours();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setPreviousDayEffectiveHours((String)value);
            }
        }
        ,
        Outtime {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getOuttime();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setOuttime((String)value);
            }
        }
        ,
        Intime {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getIntime();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setIntime((String)value);
            }
        }
        ,
        EffectiveWorkedHours {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getEffectiveWorkedHours();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setEffectiveWorkedHours((String)value);
            }
        }
        ,
        MaxStartTime {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getMaxStartTime();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setMaxStartTime((String)value);
            }
        }
        ,
        MaxEndTime {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getMaxEndTime();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setMaxEndTime((String)value);
            }
        }
        ,
        EndTime {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getEndTime();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setEndTime((String)value);
            }
        }
        ,
        StartTime {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getStartTime();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setStartTime((String)value);
            }
        }
        ,
        AttendanceDate {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getAttendanceDate();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setAttendanceDate((Date)value);
            }
        }
        ,
        LeaveTypeId {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getLeaveTypeId();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setLeaveTypeId((Number)value);
            }
        }
        ,
        LeaveApprovedFlag {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getLeaveApprovedFlag();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setLeaveApprovedFlag((String)value);
            }
        }
        ,
        TypeOfLeave {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getTypeOfLeave();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setTypeOfLeave((Number)value);
            }
        }
        ,
        PolicyException {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getPolicyException();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setPolicyException((String)value);
            }
        }
        ,
        LeaveToday {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getLeaveToday();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setLeaveToday((String)value);
            }
        }
        ,
        IsHalf {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getIsHalf();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setIsHalf((String)value);
            }
        }
        ,
        WorkingTime {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getWorkingTime();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setWorkingTime((String)value);
            }
        }
        ,
        LeaveType {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getLeaveType();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setLeaveType((String)value);
            }
        }
        ,
        PolicyExceptionApprovedFlag {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getPolicyExceptionApprovedFlag();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setPolicyExceptionApprovedFlag((String)value);
            }
        }
        ,
        LateSittingMinTiming {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getLateSittingMinTiming();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setLateSittingMinTiming((String)value);
            }
        }
        ,
        Day {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getDay();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setDay((String)value);
            }
        }
        ,
        Today {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getToday();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setToday((String)value);
            }
        }
        ,
        Month {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getMonth();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setMonth((String)value);
            }
        }
        ,
        Year {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getYear();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setYear((String)value);
            }
        }
        ,
        OffDayWorking {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getOffDayWorking();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setOffDayWorking((String)value);
            }
        }
        ,
        EmpType {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getEmpType();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setEmpType((Number)value);
            }
        }
        ,
        LateSitting {
            public Object get(VO_EmpAttendanceRowImpl obj) {
                return obj.getLateSitting();
            }

            public void put(VO_EmpAttendanceRowImpl obj, Object value) {
                obj.setLateSitting((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(VO_EmpAttendanceRowImpl object);

        public abstract void put(VO_EmpAttendanceRowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int EMPATDID = AttributesEnum.EmpAtdId.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int EMPID = AttributesEnum.EmpId.index();
    public static final int EMPNAME = AttributesEnum.EmpName.index();
    public static final int CARDNUM = AttributesEnum.CardNum.index();
    public static final int LEAVECANCELLED = AttributesEnum.LeaveCancelled.index();
    public static final int EXPECTEDWORKHOURS = AttributesEnum.ExpectedWorkHours.index();
    public static final int MININTIME = AttributesEnum.MinInTime.index();
    public static final int MAXOUTTIME = AttributesEnum.MaxOutTime.index();
    public static final int PREVIOUSDAYOUTTIME = AttributesEnum.PreviousDayOutTime.index();
    public static final int PREVIOUSDAYEFFECTIVEHOURS = AttributesEnum.PreviousDayEffectiveHours.index();
    public static final int OUTTIME = AttributesEnum.Outtime.index();
    public static final int INTIME = AttributesEnum.Intime.index();
    public static final int EFFECTIVEWORKEDHOURS = AttributesEnum.EffectiveWorkedHours.index();
    public static final int MAXSTARTTIME = AttributesEnum.MaxStartTime.index();
    public static final int MAXENDTIME = AttributesEnum.MaxEndTime.index();
    public static final int ENDTIME = AttributesEnum.EndTime.index();
    public static final int STARTTIME = AttributesEnum.StartTime.index();
    public static final int ATTENDANCEDATE = AttributesEnum.AttendanceDate.index();
    public static final int LEAVETYPEID = AttributesEnum.LeaveTypeId.index();
    public static final int LEAVEAPPROVEDFLAG = AttributesEnum.LeaveApprovedFlag.index();
    public static final int TYPEOFLEAVE = AttributesEnum.TypeOfLeave.index();
    public static final int POLICYEXCEPTION = AttributesEnum.PolicyException.index();
    public static final int LEAVETODAY = AttributesEnum.LeaveToday.index();
    public static final int ISHALF = AttributesEnum.IsHalf.index();
    public static final int WORKINGTIME = AttributesEnum.WorkingTime.index();
    public static final int LEAVETYPE = AttributesEnum.LeaveType.index();
    public static final int POLICYEXCEPTIONAPPROVEDFLAG = AttributesEnum.PolicyExceptionApprovedFlag.index();
    public static final int LATESITTINGMINTIMING = AttributesEnum.LateSittingMinTiming.index();
    public static final int DAY = AttributesEnum.Day.index();
    public static final int TODAY = AttributesEnum.Today.index();
    public static final int MONTH = AttributesEnum.Month.index();
    public static final int YEAR = AttributesEnum.Year.index();
    public static final int OFFDAYWORKING = AttributesEnum.OffDayWorking.index();
    public static final int EMPTYPE = AttributesEnum.EmpType.index();
    public static final int LATESITTING = AttributesEnum.LateSitting.index();

    /**
     * This is the default constructor (do not remove).
     */
    public VO_EmpAttendanceRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute EmpAtdId.
     * @return the EmpAtdId
     */
    public Number getEmpAtdId() {
        return (Number) getAttributeInternal(EMPATDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EmpAtdId.
     * @param value value to set the  EmpAtdId
     */
    public void setEmpAtdId(Number value) {
        setAttributeInternal(EMPATDID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Description.
     * @return the Description
     */
    public String getDescription() {
        return (String) getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Description.
     * @param value value to set the  Description
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EmpId.
     * @return the EmpId
     */
    public Number getEmpId() {
        return (Number) getAttributeInternal(EMPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EmpId.
     * @param value value to set the  EmpId
     */
    public void setEmpId(Number value) {
        setAttributeInternal(EMPID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EmpName.
     * @return the EmpName
     */
    public String getEmpName() {
        return (String) getAttributeInternal(EMPNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EmpName.
     * @param value value to set the  EmpName
     */
    public void setEmpName(String value) {
        setAttributeInternal(EMPNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CardNum.
     * @return the CardNum
     */
    public String getCardNum() {
        return (String) getAttributeInternal(CARDNUM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CardNum.
     * @param value value to set the  CardNum
     */
    public void setCardNum(String value) {
        setAttributeInternal(CARDNUM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute LeaveCancelled.
     * @return the LeaveCancelled
     */
    public String getLeaveCancelled() {
        return (String) getAttributeInternal(LEAVECANCELLED);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute LeaveCancelled.
     * @param value value to set the  LeaveCancelled
     */
    public void setLeaveCancelled(String value) {
        setAttributeInternal(LEAVECANCELLED, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ExpectedWorkHours.
     * @return the ExpectedWorkHours
     */
    public String getExpectedWorkHours() {
        return (String) getAttributeInternal(EXPECTEDWORKHOURS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ExpectedWorkHours.
     * @param value value to set the  ExpectedWorkHours
     */
    public void setExpectedWorkHours(String value) {
        setAttributeInternal(EXPECTEDWORKHOURS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute MinInTime.
     * @return the MinInTime
     */
    public Date getMinInTime() {
        return (Date) getAttributeInternal(MININTIME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute MinInTime.
     * @param value value to set the  MinInTime
     */
    public void setMinInTime(Date value) {
        setAttributeInternal(MININTIME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute MaxOutTime.
     * @return the MaxOutTime
     */
    public Date getMaxOutTime() {
        return (Date) getAttributeInternal(MAXOUTTIME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute MaxOutTime.
     * @param value value to set the  MaxOutTime
     */
    public void setMaxOutTime(Date value) {
        setAttributeInternal(MAXOUTTIME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PreviousDayOutTime.
     * @return the PreviousDayOutTime
     */
    public String getPreviousDayOutTime() {
        return (String) getAttributeInternal(PREVIOUSDAYOUTTIME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PreviousDayOutTime.
     * @param value value to set the  PreviousDayOutTime
     */
    public void setPreviousDayOutTime(String value) {
        setAttributeInternal(PREVIOUSDAYOUTTIME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PreviousDayEffectiveHours.
     * @return the PreviousDayEffectiveHours
     */
    public String getPreviousDayEffectiveHours() {
        return (String) getAttributeInternal(PREVIOUSDAYEFFECTIVEHOURS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PreviousDayEffectiveHours.
     * @param value value to set the  PreviousDayEffectiveHours
     */
    public void setPreviousDayEffectiveHours(String value) {
        setAttributeInternal(PREVIOUSDAYEFFECTIVEHOURS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Outtime.
     * @return the Outtime
     */
    public String getOuttime() {
        return (String) getAttributeInternal(OUTTIME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Outtime.
     * @param value value to set the  Outtime
     */
    public void setOuttime(String value) {
        setAttributeInternal(OUTTIME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Intime.
     * @return the Intime
     */
    public String getIntime() {
        return (String) getAttributeInternal(INTIME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Intime.
     * @param value value to set the  Intime
     */
    public void setIntime(String value) {
        setAttributeInternal(INTIME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EffectiveWorkedHours.
     * @return the EffectiveWorkedHours
     */
    public String getEffectiveWorkedHours() {
        return (String) getAttributeInternal(EFFECTIVEWORKEDHOURS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EffectiveWorkedHours.
     * @param value value to set the  EffectiveWorkedHours
     */
    public void setEffectiveWorkedHours(String value) {
        setAttributeInternal(EFFECTIVEWORKEDHOURS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute MaxStartTime.
     * @return the MaxStartTime
     */
    public String getMaxStartTime() {
        return (String) getAttributeInternal(MAXSTARTTIME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute MaxStartTime.
     * @param value value to set the  MaxStartTime
     */
    public void setMaxStartTime(String value) {
        setAttributeInternal(MAXSTARTTIME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute MaxEndTime.
     * @return the MaxEndTime
     */
    public String getMaxEndTime() {
        return (String) getAttributeInternal(MAXENDTIME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute MaxEndTime.
     * @param value value to set the  MaxEndTime
     */
    public void setMaxEndTime(String value) {
        setAttributeInternal(MAXENDTIME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EndTime.
     * @return the EndTime
     */
    public String getEndTime() {
        return (String) getAttributeInternal(ENDTIME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EndTime.
     * @param value value to set the  EndTime
     */
    public void setEndTime(String value) {
        setAttributeInternal(ENDTIME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute StartTime.
     * @return the StartTime
     */
    public String getStartTime() {
        return (String) getAttributeInternal(STARTTIME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute StartTime.
     * @param value value to set the  StartTime
     */
    public void setStartTime(String value) {
        setAttributeInternal(STARTTIME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AttendanceDate.
     * @return the AttendanceDate
     */
    public Date getAttendanceDate() {
        return (Date) getAttributeInternal(ATTENDANCEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AttendanceDate.
     * @param value value to set the  AttendanceDate
     */
    public void setAttendanceDate(Date value) {
        setAttributeInternal(ATTENDANCEDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute LeaveTypeId.
     * @return the LeaveTypeId
     */
    public Number getLeaveTypeId() {
        return (Number) getAttributeInternal(LEAVETYPEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute LeaveTypeId.
     * @param value value to set the  LeaveTypeId
     */
    public void setLeaveTypeId(Number value) {
        setAttributeInternal(LEAVETYPEID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute LeaveApprovedFlag.
     * @return the LeaveApprovedFlag
     */
    public String getLeaveApprovedFlag() {
        return (String) getAttributeInternal(LEAVEAPPROVEDFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute LeaveApprovedFlag.
     * @param value value to set the  LeaveApprovedFlag
     */
    public void setLeaveApprovedFlag(String value) {
        setAttributeInternal(LEAVEAPPROVEDFLAG, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TypeOfLeave.
     * @return the TypeOfLeave
     */
    public Number getTypeOfLeave() {
        return (Number) getAttributeInternal(TYPEOFLEAVE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TypeOfLeave.
     * @param value value to set the  TypeOfLeave
     */
    public void setTypeOfLeave(Number value) {
        setAttributeInternal(TYPEOFLEAVE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PolicyException.
     * @return the PolicyException
     */
    public String getPolicyException() {
        return (String) getAttributeInternal(POLICYEXCEPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PolicyException.
     * @param value value to set the  PolicyException
     */
    public void setPolicyException(String value) {
        setAttributeInternal(POLICYEXCEPTION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute LeaveToday.
     * @return the LeaveToday
     */
    public String getLeaveToday() {
        return (String) getAttributeInternal(LEAVETODAY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute LeaveToday.
     * @param value value to set the  LeaveToday
     */
    public void setLeaveToday(String value) {
        setAttributeInternal(LEAVETODAY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute IsHalf.
     * @return the IsHalf
     */
    public String getIsHalf() {
        return (String) getAttributeInternal(ISHALF);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute IsHalf.
     * @param value value to set the  IsHalf
     */
    public void setIsHalf(String value) {
        setAttributeInternal(ISHALF, value);
    }

    /**
     * Gets the attribute value for the calculated attribute WorkingTime.
     * @return the WorkingTime
     */
    public String getWorkingTime() {
        return (String) getAttributeInternal(WORKINGTIME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute WorkingTime.
     * @param value value to set the  WorkingTime
     */
    public void setWorkingTime(String value) {
        setAttributeInternal(WORKINGTIME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute LeaveType.
     * @return the LeaveType
     */
    public String getLeaveType() {
        return (String) getAttributeInternal(LEAVETYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute LeaveType.
     * @param value value to set the  LeaveType
     */
    public void setLeaveType(String value) {
        setAttributeInternal(LEAVETYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PolicyExceptionApprovedFlag.
     * @return the PolicyExceptionApprovedFlag
     */
    public String getPolicyExceptionApprovedFlag() {
        return (String) getAttributeInternal(POLICYEXCEPTIONAPPROVEDFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PolicyExceptionApprovedFlag.
     * @param value value to set the  PolicyExceptionApprovedFlag
     */
    public void setPolicyExceptionApprovedFlag(String value) {
        setAttributeInternal(POLICYEXCEPTIONAPPROVEDFLAG, value);
    }

    /**
     * Gets the attribute value for the calculated attribute LateSittingMinTiming.
     * @return the LateSittingMinTiming
     */
    public String getLateSittingMinTiming() {
        return (String) getAttributeInternal(LATESITTINGMINTIMING);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute LateSittingMinTiming.
     * @param value value to set the  LateSittingMinTiming
     */
    public void setLateSittingMinTiming(String value) {
        setAttributeInternal(LATESITTINGMINTIMING, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Day.
     * @return the Day
     */
    public String getDay() {
        return (String) getAttributeInternal(DAY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Day.
     * @param value value to set the  Day
     */
    public void setDay(String value) {
        setAttributeInternal(DAY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Today.
     * @return the Today
     */
    public String getToday() {
        return (String) getAttributeInternal(TODAY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Today.
     * @param value value to set the  Today
     */
    public void setToday(String value) {
        setAttributeInternal(TODAY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Month.
     * @return the Month
     */
    public String getMonth() {
        return (String) getAttributeInternal(MONTH);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Month.
     * @param value value to set the  Month
     */
    public void setMonth(String value) {
        setAttributeInternal(MONTH, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Year.
     * @return the Year
     */
    public String getYear() {
        return (String) getAttributeInternal(YEAR);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Year.
     * @param value value to set the  Year
     */
    public void setYear(String value) {
        setAttributeInternal(YEAR, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OffDayWorking.
     * @return the OffDayWorking
     */
    public String getOffDayWorking() {
        return (String) getAttributeInternal(OFFDAYWORKING);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OffDayWorking.
     * @param value value to set the  OffDayWorking
     */
    public void setOffDayWorking(String value) {
        setAttributeInternal(OFFDAYWORKING, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EmpType.
     * @return the EmpType
     */
    public Number getEmpType() {
        return (Number) getAttributeInternal(EMPTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EmpType.
     * @param value value to set the  EmpType
     */
    public void setEmpType(Number value) {
        setAttributeInternal(EMPTYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute LateSitting.
     * @return the LateSitting
     */
    public String getLateSitting() {
        String lateSitting = "0:00";
        if (getOuttime()!=null) {
            lateSitting = CommonUtil.subtractTime("7:30 PM", getOuttime());
            int isLateSitting = (Integer.parseInt(lateSitting.split("#")[0])*60)+Integer.parseInt(lateSitting.split("#")[1]);
            if (isLateSitting<0) {
                lateSitting = "0:00";
            }else{
                int hours = Integer.parseInt(lateSitting.split("#")[0]);
                int minutes = Integer.parseInt(lateSitting.split("#")[1]);
                lateSitting = (hours<9?"0"+hours:hours)+":"+(minutes<9?"0"+minutes:minutes);
            }
        }
        return lateSitting;
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute LateSitting.
     * @param value value to set the  LateSitting
     */
    public void setLateSitting(String value) {
        setAttributeInternal(LATESITTING, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
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
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
