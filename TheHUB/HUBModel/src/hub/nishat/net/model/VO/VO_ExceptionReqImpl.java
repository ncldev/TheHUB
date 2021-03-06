package hub.nishat.net.model.VO;

import oracle.jbo.domain.Date;
import oracle.jbo.server.ViewObjectImpl;

import view.nishat.net.Helper.CommonUtil;
import view.nishat.net.Helper.Constants;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jun 15 16:49:14 PKT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class VO_ExceptionReqImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public VO_ExceptionReqImpl() {
    }


    /**
     * Returns the bind variable value for emp_id.
     * @return bind variable value for emp_id
     */
    public String getemp_id() {
        //return (String)getNamedWhereClauseParam("emp_id");
        return CommonUtil.getSessionValue(Constants.SESSION_USERID).toString();
    }

    /**
     * Sets <code>value</code> for bind variable emp_id.
     * @param value value to bind as emp_id
     */
    public void setemp_id(String value) {
        setNamedWhereClauseParam("emp_id", value);
    }

    /**
     * Returns the variable value for bnd_empname.
     * @return variable value for bnd_empname
     */
    public String getbnd_empname() {
        return (String)ensureVariableManager().getVariableValue("bnd_empname");
    }

    /**
     * Sets <code>value</code> for variable bnd_empname.
     * @param value value to bind as bnd_empname
     */
    public void setbnd_empname(String value) {
        ensureVariableManager().setVariableValue("bnd_empname", value);
    }

    /**
     * Returns the variable value for bnd_attDate.
     * @return variable value for bnd_attDate
     */
    public Date getbnd_attDate() {
        return (Date)ensureVariableManager().getVariableValue("bnd_attDate");
    }

    /**
     * Sets <code>value</code> for variable bnd_attDate.
     * @param value value to bind as bnd_attDate
     */
    public void setbnd_attDate(Date value) {
        ensureVariableManager().setVariableValue("bnd_attDate", value);
    }
}
