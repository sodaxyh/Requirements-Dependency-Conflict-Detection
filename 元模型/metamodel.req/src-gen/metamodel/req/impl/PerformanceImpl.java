/**
 */
package metamodel.req.impl;

import java.math.BigInteger;

import metamodel.req.Performance;
import metamodel.req.ReqPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodel.req.impl.PerformanceImpl#getRtype <em>Rtype</em>}</li>
 *   <li>{@link metamodel.req.impl.PerformanceImpl#getSign <em>Sign</em>}</li>
 *   <li>{@link metamodel.req.impl.PerformanceImpl#getValue <em>Value</em>}</li>
 *   <li>{@link metamodel.req.impl.PerformanceImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerformanceImpl extends Nonfunctional_reqImpl implements Performance {
	/**
	 * The default value of the '{@link #getRtype() <em>Rtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtype()
	 * @generated
	 * @ordered
	 */
	protected static final String RTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRtype() <em>Rtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtype()
	 * @generated
	 * @ordered
	 */
	protected String rtype = RTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSign() <em>Sign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSign()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSign() <em>Sign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSign()
	 * @generated
	 * @ordered
	 */
	protected String sign = SIGN_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected BigInteger value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqPackage.Literals.PERFORMANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRtype() {
		return rtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtype(String newRtype) {
		String oldRtype = rtype;
		rtype = newRtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.PERFORMANCE__RTYPE, oldRtype, rtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSign() {
		return sign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSign(String newSign) {
		String oldSign = sign;
		sign = newSign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.PERFORMANCE__SIGN, oldSign, sign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(BigInteger newValue) {
		BigInteger oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.PERFORMANCE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.PERFORMANCE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ReqPackage.PERFORMANCE__RTYPE:
			return getRtype();
		case ReqPackage.PERFORMANCE__SIGN:
			return getSign();
		case ReqPackage.PERFORMANCE__VALUE:
			return getValue();
		case ReqPackage.PERFORMANCE__UNIT:
			return getUnit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ReqPackage.PERFORMANCE__RTYPE:
			setRtype((String) newValue);
			return;
		case ReqPackage.PERFORMANCE__SIGN:
			setSign((String) newValue);
			return;
		case ReqPackage.PERFORMANCE__VALUE:
			setValue((BigInteger) newValue);
			return;
		case ReqPackage.PERFORMANCE__UNIT:
			setUnit((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ReqPackage.PERFORMANCE__RTYPE:
			setRtype(RTYPE_EDEFAULT);
			return;
		case ReqPackage.PERFORMANCE__SIGN:
			setSign(SIGN_EDEFAULT);
			return;
		case ReqPackage.PERFORMANCE__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case ReqPackage.PERFORMANCE__UNIT:
			setUnit(UNIT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ReqPackage.PERFORMANCE__RTYPE:
			return RTYPE_EDEFAULT == null ? rtype != null : !RTYPE_EDEFAULT.equals(rtype);
		case ReqPackage.PERFORMANCE__SIGN:
			return SIGN_EDEFAULT == null ? sign != null : !SIGN_EDEFAULT.equals(sign);
		case ReqPackage.PERFORMANCE__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case ReqPackage.PERFORMANCE__UNIT:
			return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Rtype: ");
		result.append(rtype);
		result.append(", Sign: ");
		result.append(sign);
		result.append(", Value: ");
		result.append(value);
		result.append(", Unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //PerformanceImpl
